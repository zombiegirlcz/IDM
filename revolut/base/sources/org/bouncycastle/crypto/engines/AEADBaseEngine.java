package org.bouncycastle.crypto.engines;

import a0.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
abstract class AEADBaseEngine implements AEADCipher {
    protected int AADBufferSize;
    protected int BlockSize;
    protected int IV_SIZE;
    protected int KEY_SIZE;
    protected int MAC_SIZE;
    protected AADOperator aadOperator;
    protected String algorithmName;
    protected DataOperator dataOperator;
    protected boolean forEncryption;
    protected byte[] initialAssociatedText;
    protected byte[] m_aad;
    protected int m_aadPos;
    protected byte[] m_buf;
    protected int m_bufPos;
    protected int m_bufferSizeDecrypt;
    protected byte[] mac;
    protected AADProcessingBuffer processor;
    protected int macSizeLowerBound = 0;
    protected State m_state = State.Uninitialized;
    protected DecryptionFailureCounter decryptionFailureCounter = null;
    protected DataLimitCounter dataLimitCounter = null;

    public interface AADOperator {
        int getLen();

        void processAADByte(byte b4);

        void processAADBytes(byte[] bArr, int i, int i2);

        void reset();
    }

    public static class AADOperatorType {
        public static final int COUNTER = 1;
        public static final int DATA_LIMIT = 3;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        private final int ord;
        public static final AADOperatorType Default = new AADOperatorType(0);
        public static final AADOperatorType Counter = new AADOperatorType(1);
        public static final AADOperatorType Stream = new AADOperatorType(2);
        public static final AADOperatorType DataLimit = new AADOperatorType(3);

        public AADOperatorType(int i) {
            this.ord = i;
        }
    }

    public interface AADProcessingBuffer {
        int getUpdateOutputSize(int i);

        boolean isLengthExceedingBlockSize(int i, int i2);

        boolean isLengthWithinAvailableSpace(int i, int i2);

        void processAADByte(byte b4);

        int processByte(byte b4, byte[] bArr, int i);
    }

    public class BufferedAADProcessor implements AADProcessingBuffer {
        private BufferedAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i) {
            return Math.max(0, i) - 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i, int i2) {
            return i > i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i, int i2) {
            return i <= i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b4) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            if (aEADBaseEngine.m_aadPos == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(aEADBaseEngine.m_aad, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine2.m_aad;
            int i = aEADBaseEngine2.m_aadPos;
            aEADBaseEngine2.m_aadPos = i + 1;
            bArr[i] = b4;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b4, byte[] bArr, int i) {
            AEADBaseEngine.this.checkData(false);
            int iProcessEncDecByte = AEADBaseEngine.this.processEncDecByte(bArr, i);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i2 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i2 + 1;
            bArr2[i2] = b4;
            return iProcessEncDecByte;
        }
    }

    public class CounterAADOperator implements AADOperator {
        private int aadLen;

        private CounterAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.aadLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b4) {
            this.aadLen++;
            AEADBaseEngine.this.processor.processAADByte(b4);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) {
            this.aadLen += i2;
            AEADBaseEngine.this.processAadBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.aadLen = 0;
        }
    }

    public class CounterDataOperator implements DataOperator {
        private int messegeLen;

        private CounterDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.messegeLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b4, byte[] bArr, int i) {
            this.messegeLen++;
            return AEADBaseEngine.this.processor.processByte(b4, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            this.messegeLen += i2;
            return AEADBaseEngine.this.processEncDecBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.messegeLen = 0;
        }
    }

    public class DataLimitAADOperator implements AADOperator {
        private DataLimitAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b4) {
            AEADBaseEngine.this.dataLimitCounter.increment();
            AEADBaseEngine.this.processor.processAADByte(b4);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) {
            AEADBaseEngine.this.dataLimitCounter.increment(i2);
            AEADBaseEngine.this.processAadBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    public class DataLimitDataOperator implements DataOperator {
        private DataLimitDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b4, byte[] bArr, int i) {
            AEADBaseEngine.this.dataLimitCounter.increment();
            return AEADBaseEngine.this.processor.processByte(b4, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            AEADBaseEngine.this.dataLimitCounter.increment(i2);
            return AEADBaseEngine.this.processEncDecBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public interface DataOperator {
        int getLen();

        int processByte(byte b4, byte[] bArr, int i);

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        void reset();
    }

    public static class DataOperatorType {
        public static final int COUNTER = 1;
        public static final int DATA_LIMIT = 4;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        public static final int STREAM_CIPHER = 3;
        private final int ord;
        public static final DataOperatorType Default = new DataOperatorType(0);
        public static final DataOperatorType Counter = new DataOperatorType(1);
        public static final DataOperatorType Stream = new DataOperatorType(2);
        public static final DataOperatorType StreamCipher = new DataOperatorType(3);
        public static final DataOperatorType DataLimit = new DataOperatorType(4);

        public DataOperatorType(int i) {
            this.ord = i;
        }
    }

    public static class DecryptionFailureCounter {
        private int[] counter;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f228331n;

        public boolean increment() {
            int i;
            int length = this.counter.length;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                int[] iArr = this.counter;
                i = iArr[length] + 1;
                iArr[length] = i;
            } while (i == 0);
            int i2 = this.f228331n & 31;
            if (length <= 0) {
                if (this.counter[0] == (i2 == 0 ? 0 : 1 << i2)) {
                    return true;
                }
            }
            return false;
        }

        public void init(int i) {
            if (this.f228331n != i) {
                this.f228331n = i;
                int i2 = (i + 31) >>> 5;
                int[] iArr = this.counter;
                if (iArr == null || i2 != iArr.length) {
                    this.counter = new int[i2];
                } else {
                    reset();
                }
            }
        }

        public void reset() {
            Arrays.fill(this.counter, 0);
        }
    }

    public class DefaultAADOperator implements AADOperator {
        private DefaultAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b4) {
            AEADBaseEngine.this.processor.processAADByte(b4);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) {
            AEADBaseEngine.this.processAadBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    public class DefaultDataOperator implements DataOperator {
        private DefaultDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b4, byte[] bArr, int i) {
            return AEADBaseEngine.this.processor.processByte(b4, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return AEADBaseEngine.this.processEncDecBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public class ImmediateAADProcessor implements AADProcessingBuffer {
        private ImmediateAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i) {
            return Math.max(0, i);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i, int i2) {
            return i >= i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i, int i2) {
            return i < i2;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b4) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine.m_aad;
            int i = aEADBaseEngine.m_aadPos;
            int i2 = i + 1;
            aEADBaseEngine.m_aadPos = i2;
            bArr[i] = b4;
            if (i2 == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(bArr, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b4, byte[] bArr, int i) {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i2 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i2 + 1;
            bArr2[i2] = b4;
            return aEADBaseEngine.processEncDecByte(bArr, i);
        }
    }

    public static class ProcessingBufferType {
        public static final int BUFFERED = 0;
        public static final int IMMEDIATE = 1;
        private final int ord;
        public static final ProcessingBufferType Buffered = new ProcessingBufferType(0);
        public static final ProcessingBufferType Immediate = new ProcessingBufferType(1);

        public ProcessingBufferType(int i) {
            this.ord = i;
        }
    }

    public static class State {
        public static final int DEC_AAD = 6;
        public static final int DEC_DATA = 7;
        public static final int DEC_FINAL = 8;
        public static final int DEC_INIT = 5;
        public static final int ENC_AAD = 2;
        public static final int ENC_DATA = 3;
        public static final int ENC_FINAL = 4;
        public static final int ENC_INIT = 1;
        public static final int UNINITIALIZED = 0;
        final int ord;
        public static final State Uninitialized = new State(0);
        public static final State EncInit = new State(1);
        public static final State EncAad = new State(2);
        public static final State EncData = new State(3);
        public static final State EncFinal = new State(4);
        public static final State DecInit = new State(5);
        public static final State DecAad = new State(6);
        public static final State DecData = new State(7);
        public static final State DecFinal = new State(8);

        public State(int i) {
            this.ord = i;
        }
    }

    public static class StreamAADOperator implements AADOperator {
        private final ErasableOutputStream stream = new ErasableOutputStream();

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b4) throws IOException {
            this.stream.write(b4);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i, int i2) throws IOException {
            this.stream.write(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.stream.reset();
        }
    }

    public class StreamCipherOperator implements DataOperator {
        private int len;

        private StreamCipherOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.len;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b4, byte[] bArr, int i) {
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = 1;
                AEADBaseEngine.this.processBufferEncrypt(new byte[]{b4}, 0, bArr, i);
                return 1;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int i2 = aEADBaseEngine.m_bufPos;
            if (i2 != aEADBaseEngine.MAC_SIZE) {
                byte[] bArr2 = aEADBaseEngine.m_buf;
                aEADBaseEngine.m_bufPos = i2 + 1;
                bArr2[i2] = b4;
                return 0;
            }
            this.len = 1;
            aEADBaseEngine.processBufferDecrypt(aEADBaseEngine.m_buf, 0, bArr, i);
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr3 = aEADBaseEngine2.m_buf;
            System.arraycopy(bArr3, 1, bArr3, 0, aEADBaseEngine2.m_bufPos - 1);
            AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
            aEADBaseEngine3.m_buf[aEADBaseEngine3.m_bufPos - 1] = b4;
            return 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            int i5 = 0;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i, i2, i3, AEADBaseEngine.this.processor.getUpdateOutputSize(i2))) {
                bArr = new byte[i2];
                System.arraycopy(bArr2, i, bArr, 0, i2);
                i = 0;
            }
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = i2;
                AEADBaseEngine.this.processBufferEncrypt(bArr, i, bArr2, i3);
                return i2;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int iMax = Math.max((aEADBaseEngine.m_bufPos + i2) - aEADBaseEngine.MAC_SIZE, 0);
            int i6 = AEADBaseEngine.this.m_bufPos;
            if (i6 > 0) {
                int iMin = Math.min(iMax, i6);
                this.len = iMin;
                AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
                aEADBaseEngine2.processBufferDecrypt(aEADBaseEngine2.m_buf, 0, bArr2, i3);
                iMax -= iMin;
                AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
                int i21 = aEADBaseEngine3.m_bufPos - iMin;
                aEADBaseEngine3.m_bufPos = i21;
                byte[] bArr3 = aEADBaseEngine3.m_buf;
                System.arraycopy(bArr3, iMin, bArr3, 0, i21);
                i5 = iMin;
            }
            if (iMax > 0) {
                this.len = iMax;
                AEADBaseEngine.this.processBufferDecrypt(bArr, i, bArr2, i3);
                i5 += iMax;
                i2 -= iMax;
                i += iMax;
            }
            AEADBaseEngine aEADBaseEngine4 = AEADBaseEngine.this;
            System.arraycopy(bArr, i, aEADBaseEngine4.m_buf, aEADBaseEngine4.m_bufPos, i2);
            AEADBaseEngine.this.m_bufPos += i2;
            return i5;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    public class StreamDataOperator implements DataOperator {
        private final ErasableOutputStream stream = new ErasableOutputStream();

        public StreamDataOperator() {
        }

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b4, byte[] bArr, int i) throws IOException {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(b4);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(bArr, i, i2);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.stream.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAadBytes(byte[] bArr, int i, int i2) {
        int i3 = this.m_aadPos;
        if (i3 > 0) {
            int i5 = this.AADBufferSize - i3;
            if (this.processor.isLengthWithinAvailableSpace(i2, i5)) {
                System.arraycopy(bArr, i, this.m_aad, this.m_aadPos, i2);
                this.m_aadPos += i2;
                return;
            } else {
                System.arraycopy(bArr, i, this.m_aad, this.m_aadPos, i5);
                i += i5;
                i2 -= i5;
                processBufferAAD(this.m_aad, 0);
            }
        }
        while (this.processor.isLengthExceedingBlockSize(i2, this.AADBufferSize)) {
            processBufferAAD(bArr, i);
            int i6 = this.AADBufferSize;
            i += i6;
            i2 -= i6;
        }
        System.arraycopy(bArr, i, this.m_aad, 0, i2);
        this.m_aadPos = i2;
    }

    public void checkAAD() {
        State state;
        int i = this.m_state.ord;
        if (i == 1) {
            state = State.EncAad;
        } else {
            if (i == 2) {
                return;
            }
            if (i == 4) {
                throw new IllegalStateException(a.i(new StringBuilder(), getAlgorithmName(), " cannot be reused for encryption"));
            }
            if (i != 5) {
                if (i != 6) {
                    throw new IllegalStateException(a.i(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
                }
                return;
            }
            state = State.DecAad;
        }
        this.m_state = state;
    }

    public boolean checkData(boolean z) {
        switch (this.m_state.ord) {
            case 1:
            case 2:
                finishAAD(State.EncData, z);
                return true;
            case 3:
                return true;
            case 4:
                throw new IllegalStateException(a.i(new StringBuilder(), getAlgorithmName(), " cannot be reused for encryption"));
            case 5:
            case 6:
                finishAAD(State.DecData, z);
                return false;
            case 7:
                return false;
            default:
                throw new IllegalStateException(a.i(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        int i2;
        boolean zCheckData = checkData(true);
        int i3 = this.m_bufPos;
        int i5 = this.MAC_SIZE;
        if (zCheckData) {
            i2 = i3 + i5;
        } else {
            if (i3 < i5) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 = i3 - i5;
            this.m_bufPos = i2;
        }
        ensureSufficientOutputBuffer(bArr, i, i2);
        this.mac = new byte[this.MAC_SIZE];
        processFinalBlock(bArr, i);
        if (zCheckData) {
            byte[] bArr2 = this.mac;
            int i6 = this.MAC_SIZE;
            System.arraycopy(bArr2, 0, bArr, (i + i2) - i6, i6);
        } else if (!Arrays.constantTimeAreEqual(this.MAC_SIZE, this.mac, 0, this.m_buf, this.m_bufPos)) {
            DecryptionFailureCounter decryptionFailureCounter = this.decryptionFailureCounter;
            if (decryptionFailureCounter == null || !decryptionFailureCounter.increment()) {
                throw new InvalidCipherTextException(a.i(new StringBuilder(), this.algorithmName, " mac does not match"));
            }
            throw new InvalidCipherTextException(a.i(new StringBuilder(), this.algorithmName, " decryption failure limit exceeded"));
        }
        reset(!zCheckData);
        return i2;
    }

    public final void ensureInitialized() {
        if (this.m_state == State.Uninitialized) {
            throw new IllegalStateException("Need to call init function before operation");
        }
    }

    public final void ensureSufficientInputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
    }

    public final void ensureSufficientOutputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public abstract void finishAAD(State state, boolean z);

    public void finishAAD1(State state) {
        int i = this.m_state.ord;
        if (i == 1 || i == 2 || i == 5 || i == 6) {
            processFinalAAD();
        }
        this.m_state = state;
    }

    public void finishAAD2(State state) {
        int i = this.m_state.ord;
        if (i == 2 || i == 6) {
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public void finishAAD3(State state, boolean z) {
        int i = this.m_state.ord;
        if (i == 1 || i == 2) {
            processFinalAAD();
        } else if (i == 5 || i == 6) {
            if (!z && this.dataOperator.getLen() <= this.MAC_SIZE) {
                return;
            }
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public final int getBlockSize() {
        return this.BlockSize;
    }

    public int getIVBytesSize() {
        return this.IV_SIZE;
    }

    public int getKeyBytesSize() {
        return this.KEY_SIZE;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int iMax = Math.max(0, i);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                return iMax + this.m_bufPos + this.MAC_SIZE;
            case 5:
            case 6:
            case 7:
            case 8:
                return Math.max(0, (iMax + this.m_bufPos) - this.MAC_SIZE);
            default:
                return iMax + this.MAC_SIZE;
        }
    }

    public int getTotalBytesForUpdate(int i) {
        int i2;
        int updateOutputSize = this.processor.getUpdateOutputSize(i);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                i2 = updateOutputSize + this.m_bufPos;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = (updateOutputSize + this.m_bufPos) - this.MAC_SIZE;
                break;
            default:
                return updateOutputSize;
        }
        return Math.max(0, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int totalBytesForUpdate = getTotalBytesForUpdate(i);
        return totalBytesForUpdate - (totalBytesForUpdate % this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        KeyParameter key;
        byte[] iv2;
        this.forEncryption = z;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            int i = this.macSizeLowerBound;
            if (i == 0) {
                if (macSize != (this.MAC_SIZE << 3)) {
                    throw new IllegalArgumentException(d.n("Invalid value for MAC size: ", macSize));
                }
            } else {
                if (macSize > 128 || macSize < (i << 3) || (macSize & 7) != 0) {
                    throw new IllegalArgumentException("MAC size must be between " + (this.macSizeLowerBound << 3) + " and 128 bits for " + this.algorithmName);
                }
                this.MAC_SIZE = macSize >>> 3;
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to " + this.algorithmName);
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException(a.i(new StringBuilder(), this.algorithmName, " Init parameters must include a key"));
        }
        if (iv2 == null || iv2.length != this.IV_SIZE) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.algorithmName);
            sb6.append(" requires exactly ");
            throw new IllegalArgumentException(j6.a.v(sb6, " bytes of IV", this.IV_SIZE));
        }
        byte[] key2 = key.getKey();
        if (key2.length != this.KEY_SIZE) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(this.algorithmName);
            sb9.append(" key must be ");
            throw new IllegalArgumentException(j6.a.v(sb9, " bytes long", this.KEY_SIZE));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.m_state = z ? State.EncInit : State.DecInit;
        init(key2, iv2);
        DataLimitCounter dataLimitCounter = this.dataLimitCounter;
        if (dataLimitCounter != null) {
            dataLimitCounter.increment(iv2.length);
        }
        reset(true);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public abstract void init(byte[] bArr, byte[] bArr2);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b4) {
        checkAAD();
        this.aadOperator.processAADByte(b4);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        ensureSufficientInputBuffer(bArr, i, i2);
        if (i2 <= 0) {
            return;
        }
        checkAAD();
        this.aadOperator.processAADBytes(bArr, i, i2);
    }

    public abstract void processBufferAAD(byte[] bArr, int i);

    public abstract void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b4, byte[] bArr, int i) throws DataLengthException {
        return this.dataOperator.processByte(b4, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        ensureSufficientInputBuffer(bArr, i, i2);
        return this.dataOperator.processBytes(bArr, i, i2, bArr2, i3);
    }

    public int processEncDecByte(byte[] bArr, int i) {
        if ((this.forEncryption ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos != 0) {
            return 0;
        }
        ensureSufficientOutputBuffer(bArr, i, this.BlockSize);
        if (this.forEncryption) {
            processBufferEncrypt(this.m_buf, 0, bArr, i);
        } else {
            processBufferDecrypt(this.m_buf, 0, bArr, i);
            byte[] bArr2 = this.m_buf;
            int i2 = this.BlockSize;
            System.arraycopy(bArr2, i2, bArr2, 0, this.m_bufPos - i2);
        }
        int i3 = this.m_bufPos;
        int i5 = this.BlockSize;
        this.m_bufPos = i3 - i5;
        return i5;
    }

    public int processEncDecBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i5;
        boolean zCheckData = checkData(false);
        int i6 = (zCheckData ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos;
        if (this.processor.isLengthWithinAvailableSpace(i2, i6)) {
            System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, i2);
            this.m_bufPos += i2;
            return 0;
        }
        int updateOutputSize = this.processor.getUpdateOutputSize(i2);
        int i21 = (this.m_bufPos + updateOutputSize) - (zCheckData ? 0 : this.MAC_SIZE);
        ensureSufficientOutputBuffer(bArr2, i3, i21 - (i21 % this.BlockSize));
        if (bArr == bArr2 && Arrays.segmentsOverlap(i, i2, i3, updateOutputSize)) {
            bArr = new byte[i2];
            System.arraycopy(bArr2, i, bArr, 0, i2);
            i = 0;
        }
        if (zCheckData) {
            int i22 = this.m_bufPos;
            if (i22 > 0) {
                System.arraycopy(bArr, i, this.m_buf, i22, i6);
                i += i6;
                i2 -= i6;
                processBufferEncrypt(this.m_buf, 0, bArr2, i3);
                i5 = this.BlockSize;
            } else {
                i5 = 0;
            }
            while (this.processor.isLengthExceedingBlockSize(i2, this.BlockSize)) {
                processBufferEncrypt(bArr, i, bArr2, i3 + i5);
                int i32 = this.BlockSize;
                i += i32;
                i2 -= i32;
                i5 += i32;
            }
        } else {
            i5 = 0;
            while (this.processor.isLengthExceedingBlockSize(this.m_bufPos, this.BlockSize) && this.processor.isLengthExceedingBlockSize(this.m_bufPos + i2, this.m_bufferSizeDecrypt)) {
                processBufferDecrypt(this.m_buf, i5, bArr2, i3 + i5);
                int i33 = this.m_bufPos;
                int i43 = this.BlockSize;
                this.m_bufPos = i33 - i43;
                i5 += i43;
            }
            int i59 = this.m_bufPos;
            if (i59 > 0) {
                byte[] bArr3 = this.m_buf;
                System.arraycopy(bArr3, i5, bArr3, 0, i59);
                if (this.processor.isLengthWithinAvailableSpace(this.m_bufPos + i2, this.m_bufferSizeDecrypt)) {
                    System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, i2);
                    this.m_bufPos += i2;
                    return i5;
                }
                int iMax = Math.max(this.BlockSize - this.m_bufPos, 0);
                System.arraycopy(bArr, i, this.m_buf, this.m_bufPos, iMax);
                i += iMax;
                i2 -= iMax;
                processBufferDecrypt(this.m_buf, 0, bArr2, i3 + i5);
                i5 += this.BlockSize;
            }
            while (this.processor.isLengthExceedingBlockSize(i2, this.m_bufferSizeDecrypt)) {
                processBufferDecrypt(bArr, i, bArr2, i3 + i5);
                int i66 = this.BlockSize;
                i += i66;
                i2 -= i66;
                i5 += i66;
            }
        }
        System.arraycopy(bArr, i, this.m_buf, 0, i2);
        this.m_bufPos = i2;
        return i5;
    }

    public abstract void processFinalAAD();

    public abstract void processFinalBlock(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInnerMembers(org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType r5, org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType r6, org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType r7) {
        /*
            r4 = this;
            int r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.access$000(r5)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L13
            if (r5 == r0) goto Lb
            goto L19
        Lb:
            org.bouncycastle.crypto.engines.AEADBaseEngine$ImmediateAADProcessor r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$ImmediateAADProcessor
            r5.<init>()
        L10:
            r4.processor = r5
            goto L19
        L13:
            org.bouncycastle.crypto.engines.AEADBaseEngine$BufferedAADProcessor r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$BufferedAADProcessor
            r5.<init>()
            goto L10
        L19:
            int r5 = r4.BlockSize
            int r2 = r4.MAC_SIZE
            int r5 = r5 + r2
            r4.m_bufferSizeDecrypt = r5
            int r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType.access$300(r6)
            r6 = 0
            r2 = 3
            r3 = 2
            if (r5 == 0) goto L59
            if (r5 == r0) goto L4d
            if (r5 == r3) goto L45
            if (r5 == r2) goto L30
            goto L65
        L30:
            int r5 = r4.AADBufferSize
            byte[] r5 = new byte[r5]
            r4.m_aad = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataLimitCounter r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DataLimitCounter
            r5.<init>()
            r4.dataLimitCounter = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataLimitAADOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DataLimitAADOperator
            r5.<init>()
        L42:
            r4.aadOperator = r5
            goto L65
        L45:
            r4.AADBufferSize = r6
            org.bouncycastle.crypto.engines.AEADBaseEngine$StreamAADOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$StreamAADOperator
            r5.<init>()
            goto L42
        L4d:
            int r5 = r4.AADBufferSize
            byte[] r5 = new byte[r5]
            r4.m_aad = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$CounterAADOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$CounterAADOperator
            r5.<init>()
            goto L42
        L59:
            int r5 = r4.AADBufferSize
            byte[] r5 = new byte[r5]
            r4.m_aad = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultAADOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultAADOperator
            r5.<init>()
            goto L42
        L65:
            int r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.access$700(r7)
            if (r5 == 0) goto La9
            if (r5 == r0) goto L9d
            if (r5 == r3) goto L91
            if (r5 == r2) goto L83
            r6 = 4
            if (r5 == r6) goto L75
            return
        L75:
            int r5 = r4.m_bufferSizeDecrypt
            byte[] r5 = new byte[r5]
            r4.m_buf = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataLimitDataOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DataLimitDataOperator
            r5.<init>()
        L80:
            r4.dataOperator = r5
            return
        L83:
            r4.BlockSize = r6
            int r5 = r4.m_bufferSizeDecrypt
            byte[] r5 = new byte[r5]
            r4.m_buf = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$StreamCipherOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$StreamCipherOperator
            r5.<init>()
            goto L80
        L91:
            int r5 = r4.MAC_SIZE
            byte[] r5 = new byte[r5]
            r4.m_buf = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$StreamDataOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$StreamDataOperator
            r5.<init>()
            goto L80
        L9d:
            int r5 = r4.m_bufferSizeDecrypt
            byte[] r5 = new byte[r5]
            r4.m_buf = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$CounterDataOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$CounterDataOperator
            r5.<init>()
            goto L80
        La9:
            int r5 = r4.m_bufferSizeDecrypt
            byte[] r5 = new byte[r5]
            r4.m_buf = r5
            org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultDataOperator r5 = new org.bouncycastle.crypto.engines.AEADBaseEngine$DefaultDataOperator
            r5.<init>()
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.AEADBaseEngine.setInnerMembers(org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType, org.bouncycastle.crypto.engines.AEADBaseEngine$AADOperatorType, org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType):void");
    }

    public void reset(boolean z) {
        ensureInitialized();
        if (z) {
            this.mac = null;
        }
        byte[] bArr = this.m_buf;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.m_bufPos = 0;
        }
        byte[] bArr2 = this.m_aad;
        if (bArr2 != null) {
            Arrays.fill(bArr2, (byte) 0);
            this.m_aadPos = 0;
        }
        switch (this.m_state.ord) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.EncFinal;
                return;
            case 6:
            case 7:
            case 8:
                this.m_state = State.DecFinal;
                break;
            default:
                throw new IllegalStateException(a.i(new StringBuilder(), getAlgorithmName(), " needs to be initialized"));
        }
        this.aadOperator.reset();
        this.dataOperator.reset();
    }

    public static class DataLimitCounter {
        private long count;
        private long max;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f228330n;

        public void increment() {
            long j2 = this.count + 1;
            this.count = j2;
            if (j2 > this.max) {
                throw new IllegalStateException(j6.a.v(new StringBuilder("Total data limit exceeded: maximum 2^"), " bytes per key (including nonce, AAD, and message)", this.f228330n));
            }
        }

        public void init(int i) {
            this.f228330n = i;
            this.max = 1 << i;
        }

        public void reset() {
            this.count = 0L;
        }

        public void increment(int i) {
            long j2 = this.count + ((long) i);
            this.count = j2;
            if (j2 > this.max) {
                throw new IllegalStateException(j6.a.l(i, "Total data limit exceeded: maximum 2^", " bytes per key (including nonce, AAD, and message)"));
            }
        }
    }
}
