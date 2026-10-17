package zt1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\t\u0010 R\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\r\u0010 R\u001a\u0010$\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b#\u0010\u0004¨\u0006&"}, d2 = {"Lzt1/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "j", "paymentType", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "amount", "Lzt1/k$a;", "d", "Lzt1/k$a;", "e", "()Lzt1/k$a;", "chargesDto", "Lzt1/d;", "Lzt1/d;", "h", "()Lzt1/d;", "merchant", "f", "category", "", "J", "()J", "authorizationValidFrom", "authorizationValidTo", "i", "createdAt", "origin", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentType")
    @NotNull
    private final String paymentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("charges")
    private final a chargesDto;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final d merchant;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorizationValidFrom")
    private final long authorizationValidFrom;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorizationValidTo")
    private final long authorizationValidTo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    @NotNull
    private final String origin;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lzt1/k$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "total", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        @NotNull
        private final jo3.a total;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.total, ((a) obj2).total);
        }

        public final int hashCode() {
            return this.total.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAuthorizationValidFrom() {
        return this.authorizationValidFrom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAuthorizationValidTo() {
        return this.authorizationValidTo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getChargesDto() {
        return this.chargesDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.paymentType, kVar.paymentType) && Intrinsics.f(this.amount, kVar.amount) && Intrinsics.f(this.chargesDto, kVar.chargesDto) && Intrinsics.f(this.merchant, kVar.merchant) && Intrinsics.f(this.category, kVar.category) && this.authorizationValidFrom == kVar.authorizationValidFrom && this.authorizationValidTo == kVar.authorizationValidTo && this.createdAt == kVar.createdAt && Intrinsics.f(this.origin, kVar.origin);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d getMerchant() {
        return this.merchant;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.c(this.id.hashCode() * 31, 31, this.paymentType), 31);
        a aVar = this.chargesDto;
        return this.origin.hashCode() + a0.d.c(a0.d.c(a0.d.c(p.a.c((this.merchant.hashCode() + ((iJ + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.category), 31, this.authorizationValidFrom), 31, this.authorizationValidTo), 31, this.createdAt);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }
}
