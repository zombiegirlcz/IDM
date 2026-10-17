package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext;", "Landroid/os/Parcelable;", "<init>", "()V", "Product", "Auction", "SoldOutProduct", "LockedProduct", "ComingSoonProduct", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$Auction;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$ComingSoonProduct;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$LockedProduct;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$Product;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$SoldOutProduct;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreExclusivesOfferContext implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$Auction;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Auction extends StoreExclusivesOfferContext {

        @NotNull
        public static final Parcelable.Creator<Auction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreAuctionOffer f88512a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Auction(StoreAuctionOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Auction[i];
            }
        }

        public Auction(StoreAuctionOffer offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f88512a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Auction) && Intrinsics.f(this.f88512a, ((Auction) obj2).f88512a);
        }

        public final int hashCode() {
            return this.f88512a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88512a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$ComingSoonProduct;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ComingSoonProduct extends StoreExclusivesOfferContext {

        @NotNull
        public static final Parcelable.Creator<ComingSoonProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreComingSoonProductOffer f88513a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComingSoonProduct(StoreComingSoonProductOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComingSoonProduct[i];
            }
        }

        public ComingSoonProduct(StoreComingSoonProductOffer offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f88513a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ComingSoonProduct) && Intrinsics.f(this.f88513a, ((ComingSoonProduct) obj2).f88513a);
        }

        public final int hashCode() {
            return this.f88513a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88513a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$LockedProduct;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LockedProduct extends StoreExclusivesOfferContext {

        @NotNull
        public static final Parcelable.Creator<LockedProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreLockedProductOffer f88514a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LockedProduct(StoreLockedProductOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LockedProduct[i];
            }
        }

        public LockedProduct(StoreLockedProductOffer offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f88514a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LockedProduct) && Intrinsics.f(this.f88514a, ((LockedProduct) obj2).f88514a);
        }

        public final int hashCode() {
            return this.f88514a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88514a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$Product;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product extends StoreExclusivesOfferContext {

        @NotNull
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreProductOffer f88515a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Product(StoreProductOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Product[i];
            }
        }

        public Product(StoreProductOffer offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f88515a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Product) && Intrinsics.f(this.f88515a, ((Product) obj2).f88515a);
        }

        public final int hashCode() {
            return this.f88515a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88515a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext$SoldOutProduct;", "Lcom/revolut/feature/store/api/model/StoreExclusivesOfferContext;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SoldOutProduct extends StoreExclusivesOfferContext {

        @NotNull
        public static final Parcelable.Creator<SoldOutProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoreSoldOutProductOffer f88516a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SoldOutProduct(StoreSoldOutProductOffer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SoldOutProduct[i];
            }
        }

        public SoldOutProduct(StoreSoldOutProductOffer offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f88516a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SoldOutProduct) && Intrinsics.f(this.f88516a, ((SoldOutProduct) obj2).f88516a);
        }

        public final int hashCode() {
            return this.f88516a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88516a.writeToParcel(dest, i);
        }
    }

    private StoreExclusivesOfferContext() {
    }
}
