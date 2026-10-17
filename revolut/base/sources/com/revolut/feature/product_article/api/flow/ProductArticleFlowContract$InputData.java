package com.revolut.feature.product_article.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/product_article/api/flow/ProductArticleFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProductArticleFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleParams f81264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SkipShownArticleBehaviour f81265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81266c;
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
            SkipShownArticleBehaviour skipShownArticleBehaviour = (SkipShownArticleBehaviour) parcel.readParcelable(ProductArticleFlowContract$InputData.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(ProductArticleFlowContract$InputData.class.getClassLoader());
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(ProductArticleFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                analyticsProduct = analyticsProduct2;
                z = true;
            } else {
                z = false;
                analyticsProduct = analyticsProduct2;
            }
            return new ProductArticleFlowContract$InputData(productArticleParamsCreateFromParcel, skipShownArticleBehaviour, z3, analyticsProduct, analyticsContext, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleFlowContract$InputData[i];
        }
    }

    public ProductArticleFlowContract$InputData(ProductArticleParams params, SkipShownArticleBehaviour skipShownArticleBehaviour, boolean z, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z3) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f81264a = params;
        this.f81265b = skipShownArticleBehaviour;
        this.f81266c = z;
        this.d = analyticsProduct;
        this.e = analyticsContext;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleFlowContract$InputData)) {
            return false;
        }
        ProductArticleFlowContract$InputData productArticleFlowContract$InputData = (ProductArticleFlowContract$InputData) obj2;
        return Intrinsics.f(this.f81264a, productArticleFlowContract$InputData.f81264a) && Intrinsics.f(this.f81265b, productArticleFlowContract$InputData.f81265b) && this.f81266c == productArticleFlowContract$InputData.f81266c && Intrinsics.f(this.d, productArticleFlowContract$InputData.d) && Intrinsics.f(this.e, productArticleFlowContract$InputData.e) && this.f == productArticleFlowContract$InputData.f;
    }

    public final int hashCode() {
        int iA = l.a(j6.a.c((this.f81265b.hashCode() + (this.f81264a.hashCode() * 31)) * 31, 31, this.f81266c), 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        return Boolean.hashCode(this.f) + ((iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81264a.writeToParcel(dest, i);
        dest.writeParcelable(this.f81265b, i);
        dest.writeInt(this.f81266c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }
}
