package u9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends oi0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n[] f278280a;

    public l(oi0.d dVar, n[] nVarArr) {
        this.f278280a = nVarArr;
    }

    @Override // oi0.d
    public final oi0.d E(Class cls, k9.k kVar) {
        n[] nVarArr = this.f278280a;
        int length = nVarArr.length;
        if (length == 8) {
            return this;
        }
        n[] nVarArr2 = (n[]) Arrays.copyOf(nVarArr, length + 1);
        nVarArr2[length] = new n(cls, kVar);
        return new l(this, nVarArr2);
    }

    @Override // oi0.d
    public final k9.k H(Class cls) {
        n[] nVarArr = this.f278280a;
        n nVar = nVarArr[0];
        if (nVar.f278283a == cls) {
            return nVar.f278284b;
        }
        n nVar2 = nVarArr[1];
        if (nVar2.f278283a == cls) {
            return nVar2.f278284b;
        }
        n nVar3 = nVarArr[2];
        if (nVar3.f278283a == cls) {
            return nVar3.f278284b;
        }
        switch (nVarArr.length) {
            case 8:
                n nVar4 = nVarArr[7];
                if (nVar4.f278283a == cls) {
                    return nVar4.f278284b;
                }
            case 7:
                n nVar5 = nVarArr[6];
                if (nVar5.f278283a == cls) {
                    return nVar5.f278284b;
                }
            case 6:
                n nVar6 = nVarArr[5];
                if (nVar6.f278283a == cls) {
                    return nVar6.f278284b;
                }
            case 5:
                n nVar7 = nVarArr[4];
                if (nVar7.f278283a == cls) {
                    return nVar7.f278284b;
                }
            case 4:
                n nVar8 = nVarArr[3];
                if (nVar8.f278283a == cls) {
                    return nVar8.f278284b;
                }
                return null;
            default:
                return null;
        }
    }
}
