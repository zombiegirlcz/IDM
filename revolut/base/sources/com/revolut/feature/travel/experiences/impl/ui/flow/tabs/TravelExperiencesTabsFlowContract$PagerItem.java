package com.revolut.feature.travel.experiences.impl.ui.flow.tabs;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Discover", "Bookings", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem$Bookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem$Discover;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesTabsFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem$Bookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bookings extends TravelExperiencesTabsFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Bookings f93003a = new Bookings();

        @NotNull
        public static final Parcelable.Creator<Bookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Bookings.f93003a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bookings[i];
            }
        }

        private Bookings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem$Discover;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Discover extends TravelExperiencesTabsFlowContract$PagerItem {

        @NotNull
        public static final Parcelable.Creator<Discover> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceDatesSelection f93004a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Discover((TravelExperienceDatesSelection) parcel.readParcelable(Discover.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discover[i];
            }
        }

        public Discover() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Discover) && Intrinsics.f(this.f93004a, ((Discover) obj2).f93004a);
        }

        public final int hashCode() {
            return this.f93004a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93004a, i);
        }

        public Discover(TravelExperienceDatesSelection datesSelection) {
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f93004a = datesSelection;
        }

        public /* synthetic */ Discover(int i) {
            this(TravelExperienceDatesSelection.NoDatesSelection.f92906a);
        }
    }

    private TravelExperiencesTabsFlowContract$PagerItem() {
    }
}
