package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "MessageTypeCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f48087zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    public final String f48088zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f48089zzc;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f48087zza = i;
        this.f48088zzb = str;
        this.f48089zzc = str2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if ((obj2 instanceof zzac) && hashCode() == obj2.hashCode()) {
            zzac zzacVar = (zzac) obj2;
            if (Objects.equal(this.f48088zzb, zzacVar.f48088zzb) && Objects.equal(this.f48089zzc, zzacVar.f48089zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48088zzb, this.f48089zzc);
    }

    public final String toString() {
        return "namespace=" + this.f48088zzb + ", type=" + this.f48089zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f48088zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48089zzc, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f48087zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzac(String str, String str2) {
        this(1, str, str2);
    }
}
