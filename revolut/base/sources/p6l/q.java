package p6l;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010/\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001a\u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0013\u001a\u0004\b8\u0010\u0015R\u001c\u0010;\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b:\u0010\u0015R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0004R\u001a\u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b?\u0010\u0004R\u001a\u0010B\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u000e\u001a\u0004\bA\u0010\u0010R\u001a\u0010C\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b7\u0010\u0010R\u001c\u0010E\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0013\u001a\u0004\b<\u0010\u0015R\u001c\u0010G\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\bF\u0010\u0015R\u001c\u0010I\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\bH\u0010.R\u001c\u0010J\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010,\u001a\u0004\b\u001a\u0010.R\u001a\u0010L\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u000e\u001a\u0004\b \u0010\u0010R\u001c\u0010P\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b\u001c\u0010OR\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\u0004R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u0013\u001a\u0004\b\t\u0010\u0015R\u001c\u0010X\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0013\u001a\u0004\bD\u0010\u0015R\u001a\u0010Z\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\bQ\u0010\u0004R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b\\\u0010\u0004R\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\bU\u0010\u0004R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R(\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010c\u001a\u0004\bd\u0010eR\u001c\u0010g\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010\u0013\u001a\u0004\b2\u0010\u0015R\u001c\u0010i\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010\u0013\u001a\u0004\bW\u0010\u0015R\u001c\u0010j\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010\u0013\u001a\u0004\bY\u0010\u0015R\u001c\u0010k\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b^\u0010\u0004R(\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020l\u0018\u00010b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\bh\u0010eR\u001c\u0010n\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0013\u001a\u0004\bK\u0010\u0015¨\u0006o"}, d2 = {"Lp6l/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "s", "id", "b", "I", "state", "", "c", "Z", "O", "()Z", "virtual", "d", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", "disposable", "e", "k", "design", "f", "color", "g", "u", "label", "Lp6l/e;", "h", "Lp6l/e;", "H", "()Lp6l/e;", "settings", "Lp6l/c;", "i", "Lp6l/c;", "j", "()Lp6l/c;", "delivery", "", "Ljava/lang/Long;", "N", "()Ljava/lang/Long;", "usage", "v", "lastFour", "l", "brand", "m", "q", "expiryDate", "n", "A", "preExpired", "E", "replaced", "p", "J", "stateReason", "P", "walletId", "r", "googlePayEligible", "digitised", "t", "everDigitised", "y", "panActivation", "w", "lastUsedDate", "createdDate", "x", "customised", "Lp6l/o;", "Lp6l/o;", "()Lp6l/o;", "customisation", "z", "F", "replacedCardId", "designGroup", "B", "cardClickActivationEligible", "C", "inAppPinChangeEligible", "D", "cvvStatus", "pinStatus", "K", "subProductType", "G", "productType", "cardName", "cardProfileId", "", "Ljava/util/Map;", "M", "()Ljava/util/Map;", "tokenizationEligibility", "designChangeEligible", "L", "renewable", "renewed", "replacementReason", "Lp6l/z;", "tokenisationEligibilities", "nameless", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("designGroup")
    private final String designGroup;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("cardClickActivationEligible")
    private final Boolean cardClickActivationEligible;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("inAppPinChangeEligible")
    private final Boolean inAppPinChangeEligible;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("cvvStatus")
    @NotNull
    private final String cvvStatus;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("pinStatus")
    private final String pinStatus;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("cardName")
    private final String cardName;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("tokenisationEligibility")
    private final Map<String, Boolean> tokenizationEligibility;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("designChangeEligible")
    private final Boolean designChangeEligible;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("renewable")
    private final Boolean renewable;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("renewed")
    private final Boolean renewed;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("replacementReason")
    private final String replacementReason;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("tokenisationEligibilities")
    private final Map<String, z> tokenisationEligibilities;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("nameless")
    private final Boolean nameless;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("virtual")
    private final boolean virtual;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("disposable")
    private final Boolean disposable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("design")
    @NotNull
    private final String design;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("colour")
    private final String color;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    private final e settings;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("delivery")
    @NotNull
    private final c delivery;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("usage")
    private final Long usage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("lastFour")
    private final String lastFour;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryDate")
    private final String expiryDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("preexpired")
    private final Boolean preExpired;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("replaced")
    private final Boolean replaced;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("stateReason")
    private final String stateReason;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("googlePayEligible")
    private final boolean googlePayEligible;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitised")
    private final boolean digitised;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("everDigitised")
    private final Boolean everDigitised;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("panDeliveryConfirmation")
    private final Boolean panActivation;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("lastUsedDate")
    private final Long lastUsedDate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("customised")
    private final boolean customised;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("customisation")
    private final o customisation;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("replacedCardId")
    private final String replacedCardId;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getPreExpired() {
        return this.preExpired;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getRenewable() {
        return this.renewable;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getRenewed() {
        return this.renewed;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Boolean getReplaced() {
        return this.replaced;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getReplacedCardId() {
        return this.replacedCardId;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getReplacementReason() {
        return this.replacementReason;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final e getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getStateReason() {
        return this.stateReason;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Map getTokenisationEligibilities() {
        return this.tokenisationEligibilities;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Map getTokenizationEligibility() {
        return this.tokenizationEligibility;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Long getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getVirtual() {
        return this.virtual;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCardClickActivationEligible() {
        return this.cardClickActivationEligible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.id, qVar.id) && Intrinsics.f(this.state, qVar.state) && this.virtual == qVar.virtual && Intrinsics.f(this.disposable, qVar.disposable) && Intrinsics.f(this.design, qVar.design) && Intrinsics.f(this.color, qVar.color) && Intrinsics.f(this.label, qVar.label) && Intrinsics.f(this.settings, qVar.settings) && Intrinsics.f(this.delivery, qVar.delivery) && Intrinsics.f(this.usage, qVar.usage) && Intrinsics.f(this.lastFour, qVar.lastFour) && Intrinsics.f(this.brand, qVar.brand) && Intrinsics.f(this.expiryDate, qVar.expiryDate) && Intrinsics.f(this.preExpired, qVar.preExpired) && Intrinsics.f(this.replaced, qVar.replaced) && Intrinsics.f(this.stateReason, qVar.stateReason) && Intrinsics.f(this.walletId, qVar.walletId) && this.googlePayEligible == qVar.googlePayEligible && this.digitised == qVar.digitised && Intrinsics.f(this.everDigitised, qVar.everDigitised) && Intrinsics.f(this.panActivation, qVar.panActivation) && Intrinsics.f(this.lastUsedDate, qVar.lastUsedDate) && Intrinsics.f(this.createdDate, qVar.createdDate) && this.customised == qVar.customised && Intrinsics.f(this.customisation, qVar.customisation) && Intrinsics.f(this.replacedCardId, qVar.replacedCardId) && Intrinsics.f(this.designGroup, qVar.designGroup) && Intrinsics.f(this.cardClickActivationEligible, qVar.cardClickActivationEligible) && Intrinsics.f(this.inAppPinChangeEligible, qVar.inAppPinChangeEligible) && Intrinsics.f(this.cvvStatus, qVar.cvvStatus) && Intrinsics.f(this.pinStatus, qVar.pinStatus) && Intrinsics.f(this.subProductType, qVar.subProductType) && Intrinsics.f(this.productType, qVar.productType) && Intrinsics.f(this.cardName, qVar.cardName) && Intrinsics.f(this.cardProfileId, qVar.cardProfileId) && Intrinsics.f(this.tokenizationEligibility, qVar.tokenizationEligibility) && Intrinsics.f(this.designChangeEligible, qVar.designChangeEligible) && Intrinsics.f(this.renewable, qVar.renewable) && Intrinsics.f(this.renewed, qVar.renewed) && Intrinsics.f(this.replacementReason, qVar.replacementReason) && Intrinsics.f(this.tokenisationEligibilities, qVar.tokenisationEligibilities) && Intrinsics.f(this.nameless, qVar.nameless);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final o getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getCustomised() {
        return this.customised;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.virtual);
        Boolean bool = this.disposable;
        int iC2 = p.a.c((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.design);
        String str = this.color;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e eVar = this.settings;
        int iHashCode3 = (this.delivery.hashCode() + ((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        Long l2 = this.usage;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.lastFour;
        int iC3 = p.a.c((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.brand);
        String str4 = this.expiryDate;
        int iHashCode5 = (iC3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.preExpired;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.replaced;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.stateReason;
        int iC4 = j6.a.c(j6.a.c(p.a.c((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.walletId), 31, this.googlePayEligible), 31, this.digitised);
        Boolean bool4 = this.everDigitised;
        int iHashCode8 = (iC4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.panActivation;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l3 = this.lastUsedDate;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.createdDate;
        int iC5 = j6.a.c((iHashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.customised);
        o oVar = this.customisation;
        int iHashCode11 = (iC5 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str6 = this.replacedCardId;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.designGroup;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool6 = this.cardClickActivationEligible;
        int iHashCode14 = (iHashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.inAppPinChangeEligible;
        int iC6 = p.a.c((iHashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31, 31, this.cvvStatus);
        String str8 = this.pinStatus;
        int iHashCode15 = (iC6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subProductType;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.productType;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cardName;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cardProfileId;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Map<String, Boolean> map = this.tokenizationEligibility;
        int iHashCode20 = (iHashCode19 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool8 = this.designChangeEligible;
        int iHashCode21 = (iHashCode20 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.renewable;
        int iHashCode22 = (iHashCode21 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.renewed;
        int iHashCode23 = (iHashCode22 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str13 = this.replacementReason;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, z> map2 = this.tokenisationEligibilities;
        int iHashCode25 = (iHashCode24 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool11 = this.nameless;
        return iHashCode25 + (bool11 != null ? bool11.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCvvStatus() {
        return this.cvvStatus;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getDelivery() {
        return this.delivery;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getDesign() {
        return this.design;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getDesignChangeEligible() {
        return this.designChangeEligible;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getDesignGroup() {
        return this.designGroup;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getDigitised() {
        return this.digitised;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getDisposable() {
        return this.disposable;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getEverDigitised() {
        return this.everDigitised;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getGooglePayEligible() {
        return this.googlePayEligible;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getInAppPinChangeEligible() {
        return this.inAppPinChangeEligible;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Long getLastUsedDate() {
        return this.lastUsedDate;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getNameless() {
        return this.nameless;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getPanActivation() {
        return this.panActivation;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getPinStatus() {
        return this.pinStatus;
    }
}
