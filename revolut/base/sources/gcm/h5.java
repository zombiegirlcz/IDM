package gcm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class h5 extends ecm.n {
    public final m5 e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x2 f142675g;

    public h5(x2 x2Var, m5 m5Var) {
        this.f142675g = x2Var;
        this.e = m5Var;
    }

    @Override // ecm.e0
    public final void m(long j2) {
        if (this.f142675g.o.f != null) {
            return;
        }
        synchronized (this.f142675g.i) {
            try {
                if (this.f142675g.o.f == null) {
                    m5 m5Var = this.e;
                    if (!m5Var.f142774b) {
                        long j3 = this.f + j2;
                        this.f = j3;
                        x2 x2Var = this.f142675g;
                        long j5 = x2Var.f142953t;
                        if (j3 <= j5) {
                            return;
                        }
                        if (j3 > x2Var.k) {
                            m5Var.f142775c = true;
                        } else {
                            long jAddAndGet = ((AtomicLong) x2Var.f142945j.f124861b).addAndGet(j3 - j5);
                            x2 x2Var2 = this.f142675g;
                            x2Var2.f142953t = this.f;
                            if (jAddAndGet > x2Var2.f142946l) {
                                this.e.f142775c = true;
                            }
                        }
                        m5 m5Var2 = this.e;
                        z4 z4VarM = m5Var2.f142775c ? this.f142675g.m(m5Var2) : null;
                        if (z4VarM != null) {
                            z4VarM.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
