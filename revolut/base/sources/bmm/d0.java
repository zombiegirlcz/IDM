package bmm;

import java.net.SocketTimeoutException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 extends mmm.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f16898n;

    public d0(e0 e0Var) {
        this.f16898n = e0Var;
    }

    @Override // mmm.f
    public final void l() {
        this.f16898n.e(b.CANCEL);
        u uVar = this.f16898n.f16905b;
        synchronized (uVar) {
            long j2 = uVar.o;
            long j3 = uVar.f16969n;
            if (j2 < j3) {
                return;
            }
            uVar.f16969n = j3 + 1;
            uVar.f16970p = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.f186387a;
            xlm.b.c(uVar.f16965h, v0.a.i(new StringBuilder(), uVar.f16963c, " ping"), 0L, new bc1.b(uVar, 15), 6);
        }
    }

    public final void m() {
        if (k()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
