package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RegisteredKeyCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getChallengeValue", id = 3)
    String f38722zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final KeyHandle f38723zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAppId", id = 4)
    private final String f38724zzc;

    public RegisteredKey(@NonNull KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    @NonNull
    public static RegisteredKey parseFromJson(@NonNull JSONObject jSONObject) throws JSONException {
        return new RegisteredKey(KeyHandle.parseFromJson(jSONObject), jSONObject.has("challenge") ? jSONObject.getString("challenge") : null, jSONObject.has("appId") ? jSONObject.getString("appId") : null);
    }

    public boolean equals(@NonNull Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj2;
        String str = this.f38722zza;
        if (str == null) {
            if (registeredKey.f38722zza != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f38722zza)) {
            return false;
        }
        if (!this.f38723zzb.equals(registeredKey.f38723zzb)) {
            return false;
        }
        String str2 = this.f38724zzc;
        if (str2 == null) {
            if (registeredKey.f38724zzc != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.f38724zzc)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getAppId() {
        return this.f38724zzc;
    }

    @NonNull
    public String getChallengeValue() {
        return this.f38722zza;
    }

    @NonNull
    public KeyHandle getKeyHandle() {
        return this.f38723zzb;
    }

    public int hashCode() {
        String str = this.f38722zza;
        int iHashCode = this.f38723zzb.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f38724zzc;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f38722zza;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            JSONObject jSONObjectZza = this.f38723zzb.zza();
            Iterator<String> itKeys = jSONObjectZza.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectZza.get(next));
            }
            String str2 = this.f38724zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f38723zzb.getBytes(), 11));
            if (this.f38723zzb.getProtocolVersion() != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.f38723zzb.getProtocolVersion().toString());
            }
            if (this.f38723zzb.getTransports() != null) {
                jSONObject.put("transports", this.f38723zzb.getTransports().toString());
            }
            String str = this.f38722zza;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f38724zzc;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getKeyHandle(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getChallengeValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public RegisteredKey(@NonNull @SafeParcelable.Param(id = 2) KeyHandle keyHandle, @NonNull @SafeParcelable.Param(id = 3) String str, @NonNull @SafeParcelable.Param(id = 4) String str2) {
        this.f38723zzb = (KeyHandle) Preconditions.checkNotNull(keyHandle);
        this.f38722zza = str;
        this.f38724zzc = str2;
    }
}
