package com.revolut.feature.shops.impl.ui.carousel_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PurchaseItemDialog", "BidAuction", "Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep$BidAuction;", "Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep$PurchaseItemDialog;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsCarouselDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep$BidAuction;", "Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BidAuction extends ShopsCarouselDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BidAuction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShopsAuction.Offer f87150a;

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
            this.f87150a = auctionOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BidAuction) && Intrinsics.f(this.f87150a, ((BidAuction) obj2).f87150a);
        }

        public final int hashCode() {
            return this.f87150a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87150a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep$PurchaseItemDialog;", "Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurchaseItemDialog extends ShopsCarouselDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PurchaseItemDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShopsPurchase f87151a;

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
            this.f87151a = purchase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurchaseItemDialog) && Intrinsics.f(this.f87151a, ((PurchaseItemDialog) obj2).f87151a);
        }

        public final int hashCode() {
            return this.f87151a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87151a, i);
        }
    }

    private ShopsCarouselDetailsScreenContract$ModalStep() {
    }
}
