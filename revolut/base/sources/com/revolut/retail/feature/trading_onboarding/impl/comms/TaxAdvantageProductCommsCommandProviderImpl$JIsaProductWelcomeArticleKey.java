package com.revolut.retail.feature.trading_onboarding.impl.comms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/comms/TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104135c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey[i];
        }
    }

    public TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF104137b() {
        return this.f104134b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey)) {
            return false;
        }
        TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey taxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey = (TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey) obj2;
        return Intrinsics.f(this.f104133a, taxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey.f104133a) && Intrinsics.f(this.f104134b, taxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey.f104134b) && Intrinsics.f(this.f104135c, taxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey.f104135c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF104139a() {
        return this.f104133a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF104141c() {
        return this.f104135c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f104133a.hashCode() * 31, 31, this.f104134b);
        String str = this.f104135c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104133a);
        dest.writeString(this.f104134b);
        dest.writeString(this.f104135c);
    }

    public TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f104133a = productName;
        this.f104134b = articleName;
        this.f104135c = str;
    }

    public /* synthetic */ TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey(int i) {
        this("invest", "jisa-product-welcome", null);
    }
}
