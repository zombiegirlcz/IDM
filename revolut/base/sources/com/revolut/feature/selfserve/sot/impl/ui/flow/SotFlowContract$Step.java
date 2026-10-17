package com.revolut.feature.selfserve.sot.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Loading", "Home", "Status", "EvidenceTypes", "EvidenceDescription", "EvidenceList", "Summary", "AddNote", "DocumentSelection", "OtherDocument", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$AddNote;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$DocumentSelection;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$EvidenceDescription;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$EvidenceList;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$EvidenceTypes;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Home;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Loading;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$OtherDocument;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Status;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Summary;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SotFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$AddNote;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNote extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddNote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85920a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNote(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNote[i];
            }
        }

        public AddNote(String currentNote) {
            Intrinsics.checkNotNullParameter(currentNote, "currentNote");
            this.f85920a = currentNote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNote) && Intrinsics.f(this.f85920a, ((AddNote) obj2).f85920a);
        }

        public final int hashCode() {
            return this.f85920a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85920a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$DocumentSelection;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelection extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IncomeSource f85921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f85922b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                IncomeSource incomeSource = (IncomeSource) j6.a.f(parcel, "parcel", DocumentSelection.class);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(DocumentSelection.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new DocumentSelection(incomeSource, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        public DocumentSelection(IncomeSource incomeSource, List list) {
            Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
            this.f85921a = incomeSource;
            this.f85922b = list;
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
            return Intrinsics.f(this.f85921a, documentSelection.f85921a) && Intrinsics.f(this.f85922b, documentSelection.f85922b);
        }

        public final int hashCode() {
            int iHashCode = this.f85921a.hashCode() * 31;
            List list = this.f85922b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85921a, i);
            List list = this.f85922b;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$EvidenceList;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceList extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentType f85924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubmissionEvidence f85925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f85926c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceList((DocumentType) parcel.readParcelable(EvidenceList.class.getClassLoader()), (SubmissionEvidence) parcel.readParcelable(EvidenceList.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceList[i];
            }
        }

        public EvidenceList(DocumentType documentType, SubmissionEvidence submissionEvidence, String actionToDoId, boolean z) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
            this.f85924a = documentType;
            this.f85925b = submissionEvidence;
            this.f85926c = actionToDoId;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EvidenceList)) {
                return false;
            }
            EvidenceList evidenceList = (EvidenceList) obj2;
            return Intrinsics.f(this.f85924a, evidenceList.f85924a) && Intrinsics.f(this.f85925b, evidenceList.f85925b) && Intrinsics.f(this.f85926c, evidenceList.f85926c) && this.d == evidenceList.d;
        }

        public final int hashCode() {
            int iHashCode = this.f85924a.hashCode() * 31;
            SubmissionEvidence submissionEvidence = this.f85925b;
            return Boolean.hashCode(this.d) + p.a.c((iHashCode + (submissionEvidence == null ? 0 : submissionEvidence.hashCode())) * 31, 31, this.f85926c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85924a, i);
            dest.writeParcelable(this.f85925b, i);
            dest.writeString(this.f85926c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$EvidenceTypes;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceTypes extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceTypes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f85928b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceTypes(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceTypes[i];
            }
        }

        public EvidenceTypes(String transactionId, boolean z) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f85927a = transactionId;
            this.f85928b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EvidenceTypes)) {
                return false;
            }
            EvidenceTypes evidenceTypes = (EvidenceTypes) obj2;
            return Intrinsics.f(this.f85927a, evidenceTypes.f85927a) && this.f85928b == evidenceTypes.f85928b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85928b) + (this.f85927a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85927a);
            dest.writeInt(this.f85928b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Home;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home extends SotFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f85929a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f85929a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Loading;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends SotFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f85930a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f85930a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Status;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Status extends SotFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Status f85932a = new Status();

        @NotNull
        public static final Parcelable.Creator<Status> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Status.f85932a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Status[i];
            }
        }

        private Status() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$Summary;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IncomeSource f85934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SubmissionEvidence f85935c;
        public final String d;
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final DocumentType f85936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f85937h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                IncomeSource incomeSource = (IncomeSource) parcel.readParcelable(Summary.class.getClassLoader());
                SubmissionEvidence submissionEvidence = (SubmissionEvidence) parcel.readParcelable(Summary.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DocumentUpload.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Summary(string, incomeSource, submissionEvidence, string2, string3, arrayList, (DocumentType) parcel.readParcelable(Summary.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(String transactionId, IncomeSource incomeSource, SubmissionEvidence submissionEvidence, String description, String note, List documentsToUpload, DocumentType documentType, String str) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(note, "note");
            Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
            this.f85933a = transactionId;
            this.f85934b = incomeSource;
            this.f85935c = submissionEvidence;
            this.d = description;
            this.e = note;
            this.f = documentsToUpload;
            this.f85936g = documentType;
            this.f85937h = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj2;
            return Intrinsics.f(this.f85933a, summary.f85933a) && Intrinsics.f(this.f85934b, summary.f85934b) && Intrinsics.f(this.f85935c, summary.f85935c) && Intrinsics.f(this.d, summary.d) && Intrinsics.f(this.e, summary.e) && Intrinsics.f(this.f, summary.f) && Intrinsics.f(this.f85936g, summary.f85936g) && Intrinsics.f(this.f85937h, summary.f85937h);
        }

        public final int hashCode() {
            int iHashCode = this.f85933a.hashCode() * 31;
            IncomeSource incomeSource = this.f85934b;
            int iHashCode2 = (iHashCode + (incomeSource == null ? 0 : incomeSource.hashCode())) * 31;
            SubmissionEvidence submissionEvidence = this.f85935c;
            int iD = p.a.d(p.a.c(p.a.c((iHashCode2 + (submissionEvidence == null ? 0 : submissionEvidence.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
            DocumentType documentType = this.f85936g;
            int iHashCode3 = (iD + (documentType == null ? 0 : documentType.hashCode())) * 31;
            String str = this.f85937h;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85933a);
            dest.writeParcelable(this.f85934b, i);
            dest.writeParcelable(this.f85935c, i);
            dest.writeString(this.d);
            dest.writeString(this.e);
            Iterator itV = p.a.v(this.f, dest);
            while (itV.hasNext()) {
                ((DocumentUpload) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f85936g, i);
            dest.writeString(this.f85937h);
        }
    }

    private SotFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$EvidenceDescription;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceDescription extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceDescription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85923a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EvidenceDescription(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceDescription[i];
            }
        }

        public EvidenceDescription(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f85923a = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EvidenceDescription) && Intrinsics.f(this.f85923a, ((EvidenceDescription) obj2).f85923a);
        }

        public final int hashCode() {
            return this.f85923a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85923a);
        }

        public EvidenceDescription() {
            this("");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step$OtherDocument;", "Lcom/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtherDocument extends SotFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OtherDocument> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85931a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OtherDocument(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherDocument[i];
            }
        }

        public OtherDocument(String userDefinedType) {
            Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
            this.f85931a = userDefinedType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OtherDocument) && Intrinsics.f(this.f85931a, ((OtherDocument) obj2).f85931a);
        }

        public final int hashCode() {
            return this.f85931a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85931a);
        }

        public OtherDocument() {
            this("");
        }
    }
}
