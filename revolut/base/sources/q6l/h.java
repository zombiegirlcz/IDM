package q6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010#\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001a\u00102\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010F\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010L\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010R\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010X\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010^\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\u0004¨\u0006b"}, d2 = {"Lq6l/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getWalletId", "walletId", "Lno3/b;", "b", "Lno3/b;", "getAddress", "()Lno3/b;", "address", "c", "getBrand", "brand", "d", "getPin", "pin", "e", "getDeliveryMethod", "deliveryMethod", "f", "getDesign", "design", "g", "getReplaceableCardId", "replaceableCardId", "", "h", "Z", "getAllowPreorder", "()Z", "allowPreorder", "i", "getPreorderedPlanId", "preorderedPlanId", "Lq6l/g;", "j", "Lq6l/g;", "getCustomisation", "()Lq6l/g;", "customisation", "k", "getCardHolderName", "cardHolderName", "l", "getChargePersonalWallet", "chargePersonalWallet", "m", "getJuniorCardRequestId", "juniorCardRequestId", "n", "getSubProductType", "subProductType", "o", "getCardProfileId", "cardProfileId", "Lq6l/i;", "p", "Lq6l/i;", "getDeliveryAttributes", "()Lq6l/i;", "deliveryAttributes", "q", "Ljava/lang/Boolean;", "getNumberless", "()Ljava/lang/Boolean;", "numberless", "Lq6l/j;", "r", "Lq6l/j;", "getPocketConfig", "()Lq6l/j;", "pocketConfig", "", "s", "Ljava/lang/Long;", "getPointsToRedeem", "()Ljava/lang/Long;", "pointsToRedeem", "Ljo3/a;", "t", "Ljo3/a;", "getDiscountFiatEquivalent", "()Ljo3/a;", "discountFiatEquivalent", "Lq6l/n;", "u", "Lq6l/n;", "getRecipient", "()Lq6l/n;", "recipient", "v", "getTokenId", "tokenId", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    private final String walletId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    @NotNull
    private final no3.b address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pin")
    @NotNull
    private final String pin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("deliveryMethod")
    @NotNull
    private final String deliveryMethod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("design")
    @NotNull
    private final String design;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("replaceableCardId")
    private final String replaceableCardId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowPreorder")
    private final boolean allowPreorder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("preorderedPlanId")
    private final String preorderedPlanId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("customisation")
    private final g customisation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cardHolderName")
    private final String cardHolderName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("chargePersonalWallet")
    private final boolean chargePersonalWallet;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("youthCardRequestId")
    private final String juniorCardRequestId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryAttributes")
    private final i deliveryAttributes;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberless")
    private final Boolean numberless;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketConfig")
    private final j pocketConfig;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsToRedeem")
    private final Long pointsToRedeem;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountFiatEquivalent")
    private final jo3.a discountFiatEquivalent;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("recipient")
    private final n recipient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("tokenId")
    private final String tokenId;

    public h(String str, no3.b address, String brand, String pin, String deliveryMethod, String design, String str2, boolean z, String str3, g gVar, String str4, boolean z3, String str5, String str6, String str7, i iVar, Boolean bool, j jVar, Long l2, jo3.a aVar, n nVar, String str8) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
        Intrinsics.checkNotNullParameter(design, "design");
        this.walletId = str;
        this.address = address;
        this.brand = brand;
        this.pin = pin;
        this.deliveryMethod = deliveryMethod;
        this.design = design;
        this.replaceableCardId = str2;
        this.allowPreorder = z;
        this.preorderedPlanId = str3;
        this.customisation = gVar;
        this.cardHolderName = str4;
        this.chargePersonalWallet = z3;
        this.juniorCardRequestId = str5;
        this.subProductType = str6;
        this.cardProfileId = str7;
        this.deliveryAttributes = iVar;
        this.numberless = bool;
        this.pocketConfig = jVar;
        this.pointsToRedeem = l2;
        this.discountFiatEquivalent = aVar;
        this.recipient = nVar;
        this.tokenId = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.walletId, hVar.walletId) && Intrinsics.f(this.address, hVar.address) && Intrinsics.f(this.brand, hVar.brand) && Intrinsics.f(this.pin, hVar.pin) && Intrinsics.f(this.deliveryMethod, hVar.deliveryMethod) && Intrinsics.f(this.design, hVar.design) && Intrinsics.f(this.replaceableCardId, hVar.replaceableCardId) && this.allowPreorder == hVar.allowPreorder && Intrinsics.f(this.preorderedPlanId, hVar.preorderedPlanId) && Intrinsics.f(this.customisation, hVar.customisation) && Intrinsics.f(this.cardHolderName, hVar.cardHolderName) && this.chargePersonalWallet == hVar.chargePersonalWallet && Intrinsics.f(this.juniorCardRequestId, hVar.juniorCardRequestId) && Intrinsics.f(this.subProductType, hVar.subProductType) && Intrinsics.f(this.cardProfileId, hVar.cardProfileId) && Intrinsics.f(this.deliveryAttributes, hVar.deliveryAttributes) && Intrinsics.f(this.numberless, hVar.numberless) && Intrinsics.f(this.pocketConfig, hVar.pocketConfig) && Intrinsics.f(this.pointsToRedeem, hVar.pointsToRedeem) && Intrinsics.f(this.discountFiatEquivalent, hVar.discountFiatEquivalent) && Intrinsics.f(this.recipient, hVar.recipient) && Intrinsics.f(this.tokenId, hVar.tokenId);
    }

    public final int hashCode() {
        String str = this.walletId;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((this.address.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.brand), 31, this.pin), 31, this.deliveryMethod), 31, this.design);
        String str2 = this.replaceableCardId;
        int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.allowPreorder);
        String str3 = this.preorderedPlanId;
        int iHashCode = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.customisation;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str4 = this.cardHolderName;
        int iC3 = j6.a.c((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.chargePersonalWallet);
        String str5 = this.juniorCardRequestId;
        int iHashCode3 = (iC3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subProductType;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardProfileId;
        int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        i iVar = this.deliveryAttributes;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Boolean bool = this.numberless;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        j jVar = this.pocketConfig;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Long l2 = this.pointsToRedeem;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        jo3.a aVar = this.discountFiatEquivalent;
        int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        n nVar = this.recipient;
        int iHashCode11 = (iHashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str8 = this.tokenId;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }
}
