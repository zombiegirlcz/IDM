package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzh {
    private Long zzA;
    private Long zzB;
    private long zzC;
    private String zzD;
    private int zzE;
    private int zzF;
    private long zzG;
    private String zzH;
    private byte[] zzI;
    private int zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;
    private long zzP;
    private String zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzio f47007zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47008zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private String f47009zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private String f47010zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private String f47011zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private String f47012zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private long f47013zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f47014zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private long f47015zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private String f47016zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private long f47017zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private String f47018zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    public zzh(zzio zzioVar, String str) {
        Preconditions.checkNotNull(zzioVar);
        Preconditions.checkNotEmpty(str);
        this.f47007zza = zzioVar;
        this.f47008zzb = str;
        zzioVar.zzaX().zzg();
    }

    public final String zzA() {
        this.f47007zza.zzaX().zzg();
        return this.zzq;
    }

    public final String zzB() {
        this.f47007zza.zzaX().zzg();
        String str = this.zzQ;
        zzaq(null);
        return str;
    }

    public final String zzC() {
        this.f47007zza.zzaX().zzg();
        return this.f47008zzb;
    }

    public final String zzD() {
        this.f47007zza.zzaX().zzg();
        return this.f47009zzc;
    }

    public final String zzE() {
        this.f47007zza.zzaX().zzg();
        return this.f47018zzl;
    }

    public final String zzF() {
        this.f47007zza.zzaX().zzg();
        return this.f47016zzj;
    }

    public final String zzG() {
        this.f47007zza.zzaX().zzg();
        return this.f47012zzf;
    }

    public final String zzH() {
        this.f47007zza.zzaX().zzg();
        return this.f47010zzd;
    }

    public final String zzI() {
        this.f47007zza.zzaX().zzg();
        return this.zzQ;
    }

    public final String zzJ() {
        this.f47007zza.zzaX().zzg();
        return this.f47011zze;
    }

    public final String zzK() {
        this.f47007zza.zzaX().zzg();
        return this.zzH;
    }

    public final String zzL() {
        this.f47007zza.zzaX().zzg();
        return this.zzu;
    }

    public final String zzM() {
        this.f47007zza.zzaX().zzg();
        return this.zzD;
    }

    public final List zzN() {
        this.f47007zza.zzaX().zzg();
        return this.zzt;
    }

    public final void zzO() {
        this.f47007zza.zzaX().zzg();
        this.zzR = false;
    }

    public final void zzP() {
        zzio zzioVar = this.f47007zza;
        zzioVar.zzaX().zzg();
        long j2 = this.f47013zzg + 1;
        if (j2 > 2147483647L) {
            zzioVar.zzaW().zzk().zzb("Bundle index overflow. appId", zzhe.zzn(this.f47008zzb));
            j2 = 0;
        }
        this.zzR = true;
        this.f47013zzg = j2;
    }

    public final void zzQ(long j2) {
        zzio zzioVar = this.f47007zza;
        zzioVar.zzaX().zzg();
        long j3 = this.f47013zzg + j2;
        if (j3 > 2147483647L) {
            zzioVar.zzaW().zzk().zzb("Bundle index overflow. appId", zzhe.zzn(this.f47008zzb));
            j3 = (-1) + j2;
        }
        long j5 = this.zzG + 1;
        if (j5 > 2147483647L) {
            zzioVar.zzaW().zzk().zzb("Delivery index overflow. appId", zzhe.zzn(this.f47008zzb));
            j5 = 0;
        }
        this.zzR = true;
        this.f47013zzg = j3;
        this.zzG = j5;
    }

    public final void zzR(byte[] bArr) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzI != bArr;
        this.zzI = bArr;
    }

    public final void zzS(String str) {
        this.f47007zza.zzaX().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzR |= true ^ Objects.equals(this.zzq, str);
        this.zzq = str;
    }

    public final void zzT(int i) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzy != i;
        this.zzy = i;
    }

    public final void zzU(boolean z) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzp != z;
        this.zzp = z;
    }

    public final void zzV(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.f47009zzc, str);
        this.f47009zzc = str;
    }

    public final void zzW(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.f47018zzl, str);
        this.f47018zzl = str;
    }

    public final void zzX(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.f47016zzj, str);
        this.f47016zzj = str;
    }

    public final void zzY(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.f47017zzk != j2;
        this.f47017zzk = j2;
    }

    public final void zzZ(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzC != j2;
        this.zzC = j2;
    }

    public final int zza() {
        this.f47007zza.zzaX().zzg();
        return this.zzy;
    }

    public final void zzaA(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzu, str);
        this.zzu = str;
    }

    public final void zzaB(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzx != j2;
        this.zzx = j2;
    }

    public final void zzaC(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzD != str;
        this.zzD = str;
    }

    public final void zzaD(boolean z) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzv != z;
        this.zzv = z;
    }

    public final void zzaE(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzw != j2;
        this.zzw = j2;
    }

    public final void zzaF(boolean z) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzz != z;
        this.zzz = z;
    }

    public final void zzaG(Long l2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzA, l2);
        this.zzA = l2;
    }

    public final void zzaH(Long l2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzB, l2);
        this.zzB = l2;
    }

    public final boolean zzaI() {
        this.f47007zza.zzaX().zzg();
        return this.zzp;
    }

    public final boolean zzaJ() {
        this.f47007zza.zzaX().zzg();
        return this.zzo;
    }

    public final boolean zzaK() {
        this.f47007zza.zzaX().zzg();
        return this.zzR;
    }

    public final boolean zzaL() {
        this.f47007zza.zzaX().zzg();
        return this.zzv;
    }

    public final boolean zzaM() {
        this.f47007zza.zzaX().zzg();
        return this.zzz;
    }

    public final byte[] zzaN() {
        this.f47007zza.zzaX().zzg();
        return this.zzI;
    }

    public final void zzaa(int i) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzJ != i;
        this.zzJ = i;
    }

    public final void zzab(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzS != j2;
        this.zzS = j2;
    }

    public final void zzac(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzN != j2;
        this.zzN = j2;
    }

    public final void zzad(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzO != j2;
        this.zzO = j2;
    }

    public final void zzae(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzM != j2;
        this.zzM = j2;
    }

    public final void zzaf(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzL != j2;
        this.zzL = j2;
    }

    public final void zzag(int i) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzF != i;
        this.zzF = i;
    }

    public final void zzah(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzP != j2;
        this.zzP = j2;
    }

    public final void zzai(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzK != j2;
        this.zzK = j2;
    }

    public final void zzaj(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzn != j2;
        this.zzn = j2;
    }

    public final void zzak(int i) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzE != i;
        this.zzE = i;
    }

    public final void zzal(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzs != j2;
        this.zzs = j2;
    }

    public final void zzam(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzT != j2;
        this.zzT = j2;
    }

    public final void zzan(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.f47012zzf, str);
        this.f47012zzf = str;
    }

    public final void zzao(String str) {
        this.f47007zza.zzaX().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzR |= true ^ Objects.equals(this.f47010zzd, str);
        this.f47010zzd = str;
    }

    public final void zzap(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzm != j2;
        this.zzm = j2;
    }

    public final void zzaq(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzQ, str);
        this.zzQ = str;
    }

    public final void zzar(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzG != j2;
        this.zzG = j2;
    }

    public final void zzas(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.f47015zzi != j2;
        this.f47015zzi = j2;
    }

    public final void zzat(long j2) {
        Preconditions.checkArgument(j2 >= 0);
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.f47013zzg != j2;
        this.f47013zzg = j2;
    }

    public final void zzau(long j2) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.f47014zzh != j2;
        this.f47014zzh = j2;
    }

    public final void zzav(boolean z) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzo != z;
        this.zzo = z;
    }

    public final void zzaw(Boolean bool) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zzax(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.f47011zze, str);
        this.f47011zze = str;
    }

    public final void zzay(List list) {
        this.f47007zza.zzaX().zzg();
        if (Objects.equals(this.zzt, list)) {
            return;
        }
        this.zzR = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    public final void zzaz(String str) {
        this.f47007zza.zzaX().zzg();
        this.zzR |= this.zzH != str;
        this.zzH = str;
    }

    public final int zzb() {
        this.f47007zza.zzaX().zzg();
        return this.zzJ;
    }

    public final int zzc() {
        this.f47007zza.zzaX().zzg();
        return this.zzF;
    }

    public final int zzd() {
        this.f47007zza.zzaX().zzg();
        return this.zzE;
    }

    public final long zze() {
        this.f47007zza.zzaX().zzg();
        return this.f47017zzk;
    }

    public final long zzf() {
        this.f47007zza.zzaX().zzg();
        return this.zzC;
    }

    public final long zzg() {
        this.f47007zza.zzaX().zzg();
        return this.zzS;
    }

    public final long zzh() {
        this.f47007zza.zzaX().zzg();
        return this.zzN;
    }

    public final long zzi() {
        this.f47007zza.zzaX().zzg();
        return this.zzO;
    }

    public final long zzj() {
        this.f47007zza.zzaX().zzg();
        return this.zzM;
    }

    public final long zzk() {
        this.f47007zza.zzaX().zzg();
        return this.zzL;
    }

    public final long zzl() {
        this.f47007zza.zzaX().zzg();
        return this.zzP;
    }

    public final long zzm() {
        this.f47007zza.zzaX().zzg();
        return this.zzK;
    }

    public final long zzn() {
        this.f47007zza.zzaX().zzg();
        return this.zzn;
    }

    public final long zzo() {
        this.f47007zza.zzaX().zzg();
        return this.zzs;
    }

    public final long zzp() {
        this.f47007zza.zzaX().zzg();
        return this.zzT;
    }

    public final long zzq() {
        this.f47007zza.zzaX().zzg();
        return this.zzm;
    }

    public final long zzr() {
        this.f47007zza.zzaX().zzg();
        return this.zzG;
    }

    public final long zzs() {
        this.f47007zza.zzaX().zzg();
        return this.f47015zzi;
    }

    public final long zzt() {
        this.f47007zza.zzaX().zzg();
        return this.f47013zzg;
    }

    public final long zzu() {
        this.f47007zza.zzaX().zzg();
        return this.f47014zzh;
    }

    public final long zzv() {
        this.f47007zza.zzaX().zzg();
        return this.zzx;
    }

    public final long zzw() {
        this.f47007zza.zzaX().zzg();
        return this.zzw;
    }

    public final Boolean zzx() {
        this.f47007zza.zzaX().zzg();
        return this.zzr;
    }

    public final Long zzy() {
        this.f47007zza.zzaX().zzg();
        return this.zzA;
    }

    public final Long zzz() {
        this.f47007zza.zzaX().zzg();
        return this.zzB;
    }
}
