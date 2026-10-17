package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/SubmissionState;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmissionState implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<SubmissionState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f85893c;
    public final SubmissionEvidenceReviewState d;
    public final SubmissionActionToDo e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f85894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f85895h;
    public final Long i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SubmissionEvidence.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SubmissionState(string, string2, arrayList, SubmissionEvidenceReviewState.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SubmissionActionToDo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmissionState[i];
        }
    }

    public SubmissionState(String id10, String state, ArrayList evidences, SubmissionEvidenceReviewState reviewState, SubmissionActionToDo submissionActionToDo, boolean z, Long l2, Long l3, Long l4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        this.f85891a = id10;
        this.f85892b = state;
        this.f85893c = evidences;
        this.d = reviewState;
        this.e = submissionActionToDo;
        this.f = z;
        this.f85894g = l2;
        this.f85895h = l3;
        this.i = l4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmissionState)) {
            return false;
        }
        SubmissionState submissionState = (SubmissionState) obj2;
        return Intrinsics.f(this.f85891a, submissionState.f85891a) && Intrinsics.f(this.f85892b, submissionState.f85892b) && this.f85893c.equals(submissionState.f85893c) && Intrinsics.f(this.d, submissionState.d) && Intrinsics.f(this.e, submissionState.e) && this.f == submissionState.f && Intrinsics.f(this.f85894g, submissionState.f85894g) && Intrinsics.f(this.f85895h, submissionState.f85895h) && Intrinsics.f(this.i, submissionState.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f85893c, p.a.c(this.f85891a.hashCode() * 31, 31, this.f85892b), 31)) * 31;
        SubmissionActionToDo submissionActionToDo = this.e;
        int iC = j6.a.c((iHashCode + (submissionActionToDo == null ? 0 : submissionActionToDo.hashCode())) * 31, 31, this.f);
        Long l2 = this.f85894g;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f85895h;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85891a);
        dest.writeString(this.f85892b);
        Iterator itY = j6.a.y(this.f85893c, dest);
        while (itY.hasNext()) {
            ((SubmissionEvidence) itY.next()).writeToParcel(dest, i);
        }
        this.d.writeToParcel(dest, i);
        SubmissionActionToDo submissionActionToDo = this.e;
        if (submissionActionToDo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submissionActionToDo.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
        Long l2 = this.f85894g;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f85895h;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Long l4 = this.i;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
    }
}
