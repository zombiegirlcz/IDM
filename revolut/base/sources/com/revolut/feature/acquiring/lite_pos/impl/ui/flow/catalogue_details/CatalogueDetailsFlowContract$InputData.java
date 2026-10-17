package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "CreateCategory", "EditCategory", "CreateProduct", "EditProduct", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$CreateCategory;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$CreateProduct;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$EditCategory;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$EditProduct;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CatalogueDetailsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$CreateCategory;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateCategory extends CatalogueDetailsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateCategory f60710a = new CreateCategory();

        @NotNull
        public static final Parcelable.Creator<CreateCategory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateCategory.f60710a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateCategory[i];
            }
        }

        private CreateCategory() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$CreateProduct;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateProduct extends CatalogueDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreateProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f60711a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateProduct((CatalogueCategory) parcel.readParcelable(CreateProduct.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateProduct[i];
            }
        }

        public CreateProduct(CatalogueCategory catalogueCategory) {
            this.f60711a = catalogueCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateProduct) && Intrinsics.f(this.f60711a, ((CreateProduct) obj2).f60711a);
        }

        public final int hashCode() {
            CatalogueCategory catalogueCategory = this.f60711a;
            if (catalogueCategory == null) {
                return 0;
            }
            return catalogueCategory.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60711a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$EditCategory;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditCategory extends CatalogueDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditCategory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f60712a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditCategory((CatalogueCategory) parcel.readParcelable(EditCategory.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditCategory[i];
            }
        }

        public EditCategory(CatalogueCategory category) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.f60712a = category;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditCategory) && Intrinsics.f(this.f60712a, ((EditCategory) obj2).f60712a);
        }

        public final int hashCode() {
            return this.f60712a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60712a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData$EditProduct;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditProduct extends CatalogueDetailsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueProduct f60713a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditProduct((CatalogueProduct) parcel.readParcelable(EditProduct.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditProduct[i];
            }
        }

        public EditProduct(CatalogueProduct product) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.f60713a = product;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditProduct) && Intrinsics.f(this.f60713a, ((EditProduct) obj2).f60713a);
        }

        public final int hashCode() {
            return this.f60713a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60713a, i);
        }
    }

    private CatalogueDetailsFlowContract$InputData() {
    }
}
