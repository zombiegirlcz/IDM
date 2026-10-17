package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getId", id = 2, type = "byte[]")
    private final zzgx f38591zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getName", id = 3)
    private final String f38592zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIcon", id = 4)
    private final String f38593zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String f38594zzd;

    public PublicKeyCredentialUserEntity(zzgx zzgxVar, String str, String str2, String str3) {
        this.f38591zza = (zzgx) Preconditions.checkNotNull(zzgxVar);
        this.f38592zzb = (String) Preconditions.checkNotNull(str);
        this.f38593zzc = str2;
        this.f38594zzd = (String) Preconditions.checkNotNull(str3);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj2;
        return Objects.equal(this.f38591zza, publicKeyCredentialUserEntity.f38591zza) && Objects.equal(this.f38592zzb, publicKeyCredentialUserEntity.f38592zzb) && Objects.equal(this.f38593zzc, publicKeyCredentialUserEntity.f38593zzc) && Objects.equal(this.f38594zzd, publicKeyCredentialUserEntity.f38594zzd);
    }

    @NonNull
    public String getDisplayName() {
        return this.f38594zzd;
    }

    public String getIcon() {
        return this.f38593zzc;
    }

    @NonNull
    public byte[] getId() {
        return this.f38591zza.zzm();
    }

    public zzgx getIdAsByteString() {
        return this.f38591zza;
    }

    @NonNull
    public String getName() {
        return this.f38592zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38591zza, this.f38592zzb, this.f38593zzc, this.f38594zzd);
    }

    @NonNull
    public final String toString() {
        StringBuilder sbX = a.x("PublicKeyCredentialUserEntity{\n id=", Base64Utils.encodeUrlSafeNoPadding(this.f38591zza.zzm()), ", \n name='");
        sbX.append(this.f38592zzb);
        sbX.append("', \n icon='");
        sbX.append(this.f38593zzc);
        sbX.append("', \n displayName='");
        return v0.a.i(sbX, this.f38594zzd, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @SafeParcelable.Constructor
    public PublicKeyCredentialUserEntity(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @NonNull @SafeParcelable.Param(id = 5) String str3) {
        byte[] bArr2 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.f39500zzb;
        this(zzgx.zzl(bArr2, 0, bArr2.length), str, str2, str3);
    }
}
