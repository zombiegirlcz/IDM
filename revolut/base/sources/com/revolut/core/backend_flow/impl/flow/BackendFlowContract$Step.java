package com.revolut.core.backend_flow.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/impl/flow/BackendFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowContract$Step implements FlowStep {

    @NotNull
    public static final Parcelable.Creator<BackendFlowContract$Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowInput f51230a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendFlowContract$Step((BackendFlowInput) parcel.readParcelable(BackendFlowContract$Step.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowContract$Step[i];
        }
    }

    public BackendFlowContract$Step(BackendFlowInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f51230a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackendFlowContract$Step) && Intrinsics.f(this.f51230a, ((BackendFlowContract$Step) obj2).f51230a);
    }

    public final int hashCode() {
        return this.f51230a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51230a, i);
    }
}
