package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class r4 implements ObservableSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f263126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4 f263127b;

    public r4(AtomicReference atomicReference, l4 l4Var) {
        this.f263126a = atomicReference;
        this.f263127b = l4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(fgm.l lVar) {
        q4 q4Var;
        loop0: while (true) {
            q4Var = (q4) this.f263126a.get();
            if (q4Var != null) {
                break;
            }
            q4 q4Var2 = new q4(this.f263127b.call(), this.f263126a);
            AtomicReference atomicReference = this.f263126a;
            while (!atomicReference.compareAndSet(null, q4Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            q4Var = q4Var2;
            break loop0;
        }
        m4 m4Var = new m4(q4Var, lVar);
        lVar.onSubscribe(m4Var);
        AtomicReference atomicReference2 = q4Var.f263105c;
        loop2: while (true) {
            m4[] m4VarArr = (m4[]) atomicReference2.get();
            if (m4VarArr != q4.f263102g) {
                int length = m4VarArr.length;
                m4[] m4VarArr2 = new m4[length + 1];
                System.arraycopy(m4VarArr, 0, m4VarArr2, 0, length);
                m4VarArr2[length] = m4Var;
                while (!atomicReference2.compareAndSet(m4VarArr, m4VarArr2)) {
                    if (atomicReference2.get() != m4VarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (m4Var.d) {
            q4Var.a(m4Var);
        } else {
            q4Var.f263103a.c(m4Var);
        }
    }
}
