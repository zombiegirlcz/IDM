package com.revolut.feature.workflow.engine.polling;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/polling/PollingControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PollingControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PollingControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowScreenConfiguration f96501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96502c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PollingControllerContract$InputData(parcel.readString(), (WorkflowScreenConfiguration) parcel.readParcelable(PollingControllerContract$InputData.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollingControllerContract$InputData[i];
        }
    }

    public PollingControllerContract$InputData(String workflowId, WorkflowScreenConfiguration screenConfiguration, int i) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f96500a = workflowId;
        this.f96501b = screenConfiguration;
        this.f96502c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PollingControllerContract$InputData)) {
            return false;
        }
        PollingControllerContract$InputData pollingControllerContract$InputData = (PollingControllerContract$InputData) obj2;
        return Intrinsics.f(this.f96500a, pollingControllerContract$InputData.f96500a) && Intrinsics.f(this.f96501b, pollingControllerContract$InputData.f96501b) && this.f96502c == pollingControllerContract$InputData.f96502c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96502c) + ((this.f96501b.hashCode() + (this.f96500a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96500a);
        dest.writeParcelable(this.f96501b, i);
        dest.writeInt(this.f96502c);
    }
}
