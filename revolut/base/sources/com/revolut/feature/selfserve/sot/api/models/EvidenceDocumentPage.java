package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/EvidenceDocumentPage;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EvidenceDocumentPage implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<EvidenceDocumentPage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85872c;
    public final String d;
    public final SubmissionActionToDo e;
    public final SubmissionEvidenceReviewState f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EvidenceDocumentPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SubmissionActionToDo.CREATOR.createFromParcel(parcel), SubmissionEvidenceReviewState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EvidenceDocumentPage[i];
        }
    }

    public EvidenceDocumentPage(String id10, String fileName, String str, String str2, SubmissionActionToDo submissionActionToDo, SubmissionEvidenceReviewState reviewState) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        this.f85870a = id10;
        this.f85871b = fileName;
        this.f85872c = str;
        this.d = str2;
        this.e = submissionActionToDo;
        this.f = reviewState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EvidenceDocumentPage)) {
            return false;
        }
        EvidenceDocumentPage evidenceDocumentPage = (EvidenceDocumentPage) obj2;
        return Intrinsics.f(this.f85870a, evidenceDocumentPage.f85870a) && Intrinsics.f(this.f85871b, evidenceDocumentPage.f85871b) && Intrinsics.f(this.f85872c, evidenceDocumentPage.f85872c) && Intrinsics.f(this.d, evidenceDocumentPage.d) && Intrinsics.f(this.e, evidenceDocumentPage.e) && Intrinsics.f(this.f, evidenceDocumentPage.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85870a.hashCode() * 31, 31, this.f85871b);
        String str = this.f85872c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubmissionActionToDo submissionActionToDo = this.e;
        return this.f.hashCode() + ((iHashCode2 + (submissionActionToDo != null ? submissionActionToDo.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85870a);
        dest.writeString(this.f85871b);
        dest.writeString(this.f85872c);
        dest.writeString(this.d);
        SubmissionActionToDo submissionActionToDo = this.e;
        if (submissionActionToDo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submissionActionToDo.writeToParcel(dest, i);
        }
        this.f.writeToParcel(dest, i);
    }
}
