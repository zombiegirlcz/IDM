package rfm;

import java.util.concurrent.atomic.AtomicBoolean;
import tfm.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends efm.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f253964c;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f253962a = i;
        this.f253963b = obj2;
        this.f253964c = obj3;
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        int length;
        switch (this.f253962a) {
            case 0:
                ((efm.k) this.f253963b).i(new ofm.i(f0Var, (kfm.o) this.f253964c, 2));
                break;
            case 1:
                ((efm.k) this.f253963b).i(new ofm.i(f0Var, (efm.h0) this.f253964c, 3));
                break;
            case 2:
                ((efm.r) this.f253963b).subscribe(new ofm.k(f0Var, this.f253964c));
                break;
            case 3:
                efm.h0[] h0VarArr = (efm.h0[]) this.f253963b;
                if (h0VarArr == null) {
                    h0VarArr = new efm.h0[8];
                    try {
                        length = 0;
                        for (efm.h0 h0Var : (Iterable) this.f253964c) {
                            if (h0Var == null) {
                                lfm.e.e(new NullPointerException("One of the sources is null"), f0Var);
                            } else {
                                if (length == h0VarArr.length) {
                                    efm.h0[] h0VarArr2 = new efm.h0[(length >> 2) + length];
                                    System.arraycopy(h0VarArr, 0, h0VarArr2, 0, length);
                                    h0VarArr = h0VarArr2;
                                }
                                int i = length + 1;
                                h0VarArr[length] = h0Var;
                                length = i;
                            }
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        lfm.e.e(th10, f0Var);
                        return;
                    }
                } else {
                    length = h0VarArr.length;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                ifm.b bVar = new ifm.b();
                f0Var.onSubscribe(bVar);
                for (int i2 = 0; i2 < length; i2++) {
                    efm.h0 h0Var2 = h0VarArr[i2];
                    if (!bVar.f161042b) {
                        if (h0Var2 == null) {
                            bVar.dispose();
                            Throwable nullPointerException = new NullPointerException("One of the sources is null");
                            if (atomicBoolean.compareAndSet(false, true)) {
                                f0Var.onError(nullPointerException);
                            } else {
                                mo3.a.m(nullPointerException);
                            }
                        } else {
                            ((efm.d0) h0Var2).q(new prl.e(f0Var, bVar, atomicBoolean));
                        }
                    }
                    break;
                }
                break;
            case 4:
                ((efm.r) this.f253964c).subscribe(new s0(f0Var, (efm.d0) this.f253963b, 3));
                break;
            case 5:
                ((efm.d0) this.f253963b).q(new pfm.k(f0Var, (kfm.a) this.f253964c, 2));
                break;
            case 6:
                ((ufm.f) this.f253963b).q(new ofm.i(f0Var, (rzc.b) this.f253964c));
                break;
            case 7:
                ((ufm.f) this.f253963b).q(new rul.e(this, f0Var));
                break;
            case 8:
                ofm.i iVar = new ofm.i(f0Var);
                f0Var.onSubscribe(iVar);
                ((pfm.x) this.f253964c).a((qfm.s) iVar.f224924c);
                ((efm.d0) this.f253963b).q(iVar);
                break;
            default:
                ((ufm.i) this.f253963b).q(new ufm.r(f0Var, (efm.c0) this.f253964c));
                break;
        }
    }
}
