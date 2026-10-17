package com.revolut.feature.acquiring.lite_pos.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "AddProductDestination", "CreateCategoryDestination", "EditCategoryDestination", "EditProductDestination", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$AddProductDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$CreateCategoryDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$EditCategoryDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$EditProductDestination;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CatalogueDetailsDestination extends InternalDestination<IOData$EmptyInput> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$AddProductDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddProductDestination extends CatalogueDetailsDestination {

        @NotNull
        public static final Parcelable.Creator<AddProductDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CatalogueCategory f60706b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddProductDestination((CatalogueCategory) parcel.readParcelable(AddProductDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddProductDestination[i];
            }
        }

        public AddProductDestination(CatalogueCategory catalogueCategory) {
            super(0);
            this.f60706b = catalogueCategory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CatalogueCategory getF60706b() {
            return this.f60706b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddProductDestination) && Intrinsics.f(this.f60706b, ((AddProductDestination) obj2).f60706b);
        }

        public final int hashCode() {
            CatalogueCategory catalogueCategory = this.f60706b;
            if (catalogueCategory == null) {
                return 0;
            }
            return catalogueCategory.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60706b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$CreateCategoryDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateCategoryDestination extends CatalogueDetailsDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CreateCategoryDestination f60707b = new CreateCategoryDestination(0);

        @NotNull
        public static final Parcelable.Creator<CreateCategoryDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateCategoryDestination.f60707b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateCategoryDestination[i];
            }
        }

        private CreateCategoryDestination() {
            super(0);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$EditCategoryDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditCategoryDestination extends CatalogueDetailsDestination {

        @NotNull
        public static final Parcelable.Creator<EditCategoryDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CatalogueCategory f60708b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditCategoryDestination((CatalogueCategory) parcel.readParcelable(EditCategoryDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditCategoryDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditCategoryDestination(CatalogueCategory category) {
            super(0);
            Intrinsics.checkNotNullParameter(category, "category");
            this.f60708b = category;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CatalogueCategory getF60708b() {
            return this.f60708b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditCategoryDestination) && Intrinsics.f(this.f60708b, ((EditCategoryDestination) obj2).f60708b);
        }

        public final int hashCode() {
            return this.f60708b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60708b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination$EditProductDestination;", "Lcom/revolut/feature/acquiring/lite_pos/impl/navigation/CatalogueDetailsDestination;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditProductDestination extends CatalogueDetailsDestination {

        @NotNull
        public static final Parcelable.Creator<EditProductDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CatalogueProduct f60709b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditProductDestination((CatalogueProduct) parcel.readParcelable(EditProductDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditProductDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditProductDestination(CatalogueProduct product) {
            super(0);
            Intrinsics.checkNotNullParameter(product, "product");
            this.f60709b = product;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CatalogueProduct getF60709b() {
            return this.f60709b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditProductDestination) && Intrinsics.f(this.f60709b, ((EditProductDestination) obj2).f60709b);
        }

        public final int hashCode() {
            return this.f60709b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60709b, i);
        }
    }

    public /* synthetic */ CatalogueDetailsDestination(int i) {
        this();
    }

    private CatalogueDetailsDestination() {
        super(IOData$EmptyInput.f98299a);
    }
}
