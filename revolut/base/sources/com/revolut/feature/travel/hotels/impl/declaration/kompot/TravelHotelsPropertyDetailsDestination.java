package com.revolut.feature.travel.hotels.impl.declaration.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/declaration/kompot/TravelHotelsPropertyDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsPropertyDetailsDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsPropertyDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsPropertyInputData f93653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f93654c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsPropertyDetailsDestination((HotelsPropertyInputData) parcel.readParcelable(TravelHotelsPropertyDetailsDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(TravelHotelsPropertyDetailsDestination.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsPropertyDetailsDestination[i];
        }
    }

    public /* synthetic */ TravelHotelsPropertyDetailsDestination(HotelsPropertyInputData hotelsPropertyInputData, ZoomTransitionAnimation.Default r4, boolean z, boolean z3, int i) {
        this(hotelsPropertyInputData, (i & 2) != 0 ? null : r4, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z3);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF93654c() {
        return this.f93654c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final HotelsPropertyInputData getF93653b() {
        return this.f93653b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsPropertyDetailsDestination)) {
            return false;
        }
        TravelHotelsPropertyDetailsDestination travelHotelsPropertyDetailsDestination = (TravelHotelsPropertyDetailsDestination) obj2;
        return Intrinsics.f(this.f93653b, travelHotelsPropertyDetailsDestination.f93653b) && Intrinsics.f(this.f93654c, travelHotelsPropertyDetailsDestination.f93654c) && this.d == travelHotelsPropertyDetailsDestination.d && this.e == travelHotelsPropertyDetailsDestination.e;
    }

    public final int hashCode() {
        int iHashCode = this.f93653b.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f93654c;
        return Boolean.hashCode(this.e) + j6.a.c((iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93653b, i);
        dest.writeParcelable(this.f93654c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelHotelsPropertyDetailsDestination(HotelsPropertyInputData propertyInputData, TransitionAnimation transitionAnimation, boolean z, boolean z3) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(propertyInputData, "propertyInputData");
        this.f93653b = propertyInputData;
        this.f93654c = transitionAnimation;
        this.d = z;
        this.e = z3;
    }
}
