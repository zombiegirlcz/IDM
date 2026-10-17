package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CitizenshipPicker", "AlternativeDocuments", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep$AlternativeDocuments;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep$CitizenshipPicker;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentSelectionControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep$AlternativeDocuments;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlternativeDocuments implements DocumentSelectionControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AlternativeDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentSelectionConfiguration.AlternativeDocuments f96426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f96428c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowDocumentSelectionConfiguration.AlternativeDocuments alternativeDocumentsCreateFromParcel = WorkflowDocumentSelectionConfiguration.AlternativeDocuments.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AlternativeDocuments.class, parcel, arrayList, iE, 1);
                }
                return new AlternativeDocuments(alternativeDocumentsCreateFromParcel, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlternativeDocuments[i];
            }
        }

        public AlternativeDocuments(WorkflowDocumentSelectionConfiguration.AlternativeDocuments configuration, String submitButtonText, List sections) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
            Intrinsics.checkNotNullParameter(sections, "sections");
            this.f96426a = configuration;
            this.f96427b = submitButtonText;
            this.f96428c = sections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AlternativeDocuments)) {
                return false;
            }
            AlternativeDocuments alternativeDocuments = (AlternativeDocuments) obj2;
            return Intrinsics.f(this.f96426a, alternativeDocuments.f96426a) && Intrinsics.f(this.f96427b, alternativeDocuments.f96427b) && Intrinsics.f(this.f96428c, alternativeDocuments.f96428c);
        }

        public final int hashCode() {
            return this.f96428c.hashCode() + p.a.c(this.f96426a.hashCode() * 31, 31, this.f96427b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96426a.writeToParcel(dest, i);
            dest.writeString(this.f96427b);
            Iterator itV = p.a.v(this.f96428c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep$CitizenshipPicker;", "Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$ModalStep;", "<init>", "()V", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CitizenshipPicker implements DocumentSelectionControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CitizenshipPicker f96429a = new CitizenshipPicker();

        @NotNull
        public static final Parcelable.Creator<CitizenshipPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CitizenshipPicker.f96429a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CitizenshipPicker[i];
            }
        }

        private CitizenshipPicker() {
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
