package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "HmacSecretExtensionCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhp f38620zza = zzhp.zzg(1);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final zzhp f38621zzb = zzhp.zzg(2);

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final zzhp f38622zzc = zzhp.zzg(3);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    static final zzhp f38623zzd = zzhp.zzg(4);

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCoseKeyAgreement", id = 1, type = "byte[]")
    private final zzgx f38624zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSaltEnc", id = 2, type = "byte[]")
    private final zzgx f38625zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSaltAuth", id = 3, type = "byte[]")
    private final zzgx f38626zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPinUvAuthProtocol", id = 4)
    private final int f38627zzh;

    public zzai(zzgx zzgxVar, zzgx zzgxVar2, zzgx zzgxVar3, int i) {
        this.f38624zze = zzgxVar;
        this.f38625zzf = zzgxVar2;
        this.f38626zzg = zzgxVar3;
        this.f38627zzh = i;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj2;
        return Objects.equal(this.f38624zze, zzaiVar.f38624zze) && Objects.equal(this.f38625zzf, zzaiVar.f38625zzf) && Objects.equal(this.f38626zzg, zzaiVar.f38626zzg) && this.f38627zzh == zzaiVar.f38627zzh;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38624zze, this.f38625zzf, this.f38626zzg, Integer.valueOf(this.f38627zzh));
    }

    public final String toString() {
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(zza());
        String strEncodeUrlSafeNoPadding2 = Base64Utils.encodeUrlSafeNoPadding(zzc());
        String strEncodeUrlSafeNoPadding3 = Base64Utils.encodeUrlSafeNoPadding(zzb());
        StringBuilder sbM = a.m("HmacSecretExtension{coseKeyAgreement=", strEncodeUrlSafeNoPadding, ", saltEnc=", strEncodeUrlSafeNoPadding2, ", saltAuth=");
        sbM.append(strEncodeUrlSafeNoPadding3);
        sbM.append(", getPinUvAuthProtocol=");
        return j6.a.v(sbM, "}", this.f38627zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, zza(), false);
        SafeParcelWriter.writeByteArray(parcel, 2, zzc(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, zzb(), false);
        SafeParcelWriter.writeInt(parcel, 4, this.f38627zzh);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final byte[] zza() {
        zzgx zzgxVar = this.f38624zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final byte[] zzb() {
        zzgx zzgxVar = this.f38626zzg;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final byte[] zzc() {
        zzgx zzgxVar = this.f38625zzf;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
