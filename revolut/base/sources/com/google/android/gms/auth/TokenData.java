package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f37280zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getToken", id = 2)
    private final String f37281zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 3)
    private final Long f37282zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isCached", id = 4)
    private final boolean f37283zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isSnowballed", id = 5)
    private final boolean f37284zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGrantedScopes", id = 6)
    private final List f37285zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getScopeData", id = 7)
    private final String f37286zzg;

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Long l2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) String str2) {
        this.f37280zza = i;
        this.f37281zzb = Preconditions.checkNotEmpty(str);
        this.f37282zzc = l2;
        this.f37283zzd = z;
        this.f37284zze = z3;
        this.f37285zzf = list;
        this.f37286zzg = str2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj2;
        return TextUtils.equals(this.f37281zzb, tokenData.f37281zzb) && Objects.equal(this.f37282zzc, tokenData.f37282zzc) && this.f37283zzd == tokenData.f37283zzd && this.f37284zze == tokenData.f37284zze && Objects.equal(this.f37285zzf, tokenData.f37285zzf) && Objects.equal(this.f37286zzg, tokenData.f37286zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37281zzb, this.f37282zzc, Boolean.valueOf(this.f37283zzd), Boolean.valueOf(this.f37284zze), this.f37285zzf, this.f37286zzg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f37280zza);
        SafeParcelWriter.writeString(parcel, 2, this.f37281zzb, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.f37282zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f37283zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f37284zze);
        SafeParcelWriter.writeStringList(parcel, 6, this.f37285zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.f37286zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final String zza() {
        return this.f37281zzb;
    }
}
