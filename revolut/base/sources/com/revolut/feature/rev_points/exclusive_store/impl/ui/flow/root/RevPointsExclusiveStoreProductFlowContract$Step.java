package com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nvb.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticle", "Checkout", "UnavailableProduct", "OptIn", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$Checkout;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$OptIn;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$UnavailableProduct;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsExclusiveStoreProductFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$Checkout;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends RevPointsExclusiveStoreProductFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83581a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83581a = productId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f83581a, ((Checkout) obj2).f83581a);
        }

        public final int hashCode() {
            return this.f83581a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83581a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$OptIn;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step;", "<init>", "()V", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptIn extends RevPointsExclusiveStoreProductFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptIn f83582a = new OptIn();

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptIn.f83582a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        private OptIn() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends RevPointsExclusiveStoreProductFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExclusiveStoreInputData.ArticleReference f83584b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle(parcel.readString(), (ExclusiveStoreInputData.ArticleReference) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(String productId, ExclusiveStoreInputData.ArticleReference articleReference) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(articleReference, "articleReference");
            this.f83583a = productId;
            this.f83584b = articleReference;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f83583a, productArticle.f83583a) && Intrinsics.f(this.f83584b, productArticle.f83584b);
        }

        public final int hashCode() {
            return this.f83584b.hashCode() + (this.f83583a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83583a);
            dest.writeParcelable(this.f83584b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step$UnavailableProduct;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnavailableProduct extends RevPointsExclusiveStoreProductFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnavailableProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f83585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83587c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnavailableProduct(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnavailableProduct[i];
            }
        }

        public UnavailableProduct(c reason, String str, String str2) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f83585a = reason;
            this.f83586b = str;
            this.f83587c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnavailableProduct)) {
                return false;
            }
            UnavailableProduct unavailableProduct = (UnavailableProduct) obj2;
            return this.f83585a == unavailableProduct.f83585a && Intrinsics.f(this.f83586b, unavailableProduct.f83586b) && Intrinsics.f(this.f83587c, unavailableProduct.f83587c);
        }

        public final int hashCode() {
            int iHashCode = this.f83585a.hashCode() * 31;
            String str = this.f83586b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f83587c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83585a.name());
            dest.writeString(this.f83586b);
            dest.writeString(this.f83587c);
        }
    }

    private RevPointsExclusiveStoreProductFlowContract$Step() {
    }
}
