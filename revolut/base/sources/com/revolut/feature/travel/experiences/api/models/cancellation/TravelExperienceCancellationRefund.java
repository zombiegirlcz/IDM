package com.revolut.feature.travel.experiences.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/cancellation/TravelExperienceCancellationRefund;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceCancellationRefund implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceCancellationRefund> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f92771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f92772c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceCancellationRefund((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceCancellationRefund[i];
        }
    }

    public TravelExperienceCancellationRefund(d refund, d penalty, d cashbackReversal) {
        Intrinsics.checkNotNullParameter(refund, "refund");
        Intrinsics.checkNotNullParameter(penalty, "penalty");
        Intrinsics.checkNotNullParameter(cashbackReversal, "cashbackReversal");
        this.f92770a = refund;
        this.f92771b = penalty;
        this.f92772c = cashbackReversal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceCancellationRefund)) {
            return false;
        }
        TravelExperienceCancellationRefund travelExperienceCancellationRefund = (TravelExperienceCancellationRefund) obj2;
        return Intrinsics.f(this.f92770a, travelExperienceCancellationRefund.f92770a) && Intrinsics.f(this.f92771b, travelExperienceCancellationRefund.f92771b) && Intrinsics.f(this.f92772c, travelExperienceCancellationRefund.f92772c);
    }

    public final int hashCode() {
        return this.f92772c.hashCode() + v7.c(this.f92770a.hashCode() * 31, 31, this.f92771b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92770a);
        dest.writeSerializable(this.f92771b);
        dest.writeSerializable(this.f92772c);
    }
}
