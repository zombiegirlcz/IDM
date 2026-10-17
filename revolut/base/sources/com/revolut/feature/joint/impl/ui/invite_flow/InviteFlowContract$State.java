package com.revolut.feature.joint.impl.ui.invite_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<InviteFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j38.a f76560b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteFlowContract$State((j38.a) parcel.readSerializable(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteFlowContract$State[i];
        }
    }

    public InviteFlowContract$State() {
        this(0);
    }

    public static InviteFlowContract$State a(InviteFlowContract$State inviteFlowContract$State, List selectedPurposes, j38.a aVar, int i) {
        if ((i & 1) != 0) {
            selectedPurposes = inviteFlowContract$State.f76559a;
        }
        if ((i & 2) != 0) {
            aVar = inviteFlowContract$State.f76560b;
        }
        inviteFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        return new InviteFlowContract$State(aVar, selectedPurposes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteFlowContract$State)) {
            return false;
        }
        InviteFlowContract$State inviteFlowContract$State = (InviteFlowContract$State) obj2;
        return Intrinsics.f(this.f76559a, inviteFlowContract$State.f76559a) && Intrinsics.f(this.f76560b, inviteFlowContract$State.f76560b);
    }

    public final int hashCode() {
        int iHashCode = this.f76559a.hashCode() * 31;
        j38.a aVar = this.f76560b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f76559a);
        dest.writeSerializable(this.f76560b);
    }

    public InviteFlowContract$State(j38.a aVar, List selectedPurposes) {
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f76559a = selectedPurposes;
        this.f76560b = aVar;
    }

    public InviteFlowContract$State(int i) {
        this(null, f0.f322471a);
    }
}
