package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionConfiguration;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "DocumentSelection", "AlternativeDocuments", "CitizenshipPicker", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowDocumentSelectionConfiguration implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WorkflowDocumentSelectionConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentSelection f96392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CitizenshipPicker f96393b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionConfiguration$AlternativeDocuments;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlternativeDocuments implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AlternativeDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96396c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AlternativeDocuments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlternativeDocuments[i];
            }
        }

        public AlternativeDocuments(String title, String str, String alternativeMethodsLabel, String alternativeMethodsFaqDeeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(alternativeMethodsLabel, "alternativeMethodsLabel");
            Intrinsics.checkNotNullParameter(alternativeMethodsFaqDeeplink, "alternativeMethodsFaqDeeplink");
            this.f96394a = title;
            this.f96395b = str;
            this.f96396c = alternativeMethodsLabel;
            this.d = alternativeMethodsFaqDeeplink;
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
            return Intrinsics.f(this.f96394a, alternativeDocuments.f96394a) && Intrinsics.f(this.f96395b, alternativeDocuments.f96395b) && Intrinsics.f(this.f96396c, alternativeDocuments.f96396c) && Intrinsics.f(this.d, alternativeDocuments.d);
        }

        public final int hashCode() {
            int iHashCode = this.f96394a.hashCode() * 31;
            String str = this.f96395b;
            return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96396c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96394a);
            dest.writeString(this.f96395b);
            dest.writeString(this.f96396c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionConfiguration$CitizenshipPicker;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CitizenshipPicker implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CitizenshipPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96399c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CitizenshipPicker(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CitizenshipPicker[i];
            }
        }

        public CitizenshipPicker(String citizenshipsQuery, String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(citizenshipsQuery, "citizenshipsQuery");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f96397a = citizenshipsQuery;
            this.f96398b = title;
            this.f96399c = str;
            this.d = str2;
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
            return Intrinsics.f(this.f96397a, citizenshipPicker.f96397a) && Intrinsics.f(this.f96398b, citizenshipPicker.f96398b) && Intrinsics.f(this.f96399c, citizenshipPicker.f96399c) && Intrinsics.f(this.d, citizenshipPicker.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f96397a.hashCode() * 31, 31, this.f96398b);
            String str = this.f96399c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96397a);
            dest.writeString(this.f96398b);
            dest.writeString(this.f96399c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/doc_selection/workflow_document_selection_flow/WorkflowDocumentSelectionConfiguration$DocumentSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96402c;
        public final String d;
        public final String e;
        public final AlternativeDocuments f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentSelection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AlternativeDocuments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        public DocumentSelection(String applicableDocumentsQuery, String title, String str, String submitButton, String str2, AlternativeDocuments alternativeDocuments) {
            Intrinsics.checkNotNullParameter(applicableDocumentsQuery, "applicableDocumentsQuery");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.f96400a = applicableDocumentsQuery;
            this.f96401b = title;
            this.f96402c = str;
            this.d = submitButton;
            this.e = str2;
            this.f = alternativeDocuments;
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
            return Intrinsics.f(this.f96400a, documentSelection.f96400a) && Intrinsics.f(this.f96401b, documentSelection.f96401b) && Intrinsics.f(this.f96402c, documentSelection.f96402c) && Intrinsics.f(this.d, documentSelection.d) && Intrinsics.f(this.e, documentSelection.e) && Intrinsics.f(this.f, documentSelection.f);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f96400a.hashCode() * 31, 31, this.f96401b);
            String str = this.f96402c;
            int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AlternativeDocuments alternativeDocuments = this.f;
            return iHashCode + (alternativeDocuments != null ? alternativeDocuments.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96400a);
            dest.writeString(this.f96401b);
            dest.writeString(this.f96402c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            AlternativeDocuments alternativeDocuments = this.f;
            if (alternativeDocuments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                alternativeDocuments.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkflowDocumentSelectionConfiguration(DocumentSelection.CREATOR.createFromParcel(parcel), CitizenshipPicker.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowDocumentSelectionConfiguration[i];
        }
    }

    public WorkflowDocumentSelectionConfiguration(DocumentSelection documentSelection, CitizenshipPicker citizenshipPicker) {
        Intrinsics.checkNotNullParameter(documentSelection, "documentSelection");
        Intrinsics.checkNotNullParameter(citizenshipPicker, "citizenshipPicker");
        this.f96392a = documentSelection;
        this.f96393b = citizenshipPicker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowDocumentSelectionConfiguration)) {
            return false;
        }
        WorkflowDocumentSelectionConfiguration workflowDocumentSelectionConfiguration = (WorkflowDocumentSelectionConfiguration) obj2;
        return Intrinsics.f(this.f96392a, workflowDocumentSelectionConfiguration.f96392a) && Intrinsics.f(this.f96393b, workflowDocumentSelectionConfiguration.f96393b);
    }

    public final int hashCode() {
        return this.f96393b.hashCode() + (this.f96392a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96392a.writeToParcel(dest, i);
        this.f96393b.writeToParcel(dest, i);
    }
}
