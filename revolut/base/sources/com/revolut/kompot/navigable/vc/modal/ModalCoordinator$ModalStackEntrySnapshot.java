package com.revolut.kompot.navigable.vc.modal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"com/revolut/kompot/navigable/vc/modal/ModalCoordinator$ModalStackEntrySnapshot", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Step", "Landroid/os/Parcelable;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class ModalCoordinator$ModalStackEntrySnapshot<Step extends FlowStep> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ModalCoordinator$ModalStackEntrySnapshot<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowStep f98440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f98441c;
    public final ModalDestination.Style d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModalCoordinator$ModalStackEntrySnapshot(parcel.readInt(), (FlowStep) parcel.readParcelable(ModalCoordinator$ModalStackEntrySnapshot.class.getClassLoader()), parcel.readBundle(ModalCoordinator$ModalStackEntrySnapshot.class.getClassLoader()), (ModalDestination.Style) parcel.readParcelable(ModalCoordinator$ModalStackEntrySnapshot.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ModalCoordinator$ModalStackEntrySnapshot[i];
        }
    }

    public ModalCoordinator$ModalStackEntrySnapshot(int i, FlowStep step, Bundle controllerState, ModalDestination.Style style, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(controllerState, "controllerState");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f98439a = i;
        this.f98440b = step;
        this.f98441c = controllerState;
        this.d = style;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98439a);
        dest.writeParcelable(this.f98440b, i);
        dest.writeBundle(this.f98441c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
