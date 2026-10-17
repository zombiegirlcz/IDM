package com.revolut.feature.travel.hotels.impl.articles;

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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/articles/StaysArticles;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "articleName", "Ljava/lang/String;", "U5", "()Ljava/lang/String;", "productName", "getProductName", "articleVariant", "h1", "INTRO_WITH_CASHBACK", "INTRO_WITH_POINTS_VARIABLE", "INTRO_WITH_POINTS_MAX_REWARD", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StaysArticles implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StaysArticles[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<StaysArticles> CREATOR;
    public static final StaysArticles INTRO_WITH_CASHBACK;
    public static final StaysArticles INTRO_WITH_POINTS_MAX_REWARD;
    public static final StaysArticles INTRO_WITH_POINTS_VARIABLE;

    @NotNull
    private final String articleName;

    @NotNull
    private final String productName = "stays";
    private final String articleVariant = null;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return StaysArticles.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StaysArticles[i];
        }
    }

    static {
        StaysArticles staysArticles = new StaysArticles("INTRO_WITH_CASHBACK", 0, "intro-with-cashback");
        INTRO_WITH_CASHBACK = staysArticles;
        StaysArticles staysArticles2 = new StaysArticles("INTRO_WITH_POINTS_VARIABLE", 1, "intro-with-points-variable");
        INTRO_WITH_POINTS_VARIABLE = staysArticles2;
        StaysArticles staysArticles3 = new StaysArticles("INTRO_WITH_POINTS_MAX_REWARD", 2, "intro-with-nuitee-revamp");
        INTRO_WITH_POINTS_MAX_REWARD = staysArticles3;
        StaysArticles[] staysArticlesArr = {staysArticles, staysArticles2, staysArticles3};
        $VALUES = staysArticlesArr;
        $ENTRIES = s.n(staysArticlesArr);
        CREATOR = new a();
    }

    public StaysArticles(String str, int i, String str2) {
        this.articleName = str2;
    }

    public static StaysArticles valueOf(String str) {
        return (StaysArticles) Enum.valueOf(StaysArticles.class, str);
    }

    public static StaysArticles[] values() {
        return (StaysArticles[]) $VALUES.clone();
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
