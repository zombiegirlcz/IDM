package com.revolut.feature.travel.experiences.impl.ui.flow.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$Step;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Onboarding", "Home", "CheckoutFlow", "BookingDetails", "Search", "PastAndCancelledBookings", "ActiveBookings", "OptIn", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$ActiveBookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$BookingDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$CheckoutFlow;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$Home;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$Onboarding;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$OptIn;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$PastAndCancelledBookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$Search;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesHomeFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$ActiveBookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActiveBookings extends TravelExperiencesHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActiveBookings f92986a = new ActiveBookings();

        @NotNull
        public static final Parcelable.Creator<ActiveBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActiveBookings.f92986a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveBookings[i];
            }
        }

        private ActiveBookings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$BookingDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingDetails extends TravelExperiencesHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BookingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f92988b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingDetails(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingDetails[i];
            }
        }

        public BookingDetails(String bookingId, boolean z) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f92987a = bookingId;
            this.f92988b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingDetails)) {
                return false;
            }
            BookingDetails bookingDetails = (BookingDetails) obj2;
            return Intrinsics.f(this.f92987a, bookingDetails.f92987a) && this.f92988b == bookingDetails.f92988b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f92988b) + (this.f92987a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92987a);
            dest.writeInt(this.f92988b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$CheckoutFlow;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckoutFlow extends TravelExperiencesHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CheckoutFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesCheckoutFlowContract$Step f92989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92990b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckoutFlow((TravelExperiencesCheckoutFlowContract$Step) parcel.readParcelable(CheckoutFlow.class.getClassLoader()), (TravelExperienceDatesSelection) parcel.readParcelable(CheckoutFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckoutFlow[i];
            }
        }

        public CheckoutFlow(TravelExperiencesCheckoutFlowContract$Step step, TravelExperienceDatesSelection travelExperienceDatesSelection) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.f92989a = step;
            this.f92990b = travelExperienceDatesSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CheckoutFlow)) {
                return false;
            }
            CheckoutFlow checkoutFlow = (CheckoutFlow) obj2;
            return Intrinsics.f(this.f92989a, checkoutFlow.f92989a) && Intrinsics.f(this.f92990b, checkoutFlow.f92990b);
        }

        public final int hashCode() {
            int iHashCode = this.f92989a.hashCode() * 31;
            TravelExperienceDatesSelection travelExperienceDatesSelection = this.f92990b;
            return iHashCode + (travelExperienceDatesSelection == null ? 0 : travelExperienceDatesSelection.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92989a, i);
            dest.writeParcelable(this.f92990b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$Home;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends TravelExperiencesHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesTabsFlowContract$PagerItem f92991a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home((TravelExperiencesTabsFlowContract$PagerItem) parcel.readParcelable(Home.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(TravelExperiencesTabsFlowContract$PagerItem tab2) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            this.f92991a = tab2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f92991a, ((Home) obj2).f92991a);
        }

        public final int hashCode() {
            return this.f92991a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92991a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$Onboarding;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding extends TravelExperiencesHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f92992a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarding((ProductArticleParams) parcel.readParcelable(Onboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        public Onboarding(ProductArticleParams productArticleParams) {
            Intrinsics.checkNotNullParameter(productArticleParams, "productArticleParams");
            this.f92992a = productArticleParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onboarding) && Intrinsics.f(this.f92992a, ((Onboarding) obj2).f92992a);
        }

        public final int hashCode() {
            return this.f92992a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92992a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$OptIn;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptIn extends TravelExperiencesHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesHomeFlowContract$Step f92993a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptIn((TravelExperiencesHomeFlowContract$Step) parcel.readParcelable(OptIn.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        public OptIn(TravelExperiencesHomeFlowContract$Step nextStep) {
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.f92993a = nextStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptIn) && Intrinsics.f(this.f92993a, ((OptIn) obj2).f92993a);
        }

        public final int hashCode() {
            return this.f92993a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92993a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$PastAndCancelledBookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PastAndCancelledBookings extends TravelExperiencesHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PastAndCancelledBookings f92994a = new PastAndCancelledBookings();

        @NotNull
        public static final Parcelable.Creator<PastAndCancelledBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PastAndCancelledBookings.f92994a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PastAndCancelledBookings[i];
            }
        }

        private PastAndCancelledBookings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step$Search;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$Step;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Search extends TravelExperiencesHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Search f92995a = new Search();

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Search.f92995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        private Search() {
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

    private TravelExperiencesHomeFlowContract$Step() {
    }
}
