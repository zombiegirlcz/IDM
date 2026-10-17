package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChildAgePicker", "AgeRequiredWarningInfo", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep$AgeRequiredWarningInfo;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep$ChildAgePicker;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsGuestPickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep$AgeRequiredWarningInfo;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AgeRequiredWarningInfo implements TravelHotelsGuestPickerScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AgeRequiredWarningInfo f93959a = new AgeRequiredWarningInfo();

        @NotNull
        public static final Parcelable.Creator<AgeRequiredWarningInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AgeRequiredWarningInfo.f93959a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AgeRequiredWarningInfo[i];
            }
        }

        private AgeRequiredWarningInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep$ChildAgePicker;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildAgePicker implements TravelHotelsGuestPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChildAgePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsGuestPickerScreenContract$ChildAgePayload f93960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f93961b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChildAgePicker(TravelHotelsGuestPickerScreenContract$ChildAgePayload.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChildAgePicker[i];
            }
        }

        public ChildAgePicker(TravelHotelsGuestPickerScreenContract$ChildAgePayload payload, Integer num) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f93960a = payload;
            this.f93961b = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChildAgePicker)) {
                return false;
            }
            ChildAgePicker childAgePicker = (ChildAgePicker) obj2;
            return Intrinsics.f(this.f93960a, childAgePicker.f93960a) && Intrinsics.f(this.f93961b, childAgePicker.f93961b);
        }

        public final int hashCode() {
            int iHashCode = this.f93960a.hashCode() * 31;
            Integer num = this.f93961b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93960a.writeToParcel(dest, i);
            Integer num = this.f93961b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }
}
