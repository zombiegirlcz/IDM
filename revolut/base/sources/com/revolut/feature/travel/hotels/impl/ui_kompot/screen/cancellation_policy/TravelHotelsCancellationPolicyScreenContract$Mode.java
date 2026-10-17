package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$Mode", "Landroid/os/Parcelable;", "ManageCancellation", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$Mode$ManageCancellation;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsCancellationPolicyScreenContract$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$Mode$ManageCancellation;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageCancellation implements TravelHotelsCancellationPolicyScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<ManageCancellation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93876a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageCancellation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageCancellation[i];
            }
        }

        public ManageCancellation(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f93876a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageCancellation) && Intrinsics.f(this.f93876a, ((ManageCancellation) obj2).f93876a);
        }

        public final int hashCode() {
            return this.f93876a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93876a);
        }
    }
}
