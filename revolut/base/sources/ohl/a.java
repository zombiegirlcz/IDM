package ohl;

import a0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\f\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u001a\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010&\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u000f\u0010\u001e¨\u0006'"}, d2 = {"Lohl/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "j", "symbol", "c", "h", "ref", "d", "i", "side", "e", "k", "type", "", "J", "l", "()J", "updatedDate", "g", "completedDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "", "F", "()F", "quantity", "fees", "commission", "executedPrice", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    private final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedDate")
    private final long completedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("quantity")
    private final float quantity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final jo3.a fees;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("commission")
    private final jo3.a commission;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final jo3.a executedPrice;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getCommission() {
        return this.commission;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCompletedDate() {
        return this.completedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getFees() {
        return this.fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.symbol, aVar.symbol) && Intrinsics.f(this.ref, aVar.ref) && Intrinsics.f(this.side, aVar.side) && Intrinsics.f(this.type, aVar.type) && this.updatedDate == aVar.updatedDate && this.completedDate == aVar.completedDate && Intrinsics.f(this.amount, aVar.amount) && Float.compare(this.quantity, aVar.quantity) == 0 && Intrinsics.f(this.fees, aVar.fees) && Intrinsics.f(this.commission, aVar.commission) && Intrinsics.f(this.executedPrice, aVar.executedPrice);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ref;
        int iB = m72.b.b(this.quantity, v7.j(this.amount, d.c(d.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.side), 31, this.type), 31, this.updatedDate), 31, this.completedDate), 31), 31);
        jo3.a aVar = this.fees;
        int iHashCode3 = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.commission;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.executedPrice;
        return iHashCode4 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }
}
