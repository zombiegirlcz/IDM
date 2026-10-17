package org.bouncycastle.util.encoders;

import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes14.dex */
public class HexTranslator implements Translator {
    private static final byte[] hexTable = {ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102};

    @Override // org.bouncycastle.util.encoders.Translator
    public int decode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i5 = i2 / 2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i21 = (i6 * 2) + i;
            byte b4 = bArr[i21];
            byte b5 = bArr[i21 + 1];
            if (b4 < 97) {
                bArr2[i3] = (byte) ((b4 + ISO7816.INS_WRITE_BINARY) << 4);
            } else {
                bArr2[i3] = (byte) ((b4 - 87) << 4);
            }
            if (b5 < 97) {
                bArr2[i3] = (byte) (bArr2[i3] + ((byte) (b5 + ISO7816.INS_WRITE_BINARY)));
            } else {
                bArr2[i3] = (byte) (bArr2[i3] + ((byte) (b5 - 87)));
            }
            i3++;
        }
        return i5;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            int i21 = i3 + i6;
            byte[] bArr3 = hexTable;
            bArr2[i21] = bArr3[(bArr[i] >> 4) & 15];
            bArr2[i21 + 1] = bArr3[bArr[i] & 15];
            i++;
            i5++;
            i6 += 2;
        }
        return i2 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getDecodedBlockSize() {
        return 1;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getEncodedBlockSize() {
        return 2;
    }
}
