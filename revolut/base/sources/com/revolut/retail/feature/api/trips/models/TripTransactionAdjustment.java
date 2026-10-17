package com.revolut.retail.feature.api.trips.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/trips/models/TripTransactionAdjustment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "k0j/a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripTransactionAdjustment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TripTransactionAdjustment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0j.a f99268b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TripTransactionAdjustment(parcel.readString(), k0j.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TripTransactionAdjustment[i];
        }
    }

    public TripTransactionAdjustment(String transactionId, k0j.a type) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f99267a = transactionId;
        this.f99268b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TripTransactionAdjustment)) {
            return false;
        }
        TripTransactionAdjustment tripTransactionAdjustment = (TripTransactionAdjustment) obj2;
        return Intrinsics.f(this.f99267a, tripTransactionAdjustment.f99267a) && this.f99268b == tripTransactionAdjustment.f99268b;
    }

    public final int hashCode() {
        return this.f99268b.hashCode() + (this.f99267a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99267a);
        dest.writeString(this.f99268b.name());
    }
}
