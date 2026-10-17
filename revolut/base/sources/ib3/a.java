package ib3;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\""}, d2 = {"Lib3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "Lorg/joda/time/DateTime;", "b", "Lorg/joda/time/DateTime;", "e", "()Lorg/joda/time/DateTime;", "expiresAt", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "amount", "d", "f", "fee", "Lhb3/b;", "Lhb3/b;", "()Lhb3/b;", "barcode", "Lhb3/a;", "Lhb3/a;", "()Lhb3/a;", "disclaimer", "h", "storeId", "createdAt", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("group_id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("expires_at")
    @NotNull
    private final DateTime expiresAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("fee")
    @NotNull
    private final jo3.a fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("barcode")
    @NotNull
    private final hb3.b barcode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("disclaimer")
    @NotNull
    private final hb3.a disclaimer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("store_id")
    private final String storeId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("createdAt")
    private final DateTime createdAt;

    public a(String id10, DateTime expiresAt, jo3.a amount, jo3.a fee2, hb3.b barcode, hb3.a disclaimer, String str, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.id = id10;
        this.expiresAt = expiresAt;
        this.amount = amount;
        this.fee = fee2;
        this.barcode = barcode;
        this.disclaimer = disclaimer;
        this.storeId = str;
        this.createdAt = dateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hb3.b getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hb3.a getDisclaimer() {
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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.expiresAt, aVar.expiresAt) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.fee, aVar.fee) && Intrinsics.f(this.barcode, aVar.barcode) && Intrinsics.f(this.disclaimer, aVar.disclaimer) && Intrinsics.f(this.storeId, aVar.storeId) && Intrinsics.f(this.createdAt, aVar.createdAt);
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
        int iHashCode = (this.disclaimer.hashCode() + ((this.barcode.hashCode() + v7.j(this.fee, v7.j(this.amount, m72.b.f(this.expiresAt, this.id.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        String str = this.storeId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        return iHashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }
}
