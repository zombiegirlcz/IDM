package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class k0 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.w[] f270580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Iterable f270581h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270582j;
    public final boolean k;

    public k0(efm.w[] wVarArr, Iterable iterable, kfm.o oVar, int i, boolean z) {
        this.f270580g = wVarArr;
        this.f270581h = iterable;
        this.i = oVar;
        this.f270582j = i;
        this.k = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        int length;
        efm.w[] wVarArr = this.f270580g;
        if (wVarArr == null) {
            wVarArr = new efm.w[8];
            length = 0;
            for (efm.w wVar : this.f270581h) {
                if (length == wVarArr.length) {
                    efm.w[] wVarArr2 = new efm.w[(length >> 2) + length];
                    System.arraycopy(wVarArr, 0, wVarArr2, 0, length);
                    wVarArr = wVarArr2;
                }
                wVarArr[length] = wVar;
                length++;
            }
        } else {
            length = wVarArr.length;
        }
        if (length == 0) {
            lfm.e.a(yVar);
            return;
        }
        j0 j0Var = new j0(length, this.f270582j, yVar, this.i, this.k);
        i0[] i0VarArr = j0Var.f270555c;
        int length2 = i0VarArr.length;
        j0Var.f270553a.onSubscribe(j0Var);
        for (int i = 0; i < length2 && !j0Var.f270557h && !j0Var.f270556g; i++) {
            wVarArr[i].subscribe(i0VarArr[i]);
        }
    }
}
