package com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotel/transfers/impl/ui/screen/home/TravelHotelTransfersHomeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UnlinkAccount", "Lcom/revolut/feature/travel/hotel/transfers/impl/ui/screen/home/TravelHotelTransfersHomeScreenContract$ModalStep$UnlinkAccount;", "feature_travel_hotel_transfers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelTransfersHomeScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotel/transfers/impl/ui/screen/home/TravelHotelTransfersHomeScreenContract$ModalStep$UnlinkAccount;", "Lcom/revolut/feature/travel/hotel/transfers/impl/ui/screen/home/TravelHotelTransfersHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotel_transfers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnlinkAccount implements TravelHotelTransfersHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnlinkAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93604b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnlinkAccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnlinkAccount[i];
            }
        }

        public UnlinkAccount(String agentId, String name) {
            Intrinsics.checkNotNullParameter(agentId, "agentId");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f93603a = agentId;
            this.f93604b = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnlinkAccount)) {
                return false;
            }
            UnlinkAccount unlinkAccount = (UnlinkAccount) obj2;
            return Intrinsics.f(this.f93603a, unlinkAccount.f93603a) && Intrinsics.f(this.f93604b, unlinkAccount.f93604b);
        }

        public final int hashCode() {
            return this.f93604b.hashCode() + (this.f93603a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93603a);
            dest.writeString(this.f93604b);
        }
    }
}
