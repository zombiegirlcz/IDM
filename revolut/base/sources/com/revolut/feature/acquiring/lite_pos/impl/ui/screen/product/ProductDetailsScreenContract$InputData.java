package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProductDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueProduct f60817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CatalogueCategory f60818b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductDetailsScreenContract$InputData((CatalogueProduct) parcel.readParcelable(ProductDetailsScreenContract$InputData.class.getClassLoader()), (CatalogueCategory) parcel.readParcelable(ProductDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductDetailsScreenContract$InputData[i];
        }
    }

    public ProductDetailsScreenContract$InputData(CatalogueProduct catalogueProduct, CatalogueCategory catalogueCategory) {
        this.f60817a = catalogueProduct;
        this.f60818b = catalogueCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductDetailsScreenContract$InputData)) {
            return false;
        }
        ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData = (ProductDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60817a, productDetailsScreenContract$InputData.f60817a) && Intrinsics.f(this.f60818b, productDetailsScreenContract$InputData.f60818b);
    }

    public final int hashCode() {
        CatalogueProduct catalogueProduct = this.f60817a;
        int iHashCode = (catalogueProduct == null ? 0 : catalogueProduct.hashCode()) * 31;
        CatalogueCategory catalogueCategory = this.f60818b;
        return iHashCode + (catalogueCategory != null ? catalogueCategory.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60817a, i);
        dest.writeParcelable(this.f60818b, i);
    }
}
