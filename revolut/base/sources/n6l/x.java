package n6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Ln6l/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "lockReason", "b", "d", "unlockHint", "c", "productId", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "price", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockReason")
    private final String lockReason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlockHint")
    private final String unlockHint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("productId")
    private final String productId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("price")
    private final jo3.a price;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLockReason() {
        return this.lockReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUnlockHint() {
        return this.unlockHint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.lockReason, xVar.lockReason) && Intrinsics.f(this.unlockHint, xVar.unlockHint) && Intrinsics.f(this.productId, xVar.productId) && Intrinsics.f(this.price, xVar.price);
    }

    public final int hashCode() {
        String str = this.lockReason;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unlockHint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.a aVar = this.price;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
