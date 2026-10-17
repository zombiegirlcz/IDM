package com.revolut.feature.insurance.api.models.cfac;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimProgress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimProgress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimStatus f74961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74963c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimProgress(CFACClaimStatus.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimProgress[i];
        }
    }

    public CFACClaimProgress(CFACClaimStatus status, long j2, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f74961a = status;
        this.f74962b = j2;
        this.f74963c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimProgress)) {
            return false;
        }
        CFACClaimProgress cFACClaimProgress = (CFACClaimProgress) obj2;
        return this.f74961a == cFACClaimProgress.f74961a && this.f74962b == cFACClaimProgress.f74962b && Intrinsics.f(this.f74963c, cFACClaimProgress.f74963c);
    }

    public final int hashCode() {
        int iC = d.c(this.f74961a.hashCode() * 31, 31, this.f74962b);
        String str = this.f74963c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74961a.writeToParcel(dest, i);
        dest.writeLong(this.f74962b);
        dest.writeString(this.f74963c);
    }
}
