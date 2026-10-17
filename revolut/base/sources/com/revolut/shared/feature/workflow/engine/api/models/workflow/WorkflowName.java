package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowName;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowName implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WorkflowName f105665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WorkflowName f105666c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105667a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<WorkflowName> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkflowName(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowName[i];
        }
    }

    static {
        new WorkflowName("TROUBLESHOOTER");
        f105665b = new WorkflowName("NAME_VERIFICATION");
        new WorkflowName("EDIT_TAX_INFORMATION");
        f105666c = new WorkflowName("PERSONAL_DETAILS");
    }

    public WorkflowName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f105667a = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WorkflowName) && Intrinsics.f(this.f105667a, ((WorkflowName) obj2).f105667a);
    }

    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF105667a() {
        return this.f105667a;
    }

    public final int hashCode() {
        return this.f105667a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105667a);
    }
}
