package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hyc.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/SubmissionEvidenceReviewState;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmissionEvidenceReviewState implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<SubmissionEvidenceReviewState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f85887b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubmissionEvidenceReviewState(parcel.readString(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmissionEvidenceReviewState[i];
        }
    }

    public SubmissionEvidenceReviewState(String title, c type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f85886a = title;
        this.f85887b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmissionEvidenceReviewState)) {
            return false;
        }
        SubmissionEvidenceReviewState submissionEvidenceReviewState = (SubmissionEvidenceReviewState) obj2;
        return Intrinsics.f(this.f85886a, submissionEvidenceReviewState.f85886a) && this.f85887b == submissionEvidenceReviewState.f85887b;
    }

    public final int hashCode() {
        return this.f85887b.hashCode() + (this.f85886a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85886a);
        dest.writeString(this.f85887b.name());
    }
}
