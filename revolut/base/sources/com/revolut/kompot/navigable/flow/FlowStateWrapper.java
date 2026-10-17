package com.revolut.kompot.navigable.flow;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/kompot/navigable/flow/FlowStateWrapper;", "Lcom/revolut/kompot/navigable/flow/FlowState;", "STATE", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "STEP", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlowStateWrapper<STATE extends FlowState, STEP extends FlowStep> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlowStateWrapper<?, ?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowState f98429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowStep f98430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChildFlowState f98431c;
    public final Bundle d;
    public final TransitionAnimation e;
    public final ControllerKey f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlowStateWrapper((FlowState) parcel.readParcelable(FlowStateWrapper.class.getClassLoader()), (FlowStep) parcel.readParcelable(FlowStateWrapper.class.getClassLoader()), parcel.readInt() == 0 ? null : ChildFlowState.CREATOR.createFromParcel(parcel), parcel.readBundle(FlowStateWrapper.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(FlowStateWrapper.class.getClassLoader()), parcel.readInt() != 0 ? ControllerKey.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlowStateWrapper[i];
        }
    }

    public FlowStateWrapper(FlowState state, FlowStep step, ChildFlowState childFlowState, Bundle bundle, TransitionAnimation animation, ControllerKey controllerKey) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f98429a = state;
        this.f98430b = step;
        this.f98431c = childFlowState;
        this.d = bundle;
        this.e = animation;
        this.f = controllerKey;
    }

    public static FlowStateWrapper a(FlowStateWrapper flowStateWrapper, FlowState flowState, FlowStep flowStep, ChildFlowState childFlowState, Bundle bundle, TransitionAnimation transitionAnimation, ControllerKey controllerKey, int i) {
        if ((i & 1) != 0) {
            flowState = flowStateWrapper.f98429a;
        }
        FlowState state = flowState;
        if ((i & 2) != 0) {
            flowStep = flowStateWrapper.f98430b;
        }
        FlowStep step = flowStep;
        if ((i & 4) != 0) {
            childFlowState = flowStateWrapper.f98431c;
        }
        ChildFlowState childFlowState2 = childFlowState;
        if ((i & 8) != 0) {
            bundle = flowStateWrapper.d;
        }
        Bundle bundle2 = bundle;
        if ((i & 16) != 0) {
            transitionAnimation = flowStateWrapper.e;
        }
        TransitionAnimation animation = transitionAnimation;
        if ((i & 32) != 0) {
            controllerKey = flowStateWrapper.f;
        }
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        return new FlowStateWrapper(state, step, childFlowState2, bundle2, animation, controllerKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlowStateWrapper)) {
            return false;
        }
        FlowStateWrapper flowStateWrapper = (FlowStateWrapper) obj2;
        return Intrinsics.f(this.f98429a, flowStateWrapper.f98429a) && Intrinsics.f(this.f98430b, flowStateWrapper.f98430b) && Intrinsics.f(this.f98431c, flowStateWrapper.f98431c) && Intrinsics.f(this.d, flowStateWrapper.d) && Intrinsics.f(this.e, flowStateWrapper.e) && Intrinsics.f(this.f, flowStateWrapper.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f98430b.hashCode() + (this.f98429a.hashCode() * 31)) * 31;
        ChildFlowState childFlowState = this.f98431c;
        int iHashCode2 = (iHashCode + (childFlowState == null ? 0 : childFlowState.hashCode())) * 31;
        Bundle bundle = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (bundle == null ? 0 : bundle.hashCode())) * 31)) * 31;
        ControllerKey controllerKey = this.f;
        return iHashCode3 + (controllerKey != null ? controllerKey.f98378a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98429a, i);
        dest.writeParcelable(this.f98430b, i);
        ChildFlowState childFlowState = this.f98431c;
        if (childFlowState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            childFlowState.writeToParcel(dest, i);
        }
        dest.writeBundle(this.d);
        dest.writeParcelable(this.e, i);
        ControllerKey controllerKey = this.f;
        if (controllerKey == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            controllerKey.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ FlowStateWrapper(FlowState flowState, FlowStep flowStep, TransitionAnimation transitionAnimation) {
        this(flowState, flowStep, null, null, transitionAnimation, null);
    }
}
