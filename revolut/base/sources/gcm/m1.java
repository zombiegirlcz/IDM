package gcm;

import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes13.dex */
public final class m1 implements ecm.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142766a;

    public /* synthetic */ m1(int i) {
        this.f142766a = i;
    }

    @Override // ecm.l1
    public final byte[] a(Object obj2) {
        switch (this.f142766a) {
            case 0:
                return (byte[]) obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ecm.l1
    public final Object b(byte[] bArr) {
        switch (this.f142766a) {
            case 0:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, ecm.o0.f124850a)));
                }
                return Integer.valueOf((bArr[2] - ISO7816.INS_DECREASE) + v0.a.a(bArr[1], 48, 10, (bArr[0] - ISO7816.INS_DECREASE) * 100));
        }
    }
}
