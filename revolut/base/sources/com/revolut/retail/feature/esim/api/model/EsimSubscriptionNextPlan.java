package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionNextPlan;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionNextPlan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionNextPlan> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f100467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f100468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100469c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionNextPlan((Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionNextPlan[i];
        }
    }

    public EsimSubscriptionNextPlan(Instant instant, Long l2, boolean z) {
        this.f100467a = instant;
        this.f100468b = l2;
        this.f100469c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionNextPlan)) {
            return false;
        }
        EsimSubscriptionNextPlan esimSubscriptionNextPlan = (EsimSubscriptionNextPlan) obj2;
        return Intrinsics.f(this.f100467a, esimSubscriptionNextPlan.f100467a) && Intrinsics.f(this.f100468b, esimSubscriptionNextPlan.f100468b) && this.f100469c == esimSubscriptionNextPlan.f100469c;
    }

    public final int hashCode() {
        Instant instant = this.f100467a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Long l2 = this.f100468b;
        return Boolean.hashCode(this.f100469c) + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100467a);
        Long l2 = this.f100468b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeInt(this.f100469c ? 1 : 0);
    }
}
