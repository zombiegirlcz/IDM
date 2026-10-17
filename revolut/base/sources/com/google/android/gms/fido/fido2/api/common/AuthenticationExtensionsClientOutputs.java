package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUvmEntries", id = 1)
    private final UvmEntries f38468zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDevicePubKey", id = 2)
    private final zzf f38469zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCredProps", id = 3)
    private final AuthenticationExtensionsCredPropsOutputs f38470zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPrf", id = 4)
    private final zzh f38471zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTxAuthSimple", id = 5)
    private final String f38472zze;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private UvmEntries f38473zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private AuthenticationExtensionsCredPropsOutputs f38474zzb;

        @NonNull
        public AuthenticationExtensionsClientOutputs build() {
            return new AuthenticationExtensionsClientOutputs(this.f38473zza, null, this.f38474zzb, null, null);
        }

        @NonNull
        public Builder setCredProps(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
            this.f38474zzb = authenticationExtensionsCredPropsOutputs;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethodEntries(UvmEntries uvmEntries) {
            this.f38473zza = uvmEntries;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public AuthenticationExtensionsClientOutputs(@SafeParcelable.Param(id = 1) UvmEntries uvmEntries, @SafeParcelable.Param(id = 2) zzf zzfVar, @SafeParcelable.Param(id = 3) AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @SafeParcelable.Param(id = 4) zzh zzhVar, @SafeParcelable.Param(id = 5) String str) {
        this.f38468zza = uvmEntries;
        this.f38469zzb = zzfVar;
        this.f38470zzc = authenticationExtensionsCredPropsOutputs;
        this.f38471zzd = zzhVar;
        this.f38472zze = str;
    }

    @NonNull
    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj2;
        return Objects.equal(this.f38468zza, authenticationExtensionsClientOutputs.f38468zza) && Objects.equal(this.f38469zzb, authenticationExtensionsClientOutputs.f38469zzb) && Objects.equal(this.f38470zzc, authenticationExtensionsClientOutputs.f38470zzc) && Objects.equal(this.f38471zzd, authenticationExtensionsClientOutputs.f38471zzd) && Objects.equal(this.f38472zze, authenticationExtensionsClientOutputs.f38472zze);
    }

    public AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.f38470zzc;
    }

    public UvmEntries getUvmEntries() {
        return this.f38468zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38468zza, this.f38469zzb, this.f38470zzc, this.f38471zzd, this.f38472zze);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public final String toString() {
        return a.p("AuthenticationExtensionsClientOutputs{", zza().toString(), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f38469zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredProps(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f38471zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f38472zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f38470zzc;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.zza());
            }
            UvmEntries uvmEntries = this.f38468zza;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.zza());
            }
            zzh zzhVar = this.f38471zzd;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.zza());
            }
            String str = this.f38472zze;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e);
        }
    }
}
