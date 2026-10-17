package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "IssuerInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48512zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f48513zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48514zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48515zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final String f48516zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    final String f48517zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    final String f48518zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    final String f48519zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    final String f48520zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    final String f48521zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    final String f48522zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 13)
    final String f48523zzl;

    @SafeParcelable.Field(id = 14)
    final String zzm;

    @SafeParcelable.Field(id = 15)
    final long zzn;

    @SafeParcelable.Field(id = 16)
    final String zzo;

    @SafeParcelable.Field(id = 17)
    final String zzp;

    @SafeParcelable.Field(id = 18)
    final String zzq;

    @SafeParcelable.Field(id = 20)
    final String zzr;

    @SafeParcelable.Field(id = 21)
    final String zzs;

    @SafeParcelable.Field(id = 22)
    final String zzt;

    @SafeParcelable.Field(id = 23)
    final String zzu;

    @SafeParcelable.Field(id = 24)
    final int zzv;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) String str11, @SafeParcelable.Param(id = 13) String str12, @SafeParcelable.Param(id = 14) String str13, @SafeParcelable.Param(id = 15) long j2, @SafeParcelable.Param(id = 16) String str14, @SafeParcelable.Param(id = 17) String str15, @SafeParcelable.Param(id = 18) String str16, @SafeParcelable.Param(id = 20) String str17, @SafeParcelable.Param(id = 21) String str18, @SafeParcelable.Param(id = 22) String str19, @SafeParcelable.Param(id = 23) String str20, @SafeParcelable.Param(id = 24) int i) {
        this.f48512zza = str;
        this.f48513zzb = str2;
        this.f48514zzc = str3;
        this.f48515zzd = str4;
        this.f48516zze = str5;
        this.f48517zzf = str6;
        this.f48518zzg = str7;
        this.f48519zzh = str8;
        this.f48520zzi = str9;
        this.f48521zzj = str10;
        this.f48522zzk = str11;
        this.f48523zzl = str12;
        this.zzm = str13;
        this.zzn = j2;
        this.zzo = str14;
        this.zzp = str15;
        this.zzq = str16;
        this.zzr = str17;
        this.zzs = str18;
        this.zzt = str19;
        this.zzu = str20;
        this.zzv = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzaj) {
            zzaj zzajVar = (zzaj) obj2;
            if (Objects.equal(this.f48512zza, zzajVar.f48512zza) && Objects.equal(this.f48513zzb, zzajVar.f48513zzb) && Objects.equal(this.f48514zzc, zzajVar.f48514zzc) && Objects.equal(this.f48515zzd, zzajVar.f48515zzd) && Objects.equal(this.f48516zze, zzajVar.f48516zze) && Objects.equal(this.f48517zzf, zzajVar.f48517zzf) && Objects.equal(this.f48518zzg, zzajVar.f48518zzg) && Objects.equal(this.f48519zzh, zzajVar.f48519zzh) && Objects.equal(this.f48520zzi, zzajVar.f48520zzi) && Objects.equal(this.f48521zzj, zzajVar.f48521zzj) && Objects.equal(this.f48522zzk, zzajVar.f48522zzk) && Objects.equal(this.f48523zzl, zzajVar.f48523zzl) && Objects.equal(this.zzm, zzajVar.zzm) && this.zzn == zzajVar.zzn && Objects.equal(this.zzo, zzajVar.zzo) && Objects.equal(this.zzp, zzajVar.zzp) && Objects.equal(this.zzq, zzajVar.zzq) && Objects.equal(this.zzr, zzajVar.zzr) && Objects.equal(this.zzs, zzajVar.zzs) && Objects.equal(this.zzt, zzajVar.zzt) && Objects.equal(this.zzu, zzajVar.zzu) && Objects.equal(Integer.valueOf(this.zzv), Integer.valueOf(zzajVar.zzv))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48512zza, this.f48513zzb, this.f48514zzc, this.f48515zzd, this.f48516zze, this.f48517zzf, this.f48518zzg, this.f48519zzh, this.f48520zzi, this.f48521zzj, this.f48522zzk, this.f48523zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, Integer.valueOf(this.zzv));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("issuerName", this.f48512zza).add("issuerPhoneNumber", this.f48513zzb).add("appLogoUrl", this.f48514zzc).add("appName", this.f48515zzd).add("appDeveloperName", this.f48516zze).add("appPackageName", this.f48517zzf).add("privacyNoticeUrl", this.f48518zzg).add("termsAndConditionsUrl", this.f48519zzh).add("productShortName", this.f48520zzi).add("appAction", this.f48521zzj).add("appIntentExtraMessage", this.f48522zzk).add("issuerMessageHeadline", this.f48523zzl).add("issuerMessageBody", this.zzm).add("issuerMessageExpiryTimestampMillis", Long.valueOf(this.zzn)).add("issuerMessageLinkPackageName", this.zzo).add("issuerMessageLinkAction", this.zzp).add("issuerMessageLinkExtraText", this.zzq).add("issuerMessageLinkUrl", this.zzr).add("issuerMessageLinkText", this.zzs).add("issuerWebLinkUrl", this.zzt).add("issuerWebLinkText", this.zzu).add("issuerMessageType", Integer.valueOf(this.zzv)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48512zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48513zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48514zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48515zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48516zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48517zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48518zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48519zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.f48520zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.f48521zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.f48522zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.f48523zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 22, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 23, this.zzu, false);
        SafeParcelWriter.writeInt(parcel, 24, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
