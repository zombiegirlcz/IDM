package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreSearchOrder;", "Landroid/os/Parcelable;", "Purchase", "GiftCard", "Lcom/revolut/feature/store/api/model/StoreSearchOrder$GiftCard;", "Lcom/revolut/feature/store/api/model/StoreSearchOrder$Purchase;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoreSearchOrder extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreSearchOrder$GiftCard;", "Lcom/revolut/feature/store/api/model/StoreSearchOrder;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftCard implements StoreSearchOrder {

        @NotNull
        public static final Parcelable.Creator<GiftCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserVoucher f88600a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftCard((UserVoucher) parcel.readParcelable(GiftCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftCard[i];
            }
        }

        public GiftCard(UserVoucher voucher) {
            Intrinsics.checkNotNullParameter(voucher, "voucher");
            this.f88600a = voucher;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GiftCard) && Intrinsics.f(this.f88600a, ((GiftCard) obj2).f88600a);
        }

        public final int hashCode() {
            return this.f88600a.hashCode();
        }

        @Override // com.revolut.feature.store.api.model.StoreSearchOrder
        public final Instant m2() {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(this.f88600a.f83621c);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            return instantOfEpochMilli;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88600a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreSearchOrder$Purchase;", "Lcom/revolut/feature/store/api/model/StoreSearchOrder;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Purchase implements StoreSearchOrder {

        @NotNull
        public static final Parcelable.Creator<Purchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StorePurchase f88601a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Purchase(StorePurchase.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Purchase[i];
            }
        }

        public Purchase(StorePurchase purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f88601a = purchase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Purchase) && Intrinsics.f(this.f88601a, ((Purchase) obj2).f88601a);
        }

        public final int hashCode() {
            return this.f88601a.hashCode();
        }

        @Override // com.revolut.feature.store.api.model.StoreSearchOrder
        public final Instant m2() {
            return this.f88601a.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88601a.writeToParcel(dest, i);
        }
    }

    Instant m2();
}
