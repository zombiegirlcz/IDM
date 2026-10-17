package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.product_article;

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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/smart_estimation/product_article/CustomAssetSmartEstimationProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "articleVariant", "Ljava/lang/String;", "h1", "()Ljava/lang/String;", "productName", "getProductName", "articleName", "U5", "UK", "EEA", "PT", "IE", "HU", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomAssetSmartEstimationProductArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CustomAssetSmartEstimationProductArticleKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CustomAssetSmartEstimationProductArticleKey> CREATOR;
    public static final CustomAssetSmartEstimationProductArticleKey EEA;
    public static final CustomAssetSmartEstimationProductArticleKey HU;
    public static final CustomAssetSmartEstimationProductArticleKey IE;
    public static final CustomAssetSmartEstimationProductArticleKey PT;
    public static final CustomAssetSmartEstimationProductArticleKey UK;

    @NotNull
    private final String articleVariant;

    @NotNull
    private final String productName = "money-health";

    @NotNull
    private final String articleName = "custom-assets-onboarding";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CustomAssetSmartEstimationProductArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomAssetSmartEstimationProductArticleKey[i];
        }
    }

    static {
        CustomAssetSmartEstimationProductArticleKey customAssetSmartEstimationProductArticleKey = new CustomAssetSmartEstimationProductArticleKey("UK", 0, "uk");
        UK = customAssetSmartEstimationProductArticleKey;
        CustomAssetSmartEstimationProductArticleKey customAssetSmartEstimationProductArticleKey2 = new CustomAssetSmartEstimationProductArticleKey("EEA", 1, "eea");
        EEA = customAssetSmartEstimationProductArticleKey2;
        CustomAssetSmartEstimationProductArticleKey customAssetSmartEstimationProductArticleKey3 = new CustomAssetSmartEstimationProductArticleKey("PT", 2, "pt");
        PT = customAssetSmartEstimationProductArticleKey3;
        CustomAssetSmartEstimationProductArticleKey customAssetSmartEstimationProductArticleKey4 = new CustomAssetSmartEstimationProductArticleKey("IE", 3, "ie");
        IE = customAssetSmartEstimationProductArticleKey4;
        CustomAssetSmartEstimationProductArticleKey customAssetSmartEstimationProductArticleKey5 = new CustomAssetSmartEstimationProductArticleKey("HU", 4, "hu");
        HU = customAssetSmartEstimationProductArticleKey5;
        CustomAssetSmartEstimationProductArticleKey[] customAssetSmartEstimationProductArticleKeyArr = {customAssetSmartEstimationProductArticleKey, customAssetSmartEstimationProductArticleKey2, customAssetSmartEstimationProductArticleKey3, customAssetSmartEstimationProductArticleKey4, customAssetSmartEstimationProductArticleKey5};
        $VALUES = customAssetSmartEstimationProductArticleKeyArr;
        $ENTRIES = s.n(customAssetSmartEstimationProductArticleKeyArr);
        CREATOR = new a();
    }

    public CustomAssetSmartEstimationProductArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static CustomAssetSmartEstimationProductArticleKey valueOf(String str) {
        return (CustomAssetSmartEstimationProductArticleKey) Enum.valueOf(CustomAssetSmartEstimationProductArticleKey.class, str);
    }

    public static CustomAssetSmartEstimationProductArticleKey[] values() {
        return (CustomAssetSmartEstimationProductArticleKey[]) $VALUES.clone();
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
