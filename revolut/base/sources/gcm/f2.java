package gcm;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public final class f2 extends ecm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ecm.n0 f142637a;

    @Override // ecm.g
    public final void a(ecm.f fVar, String str) {
        ecm.n0 n0Var = this.f142637a;
        Level levelD = q.d(fVar);
        if (t.f142873c.isLoggable(levelD)) {
            t.a(n0Var, levelD, str);
        }
    }

    @Override // ecm.g
    public final void b(ecm.f fVar, String str, Object... objArr) {
        ecm.n0 n0Var = this.f142637a;
        Level levelD = q.d(fVar);
        if (t.f142873c.isLoggable(levelD)) {
            t.a(n0Var, levelD, MessageFormat.format(str, objArr));
        }
    }
}
