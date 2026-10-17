package com.revolut.feature.travel.hotels.impl.declaration.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/declaration/kompot/TravelHotelsRoomDetailsKompotDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomDetailsKompotDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomDetailsKompotDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomDetailsParams f93655a;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsRoomDetailsKompotDestination(TravelHotelsRoomDetailsParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomDetailsKompotDestination[i];
        }
    }

    public TravelHotelsRoomDetailsKompotDestination(TravelHotelsRoomDetailsParams roomDetailsInput) {
        Intrinsics.checkNotNullParameter(roomDetailsInput, "roomDetailsInput");
        this.f93655a = roomDetailsInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TravelHotelsRoomDetailsKompotDestination) && Intrinsics.f(this.f93655a, ((TravelHotelsRoomDetailsKompotDestination) obj2).f93655a);
    }

    public final int hashCode() {
        return this.f93655a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f93655a.writeToParcel(dest, i);
    }
}
