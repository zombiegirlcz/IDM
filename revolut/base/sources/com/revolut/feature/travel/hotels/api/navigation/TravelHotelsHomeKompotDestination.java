package com.revolut.feature.travel.hotels.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsHomeKompotDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "r8g/a", "EntryPoint", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsHomeKompotDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsHomeKompotDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionAnimation f93630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8g.a f93631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EntryPoint f93632c;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsHomeKompotDestination$EntryPoint;", "Landroid/os/Parcelable;", "External", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsHomeKompotDestination$EntryPoint$External;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface EntryPoint extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsHomeKompotDestination$EntryPoint$External;", "Lcom/revolut/feature/travel/hotels/api/navigation/TravelHotelsHomeKompotDestination$EntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class External implements EntryPoint {

            @NotNull
            public static final Parcelable.Creator<External> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f93633a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new External(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new External[i];
                }
            }

            public External(String deepLinkPath) {
                Intrinsics.checkNotNullParameter(deepLinkPath, "deepLinkPath");
                this.f93633a = deepLinkPath;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF93633a() {
                return this.f93633a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof External) && Intrinsics.f(this.f93633a, ((External) obj2).f93633a);
            }

            public final int hashCode() {
                return this.f93633a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f93633a);
            }
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsHomeKompotDestination((TransitionAnimation) parcel.readParcelable(TravelHotelsHomeKompotDestination.class.getClassLoader()), parcel.readInt() == 0 ? null : r8g.a.valueOf(parcel.readString()), (EntryPoint) parcel.readParcelable(TravelHotelsHomeKompotDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsHomeKompotDestination[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelHotelsHomeKompotDestination() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF93630a() {
        return this.f93630a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsHomeKompotDestination)) {
            return false;
        }
        TravelHotelsHomeKompotDestination travelHotelsHomeKompotDestination = (TravelHotelsHomeKompotDestination) obj2;
        return Intrinsics.f(this.f93630a, travelHotelsHomeKompotDestination.f93630a) && this.f93631b == travelHotelsHomeKompotDestination.f93631b && Intrinsics.f(this.f93632c, travelHotelsHomeKompotDestination.f93632c);
    }

    public final int hashCode() {
        TransitionAnimation transitionAnimation = this.f93630a;
        int iHashCode = (transitionAnimation == null ? 0 : transitionAnimation.hashCode()) * 31;
        r8g.a aVar = this.f93631b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        EntryPoint entryPoint = this.f93632c;
        return iHashCode2 + (entryPoint != null ? entryPoint.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93630a, i);
        r8g.a aVar = this.f93631b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.f93632c, i);
    }

    public TravelHotelsHomeKompotDestination(TransitionAnimation transitionAnimation, r8g.a aVar, EntryPoint entryPoint) {
        this.f93630a = transitionAnimation;
        this.f93631b = aVar;
        this.f93632c = entryPoint;
    }

    public /* synthetic */ TravelHotelsHomeKompotDestination(ZoomTransitionAnimation.Default r3, r8g.a aVar, EntryPoint.External external, int i) {
        this((i & 1) != 0 ? null : r3, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : external);
    }
}
