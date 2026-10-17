package com.revolut.feature.commodities.onboarding.impl.comms;

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
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/commodities/onboarding/impl/comms/CommoditiesProductWelcomeArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "UK", "EEA", "AU", "SG", "JP", "feature_commodities_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommoditiesProductWelcomeArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommoditiesProductWelcomeArticleKey[] $VALUES;
    public static final CommoditiesProductWelcomeArticleKey AU;

    @NotNull
    public static final Parcelable.Creator<CommoditiesProductWelcomeArticleKey> CREATOR;
    public static final CommoditiesProductWelcomeArticleKey EEA;
    public static final CommoditiesProductWelcomeArticleKey JP;
    public static final CommoditiesProductWelcomeArticleKey SG;
    public static final CommoditiesProductWelcomeArticleKey UK;
    private final String articleVariant;

    @NotNull
    private final String productName = "invest";

    @NotNull
    private final String articleName = "commodities-product-welcome";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CommoditiesProductWelcomeArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommoditiesProductWelcomeArticleKey[i];
        }
    }

    static {
        CommoditiesProductWelcomeArticleKey commoditiesProductWelcomeArticleKey = new CommoditiesProductWelcomeArticleKey("UK", 0, "uk");
        UK = commoditiesProductWelcomeArticleKey;
        CommoditiesProductWelcomeArticleKey commoditiesProductWelcomeArticleKey2 = new CommoditiesProductWelcomeArticleKey("EEA", 1, "eea");
        EEA = commoditiesProductWelcomeArticleKey2;
        CommoditiesProductWelcomeArticleKey commoditiesProductWelcomeArticleKey3 = new CommoditiesProductWelcomeArticleKey("AU", 2, "au");
        AU = commoditiesProductWelcomeArticleKey3;
        CommoditiesProductWelcomeArticleKey commoditiesProductWelcomeArticleKey4 = new CommoditiesProductWelcomeArticleKey("SG", 3, "sg");
        SG = commoditiesProductWelcomeArticleKey4;
        CommoditiesProductWelcomeArticleKey commoditiesProductWelcomeArticleKey5 = new CommoditiesProductWelcomeArticleKey("JP", 4, "jp");
        JP = commoditiesProductWelcomeArticleKey5;
        CommoditiesProductWelcomeArticleKey[] commoditiesProductWelcomeArticleKeyArr = {commoditiesProductWelcomeArticleKey, commoditiesProductWelcomeArticleKey2, commoditiesProductWelcomeArticleKey3, commoditiesProductWelcomeArticleKey4, commoditiesProductWelcomeArticleKey5};
        $VALUES = commoditiesProductWelcomeArticleKeyArr;
        $ENTRIES = s.n(commoditiesProductWelcomeArticleKeyArr);
        CREATOR = new a();
    }

    public CommoditiesProductWelcomeArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static CommoditiesProductWelcomeArticleKey valueOf(String str) {
        return (CommoditiesProductWelcomeArticleKey) Enum.valueOf(CommoditiesProductWelcomeArticleKey.class, str);
    }

    public static CommoditiesProductWelcomeArticleKey[] values() {
        return (CommoditiesProductWelcomeArticleKey[]) $VALUES.clone();
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
