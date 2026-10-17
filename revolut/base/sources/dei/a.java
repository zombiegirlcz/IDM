package dei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113467a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f113467a, ((a) obj2).f113467a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f113467a.hashCode();
    }

    public final String toString() {
        return p.a.p("SeonBehaviouralMonitoringToken(value=", this.f113467a, ")");
    }
}
