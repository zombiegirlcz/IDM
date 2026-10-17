package nwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lnwj/b0;", "Lnwj/f1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "juniorGraduationPreselectedCountry", "", "b", "Z", "()Z", "supportsResubmission", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("juniorGraduationPreselectedCountry")
    private final String juniorGraduationPreselectedCountry = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportsResubmission")
    private final boolean supportsResubmission = false;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getJuniorGraduationPreselectedCountry() {
        return this.juniorGraduationPreselectedCountry;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSupportsResubmission() {
        return this.supportsResubmission;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.juniorGraduationPreselectedCountry, b0Var.juniorGraduationPreselectedCountry) && this.supportsResubmission == b0Var.supportsResubmission;
    }

    public final int hashCode() {
        String str = this.juniorGraduationPreselectedCountry;
        return Boolean.hashCode(this.supportsResubmission) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
