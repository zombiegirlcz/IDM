package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "CardInfoCreator")
@SafeParcelable.Reserved({1, 14})
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzd();
    private static final com.google.android.gms.internal.tapandpay.zzau zzQ = com.google.android.gms.internal.tapandpay.zzau.zzi(10, 9);

    @SafeParcelable.Field(id = 29)
    final boolean zzA;

    @SafeParcelable.Field(id = 30)
    final long zzB;

    @SafeParcelable.Field(id = 31)
    final long zzC;

    @SafeParcelable.Field(id = 32)
    final boolean zzD;

    @SafeParcelable.Field(id = 33)
    final long zzE;

    @SafeParcelable.Field(id = 34)
    final String zzF;

    @SafeParcelable.Field(id = 35)
    final String zzG;

    @SafeParcelable.Field(id = 36)
    final zze zzH;

    @SafeParcelable.Field(id = 37)
    final int zzI;

    @SafeParcelable.Field(id = 38)
    final boolean zzJ;

    @SafeParcelable.Field(id = 39)
    final String zzK;

    @SafeParcelable.Field(id = 40)
    final int zzL;

    @SafeParcelable.Field(id = 41)
    final boolean zzM;

    @SafeParcelable.Field(id = 42)
    final long zzN;

    @SafeParcelable.Field(id = 43)
    final String zzO;

    @SafeParcelable.Field(id = 44)
    final int zzP;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48477zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 45)
    final String f48478zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final byte[] f48479zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48480zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48481zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final int f48482zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    final TokenStatus f48483zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    final String f48484zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    final Uri f48485zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    final int f48486zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    final int f48487zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    final zzaj f48488zzl;

    @SafeParcelable.Field(id = 13)
    final String zzm;

    @SafeParcelable.Field(id = 15)
    final zzaz zzn;

    @SafeParcelable.Field(id = 16)
    final String zzo;

    @SafeParcelable.Field(id = 17)
    final byte[] zzp;

    @SafeParcelable.Field(id = 18)
    final int zzq;

    @SafeParcelable.Field(id = 20)
    final int zzr;

    @SafeParcelable.Field(id = 21)
    final int zzs;

    @SafeParcelable.Field(id = 22)
    final zzah zzt;

    @SafeParcelable.Field(id = 23)
    final zzaf zzu;

    @SafeParcelable.Field(id = 24)
    final String zzv;

    @SafeParcelable.Field(id = 25)
    final zzan[] zzw;

    @SafeParcelable.Field(id = 26)
    final boolean zzx;

    @SafeParcelable.Field(id = 27)
    final List zzy;

    @SafeParcelable.Field(id = 28)
    final boolean zzz;

    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 45) String str2, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) int i, @SafeParcelable.Param(id = 7) TokenStatus tokenStatus, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) Uri uri2, @SafeParcelable.Param(id = 10) int i2, @SafeParcelable.Param(id = 11) int i3, @SafeParcelable.Param(id = 12) zzaj zzajVar, @SafeParcelable.Param(id = 13) String str6, @SafeParcelable.Param(id = 15) zzaz zzazVar, @SafeParcelable.Param(id = 16) String str7, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) int i5, @SafeParcelable.Param(id = 20) int i6, @SafeParcelable.Param(id = 21) int i21, @SafeParcelable.Param(id = 22) zzah zzahVar, @SafeParcelable.Param(id = 23) zzaf zzafVar, @SafeParcelable.Param(id = 24) String str8, @SafeParcelable.Param(id = 25) zzan[] zzanVarArr, @SafeParcelable.Param(id = 26) boolean z, @SafeParcelable.Param(id = 27) List list, @SafeParcelable.Param(id = 28) boolean z3, @SafeParcelable.Param(id = 29) boolean z4, @SafeParcelable.Param(id = 30) long j2, @SafeParcelable.Param(id = 31) long j3, @SafeParcelable.Param(id = 32) boolean z6, @SafeParcelable.Param(id = 33) long j5, @SafeParcelable.Param(id = 34) String str9, @SafeParcelable.Param(id = 35) String str10, @SafeParcelable.Param(id = 36) zze zzeVar, @SafeParcelable.Param(id = 37) int i22, @SafeParcelable.Param(id = 38) boolean z11, @SafeParcelable.Param(id = 39) String str11, @SafeParcelable.Param(id = 40) int i32, @SafeParcelable.Param(id = 41) boolean z12, @SafeParcelable.Param(id = 42) long j16, @SafeParcelable.Param(id = 43) String str12, @SafeParcelable.Param(id = 44) int i33) {
        this.f48477zza = str;
        this.f48478zzb = str2;
        this.f48479zzc = bArr;
        this.f48480zzd = str3;
        this.f48481zze = str4;
        this.f48482zzf = i;
        this.f48483zzg = tokenStatus;
        this.f48484zzh = str5;
        this.f48485zzi = uri2;
        this.f48486zzj = i2;
        this.f48487zzk = i3;
        this.f48488zzl = zzajVar;
        this.zzm = str6;
        this.zzn = zzazVar;
        this.zzo = str7;
        this.zzp = bArr2;
        this.zzq = i5;
        this.zzr = i6;
        this.zzs = i21;
        this.zzt = zzahVar;
        this.zzu = zzafVar;
        this.zzv = str8;
        this.zzw = zzanVarArr;
        this.zzx = z;
        this.zzy = list;
        this.zzz = z3;
        this.zzA = z4;
        this.zzB = j2;
        this.zzC = j3;
        this.zzD = z6;
        this.zzE = j5;
        this.zzF = str9;
        this.zzG = str10;
        this.zzH = zzeVar;
        this.zzI = i22;
        this.zzJ = z11;
        this.zzK = str11;
        this.zzL = i32;
        this.zzM = z12;
        this.zzN = j16;
        this.zzO = str12;
        this.zzP = i33;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj2;
            if (Objects.equal(this.f48477zza, cardInfo.f48477zza) && Objects.equal(this.f48478zzb, cardInfo.f48478zzb) && Arrays.equals(this.f48479zzc, cardInfo.f48479zzc) && Objects.equal(this.f48480zzd, cardInfo.f48480zzd) && Objects.equal(this.f48481zze, cardInfo.f48481zze) && this.f48482zzf == cardInfo.f48482zzf && Objects.equal(this.f48483zzg, cardInfo.f48483zzg) && Objects.equal(this.f48484zzh, cardInfo.f48484zzh) && Objects.equal(this.f48485zzi, cardInfo.f48485zzi) && this.f48486zzj == cardInfo.f48486zzj && this.f48487zzk == cardInfo.f48487zzk && Objects.equal(this.f48488zzl, cardInfo.f48488zzl) && Objects.equal(this.zzm, cardInfo.zzm) && Objects.equal(this.zzn, cardInfo.zzn) && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && this.zzs == cardInfo.zzs && Objects.equal(this.zzt, cardInfo.zzt) && Objects.equal(this.zzu, cardInfo.zzu) && Objects.equal(this.zzv, cardInfo.zzv) && Arrays.equals(this.zzw, cardInfo.zzw) && this.zzx == cardInfo.zzx && Objects.equal(this.zzy, cardInfo.zzy) && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzB == cardInfo.zzB && this.zzD == cardInfo.zzD && this.zzE == cardInfo.zzE && Objects.equal(this.zzF, cardInfo.zzF) && Objects.equal(this.zzG, cardInfo.zzG) && Objects.equal(this.zzH, cardInfo.zzH) && this.zzI == cardInfo.zzI && this.zzJ == cardInfo.zzJ && this.zzL == cardInfo.zzL && this.zzM == cardInfo.zzM && this.zzP == cardInfo.zzP && this.zzN == cardInfo.zzN && Objects.equal(this.zzO, cardInfo.zzO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48477zza, this.f48478zzb, this.f48479zzc, this.f48480zzd, this.f48481zze, Integer.valueOf(this.f48482zzf), this.f48483zzg, this.f48484zzh, this.f48485zzi, Integer.valueOf(this.f48486zzj), Integer.valueOf(this.f48487zzk), this.zzm, this.zzn, Integer.valueOf(this.zzq), Integer.valueOf(this.zzr), Integer.valueOf(this.zzs), this.zzt, this.zzu, this.zzv, this.zzw, Boolean.valueOf(this.zzx), this.zzy, Boolean.valueOf(this.zzz), Boolean.valueOf(this.zzA), Long.valueOf(this.zzB), Boolean.valueOf(this.zzD), Long.valueOf(this.zzE), this.zzF, this.zzG, this.zzH, Integer.valueOf(this.zzI), Boolean.valueOf(this.zzJ), Integer.valueOf(this.zzL), Boolean.valueOf(this.zzM), Long.valueOf(this.zzN), this.zzO, Integer.valueOf(this.zzP));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.f48477zza).add("auxClientTokenId", this.f48478zzb);
        byte[] bArr = this.f48479zzc;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardholderName", this.f48480zzd).add("displayName", this.f48481zze).add("cardNetwork", Integer.valueOf(this.f48482zzf)).add("tokenStatus", this.f48483zzg).add("panLastDigits", this.f48484zzh).add("cardImageUrl", this.f48485zzi).add("cardColor", Integer.valueOf(this.f48486zzj)).add("overlayTextColor", Integer.valueOf(this.f48487zzk));
        zzaj zzajVar = this.f48488zzl;
        Objects.ToStringHelper toStringHelperAdd3 = toStringHelperAdd2.add("issuerInfo", zzajVar == null ? null : zzajVar.toString()).add("tokenLastDigits", this.zzm).add("transactionInfo", this.zzn).add("issuerTokenId", this.zzo);
        byte[] bArr2 = this.zzp;
        Objects.ToStringHelper toStringHelperAdd4 = toStringHelperAdd3.add("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2)).add("cachedEligibility", Integer.valueOf(this.zzq)).add("paymentProtocol", Integer.valueOf(this.zzr)).add("tokenType", Integer.valueOf(this.zzs)).add("inStoreCvmConfig", this.zzt).add("inAppCvmConfig", this.zzu).add("tokenDisplayName", this.zzv);
        zzan[] zzanVarArr = this.zzw;
        return toStringHelperAdd4.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("allowAidSelection", Boolean.valueOf(this.zzx)).add("badges", "[" + TextUtils.join(", ", this.zzy) + "]").add("upgradeAvailable", Boolean.valueOf(this.zzz)).add("requiresSignature", Boolean.valueOf(this.zzA)).add("googleTokenId", Long.valueOf(this.zzB)).add("isTransit", Boolean.valueOf(this.zzD)).add("googleWalletId", Long.valueOf(this.zzE)).add("devicePaymentMethodId", this.zzF).add("cloudPaymentMethodId", this.zzG).add("auxiliaryGoogleTokenId", Long.valueOf(this.zzN)).add("auxiliaryIssuerTokenId", this.zzO).add("auxiliaryNetwork", Integer.valueOf(this.zzP)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48477zza, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f48479zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48480zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48481zze, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f48482zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48483zzg, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48484zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f48485zzi, i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.f48486zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.f48487zzk);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f48488zzl, i, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel, 20, this.zzr);
        SafeParcelWriter.writeInt(parcel, 21, this.zzs);
        SafeParcelWriter.writeParcelable(parcel, 22, this.zzt, i, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzu, i, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        SafeParcelWriter.writeTypedArray(parcel, 25, this.zzw, i, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzx);
        SafeParcelWriter.writeTypedList(parcel, 27, this.zzy, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzz);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzA);
        SafeParcelWriter.writeLong(parcel, 30, this.zzB);
        SafeParcelWriter.writeLong(parcel, 31, this.zzC);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzD);
        SafeParcelWriter.writeLong(parcel, 33, this.zzE);
        SafeParcelWriter.writeString(parcel, 34, this.zzF, false);
        SafeParcelWriter.writeString(parcel, 35, this.zzG, false);
        SafeParcelWriter.writeParcelable(parcel, 36, this.zzH, i, false);
        SafeParcelWriter.writeInt(parcel, 37, this.zzI);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzJ);
        SafeParcelWriter.writeString(parcel, 39, this.zzK, false);
        SafeParcelWriter.writeInt(parcel, 40, this.zzL);
        SafeParcelWriter.writeBoolean(parcel, 41, this.zzM);
        SafeParcelWriter.writeLong(parcel, 42, this.zzN);
        SafeParcelWriter.writeString(parcel, 43, this.zzO, false);
        SafeParcelWriter.writeInt(parcel, 44, this.zzP);
        SafeParcelWriter.writeString(parcel, 45, this.f48478zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
