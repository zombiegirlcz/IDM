package com.github.devnied.emvnfccard.utils;

import com.github.devnied.emvnfccard.enums.CommandEnum;

/* JADX INFO: loaded from: classes16.dex */
public class CommandApdu {
    protected int mCla;
    protected byte[] mData;
    protected int mIns;
    protected int mLc;
    protected int mLe;
    protected boolean mLeUsed;
    protected int mP1;
    protected int mP2;

    public CommandApdu(CommandEnum commandEnum, byte[] bArr, int i) {
        this.mCla = 0;
        this.mIns = 0;
        this.mP1 = 0;
        this.mP2 = 0;
        this.mLc = 0;
        this.mData = new byte[0];
        this.mLe = 0;
        this.mLeUsed = false;
        this.mCla = commandEnum.getCla();
        this.mIns = commandEnum.getIns();
        this.mP1 = commandEnum.getP1();
        this.mP2 = commandEnum.getP2();
        this.mLc = bArr != null ? bArr.length : 0;
        this.mData = bArr;
        this.mLe = i;
        this.mLeUsed = true;
    }

    public byte[] toBytes() {
        byte[] bArr = this.mData;
        int length = 4;
        int length2 = (bArr == null || bArr.length == 0) ? 4 : bArr.length + 5;
        if (this.mLeUsed) {
            length2++;
        }
        byte[] bArr2 = new byte[length2];
        bArr2[0] = (byte) this.mCla;
        bArr2[1] = (byte) this.mIns;
        bArr2[2] = (byte) this.mP1;
        bArr2[3] = (byte) this.mP2;
        if (bArr != null && bArr.length != 0) {
            bArr2[4] = (byte) this.mLc;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            length = 5 + this.mData.length;
        }
        if (this.mLeUsed) {
            bArr2[length] = (byte) (bArr2[length] + ((byte) this.mLe));
        }
        return bArr2;
    }

    public CommandApdu(CommandEnum commandEnum, int i, int i2, int i3) {
        this.mCla = 0;
        this.mIns = 0;
        this.mP1 = 0;
        this.mP2 = 0;
        this.mLc = 0;
        this.mData = new byte[0];
        this.mLe = 0;
        this.mLeUsed = false;
        this.mCla = commandEnum.getCla();
        this.mIns = commandEnum.getIns();
        this.mP1 = i;
        this.mP2 = i2;
        this.mLe = i3;
        this.mLeUsed = true;
    }

    public CommandApdu(CommandEnum commandEnum, int i, int i2) {
        this.mCla = 0;
        this.mIns = 0;
        this.mP1 = 0;
        this.mP2 = 0;
        this.mLc = 0;
        this.mData = new byte[0];
        this.mLe = 0;
        this.mLeUsed = false;
        this.mCla = commandEnum.getCla();
        this.mIns = commandEnum.getIns();
        this.mP1 = i;
        this.mP2 = i2;
        this.mLeUsed = false;
    }

    public CommandApdu(CommandEnum commandEnum, int i, int i2, byte[] bArr, int i3) {
        this.mCla = 0;
        this.mIns = 0;
        this.mP1 = 0;
        this.mP2 = 0;
        this.mLc = 0;
        this.mData = new byte[0];
        this.mLe = 0;
        this.mLeUsed = false;
        this.mCla = commandEnum.getCla();
        this.mIns = commandEnum.getIns();
        this.mP1 = i;
        this.mP2 = i2;
        this.mLc = bArr != null ? bArr.length : 0;
        this.mData = bArr;
        this.mLe = i3;
        this.mLeUsed = true;
    }
}
