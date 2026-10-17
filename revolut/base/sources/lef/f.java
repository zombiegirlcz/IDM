package lef;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\""}, d2 = {"Llef/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "id", "b", "f", "description", "Llef/d;", "c", "Llef/d;", "()Llef/d;", "amount", "", "d", "J", "e", "()J", "createdDate", "i", "iconUrl", "h", "icon", "g", "k", "transactionMethod", "device", "card", "category", "address", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final d amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("iconUrl")
    private final String iconUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("icon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionMethod")
    @NotNull
    private final String transactionMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("device")
    private final String device;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("card")
    @NotNull
    private final String card;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("address")
    private final String address;

    public f(String id10, String description, d amount, long j2, String str, String icon, String transactionMethod, String str2, String card, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(transactionMethod, "transactionMethod");
        Intrinsics.checkNotNullParameter(card, "card");
        this.id = id10;
        this.description = description;
        this.amount = amount;
        this.createdDate = j2;
        this.iconUrl = str;
        this.icon = icon;
        this.transactionMethod = transactionMethod;
        this.device = str2;
        this.card = card;
        this.category = str3;
        this.address = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.amount, fVar.amount) && this.createdDate == fVar.createdDate && Intrinsics.f(this.iconUrl, fVar.iconUrl) && Intrinsics.f(this.icon, fVar.icon) && Intrinsics.f(this.transactionMethod, fVar.transactionMethod) && Intrinsics.f(this.device, fVar.device) && Intrinsics.f(this.card, fVar.card) && Intrinsics.f(this.category, fVar.category) && Intrinsics.f(this.address, fVar.address);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final int hashCode() {
        int iC = a0.d.c((this.amount.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.description)) * 31, 31, this.createdDate);
        String str = this.iconUrl;
        int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon), 31, this.transactionMethod);
        String str2 = this.device;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.card);
        String str3 = this.category;
        int iHashCode = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        return iHashCode + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTransactionMethod() {
        return this.transactionMethod;
    }
}
