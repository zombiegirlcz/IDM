package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/SubmissionEvidence;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmissionEvidence implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<SubmissionEvidence> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85883c;
    public final OriginRef d;
    public final SubmissionEvidenceType e;
    public final SubmissionEvidenceReviewState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EvidenceDetails f85884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f85885h;
    public final SubmissionActionToDo i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            OriginRef originRefCreateFromParcel = OriginRef.CREATOR.createFromParcel(parcel);
            SubmissionEvidenceType submissionEvidenceTypeCreateFromParcel = SubmissionEvidenceType.CREATOR.createFromParcel(parcel);
            SubmissionEvidenceReviewState submissionEvidenceReviewStateCreateFromParcel = SubmissionEvidenceReviewState.CREATOR.createFromParcel(parcel);
            EvidenceDetails evidenceDetailsCreateFromParcel = EvidenceDetails.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EvidenceDocument.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SubmissionEvidence(string, string2, string3, originRefCreateFromParcel, submissionEvidenceTypeCreateFromParcel, submissionEvidenceReviewStateCreateFromParcel, evidenceDetailsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : SubmissionActionToDo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmissionEvidence[i];
        }
    }

    public SubmissionEvidence(String id10, String title, String str, OriginRef originRef, SubmissionEvidenceType evidenceType, SubmissionEvidenceReviewState reviewState, EvidenceDetails details, ArrayList documents, SubmissionActionToDo submissionActionToDo) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(originRef, "originRef");
        Intrinsics.checkNotNullParameter(evidenceType, "evidenceType");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f85881a = id10;
        this.f85882b = title;
        this.f85883c = str;
        this.d = originRef;
        this.e = evidenceType;
        this.f = reviewState;
        this.f85884g = details;
        this.f85885h = documents;
        this.i = submissionActionToDo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmissionEvidence)) {
            return false;
        }
        SubmissionEvidence submissionEvidence = (SubmissionEvidence) obj2;
        return Intrinsics.f(this.f85881a, submissionEvidence.f85881a) && Intrinsics.f(this.f85882b, submissionEvidence.f85882b) && Intrinsics.f(this.f85883c, submissionEvidence.f85883c) && Intrinsics.f(this.d, submissionEvidence.d) && Intrinsics.f(this.e, submissionEvidence.e) && Intrinsics.f(this.f, submissionEvidence.f) && Intrinsics.f(this.f85884g, submissionEvidence.f85884g) && this.f85885h.equals(submissionEvidence.f85885h) && Intrinsics.f(this.i, submissionEvidence.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85881a.hashCode() * 31, 31, this.f85882b);
        String str = this.f85883c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f85885h, (this.f85884g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31);
        SubmissionActionToDo submissionActionToDo = this.i;
        return iB + (submissionActionToDo != null ? submissionActionToDo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85881a);
        dest.writeString(this.f85882b);
        dest.writeString(this.f85883c);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        this.f85884g.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f85885h, dest);
        while (itY.hasNext()) {
            ((EvidenceDocument) itY.next()).writeToParcel(dest, i);
        }
        SubmissionActionToDo submissionActionToDo = this.i;
        if (submissionActionToDo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submissionActionToDo.writeToParcel(dest, i);
        }
    }
}
