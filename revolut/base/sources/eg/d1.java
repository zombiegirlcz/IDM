package eg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f125421c;
    public final long d;
    public final k e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f125422g;

    public d1(String sessionId, String firstSessionId, int i, long j2, k dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f125419a = sessionId;
        this.f125420b = firstSessionId;
        this.f125421c = i;
        this.d = j2;
        this.e = dataCollectionStatus;
        this.f = firebaseInstallationId;
        this.f125422g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f125419a, d1Var.f125419a) && Intrinsics.f(this.f125420b, d1Var.f125420b) && this.f125421c == d1Var.f125421c && this.d == d1Var.d && Intrinsics.f(this.e, d1Var.e) && Intrinsics.f(this.f, d1Var.f) && Intrinsics.f(this.f125422g, d1Var.f125422g);
    }

    public final int hashCode() {
        return this.f125422g.hashCode() + p.a.c((this.e.hashCode() + a0.d.c(j6.a.b(this.f125421c, p.a.c(this.f125419a.hashCode() * 31, 31, this.f125420b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("SessionInfo(sessionId=");
        sb6.append(this.f125419a);
        sb6.append(", firstSessionId=");
        sb6.append(this.f125420b);
        sb6.append(", sessionIndex=");
        sb6.append(this.f125421c);
        sb6.append(", eventTimestampUs=");
        sb6.append(this.d);
        sb6.append(", dataCollectionStatus=");
        sb6.append(this.e);
        sb6.append(", firebaseInstallationId=");
        sb6.append(this.f);
        sb6.append(", firebaseAuthenticationToken=");
        return j6.a.u(sb6, this.f125422g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
