package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final int f46433zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f46434zzc;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final Comparator f46432zza = new zzk();

    @NonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzl();

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f46433zzb = i;
        this.f46434zzc = i2;
    }

    @ShowFirstParty
    public final boolean equals(Object obj2) {
        if (obj2 instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj2;
            if (this.f46433zzb == detectedActivity.f46433zzb && this.f46434zzc == detectedActivity.f46434zzc) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.f46434zzc;
    }

    public int getType() {
        int i = this.f46433zzb;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46433zzb), Integer.valueOf(this.f46434zzc));
    }

    @NonNull
    public String toString() {
        int type = getType();
        String string = type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 4 ? type != 5 ? type != 7 ? type != 8 ? type != 16 ? type != 17 ? Integer.toString(type) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i = this.f46434zzc;
        StringBuilder sb6 = new StringBuilder(String.valueOf(i).length() + String.valueOf(string).length() + 36 + 1);
        sb6.append("DetectedActivity [type=");
        sb6.append(string);
        sb6.append(", confidence=");
        sb6.append(i);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46433zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.f46434zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
