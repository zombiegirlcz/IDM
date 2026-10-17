package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CategoryDetails", "ProductDetails", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step$CategoryDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step$ProductDetails;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CatalogueDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step$ProductDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductDetails extends CatalogueDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueProduct f60715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CatalogueCategory f60716b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductDetails((CatalogueProduct) parcel.readParcelable(ProductDetails.class.getClassLoader()), (CatalogueCategory) parcel.readParcelable(ProductDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductDetails[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ProductDetails() {
            this(null, 0 == true ? 1 : 0, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductDetails)) {
                return false;
            }
            ProductDetails productDetails = (ProductDetails) obj2;
            return Intrinsics.f(this.f60715a, productDetails.f60715a) && Intrinsics.f(this.f60716b, productDetails.f60716b);
        }

        public final int hashCode() {
            CatalogueProduct catalogueProduct = this.f60715a;
            int iHashCode = (catalogueProduct == null ? 0 : catalogueProduct.hashCode()) * 31;
            CatalogueCategory catalogueCategory = this.f60716b;
            return iHashCode + (catalogueCategory != null ? catalogueCategory.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60715a, i);
            dest.writeParcelable(this.f60716b, i);
        }

        public ProductDetails(CatalogueProduct catalogueProduct, CatalogueCategory catalogueCategory) {
            this.f60715a = catalogueProduct;
            this.f60716b = catalogueCategory;
        }

        public /* synthetic */ ProductDetails(CatalogueProduct catalogueProduct, CatalogueCategory catalogueCategory, int i) {
            this((i & 1) != 0 ? null : catalogueProduct, (i & 2) != 0 ? null : catalogueCategory);
        }
    }

    private CatalogueDetailsFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step$CategoryDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CategoryDetails extends CatalogueDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CategoryDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f60714a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CategoryDetails((CatalogueCategory) parcel.readParcelable(CategoryDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CategoryDetails[i];
            }
        }

        public CategoryDetails(CatalogueCategory catalogueCategory) {
            this.f60714a = catalogueCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CategoryDetails) && Intrinsics.f(this.f60714a, ((CategoryDetails) obj2).f60714a);
        }

        public final int hashCode() {
            CatalogueCategory catalogueCategory = this.f60714a;
            if (catalogueCategory == null) {
                return 0;
            }
            return catalogueCategory.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60714a, i);
        }

        public CategoryDetails() {
            this(null);
        }
    }
}
