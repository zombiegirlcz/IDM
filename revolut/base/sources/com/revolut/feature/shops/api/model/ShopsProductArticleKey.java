package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "Companion", "a", "INTRO_CASHBACK", "INTRO_LOYALTY", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsProductArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShopsProductArticleKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ShopsProductArticleKey> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ShopsProductArticleKey INTRO_CASHBACK;
    public static final ShopsProductArticleKey INTRO_LOYALTY;

    @NotNull
    private static final List<String> oldCashbackIntros;

    @NotNull
    private static final List<String> oldLoyaltyIntros;
    private final String articleVariant;

    @NotNull
    private final String productName = "shops";

    @NotNull
    private final String articleName = "intro";

    /* JADX INFO: renamed from: com.revolut.feature.shops.api.model.ShopsProductArticleKey$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ShopsProductArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsProductArticleKey[i];
        }
    }

    static {
        ShopsProductArticleKey shopsProductArticleKey = new ShopsProductArticleKey("INTRO_CASHBACK", 0, "new-with-cashback");
        INTRO_CASHBACK = shopsProductArticleKey;
        ShopsProductArticleKey shopsProductArticleKey2 = new ShopsProductArticleKey("INTRO_LOYALTY", 1, "new-with-points");
        INTRO_LOYALTY = shopsProductArticleKey2;
        ShopsProductArticleKey[] shopsProductArticleKeyArr = {shopsProductArticleKey, shopsProductArticleKey2};
        $VALUES = shopsProductArticleKeyArr;
        $ENTRIES = s.n(shopsProductArticleKeyArr);
        INSTANCE = new Companion();
        CREATOR = new b();
        oldLoyaltyIntros = v.k("shops.intro.loyalty", "shops.intro.loyalty_with_substitution");
        oldCashbackIntros = v.k("shops.intro.uk", "shops.intro.ie", "shops.intro.eea", "shops.intro.us", "shops.intro.apac");
    }

    public ShopsProductArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static ShopsProductArticleKey valueOf(String str) {
        return (ShopsProductArticleKey) Enum.valueOf(ShopsProductArticleKey.class, str);
    }

    public static ShopsProductArticleKey[] values() {
        return (ShopsProductArticleKey[]) $VALUES.clone();
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
