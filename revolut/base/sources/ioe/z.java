package ioe;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, d2 = {"Lioe/z;", "", "", "toString", "()Ljava/lang/String;", "Lioe/a0;", "a", "Lioe/a0;", "b", "()Lioe/a0;", "steps", "", "Lioe/g0;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "userSpecificRules", "Lioe/b;", "countryRules", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    private final a0 steps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("userSpecificRules")
    private final Map<String, g0> userSpecificRules;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryRules")
    private final Map<String, b> countryRules;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getCountryRules() {
        return this.countryRules;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getUserSpecificRules() {
        return this.userSpecificRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.steps, zVar.steps) && Intrinsics.f(this.userSpecificRules, zVar.userSpecificRules) && Intrinsics.f(this.countryRules, zVar.countryRules);
    }

    public final int hashCode() {
        a0 a0Var = this.steps;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        Map<String, g0> map = this.userSpecificRules;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, b> map2 = this.countryRules;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }
}
