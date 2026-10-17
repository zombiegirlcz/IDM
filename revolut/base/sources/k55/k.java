package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0016"}, d2 = {"Lk55/k;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "hasFeature", "b", "c", "hasEntryPoint", "Ljava/lang/String;", "e", "topicKey", "Lk55/o;", "Lk55/o;", "()Lk55/o;", "debtAdviceDescription", "actionDeeplink", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasFeature")
    private final Boolean hasFeature;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasEntryPoint")
    private final Boolean hasEntryPoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topicKey")
    private final String topicKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("debtAdviceDescription")
    private final o debtAdviceDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actionDeeplink")
    private final String actionDeeplink;

    public k(Boolean bool, Boolean bool2, String str, o oVar, String str2) {
        this.hasFeature = bool;
        this.hasEntryPoint = bool2;
        this.topicKey = str;
        this.debtAdviceDescription = oVar;
        this.actionDeeplink = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionDeeplink() {
        return this.actionDeeplink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o getDebtAdviceDescription() {
        return this.debtAdviceDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getHasEntryPoint() {
        return this.hasEntryPoint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getHasFeature() {
        return this.hasFeature;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTopicKey() {
        return this.topicKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.hasFeature, kVar.hasFeature) && Intrinsics.f(this.hasEntryPoint, kVar.hasEntryPoint) && Intrinsics.f(this.topicKey, kVar.topicKey) && Intrinsics.f(this.debtAdviceDescription, kVar.debtAdviceDescription) && Intrinsics.f(this.actionDeeplink, kVar.actionDeeplink);
    }

    public final int hashCode() {
        Boolean bool = this.hasFeature;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasEntryPoint;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.topicKey;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.debtAdviceDescription;
        int iHashCode4 = (iHashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str2 = this.actionDeeplink;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
