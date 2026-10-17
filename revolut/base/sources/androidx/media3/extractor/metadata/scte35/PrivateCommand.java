package androidx.media3.extractor.metadata.scte35;

import a0.d;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes15.dex */
public final class PrivateCommand extends SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j2, byte[] bArr, long j3) {
        this.ptsAdjustment = j3;
        this.identifier = j2;
        this.commandBytes = bArr;
    }

    public static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i, long j2) {
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new PrivateCommand(unsignedInt, bArr, j2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb6.append(this.ptsAdjustment);
        sb6.append(", identifier= ");
        return d.j(this.identifier, " }", sb6);
    }
}
