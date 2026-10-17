package com.revolut.feature.referrals.code.data.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/code/data/api/ReferrerDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_referrals_code_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferrerDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReferrerDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81678b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferrerDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferrerDetails[i];
        }
    }

    public ReferrerDetails(String referrerName, String referralCode) {
        Intrinsics.checkNotNullParameter(referrerName, "referrerName");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        this.f81677a = referrerName;
        this.f81678b = referralCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferrerDetails)) {
            return false;
        }
        ReferrerDetails referrerDetails = (ReferrerDetails) obj2;
        return Intrinsics.f(this.f81677a, referrerDetails.f81677a) && Intrinsics.f(this.f81678b, referrerDetails.f81678b);
    }

    public final int hashCode() {
        return this.f81678b.hashCode() + (this.f81677a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81677a);
        dest.writeString(this.f81678b);
    }
}
