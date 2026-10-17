package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int f46553zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int f46554zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int f46555zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int f46556zzd;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i5) {
        Preconditions.checkState(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i5 >= 0 && i5 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i + i2) + i3) + i5 > 0, "Parameters can't be all 0.");
        this.f46553zza = i;
        this.f46554zzb = i2;
        this.f46555zzc = i3;
        this.f46556zzd = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj2;
        return this.f46553zza == zzasVar.f46553zza && this.f46554zzb == zzasVar.f46554zzb && this.f46555zzc == zzasVar.f46555zzc && this.f46556zzd == zzasVar.f46556zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46553zza), Integer.valueOf(this.f46554zzb), Integer.valueOf(this.f46555zzc), Integer.valueOf(this.f46556zzd));
    }

    public final String toString() {
        int i = this.f46553zza;
        int length = String.valueOf(i).length();
        int i2 = this.f46554zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f46555zzc;
        int length3 = String.valueOf(i3).length();
        int i5 = this.f46556zzd;
        StringBuilder sb6 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i5).length() + 1);
        sb6.append("UserPreferredSleepWindow [startHour=");
        sb6.append(i);
        sb6.append(", startMinute=");
        sb6.append(i2);
        sb6.append(", endHour=");
        sb6.append(i3);
        sb6.append(", endMinute=");
        sb6.append(i5);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int i2 = this.f46553zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f46554zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f46555zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f46556zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
