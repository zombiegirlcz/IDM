package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v2/OutstandingDebtsV2FlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Lcli/j;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OutstandingDebtsV2FlowContract$State implements FlowState, j {

    @NotNull
    public static final Parcelable.Creator<OutstandingDebtsV2FlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f67453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutstandingDebtsV2FlowContract$IntroProceedAction f67454b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OutstandingDebtsV2FlowContract$State((xi0.b) parcel.readSerializable(), parcel.readInt() == 0 ? null : OutstandingDebtsV2FlowContract$IntroProceedAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OutstandingDebtsV2FlowContract$State[i];
        }
    }

    public OutstandingDebtsV2FlowContract$State(xi0.b bVar, OutstandingDebtsV2FlowContract$IntroProceedAction outstandingDebtsV2FlowContract$IntroProceedAction) {
        this.f67453a = bVar;
        this.f67454b = outstandingDebtsV2FlowContract$IntroProceedAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OutstandingDebtsV2FlowContract$State)) {
            return false;
        }
        OutstandingDebtsV2FlowContract$State outstandingDebtsV2FlowContract$State = (OutstandingDebtsV2FlowContract$State) obj2;
        return Intrinsics.f(this.f67453a, outstandingDebtsV2FlowContract$State.f67453a) && Intrinsics.f(this.f67454b, outstandingDebtsV2FlowContract$State.f67454b);
    }

    public final int hashCode() {
        xi0.b bVar = this.f67453a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        OutstandingDebtsV2FlowContract$IntroProceedAction outstandingDebtsV2FlowContract$IntroProceedAction = this.f67454b;
        return iHashCode + (outstandingDebtsV2FlowContract$IntroProceedAction != null ? outstandingDebtsV2FlowContract$IntroProceedAction.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67453a);
        OutstandingDebtsV2FlowContract$IntroProceedAction outstandingDebtsV2FlowContract$IntroProceedAction = this.f67454b;
        if (outstandingDebtsV2FlowContract$IntroProceedAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            outstandingDebtsV2FlowContract$IntroProceedAction.writeToParcel(dest, i);
        }
    }

    public OutstandingDebtsV2FlowContract$State() {
        this(null, null);
    }
}
