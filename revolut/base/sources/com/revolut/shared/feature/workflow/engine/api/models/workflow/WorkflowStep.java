package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep;", "Landroid/os/Parcelable;", "<init>", "()V", "Questionnaire", "Information", "RequestForUserAuth", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep$Information;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep$Questionnaire;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep$RequestForUserAuth;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WorkflowStep implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep$Information;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Information extends WorkflowStep {

        @NotNull
        public static final Parcelable.Creator<Information> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EligibilityStep.Workflow f105671a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Information(EligibilityStep.Workflow.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Information[i];
            }
        }

        public Information(EligibilityStep.Workflow step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.f105671a = step;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Information) && Intrinsics.f(this.f105671a, ((Information) obj2).f105671a);
        }

        public final int hashCode() {
            return this.f105671a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105671a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep$Questionnaire;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Questionnaire extends WorkflowStep {

        @NotNull
        public static final Parcelable.Creator<Questionnaire> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WorkflowStepNavigation f105674c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (true) {
                    z = true;
                    if (iE == i) {
                        break;
                    }
                    iE = j6.a.e(Questionnaire.class, parcel, arrayList, iE, 1);
                }
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z = false;
                }
                return new Questionnaire(workflowStepNavigationCreateFromParcel, string, arrayList, z, parcel.readInt() != 0 ? z3 : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Questionnaire[i];
            }
        }

        public Questionnaire(WorkflowStepNavigation navigation, String id10, List questions, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            this.f105672a = id10;
            this.f105673b = questions;
            this.f105674c = navigation;
            this.d = z;
            this.e = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Questionnaire)) {
                return false;
            }
            Questionnaire questionnaire = (Questionnaire) obj2;
            return Intrinsics.f(this.f105672a, questionnaire.f105672a) && Intrinsics.f(this.f105673b, questionnaire.f105673b) && Intrinsics.f(this.f105674c, questionnaire.f105674c) && this.d == questionnaire.d && this.e == questionnaire.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c((this.f105674c.hashCode() + p.a.d(this.f105672a.hashCode() * 31, 31, this.f105673b)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105672a);
            Iterator itV = p.a.v(this.f105673b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f105674c.writeToParcel(dest, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep$RequestForUserAuth;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestForUserAuth extends WorkflowStep {

        @NotNull
        public static final Parcelable.Creator<RequestForUserAuth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f105676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserAuthenticationType f105677c;
        public final WorkflowStepConfiguration d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                UserAuthenticationType userAuthenticationType;
                WorkflowStepConfiguration workflowStepConfiguration;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                UserAuthenticationType userAuthenticationType2 = (UserAuthenticationType) parcel.readParcelable(RequestForUserAuth.class.getClassLoader());
                WorkflowStepConfiguration workflowStepConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : WorkflowStepConfiguration.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z3 = true;
                    userAuthenticationType = userAuthenticationType2;
                    workflowStepConfiguration = workflowStepConfigurationCreateFromParcel;
                } else {
                    userAuthenticationType = userAuthenticationType2;
                    workflowStepConfiguration = workflowStepConfigurationCreateFromParcel;
                    z3 = z;
                }
                return new RequestForUserAuth(string, z4, userAuthenticationType, workflowStepConfiguration, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestForUserAuth[i];
            }
        }

        public RequestForUserAuth(String id10, boolean z, UserAuthenticationType authenticationType, WorkflowStepConfiguration workflowStepConfiguration, boolean z3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
            this.f105675a = id10;
            this.f105676b = z;
            this.f105677c = authenticationType;
            this.d = workflowStepConfiguration;
            this.e = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestForUserAuth)) {
                return false;
            }
            RequestForUserAuth requestForUserAuth = (RequestForUserAuth) obj2;
            return Intrinsics.f(this.f105675a, requestForUserAuth.f105675a) && this.f105676b == requestForUserAuth.f105676b && Intrinsics.f(this.f105677c, requestForUserAuth.f105677c) && Intrinsics.f(this.d, requestForUserAuth.d) && this.e == requestForUserAuth.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f105677c.hashCode() + j6.a.c(this.f105675a.hashCode() * 31, 31, this.f105676b)) * 31;
            WorkflowStepConfiguration workflowStepConfiguration = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (workflowStepConfiguration == null ? 0 : workflowStepConfiguration.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105675a);
            dest.writeInt(this.f105676b ? 1 : 0);
            dest.writeParcelable(this.f105677c, i);
            WorkflowStepConfiguration workflowStepConfiguration = this.d;
            if (workflowStepConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                workflowStepConfiguration.writeToParcel(dest, i);
            }
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    private WorkflowStep() {
    }
}
