package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.h3;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefund;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionRefund implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionRefund> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f100498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionRefundBreakdown f100499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100500c;
    public final d d;
    public final String e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f100501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f100502h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionRefund(h3.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EsimSubscriptionRefundBreakdown.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (d) parcel.readSerializable(), parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionRefund[i];
        }
    }

    public EsimSubscriptionRefund(h3 strategy, EsimSubscriptionRefundBreakdown esimSubscriptionRefundBreakdown, boolean z, d amount, String str, Instant instant, Instant instant2, double d) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f100498a = strategy;
        this.f100499b = esimSubscriptionRefundBreakdown;
        this.f100500c = z;
        this.d = amount;
        this.e = str;
        this.f = instant;
        this.f100501g = instant2;
        this.f100502h = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionRefund)) {
            return false;
        }
        EsimSubscriptionRefund esimSubscriptionRefund = (EsimSubscriptionRefund) obj2;
        return this.f100498a == esimSubscriptionRefund.f100498a && Intrinsics.f(this.f100499b, esimSubscriptionRefund.f100499b) && this.f100500c == esimSubscriptionRefund.f100500c && Intrinsics.f(this.d, esimSubscriptionRefund.d) && Intrinsics.f(this.e, esimSubscriptionRefund.e) && Intrinsics.f(this.f, esimSubscriptionRefund.f) && Intrinsics.f(this.f100501g, esimSubscriptionRefund.f100501g) && Double.compare(this.f100502h, esimSubscriptionRefund.f100502h) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f100498a.hashCode() * 31;
        EsimSubscriptionRefundBreakdown esimSubscriptionRefundBreakdown = this.f100499b;
        int iC = v7.c(j6.a.c((iHashCode + (esimSubscriptionRefundBreakdown == null ? 0 : esimSubscriptionRefundBreakdown.hashCode())) * 31, 31, this.f100500c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.f;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f100501g;
        return Double.hashCode(this.f100502h) + ((iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100498a.name());
        EsimSubscriptionRefundBreakdown esimSubscriptionRefundBreakdown = this.f100499b;
        if (esimSubscriptionRefundBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionRefundBreakdown.writeToParcel(dest, i);
        }
        dest.writeInt(this.f100500c ? 1 : 0);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f100501g);
        dest.writeDouble(this.f100502h);
    }
}
