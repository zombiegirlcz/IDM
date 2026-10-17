package com.revolut.retail.feature.pending_payments.api.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sak.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pending_payments/api/models/PendingPaymentInfo$TimerInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "sak/i", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentInfo$TimerInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentInfo$TimerInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f102399c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentInfo$TimerInfo(parcel.readLong(), parcel.readLong(), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentInfo$TimerInfo[i];
        }
    }

    public PendingPaymentInfo$TimerInfo(long j2, long j3, i displayMode) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        this.f102397a = j2;
        this.f102398b = j3;
        this.f102399c = displayMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PendingPaymentInfo$TimerInfo)) {
            return false;
        }
        PendingPaymentInfo$TimerInfo pendingPaymentInfo$TimerInfo = (PendingPaymentInfo$TimerInfo) obj2;
        return this.f102397a == pendingPaymentInfo$TimerInfo.f102397a && this.f102398b == pendingPaymentInfo$TimerInfo.f102398b && this.f102399c == pendingPaymentInfo$TimerInfo.f102399c;
    }

    public final int hashCode() {
        return this.f102399c.hashCode() + d.c(Long.hashCode(this.f102397a) * 31, 31, this.f102398b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f102397a);
        dest.writeLong(this.f102398b);
        dest.writeString(this.f102399c.name());
    }

    public /* synthetic */ PendingPaymentInfo$TimerInfo(long j2, long j3) {
        this(j2, j3, i.AVATAR);
    }
}
