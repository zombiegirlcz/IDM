package com.revolut.feature.shops.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TermsReview", "Countries", "Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep$Countries;", "Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep$TermsReview;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShopsCampaignCheckoutScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep$Countries;", "Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Countries extends ShopsCampaignCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Countries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87164a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Countries(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Countries[i];
            }
        }

        public Countries(List countryCodes) {
            Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
            this.f87164a = countryCodes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Countries) && Intrinsics.f(this.f87164a, ((Countries) obj2).f87164a);
        }

        public final int hashCode() {
            return this.f87164a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f87164a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep$TermsReview;", "Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsReview extends ShopsCampaignCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTermsReviewInputData f87165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ShopsCampaignOffer f87166b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsReview((RevPointsTermsReviewInputData) parcel.readParcelable(TermsReview.class.getClassLoader()), (ShopsCampaignOffer) parcel.readParcelable(TermsReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsReview[i];
            }
        }

        public TermsReview(RevPointsTermsReviewInputData inputData, ShopsCampaignOffer campaign) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(campaign, "campaign");
            this.f87165a = inputData;
            this.f87166b = campaign;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsReview)) {
                return false;
            }
            TermsReview termsReview = (TermsReview) obj2;
            return Intrinsics.f(this.f87165a, termsReview.f87165a) && Intrinsics.f(this.f87166b, termsReview.f87166b);
        }

        public final int hashCode() {
            return this.f87166b.hashCode() + (this.f87165a.f83546a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87165a, i);
            dest.writeParcelable(this.f87166b, i);
        }
    }

    private ShopsCampaignCheckoutScreenContract$ModalStep() {
    }
}
