package com.revolut.feature.travel.flights.impl.ui.screen.baggage_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsBaggageInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsBaggageInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f93239a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode;", "Landroid/os/Parcelable;", "StaticInfo", "BaggageItems", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode$BaggageItems;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode$StaticInfo;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode$BaggageItems;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BaggageItems implements Mode {

            @NotNull
            public static final Parcelable.Creator<BaggageItems> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f93240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f93241b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BaggageItems.class, parcel, arrayList, iE, 1);
                    }
                    return new BaggageItems(arrayList, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BaggageItems[i];
                }
            }

            public BaggageItems(ArrayList items, boolean z) {
                Intrinsics.checkNotNullParameter(items, "items");
                this.f93240a = items;
                this.f93241b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BaggageItems)) {
                    return false;
                }
                BaggageItems baggageItems = (BaggageItems) obj2;
                return this.f93240a.equals(baggageItems.f93240a) && this.f93241b == baggageItems.f93241b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f93241b) + (this.f93240a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f93240a, dest);
                while (itY.hasNext()) {
                    dest.writeParcelable((Parcelable) itY.next(), i);
                }
                dest.writeInt(this.f93241b ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode$StaticInfo;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreenContract$InputData$Mode;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StaticInfo implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final StaticInfo f93242a = new StaticInfo();

            @NotNull
            public static final Parcelable.Creator<StaticInfo> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return StaticInfo.f93242a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StaticInfo[i];
                }
            }

            private StaticInfo() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof StaticInfo);
            }

            public final int hashCode() {
                return -1342529832;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsBaggageInfoScreenContract$InputData((Mode) parcel.readParcelable(TravelFlightsBaggageInfoScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsBaggageInfoScreenContract$InputData[i];
        }
    }

    public TravelFlightsBaggageInfoScreenContract$InputData(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f93239a = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TravelFlightsBaggageInfoScreenContract$InputData) && Intrinsics.f(this.f93239a, ((TravelFlightsBaggageInfoScreenContract$InputData) obj2).f93239a);
    }

    public final int hashCode() {
        return this.f93239a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93239a, i);
    }
}
