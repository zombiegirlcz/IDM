package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ril.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep;", "Landroid/os/Parcelable;", "<init>", "()V", "Eligibility", "Workflow", "ril/b", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep$Eligibility;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep$Workflow;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EligibilityStep implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep$Eligibility;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Eligibility extends EligibilityStep {

        @NotNull
        public static final Parcelable.Creator<Eligibility> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f105413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f105415c;
        public final boolean d;
        public final boolean e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVarValueOf = b.valueOf(parcel.readString());
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (true) {
                    if (iA == i) {
                        break;
                    }
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DataPoint.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Eligibility(bVarValueOf, string, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eligibility[i];
            }
        }

        public Eligibility(b name, String str, List dataPoints, boolean z, boolean z3, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
            this.f105413a = name;
            this.f105414b = str;
            this.f105415c = dataPoints;
            this.d = z;
            this.e = z3;
            this.f = str2;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getF105419g() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getF() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF105420h() {
            return this.f105415c;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getD() {
            return this.f105413a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getE() {
            return this.f105414b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Eligibility)) {
                return false;
            }
            Eligibility eligibility = (Eligibility) obj2;
            return this.f105413a == eligibility.f105413a && Intrinsics.f(this.f105414b, eligibility.f105414b) && Intrinsics.f(this.f105415c, eligibility.f105415c) && this.d == eligibility.d && this.e == eligibility.e && Intrinsics.f(this.f, eligibility.f);
        }

        public final int hashCode() {
            int iHashCode = this.f105413a.hashCode() * 31;
            String str = this.f105414b;
            int iC = j6.a.c(j6.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105415c), 31, this.d), 31, this.e);
            String str2 = this.f;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105413a.name());
            dest.writeString(this.f105414b);
            Iterator itV = p.a.v(this.f105415c, dest);
            while (itV.hasNext()) {
                ((DataPoint) itV.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep$Workflow;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends EligibilityStep {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkflowStepConfiguration f105417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WorkflowStepNavigation f105418c;
        public final b d;
        public final String e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f105419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f105420h;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                WorkflowStepConfiguration workflowStepConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : WorkflowStepConfiguration.CREATOR.createFromParcel(parcel);
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                b bVarValueOf = b.valueOf(parcel.readString());
                String string2 = parcel.readString();
                int iA = 0;
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                boolean z3 = parcel.readInt() != 0 ? i : 0;
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DataPoint.CREATOR, parcel, arrayList, iA, i);
                }
                return new Workflow(string, workflowStepConfigurationCreateFromParcel, workflowStepNavigationCreateFromParcel, bVarValueOf, string2, z, z3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String stepId, WorkflowStepConfiguration workflowStepConfiguration, WorkflowStepNavigation navigation, b name, String str, boolean z, boolean z3, List dataPoints) {
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
            this.f105416a = stepId;
            this.f105417b = workflowStepConfiguration;
            this.f105418c = navigation;
            this.d = name;
            this.e = str;
            this.f = z;
            this.f105419g = z3;
            this.f105420h = dataPoints;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getF105419g() {
            return this.f105419g;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF105420h() {
            return this.f105420h;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Workflow)) {
                return false;
            }
            Workflow workflow = (Workflow) obj2;
            return Intrinsics.f(this.f105416a, workflow.f105416a) && Intrinsics.f(this.f105417b, workflow.f105417b) && Intrinsics.f(this.f105418c, workflow.f105418c) && this.d == workflow.d && Intrinsics.f(this.e, workflow.e) && this.f == workflow.f && this.f105419g == workflow.f105419g && Intrinsics.f(this.f105420h, workflow.f105420h);
        }

        public final int hashCode() {
            int iHashCode = this.f105416a.hashCode() * 31;
            WorkflowStepConfiguration workflowStepConfiguration = this.f105417b;
            int iHashCode2 = (this.d.hashCode() + ((this.f105418c.hashCode() + ((iHashCode + (workflowStepConfiguration == null ? 0 : workflowStepConfiguration.hashCode())) * 31)) * 31)) * 31;
            String str = this.e;
            return this.f105420h.hashCode() + j6.a.c(j6.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31, this.f105419g);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105416a);
            WorkflowStepConfiguration workflowStepConfiguration = this.f105417b;
            if (workflowStepConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                workflowStepConfiguration.writeToParcel(dest, i);
            }
            this.f105418c.writeToParcel(dest, i);
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f105419g ? 1 : 0);
            Iterator itV = p.a.v(this.f105420h, dest);
            while (itV.hasNext()) {
                ((DataPoint) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    private EligibilityStep() {
    }

    /* JADX INFO: renamed from: G9 */
    public abstract boolean getF105419g();

    /* JADX INFO: renamed from: X3 */
    public abstract boolean getF();

    /* JADX INFO: renamed from: a */
    public abstract List getF105420h();

    /* JADX INFO: renamed from: b */
    public abstract b getD();

    /* JADX INFO: renamed from: c */
    public abstract String getE();
}
