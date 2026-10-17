package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "ExitDialog", "a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowStepNavigation implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105565c;
    public final ExitDialog d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<WorkflowStepNavigation> CREATOR = new b();
    public static final WorkflowStepNavigation e = new WorkflowStepNavigation(false, false, null, null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog;", "Landroid/os/Parcelable;", "Default", "Custom", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog$Custom;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog$Default;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ExitDialog extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog$Custom;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements ExitDialog {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f105566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f105567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f105568c;
            public final Clause d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((Clause) parcel.readParcelable(Custom.class.getClassLoader()), (Clause) parcel.readParcelable(Custom.class.getClassLoader()), (Clause) parcel.readParcelable(Custom.class.getClassLoader()), (Clause) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(Clause title, Clause message, Clause positiveButton, Clause negativeButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
                Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
                this.f105566a = title;
                this.f105567b = message;
                this.f105568c = positiveButton;
                this.d = negativeButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) obj2;
                return Intrinsics.f(this.f105566a, custom.f105566a) && Intrinsics.f(this.f105567b, custom.f105567b) && Intrinsics.f(this.f105568c, custom.f105568c) && Intrinsics.f(this.d, custom.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + p.a.a(p.a.a(this.f105566a.hashCode() * 31, 31, this.f105567b), 31, this.f105568c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f105566a, i);
                dest.writeParcelable(this.f105567b, i);
                dest.writeParcelable(this.f105568c, i);
                dest.writeParcelable(this.d, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog$Default;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepNavigation$ExitDialog;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements ExitDialog {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f105569a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f105569a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            private Default() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkflowStepNavigation(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (ExitDialog) parcel.readParcelable(WorkflowStepNavigation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowStepNavigation[i];
        }
    }

    public WorkflowStepNavigation(boolean z, boolean z3, String str, ExitDialog exitDialog) {
        this.f105563a = z;
        this.f105564b = z3;
        this.f105565c = str;
        this.d = exitDialog;
    }

    public static WorkflowStepNavigation a(WorkflowStepNavigation workflowStepNavigation, String str, ExitDialog exitDialog, int i) {
        boolean z = workflowStepNavigation.f105563a;
        boolean z3 = workflowStepNavigation.f105564b;
        if ((i & 4) != 0) {
            str = workflowStepNavigation.f105565c;
        }
        if ((i & 8) != 0) {
            exitDialog = workflowStepNavigation.d;
        }
        workflowStepNavigation.getClass();
        return new WorkflowStepNavigation(z, z3, str, exitDialog);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowStepNavigation)) {
            return false;
        }
        WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) obj2;
        return this.f105563a == workflowStepNavigation.f105563a && this.f105564b == workflowStepNavigation.f105564b && Intrinsics.f(this.f105565c, workflowStepNavigation.f105565c) && Intrinsics.f(this.d, workflowStepNavigation.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f105563a) * 31, 31, this.f105564b);
        String str = this.f105565c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ExitDialog exitDialog = this.d;
        return iHashCode + (exitDialog != null ? exitDialog.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f105563a ? 1 : 0);
        dest.writeInt(this.f105564b ? 1 : 0);
        dest.writeString(this.f105565c);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ WorkflowStepNavigation(boolean z, boolean z3) {
        this(z, z3, null, null);
    }
}
