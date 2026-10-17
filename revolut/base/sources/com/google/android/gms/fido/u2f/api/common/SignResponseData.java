package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SignResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignResponseData extends ResponseData {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] f38740zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClientDataString", id = 3)
    private final String f38741zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSignatureData", id = 4)
    private final byte[] f38742zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getApplication", id = 5)
    private final byte[] f38743zzd;

    @NonNull
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";

    @NonNull
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";

    @NonNull
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();

    @Deprecated
    public SignResponseData(@NonNull byte[] bArr, @NonNull String str, @NonNull byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj2;
        return Arrays.equals(this.f38740zza, signResponseData.f38740zza) && Objects.equal(this.f38741zzb, signResponseData.f38741zzb) && Arrays.equals(this.f38742zzc, signResponseData.f38742zzc) && Arrays.equals(this.f38743zzd, signResponseData.f38743zzd);
    }

    @NonNull
    public String getClientDataString() {
        return this.f38741zzb;
    }

    @NonNull
    public byte[] getKeyHandle() {
        return this.f38740zza;
    }

    @NonNull
    public byte[] getSignatureData() {
        return this.f38742zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f38740zza)), this.f38741zzb, Integer.valueOf(Arrays.hashCode(this.f38742zzc)), Integer.valueOf(Arrays.hashCode(this.f38743zzd)));
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f38740zza, 11));
            jSONObject.put("clientData", Base64.encodeToString(this.f38741zzb.getBytes(), 11));
            jSONObject.put("signatureData", Base64.encodeToString(this.f38742zzc, 11));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] bArr = this.f38740zza;
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(bArr, 0, bArr.length));
        zzbiVarZza.zzb("clientDataString", this.f38741zzb);
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] bArr2 = this.f38742zzc;
        zzbiVarZza.zzb("signatureData", zzgfVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] bArr3 = this.f38743zzd;
        zzbiVarZza.zzb("application", zzgfVarZzf3.zzg(bArr3, 0, bArr3.length));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeString(parcel, 3, getClientDataString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getSignatureData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f38743zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SignResponseData(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) String str, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 5) byte[] bArr3) {
        this.f38740zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.f38741zzb = (String) Preconditions.checkNotNull(str);
        this.f38742zzc = (byte[]) Preconditions.checkNotNull(bArr2);
        this.f38743zzd = (byte[]) Preconditions.checkNotNull(bArr3);
    }
}
