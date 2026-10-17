package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import t02.h;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmQuoteLimits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "t02/h", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmQuoteLimits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmQuoteLimits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f62225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f62226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f62227c;
    public final h d;
    public final Long e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmQuoteLimits((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmQuoteLimits[i];
        }
    }

    public ApmQuoteLimits(d dVar, d dVar2, d dVar3, h period, Long l2) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f62225a = dVar;
        this.f62226b = dVar2;
        this.f62227c = dVar3;
        this.d = period;
        this.e = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmQuoteLimits)) {
            return false;
        }
        ApmQuoteLimits apmQuoteLimits = (ApmQuoteLimits) obj2;
        return Intrinsics.f(this.f62225a, apmQuoteLimits.f62225a) && Intrinsics.f(this.f62226b, apmQuoteLimits.f62226b) && Intrinsics.f(this.f62227c, apmQuoteLimits.f62227c) && this.d == apmQuoteLimits.d && Intrinsics.f(this.e, apmQuoteLimits.e);
    }

    public final int hashCode() {
        d dVar = this.f62225a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f62226b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f62227c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31)) * 31;
        Long l2 = this.e;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f62225a);
        dest.writeSerializable(this.f62226b);
        dest.writeSerializable(this.f62227c);
        dest.writeString(this.d.name());
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
    }
}
