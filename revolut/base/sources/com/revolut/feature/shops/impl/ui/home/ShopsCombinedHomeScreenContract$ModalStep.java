package com.revolut.feature.shops.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.kompot.navigable.flow.FlowStep;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RevPointsBottomSheet", "SoldOutDialog", "ComingSoonDialog", "LockedDialog", "PurchaseItemDialog", "BidAuction", "LocationPermissions", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$BidAuction;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$ComingSoonDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$LocationPermissions;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$LockedDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$PurchaseItemDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$SoldOutDialog;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsCombinedHomeScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$BidAuction;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BidAuction extends ShopsCombinedHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BidAuction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShopsAuction.Offer f87185a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BidAuction((ShopsAuction.Offer) parcel.readParcelable(BidAuction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BidAuction[i];
            }
        }

        public BidAuction(ShopsAuction.Offer auctionOffer) {
            Intrinsics.checkNotNullParameter(auctionOffer, "auctionOffer");
            this.f87185a = auctionOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BidAuction) && Intrinsics.f(this.f87185a, ((BidAuction) obj2).f87185a);
        }

        public final int hashCode() {
            return this.f87185a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87185a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$ComingSoonDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "<init>", "()V", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ComingSoonDialog extends ShopsCombinedHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComingSoonDialog f87186a = new ComingSoonDialog();

        @NotNull
        public static final Parcelable.Creator<ComingSoonDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ComingSoonDialog.f87186a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComingSoonDialog[i];
            }
        }

        private ComingSoonDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$LocationPermissions;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "<init>", "()V", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocationPermissions extends ShopsCombinedHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationPermissions f87187a = new LocationPermissions();

        @NotNull
        public static final Parcelable.Creator<LocationPermissions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocationPermissions.f87187a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationPermissions[i];
            }
        }

        private LocationPermissions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$LockedDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LockedDialog extends ShopsCombinedHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LockedDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f87188a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LockedDialog(w0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LockedDialog[i];
            }
        }

        public LockedDialog(w0 minPlan) {
            Intrinsics.checkNotNullParameter(minPlan, "minPlan");
            this.f87188a = minPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LockedDialog) && this.f87188a == ((LockedDialog) obj2).f87188a;
        }

        public final int hashCode() {
            return this.f87188a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87188a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$PurchaseItemDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurchaseItemDialog extends ShopsCombinedHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PurchaseItemDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShopsPurchase f87189a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurchaseItemDialog((ShopsPurchase) parcel.readParcelable(PurchaseItemDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchaseItemDialog[i];
            }
        }

        public PurchaseItemDialog(ShopsPurchase purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f87189a = purchase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurchaseItemDialog) && Intrinsics.f(this.f87189a, ((PurchaseItemDialog) obj2).f87189a);
        }

        public final int hashCode() {
            return this.f87189a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87189a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "<init>", "()V", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet extends ShopsCombinedHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f87190a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f87190a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsBottomSheet[i];
            }
        }

        private RevPointsBottomSheet() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep$SoldOutDialog;", "Lcom/revolut/feature/shops/impl/ui/home/ShopsCombinedHomeScreenContract$ModalStep;", "<init>", "()V", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SoldOutDialog extends ShopsCombinedHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SoldOutDialog f87191a = new SoldOutDialog();

        @NotNull
        public static final Parcelable.Creator<SoldOutDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SoldOutDialog.f87191a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SoldOutDialog[i];
            }
        }

        private SoldOutDialog() {
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

    private ShopsCombinedHomeScreenContract$ModalStep() {
    }
}
