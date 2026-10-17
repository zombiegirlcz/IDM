package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CitizenshipPicker", "SingleCitizenshipPrompt", "DocumentSelection", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step$CitizenshipPicker;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step$DocumentSelection;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step$SingleCitizenshipPrompt;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WorkflowDocumentSelectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step$CitizenshipPicker;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CitizenshipPicker extends WorkflowDocumentSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CitizenshipPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f96406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f96407b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CitizenshipPicker.class, parcel, arrayList, iE, 1);
                }
                return new CitizenshipPicker(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CitizenshipPicker[i];
            }
        }

        public CitizenshipPicker(ArrayList citizenshipGroups, wi0.b preselectedCitizenship) {
            Intrinsics.checkNotNullParameter(preselectedCitizenship, "preselectedCitizenship");
            Intrinsics.checkNotNullParameter(citizenshipGroups, "citizenshipGroups");
            this.f96406a = preselectedCitizenship;
            this.f96407b = citizenshipGroups;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CitizenshipPicker)) {
                return false;
            }
            CitizenshipPicker citizenshipPicker = (CitizenshipPicker) obj2;
            return Intrinsics.f(this.f96406a, citizenshipPicker.f96406a) && this.f96407b.equals(citizenshipPicker.f96407b);
        }

        public final int hashCode() {
            return this.f96407b.hashCode() + (this.f96406a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96406a);
            Iterator itY = j6.a.y(this.f96407b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step$DocumentSelection;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelection extends WorkflowDocumentSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f96408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f96409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f96410c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int iE = 0;
                boolean z = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iE != i) {
                    iE = j6.a.e(DocumentSelection.class, parcel, arrayList, iE, 1);
                }
                return new DocumentSelection(bVar, z, z3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        public DocumentSelection(wi0.b citizenship, boolean z, boolean z3, List citizenshipGroups) {
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            Intrinsics.checkNotNullParameter(citizenshipGroups, "citizenshipGroups");
            this.f96408a = citizenship;
            this.f96409b = z;
            this.f96410c = z3;
            this.d = citizenshipGroups;
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
            return Intrinsics.f(this.f96408a, documentSelection.f96408a) && this.f96409b == documentSelection.f96409b && this.f96410c == documentSelection.f96410c && Intrinsics.f(this.d, documentSelection.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(j6.a.c(this.f96408a.f297794a.hashCode() * 31, 31, this.f96409b), 31, this.f96410c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96408a);
            dest.writeInt(this.f96409b ? 1 : 0);
            dest.writeInt(this.f96410c ? 1 : 0);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step$SingleCitizenshipPrompt;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleCitizenshipPrompt extends WorkflowDocumentSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SingleCitizenshipPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f96411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96412b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleCitizenshipPrompt((wi0.b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleCitizenshipPrompt[i];
            }
        }

        public SingleCitizenshipPrompt(wi0.b citizenship, String str) {
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            this.f96411a = citizenship;
            this.f96412b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleCitizenshipPrompt)) {
                return false;
            }
            SingleCitizenshipPrompt singleCitizenshipPrompt = (SingleCitizenshipPrompt) obj2;
            return Intrinsics.f(this.f96411a, singleCitizenshipPrompt.f96411a) && Intrinsics.f(this.f96412b, singleCitizenshipPrompt.f96412b);
        }

        public final int hashCode() {
            int iHashCode = this.f96411a.f297794a.hashCode() * 31;
            String str = this.f96412b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96411a);
            dest.writeString(this.f96412b);
        }
    }

    private WorkflowDocumentSelectionFlowContract$Step() {
    }
}
