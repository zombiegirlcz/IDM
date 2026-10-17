package rfm;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f253930c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f253928a = i;
        this.f253929b = obj2;
        this.f253930c = obj3;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253928a) {
            case 0:
                ((efm.b) this.f253930c).d(new ofm.i(lVar, (efm.k) this.f253929b, 1));
                break;
            case 1:
                efm.n[] nVarArr = new efm.n[8];
                try {
                    int i = 0;
                    for (efm.n nVar : (ArrayList) this.f253929b) {
                        if (nVar == null) {
                            lfm.e.c(new NullPointerException("One of the sources is null"), lVar);
                        } else {
                            if (i == nVarArr.length) {
                                nVarArr = (efm.n[]) Arrays.copyOf(nVarArr, (i >> 2) + i);
                            }
                            int i2 = i + 1;
                            nVarArr[i] = nVar;
                            i = i2;
                        }
                        break;
                    }
                    if (i == 0) {
                        lVar.onSubscribe(lfm.e.INSTANCE);
                        lVar.onComplete();
                    } else if (i == 1) {
                        ((efm.k) nVarArr[0]).i(new pfm.s(lVar, new om4.d0(this, 11), 1));
                    } else {
                        i0 i0Var = new i0(lVar, i, (or2.e) this.f253930c);
                        lVar.onSubscribe(i0Var);
                        for (int i3 = 0; i3 < i && !i0Var.isDisposed(); i3++) {
                            ((efm.k) nVarArr[i3]).i(((j0[]) i0Var.e)[i3]);
                        }
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.c(th10, lVar);
                    return;
                }
                break;
            default:
                ((efm.r) this.f253929b).subscribe(new tfm.g0(lVar, (kfm.c) this.f253930c, 2));
                break;
        }
    }
}
