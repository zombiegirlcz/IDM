package com.revolut.feature.insurance.api.models.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimTotalSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimTotalSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimTotalSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f74964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f74965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f74966c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimTotalSummary((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimTotalSummary[i];
        }
    }

    public CFACClaimTotalSummary(d total, d claimedAmount, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(claimedAmount, "claimedAmount");
        this.f74964a = total;
        this.f74965b = claimedAmount;
        this.f74966c = dVar;
        this.d = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimTotalSummary)) {
            return false;
        }
        CFACClaimTotalSummary cFACClaimTotalSummary = (CFACClaimTotalSummary) obj2;
        return Intrinsics.f(this.f74964a, cFACClaimTotalSummary.f74964a) && Intrinsics.f(this.f74965b, cFACClaimTotalSummary.f74965b) && Intrinsics.f(this.f74966c, cFACClaimTotalSummary.f74966c) && Intrinsics.f(this.d, cFACClaimTotalSummary.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f74964a.hashCode() * 31, 31, this.f74965b);
        d dVar = this.f74966c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.d;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74964a);
        dest.writeSerializable(this.f74965b);
        dest.writeSerializable(this.f74966c);
        dest.writeSerializable(this.d);
    }
}
