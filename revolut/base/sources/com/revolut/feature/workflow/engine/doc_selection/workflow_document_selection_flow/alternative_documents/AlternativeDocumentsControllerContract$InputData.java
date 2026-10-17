package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/alternative_documents/AlternativeDocumentsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlternativeDocumentsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AlternativeDocumentsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDocumentSelectionConfiguration.AlternativeDocuments f96413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96415c;

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
                iE = j6.a.e(AlternativeDocumentsControllerContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new AlternativeDocumentsControllerContract$InputData(alternativeDocumentsCreateFromParcel, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlternativeDocumentsControllerContract$InputData[i];
        }
    }

    public AlternativeDocumentsControllerContract$InputData(WorkflowDocumentSelectionConfiguration.AlternativeDocuments configuration, String submitButtonText, List sections) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f96413a = configuration;
        this.f96414b = submitButtonText;
        this.f96415c = sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AlternativeDocumentsControllerContract$InputData)) {
            return false;
        }
        AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = (AlternativeDocumentsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f96413a, alternativeDocumentsControllerContract$InputData.f96413a) && Intrinsics.f(this.f96414b, alternativeDocumentsControllerContract$InputData.f96414b) && Intrinsics.f(this.f96415c, alternativeDocumentsControllerContract$InputData.f96415c);
    }

    public final int hashCode() {
        return this.f96415c.hashCode() + p.a.c(this.f96413a.hashCode() * 31, 31, this.f96414b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96413a.writeToParcel(dest, i);
        dest.writeString(this.f96414b);
        Iterator itV = p.a.v(this.f96415c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
