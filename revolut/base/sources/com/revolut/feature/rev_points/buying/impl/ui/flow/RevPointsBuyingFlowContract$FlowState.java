package com.revolut.feature.rev_points.buying.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/buying/impl/ui/flow/RevPointsBuyingFlowContract$FlowState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsBuyingFlowContract$FlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsBuyingFlowContract$FlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsBuyingFlowContract$Step f83557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f83559c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsBuyingFlowContract$FlowState((RevPointsBuyingFlowContract$Step) parcel.readParcelable(RevPointsBuyingFlowContract$FlowState.class.getClassLoader()), parcel.readInt() != 0, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsBuyingFlowContract$FlowState[i];
        }
    }

    public RevPointsBuyingFlowContract$FlowState(RevPointsBuyingFlowContract$Step step, boolean z, d dVar) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f83557a = step;
        this.f83558b = z;
        this.f83559c = dVar;
    }

    public static RevPointsBuyingFlowContract$FlowState a(RevPointsBuyingFlowContract$FlowState revPointsBuyingFlowContract$FlowState, RevPointsBuyingFlowContract$Step step, boolean z, d dVar, int i) {
        if ((i & 1) != 0) {
            step = revPointsBuyingFlowContract$FlowState.f83557a;
        }
        if ((i & 2) != 0) {
            z = revPointsBuyingFlowContract$FlowState.f83558b;
        }
        if ((i & 4) != 0) {
            dVar = revPointsBuyingFlowContract$FlowState.f83559c;
        }
        revPointsBuyingFlowContract$FlowState.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        return new RevPointsBuyingFlowContract$FlowState(step, z, dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsBuyingFlowContract$FlowState)) {
            return false;
        }
        RevPointsBuyingFlowContract$FlowState revPointsBuyingFlowContract$FlowState = (RevPointsBuyingFlowContract$FlowState) obj2;
        return Intrinsics.f(this.f83557a, revPointsBuyingFlowContract$FlowState.f83557a) && this.f83558b == revPointsBuyingFlowContract$FlowState.f83558b && Intrinsics.f(this.f83559c, revPointsBuyingFlowContract$FlowState.f83559c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f83557a.hashCode() * 31, 31, this.f83558b);
        d dVar = this.f83559c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83557a, i);
        dest.writeInt(this.f83558b ? 1 : 0);
        dest.writeSerializable(this.f83559c);
    }
}
