package com.revolut.feature.rev_points.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsTrophyRoomDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTrophyRoomDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevPointsTrophyRoomDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoomTarget f83537b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsTrophyRoomDestination((ZoomTarget) parcel.readParcelable(RevPointsTrophyRoomDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTrophyRoomDestination[i];
        }
    }

    public RevPointsTrophyRoomDestination() {
        this(null);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0 */
    public final TransitionAnimation getI() {
        ZoomTarget zoomTarget = this.f83537b;
        if (zoomTarget == null) {
            return null;
        }
        TransitionAnimation.Companion companion = TransitionAnimation.INSTANCE;
        HomeOverlayConfig.INSTANCE.getClass();
        return com.revolut.kompot.common.transition.a.d(companion, zoomTarget, HomeOverlayConfig.f59654b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevPointsTrophyRoomDestination) && Intrinsics.f(this.f83537b, ((RevPointsTrophyRoomDestination) obj2).f83537b);
    }

    public final int hashCode() {
        ZoomTarget zoomTarget = this.f83537b;
        if (zoomTarget == null) {
            return 0;
        }
        return zoomTarget.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83537b, i);
    }

    public RevPointsTrophyRoomDestination(ZoomTarget zoomTarget) {
        super(IOData$EmptyInput.f98299a);
        this.f83537b = zoomTarget;
    }
}
