package ro3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006$"}, d2 = {"Lro3/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "g", "state", "c", "baseCurrency", "", "Lro3/e;", "d", "Ljava/util/List;", "()Ljava/util/List;", "pockets", "e", "ownerId", "Lro3/i;", "f", "sharedPockets", "ref", "", "h", "J", "j", "()J", "totalTopup", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "topupLimit", "topupResetDate", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseCurrency")
    @NotNull
    private final String baseCurrency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pockets")
    @NotNull
    private final List<e> pockets;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ownerId")
    private final String ownerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("sharedPockets")
    private final List<i> sharedPockets;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTopup")
    private final long totalTopup;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("topupLimit")
    private final Long topupLimit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupResetDate")
    private final Long topupResetDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPockets() {
        return this.pockets;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.state, kVar.state) && Intrinsics.f(this.baseCurrency, kVar.baseCurrency) && Intrinsics.f(this.pockets, kVar.pockets) && Intrinsics.f(this.ownerId, kVar.ownerId) && Intrinsics.f(this.sharedPockets, kVar.sharedPockets) && Intrinsics.f(this.ref, kVar.ref) && this.totalTopup == kVar.totalTopup && Intrinsics.f(this.topupLimit, kVar.topupLimit) && Intrinsics.f(this.topupResetDate, kVar.topupResetDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getSharedPockets() {
        return this.sharedPockets;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getTopupLimit() {
        return this.topupLimit;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.baseCurrency), 31, this.pockets);
        String str = this.ownerId;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        List<i> list = this.sharedPockets;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.ref;
        int iC = a0.d.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.totalTopup);
        Long l2 = this.topupLimit;
        int iHashCode3 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.topupResetDate;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getTopupResetDate() {
        return this.topupResetDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getTotalTopup() {
        return this.totalTopup;
    }
}
