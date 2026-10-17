package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes22.dex */
public final class t2 extends ecm.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.v0 f142881a;

    public t2(Throwable th10) {
        ecm.g2 g2VarF = ecm.g2.f124806l.g("Panic! This is a bug!").f(th10);
        ecm.v0 v0Var = ecm.v0.e;
        Preconditions.checkArgument(!g2VarF.e(), "drop status shouldn't be OK");
        this.f142881a = new ecm.v0(null, null, g2VarF, true);
    }

    @Override // ecm.y0
    public final ecm.v0 a(q4 q4Var) {
        return this.f142881a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Class<?>) t2.class).add("panicPickResult", this.f142881a).toString();
    }
}
