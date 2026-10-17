package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class ClientData {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f38679zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f38680zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f38681zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final ChannelIdValue f38682zzd;

    @NonNull
    public static final String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";

    @NonNull
    public static final String TYPE_GET_ASSERTION = "navigator.id.getAssertion";

    @NonNull
    public static final String KEY_ORIGIN = "origin";

    @NonNull
    public static final String KEY_CHALLENGE = "challenge";

    @NonNull
    public static final String KEY_CID_PUBKEY = "cid_pubkey";

    @NonNull
    public static final String KEY_TYPE = "typ";

    public static class Builder implements Cloneable {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f38683zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private String f38684zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private String f38685zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private ChannelIdValue f38686zzd;

        public Builder(String str, String str2, String str3, ChannelIdValue channelIdValue) {
            this.f38683zza = str;
            this.f38684zzb = str2;
            this.f38685zzc = str3;
            this.f38686zzd = channelIdValue;
        }

        @NonNull
        public static Builder newInstance() {
            return new Builder();
        }

        @NonNull
        public ClientData build() {
            return new ClientData(this.f38683zza, this.f38684zzb, this.f38685zzc, this.f38686zzd);
        }

        @NonNull
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder m3662clone() {
            return new Builder(this.f38683zza, this.f38684zzb, this.f38685zzc, this.f38686zzd);
        }

        @NonNull
        public Builder setChallenge(@NonNull String str) {
            this.f38684zzb = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull ChannelIdValue channelIdValue) {
            this.f38686zzd = channelIdValue;
            return this;
        }

        @NonNull
        public Builder setOrigin(@NonNull String str) {
            this.f38685zzc = str;
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.f38683zza = str;
            return this;
        }

        public Builder() {
            this.f38686zzd = ChannelIdValue.ABSENT;
        }
    }

    public ClientData(String str, String str2, String str3, ChannelIdValue channelIdValue) {
        this.f38679zza = (String) Preconditions.checkNotNull(str);
        this.f38680zzb = (String) Preconditions.checkNotNull(str2);
        this.f38681zzc = (String) Preconditions.checkNotNull(str3);
        this.f38682zzd = (ChannelIdValue) Preconditions.checkNotNull(channelIdValue);
    }

    public boolean equals(@NonNull Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ClientData)) {
            return false;
        }
        ClientData clientData = (ClientData) obj2;
        return this.f38679zza.equals(clientData.f38679zza) && this.f38680zzb.equals(clientData.f38680zzb) && this.f38681zzc.equals(clientData.f38681zzc) && this.f38682zzd.equals(clientData.f38682zzd);
    }

    public int hashCode() {
        int iHashCode = this.f38679zza.hashCode() + 31;
        int iHashCode2 = this.f38680zzb.hashCode() + (iHashCode * 31);
        int iHashCode3 = this.f38681zzc.hashCode() + (iHashCode2 * 31);
        return this.f38682zzd.hashCode() + (iHashCode3 * 31);
    }

    @NonNull
    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("typ", this.f38679zza);
            jSONObject.put("challenge", this.f38680zzb);
            jSONObject.put("origin", this.f38681zzc);
            ChannelIdValue.ChannelIdValueType channelIdValueType = ChannelIdValue.ChannelIdValueType.ABSENT;
            int iOrdinal = this.f38682zzd.getType().ordinal();
            if (iOrdinal == 1) {
                jSONObject.put("cid_pubkey", this.f38682zzd.getStringValue());
            } else if (iOrdinal == 2) {
                jSONObject.put("cid_pubkey", this.f38682zzd.getObjectValue());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
