package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialDescriptorCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType f38561zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getId", id = 3, type = "byte[]")
    private final zzgx f38562zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransports", id = 4)
    private final List f38563zzd;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzcf f38560zza = zzcf.zzm(com.google.android.gms.internal.fido.zzh.f39507zza, com.google.android.gms.internal.fido.zzh.f39508zzb);

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new zzap();

    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
        public UnsupportedPubKeyCredDescriptorException(@NonNull String str) {
            super(str);
        }

        public UnsupportedPubKeyCredDescriptorException(@NonNull String str, @NonNull Throwable th10) {
            super(str, th10);
        }
    }

    public PublicKeyCredentialDescriptor(String str, zzgx zzgxVar, List<Transport> list) {
        Preconditions.checkNotNull(str);
        try {
            this.f38561zzb = PublicKeyCredentialType.fromString(str);
            this.f38562zzc = (zzgx) Preconditions.checkNotNull(zzgxVar);
            this.f38563zzd = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static PublicKeyCredentialDescriptor zza(@NonNull JSONObject jSONObject) throws JSONException {
        return new PublicKeyCredentialDescriptor(jSONObject.getString("type"), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
    }

    public boolean equals(Object obj2) {
        List list;
        if (!(obj2 instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj2;
        if (!this.f38561zzb.equals(publicKeyCredentialDescriptor.f38561zzb) || !Objects.equal(this.f38562zzc, publicKeyCredentialDescriptor.f38562zzc)) {
            return false;
        }
        List list2 = this.f38563zzd;
        if (list2 == null && publicKeyCredentialDescriptor.f38563zzd == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.f38563zzd) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f38563zzd.containsAll(this.f38563zzd);
    }

    @NonNull
    public byte[] getId() {
        return this.f38562zzc.zzm();
    }

    public zzgx getIdAsByteString() {
        return this.f38562zzc;
    }

    public List<Transport> getTransports() {
        return this.f38563zzd;
    }

    @NonNull
    public PublicKeyCredentialType getType() {
        return this.f38561zzb;
    }

    @NonNull
    public String getTypeAsString() {
        return this.f38561zzb.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.f38561zzb, this.f38562zzc, this.f38563zzd);
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f38561zzb);
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(getId());
        return a.i(a.m("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strEncodeUrlSafeNoPadding, ", \n transports="), String.valueOf(this.f38563zzd), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getId(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SafeParcelable.Constructor
    public PublicKeyCredentialDescriptor(@NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) List<Transport> list) {
        this(str, zzgx.zzl(bArr, 0, bArr.length), list);
        zzgx zzgxVar = zzgx.f39500zzb;
    }
}
