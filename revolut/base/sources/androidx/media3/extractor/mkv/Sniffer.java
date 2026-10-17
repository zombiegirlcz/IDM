package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import ch.qos.logback.core.util.FileSize;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
final class Sniffer {
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException {
        int i = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i2 = this.scratch.getData()[0] & UnsignedBytes.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i5 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i5++;
        }
        int i6 = i2 & (~i3);
        extractorInput.peekFully(this.scratch.getData(), 1, i5);
        while (i < i5) {
            i++;
            i6 = (this.scratch.getData()[i] & UnsignedBytes.MAX_VALUE) + (i6 << 8);
        }
        this.peekLength = i5 + 1 + this.peekLength;
        return i6;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        long length = extractorInput.getLength();
        long j2 = FileSize.KB_COEFFICIENT;
        if (length != -1 && length <= FileSize.KB_COEFFICIENT) {
            j2 = length;
        }
        int i = (int) j2;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i2 = this.peekLength + 1;
            this.peekLength = i2;
            if (i2 == i) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & UnsignedBytes.MAX_VALUE));
        }
        long uint = readUint(extractorInput);
        long j3 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j3 + uint < length)) {
            while (true) {
                int i3 = this.peekLength;
                long j5 = j3 + uint;
                if (i3 < j5) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        break;
                    }
                    if (uint2 != 0) {
                        int i5 = (int) uint2;
                        extractorInput.advancePeekPosition(i5);
                        this.peekLength += i5;
                    }
                } else if (i3 == j5) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
