package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class ErrorResponseData extends ResponseData {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode f38692zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final String f38693zzb;

    @NonNull
    public static final String JSON_ERROR_CODE = "errorCode";

    @NonNull
    public static final String JSON_ERROR_MESSAGE = "errorMessage";

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();

    @SafeParcelable.Constructor
    public ErrorResponseData(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.f38692zza = ErrorCode.toErrorCode(i);
        this.f38693zzb = str;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj2;
        return Objects.equal(this.f38692zza, errorResponseData.f38692zza) && Objects.equal(this.f38693zzb, errorResponseData.f38693zzb);
    }

    @NonNull
    public ErrorCode getErrorCode() {
        return this.f38692zza;
    }

    public int getErrorCodeAsInt() {
        return this.f38692zza.getCode();
    }

    @NonNull
    public String getErrorMessage() {
        return this.f38693zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38692zza, this.f38693zzb);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f38692zza.getCode());
            String str = this.f38693zzb;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("errorMessage", str);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzbiVarZza.zza("errorCode", this.f38692zza.getCode());
        String str = this.f38693zzb;
        if (str != null) {
            zzbiVarZza.zzb("errorMessage", str);
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCodeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ErrorResponseData(@NonNull ErrorCode errorCode) {
        this.f38692zza = (ErrorCode) Preconditions.checkNotNull(errorCode);
        this.f38693zzb = null;
    }

    public ErrorResponseData(@NonNull ErrorCode errorCode, @NonNull String str) {
        this.f38692zza = (ErrorCode) Preconditions.checkNotNull(errorCode);
        this.f38693zzb = str;
    }
}
