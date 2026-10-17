package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzjl implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbh f47236zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47237zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47238zzc;

    public zzjl(zzjp zzjpVar, zzbh zzbhVar, String str) {
        this.f47236zza = zzbhVar;
        this.f47237zzb = str;
        this.f47238zzc = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzmc zzmcVar;
        zzh zzhVarZzl;
        byte[] bArr;
        zzpv zzpvVar;
        zzqd zzqdVar;
        zzpv zzpvVar2;
        zzh zzhVar;
        zzio zzioVar;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Bundle bundle;
        String str;
        boolean z;
        Object obj2;
        com.google.android.gms.internal.measurement.zzht zzhtVar;
        zzbd zzbdVarZzc;
        long j2;
        byte[] bArr2;
        zzjp zzjpVar = this.f47238zzc;
        zzjpVar.f47248zza.zzL();
        zzmc zzmcVarZzv = zzjpVar.f47248zza.zzv();
        zzmcVarZzv.zzg();
        zzio zzioVar2 = zzmcVarZzv.zzu;
        zzio.zzP();
        zzbh zzbhVar = this.f47236zza;
        Preconditions.checkNotNull(zzbhVar);
        String str2 = this.f47237zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = zzbhVar.f46951zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzmcVarZzv.zzu.zzaW().zzd().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpv zzpvVar3 = zzmcVarZzv.f47639zzg;
        com.google.android.gms.internal.measurement.zzht zzhtVarZzb = com.google.android.gms.internal.measurement.zzhv.zzb();
        zzpvVar3.zzj().zzH();
        try {
            zzhVarZzl = zzpvVar3.zzj().zzl(str2);
        } catch (Throwable th10) {
            th = th10;
            zzmcVar = zzmcVarZzv;
        }
        if (zzhVarZzl != null) {
            if (zzhVarZzl.zzaJ()) {
                com.google.android.gms.internal.measurement.zzhw zzhwVarZzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                zzhwVarZzz.zzar(1);
                zzhwVarZzz.zzan("android");
                if (!TextUtils.isEmpty(zzhVarZzl.zzC())) {
                    zzhwVarZzz.zzI(zzhVarZzl.zzC());
                }
                if (!TextUtils.isEmpty(zzhVarZzl.zzE())) {
                    zzhwVarZzz.zzK((String) Preconditions.checkNotNull(zzhVarZzl.zzE()));
                }
                if (!TextUtils.isEmpty(zzhVarZzl.zzF())) {
                    zzhwVarZzz.zzL((String) Preconditions.checkNotNull(zzhVarZzl.zzF()));
                }
                if (zzhVarZzl.zze() != -2147483648L) {
                    zzhwVarZzz.zzM((int) zzhVarZzl.zze());
                }
                zzhwVarZzz.zzai(zzhVarZzl.zzq());
                zzhwVarZzz.zzZ(zzhVarZzl.zzo());
                String strZzH = zzhVarZzl.zzH();
                String strZzA = zzhVarZzl.zzA();
                if (!TextUtils.isEmpty(strZzH)) {
                    zzhwVarZzz.zzah(strZzH);
                } else if (!TextUtils.isEmpty(strZzA)) {
                    zzhwVarZzz.zzH(strZzA);
                }
                zzhwVarZzz.zzay(zzhVarZzl.zzw());
                zzjx zzjxVarZzu = zzmcVarZzv.f47639zzg.zzu(str2);
                zzhwVarZzz.zzW(zzhVarZzl.zzn());
                if (zzioVar2.zzJ() && zzmcVarZzv.zzu.zzf().zzy(zzhwVarZzz.zzaF()) && zzjxVarZzu.zzr(zzjw.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    zzhwVarZzz.zzY(null);
                }
                zzhwVarZzz.zzT(zzjxVarZzu.zzp());
                if (zzjxVarZzu.zzr(zzjw.AD_STORAGE) && zzhVarZzl.zzaI()) {
                    Pair pairZzd = zzpvVar3.zzw().zzd(zzhVarZzl.zzC(), zzjxVarZzu);
                    if (zzhVarZzl.zzaI() && !TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                        try {
                            zzhwVarZzz.zzas(zzmc.zza((String) pairZzd.first, Long.toString(zzbhVar.f46954zzd)));
                            Object obj3 = pairZzd.second;
                            if (obj3 != null) {
                                zzhwVarZzz.zzal(((Boolean) obj3).booleanValue());
                            }
                        } catch (SecurityException e) {
                            zzmcVarZzv.zzu.zzaW().zzd().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzpvVar = zzmcVarZzv.f47639zzg;
                            zzpvVar.zzj().zzL();
                            return bArr;
                        }
                    }
                }
                zzio zzioVar3 = zzmcVarZzv.zzu;
                zzioVar3.zzg().zzv();
                zzhwVarZzz.zzX(Build.MODEL);
                zzioVar3.zzg().zzv();
                zzhwVarZzz.zzam(Build.VERSION.RELEASE);
                zzhwVarZzz.zzaz((int) zzioVar3.zzg().zza());
                zzhwVarZzz.zzaD(zzioVar3.zzg().zzb());
                try {
                    if (zzjxVarZzu.zzr(zzjw.ANALYTICS_STORAGE) && zzhVarZzl.zzD() != null) {
                        zzhwVarZzz.zzJ(zzmc.zza((String) Preconditions.checkNotNull(zzhVarZzl.zzD()), Long.toString(zzbhVar.f46954zzd)));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzl.zzG())) {
                        zzhwVarZzz.zzag((String) Preconditions.checkNotNull(zzhVarZzl.zzG()));
                    }
                    String strZzC = zzhVarZzl.zzC();
                    zzpv zzpvVar4 = zzmcVarZzv.f47639zzg;
                    List listZzE = zzpvVar4.zzj().zzE(strZzC);
                    Iterator it8 = listZzE.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            zzqdVar = null;
                            break;
                        }
                        zzqdVar = (zzqd) it8.next();
                        if ("_lte".equals(zzqdVar.f47724zzc)) {
                            break;
                        }
                    }
                    if (zzqdVar == null || zzqdVar.f47726zze == null) {
                        zzqd zzqdVar2 = new zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                        listZzE.add(zzqdVar2);
                        zzpvVar4.zzj().zzai(zzqdVar2);
                    }
                    com.google.android.gms.internal.measurement.zzio[] zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                    for (int i = 0; i < listZzE.size(); i++) {
                        com.google.android.gms.internal.measurement.zzin zzinVarZze = com.google.android.gms.internal.measurement.zzio.zze();
                        zzinVarZze.zzf(((zzqd) listZzE.get(i)).f47724zzc);
                        zzinVarZze.zzg(((zzqd) listZzE.get(i)).f47725zzd);
                        zzpvVar4.zzA().zzx(zzinVarZze, ((zzqd) listZzE.get(i)).f47726zze);
                        zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze.zzba();
                    }
                    zzhwVarZzz.zzm(Arrays.asList(zzioVarArr));
                    zzpv zzpvVar5 = zzmcVarZzv.f47639zzg;
                    zzpvVar5.zzQ(zzhVarZzl, zzhwVarZzz);
                    zzpvVar5.zzaa(zzhVarZzl, zzhwVarZzz);
                    zzhf zzhfVarZzb = zzhf.zzb(zzbhVar);
                    zzio zzioVar4 = zzmcVarZzv.zzu;
                    zzqf zzqfVarZzw = zzioVar4.zzw();
                    Bundle bundle2 = zzhfVarZzb.f47049zzd;
                    zzqfVarZzw.zzO(bundle2, zzpvVar4.zzj().zzk(str2));
                    zzioVar4.zzw().zzQ(zzhfVarZzb, zzioVar4.zzf().zzf(str2));
                    bundle2.putLong("_c", 1L);
                    zzioVar4.zzaW().zzd().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    String str4 = zzbhVar.f46953zzc;
                    bundle2.putString("_o", str4);
                    if (zzioVar4.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                        zzioVar4.zzw().zzS(bundle2, "_dbg", 1L);
                        zzioVar4.zzw().zzS(bundle2, "_r", 1L);
                    }
                    zzaw zzawVarZzj = zzpvVar4.zzj();
                    String str5 = zzbhVar.f46951zza;
                    zzbd zzbdVarZzs = zzawVarZzj.zzs(str2, str5);
                    if (zzbdVarZzs == null) {
                        zzhVar = zzhVarZzl;
                        zzioVar = zzioVar4;
                        zzhwVar = zzhwVarZzz;
                        zzpvVar2 = zzpvVar5;
                        obj2 = null;
                        bundle = bundle2;
                        str = str4;
                        zzbdVarZzc = new zzbd(str2, str5, 0L, 0L, 0L, zzbhVar.f46954zzd, 0L, null, null, null, null);
                        z = true;
                        j2 = 0;
                        zzhtVar = zzhtVarZzb;
                    } else {
                        zzpvVar2 = zzpvVar5;
                        zzhVar = zzhVarZzl;
                        zzioVar = zzioVar4;
                        zzhwVar = zzhwVarZzz;
                        bundle = bundle2;
                        str = str4;
                        z = true;
                        obj2 = null;
                        zzhtVar = zzhtVarZzb;
                        long j3 = zzbdVarZzs.f46942zzf;
                        zzbdVarZzc = zzbdVarZzs.zzc(zzbhVar.f46954zzd);
                        j2 = j3;
                    }
                    zzbd zzbdVar = zzbdVarZzc;
                    zzpvVar4.zzj().zzV(zzbdVar);
                    zzio zzioVar5 = zzmcVarZzv.zzu;
                    long j5 = zzbhVar.f46954zzd;
                    boolean z3 = z;
                    zzh zzhVar2 = zzhVar;
                    com.google.android.gms.internal.measurement.zzhw zzhwVar2 = zzhwVar;
                    zzpv zzpvVar6 = zzpvVar2;
                    try {
                        zzbc zzbcVar = new zzbc(zzioVar5, str, str2, str5, j5, j2, bundle);
                        com.google.android.gms.internal.measurement.zzhl zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                        zzhlVarZze.zzm(zzbcVar.f46934zzd);
                        zzhlVarZze.zzi(zzbcVar.f46932zzb);
                        zzhlVarZze.zzl(zzbcVar.f46935zze);
                        zzbf zzbfVar = zzbcVar.f46936zzf;
                        zzbe zzbeVar = new zzbe(zzbfVar);
                        while (zzbeVar.hasNext()) {
                            String next = zzbeVar.next();
                            com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                            zzhpVarZze.zzj(next);
                            Object objZzf = zzbfVar.zzf(next);
                            if (objZzf != null) {
                                zzpvVar4.zzA().zzw(zzhpVarZze, objZzf);
                                zzhlVarZze.zze(zzhpVarZze);
                            }
                        }
                        zzhwVar2.zzn(zzhlVarZze);
                        com.google.android.gms.internal.measurement.zzhy zzhyVarZza = com.google.android.gms.internal.measurement.zzia.zza();
                        com.google.android.gms.internal.measurement.zzhn zzhnVarZza = com.google.android.gms.internal.measurement.zzho.zza();
                        zzhnVarZza.zza(zzbdVar.f46939zzc);
                        zzhnVarZza.zzb(str5);
                        zzhyVarZza.zza(zzhnVarZza);
                        zzhwVar2.zzao(zzhyVarZza);
                        zzhwVar2.zzi(zzpvVar4.zzh().zza(zzhVar2.zzC(), Collections.EMPTY_LIST, zzhwVar2.zzaN(), Long.valueOf(zzhlVarZze.zzc()), Long.valueOf(zzhlVarZze.zzc()), false));
                        if (zzhlVarZze.zzq()) {
                            zzhwVar2.zzax(zzhlVarZze.zzc());
                            zzhwVar2.zzab(zzhlVarZze.zzc());
                        }
                        long jZzs = zzhVar2.zzs();
                        if (jZzs != 0) {
                            zzhwVar2.zzap(jZzs);
                        }
                        long jZzu = zzhVar2.zzu();
                        if (jZzu != 0) {
                            zzhwVar2.zzaq(jZzu);
                        } else if (jZzs != 0) {
                            zzhwVar2.zzaq(jZzs);
                        }
                        String strZzL = zzhVar2.zzL();
                        zzrd.zzb();
                        if (zzioVar.zzf().zzx(str2, zzgi.zzaL) && strZzL != null) {
                            zzhwVar2.zzav(strZzL);
                        }
                        zzhVar2.zzP();
                        zzhwVar2.zzP((int) zzhVar2.zzt());
                        zzioVar.zzf().zzj();
                        zzhwVar2.zzaB(119002L);
                        zzhwVar2.zzaA(zzioVar.zzaU().currentTimeMillis());
                        zzhwVar2.zzau(z3);
                        zzpvVar6.zzN(zzhwVar2.zzaF(), zzhwVar2);
                        zzhtVar.zzc(zzhwVar2);
                        zzhVar2.zzau(zzhwVar2.zzf());
                        zzhVar2.zzas(zzhwVar2.zze());
                        zzpvVar4.zzj().zzT(zzhVar2, false, false);
                        zzpvVar4.zzj().zzS();
                        zzpvVar4.zzj().zzL();
                        try {
                            return zzpvVar4.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba()).zzcd());
                        } catch (IOException e2) {
                            zzmcVarZzv.zzu.zzaW().zze().zzc("Data loss. Failed to bundle and serialize. appId", zzhe.zzn(str2), e2);
                            return obj2;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        zzmcVar = zzmcVarZzv;
                    }
                } catch (SecurityException e4) {
                    zzmcVar = zzmcVarZzv;
                    try {
                        zzmcVar.zzu.zzaW().zzd().zzb("app instance id encryption failed", e4.getMessage());
                        bArr = new byte[0];
                        zzpvVar = zzmcVar.f47639zzg;
                        zzpvVar.zzj().zzL();
                        return bArr;
                    } catch (Throwable th12) {
                        th = th12;
                    }
                }
            } else {
                zzmcVarZzv.zzu.zzaW().zzd().zzb("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            zzmcVar.f47639zzg.zzj().zzL();
            throw th;
        }
        zzmcVarZzv.zzu.zzaW().zzd().zzb("Log and bundle not available. package_name", str2);
        bArr2 = new byte[0];
        zzpvVar3.zzj().zzL();
        return bArr2;
    }
}
