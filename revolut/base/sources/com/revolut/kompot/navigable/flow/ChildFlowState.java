package com.revolut.kompot.navigable.flow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/navigable/flow/ChildFlowState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildFlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChildFlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowStateWrapper f98426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f98427b;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FlowStateWrapper<?, ?> flowStateWrapperCreateFromParcel = FlowStateWrapper.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FlowStateWrapper.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ChildFlowState(flowStateWrapperCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChildFlowState[i];
        }
    }

    public ChildFlowState(FlowStateWrapper stateWrapper, ArrayList backStack) {
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        Intrinsics.checkNotNullParameter(backStack, "backStack");
        this.f98426a = stateWrapper;
        this.f98427b = backStack;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChildFlowState)) {
            return false;
        }
        ChildFlowState childFlowState = (ChildFlowState) obj2;
        return Intrinsics.f(this.f98426a, childFlowState.f98426a) && this.f98427b.equals(childFlowState.f98427b);
    }

    public final int hashCode() {
        return this.f98427b.hashCode() + (this.f98426a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98426a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f98427b, dest);
        while (itY.hasNext()) {
            ((FlowStateWrapper) itY.next()).writeToParcel(dest, i);
        }
    }
}
