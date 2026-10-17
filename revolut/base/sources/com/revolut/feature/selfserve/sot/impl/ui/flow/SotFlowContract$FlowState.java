package com.revolut.feature.selfserve.sot.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/selfserve/sot/impl/ui/flow/SotFlowContract$FlowState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SotFlowContract$FlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SotFlowContract$FlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSource f85913c;
    public final List d;
    public final DocumentType e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f85914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f85915h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f85916j;
    public final SubmissionEvidence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f85917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xyc.e f85918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f85919n;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            IncomeSource incomeSource = (IncomeSource) parcel.readParcelable(SotFlowContract$FlowState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SotFlowContract$FlowState.class, parcel, arrayList, iE, 1);
                }
            }
            DocumentType documentType = (DocumentType) parcel.readParcelable(SotFlowContract$FlowState.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DocumentUpload.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new SotFlowContract$FlowState(z, string, incomeSource, arrayList, documentType, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (SubmissionEvidence) parcel.readParcelable(SotFlowContract$FlowState.class.getClassLoader()), parcel.readString(), xyc.e.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SotFlowContract$FlowState[i];
        }
    }

    public SotFlowContract$FlowState() {
        this(false, 16383);
    }

    public static SotFlowContract$FlowState a(SotFlowContract$FlowState sotFlowContract$FlowState, boolean z, String str, IncomeSource incomeSource, List list, DocumentType documentType, List list2, String str2, String str3, String str4, String str5, SubmissionEvidence submissionEvidence, String str6, xyc.e eVar, boolean z3, int i) {
        boolean z4 = (i & 1) != 0 ? sotFlowContract$FlowState.f85911a : z;
        String transactionId = (i & 2) != 0 ? sotFlowContract$FlowState.f85912b : str;
        IncomeSource incomeSource2 = (i & 4) != 0 ? sotFlowContract$FlowState.f85913c : incomeSource;
        List list3 = (i & 8) != 0 ? sotFlowContract$FlowState.d : list;
        DocumentType documentType2 = (i & 16) != 0 ? sotFlowContract$FlowState.e : documentType;
        List documentsToUpload = (i & 32) != 0 ? sotFlowContract$FlowState.f : list2;
        String description = (i & 64) != 0 ? sotFlowContract$FlowState.f85914g : str2;
        String note = (i & 128) != 0 ? sotFlowContract$FlowState.f85915h : str3;
        String enteredNote = (i & 256) != 0 ? sotFlowContract$FlowState.i : str4;
        String str7 = (i & 512) != 0 ? sotFlowContract$FlowState.f85916j : str5;
        SubmissionEvidence submissionEvidence2 = (i & 1024) != 0 ? sotFlowContract$FlowState.k : submissionEvidence;
        String actionToDoId = (i & 2048) != 0 ? sotFlowContract$FlowState.f85917l : str6;
        xyc.e flowReviewState = (i & 4096) != 0 ? sotFlowContract$FlowState.f85918m : eVar;
        boolean z6 = (i & 8192) != 0 ? sotFlowContract$FlowState.f85919n : z3;
        sotFlowContract$FlowState.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(enteredNote, "enteredNote");
        Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
        Intrinsics.checkNotNullParameter(flowReviewState, "flowReviewState");
        return new SotFlowContract$FlowState(z4, transactionId, incomeSource2, list3, documentType2, documentsToUpload, description, note, enteredNote, str7, submissionEvidence2, actionToDoId, flowReviewState, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SotFlowContract$FlowState)) {
            return false;
        }
        SotFlowContract$FlowState sotFlowContract$FlowState = (SotFlowContract$FlowState) obj2;
        return this.f85911a == sotFlowContract$FlowState.f85911a && Intrinsics.f(this.f85912b, sotFlowContract$FlowState.f85912b) && Intrinsics.f(this.f85913c, sotFlowContract$FlowState.f85913c) && Intrinsics.f(this.d, sotFlowContract$FlowState.d) && Intrinsics.f(this.e, sotFlowContract$FlowState.e) && Intrinsics.f(this.f, sotFlowContract$FlowState.f) && Intrinsics.f(this.f85914g, sotFlowContract$FlowState.f85914g) && Intrinsics.f(this.f85915h, sotFlowContract$FlowState.f85915h) && Intrinsics.f(this.i, sotFlowContract$FlowState.i) && Intrinsics.f(this.f85916j, sotFlowContract$FlowState.f85916j) && Intrinsics.f(this.k, sotFlowContract$FlowState.k) && Intrinsics.f(this.f85917l, sotFlowContract$FlowState.f85917l) && this.f85918m == sotFlowContract$FlowState.f85918m && this.f85919n == sotFlowContract$FlowState.f85919n;
    }

    public final int hashCode() {
        int iC = p.a.c(Boolean.hashCode(this.f85911a) * 31, 31, this.f85912b);
        IncomeSource incomeSource = this.f85913c;
        int iHashCode = (iC + (incomeSource == null ? 0 : incomeSource.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        DocumentType documentType = this.e;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.d((iHashCode2 + (documentType == null ? 0 : documentType.hashCode())) * 31, 31, this.f), 31, this.f85914g), 31, this.f85915h), 31, this.i);
        String str = this.f85916j;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        SubmissionEvidence submissionEvidence = this.k;
        return Boolean.hashCode(this.f85919n) + ((this.f85918m.hashCode() + p.a.c((iHashCode3 + (submissionEvidence != null ? submissionEvidence.hashCode() : 0)) * 31, 31, this.f85917l)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f85911a ? 1 : 0);
        dest.writeString(this.f85912b);
        dest.writeParcelable(this.f85913c, i);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeParcelable(this.e, i);
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            ((DocumentUpload) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f85914g);
        dest.writeString(this.f85915h);
        dest.writeString(this.i);
        dest.writeString(this.f85916j);
        dest.writeParcelable(this.k, i);
        dest.writeString(this.f85917l);
        dest.writeString(this.f85918m.name());
        dest.writeInt(this.f85919n ? 1 : 0);
    }

    public SotFlowContract$FlowState(boolean z, String transactionId, IncomeSource incomeSource, List list, DocumentType documentType, List documentsToUpload, String description, String note, String enteredNote, String str, SubmissionEvidence submissionEvidence, String actionToDoId, xyc.e flowReviewState, boolean z3) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(enteredNote, "enteredNote");
        Intrinsics.checkNotNullParameter(actionToDoId, "actionToDoId");
        Intrinsics.checkNotNullParameter(flowReviewState, "flowReviewState");
        this.f85911a = z;
        this.f85912b = transactionId;
        this.f85913c = incomeSource;
        this.d = list;
        this.e = documentType;
        this.f = documentsToUpload;
        this.f85914g = description;
        this.f85915h = note;
        this.i = enteredNote;
        this.f85916j = str;
        this.k = submissionEvidence;
        this.f85917l = actionToDoId;
        this.f85918m = flowReviewState;
        this.f85919n = z3;
    }

    public SotFlowContract$FlowState(boolean z, int i) {
        this((i & 1) != 0 ? false : z, "", null, null, null, f0.f322471a, "", "", "", null, null, "", xyc.e.USER_ACTION_REQUIRED, false);
    }
}
