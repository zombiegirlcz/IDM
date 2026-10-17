package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorkflowV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowState f105690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f105691c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            WorkflowState workflowStateCreateFromParcel = WorkflowState.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(WorkflowV2.class, parcel, arrayList, iE, 1);
            }
            return new WorkflowV2(string, workflowStateCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowV2[i];
        }
    }

    public WorkflowV2(String id10, WorkflowState state, ArrayList steps) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f105689a = id10;
        this.f105690b = state;
        this.f105691c = steps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowV2)) {
            return false;
        }
        WorkflowV2 workflowV2 = (WorkflowV2) obj2;
        return Intrinsics.f(this.f105689a, workflowV2.f105689a) && this.f105690b == workflowV2.f105690b && this.f105691c.equals(workflowV2.f105691c);
    }

    public final int hashCode() {
        return this.f105691c.hashCode() + ((this.f105690b.hashCode() + (this.f105689a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105689a);
        this.f105690b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f105691c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
