package com.revolut.kompot.navigable.vc.flow;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/vc/flow/FlowTaskState;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "S", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlowTaskState<S extends FlowStep> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlowTaskState<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowStep f98436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f98437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f98438c;
    public final ControllerKey d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlowTaskState((FlowStep) parcel.readParcelable(FlowTaskState.class.getClassLoader()), parcel.readBundle(FlowTaskState.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(FlowTaskState.class.getClassLoader()), parcel.readInt() == 0 ? null : ControllerKey.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlowTaskState[i];
        }
    }

    public FlowTaskState(FlowStep step, Bundle bundle, TransitionAnimation animation, ControllerKey controllerKey) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f98436a = step;
        this.f98437b = bundle;
        this.f98438c = animation;
        this.d = controllerKey;
    }

    public static FlowTaskState a(FlowTaskState flowTaskState, Bundle bundle, ControllerKey controllerKey, int i) {
        FlowStep step = flowTaskState.f98436a;
        if ((i & 2) != 0) {
            bundle = flowTaskState.f98437b;
        }
        TransitionAnimation animation = flowTaskState.f98438c;
        if ((i & 8) != 0) {
            controllerKey = flowTaskState.d;
        }
        flowTaskState.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        return new FlowTaskState(step, bundle, animation, controllerKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlowTaskState)) {
            return false;
        }
        FlowTaskState flowTaskState = (FlowTaskState) obj2;
        return Intrinsics.f(this.f98436a, flowTaskState.f98436a) && Intrinsics.f(this.f98437b, flowTaskState.f98437b) && Intrinsics.f(this.f98438c, flowTaskState.f98438c) && Intrinsics.f(this.d, flowTaskState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f98436a.hashCode() * 31;
        Bundle bundle = this.f98437b;
        int iHashCode2 = (this.f98438c.hashCode() + ((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31)) * 31;
        ControllerKey controllerKey = this.d;
        return iHashCode2 + (controllerKey != null ? controllerKey.f98378a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98436a, i);
        dest.writeBundle(this.f98437b);
        dest.writeParcelable(this.f98438c, i);
        ControllerKey controllerKey = this.d;
        if (controllerKey == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            controllerKey.writeToParcel(dest, i);
        }
    }
}
