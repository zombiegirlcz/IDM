package com.revolut.feature.product_article.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yja.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/product_article/api/navigation/ProductArticleDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Lyja/b;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleDescriptor implements ParcelableControllerDescriptor<b> {

    @NotNull
    public static final Parcelable.Creator<ProductArticleDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleParams f81278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SkipShownArticleBehaviour f81279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81280c;
    public final AnalyticsProduct d;
    public final AnalyticsContext e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            AnalyticsProduct analyticsProduct;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ProductArticleParams productArticleParamsCreateFromParcel = ProductArticleParams.CREATOR.createFromParcel(parcel);
            SkipShownArticleBehaviour skipShownArticleBehaviour = (SkipShownArticleBehaviour) parcel.readParcelable(ProductArticleDescriptor.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(ProductArticleDescriptor.class.getClassLoader());
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(ProductArticleDescriptor.class.getClassLoader());
            if (parcel.readInt() != 0) {
                analyticsProduct = analyticsProduct2;
                z = true;
            } else {
                z = false;
                analyticsProduct = analyticsProduct2;
            }
            return new ProductArticleDescriptor(productArticleParamsCreateFromParcel, skipShownArticleBehaviour, z3, analyticsProduct, analyticsContext, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleDescriptor[i];
        }
    }

    public ProductArticleDescriptor(ProductArticleParams params, SkipShownArticleBehaviour skipShownArticleBehaviour, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z3) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f81278a = params;
        this.f81279b = skipShownArticleBehaviour;
        this.f81280c = z;
        this.d = analyticsProduct;
        this.e = analyticsContext;
        this.f = z3;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF81280c() {
        return this.f81280c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SkipShownArticleBehaviour getF81279b() {
        return this.f81279b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleDescriptor)) {
            return false;
        }
        ProductArticleDescriptor productArticleDescriptor = (ProductArticleDescriptor) obj2;
        return Intrinsics.f(this.f81278a, productArticleDescriptor.f81278a) && Intrinsics.f(this.f81279b, productArticleDescriptor.f81279b) && this.f81280c == productArticleDescriptor.f81280c && Intrinsics.f(this.d, productArticleDescriptor.d) && Intrinsics.f(this.e, productArticleDescriptor.e) && this.f == productArticleDescriptor.f;
    }

    /* JADX INFO: renamed from: getParams, reason: from getter */
    public final ProductArticleParams getF81278a() {
        return this.f81278a;
    }

    public final int hashCode() {
        int iA = l.a(j6.a.c((this.f81279b.hashCode() + (this.f81278a.hashCode() * 31)) * 31, 31, this.f81280c), 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        return Boolean.hashCode(this.f) + ((iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81278a.writeToParcel(dest, i);
        dest.writeParcelable(this.f81279b, i);
        dest.writeInt(this.f81280c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductArticleDescriptor(ProductArticleParams productArticleParams, SkipShownArticleBehaviour skipShownArticleBehaviour, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z3, int i) {
        z = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            k9 k9Var = k9.Home;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        this(productArticleParams, skipShownArticleBehaviour, z, analyticsProduct, (i & 16) != 0 ? null : analyticsContext, (i & 32) != 0 ? true : z3);
    }
}
