package hb3;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b \u0010\u0004¨\u0006\""}, d2 = {"Lhb3/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "Lorg/joda/time/DateTime;", "b", "Lorg/joda/time/DateTime;", "e", "()Lorg/joda/time/DateTime;", "expiresAt", "c", "createdAt", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "amount", "f", "fee", "Lhb3/b;", "Lhb3/b;", "()Lhb3/b;", "barcode", "Lhb3/a;", "Lhb3/a;", "()Lhb3/a;", "disclaimer", "h", "storeId", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("group_id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expires_at")
    @NotNull
    private final DateTime expiresAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("created_at")
    @NotNull
    private final DateTime createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a fee;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("barcode")
    @NotNull
    private final b barcode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    @NotNull
    private final a disclaimer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("store")
    private final String storeId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.expiresAt, iVar.expiresAt) && Intrinsics.f(this.createdAt, iVar.createdAt) && Intrinsics.f(this.amount, iVar.amount) && Intrinsics.f(this.fee, iVar.fee) && Intrinsics.f(this.barcode, iVar.barcode) && Intrinsics.f(this.disclaimer, iVar.disclaimer) && Intrinsics.f(this.storeId, iVar.storeId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    public final int hashCode() {
        int iHashCode = (this.disclaimer.hashCode() + ((this.barcode.hashCode() + v7.j(this.fee, v7.j(this.amount, m72.b.f(this.createdAt, m72.b.f(this.expiresAt, this.id.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31;
        String str = this.storeId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
