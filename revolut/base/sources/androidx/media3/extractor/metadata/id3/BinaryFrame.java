package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
public final class BinaryFrame extends Id3Frame {
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && BinaryFrame.class == obj2.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj2;
            if (this.f7624id.equals(binaryFrame.f7624id) && Arrays.equals(this.data, binaryFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + a.c(527, 31, this.f7624id);
    }
}
