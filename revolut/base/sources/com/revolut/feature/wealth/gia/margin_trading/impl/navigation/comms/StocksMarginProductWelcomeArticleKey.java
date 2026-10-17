package com.revolut.feature.wealth.gia.margin_trading.impl.navigation.comms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/gia/margin_trading/impl/navigation/comms/StocksMarginProductWelcomeArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StocksMarginProductWelcomeArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<StocksMarginProductWelcomeArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95449c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StocksMarginProductWelcomeArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StocksMarginProductWelcomeArticleKey[i];
        }
    }

    public StocksMarginProductWelcomeArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF95448b() {
        return this.f95448b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StocksMarginProductWelcomeArticleKey)) {
            return false;
        }
        StocksMarginProductWelcomeArticleKey stocksMarginProductWelcomeArticleKey = (StocksMarginProductWelcomeArticleKey) obj2;
        return Intrinsics.f(this.f95447a, stocksMarginProductWelcomeArticleKey.f95447a) && Intrinsics.f(this.f95448b, stocksMarginProductWelcomeArticleKey.f95448b) && Intrinsics.f(this.f95449c, stocksMarginProductWelcomeArticleKey.f95449c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF95447a() {
        return this.f95447a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF95449c() {
        return this.f95449c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f95447a.hashCode() * 31, 31, this.f95448b);
        String str = this.f95449c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95447a);
        dest.writeString(this.f95448b);
        dest.writeString(this.f95449c);
    }

    public StocksMarginProductWelcomeArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f95447a = productName;
        this.f95448b = articleName;
        this.f95449c = str;
    }

    public /* synthetic */ StocksMarginProductWelcomeArticleKey(int i) {
        this("invest", "margin-product-welcome", null);
    }
}
