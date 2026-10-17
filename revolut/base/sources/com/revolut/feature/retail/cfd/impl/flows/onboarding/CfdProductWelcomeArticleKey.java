package com.revolut.feature.retail.cfd.impl.flows.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdProductWelcomeArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdProductWelcomeArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<CfdProductWelcomeArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82165c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdProductWelcomeArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdProductWelcomeArticleKey[i];
        }
    }

    public CfdProductWelcomeArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF82164b() {
        return this.f82164b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdProductWelcomeArticleKey)) {
            return false;
        }
        CfdProductWelcomeArticleKey cfdProductWelcomeArticleKey = (CfdProductWelcomeArticleKey) obj2;
        return Intrinsics.f(this.f82163a, cfdProductWelcomeArticleKey.f82163a) && Intrinsics.f(this.f82164b, cfdProductWelcomeArticleKey.f82164b) && Intrinsics.f(this.f82165c, cfdProductWelcomeArticleKey.f82165c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF82163a() {
        return this.f82163a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF82165c() {
        return this.f82165c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f82163a.hashCode() * 31, 31, this.f82164b);
        String str = this.f82165c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82163a);
        dest.writeString(this.f82164b);
        dest.writeString(this.f82165c);
    }

    public CfdProductWelcomeArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f82163a = productName;
        this.f82164b = articleName;
        this.f82165c = str;
    }

    public /* synthetic */ CfdProductWelcomeArticleKey(int i) {
        this("invest", "cfds-product-welcome", null);
    }
}
