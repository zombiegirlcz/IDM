package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/WorkflowFlowStep;", "Questionnaire", "WorkflowEligibility", "RequestForUserAuth", "SdkFlow", "Workflow", "DocumentSelection", "Polling", "TrackingConsent", "ProductClosures", "AddressSuggestion", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$AddressSuggestion;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$DocumentSelection;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$Polling;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$ProductClosures;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$Questionnaire;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$RequestForUserAuth;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$TrackingConsent;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$Workflow;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$WorkflowEligibility;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InternalStep extends WorkflowFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$AddressSuggestion;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressSuggestion implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<AddressSuggestion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96437c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f96438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem f96439h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f96440j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) j6.a.f(parcel, "parcel", AddressSuggestion.class);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (true) {
                    z = true;
                    if (iE == i) {
                        break;
                    }
                    iE = j6.a.e(AddressSuggestion.class, parcel, arrayList, iE, 1);
                }
                WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = (WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem) parcel.readParcelable(AddressSuggestion.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z = false;
                }
                return new AddressSuggestion(workflowStepNavigation, string, string2, string3, string4, string5, arrayList, addressSuggestionItem, z, parcel.readInt() != 0 ? z3 : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressSuggestion[i];
            }
        }

        public AddressSuggestion(WorkflowStepNavigation navigation, String stepId, String title, String subtitle, String submitButton, String str, ArrayList items, WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f96435a = navigation;
            this.f96436b = stepId;
            this.f96437c = title;
            this.d = subtitle;
            this.e = submitButton;
            this.f = str;
            this.f96438g = items;
            this.f96439h = addressSuggestionItem;
            this.i = z;
            this.f96440j = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f96440j;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96436b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressSuggestion)) {
                return false;
            }
            AddressSuggestion addressSuggestion = (AddressSuggestion) obj2;
            return Intrinsics.f(this.f96435a, addressSuggestion.f96435a) && Intrinsics.f(this.f96436b, addressSuggestion.f96436b) && Intrinsics.f(this.f96437c, addressSuggestion.f96437c) && Intrinsics.f(this.d, addressSuggestion.d) && Intrinsics.f(this.e, addressSuggestion.e) && Intrinsics.f(this.f, addressSuggestion.f) && this.f96438g.equals(addressSuggestion.f96438g) && Intrinsics.f(this.f96439h, addressSuggestion.f96439h) && this.i == addressSuggestion.i && this.f96440j == addressSuggestion.f96440j;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f96435a.hashCode() * 31, 31, this.f96436b), 31, this.f96437c), 31, this.d), 31, this.e);
            String str = this.f;
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f96438g, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
            WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = this.f96439h;
            return Boolean.hashCode(this.f96440j) + j6.a.c((iB + (addressSuggestionItem != null ? addressSuggestionItem.hashCode() : 0)) * 31, 31, this.i);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96435a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96435a, i);
            dest.writeString(this.f96436b);
            dest.writeString(this.f96437c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            Iterator itY = j6.a.y(this.f96438g, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f96439h, i);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f96440j ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$DocumentSelection;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelection implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentSelectionConfiguration f96441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WorkflowStepNavigation f96443c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowDocumentSelectionConfiguration workflowDocumentSelectionConfigurationCreateFromParcel = WorkflowDocumentSelectionConfiguration.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) parcel.readParcelable(DocumentSelection.class.getClassLoader());
                String string2 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new DocumentSelection(workflowDocumentSelectionConfigurationCreateFromParcel, string, workflowStepNavigation, string2, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        public DocumentSelection(WorkflowDocumentSelectionConfiguration documentSelectionWorkflowConfiguration, String str, WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(documentSelectionWorkflowConfiguration, "documentSelectionWorkflowConfiguration");
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f96441a = documentSelectionWorkflowConfiguration;
            this.f96442b = str;
            this.f96443c = navigation;
            this.d = stepId;
            this.e = z;
            this.f = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
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
            if (!(obj2 instanceof DocumentSelection)) {
                return false;
            }
            DocumentSelection documentSelection = (DocumentSelection) obj2;
            return Intrinsics.f(this.f96441a, documentSelection.f96441a) && Intrinsics.f(this.f96442b, documentSelection.f96442b) && Intrinsics.f(this.f96443c, documentSelection.f96443c) && Intrinsics.f(this.d, documentSelection.d) && this.e == documentSelection.e && this.f == documentSelection.f;
        }

        public final int hashCode() {
            int iHashCode = this.f96441a.hashCode() * 31;
            String str = this.f96442b;
            return Boolean.hashCode(this.f) + j6.a.c(p.a.c((this.f96443c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96443c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96441a.writeToParcel(dest, i);
            dest.writeString(this.f96442b);
            dest.writeParcelable(this.f96443c, i);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$Polling;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Polling implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<Polling> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96446c;
        public final String d;
        public final WorkflowScreenConfiguration e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f96447g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) parcel.readParcelable(Polling.class.getClassLoader());
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = false;
                    z = true;
                } else {
                    z = false;
                    z3 = false;
                }
                String string2 = parcel.readString();
                WorkflowScreenConfiguration workflowScreenConfiguration = (WorkflowScreenConfiguration) parcel.readParcelable(Polling.class.getClassLoader());
                boolean z4 = z3;
                int i = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new Polling(workflowStepNavigation, string, z, string2, workflowScreenConfiguration, i, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Polling[i];
            }
        }

        public Polling(WorkflowStepNavigation navigation, String stepId, boolean z, String workflowId, WorkflowScreenConfiguration screenConfiguration, int i, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f96444a = navigation;
            this.f96445b = stepId;
            this.f96446c = z;
            this.d = workflowId;
            this.e = screenConfiguration;
            this.f = i;
            this.f96447g = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f96447g;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96445b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96446c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Polling)) {
                return false;
            }
            Polling polling = (Polling) obj2;
            return Intrinsics.f(this.f96444a, polling.f96444a) && Intrinsics.f(this.f96445b, polling.f96445b) && this.f96446c == polling.f96446c && Intrinsics.f(this.d, polling.d) && Intrinsics.f(this.e, polling.e) && this.f == polling.f && this.f96447g == polling.f96447g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f96447g) + j6.a.b(this.f, (this.e.hashCode() + p.a.c(j6.a.c(p.a.c(this.f96444a.hashCode() * 31, 31, this.f96445b), 31, this.f96446c), 31, this.d)) * 31, 31);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96444a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96444a, i);
            dest.writeString(this.f96445b);
            dest.writeInt(this.f96446c ? 1 : 0);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f);
            dest.writeInt(this.f96447g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$ProductClosures;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductClosures implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<ProductClosures> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96450c;
        public final boolean d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f96451g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) parcel.readParcelable(ProductClosures.class.getClassLoader());
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new ProductClosures(workflowStepNavigation, string, z3, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductClosures[i];
            }
        }

        public ProductClosures(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, String title, String subtitle, String migrationContext) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(migrationContext, "migrationContext");
            this.f96448a = navigation;
            this.f96449b = stepId;
            this.f96450c = z;
            this.d = z3;
            this.e = title;
            this.f = subtitle;
            this.f96451g = migrationContext;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96449b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96450c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductClosures)) {
                return false;
            }
            ProductClosures productClosures = (ProductClosures) obj2;
            return Intrinsics.f(this.f96448a, productClosures.f96448a) && Intrinsics.f(this.f96449b, productClosures.f96449b) && this.f96450c == productClosures.f96450c && this.d == productClosures.d && Intrinsics.f(this.e, productClosures.e) && Intrinsics.f(this.f, productClosures.f) && Intrinsics.f(this.f96451g, productClosures.f96451g);
        }

        public final int hashCode() {
            return this.f96451g.hashCode() + p.a.c(p.a.c(j6.a.c(j6.a.c(p.a.c(this.f96448a.hashCode() * 31, 31, this.f96449b), 31, this.f96450c), 31, this.d), 31, this.e), 31, this.f);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96448a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96448a, i);
            dest.writeString(this.f96449b);
            dest.writeInt(this.f96450c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f96451g);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$Questionnaire;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Questionnaire implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<Questionnaire> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96454c;
        public final List d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) j6.a.f(parcel, "parcel", Questionnaire.class);
                String string = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                boolean z3 = true;
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Questionnaire.class, parcel, arrayList, iE, 1);
                }
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new Questionnaire(workflowStepNavigation, string, arrayList, z, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Questionnaire[i];
            }
        }

        public Questionnaire(WorkflowStepNavigation navigation, String stepId, List questions, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(questions, "questions");
            this.f96452a = navigation;
            this.f96453b = stepId;
            this.f96454c = z;
            this.d = questions;
            this.e = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96453b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96454c;
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
            return Intrinsics.f(this.f96452a, questionnaire.f96452a) && Intrinsics.f(this.f96453b, questionnaire.f96453b) && this.f96454c == questionnaire.f96454c && Intrinsics.f(this.d, questionnaire.d) && this.e == questionnaire.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + p.a.d(j6.a.c(p.a.c(this.f96452a.hashCode() * 31, 31, this.f96453b), 31, this.f96454c), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96452a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96452a, i);
            dest.writeString(this.f96453b);
            dest.writeInt(this.f96454c ? 1 : 0);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "Predefined", "Workflow", "PennyTopUp", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow$PennyTopUp;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow$Predefined;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow$Workflow;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SdkFlow implements InternalStep {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow$PennyTopUp;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PennyTopUp extends SdkFlow {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f96458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f96459b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f96460c;
            public final String d;
            public final d e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f96461g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f96462h;

            @NotNull
            public static final Parcelable.Creator<PennyTopUp> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    int i;
                    WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) j6.a.f(parcel, "parcel", PennyTopUp.class);
                    String string = parcel.readString();
                    boolean z = true;
                    if (parcel.readInt() != 0) {
                        i = 1;
                    } else {
                        i = 1;
                        z = false;
                    }
                    String string2 = parcel.readString();
                    d dVar = (d) parcel.readSerializable();
                    int i2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i2);
                    int iC = 0;
                    while (iC != i2) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
                    }
                    return new PennyTopUp(workflowStepNavigation, string, z, string2, dVar, arrayList, parcel.readString(), parcel.readInt() != 0 ? i : 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PennyTopUp[i];
                }
            }

            public PennyTopUp(WorkflowStepNavigation navigation, String stepId, boolean z, String workflowId, d amount, List applicableCountries, String str, boolean z3) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(stepId, "stepId");
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
                this.f96458a = navigation;
                this.f96459b = stepId;
                this.f96460c = z;
                this.d = workflowId;
                this.e = amount;
                this.f = applicableCountries;
                this.f96461g = str;
                this.f96462h = z3;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f96462h;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.f96459b;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f96460c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PennyTopUp)) {
                    return false;
                }
                PennyTopUp pennyTopUp = (PennyTopUp) obj2;
                return Intrinsics.f(this.f96458a, pennyTopUp.f96458a) && Intrinsics.f(this.f96459b, pennyTopUp.f96459b) && this.f96460c == pennyTopUp.f96460c && Intrinsics.f(this.d, pennyTopUp.d) && Intrinsics.f(this.e, pennyTopUp.e) && Intrinsics.f(this.f, pennyTopUp.f) && Intrinsics.f(this.f96461g, pennyTopUp.f96461g) && this.f96462h == pennyTopUp.f96462h;
            }

            public final int hashCode() {
                int iD = p.a.d(v7.c(p.a.c(j6.a.c(p.a.c(this.f96458a.hashCode() * 31, 31, this.f96459b), 31, this.f96460c), 31, this.d), 31, this.e), 31, this.f);
                String str = this.f96461g;
                return Boolean.hashCode(this.f96462h) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f96458a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f96458a, i);
                dest.writeString(this.f96459b);
                dest.writeInt(this.f96460c ? 1 : 0);
                dest.writeString(this.d);
                dest.writeSerializable(this.e);
                Iterator itV = p.a.v(this.f, dest);
                while (itV.hasNext()) {
                    dest.writeSerializable((Serializable) itV.next());
                }
                dest.writeString(this.f96461g);
                dest.writeInt(this.f96462h ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow$Predefined;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Predefined extends SdkFlow {

            @NotNull
            public static final Parcelable.Creator<Predefined> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f96463a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f96464b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f96465c;
            public final String d;
            public final String e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) parcel.readParcelable(Predefined.class.getClassLoader());
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                        z3 = false;
                    }
                    String string2 = parcel.readString();
                    boolean z4 = true;
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z4 = z;
                    }
                    return new Predefined(workflowStepNavigation, string, string2, string3, z3, z4);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Predefined[i];
                }
            }

            public Predefined(WorkflowStepNavigation navigation, String stepId, String str, String str2, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(stepId, "stepId");
                this.f96463a = navigation;
                this.f96464b = stepId;
                this.f96465c = z;
                this.d = str;
                this.e = str2;
                this.f = z3;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.f96464b;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f96465c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Predefined)) {
                    return false;
                }
                Predefined predefined = (Predefined) obj2;
                return Intrinsics.f(this.f96463a, predefined.f96463a) && Intrinsics.f(this.f96464b, predefined.f96464b) && this.f96465c == predefined.f96465c && Intrinsics.f(this.d, predefined.d) && Intrinsics.f(this.e, predefined.e) && this.f == predefined.f;
            }

            public final int hashCode() {
                int iC = j6.a.c(p.a.c(this.f96463a.hashCode() * 31, 31, this.f96464b), 31, this.f96465c);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.e;
                return Boolean.hashCode(this.f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f96463a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f96463a, i);
                dest.writeString(this.f96464b);
                dest.writeInt(this.f96465c ? 1 : 0);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow$Workflow;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$SdkFlow;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Workflow extends SdkFlow {

            @NotNull
            public static final Parcelable.Creator<Workflow> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f96466a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f96467b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f96468c;
            public final AnalyticsProduct d;
            public final boolean e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Workflow((WorkflowStepNavigation) parcel.readParcelable(Workflow.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(Workflow.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Workflow[i];
                }
            }

            public Workflow(WorkflowStepNavigation navigation, String stepId, boolean z, AnalyticsProduct analyticsProduct, boolean z3) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(stepId, "stepId");
                this.f96466a = navigation;
                this.f96467b = stepId;
                this.f96468c = z;
                this.d = analyticsProduct;
                this.e = z3;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.f96467b;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f96468c;
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
                return Intrinsics.f(this.f96466a, workflow.f96466a) && Intrinsics.f(this.f96467b, workflow.f96467b) && this.f96468c == workflow.f96468c && Intrinsics.f(this.d, workflow.d) && this.e == workflow.e;
            }

            public final int hashCode() {
                int iC = j6.a.c(p.a.c(this.f96466a.hashCode() * 31, 31, this.f96467b), 31, this.f96468c);
                AnalyticsProduct analyticsProduct = this.d;
                return Boolean.hashCode(this.e) + ((iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f96466a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f96466a, i);
                dest.writeString(this.f96467b);
                dest.writeInt(this.f96468c ? 1 : 0);
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$TrackingConsent;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackingConsent implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<TrackingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96471c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrackingConsent((WorkflowStepNavigation) parcel.readParcelable(TrackingConsent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackingConsent[i];
            }
        }

        public TrackingConsent(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f96469a = navigation;
            this.f96470b = stepId;
            this.f96471c = z;
            this.d = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96470b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96471c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrackingConsent)) {
                return false;
            }
            TrackingConsent trackingConsent = (TrackingConsent) obj2;
            return Intrinsics.f(this.f96469a, trackingConsent.f96469a) && Intrinsics.f(this.f96470b, trackingConsent.f96470b) && this.f96471c == trackingConsent.f96471c && this.d == trackingConsent.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f96469a.hashCode() * 31, 31, this.f96470b), 31, this.f96471c);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96469a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96469a, i);
            dest.writeString(this.f96470b);
            dest.writeInt(this.f96471c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$Workflow;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96474c;
        public final String d;
        public final b e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                b bVar;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) parcel.readParcelable(Workflow.class.getClassLoader());
                String string = parcel.readString();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string2 = parcel.readString();
                b bVar2 = (b) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                    z4 = z;
                }
                return new Workflow(workflowStepNavigation, string, z6, string2, bVar, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(WorkflowStepNavigation navigation, String str, boolean z, String workflowId, b countryCode, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f96472a = navigation;
            this.f96473b = str;
            this.f96474c = z;
            this.d = workflowId;
            this.e = countryCode;
            this.f = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96473b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96474c;
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
            return Intrinsics.f(this.f96472a, workflow.f96472a) && Intrinsics.f(this.f96473b, workflow.f96473b) && this.f96474c == workflow.f96474c && Intrinsics.f(this.d, workflow.d) && Intrinsics.f(this.e, workflow.e) && this.f == workflow.f;
        }

        public final int hashCode() {
            int iHashCode = this.f96472a.hashCode() * 31;
            String str = this.f96473b;
            return Boolean.hashCode(this.f) + p.a.c(p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96474c), 31, this.d), 31, this.e.f297794a);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96472a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96472a, i);
            dest.writeString(this.f96473b);
            dest.writeInt(this.f96474c ? 1 : 0);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$WorkflowEligibility;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WorkflowEligibility implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<WorkflowEligibility> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96477c;
        public final b d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                b bVar;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigation = (WorkflowStepNavigation) parcel.readParcelable(WorkflowEligibility.class.getClassLoader());
                String string = parcel.readString();
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z4 = false;
                }
                b bVar2 = (b) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    bVar = bVar2;
                    z3 = z;
                } else {
                    z3 = false;
                    bVar = bVar2;
                }
                return new WorkflowEligibility(workflowStepNavigation, string, bVar, z4, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WorkflowEligibility[i];
            }
        }

        public WorkflowEligibility(WorkflowStepNavigation navigation, String str, b countryCode, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f96475a = navigation;
            this.f96476b = str;
            this.f96477c = z;
            this.d = countryCode;
            this.e = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96476b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96477c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WorkflowEligibility)) {
                return false;
            }
            WorkflowEligibility workflowEligibility = (WorkflowEligibility) obj2;
            return Intrinsics.f(this.f96475a, workflowEligibility.f96475a) && Intrinsics.f(this.f96476b, workflowEligibility.f96476b) && this.f96477c == workflowEligibility.f96477c && Intrinsics.f(this.d, workflowEligibility.d) && this.e == workflowEligibility.e;
        }

        public final int hashCode() {
            int iHashCode = this.f96475a.hashCode() * 31;
            String str = this.f96476b;
            return Boolean.hashCode(this.e) + p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96477c), 31, this.d.f297794a);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96475a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96475a, i);
            dest.writeString(this.f96476b);
            dest.writeInt(this.f96477c ? 1 : 0);
            dest.writeSerializable(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep$RequestForUserAuth;", "Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/InternalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestForUserAuth implements InternalStep {

        @NotNull
        public static final Parcelable.Creator<RequestForUserAuth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f96455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96457c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestForUserAuth((WorkflowStepNavigation) parcel.readParcelable(RequestForUserAuth.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestForUserAuth[i];
            }
        }

        public RequestForUserAuth(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f96455a = navigation;
            this.f96456b = stepId;
            this.f96457c = z;
            this.d = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f96456b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f96457c;
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
            return Intrinsics.f(this.f96455a, requestForUserAuth.f96455a) && Intrinsics.f(this.f96456b, requestForUserAuth.f96456b) && this.f96457c == requestForUserAuth.f96457c && this.d == requestForUserAuth.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f96455a.hashCode() * 31, 31, this.f96456b), 31, this.f96457c);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f96455a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96455a, i);
            dest.writeString(this.f96456b);
            dest.writeInt(this.f96457c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RequestForUserAuth(String str, boolean z, boolean z3) {
            this(WorkflowStepNavigation.e, str, z, z3);
            WorkflowStepNavigation.INSTANCE.getClass();
        }
    }
}
