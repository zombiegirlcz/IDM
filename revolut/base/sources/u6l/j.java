package u6l;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u001c\u00101\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0017R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001a\u00107\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\u0004R\u001a\u0010:\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010\u0012R\u001c\u0010;\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b8\u0010\u0017R\u001c\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0015\u001a\u0004\b<\u0010\u0017R\u001c\u0010?\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b>\u0010\u0017R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b@\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\b\u001d\u0010DR\u001a\u0010J\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b/\u0010IR\u001c\u0010L\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\bK\u0010 R\u001c\u0010M\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b%\u0010 R\u001a\u0010N\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0010\u001a\u0004\b)\u0010\u0012R\u001c\u0010S\u001a\u0004\u0018\u00010O8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b'\u0010RR\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\bT\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b5\u0010\u0004R\u001c\u0010X\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0015\u001a\u0004\b\f\u0010\u0017R\u001c\u0010Y\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\bG\u0010\u0017R\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\bW\u0010\u0004R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\u0004R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\bZ\u0010\u0004R\u001a\u0010b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R(\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\bg\u0010hR\u001c\u0010j\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b2\u0010\u0017R\u001c\u0010k\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0015\u001a\u0004\b\\\u0010\u0017R\u001c\u0010m\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010\u0015\u001a\u0004\b^\u0010\u0017R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bc\u0010\u0004R(\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020o\u0018\u00010e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010f\u001a\u0004\bl\u0010hR\u001c\u0010q\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0015\u001a\u0004\bP\u0010\u0017¨\u0006r"}, d2 = {"Lu6l/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "u", "id", "b", "d", "cardCode", "c", "w", "label", "", "Z", "R", "()Z", "isVirtual", "e", "Ljava/lang/Boolean;", "q", "()Ljava/lang/Boolean;", "disposable", "f", "K", "state", "", "g", "Ljava/lang/Long;", "P", "()Ljava/lang/Long;", "usage", "h", "x", "lastFour", "i", "brand", "j", "color", "k", "s", "expiryDate", "l", "H", "replaced", "m", "D", "preExpired", "n", "L", "stateReason", "o", "Q", "walletId", "p", "t", "googlePayEligible", "digitised", "r", "everDigitised", "A", "panActivation", "B", "pin", "Lu6l/d;", "Lu6l/d;", "()Lu6l/d;", "cardSettings", "Lu6l/c;", "v", "Lu6l/c;", "()Lu6l/c;", "deliveryStatus", "y", "lastUsedDate", "createdDate", "customised", "Lu6l/a;", "z", "Lu6l/a;", "()Lu6l/a;", "customisation", "I", "replacedCardId", "designGroup", "C", "cardClickActivationEligible", "inAppPinChangeEligible", "E", "cvvStatus", "F", "pinStatus", "G", "M", "subProductType", "productType", "cardName", "J", "cardProfileId", "", "Ljava/util/Map;", "O", "()Ljava/util/Map;", "tokenizationEligibility", "designChangeEligible", "renewable", "N", "renewed", "replacementReason", "Lu6l/o;", "tokenisationEligibilities", "nameless", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("replacedCardId")
    private final String replacedCardId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("designGroup")
    private final String designGroup;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("cardClickActivationEligible")
    private final Boolean cardClickActivationEligible;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("inAppPinChangeEligible")
    private final Boolean inAppPinChangeEligible;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("cvvStatus")
    private final String cvvStatus;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("pinStatus")
    private final String pinStatus;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("cardName")
    @NotNull
    private final String cardName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("tokenizationEligibility")
    private final Map<String, Boolean> tokenizationEligibility;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("designChangeEligible")
    private final Boolean designChangeEligible;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("renewable")
    private final Boolean renewable;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("renewed")
    private final Boolean renewed;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("replacementReason")
    private final String replacementReason;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("tokenisationEligibilities")
    private final Map<String, o> tokenisationEligibilities;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @lg.b("nameless")
    private final Boolean nameless;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardCode")
    @NotNull
    private final String cardCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("isVirtual")
    private final boolean isVirtual;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("disposable")
    private final Boolean disposable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("usage")
    private final Long usage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    private final String lastFour;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("colour")
    private final String color;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("expiryDate")
    private final String expiryDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("replaced")
    private final Boolean replaced;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("preExpired")
    private final Boolean preExpired;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("stateReason")
    private final String stateReason;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("googlePayEligible")
    private final boolean googlePayEligible;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitised")
    private final Boolean digitised;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("everDigitised")
    private final Boolean everDigitised;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("panActivation")
    private final Boolean panActivation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("pin")
    private final String pin;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("cardSettings")
    private final d cardSettings;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("deliveryStatus")
    @NotNull
    private final c deliveryStatus;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastUsedDate")
    private final Long lastUsedDate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("customised")
    private final boolean customised;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("customisation")
    private final a customisation;

    public j(String id10, String cardCode, String str, boolean z, Boolean bool, String state, Long l2, String str2, String brand, String str3, String str4, Boolean bool2, Boolean bool3, String str5, String walletId, boolean z3, Boolean bool4, Boolean bool5, Boolean bool6, String str6, d dVar, c deliveryStatus, Long l3, Long l4, boolean z4, a aVar, String str7, String str8, Boolean bool7, Boolean bool8, String str9, String str10, String str11, String str12, String cardName, String str13, Map map, Boolean bool9, Boolean bool10, Boolean bool11, String str14, Map map2, Boolean bool12) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        this.id = id10;
        this.cardCode = cardCode;
        this.label = str;
        this.isVirtual = z;
        this.disposable = bool;
        this.state = state;
        this.usage = l2;
        this.lastFour = str2;
        this.brand = brand;
        this.color = str3;
        this.expiryDate = str4;
        this.replaced = bool2;
        this.preExpired = bool3;
        this.stateReason = str5;
        this.walletId = walletId;
        this.googlePayEligible = z3;
        this.digitised = bool4;
        this.everDigitised = bool5;
        this.panActivation = bool6;
        this.pin = str6;
        this.cardSettings = dVar;
        this.deliveryStatus = deliveryStatus;
        this.lastUsedDate = l3;
        this.createdDate = l4;
        this.customised = z4;
        this.customisation = aVar;
        this.replacedCardId = str7;
        this.designGroup = str8;
        this.cardClickActivationEligible = bool7;
        this.inAppPinChangeEligible = bool8;
        this.cvvStatus = str9;
        this.pinStatus = str10;
        this.subProductType = str11;
        this.productType = str12;
        this.cardName = cardName;
        this.cardProfileId = str13;
        this.tokenizationEligibility = map;
        this.designChangeEligible = bool9;
        this.renewable = bool10;
        this.renewed = bool11;
        this.replacementReason = str14;
        this.tokenisationEligibilities = map2;
        this.nameless = bool12;
    }

    public static j a(j jVar, String str, String str2, d dVar, String str3, String str4, int i) {
        Boolean bool;
        String str5;
        Boolean bool2;
        String str6;
        String id10 = jVar.id;
        String cardCode = jVar.cardCode;
        String str7 = (i & 4) != 0 ? jVar.label : str;
        boolean z = jVar.isVirtual;
        Boolean bool3 = jVar.disposable;
        String state = jVar.state;
        Long l2 = jVar.usage;
        String str8 = jVar.lastFour;
        String brand = jVar.brand;
        String str9 = jVar.color;
        String str10 = jVar.expiryDate;
        Boolean bool4 = jVar.replaced;
        Boolean bool5 = jVar.preExpired;
        String str11 = jVar.stateReason;
        String walletId = jVar.walletId;
        String str12 = str7;
        boolean z3 = jVar.googlePayEligible;
        Boolean bool6 = jVar.digitised;
        Boolean bool7 = jVar.everDigitised;
        Boolean bool8 = jVar.panActivation;
        if ((i & 524288) != 0) {
            bool = bool8;
            str5 = jVar.pin;
        } else {
            bool = bool8;
            str5 = str2;
        }
        d dVar2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? jVar.cardSettings : dVar;
        c deliveryStatus = jVar.deliveryStatus;
        Long l3 = jVar.lastUsedDate;
        Long l4 = jVar.createdDate;
        boolean z4 = jVar.customised;
        a aVar = jVar.customisation;
        String str13 = jVar.replacedCardId;
        String str14 = jVar.designGroup;
        Boolean bool9 = jVar.cardClickActivationEligible;
        Boolean bool10 = jVar.inAppPinChangeEligible;
        if ((i & 1073741824) != 0) {
            bool2 = bool10;
            str6 = jVar.cvvStatus;
        } else {
            bool2 = bool10;
            str6 = str3;
        }
        String str15 = (i & Integer.MIN_VALUE) != 0 ? jVar.pinStatus : str4;
        String str16 = jVar.subProductType;
        String str17 = jVar.productType;
        String cardName = jVar.cardName;
        String str18 = jVar.cardProfileId;
        Map<String, Boolean> map = jVar.tokenizationEligibility;
        Boolean bool11 = jVar.designChangeEligible;
        Boolean bool12 = jVar.renewable;
        Boolean bool13 = jVar.renewed;
        String str19 = jVar.replacementReason;
        Map<String, o> map2 = jVar.tokenisationEligibilities;
        Boolean bool14 = jVar.nameless;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        return new j(id10, cardCode, str12, z, bool3, state, l2, str8, brand, str9, str10, bool4, bool5, str11, walletId, z3, bool6, bool7, bool, str5, dVar2, deliveryStatus, l3, l4, z4, aVar, str13, str14, bool9, bool2, str6, str15, str16, str17, cardName, str18, map, bool11, bool12, bool13, str19, map2, bool14);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getPanActivation() {
        return this.panActivation;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getPinStatus() {
        return this.pinStatus;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getPreExpired() {
        return this.preExpired;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getRenewable() {
        return this.renewable;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Boolean getRenewed() {
        return this.renewed;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Boolean getReplaced() {
        return this.replaced;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getReplacedCardId() {
        return this.replacedCardId;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getReplacementReason() {
        return this.replacementReason;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getStateReason() {
        return this.stateReason;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Map getTokenisationEligibilities() {
        return this.tokenisationEligibilities;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Map getTokenizationEligibility() {
        return this.tokenizationEligibility;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Long getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getIsVirtual() {
        return this.isVirtual;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCardClickActivationEligible() {
        return this.cardClickActivationEligible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardCode() {
        return this.cardCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.cardCode, jVar.cardCode) && Intrinsics.f(this.label, jVar.label) && this.isVirtual == jVar.isVirtual && Intrinsics.f(this.disposable, jVar.disposable) && Intrinsics.f(this.state, jVar.state) && Intrinsics.f(this.usage, jVar.usage) && Intrinsics.f(this.lastFour, jVar.lastFour) && Intrinsics.f(this.brand, jVar.brand) && Intrinsics.f(this.color, jVar.color) && Intrinsics.f(this.expiryDate, jVar.expiryDate) && Intrinsics.f(this.replaced, jVar.replaced) && Intrinsics.f(this.preExpired, jVar.preExpired) && Intrinsics.f(this.stateReason, jVar.stateReason) && Intrinsics.f(this.walletId, jVar.walletId) && this.googlePayEligible == jVar.googlePayEligible && Intrinsics.f(this.digitised, jVar.digitised) && Intrinsics.f(this.everDigitised, jVar.everDigitised) && Intrinsics.f(this.panActivation, jVar.panActivation) && Intrinsics.f(this.pin, jVar.pin) && Intrinsics.f(this.cardSettings, jVar.cardSettings) && Intrinsics.f(this.deliveryStatus, jVar.deliveryStatus) && Intrinsics.f(this.lastUsedDate, jVar.lastUsedDate) && Intrinsics.f(this.createdDate, jVar.createdDate) && this.customised == jVar.customised && Intrinsics.f(this.customisation, jVar.customisation) && Intrinsics.f(this.replacedCardId, jVar.replacedCardId) && Intrinsics.f(this.designGroup, jVar.designGroup) && Intrinsics.f(this.cardClickActivationEligible, jVar.cardClickActivationEligible) && Intrinsics.f(this.inAppPinChangeEligible, jVar.inAppPinChangeEligible) && Intrinsics.f(this.cvvStatus, jVar.cvvStatus) && Intrinsics.f(this.pinStatus, jVar.pinStatus) && Intrinsics.f(this.subProductType, jVar.subProductType) && Intrinsics.f(this.productType, jVar.productType) && Intrinsics.f(this.cardName, jVar.cardName) && Intrinsics.f(this.cardProfileId, jVar.cardProfileId) && Intrinsics.f(this.tokenizationEligibility, jVar.tokenizationEligibility) && Intrinsics.f(this.designChangeEligible, jVar.designChangeEligible) && Intrinsics.f(this.renewable, jVar.renewable) && Intrinsics.f(this.renewed, jVar.renewed) && Intrinsics.f(this.replacementReason, jVar.replacementReason) && Intrinsics.f(this.tokenisationEligibilities, jVar.tokenisationEligibilities) && Intrinsics.f(this.nameless, jVar.nameless);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getCardSettings() {
        return this.cardSettings;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.cardCode);
        String str = this.label;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.isVirtual);
        Boolean bool = this.disposable;
        int iC3 = p.a.c((iC2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.state);
        Long l2 = this.usage;
        int iHashCode = (iC3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.lastFour;
        int iC4 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.brand);
        String str3 = this.color;
        int iHashCode2 = (iC4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryDate;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.replaced;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.preExpired;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.stateReason;
        int iC5 = j6.a.c(p.a.c((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.walletId), 31, this.googlePayEligible);
        Boolean bool4 = this.digitised;
        int iHashCode6 = (iC5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.everDigitised;
        int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.panActivation;
        int iHashCode8 = (iHashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str6 = this.pin;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        d dVar = this.cardSettings;
        int iHashCode10 = (this.deliveryStatus.hashCode() + ((iHashCode9 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        Long l3 = this.lastUsedDate;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.createdDate;
        int iC6 = j6.a.c((iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.customised);
        a aVar = this.customisation;
        int iHashCode12 = (iC6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str7 = this.replacedCardId;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.designGroup;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool7 = this.cardClickActivationEligible;
        int iHashCode15 = (iHashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.inAppPinChangeEligible;
        int iHashCode16 = (iHashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str9 = this.cvvStatus;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pinStatus;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subProductType;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productType;
        int iC7 = p.a.c((iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.cardName);
        String str13 = this.cardProfileId;
        int iHashCode20 = (iC7 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Map<String, Boolean> map = this.tokenizationEligibility;
        int iHashCode21 = (iHashCode20 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool9 = this.designChangeEligible;
        int iHashCode22 = (iHashCode21 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.renewable;
        int iHashCode23 = (iHashCode22 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.renewed;
        int iHashCode24 = (iHashCode23 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str14 = this.replacementReason;
        int iHashCode25 = (iHashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Map<String, o> map2 = this.tokenisationEligibilities;
        int iHashCode26 = (iHashCode25 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool12 = this.nameless;
        return iHashCode26 + (bool12 != null ? bool12.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getCustomised() {
        return this.customised;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getCvvStatus() {
        return this.cvvStatus;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final c getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getDesignChangeEligible() {
        return this.designChangeEligible;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getDesignGroup() {
        return this.designGroup;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getDigitised() {
        return this.digitised;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getDisposable() {
        return this.disposable;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getEverDigitised() {
        return this.everDigitised;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getGooglePayEligible() {
        return this.googlePayEligible;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getInAppPinChangeEligible() {
        return this.inAppPinChangeEligible;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Long getLastUsedDate() {
        return this.lastUsedDate;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getNameless() {
        return this.nameless;
    }
}
