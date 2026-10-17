package com.revolut.feature.freelancer.api.article;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/revolut/feature/freelancer/api/article/ProProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "CASHBACK_BOOSTER", "CATALOGUE_INTRO", "INVOICE", "INVOICE_PT", "ONBOARDING", "PAYMENT_LINK", "PAYMENT_LINK_CO", "PAYMENT_LINK_PT", "POCKETS_REGULAR", "POCKETS_REGULAR_CO", "POCKETS_TAX", "POCKETS_TAX_CO", "POCKETS_TAX_PL", "PRO_PERKS", "PRO_PERKS_ES", "SHOPIFY", "SHOPIFY_PT", "TAX_HUB", "TAX_HUB_UK", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProProductArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProProductArticleKey[] $VALUES;
    public static final ProProductArticleKey CASHBACK_BOOSTER;
    public static final ProProductArticleKey CATALOGUE_INTRO;

    @NotNull
    public static final Parcelable.Creator<ProProductArticleKey> CREATOR;
    public static final ProProductArticleKey INVOICE;
    public static final ProProductArticleKey INVOICE_PT;
    public static final ProProductArticleKey ONBOARDING;
    public static final ProProductArticleKey PAYMENT_LINK;
    public static final ProProductArticleKey PAYMENT_LINK_CO;
    public static final ProProductArticleKey PAYMENT_LINK_PT;
    public static final ProProductArticleKey POCKETS_REGULAR;
    public static final ProProductArticleKey POCKETS_REGULAR_CO;
    public static final ProProductArticleKey POCKETS_TAX;
    public static final ProProductArticleKey POCKETS_TAX_CO;
    public static final ProProductArticleKey POCKETS_TAX_PL;
    public static final ProProductArticleKey PRO_PERKS;
    public static final ProProductArticleKey PRO_PERKS_ES;
    public static final ProProductArticleKey SHOPIFY;
    public static final ProProductArticleKey SHOPIFY_PT;
    public static final ProProductArticleKey TAX_HUB;
    public static final ProProductArticleKey TAX_HUB_UK;

    @NotNull
    private final String articleName;
    private final String articleVariant;

    @NotNull
    private final String productName = "revolut_pro";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ProProductArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProProductArticleKey[i];
        }
    }

    static {
        ProProductArticleKey proProductArticleKey = new ProProductArticleKey("CASHBACK_BOOSTER", 0, "cashback", "booster");
        CASHBACK_BOOSTER = proProductArticleKey;
        ProProductArticleKey proProductArticleKey2 = new ProProductArticleKey("CATALOGUE_INTRO", 1, "catalogue", "intro");
        CATALOGUE_INTRO = proProductArticleKey2;
        ProProductArticleKey proProductArticleKey3 = new ProProductArticleKey("INVOICE", 2, "sale", "invoice");
        INVOICE = proProductArticleKey3;
        ProProductArticleKey proProductArticleKey4 = new ProProductArticleKey("INVOICE_PT", 3, "sale.invoice", "pt");
        INVOICE_PT = proProductArticleKey4;
        ProProductArticleKey proProductArticleKey5 = new ProProductArticleKey("ONBOARDING", 4, "onboarding", "all");
        ONBOARDING = proProductArticleKey5;
        ProProductArticleKey proProductArticleKey6 = new ProProductArticleKey("PAYMENT_LINK", 5, "sale", "payment_link");
        PAYMENT_LINK = proProductArticleKey6;
        ProProductArticleKey proProductArticleKey7 = new ProProductArticleKey("PAYMENT_LINK_CO", 6, "sale.payment_link", "co");
        PAYMENT_LINK_CO = proProductArticleKey7;
        ProProductArticleKey proProductArticleKey8 = new ProProductArticleKey("PAYMENT_LINK_PT", 7, "sale.payment_link", "pt");
        PAYMENT_LINK_PT = proProductArticleKey8;
        ProProductArticleKey proProductArticleKey9 = new ProProductArticleKey("POCKETS_REGULAR", 8, "pockets", "regular");
        POCKETS_REGULAR = proProductArticleKey9;
        ProProductArticleKey proProductArticleKey10 = new ProProductArticleKey("POCKETS_REGULAR_CO", 9, "pockets.regular", "co");
        POCKETS_REGULAR_CO = proProductArticleKey10;
        ProProductArticleKey proProductArticleKey11 = new ProProductArticleKey("POCKETS_TAX", 10, "pockets.tax", "all");
        POCKETS_TAX = proProductArticleKey11;
        ProProductArticleKey proProductArticleKey12 = new ProProductArticleKey("POCKETS_TAX_CO", 11, "pockets.tax", "co");
        POCKETS_TAX_CO = proProductArticleKey12;
        ProProductArticleKey proProductArticleKey13 = new ProProductArticleKey("POCKETS_TAX_PL", 12, "pockets.tax", "pl");
        POCKETS_TAX_PL = proProductArticleKey13;
        ProProductArticleKey proProductArticleKey14 = new ProProductArticleKey("PRO_PERKS", 13, "perks", "intro");
        PRO_PERKS = proProductArticleKey14;
        ProProductArticleKey proProductArticleKey15 = new ProProductArticleKey("PRO_PERKS_ES", 14, "perks.intro", "es");
        PRO_PERKS_ES = proProductArticleKey15;
        ProProductArticleKey proProductArticleKey16 = new ProProductArticleKey("SHOPIFY", 15, "sale", "shopify");
        SHOPIFY = proProductArticleKey16;
        ProProductArticleKey proProductArticleKey17 = new ProProductArticleKey("SHOPIFY_PT", 16, "sale.shopify", "pt");
        SHOPIFY_PT = proProductArticleKey17;
        ProProductArticleKey proProductArticleKey18 = new ProProductArticleKey("TAX_HUB", 17, "tax_hub", "all");
        TAX_HUB = proProductArticleKey18;
        ProProductArticleKey proProductArticleKey19 = new ProProductArticleKey("TAX_HUB_UK", 18, "tax_hub", "uk");
        TAX_HUB_UK = proProductArticleKey19;
        ProProductArticleKey[] proProductArticleKeyArr = {proProductArticleKey, proProductArticleKey2, proProductArticleKey3, proProductArticleKey4, proProductArticleKey5, proProductArticleKey6, proProductArticleKey7, proProductArticleKey8, proProductArticleKey9, proProductArticleKey10, proProductArticleKey11, proProductArticleKey12, proProductArticleKey13, proProductArticleKey14, proProductArticleKey15, proProductArticleKey16, proProductArticleKey17, proProductArticleKey18, proProductArticleKey19};
        $VALUES = proProductArticleKeyArr;
        $ENTRIES = s.n(proProductArticleKeyArr);
        CREATOR = new a();
    }

    public ProProductArticleKey(String str, int i, String str2, String str3) {
        this.articleName = str2;
        this.articleVariant = str3;
    }

    public static ProProductArticleKey valueOf(String str) {
        return (ProProductArticleKey) Enum.valueOf(ProProductArticleKey.class, str);
    }

    public static ProProductArticleKey[] values() {
        return (ProProductArticleKey[]) $VALUES.clone();
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getArticleName() {
        return this.articleName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return this.productName;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getArticleVariant() {
        return this.articleVariant;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
