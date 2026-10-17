package com.revolut.feature.tax_residency.api.stamp_duty;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/api/stamp_duty/StampDutyDestination$Pay", "", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StampDutyDestination$Pay implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StampDutyDestination$Pay> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f89989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StampDutyAccount f89990b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StampDutyDestination$Pay((StampDutyAccount) parcel.readParcelable(StampDutyDestination$Pay.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StampDutyDestination$Pay[i];
        }
    }

    public StampDutyDestination$Pay(StampDutyAccount account, d payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f89989a = payment;
        this.f89990b = account;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StampDutyDestination$Pay)) {
            return false;
        }
        StampDutyDestination$Pay stampDutyDestination$Pay = (StampDutyDestination$Pay) obj2;
        return Intrinsics.f(this.f89989a, stampDutyDestination$Pay.f89989a) && Intrinsics.f(this.f89990b, stampDutyDestination$Pay.f89990b);
    }

    public final int hashCode() {
        return this.f89990b.hashCode() + (this.f89989a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89989a);
        dest.writeParcelable(this.f89990b, i);
    }
}
