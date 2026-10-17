package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RegisterRequestCreator")
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int f38700zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 2, type = "java.lang.String")
    private final ProtocolVersion f38701zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    private final byte[] f38702zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final String f38703zzd;

    @SafeParcelable.Constructor
    public RegisterRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str2) {
        this.f38700zza = i;
        try {
            this.f38701zzb = ProtocolVersion.fromString(str);
            this.f38702zzc = bArr;
            this.f38703zzd = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static RegisterRequest parseFromJson(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            try {
                try {
                    return new RegisterRequest(ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), Base64.decode(jSONObject.getString("challenge"), 8), jSONObject.has("appId") ? jSONObject.getString("appId") : null);
                } catch (IllegalArgumentException e) {
                    throw new JSONException(e.getMessage());
                }
            } catch (IllegalArgumentException e2) {
                throw new JSONException(e2.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e4) {
            throw new JSONException(e4.toString());
        }
    }

    public boolean equals(@NonNull Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj2;
        if (!Arrays.equals(this.f38702zzc, registerRequest.f38702zzc) || this.f38701zzb != registerRequest.f38701zzb) {
            return false;
        }
        String str = this.f38703zzd;
        if (str == null) {
            if (registerRequest.f38703zzd != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.f38703zzd)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getAppId() {
        return this.f38703zzd;
    }

    @NonNull
    public byte[] getChallengeValue() {
        return this.f38702zzc;
    }

    @NonNull
    public ProtocolVersion getProtocolVersion() {
        return this.f38701zzb;
    }

    public int getVersionCode() {
        return this.f38700zza;
    }

    public int hashCode() {
        int iHashCode = this.f38701zzb.hashCode() + ((Arrays.hashCode(this.f38702zzc) + 31) * 31);
        String str = this.f38703zzd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f38701zzb.toString());
            jSONObject.put("challenge", Base64.encodeToString(this.f38702zzc, 11));
            String str = this.f38703zzd;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("appId", str);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.f38701zzb.toString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public RegisterRequest(@NonNull ProtocolVersion protocolVersion, @NonNull byte[] bArr, @NonNull String str) {
        this.f38700zza = 1;
        this.f38701zzb = (ProtocolVersion) Preconditions.checkNotNull(protocolVersion);
        this.f38702zzc = (byte[]) Preconditions.checkNotNull(bArr);
        if (protocolVersion == ProtocolVersion.V1) {
            Preconditions.checkArgument(bArr.length == 65, "invalid challengeValue length for V1");
        }
        this.f38703zzd = str;
    }
}
