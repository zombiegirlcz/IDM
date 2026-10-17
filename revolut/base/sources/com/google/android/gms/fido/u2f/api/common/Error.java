package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.NonNull;
import j6.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class Error {

    @NonNull
    public static final String JSON_ERROR_CODE = "errorCode";

    @NonNull
    public static final String JSON_ERROR_MESSAGE = "errorMessage";

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ErrorCode f38687zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f38688zzb;

    public Error(@NonNull ErrorCode errorCode) {
        this.f38687zza = errorCode;
        this.f38688zzb = null;
    }

    @NonNull
    public ErrorCode getErrorCode() {
        return this.f38687zza;
    }

    @NonNull
    public String getErrorMessage() {
        return this.f38688zzb;
    }

    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f38687zza.getCode());
            String str = this.f38688zzb;
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
        if (this.f38688zzb == null) {
            Locale locale = Locale.ENGLISH;
            return a.l(this.f38687zza.getCode(), "{errorCode: ", "}");
        }
        ErrorCode errorCode = this.f38687zza;
        Locale locale2 = Locale.ENGLISH;
        return "{errorCode: " + errorCode.getCode() + ", errorMessage: " + this.f38688zzb + "}";
    }

    public Error(@NonNull ErrorCode errorCode, @NonNull String str) {
        this.f38687zza = errorCode;
        this.f38688zzb = str;
    }
}
