package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LitePos", "ShoppingCart", "CatalogueManagement", "CatalogueCategoryDetails", "CatalogueProductDetails", "CatalogueSinglePick", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueCategoryDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueManagement;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueProductDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueSinglePick;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$LitePos;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$ShoppingCart;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LitePosRootFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueManagement;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CatalogueManagement extends LitePosRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CatalogueManagement f60753a = new CatalogueManagement();

        @NotNull
        public static final Parcelable.Creator<CatalogueManagement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CatalogueManagement.f60753a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueManagement[i];
            }
        }

        private CatalogueManagement() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueProductDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CatalogueProductDetails extends LitePosRootFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CatalogueProductDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueProduct f60754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CatalogueCategory f60755b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CatalogueProductDetails((CatalogueProduct) parcel.readParcelable(CatalogueProductDetails.class.getClassLoader()), (CatalogueCategory) parcel.readParcelable(CatalogueProductDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueProductDetails[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CatalogueProductDetails() {
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
            if (!(obj2 instanceof CatalogueProductDetails)) {
                return false;
            }
            CatalogueProductDetails catalogueProductDetails = (CatalogueProductDetails) obj2;
            return Intrinsics.f(this.f60754a, catalogueProductDetails.f60754a) && Intrinsics.f(this.f60755b, catalogueProductDetails.f60755b);
        }

        public final int hashCode() {
            CatalogueProduct catalogueProduct = this.f60754a;
            int iHashCode = (catalogueProduct == null ? 0 : catalogueProduct.hashCode()) * 31;
            CatalogueCategory catalogueCategory = this.f60755b;
            return iHashCode + (catalogueCategory != null ? catalogueCategory.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60754a, i);
            dest.writeParcelable(this.f60755b, i);
        }

        public CatalogueProductDetails(CatalogueProduct catalogueProduct, CatalogueCategory catalogueCategory) {
            this.f60754a = catalogueProduct;
            this.f60755b = catalogueCategory;
        }

        public /* synthetic */ CatalogueProductDetails(CatalogueProduct catalogueProduct, CatalogueCategory catalogueCategory, int i) {
            this((i & 1) != 0 ? null : catalogueProduct, (i & 2) != 0 ? null : catalogueCategory);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueSinglePick;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CatalogueSinglePick extends LitePosRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CatalogueSinglePick f60756a = new CatalogueSinglePick();

        @NotNull
        public static final Parcelable.Creator<CatalogueSinglePick> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CatalogueSinglePick.f60756a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueSinglePick[i];
            }
        }

        private CatalogueSinglePick() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$LitePos;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LitePos extends LitePosRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LitePos f60757a = new LitePos();

        @NotNull
        public static final Parcelable.Creator<LitePos> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LitePos.f60757a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LitePos[i];
            }
        }

        private LitePos() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$ShoppingCart;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShoppingCart extends LitePosRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShoppingCart f60758a = new ShoppingCart();

        @NotNull
        public static final Parcelable.Creator<ShoppingCart> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShoppingCart.f60758a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShoppingCart[i];
            }
        }

        private ShoppingCart() {
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

    private LitePosRootFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step$CatalogueCategoryDetails;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CatalogueCategoryDetails extends LitePosRootFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CatalogueCategoryDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f60752a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CatalogueCategoryDetails((CatalogueCategory) parcel.readParcelable(CatalogueCategoryDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueCategoryDetails[i];
            }
        }

        public CatalogueCategoryDetails(CatalogueCategory catalogueCategory) {
            this.f60752a = catalogueCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CatalogueCategoryDetails) && Intrinsics.f(this.f60752a, ((CatalogueCategoryDetails) obj2).f60752a);
        }

        public final int hashCode() {
            CatalogueCategory catalogueCategory = this.f60752a;
            if (catalogueCategory == null) {
                return 0;
            }
            return catalogueCategory.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60752a, i);
        }

        public CatalogueCategoryDetails() {
            this((CatalogueCategory) null);
        }

        public /* synthetic */ CatalogueCategoryDetails(int i) {
            this((CatalogueCategory) null);
        }
    }
}
