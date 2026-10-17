package com.revolut.feature_autoinvest_ui_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yvh.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_autoinvest_ui_api/navigation/AutoInvestMoveBridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_autoinvest_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoInvestMoveBridgeDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvh.b f96620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f96621b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AutoInvestMoveBridgeDestination> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveBridgeDestination$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoInvestMoveBridgeDestination((yvh.b) parcel.readSerializable(), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoInvestMoveBridgeDestination[i];
        }
    }

    public AutoInvestMoveBridgeDestination(yvh.b current, h moveTargetType) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(moveTargetType, "moveTargetType");
        this.f96620a = current;
        this.f96621b = moveTargetType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final yvh.b getF96620a() {
        return this.f96620a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getF96621b() {
        return this.f96621b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoInvestMoveBridgeDestination)) {
            return false;
        }
        AutoInvestMoveBridgeDestination autoInvestMoveBridgeDestination = (AutoInvestMoveBridgeDestination) obj2;
        return Intrinsics.f(this.f96620a, autoInvestMoveBridgeDestination.f96620a) && this.f96621b == autoInvestMoveBridgeDestination.f96621b;
    }

    public final int hashCode() {
        return this.f96621b.hashCode() + (this.f96620a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96620a);
        dest.writeString(this.f96621b.name());
    }
}
