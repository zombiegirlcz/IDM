package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSignature", id = 1, type = "byte[]")
    private final zzgx f38631zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAuthenticatorOutput", id = 2, type = "byte[]")
    private final zzgx f38632zzb;

    public zzf(zzgx zzgxVar, zzgx zzgxVar2) {
        this.f38631zza = zzgxVar;
        this.f38632zzb = zzgxVar2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj2;
        return Objects.equal(this.f38631zza, zzfVar.f38631zza) && Objects.equal(this.f38632zzb, zzfVar.f38632zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38631zza, this.f38632zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzgx zzgxVar = this.f38631zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.f38632zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
