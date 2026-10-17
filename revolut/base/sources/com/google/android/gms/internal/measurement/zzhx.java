package com.google.android.gms.internal.measurement;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhx extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhx f40229zzb;
    private long zzA;
    private int zzB;
    private boolean zzE;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzL;
    private long zzM;
    private int zzP;
    private zzia zzR;
    private long zzT;
    private long zzU;
    private int zzX;
    private boolean zzY;
    private boolean zzaa;
    private zzhs zzab;
    private long zzaf;
    private boolean zzag;
    private boolean zzai;
    private int zzak;
    private zzhg zzam;
    private int zzan;
    private zzhc zzao;
    private zzim zzaq;
    private long zzar;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40230zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40231zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f40232zzf;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private long f40235zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private long f40236zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private long f40237zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private long f40238zzl;
    private long zzm;
    private int zzr;
    private long zzv;
    private long zzw;
    private boolean zzy;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzmj f40233zzg = zzmd.zzcn();

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzmj f40234zzh = zzmd.zzcn();
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private String zzz = "";
    private String zzC = "";
    private String zzD = "";
    private zzmj zzF = zzmd.zzcn();
    private String zzG = "";
    private String zzK = "";
    private String zzN = "";
    private String zzO = "";
    private String zzQ = "";
    private zzmh zzS = zzmd.zzck();
    private String zzV = "";
    private String zzW = "";
    private String zzZ = "";
    private String zzac = "";
    private zzmj zzad = zzmd.zzcn();
    private String zzae = "";
    private String zzah = "";
    private String zzaj = "";
    private String zzal = "";
    private String zzap = "";
    private String zzas = "";

    static {
        zzhx zzhxVar = new zzhx();
        f40229zzb = zzhxVar;
        zzmd.zzct(zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static zzhw zzA(zzhx zzhxVar) {
        zzlz zzlzVarZzcg = f40229zzb.zzcg();
        zzlzVarZzcg.zzaY(zzhxVar);
        return (zzhw) zzlzVarZzcg;
    }

    public static /* synthetic */ void zzZ(zzhx zzhxVar, Iterable iterable) {
        zzmj zzmjVar = zzhxVar.zzF;
        if (!zzmjVar.zzc()) {
            zzhxVar.zzF = zzmd.zzco(zzmjVar);
        }
        zzko.zzcc(iterable, zzhxVar.zzF);
    }

    public static /* synthetic */ void zzaA(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 2048;
        zzhxVar.zzs = str;
    }

    public static /* synthetic */ void zzaB(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 8192;
        zzhxVar.zzu = str;
    }

    public static /* synthetic */ void zzaC(zzhx zzhxVar, int i) {
        zzhxVar.f40230zzd |= 33554432;
        zzhxVar.zzH = i;
    }

    public static /* synthetic */ void zzaD(zzhx zzhxVar, zzhg zzhgVar) {
        zzhgVar.getClass();
        zzhxVar.zzam = zzhgVar;
        zzhxVar.f40231zze |= 4194304;
    }

    public static /* synthetic */ void zzaE(zzhx zzhxVar, long j2) {
        zzhxVar.f40231zze |= 134217728;
        zzhxVar.zzar = j2;
    }

    public static /* synthetic */ void zzaF(zzhx zzhxVar, int i) {
        zzhxVar.f40230zzd |= PKIFailureInfo.badCertTemplate;
        zzhxVar.zzB = i;
    }

    public static /* synthetic */ void zzaG(zzhx zzhxVar, long j2) {
        zzhxVar.f40231zze |= 32;
        zzhxVar.zzU = j2;
    }

    public static /* synthetic */ void zzaH(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= PKIFailureInfo.duplicateCertReq;
        zzhxVar.zzL = j2;
    }

    public static /* synthetic */ void zzaI(zzhx zzhxVar, String str) {
        zzhxVar.f40231zze |= 131072;
        zzhxVar.zzah = str;
    }

    public static /* synthetic */ void zzaJ(zzhx zzhxVar, String str) {
        zzhxVar.f40231zze |= 128;
        zzhxVar.zzW = str;
    }

    public static /* synthetic */ void zzaK(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40231zze |= 524288;
        zzhxVar.zzaj = str;
    }

    public static /* synthetic */ void zzaL(zzhx zzhxVar, int i) {
        zzhxVar.f40231zze |= 8388608;
        zzhxVar.zzan = i;
    }

    public static /* synthetic */ void zzaM(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 524288;
        zzhxVar.zzA = j2;
    }

    public static /* synthetic */ void zzaN(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 256;
        zzhxVar.zzp = str;
    }

    public static /* synthetic */ void zzaO(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= Integer.MIN_VALUE;
        zzhxVar.zzN = str;
    }

    public static /* synthetic */ void zzaP(zzhx zzhxVar, long j2) {
        zzhxVar.f40231zze |= 16;
        zzhxVar.zzT = j2;
    }

    public static /* synthetic */ void zzaQ(zzhx zzhxVar, boolean z) {
        zzhxVar.f40231zze |= 65536;
        zzhxVar.zzag = z;
    }

    public static /* synthetic */ void zzaR(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 8;
        zzhxVar.f40237zzk = j2;
    }

    public static /* synthetic */ void zzaS(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40231zze |= 16384;
        zzhxVar.zzae = str;
    }

    public static /* synthetic */ void zzaT(zzhx zzhxVar, int i, zzhm zzhmVar) {
        zzhmVar.getClass();
        zzhxVar.zzcx();
        zzhxVar.f40233zzg.set(i, zzhmVar);
    }

    public static /* synthetic */ void zzaU(zzhx zzhxVar, String str) {
        zzhxVar.f40231zze |= 268435456;
        zzhxVar.zzas = "";
    }

    public static /* synthetic */ void zzaV(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 16777216;
        zzhxVar.zzG = str;
    }

    public static /* synthetic */ void zzaW(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 4194304;
        zzhxVar.zzD = str;
    }

    public static /* synthetic */ void zzaX(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 16384;
        zzhxVar.zzv = j2;
    }

    public static /* synthetic */ void zzaY(zzhx zzhxVar, String str) {
        zzhxVar.f40230zzd |= PKIFailureInfo.badSenderNonce;
        zzhxVar.zzC = str;
    }

    public static /* synthetic */ void zzaZ(zzhx zzhxVar, boolean z) {
        zzhxVar.f40231zze |= 262144;
        zzhxVar.zzai = z;
    }

    public static /* synthetic */ void zzaa(zzhx zzhxVar, Iterable iterable) {
        zzhxVar.zzcx();
        zzko.zzcc(iterable, zzhxVar.f40233zzg);
    }

    public static /* synthetic */ void zzab(zzhx zzhxVar, Iterable iterable) {
        zzmh zzmhVar = zzhxVar.zzS;
        if (!zzmhVar.zzc()) {
            int size = zzmhVar.size();
            zzhxVar.zzS = zzmhVar.zzd(size + size);
        }
        zzko.zzcc(iterable, zzhxVar.zzS);
    }

    public static /* synthetic */ void zzac(zzhx zzhxVar, Iterable iterable) {
        zzmj zzmjVar = zzhxVar.zzad;
        if (!zzmjVar.zzc()) {
            zzhxVar.zzad = zzmd.zzco(zzmjVar);
        }
        zzko.zzcc(iterable, zzhxVar.zzad);
    }

    public static /* synthetic */ void zzad(zzhx zzhxVar, Iterable iterable) {
        zzhxVar.zzcy();
        zzko.zzcc(iterable, zzhxVar.f40234zzh);
    }

    public static /* synthetic */ void zzae(zzhx zzhxVar, zzhm zzhmVar) {
        zzhmVar.getClass();
        zzhxVar.zzcx();
        zzhxVar.f40233zzg.add(zzhmVar);
    }

    public static /* synthetic */ void zzaf(zzhx zzhxVar, zzio zzioVar) {
        zzioVar.getClass();
        zzhxVar.zzcy();
        zzhxVar.f40234zzh.add(zzioVar);
    }

    public static /* synthetic */ void zzag(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -262145;
        zzhxVar.zzz = f40229zzb.zzz;
    }

    public static /* synthetic */ void zzai(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -257;
        zzhxVar.zzp = f40229zzb.zzp;
    }

    public static /* synthetic */ void zzaj(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= Integer.MAX_VALUE;
        zzhxVar.zzN = f40229zzb.zzN;
    }

    public static /* synthetic */ void zzal(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -2097153;
        zzhxVar.zzC = f40229zzb.zzC;
    }

    public static /* synthetic */ void zzam(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -131073;
        zzhxVar.zzy = false;
    }

    public static /* synthetic */ void zzan(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -33;
        zzhxVar.zzm = 0L;
    }

    public static /* synthetic */ void zzao(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -17;
        zzhxVar.f40238zzl = 0L;
    }

    public static /* synthetic */ void zzap(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -65537;
        zzhxVar.zzx = f40229zzb.zzx;
    }

    public static /* synthetic */ void zzaq(zzhx zzhxVar) {
        zzhxVar.f40231zze &= -8193;
        zzhxVar.zzac = f40229zzb.zzac;
    }

    public static /* synthetic */ void zzar(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -268435457;
        zzhxVar.zzK = f40229zzb.zzK;
    }

    public static /* synthetic */ void zzas(zzhx zzhxVar) {
        zzhxVar.f40230zzd &= -3;
        zzhxVar.f40235zzi = 0L;
    }

    public static /* synthetic */ void zzat(zzhx zzhxVar, int i) {
        zzhxVar.zzcx();
        zzhxVar.f40233zzg.remove(i);
    }

    public static /* synthetic */ void zzau(zzhx zzhxVar, int i) {
        zzhxVar.zzcy();
        zzhxVar.f40234zzh.remove(i);
    }

    public static /* synthetic */ void zzav(zzhx zzhxVar, zzhc zzhcVar) {
        zzhcVar.getClass();
        zzhxVar.zzao = zzhcVar;
        zzhxVar.f40231zze |= 16777216;
    }

    public static /* synthetic */ void zzaw(zzhx zzhxVar, int i) {
        zzhxVar.f40231zze |= PKIFailureInfo.badCertTemplate;
        zzhxVar.zzak = i;
    }

    public static /* synthetic */ void zzax(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40231zze |= 4;
        zzhxVar.zzQ = str;
    }

    public static /* synthetic */ void zzay(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 4096;
        zzhxVar.zzt = str;
    }

    public static /* synthetic */ void zzaz(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 262144;
        zzhxVar.zzz = str;
    }

    public static /* synthetic */ void zzba(zzhx zzhxVar, boolean z) {
        zzhxVar.f40230zzd |= 131072;
        zzhxVar.zzy = z;
    }

    public static /* synthetic */ void zzbb(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 128;
        zzhxVar.zzo = str;
    }

    public static /* synthetic */ void zzbc(zzhx zzhxVar, String str) {
        zzhxVar.f40230zzd |= 64;
        zzhxVar.zzn = "android";
    }

    public static /* synthetic */ void zzbd(zzhx zzhxVar, zzia zziaVar) {
        zziaVar.getClass();
        zzhxVar.zzR = zziaVar;
        zzhxVar.f40231zze |= 8;
    }

    public static /* synthetic */ void zzbe(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 32;
        zzhxVar.zzm = j2;
    }

    public static /* synthetic */ void zzbf(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 16;
        zzhxVar.f40238zzl = j2;
    }

    public static /* synthetic */ void zzbg(zzhx zzhxVar, int i) {
        zzhxVar.f40230zzd |= 1;
        zzhxVar.f40232zzf = 1;
    }

    public static /* synthetic */ void zzbh(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 65536;
        zzhxVar.zzx = str;
    }

    public static /* synthetic */ void zzbi(zzhx zzhxVar, int i) {
        zzhxVar.f40231zze |= 2;
        zzhxVar.zzP = i;
    }

    public static /* synthetic */ void zzbj(zzhx zzhxVar, boolean z) {
        zzhxVar.f40230zzd |= 8388608;
        zzhxVar.zzE = z;
    }

    public static /* synthetic */ void zzbk(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40231zze |= 8192;
        zzhxVar.zzac = str;
    }

    public static /* synthetic */ void zzbl(zzhx zzhxVar, zzim zzimVar) {
        zzhxVar.zzaq = zzimVar;
        zzhxVar.f40231zze |= 67108864;
    }

    public static /* synthetic */ void zzbm(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 4;
        zzhxVar.f40236zzj = j2;
    }

    public static /* synthetic */ void zzbn(zzhx zzhxVar, long j2) {
        zzhxVar.f40231zze |= 32768;
        zzhxVar.zzaf = j2;
    }

    public static /* synthetic */ void zzbo(zzhx zzhxVar, int i) {
        zzhxVar.f40230zzd |= 1024;
        zzhxVar.zzr = i;
    }

    public static /* synthetic */ void zzbp(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 2;
        zzhxVar.f40235zzi = j2;
    }

    public static /* synthetic */ void zzbq(zzhx zzhxVar, long j2) {
        zzhxVar.f40230zzd |= 32768;
        zzhxVar.zzw = 119002L;
    }

    public static /* synthetic */ void zzbr(zzhx zzhxVar, int i, zzio zzioVar) {
        zzioVar.getClass();
        zzhxVar.zzcy();
        zzhxVar.f40234zzh.set(i, zzioVar);
    }

    public static /* synthetic */ void zzbs(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.f40230zzd |= 512;
        zzhxVar.zzq = str;
    }

    private final void zzcx() {
        zzmj zzmjVar = this.f40233zzg;
        if (zzmjVar.zzc()) {
            return;
        }
        this.f40233zzg = zzmd.zzco(zzmjVar);
    }

    private final void zzcy() {
        zzmj zzmjVar = this.f40234zzh;
        if (zzmjVar.zzc()) {
            return;
        }
        this.f40234zzh = zzmd.zzco(zzmjVar);
    }

    public static zzhw zzz() {
        return (zzhw) f40229zzb.zzcg();
    }

    public final zzim zzC() {
        zzim zzimVar = this.zzaq;
        return zzimVar == null ? zzim.zzd() : zzimVar;
    }

    public final zzio zzD(int i) {
        return (zzio) this.f40234zzh.get(i);
    }

    public final String zzE() {
        return this.zzQ;
    }

    public final String zzF() {
        return this.zzt;
    }

    public final String zzG() {
        return this.zzz;
    }

    public final String zzH() {
        return this.zzs;
    }

    public final String zzI() {
        return this.zzu;
    }

    public final String zzJ() {
        return this.zzah;
    }

    public final String zzK() {
        return this.zzW;
    }

    public final String zzL() {
        return this.zzaj;
    }

    public final String zzM() {
        return this.zzp;
    }

    public final String zzN() {
        return this.zzN;
    }

    public final String zzO() {
        return this.zzG;
    }

    public final String zzP() {
        return this.zzD;
    }

    public final String zzQ() {
        return this.zzC;
    }

    public final String zzR() {
        return this.zzo;
    }

    public final String zzS() {
        return this.zzn;
    }

    public final String zzT() {
        return this.zzx;
    }

    public final String zzU() {
        return this.zzac;
    }

    public final String zzV() {
        return this.zzq;
    }

    public final List zzW() {
        return this.zzF;
    }

    public final List zzX() {
        return this.f40233zzg;
    }

    public final List zzY() {
        return this.f40234zzh;
    }

    public final int zza() {
        return this.zzak;
    }

    public final int zzb() {
        return this.zzH;
    }

    public final boolean zzbA() {
        return (this.f40231zze & 134217728) != 0;
    }

    public final boolean zzbB() {
        return (this.f40230zzd & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final boolean zzbC() {
        return (this.f40230zzd & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean zzbD() {
        return (this.f40231zze & 131072) != 0;
    }

    public final boolean zzbE() {
        return (this.f40231zze & 128) != 0;
    }

    public final boolean zzbF() {
        return (this.f40231zze & 524288) != 0;
    }

    public final boolean zzbG() {
        return (this.f40231zze & 8388608) != 0;
    }

    public final boolean zzbH() {
        return (this.f40230zzd & 524288) != 0;
    }

    public final boolean zzbI() {
        return (this.f40230zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean zzbJ() {
        return (this.f40231zze & 16) != 0;
    }

    public final boolean zzbK() {
        return (this.f40230zzd & 8) != 0;
    }

    public final boolean zzbL() {
        return (this.f40230zzd & 16384) != 0;
    }

    public final boolean zzbM() {
        return (this.f40231zze & 262144) != 0;
    }

    public final boolean zzbN() {
        return (this.f40230zzd & 131072) != 0;
    }

    public final boolean zzbO() {
        return (this.f40230zzd & 32) != 0;
    }

    public final boolean zzbP() {
        return (this.f40230zzd & 16) != 0;
    }

    public final boolean zzbQ() {
        return (this.f40230zzd & 1) != 0;
    }

    public final boolean zzbR() {
        return (this.f40231zze & 2) != 0;
    }

    public final boolean zzbS() {
        return (this.f40230zzd & 8388608) != 0;
    }

    public final boolean zzbT() {
        return (this.f40231zze & 8192) != 0;
    }

    public final boolean zzbU() {
        return (this.f40231zze & 67108864) != 0;
    }

    public final boolean zzbV() {
        return (this.f40230zzd & 4) != 0;
    }

    public final boolean zzbW() {
        return (this.f40231zze & 32768) != 0;
    }

    public final boolean zzbX() {
        return (this.f40230zzd & 1024) != 0;
    }

    public final boolean zzbY() {
        return (this.f40230zzd & 2) != 0;
    }

    public final boolean zzbZ() {
        return (this.f40230zzd & 32768) != 0;
    }

    public final boolean zzbt() {
        return this.zzag;
    }

    public final boolean zzbu() {
        return this.zzai;
    }

    public final boolean zzbv() {
        return this.zzy;
    }

    public final boolean zzbw() {
        return this.zzE;
    }

    public final boolean zzbx() {
        return (this.f40231zze & 16777216) != 0;
    }

    public final boolean zzby() {
        return (this.f40230zzd & 33554432) != 0;
    }

    public final boolean zzbz() {
        return (this.f40231zze & 4194304) != 0;
    }

    public final int zzc() {
        return this.zzB;
    }

    public final int zzd() {
        return this.zzan;
    }

    public final int zze() {
        return this.f40233zzg.size();
    }

    public final int zzf() {
        return this.f40232zzf;
    }

    public final int zzg() {
        return this.zzP;
    }

    public final int zzh() {
        return this.zzr;
    }

    public final int zzi() {
        return this.f40234zzh.size();
    }

    public final long zzj() {
        return this.zzar;
    }

    public final long zzk() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40229zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zzd", "zze", "zzf", "zzg", zzhm.class, "zzh", zzio.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", zzhi.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", zzha.f40159zza, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i2 == 3) {
            return new zzhx();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhw(zzipVar);
        }
        if (i2 == 5) {
            return f40229zzb;
        }
        throw null;
    }

    public final long zzm() {
        return this.zzA;
    }

    public final long zzn() {
        return this.zzT;
    }

    public final long zzo() {
        return this.f40237zzk;
    }

    public final long zzp() {
        return this.zzv;
    }

    public final long zzq() {
        return this.zzm;
    }

    public final long zzr() {
        return this.f40238zzl;
    }

    public final long zzs() {
        return this.f40236zzj;
    }

    public final long zzt() {
        return this.zzaf;
    }

    public final long zzu() {
        return this.f40235zzi;
    }

    public final long zzv() {
        return this.zzw;
    }

    public final zzhc zzw() {
        zzhc zzhcVar = this.zzao;
        return zzhcVar == null ? zzhc.zze() : zzhcVar;
    }

    public final zzhg zzx() {
        zzhg zzhgVar = this.zzam;
        return zzhgVar == null ? zzhg.zzc() : zzhgVar;
    }

    public final zzhm zzy(int i) {
        return (zzhm) this.f40233zzg.get(i);
    }
}
