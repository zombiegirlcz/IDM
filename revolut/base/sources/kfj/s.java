package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkfj/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "subscriptionId", "b", "portingId", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "topupAmount", "mobilePlanId", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionId")
    private final String subscriptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("portingId")
    private final String portingId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupAmount")
    private final jo3.a topupAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("mobilePlanId")
    private final String mobilePlanId;

    public s(String str, String str2, String str3, jo3.a aVar) {
        this.subscriptionId = str;
        this.portingId = str2;
        this.topupAmount = aVar;
        this.mobilePlanId = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMobilePlanId() {
        return this.mobilePlanId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPortingId() {
        return this.portingId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getTopupAmount() {
        return this.topupAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.subscriptionId, sVar.subscriptionId) && Intrinsics.f(this.portingId, sVar.portingId) && Intrinsics.f(this.topupAmount, sVar.topupAmount) && Intrinsics.f(this.mobilePlanId, sVar.mobilePlanId);
    }

    public final int hashCode() {
        String str = this.subscriptionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.portingId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.topupAmount;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.mobilePlanId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
