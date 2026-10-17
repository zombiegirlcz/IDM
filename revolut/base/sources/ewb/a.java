package ewb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010'\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b\u0005\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\t\u0010&R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b)\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b5\u0010\u0004¨\u00068"}, d2 = {"Lewb/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "m", "source", "", "c", "J", "k", "()J", "purchaseDate", "d", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "expiryDate", "e", "j", "name", "f", "cardImageUrl", "Lewb/h;", "Lewb/h;", "o", "()Lewb/h;", "termsAndConditions", "description", "i", "instructions", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "amount", "availableAmount", "l", "n", "state", "Lewb/b;", "Lewb/b;", "()Lewb/b;", "redemption", "brandId", "brandUrl", "p", "r", "voucherBarcodeFormat", "q", "voucherBarcodeAlgorithm", "voucherBarcodeBgColor", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseDate")
    private final long purchaseDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiryDate")
    private final Long expiryDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cardImageUrl")
    @NotNull
    private final String cardImageUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsAndConditions")
    @NotNull
    private final h termsAndConditions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("instructions")
    @NotNull
    private final String instructions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.b amount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("availableAmount")
    private final jo3.b availableAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("redemption")
    private final b redemption;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("brandId")
    private final String brandId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("brandUrl")
    private final String brandUrl;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("voucherBarcodeFormat")
    private final String voucherBarcodeFormat;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("voucherBarcodeAlgorithm")
    private final String voucherBarcodeAlgorithm;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("voucherBarcodeBgColor")
    private final String voucherBarcodeBgColor;

    public a(String id10, String source, long j2, Long l2, String name, String cardImageUrl, h termsAndConditions, String description, String instructions, jo3.b amount, jo3.b bVar, String state, b bVar2, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cardImageUrl, "cardImageUrl");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.source = source;
        this.purchaseDate = j2;
        this.expiryDate = l2;
        this.name = name;
        this.cardImageUrl = cardImageUrl;
        this.termsAndConditions = termsAndConditions;
        this.description = description;
        this.instructions = instructions;
        this.amount = amount;
        this.availableAmount = bVar;
        this.state = state;
        this.redemption = bVar2;
        this.brandId = str;
        this.brandUrl = str2;
        this.voucherBarcodeFormat = str3;
        this.voucherBarcodeAlgorithm = str4;
        this.voucherBarcodeBgColor = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getAvailableAmount() {
        return this.availableAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBrandUrl() {
        return this.brandUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardImageUrl() {
        return this.cardImageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.source, aVar.source) && this.purchaseDate == aVar.purchaseDate && Intrinsics.f(this.expiryDate, aVar.expiryDate) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.cardImageUrl, aVar.cardImageUrl) && Intrinsics.f(this.termsAndConditions, aVar.termsAndConditions) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.instructions, aVar.instructions) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.availableAmount, aVar.availableAmount) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.redemption, aVar.redemption) && Intrinsics.f(this.brandId, aVar.brandId) && Intrinsics.f(this.brandUrl, aVar.brandUrl) && Intrinsics.f(this.voucherBarcodeFormat, aVar.voucherBarcodeFormat) && Intrinsics.f(this.voucherBarcodeAlgorithm, aVar.voucherBarcodeAlgorithm) && Intrinsics.f(this.voucherBarcodeBgColor, aVar.voucherBarcodeBgColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.source), 31, this.purchaseDate);
        Long l2 = this.expiryDate;
        int iE = y.e(this.amount, p.a.c(p.a.c((this.termsAndConditions.hashCode() + p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.name), 31, this.cardImageUrl)) * 31, 31, this.description), 31, this.instructions), 31);
        jo3.b bVar = this.availableAmount;
        int iC2 = p.a.c((iE + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.state);
        b bVar2 = this.redemption;
        int iHashCode = (iC2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str = this.brandId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brandUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.voucherBarcodeFormat;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voucherBarcodeAlgorithm;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.voucherBarcodeBgColor;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getPurchaseDate() {
        return this.purchaseDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b getRedemption() {
        return this.redemption;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final h getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getVoucherBarcodeAlgorithm() {
        return this.voucherBarcodeAlgorithm;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getVoucherBarcodeBgColor() {
        return this.voucherBarcodeBgColor;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getVoucherBarcodeFormat() {
        return this.voucherBarcodeFormat;
    }
}
