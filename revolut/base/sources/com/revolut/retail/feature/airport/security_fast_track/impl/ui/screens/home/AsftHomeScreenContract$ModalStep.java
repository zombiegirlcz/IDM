package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPointsBottomSheet", "PreparingPassInfo", "PassAvailableSoon", "ManageBooking", "CancelBooking", "ProductArticle", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$CancelBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$ManageBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$PassAvailableSoon;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$PreparingPassInfo;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$ProductArticle;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$RevPointsBottomSheet;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftHomeScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$CancelBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelBooking implements AsftHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftCancelBookingScreenContract$InputData f98829a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelBooking(AsftCancelBookingScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelBooking[i];
            }
        }

        public CancelBooking(AsftCancelBookingScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f98829a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelBooking) && Intrinsics.f(this.f98829a, ((CancelBooking) obj2).f98829a);
        }

        public final int hashCode() {
            return this.f98829a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f98829a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$ManageBooking;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageBooking implements AsftHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ManageBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsftManageBookingPayload f98830a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageBooking(AsftManageBookingPayload.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageBooking[i];
            }
        }

        public ManageBooking(AsftManageBookingPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f98830a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageBooking) && Intrinsics.f(this.f98830a, ((ManageBooking) obj2).f98830a);
        }

        public final int hashCode() {
            return this.f98830a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f98830a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$PassAvailableSoon;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassAvailableSoon implements AsftHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PassAvailableSoon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AsftManageBookingPayload f98832b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PassAvailableSoon(parcel.readInt(), AsftManageBookingPayload.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassAvailableSoon[i];
            }
        }

        public PassAvailableSoon(int i, AsftManageBookingPayload manageBookingPayload) {
            Intrinsics.checkNotNullParameter(manageBookingPayload, "manageBookingPayload");
            this.f98831a = i;
            this.f98832b = manageBookingPayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PassAvailableSoon)) {
                return false;
            }
            PassAvailableSoon passAvailableSoon = (PassAvailableSoon) obj2;
            return this.f98831a == passAvailableSoon.f98831a && Intrinsics.f(this.f98832b, passAvailableSoon.f98832b);
        }

        public final int hashCode() {
            return this.f98832b.hashCode() + (Integer.hashCode(this.f98831a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98831a);
            this.f98832b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$PreparingPassInfo;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreparingPassInfo implements AsftHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreparingPassInfo f98833a = new PreparingPassInfo();

        @NotNull
        public static final Parcelable.Creator<PreparingPassInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreparingPassInfo.f98833a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreparingPassInfo[i];
            }
        }

        private PreparingPassInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$ProductArticle;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements AsftHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f98834a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f98834a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f98834a, ((ProductArticle) obj2).f98834a);
        }

        public final int hashCode() {
            return this.f98834a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98834a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/AsftHomeScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet implements AsftHomeScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f98835a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f98835a;
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
}
