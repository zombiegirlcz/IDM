package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ClientAppContextCreator")
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f48059zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 2)
    public final String f48060zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final String f48061zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final boolean f48062zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    @Deprecated
    public final int f48063zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final String f48064zzf;

    @SafeParcelable.Constructor
    public ClientAppContext(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) String str3) {
        this.f48059zza = i;
        this.f48060zzb = (String) Preconditions.checkNotNull(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Locale locale = Locale.US;
            String str4 = "ClientAppContext: 0P identifier(" + str2 + ") without 0P prefix(0p:)";
            str2 = "0p:".concat(str2);
        }
        this.f48061zzc = str2;
        this.f48062zzd = z;
        this.f48063zze = i2;
        this.f48064zzf = str3;
    }

    public static final ClientAppContext zza(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, str, str2, z, 0, null);
    }

    private static boolean zzb(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj2;
        return zzb(this.f48060zzb, clientAppContext.f48060zzb) && zzb(this.f48061zzc, clientAppContext.f48061zzc) && this.f48062zzd == clientAppContext.f48062zzd && zzb(this.f48064zzf, clientAppContext.f48064zzf) && this.f48063zze == clientAppContext.f48063zze;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48060zzb, this.f48061zzc, Boolean.valueOf(this.f48062zzd), this.f48064zzf, Integer.valueOf(this.f48063zze));
    }

    @NonNull
    public final String toString() {
        String str = this.f48060zzb;
        Locale locale = Locale.US;
        String str2 = this.f48061zzc;
        boolean z = this.f48062zzd;
        String str3 = this.f48064zzf;
        int i = this.f48063zze;
        StringBuilder sbM = a.m("{realClientPackageName: ", str, ", zeroPartyIdentifier: ", str2, ", useRealClientApiKey: ");
        sbM.append(z);
        sbM.append(", apiKey: ");
        sbM.append(str3);
        sbM.append(", callingContext: ");
        return j6.a.v(sbM, "}", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f48059zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.f48060zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48061zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48062zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f48063zze);
        SafeParcelWriter.writeString(parcel, 6, this.f48064zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
