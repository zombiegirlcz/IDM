package com.revolut.feature.onboarding.impl.exchange_global_access;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/exchange_global_access/ExchangeGlobalAccessArticleKeyMx;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeGlobalAccessArticleKeyMx implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<ExchangeGlobalAccessArticleKeyMx> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78260c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeGlobalAccessArticleKeyMx(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeGlobalAccessArticleKeyMx[i];
        }
    }

    public ExchangeGlobalAccessArticleKeyMx() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF80206b() {
        return this.f78259b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeGlobalAccessArticleKeyMx)) {
            return false;
        }
        ExchangeGlobalAccessArticleKeyMx exchangeGlobalAccessArticleKeyMx = (ExchangeGlobalAccessArticleKeyMx) obj2;
        return Intrinsics.f(this.f78258a, exchangeGlobalAccessArticleKeyMx.f78258a) && Intrinsics.f(this.f78259b, exchangeGlobalAccessArticleKeyMx.f78259b) && Intrinsics.f(this.f78260c, exchangeGlobalAccessArticleKeyMx.f78260c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF80205a() {
        return this.f78258a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF80207c() {
        return this.f78260c;
    }

    public final int hashCode() {
        return this.f78260c.hashCode() + p.a.c(this.f78258a.hashCode() * 31, 31, this.f78259b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78258a);
        dest.writeString(this.f78259b);
        dest.writeString(this.f78260c);
    }

    public ExchangeGlobalAccessArticleKeyMx(String productName, String articleName, String articleVariant) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        Intrinsics.checkNotNullParameter(articleVariant, "articleVariant");
        this.f78258a = productName;
        this.f78259b = articleName;
        this.f78260c = articleVariant;
    }

    public /* synthetic */ ExchangeGlobalAccessArticleKeyMx(int i) {
        this("exchange", "enable-multicurrency", "mx");
    }
}
