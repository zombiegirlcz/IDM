package com.revolut.feature.revolut_x_promo.impl.articles;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_x_promo/impl/articles/CryptoExchangeArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_revolut_x_promo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84268c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangeArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeArticleKey[i];
        }
    }

    public CryptoExchangeArticleKey() {
        this(null, 7);
    }

    public static CryptoExchangeArticleKey a(CryptoExchangeArticleKey cryptoExchangeArticleKey) {
        String productName = cryptoExchangeArticleKey.f84266a;
        String articleName = cryptoExchangeArticleKey.f84267b;
        cryptoExchangeArticleKey.getClass();
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        return new CryptoExchangeArticleKey(productName, articleName, null);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF85333b() {
        return this.f84267b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeArticleKey)) {
            return false;
        }
        CryptoExchangeArticleKey cryptoExchangeArticleKey = (CryptoExchangeArticleKey) obj2;
        return Intrinsics.f(this.f84266a, cryptoExchangeArticleKey.f84266a) && Intrinsics.f(this.f84267b, cryptoExchangeArticleKey.f84267b) && Intrinsics.f(this.f84268c, cryptoExchangeArticleKey.f84268c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF85332a() {
        return this.f84266a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF85334c() {
        return this.f84268c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f84266a.hashCode() * 31, 31, this.f84267b);
        String str = this.f84268c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84266a);
        dest.writeString(this.f84267b);
        dest.writeString(this.f84268c);
    }

    public CryptoExchangeArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f84266a = productName;
        this.f84267b = articleName;
        this.f84268c = str;
    }

    public /* synthetic */ CryptoExchangeArticleKey(String str, int i) {
        this("crypto-exchange", "retail-cross-sell", (i & 4) != 0 ? null : str);
    }
}
