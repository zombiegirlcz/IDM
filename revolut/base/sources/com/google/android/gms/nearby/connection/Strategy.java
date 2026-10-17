package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StrategyCreator")
@SafeParcelable.Reserved({1000})
public final class Strategy extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionType", id = 3)
    private final int f47849zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTopology", id = 4)
    private final int f47850zzb;

    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzy();

    @NonNull
    public static final Strategy P2P_CLUSTER = new Strategy(1, 3);

    @NonNull
    public static final Strategy P2P_STAR = new Strategy(1, 2);

    @NonNull
    public static final Strategy P2P_POINT_TO_POINT = new Strategy(1, 1);

    @SafeParcelable.Constructor
    public Strategy(@SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2) {
        this.f47849zza = i;
        this.f47850zzb = i2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj2;
        return this.f47849zza == strategy.f47849zza && this.f47850zzb == strategy.f47850zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47849zza), Integer.valueOf(this.f47850zzb));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return a.v(v0.a.k(this.f47849zza, "Strategy(", P2P_CLUSTER.equals(this) ? "P2P_CLUSTER" : P2P_STAR.equals(this) ? "P2P_STAR" : P2P_POINT_TO_POINT.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN", "){connectionType=", ", topology="), "}", this.f47850zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f47849zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 3, i2);
        SafeParcelWriter.writeInt(parcel, 4, this.f47850zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
