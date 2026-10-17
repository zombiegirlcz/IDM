package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sil.l;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2;", "Landroid/os/Parcelable;", "<init>", "()V", "Questionnaire", "Information", "RequestForUserAuth", "sil/l", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2$Information;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2$Questionnaire;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2$RequestForUserAuth;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WorkflowStepV2 implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2$Information;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Information extends WorkflowStepV2 {

        @NotNull
        public static final Parcelable.Creator<Information> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f105679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105680c;
        public final WorkflowStepConfiguration d;
        public final WorkflowStepNavigation e;
        public final l f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f105681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f105682h;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int iA = 0;
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                boolean z3 = parcel.readInt() != 0 ? i : 0;
                WorkflowStepConfiguration workflowStepConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : WorkflowStepConfiguration.CREATOR.createFromParcel(parcel);
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                l lVarValueOf = l.valueOf(parcel.readString());
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DataPoint.CREATOR, parcel, arrayList, iA, i);
                }
                return new Information(string, z, z3, workflowStepConfigurationCreateFromParcel, workflowStepNavigationCreateFromParcel, lVarValueOf, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Information[i];
            }
        }

        public Information(String id10, boolean z, boolean z3, WorkflowStepConfiguration workflowStepConfiguration, WorkflowStepNavigation navigation, l name, String str, List dataPoints) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
            this.f105678a = id10;
            this.f105679b = z;
            this.f105680c = z3;
            this.d = workflowStepConfiguration;
            this.e = navigation;
            this.f = name;
            this.f105681g = str;
            this.f105682h = dataPoints;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Information)) {
                return false;
            }
            Information information = (Information) obj2;
            return Intrinsics.f(this.f105678a, information.f105678a) && this.f105679b == information.f105679b && this.f105680c == information.f105680c && Intrinsics.f(this.d, information.d) && Intrinsics.f(this.e, information.e) && this.f == information.f && Intrinsics.f(this.f105681g, information.f105681g) && Intrinsics.f(this.f105682h, information.f105682h);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(this.f105678a.hashCode() * 31, 31, this.f105679b), 31, this.f105680c);
            WorkflowStepConfiguration workflowStepConfiguration = this.d;
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((iC + (workflowStepConfiguration == null ? 0 : workflowStepConfiguration.hashCode())) * 31)) * 31)) * 31;
            String str = this.f105681g;
            return this.f105682h.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105678a);
            dest.writeInt(this.f105679b ? 1 : 0);
            dest.writeInt(this.f105680c ? 1 : 0);
            WorkflowStepConfiguration workflowStepConfiguration = this.d;
            if (workflowStepConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                workflowStepConfiguration.writeToParcel(dest, i);
            }
            this.e.writeToParcel(dest, i);
            dest.writeString(this.f.name());
            dest.writeString(this.f105681g);
            Iterator itV = p.a.v(this.f105682h, dest);
            while (itV.hasNext()) {
                ((DataPoint) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2$Questionnaire;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Questionnaire extends WorkflowStepV2 {

        @NotNull
        public static final Parcelable.Creator<Questionnaire> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WorkflowStepNavigation f105685c;
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
            this.f105683a = id10;
            this.f105684b = questions;
            this.f105685c = navigation;
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
            return Intrinsics.f(this.f105683a, questionnaire.f105683a) && Intrinsics.f(this.f105684b, questionnaire.f105684b) && Intrinsics.f(this.f105685c, questionnaire.f105685c) && this.d == questionnaire.d && this.e == questionnaire.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c((this.f105685c.hashCode() + p.a.d(this.f105683a.hashCode() * 31, 31, this.f105684b)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105683a);
            Iterator itV = p.a.v(this.f105684b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f105685c.writeToParcel(dest, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2$RequestForUserAuth;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowStepV2;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestForUserAuth extends WorkflowStepV2 {

        @NotNull
        public static final Parcelable.Creator<RequestForUserAuth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f105687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UserAuthenticationType f105688c;
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
            this.f105686a = id10;
            this.f105687b = z;
            this.f105688c = authenticationType;
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
            return Intrinsics.f(this.f105686a, requestForUserAuth.f105686a) && this.f105687b == requestForUserAuth.f105687b && Intrinsics.f(this.f105688c, requestForUserAuth.f105688c) && Intrinsics.f(this.d, requestForUserAuth.d) && this.e == requestForUserAuth.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f105688c.hashCode() + j6.a.c(this.f105686a.hashCode() * 31, 31, this.f105687b)) * 31;
            WorkflowStepConfiguration workflowStepConfiguration = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (workflowStepConfiguration == null ? 0 : workflowStepConfiguration.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105686a);
            dest.writeInt(this.f105687b ? 1 : 0);
            dest.writeParcelable(this.f105688c, i);
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

    private WorkflowStepV2() {
    }
}
