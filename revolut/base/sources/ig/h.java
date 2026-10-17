package ig;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f161052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f161053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f161054c;
    public final Integer d;
    public final Long e;

    public h(Boolean bool, Double d, Integer num, Integer num2, Long l2) {
        this.f161052a = bool;
        this.f161053b = d;
        this.f161054c = num;
        this.d = num2;
        this.e = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f161052a, hVar.f161052a) && Intrinsics.f(this.f161053b, hVar.f161053b) && Intrinsics.f(this.f161054c, hVar.f161054c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.f161052a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f161053b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f161054c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.e;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f161052a + ", sessionSamplingRate=" + this.f161053b + ", sessionRestartTimeout=" + this.f161054c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
