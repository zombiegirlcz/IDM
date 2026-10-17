package auc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lauc/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLimitName", "limitName", "", "b", "J", "getUpperBound", "()J", "upperBound", "", "c", "Z", "getJointAccount", "()Z", "jointAccount", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("limitName")
    @NotNull
    private final String limitName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upperBound")
    private final long upperBound;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("jointAccount")
    private final boolean jointAccount;

    public m(String limitName, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(limitName, "limitName");
        this.limitName = limitName;
        this.upperBound = j2;
        this.jointAccount = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.limitName, mVar.limitName) && this.upperBound == mVar.upperBound && this.jointAccount == mVar.jointAccount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.jointAccount) + a0.d.c(this.limitName.hashCode() * 31, 31, this.upperBound);
    }
}
