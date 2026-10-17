package com.revolut.feature.product_article.impl.ui.screen.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/product_article/impl/ui/screen/details/ProductArticleDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleDetailsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProductArticleDetailsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleParams f81288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f81290c;
    public final AnalyticsContext d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            AnalyticsProduct analyticsProduct;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ProductArticleParams productArticleParams = (ProductArticleParams) parcel.readParcelable(ProductArticleDetailsControllerContract$InputData.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(ProductArticleDetailsControllerContract$InputData.class.getClassLoader());
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(ProductArticleDetailsControllerContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                analyticsProduct = analyticsProduct2;
                z = true;
            } else {
                z = false;
                analyticsProduct = analyticsProduct2;
            }
            return new ProductArticleDetailsControllerContract$InputData(productArticleParams, z3, analyticsProduct, analyticsContext, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleDetailsControllerContract$InputData[i];
        }
    }

    public ProductArticleDetailsControllerContract$InputData(ProductArticleParams params, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z3) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f81288a = params;
        this.f81289b = z;
        this.f81290c = analyticsProduct;
        this.d = analyticsContext;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleDetailsControllerContract$InputData)) {
            return false;
        }
        ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = (ProductArticleDetailsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f81288a, productArticleDetailsControllerContract$InputData.f81288a) && this.f81289b == productArticleDetailsControllerContract$InputData.f81289b && Intrinsics.f(this.f81290c, productArticleDetailsControllerContract$InputData.f81290c) && Intrinsics.f(this.d, productArticleDetailsControllerContract$InputData.d) && this.e == productArticleDetailsControllerContract$InputData.e;
    }

    public final int hashCode() {
        int iA = l.a(j6.a.c(this.f81288a.hashCode() * 31, 31, this.f81289b), 31, this.f81290c);
        AnalyticsContext analyticsContext = this.d;
        return Boolean.hashCode(this.e) + ((iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81288a, i);
        dest.writeInt(this.f81289b ? 1 : 0);
        dest.writeParcelable(this.f81290c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
