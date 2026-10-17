package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DeleteConfirmation", "SelectTaxRate", "ManageTaxRates", "AddCategory", "EmptyCategories", "Categories", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$AddCategory;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$Categories;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$DeleteConfirmation;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$EmptyCategories;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$ManageTaxRates;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$SelectTaxRate;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$AddCategory;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddCategory implements ProductDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddCategory f60819a = new AddCategory();

        @NotNull
        public static final Parcelable.Creator<AddCategory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddCategory.f60819a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCategory[i];
            }
        }

        private AddCategory() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof AddCategory);
        }

        public final int hashCode() {
            return -1957997946;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$Categories;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Categories implements ProductDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Categories f60820a = new Categories();

        @NotNull
        public static final Parcelable.Creator<Categories> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Categories.f60820a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Categories[i];
            }
        }

        private Categories() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Categories);
        }

        public final int hashCode() {
            return 1955891061;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$DeleteConfirmation;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteConfirmation implements ProductDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteConfirmation f60821a = new DeleteConfirmation();

        @NotNull
        public static final Parcelable.Creator<DeleteConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeleteConfirmation.f60821a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteConfirmation[i];
            }
        }

        private DeleteConfirmation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof DeleteConfirmation);
        }

        public final int hashCode() {
            return -1468197415;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$EmptyCategories;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmptyCategories implements ProductDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EmptyCategories f60822a = new EmptyCategories();

        @NotNull
        public static final Parcelable.Creator<EmptyCategories> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EmptyCategories.f60822a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmptyCategories[i];
            }
        }

        private EmptyCategories() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof EmptyCategories);
        }

        public final int hashCode() {
            return 2092292496;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$ManageTaxRates;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageTaxRates implements ProductDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageTaxRates f60823a = new ManageTaxRates();

        @NotNull
        public static final Parcelable.Creator<ManageTaxRates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageTaxRates.f60823a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageTaxRates[i];
            }
        }

        private ManageTaxRates() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ManageTaxRates);
        }

        public final int hashCode() {
            return 1356753926;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep$SelectTaxRate;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/ProductDetailsScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTaxRate implements ProductDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectTaxRate f60824a = new SelectTaxRate();

        @NotNull
        public static final Parcelable.Creator<SelectTaxRate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectTaxRate.f60824a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTaxRate[i];
            }
        }

        private SelectTaxRate() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof SelectTaxRate);
        }

        public final int hashCode() {
            return 1728140950;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
