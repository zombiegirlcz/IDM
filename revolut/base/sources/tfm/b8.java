package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class b8 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.w[] f270372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Iterable f270373h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270374j;
    public final boolean k;

    public b8(efm.w[] wVarArr, Iterable iterable, kfm.o oVar, int i, boolean z) {
        this.f270372g = wVarArr;
        this.f270373h = iterable;
        this.i = oVar;
        this.f270374j = i;
        this.k = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        int length;
        efm.w[] wVarArr = this.f270372g;
        if (wVarArr == null) {
            wVarArr = new efm.w[8];
            length = 0;
            for (efm.w wVar : this.f270373h) {
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
        z7 z7Var = new z7(length, yVar, this.i, this.k);
        int i = this.f270374j;
        a8[] a8VarArr = z7Var.f270999c;
        int length2 = a8VarArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            a8VarArr[i2] = new a8(z7Var, i);
        }
        z7Var.lazySet(0);
        z7Var.f270997a.onSubscribe(z7Var);
        for (int i3 = 0; i3 < length2 && !z7Var.f; i3++) {
            wVarArr[i3].subscribe(a8VarArr[i3]);
        }
    }
}
