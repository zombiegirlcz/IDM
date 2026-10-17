package h3k;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001b"}, d2 = {"Lh3k/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "g", "transferVendor", "c", "d", "localisedName", "estimate", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "intermediaryFees", "", "Lh3k/g;", "f", "Ljava/util/List;", "()Ljava/util/List;", "plans", "supportedStraightThroughMethods", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferVendor")
    private final String transferVendor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("localisedName")
    private final String localisedName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("estimate")
    @NotNull
    private final String estimate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("intermediaryFees")
    private final Boolean intermediaryFees;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("plans")
    private final List<g> plans;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportedThroughTransferFundings")
    private final List<String> supportedStraightThroughMethods;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEstimate() {
        return this.estimate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getIntermediaryFees() {
        return this.intermediaryFees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocalisedName() {
        return this.localisedName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getPlans() {
        return this.plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.id, pVar.id) && Intrinsics.f(this.transferVendor, pVar.transferVendor) && Intrinsics.f(this.localisedName, pVar.localisedName) && Intrinsics.f(this.estimate, pVar.estimate) && Intrinsics.f(this.intermediaryFees, pVar.intermediaryFees) && Intrinsics.f(this.plans, pVar.plans) && Intrinsics.f(this.supportedStraightThroughMethods, pVar.supportedStraightThroughMethods);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getSupportedStraightThroughMethods() {
        return this.supportedStraightThroughMethods;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTransferVendor() {
        return this.transferVendor;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.transferVendor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localisedName;
        int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.estimate);
        Boolean bool = this.intermediaryFees;
        int iHashCode3 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        List<g> list = this.plans;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportedStraightThroughMethods;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }
}
