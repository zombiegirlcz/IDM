package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RegisterResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisterResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRegisterData", id = 2)
    private final byte[] f38719zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion f38720zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClientDataString", id = 4)
    private final String f38721zzc;

    public RegisterResponseData(@NonNull byte[] bArr) {
        this.f38719zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.f38720zzb = ProtocolVersion.V1;
        this.f38721zzc = null;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj2;
        return Objects.equal(this.f38720zzb, registerResponseData.f38720zzb) && Arrays.equals(this.f38719zza, registerResponseData.f38719zza) && Objects.equal(this.f38721zzc, registerResponseData.f38721zzc);
    }

    @NonNull
    public String getClientDataString() {
        return this.f38721zzc;
    }

    @NonNull
    public ProtocolVersion getProtocolVersion() {
        return this.f38720zzb;
    }

    @NonNull
    public byte[] getRegisterData() {
        return this.f38719zza;
    }

    public int getVersionCode() {
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        int iOrdinal = this.f38720zzb.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                return -1;
            }
        }
        return i;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38720zzb, Integer.valueOf(Arrays.hashCode(this.f38719zza)), this.f38721zzc);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registrationData", Base64.encodeToString(this.f38719zza, 11));
            jSONObject.put("version", this.f38720zzb.toString());
            String str = this.f38721zzc;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("clientData", Base64.encodeToString(str.getBytes(), 11));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zzb("protocolVersion", this.f38720zzb);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArr = this.f38719zza;
        zzbiVarZza.zzb("registerData", zzgfVarZzf.zzg(bArr, 0, bArr.length));
        String str = this.f38721zzc;
        if (str != null) {
            zzbiVarZza.zzb("clientDataString", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getRegisterData(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f38720zzb.toString(), false);
        SafeParcelWriter.writeString(parcel, 4, getClientDataString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public RegisterResponseData(@NonNull byte[] bArr, @NonNull ProtocolVersion protocolVersion, String str) {
        this.f38719zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.f38720zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        Preconditions.checkArgument(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion == ProtocolVersion.V1) {
            Preconditions.checkArgument(str == null);
            this.f38721zzc = null;
        } else {
            this.f38721zzc = (String) Preconditions.checkNotNull(str);
        }
    }

    @SafeParcelable.Constructor
    public RegisterResponseData(@SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        this.f38719zza = bArr;
        try {
            this.f38720zzb = ProtocolVersion.fromString(str);
            this.f38721zzc = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
