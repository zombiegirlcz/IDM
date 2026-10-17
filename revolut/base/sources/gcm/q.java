package gcm;

import com.google.common.base.Preconditions;
import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends ecm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f142830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6 f142831b;

    public q(t tVar, g6 g6Var) {
        this.f142830a = (t) Preconditions.checkNotNull(tVar, "tracer");
        this.f142831b = (g6) Preconditions.checkNotNull(g6Var, "time");
    }

    public static Level d(ecm.f fVar) {
        int i = p.f142801a[fVar.ordinal()];
        return (i == 1 || i == 2) ? Level.FINE : i != 3 ? Level.FINEST : Level.FINER;
    }

    @Override // ecm.g
    public final void a(ecm.f fVar, String str) {
        t tVar = this.f142830a;
        ecm.n0 n0Var = tVar.f142875b;
        Level levelD = d(fVar);
        if (t.f142873c.isLoggable(levelD)) {
            t.a(n0Var, levelD, str);
        }
        if (!c(fVar) || fVar == ecm.f.DEBUG) {
            return;
        }
        int i = p.f142801a[fVar.ordinal()];
        ecm.g0 g0Var = i != 1 ? i != 2 ? ecm.g0.CT_INFO : ecm.g0.CT_WARNING : ecm.g0.CT_ERROR;
        long jA = this.f142831b.a();
        Long lValueOf = Long.valueOf(jA);
        Preconditions.checkNotNull(str, "description");
        Preconditions.checkNotNull(g0Var, "severity");
        Preconditions.checkNotNull(lValueOf, "timestampNanos");
        Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
        new ecm.h0(str, g0Var, jA, null);
        synchronized (tVar.f142874a) {
        }
    }

    @Override // ecm.g
    public final void b(ecm.f fVar, String str, Object... objArr) {
        a(fVar, (c(fVar) || t.f142873c.isLoggable(d(fVar))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean c(ecm.f fVar) {
        if (fVar == ecm.f.DEBUG) {
            return false;
        }
        synchronized (this.f142830a.f142874a) {
        }
        return false;
    }
}
