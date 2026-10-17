package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class a5 implements efm.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f270342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4 f270343b;

    public a5(AtomicReference atomicReference, u4 u4Var) {
        this.f270342a = atomicReference;
        this.f270343b = u4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.w
    public final void subscribe(efm.y yVar) {
        z4 z4Var;
        loop0: while (true) {
            z4Var = (z4) this.f270342a.get();
            if (z4Var != null) {
                break;
            }
            z4 z4Var2 = new z4(this.f270343b.call());
            AtomicReference atomicReference = this.f270342a;
            while (!atomicReference.compareAndSet(null, z4Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            z4Var = z4Var2;
            break loop0;
        }
        v4 v4Var = new v4(z4Var, yVar);
        yVar.onSubscribe(v4Var);
        AtomicReference atomicReference2 = z4Var.f270990c;
        loop2: while (true) {
            v4[] v4VarArr = (v4[]) atomicReference2.get();
            if (v4VarArr != z4.f) {
                int length = v4VarArr.length;
                v4[] v4VarArr2 = new v4[length + 1];
                System.arraycopy(v4VarArr, 0, v4VarArr2, 0, length);
                v4VarArr2[length] = v4Var;
                while (!atomicReference2.compareAndSet(v4VarArr, v4VarArr2)) {
                    if (atomicReference2.get() != v4VarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (v4Var.d) {
            z4Var.a(v4Var);
        } else {
            z4Var.f270988a.e(v4Var);
        }
    }
}
