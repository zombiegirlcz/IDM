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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/EvidenceDocument;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EvidenceDocument implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<EvidenceDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentType f85866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f85867c;
    public final EvidenceDocumentDetails d;
    public final SubmissionEvidenceReviewState e;
    public final SubmissionActionToDo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f85868g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            DocumentType documentTypeCreateFromParcel = DocumentType.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EvidenceDocumentPage.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EvidenceDocument(string, documentTypeCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : EvidenceDocumentDetails.CREATOR.createFromParcel(parcel), SubmissionEvidenceReviewState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SubmissionActionToDo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EvidenceDocument[i];
        }
    }

    public EvidenceDocument(String id10, DocumentType type, ArrayList pages, EvidenceDocumentDetails evidenceDocumentDetails, SubmissionEvidenceReviewState reviewState, SubmissionActionToDo submissionActionToDo) {
        boolean z;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        this.f85865a = id10;
        this.f85866b = type;
        this.f85867c = pages;
        this.d = evidenceDocumentDetails;
        this.e = reviewState;
        this.f = submissionActionToDo;
        if (submissionActionToDo != null) {
            z = true;
            break;
        }
        if (!pages.isEmpty()) {
            Iterator it8 = pages.iterator();
            while (it8.hasNext()) {
                if (((EvidenceDocumentPage) it8.next()).e != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.f85868g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EvidenceDocument)) {
            return false;
        }
        EvidenceDocument evidenceDocument = (EvidenceDocument) obj2;
        return Intrinsics.f(this.f85865a, evidenceDocument.f85865a) && Intrinsics.f(this.f85866b, evidenceDocument.f85866b) && this.f85867c.equals(evidenceDocument.f85867c) && Intrinsics.f(this.d, evidenceDocument.d) && Intrinsics.f(this.e, evidenceDocument.e) && Intrinsics.f(this.f, evidenceDocument.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f85867c, (this.f85866b.hashCode() + (this.f85865a.hashCode() * 31)) * 31, 31);
        EvidenceDocumentDetails evidenceDocumentDetails = this.d;
        int iHashCode = (this.e.hashCode() + ((iB + (evidenceDocumentDetails == null ? 0 : evidenceDocumentDetails.hashCode())) * 31)) * 31;
        SubmissionActionToDo submissionActionToDo = this.f;
        return iHashCode + (submissionActionToDo != null ? submissionActionToDo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85865a);
        this.f85866b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f85867c, dest);
        while (itY.hasNext()) {
            ((EvidenceDocumentPage) itY.next()).writeToParcel(dest, i);
        }
        EvidenceDocumentDetails evidenceDocumentDetails = this.d;
        if (evidenceDocumentDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            evidenceDocumentDetails.writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        SubmissionActionToDo submissionActionToDo = this.f;
        if (submissionActionToDo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submissionActionToDo.writeToParcel(dest, i);
        }
    }
}
