package tbj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\u0012\u0010!¨\u0006#"}, d2 = {"Ltbj/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "groupId", "b", "g", "state", "Ltbj/f;", "Ltbj/f;", "e", "()Ltbj/f;", "returnDetails", "", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "returnReasons", "Ltbj/d;", "Ltbj/d;", "()Ltbj/d;", "blockchainDetails", "Lcl5/a;", "Lcl5/a;", "()Lcl5/a;", "counterparty", "Ltbj/a;", "Ltbj/a;", "()Ltbj/a;", "requiredFields", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupId")
    @NotNull
    private final String groupId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("returnDetails")
    private final f returnDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("returnReasons")
    private final List<String> returnReasons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("blockchainDetails")
    private final d blockchainDetails;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("counterparty")
    private final cl5.a counterparty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiredFields")
    private final a requiredFields;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getBlockchainDetails() {
        return this.blockchainDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final cl5.a getCounterparty() {
        return this.counterparty;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getRequiredFields() {
        return this.requiredFields;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getReturnDetails() {
        return this.returnDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.groupId, bVar.groupId) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.returnDetails, bVar.returnDetails) && Intrinsics.f(this.returnReasons, bVar.returnReasons) && Intrinsics.f(this.blockchainDetails, bVar.blockchainDetails) && Intrinsics.f(this.counterparty, bVar.counterparty) && Intrinsics.f(this.requiredFields, bVar.requiredFields);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getReturnReasons() {
        return this.returnReasons;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = this.groupId.hashCode() * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.returnDetails;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List<String> list = this.returnReasons;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        d dVar = this.blockchainDetails;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        cl5.a aVar = this.counterparty;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.requiredFields;
        return iHashCode6 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
