package com.revolut.feature.travel.flights.impl.ui.screen.passengers_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.model.TravelFlightsPassengerField$Selection$Option;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CountrySelection", "OptionSelection", "PriceChanged", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep$CountrySelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep$OptionSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep$PriceChanged;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelFlightsPassengersDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep$CountrySelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountrySelection implements TravelFlightsPassengersDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CountrySelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f93359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f93360c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountrySelection(parcel.readString(), (Clause) parcel.readParcelable(CountrySelection.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelection[i];
            }
        }

        public CountrySelection(String listId, Clause title, b bVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f93358a = listId;
            this.f93359b = title;
            this.f93360c = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CountrySelection)) {
                return false;
            }
            CountrySelection countrySelection = (CountrySelection) obj2;
            return Intrinsics.f(this.f93358a, countrySelection.f93358a) && Intrinsics.f(this.f93359b, countrySelection.f93359b) && Intrinsics.f(this.f93360c, countrySelection.f93360c);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f93358a.hashCode() * 31, 31, this.f93359b);
            b bVar = this.f93360c;
            return iA + (bVar == null ? 0 : bVar.f297794a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93358a);
            dest.writeParcelable(this.f93359b, i);
            dest.writeSerializable(this.f93360c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep$OptionSelection;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptionSelection implements TravelFlightsPassengersDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OptionSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f93362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f93363c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Clause clause = (Clause) parcel.readParcelable(OptionSelection.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsPassengerField$Selection$Option.CREATOR, parcel, arrayList, iA, 1);
                }
                return new OptionSelection(string, clause, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionSelection[i];
            }
        }

        public OptionSelection(String listId, Clause title, List options, String str) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(options, "options");
            this.f93361a = listId;
            this.f93362b = title;
            this.f93363c = options;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OptionSelection)) {
                return false;
            }
            OptionSelection optionSelection = (OptionSelection) obj2;
            return Intrinsics.f(this.f93361a, optionSelection.f93361a) && Intrinsics.f(this.f93362b, optionSelection.f93362b) && Intrinsics.f(this.f93363c, optionSelection.f93363c) && Intrinsics.f(this.d, optionSelection.d);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.a(this.f93361a.hashCode() * 31, 31, this.f93362b), 31, this.f93363c);
            String str = this.d;
            return iD + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93361a);
            dest.writeParcelable(this.f93362b, i);
            Iterator itV = p.a.v(this.f93363c, dest);
            while (itV.hasNext()) {
                ((TravelFlightsPassengerField$Selection$Option) itV.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep$PriceChanged;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PriceChanged implements TravelFlightsPassengersDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PriceChanged f93364a = new PriceChanged();

        @NotNull
        public static final Parcelable.Creator<PriceChanged> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PriceChanged.f93364a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceChanged[i];
            }
        }

        private PriceChanged() {
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
