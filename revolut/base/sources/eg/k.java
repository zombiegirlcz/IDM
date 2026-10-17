package eg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f125456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f125457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f125458c;

    public k(j performance, j crashlytics, double d) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f125456a = performance;
        this.f125457b = crashlytics;
        this.f125458c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f125456a == kVar.f125456a && this.f125457b == kVar.f125457b && Double.compare(this.f125458c, kVar.f125458c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f125458c) + ((this.f125457b.hashCode() + (this.f125456a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f125456a + ", crashlytics=" + this.f125457b + ", sessionSamplingRate=" + this.f125458c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
