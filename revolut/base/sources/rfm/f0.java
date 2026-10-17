package rfm;

import java.util.Arrays;
import java.util.NoSuchElementException;
import tfm.r5;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 extends efm.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f253936c;

    public /* synthetic */ f0(Object obj2, Object obj3, int i) {
        this.f253934a = i;
        this.f253936c = obj2;
        this.f253935b = obj3;
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        switch (this.f253934a) {
            case 0:
                ((efm.k) this.f253936c).i(new pfm.s(f0Var, this.f253935b, 3));
                break;
            case 1:
                ((efm.r) this.f253936c).subscribe(new r5(f0Var, this.f253935b));
                break;
            case 2:
                ((efm.b) this.f253935b).d(new ofm.h(f0Var, (efm.h0) this.f253936c, 5));
                break;
            case 3:
                ((efm.d0) this.f253936c).q(new pfm.s(f0Var, (kfm.a) this.f253935b, 5));
                break;
            case 4:
                efm.h0[] h0VarArr = (efm.h0[]) this.f253936c;
                int length = h0VarArr.length;
                if (length == 1) {
                    ((efm.d0) h0VarArr[0]).q(new ufm.g(f0Var, new t1j.b(this, 8)));
                } else {
                    i0 i0Var = new i0(length, f0Var, (kfm.o) this.f253935b);
                    f0Var.onSubscribe(i0Var);
                    for (int i = 0; i < length && !i0Var.isDisposed(); i++) {
                        efm.h0 h0Var = h0VarArr[i];
                        if (h0Var == null) {
                            i0Var.b(i, new NullPointerException("One of the sources is null"));
                        } else {
                            ((efm.d0) h0Var).q(((j0[]) i0Var.e)[i]);
                        }
                    }
                }
                break;
            default:
                efm.h0[] h0VarArr2 = new efm.h0[8];
                try {
                    int i2 = 0;
                    for (efm.h0 h0Var2 : (Iterable) this.f253936c) {
                        if (h0Var2 == null) {
                            lfm.e.e(new NullPointerException("One of the sources is null"), f0Var);
                        } else {
                            if (i2 == h0VarArr2.length) {
                                h0VarArr2 = (efm.h0[]) Arrays.copyOf(h0VarArr2, (i2 >> 2) + i2);
                            }
                            int i3 = i2 + 1;
                            h0VarArr2[i2] = h0Var2;
                            i2 = i3;
                        }
                        break;
                    }
                    if (i2 == 0) {
                        lfm.e.e(new NoSuchElementException(), f0Var);
                    } else if (i2 == 1) {
                        ((efm.d0) h0VarArr2[0]).q(new ufm.g(f0Var, new qm.e(this, 6)));
                    } else {
                        i0 i0Var2 = new i0(i2, f0Var, (kfm.o) this.f253935b);
                        f0Var.onSubscribe(i0Var2);
                        for (int i5 = 0; i5 < i2 && !i0Var2.isDisposed(); i5++) {
                            ((efm.d0) h0VarArr2[i5]).q(((j0[]) i0Var2.e)[i5]);
                        }
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.e(th10, f0Var);
                }
                break;
        }
    }
}
