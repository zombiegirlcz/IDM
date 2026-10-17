package com.revolut.feature.product_article.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product_article/api/models/ProductArticleDestinationInterceptor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleDestinationInterceptor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductArticleDestinationInterceptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StackDestination f81271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StackDestination f81272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackDestination f81273c;
    public final StackDestination d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductArticleDestinationInterceptor((StackDestination) parcel.readParcelable(ProductArticleDestinationInterceptor.class.getClassLoader()), (StackDestination) parcel.readParcelable(ProductArticleDestinationInterceptor.class.getClassLoader()), (StackDestination) parcel.readParcelable(ProductArticleDestinationInterceptor.class.getClassLoader()), (StackDestination) parcel.readParcelable(ProductArticleDestinationInterceptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleDestinationInterceptor[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductArticleDestinationInterceptor() {
        EsimFeatureConfig.HomeDestination homeDestination = null;
        this(homeDestination, homeDestination, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleDestinationInterceptor)) {
            return false;
        }
        ProductArticleDestinationInterceptor productArticleDestinationInterceptor = (ProductArticleDestinationInterceptor) obj2;
        return Intrinsics.f(this.f81271a, productArticleDestinationInterceptor.f81271a) && Intrinsics.f(this.f81272b, productArticleDestinationInterceptor.f81272b) && Intrinsics.f(this.f81273c, productArticleDestinationInterceptor.f81273c) && Intrinsics.f(this.d, productArticleDestinationInterceptor.d);
    }

    public final int hashCode() {
        StackDestination stackDestination = this.f81271a;
        int iHashCode = (stackDestination == null ? 0 : stackDestination.hashCode()) * 31;
        StackDestination stackDestination2 = this.f81272b;
        int iHashCode2 = (iHashCode + (stackDestination2 == null ? 0 : stackDestination2.hashCode())) * 31;
        StackDestination stackDestination3 = this.f81273c;
        int iHashCode3 = (iHashCode2 + (stackDestination3 == null ? 0 : stackDestination3.hashCode())) * 31;
        StackDestination stackDestination4 = this.d;
        return iHashCode3 + (stackDestination4 != null ? stackDestination4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81271a, i);
        dest.writeParcelable(this.f81272b, i);
        dest.writeParcelable(this.f81273c, i);
        dest.writeParcelable(this.d, i);
    }

    public ProductArticleDestinationInterceptor(StackDestination stackDestination, StackDestination stackDestination2, StackDestination stackDestination3, StackDestination stackDestination4) {
        this.f81271a = stackDestination;
        this.f81272b = stackDestination2;
        this.f81273c = stackDestination3;
        this.d = stackDestination4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductArticleDestinationInterceptor(EsimFeatureConfig.HomeDestination homeDestination, EsimFeatureConfig.HomeDestination homeDestination2, int i) {
        homeDestination = (i & 1) != 0 ? null : homeDestination;
        this(homeDestination, homeDestination, null, (i & 8) != 0 ? null : homeDestination2);
    }
}
