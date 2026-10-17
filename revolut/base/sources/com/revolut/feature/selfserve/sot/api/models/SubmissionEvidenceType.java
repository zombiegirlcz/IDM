package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/SubmissionEvidenceType;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmissionEvidenceType implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<SubmissionEvidenceType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85890c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubmissionEvidenceType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmissionEvidenceType[i];
        }
    }

    public SubmissionEvidenceType(String type, String title, String description, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f85888a = type;
        this.f85889b = title;
        this.f85890c = description;
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
        if (!(obj2 instanceof SubmissionEvidenceType)) {
            return false;
        }
        SubmissionEvidenceType submissionEvidenceType = (SubmissionEvidenceType) obj2;
        return Intrinsics.f(this.f85888a, submissionEvidenceType.f85888a) && Intrinsics.f(this.f85889b, submissionEvidenceType.f85889b) && Intrinsics.f(this.f85890c, submissionEvidenceType.f85890c) && this.d == submissionEvidenceType.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f85888a.hashCode() * 31, 31, this.f85889b), 31, this.f85890c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85888a);
        dest.writeString(this.f85889b);
        dest.writeString(this.f85890c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
