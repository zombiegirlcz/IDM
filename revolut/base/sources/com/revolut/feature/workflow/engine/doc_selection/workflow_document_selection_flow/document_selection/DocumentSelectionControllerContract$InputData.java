package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/document_selection/DocumentSelectionControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSelectionControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentSelectionControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDocumentSelectionConfiguration f96421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f96422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96423c;
    public final String d;
    public final AnalyticsProduct e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f96424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f96425h;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Class cls;
            AnalyticsProduct analyticsProduct;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WorkflowDocumentSelectionConfiguration workflowDocumentSelectionConfigurationCreateFromParcel = WorkflowDocumentSelectionConfiguration.CREATOR.createFromParcel(parcel);
            b bVar = (b) parcel.readSerializable();
            int iE = 0;
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z3 = false;
            }
            String string = parcel.readString();
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(DocumentSelectionControllerContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = DocumentSelectionControllerContract$InputData.class;
                analyticsProduct = analyticsProduct2;
                z = i;
            } else {
                cls = DocumentSelectionControllerContract$InputData.class;
                analyticsProduct = analyticsProduct2;
                z = 0;
            }
            int i2 = parcel.readInt();
            Class cls2 = cls;
            ArrayList arrayList = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(cls2, parcel, arrayList, iE, i);
            }
            return new DocumentSelectionControllerContract$InputData(workflowDocumentSelectionConfigurationCreateFromParcel, bVar, z3, string, analyticsProduct, z, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentSelectionControllerContract$InputData[i];
        }
    }

    public DocumentSelectionControllerContract$InputData(WorkflowDocumentSelectionConfiguration configuration, b preselectedCitizenship, boolean z, String workflowStepId, AnalyticsProduct analyticsProduct, boolean z3, List citizenshipGroups, String str) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(preselectedCitizenship, "preselectedCitizenship");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        Intrinsics.checkNotNullParameter(citizenshipGroups, "citizenshipGroups");
        this.f96421a = configuration;
        this.f96422b = preselectedCitizenship;
        this.f96423c = z;
        this.d = workflowStepId;
        this.e = analyticsProduct;
        this.f = z3;
        this.f96424g = citizenshipGroups;
        this.f96425h = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentSelectionControllerContract$InputData)) {
            return false;
        }
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = (DocumentSelectionControllerContract$InputData) obj2;
        return Intrinsics.f(this.f96421a, documentSelectionControllerContract$InputData.f96421a) && Intrinsics.f(this.f96422b, documentSelectionControllerContract$InputData.f96422b) && this.f96423c == documentSelectionControllerContract$InputData.f96423c && Intrinsics.f(this.d, documentSelectionControllerContract$InputData.d) && Intrinsics.f(this.e, documentSelectionControllerContract$InputData.e) && this.f == documentSelectionControllerContract$InputData.f && Intrinsics.f(this.f96424g, documentSelectionControllerContract$InputData.f96424g) && Intrinsics.f(this.f96425h, documentSelectionControllerContract$InputData.f96425h);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(p.a.c(this.f96421a.hashCode() * 31, 31, this.f96422b.f297794a), 31, this.f96423c), 31, this.d);
        AnalyticsProduct analyticsProduct = this.e;
        int iD = p.a.d(j6.a.c((iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31, 31, this.f), 31, this.f96424g);
        String str = this.f96425h;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96421a.writeToParcel(dest, i);
        dest.writeSerializable(this.f96422b);
        dest.writeInt(this.f96423c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        Iterator itV = p.a.v(this.f96424g, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f96425h);
    }
}
