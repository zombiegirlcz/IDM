package z0i;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0017"}, d2 = {"Lz0i/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "compoundId", "d", "orderType", "f", "targetRate", "", "e", "J", "()J", "createdDate", "g", "updatedDate", "state", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    private final String compoundId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderType")
    @NotNull
    private final String orderType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("targetRate")
    @NotNull
    private final String targetRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.compoundId, cVar.compoundId) && Intrinsics.f(this.orderType, cVar.orderType) && Intrinsics.f(this.targetRate, cVar.targetRate) && this.createdDate == cVar.createdDate && this.updatedDate == cVar.updatedDate && Intrinsics.f(this.state, cVar.state);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTargetRate() {
        return this.targetRate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.compoundId;
        return this.state.hashCode() + a0.d.c(a0.d.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderType), 31, this.targetRate), 31, this.createdDate), 31, this.updatedDate);
    }
}
