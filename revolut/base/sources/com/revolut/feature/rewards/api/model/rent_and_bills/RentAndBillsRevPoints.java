package com.revolut.feature.rewards.api.model.rent_and_bills;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsRevPoints;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RentAndBillsRevPoints implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RentAndBillsRevPoints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f84799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f84800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f84801c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RentAndBillsRevPoints(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RentAndBillsRevPoints[i];
        }
    }

    public RentAndBillsRevPoints(double d, double d5, double d6, boolean z) {
        this.f84799a = d;
        this.f84800b = d5;
        this.f84801c = d6;
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
        if (!(obj2 instanceof RentAndBillsRevPoints)) {
            return false;
        }
        RentAndBillsRevPoints rentAndBillsRevPoints = (RentAndBillsRevPoints) obj2;
        return Double.compare(this.f84799a, rentAndBillsRevPoints.f84799a) == 0 && Double.compare(this.f84800b, rentAndBillsRevPoints.f84800b) == 0 && Double.compare(this.f84801c, rentAndBillsRevPoints.f84801c) == 0 && this.d == rentAndBillsRevPoints.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + m72.b.c(m72.b.c(Double.hashCode(this.f84799a) * 31, this.f84800b, 31), this.f84801c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f84799a);
        dest.writeDouble(this.f84800b);
        dest.writeDouble(this.f84801c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
