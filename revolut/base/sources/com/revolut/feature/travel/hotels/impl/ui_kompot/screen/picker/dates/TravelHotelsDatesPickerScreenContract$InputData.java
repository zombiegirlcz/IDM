package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ycg.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NoSelection", "CurrentSelectedDates", "CustomSelectedDates", "ycg/e", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData$CurrentSelectedDates;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData$CustomSelectedDates;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData$NoSelection;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsDatesPickerScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData$CurrentSelectedDates;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrentSelectedDates implements TravelHotelsDatesPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CurrentSelectedDates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f93949a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrentSelectedDates(e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentSelectedDates[i];
            }
        }

        public CurrentSelectedDates() {
            this(0);
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData
        /* JADX INFO: renamed from: M, reason: from getter */
        public final e getF93953a() {
            return this.f93949a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrentSelectedDates) && this.f93949a == ((CurrentSelectedDates) obj2).f93949a;
        }

        public final int hashCode() {
            return this.f93949a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93949a.name());
        }

        public /* synthetic */ CurrentSelectedDates(int i) {
            this(e.UPDATE_GLOBAL);
        }

        public CurrentSelectedDates(e mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f93949a = mode;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData$CustomSelectedDates;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomSelectedDates implements TravelHotelsDatesPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CustomSelectedDates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f93950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f93952c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomSelectedDates((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomSelectedDates[i];
            }
        }

        public CustomSelectedDates(LocalDate localDate, LocalDate localDate2, e mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f93950a = localDate;
            this.f93951b = localDate2;
            this.f93952c = mode;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData
        /* JADX INFO: renamed from: M, reason: from getter */
        public final e getF93953a() {
            return this.f93952c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomSelectedDates)) {
                return false;
            }
            CustomSelectedDates customSelectedDates = (CustomSelectedDates) obj2;
            return Intrinsics.f(this.f93950a, customSelectedDates.f93950a) && Intrinsics.f(this.f93951b, customSelectedDates.f93951b) && this.f93952c == customSelectedDates.f93952c;
        }

        public final int hashCode() {
            LocalDate localDate = this.f93950a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.f93951b;
            return this.f93952c.hashCode() + ((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93950a);
            dest.writeSerializable(this.f93951b);
            dest.writeString(this.f93952c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData$NoSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/dates/TravelHotelsDatesPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoSelection implements TravelHotelsDatesPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NoSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f93953a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoSelection(e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoSelection[i];
            }
        }

        public NoSelection() {
            this(e.UPDATE_GLOBAL);
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData
        /* JADX INFO: renamed from: M, reason: from getter */
        public final e getF93953a() {
            return this.f93953a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoSelection) && this.f93953a == ((NoSelection) obj2).f93953a;
        }

        public final int hashCode() {
            return this.f93953a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93953a.name());
        }

        public NoSelection(e mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f93953a = mode;
        }
    }

    /* JADX INFO: renamed from: M */
    e getF93953a();
}
