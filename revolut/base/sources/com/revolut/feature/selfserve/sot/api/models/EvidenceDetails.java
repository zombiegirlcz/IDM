package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/EvidenceDetails;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EvidenceDetails implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<EvidenceDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85864c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EvidenceDetails(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EvidenceDetails[i];
        }
    }

    public EvidenceDetails(String flowType, String str, String str2) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f85862a = flowType;
        this.f85863b = str;
        this.f85864c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EvidenceDetails)) {
            return false;
        }
        EvidenceDetails evidenceDetails = (EvidenceDetails) obj2;
        return Intrinsics.f(this.f85862a, evidenceDetails.f85862a) && Intrinsics.f(this.f85863b, evidenceDetails.f85863b) && Intrinsics.f(this.f85864c, evidenceDetails.f85864c);
    }

    public final int hashCode() {
        int iHashCode = this.f85862a.hashCode() * 31;
        String str = this.f85863b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85864c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85862a);
        dest.writeString(this.f85863b);
        dest.writeString(this.f85864c);
    }
}
