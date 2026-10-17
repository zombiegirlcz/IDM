package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerCashbackInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerCashbackInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerCashbackInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f73276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f73277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f73278c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerCashbackInfo((d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerCashbackInfo[i];
        }
    }

    public FreelancerCashbackInfo(d earnedInTotal, d earnedThisPeriod, LocalDate periodDueDate) {
        Intrinsics.checkNotNullParameter(earnedInTotal, "earnedInTotal");
        Intrinsics.checkNotNullParameter(earnedThisPeriod, "earnedThisPeriod");
        Intrinsics.checkNotNullParameter(periodDueDate, "periodDueDate");
        this.f73276a = earnedInTotal;
        this.f73277b = earnedThisPeriod;
        this.f73278c = periodDueDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerCashbackInfo)) {
            return false;
        }
        FreelancerCashbackInfo freelancerCashbackInfo = (FreelancerCashbackInfo) obj2;
        return Intrinsics.f(this.f73276a, freelancerCashbackInfo.f73276a) && Intrinsics.f(this.f73277b, freelancerCashbackInfo.f73277b) && Intrinsics.f(this.f73278c, freelancerCashbackInfo.f73278c);
    }

    public final int hashCode() {
        return this.f73278c.hashCode() + v7.c(this.f73276a.hashCode() * 31, 31, this.f73277b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73276a);
        dest.writeSerializable(this.f73277b);
        dest.writeSerializable(this.f73278c);
    }
}
