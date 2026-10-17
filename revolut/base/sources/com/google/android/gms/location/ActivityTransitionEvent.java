package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int f46407zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int f46408zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElapsedRealTimeNanos", id = 3)
    private final long f46409zzc;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j2) {
        ActivityTransition.zza(i2);
        this.f46407zza = i;
        this.f46408zzb = i2;
        this.f46409zzc = j2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj2;
        return this.f46407zza == activityTransitionEvent.f46407zza && this.f46408zzb == activityTransitionEvent.f46408zzb && this.f46409zzc == activityTransitionEvent.f46409zzc;
    }

    public int getActivityType() {
        return this.f46407zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.f46409zzc;
    }

    public int getTransitionType() {
        return this.f46408zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46407zza), Integer.valueOf(this.f46408zzb), Long.valueOf(this.f46409zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        int i = this.f46407zza;
        StringBuilder sb9 = new StringBuilder(String.valueOf(i).length() + 13);
        sb9.append("ActivityType ");
        sb9.append(i);
        sb6.append(sb9.toString());
        sb6.append(" ");
        int i2 = this.f46408zzb;
        StringBuilder sb10 = new StringBuilder(String.valueOf(i2).length() + 15);
        sb10.append("TransitionType ");
        sb10.append(i2);
        sb6.append(sb10.toString());
        sb6.append(" ");
        long j2 = this.f46409zzc;
        StringBuilder sb11 = new StringBuilder(String.valueOf(j2).length() + 21);
        sb11.append("ElapsedRealTimeNanos ");
        sb11.append(j2);
        sb6.append(sb11.toString());
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
