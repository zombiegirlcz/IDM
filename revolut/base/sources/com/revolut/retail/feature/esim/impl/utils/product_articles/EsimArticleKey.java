package com.revolut.retail.feature.esim.impl.utils.product_articles;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/utils/product_articles/EsimArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "ESIM_MOBILE_PLANS", "FREE_DATA_PLAN", "MESSAGING_PASS", "DEFAULT", "LEGACY_PRICING_PLAN_BENEFIT", "LEGACY_PRICING_PLAN_BENEFIT_PRIVATE", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EsimArticleKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EsimArticleKey> CREATOR;
    public static final EsimArticleKey DEFAULT;
    public static final EsimArticleKey ESIM_MOBILE_PLANS;
    public static final EsimArticleKey FREE_DATA_PLAN;

    @d
    public static final EsimArticleKey LEGACY_PRICING_PLAN_BENEFIT;

    @d
    public static final EsimArticleKey LEGACY_PRICING_PLAN_BENEFIT_PRIVATE;
    public static final EsimArticleKey MESSAGING_PASS;
    private final String articleVariant;

    @NotNull
    private final String productName = "esim";

    @NotNull
    private final String articleName = "intro";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EsimArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimArticleKey[i];
        }
    }

    static {
        EsimArticleKey esimArticleKey = new EsimArticleKey("ESIM_MOBILE_PLANS", 0, "mobile_plans");
        ESIM_MOBILE_PLANS = esimArticleKey;
        EsimArticleKey esimArticleKey2 = new EsimArticleKey("FREE_DATA_PLAN", 1, "data_plans_free_esim_data_plan");
        FREE_DATA_PLAN = esimArticleKey2;
        EsimArticleKey esimArticleKey3 = new EsimArticleKey("MESSAGING_PASS", 2, "data_plans_messaging_pass");
        MESSAGING_PASS = esimArticleKey3;
        EsimArticleKey esimArticleKey4 = new EsimArticleKey("DEFAULT", 3, "default");
        DEFAULT = esimArticleKey4;
        EsimArticleKey esimArticleKey5 = new EsimArticleKey("LEGACY_PRICING_PLAN_BENEFIT", 4, "pricing_plan_benefit");
        LEGACY_PRICING_PLAN_BENEFIT = esimArticleKey5;
        EsimArticleKey esimArticleKey6 = new EsimArticleKey("LEGACY_PRICING_PLAN_BENEFIT_PRIVATE", 5, "pricing_plan_benefit_private");
        LEGACY_PRICING_PLAN_BENEFIT_PRIVATE = esimArticleKey6;
        EsimArticleKey[] esimArticleKeyArr = {esimArticleKey, esimArticleKey2, esimArticleKey3, esimArticleKey4, esimArticleKey5, esimArticleKey6};
        $VALUES = esimArticleKeyArr;
        $ENTRIES = s.n(esimArticleKeyArr);
        CREATOR = new a();
    }

    public EsimArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static EsimArticleKey valueOf(String str) {
        return (EsimArticleKey) Enum.valueOf(EsimArticleKey.class, str);
    }

    public static EsimArticleKey[] values() {
        return (EsimArticleKey[]) $VALUES.clone();
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
