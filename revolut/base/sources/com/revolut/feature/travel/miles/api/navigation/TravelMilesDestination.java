package com.revolut.feature.travel.miles.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/navigation/TravelMilesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelMilesDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f94149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f94150b;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesDestination(parcel.readInt() == 0 ? null : x0.valueOf(parcel.readString()), (TransitionAnimation) parcel.readParcelable(TravelMilesDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesDestination[i];
        }
    }

    public TravelMilesDestination(x0 x0Var, TransitionAnimation transitionAnimation) {
        this.f94149a = x0Var;
        this.f94150b = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF94150b() {
        return this.f94150b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesDestination)) {
            return false;
        }
        TravelMilesDestination travelMilesDestination = (TravelMilesDestination) obj2;
        return this.f94149a == travelMilesDestination.f94149a && Intrinsics.f(this.f94150b, travelMilesDestination.f94150b);
    }

    public final int hashCode() {
        x0 x0Var = this.f94149a;
        int iHashCode = (x0Var == null ? 0 : x0Var.hashCode()) * 31;
        TransitionAnimation transitionAnimation = this.f94150b;
        return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        x0 x0Var = this.f94149a;
        if (x0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(x0Var.name());
        }
        dest.writeParcelable(this.f94150b, i);
    }
}
