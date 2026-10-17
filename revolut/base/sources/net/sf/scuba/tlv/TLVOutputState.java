package net.sf.scuba.tlv;

import j6.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import kii.e;
import net.sf.scuba.util.Hex;

/* JADX INFO: loaded from: classes14.dex */
class TLVOutputState {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba.tlv");
    private boolean isAtStartOfLength;
    private boolean isAtStartOfTag;
    private boolean isReadingValue;
    private Deque<TLVStruct> state;

    public class TLVStruct {
        private boolean isLengthSet;
        private int length;

        /* JADX INFO: renamed from: tag, reason: collision with root package name */
        private int f214660tag;
        private ByteArrayOutputStream value;

        public TLVStruct(TLVOutputState tLVOutputState, TLVStruct tLVStruct) {
            this(tLVStruct.f214660tag, tLVStruct.length, tLVStruct.isLengthSet, tLVStruct.getValue());
        }

        public int getLength() {
            return this.length;
        }

        public int getTag() {
            return this.f214660tag;
        }

        public byte[] getValue() {
            return this.value.toByteArray();
        }

        public int getValueBytesProcessed() {
            return this.value.size();
        }

        public boolean isLengthSet() {
            return this.isLengthSet;
        }

        public void setLength(int i) {
            this.length = i;
            this.isLengthSet = true;
        }

        public String toString() {
            byte[] byteArray = this.value.toByteArray();
            StringBuilder sb6 = new StringBuilder("[TLVStruct ");
            e.y(sb6, ", ", this.f214660tag);
            sb6.append(this.isLengthSet ? Integer.valueOf(this.length) : "UNDEFINED");
            sb6.append(", ");
            sb6.append(Hex.bytesToHexString(byteArray));
            sb6.append("(");
            return a.v(sb6, ") ]", byteArray.length);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.value.write(bArr, i, i2);
        }

        public TLVStruct(TLVOutputState tLVOutputState, int i) {
            this(i, Integer.MAX_VALUE, false, null);
        }

        public TLVStruct(int i, int i2, boolean z, byte[] bArr) {
            this.f214660tag = i;
            this.length = i2;
            this.isLengthSet = z;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.value = byteArrayOutputStream;
            if (bArr != null) {
                try {
                    byteArrayOutputStream.write(bArr);
                } catch (IOException e) {
                    TLVOutputState.LOGGER.log(Level.FINE, "Exception writing bytes in memory", (Throwable) e);
                }
            }
        }
    }

    public TLVOutputState() {
        this(new ArrayDeque(), true, false, false);
    }

    private Deque<TLVStruct> getDeepCopyOfState() {
        ArrayDeque arrayDeque = new ArrayDeque(this.state.size());
        Iterator<TLVStruct> it8 = this.state.iterator();
        while (it8.hasNext()) {
            arrayDeque.add(new TLVStruct(this, it8.next()));
        }
        return arrayDeque;
    }

    public boolean canBeWritten() {
        Iterator<TLVStruct> it8 = this.state.iterator();
        while (it8.hasNext()) {
            if (!it8.next().isLengthSet()) {
                return false;
            }
        }
        return true;
    }

    public int getLength() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        int length = this.state.peek().getLength();
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Length not yet knwon.");
    }

    public int getTag() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Tag not yet read.");
        }
        return this.state.peek().getTag();
    }

    public byte[] getValue() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Cannot get value yet.");
        }
        return this.state.peek().getValue();
    }

    public int getValueBytesLeft() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length of value is unknown.");
        }
        TLVStruct tLVStructPeek = this.state.peek();
        return tLVStructPeek.getLength() - tLVStructPeek.getValueBytesProcessed();
    }

    public int getValueBytesProcessed() {
        return this.state.peek().getValueBytesProcessed();
    }

    public boolean isAtStartOfLength() {
        return this.isAtStartOfLength;
    }

    public boolean isAtStartOfTag() {
        return this.isAtStartOfTag;
    }

    public boolean isDummyLengthSet() {
        if (this.state.isEmpty()) {
            return false;
        }
        return !this.state.peek().isLengthSet();
    }

    public boolean isProcessingValue() {
        return this.isReadingValue;
    }

    public void setDummyLengthProcessed() {
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setLengthProcessed(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.l(i, "Cannot set negative length (length = ", ")."));
        }
        TLVStruct tLVStructPop = this.state.pop();
        if (!this.state.isEmpty()) {
            TLVStruct tLVStructPeek = this.state.peek();
            byte[] lengthAsBytes = TLVUtil.getLengthAsBytes(i);
            tLVStructPeek.write(lengthAsBytes, 0, lengthAsBytes.length);
        }
        tLVStructPop.setLength(i);
        this.state.push(tLVStructPop);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setTagProcessed(int i) {
        TLVStruct tLVStruct = new TLVStruct(this, i);
        if (!this.state.isEmpty()) {
            TLVStruct tLVStructPeek = this.state.peek();
            byte[] tagAsBytes = TLVUtil.getTagAsBytes(i);
            tLVStructPeek.write(tagAsBytes, 0, tagAsBytes.length);
        }
        this.state.push(tLVStruct);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = true;
        this.isReadingValue = false;
    }

    public String toString() {
        return this.state.toString();
    }

    public void updatePreviousLength(int i) {
        if (this.state.isEmpty()) {
            return;
        }
        TLVStruct tLVStructPeek = this.state.peek();
        if (tLVStructPeek.isLengthSet && tLVStructPeek.getLength() == i) {
            return;
        }
        tLVStructPeek.setLength(i);
        if (tLVStructPeek.getValueBytesProcessed() == tLVStructPeek.getLength()) {
            this.state.pop();
            byte[] lengthAsBytes = TLVUtil.getLengthAsBytes(i);
            byte[] value = tLVStructPeek.getValue();
            updateValueBytesProcessed(lengthAsBytes, 0, lengthAsBytes.length);
            updateValueBytesProcessed(value, 0, value.length);
            this.isAtStartOfTag = true;
            this.isAtStartOfLength = false;
            this.isReadingValue = false;
        }
    }

    public void updateValueBytesProcessed(byte[] bArr, int i, int i2) {
        if (this.state.isEmpty()) {
            return;
        }
        TLVStruct tLVStructPeek = this.state.peek();
        int length = tLVStructPeek.getLength() - tLVStructPeek.getValueBytesProcessed();
        if (i2 > length) {
            StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Cannot process ", i2, length, " bytes! Only ", " bytes left in this TLV object ");
            sbW.append(tLVStructPeek);
            throw new IllegalArgumentException(sbW.toString());
        }
        tLVStructPeek.write(bArr, i, i2);
        if (tLVStructPeek.getValueBytesProcessed() != tLVStructPeek.getLength()) {
            this.isAtStartOfTag = false;
            this.isAtStartOfLength = false;
            this.isReadingValue = true;
        } else {
            this.state.pop();
            updateValueBytesProcessed(tLVStructPeek.getValue(), 0, tLVStructPeek.getLength());
            this.isAtStartOfTag = true;
            this.isAtStartOfLength = false;
            this.isReadingValue = false;
        }
    }

    public TLVOutputState(TLVOutputState tLVOutputState) {
        this(tLVOutputState.getDeepCopyOfState(), tLVOutputState.isAtStartOfTag, tLVOutputState.isAtStartOfLength, tLVOutputState.isReadingValue);
    }

    private TLVOutputState(Deque<TLVStruct> deque, boolean z, boolean z3, boolean z4) {
        this.state = deque;
        this.isAtStartOfTag = z;
        this.isAtStartOfLength = z3;
        this.isReadingValue = z4;
    }
}
