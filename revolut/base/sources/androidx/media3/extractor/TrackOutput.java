package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import ehe.n;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface TrackOutput {

    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i, byte[] bArr, int i2, int i3) {
            this.cryptoMode = i;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i2;
            this.clearBlocks = i3;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 != null && CryptoData.class == obj2.getClass()) {
                CryptoData cryptoData = (CryptoData) obj2;
                if (this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((n.b(this.cryptoMode * 31, 31, this.encryptionKey) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    default void durationUs(long j2) {
    }

    void format(Format format);

    default int sampleData(DataReader dataReader, int i, boolean z) throws IOException {
        return sampleData(dataReader, i, z, 0);
    }

    int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException;

    void sampleData(ParsableByteArray parsableByteArray, int i, int i2);

    void sampleMetadata(long j2, int i, int i2, int i3, CryptoData cryptoData);

    default void sampleData(ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }
}
