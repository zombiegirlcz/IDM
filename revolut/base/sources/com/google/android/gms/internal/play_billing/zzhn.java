package com.google.android.gms.internal.play_billing;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzhn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f46098zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzib f46099zzb;

    static {
        int i = zzei.f45956zza;
        f46099zzb = new zzid();
    }

    public static void zzA(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzB(i, list, z);
    }

    public static void zzB(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzD(i, list, z);
    }

    public static void zzC(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzF(i, list, z);
    }

    public static void zzD(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzK(i, list, z);
    }

    public static void zzE(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzM(i, list, z);
    }

    public static boolean zzF(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    @Deprecated
    public static int zza(int i, zzhb zzhbVar, zzhl zzhlVar) {
        int iZzy = zzfc.zzy(i << 3);
        return ((zzeg) zzhbVar).zzi(zzhlVar) + iZzy + iZzy;
    }

    public static int zzb(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzfc.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzfv zzfvVar = (zzfv) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzfc.zzz(zzfvVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfc.zzy(i << 3) + 4) * size;
    }

    public static int zzd(List list) {
        return list.size() * 4;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfc.zzy(i << 3) + 8) * size;
    }

    public static int zzf(List list) {
        return list.size() * 8;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzfc.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzfv zzfvVar = (zzfv) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzfc.zzz(zzfvVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzh(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgp)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzfc.zzz(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzz;
        }
        zzgp zzgpVar = (zzgp) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzfc.zzz(zzgpVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzi(int i, Object obj2, zzhl zzhlVar) {
        int i2 = i << 3;
        if (obj2 instanceof zzgi) {
            int iZzy = zzfc.zzy(i2);
            int iZza = ((zzgi) obj2).zza();
            return a.z(iZza, iZza, iZzy);
        }
        int iZzy2 = zzfc.zzy(i2);
        int iZzi = ((zzeg) obj2).zzi(zzhlVar);
        return a.z(iZzi, iZzi, iZzy2);
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int iZzy = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzy += zzfc.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzy;
        }
        zzfv zzfvVar = (zzfv) list;
        int iZzy2 = 0;
        while (i < size) {
            int iZze = zzfvVar.zze(i);
            iZzy2 += zzfc.zzy((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzy2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgp)) {
            int iZzz = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzz += zzfc.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzz;
        }
        zzgp zzgpVar = (zzgp) list;
        int iZzz2 = 0;
        while (i < size) {
            long jZze = zzgpVar.zze(i);
            iZzz2 += zzfc.zzz((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzz2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int iZzy = 0;
            while (i < size) {
                iZzy += zzfc.zzy(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzy;
        }
        zzfv zzfvVar = (zzfv) list;
        int iZzy2 = 0;
        while (i < size) {
            iZzy2 += zzfc.zzy(zzfvVar.zze(i));
            i++;
        }
        return iZzy2;
    }

    public static int zzm(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgp)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzfc.zzz(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzz;
        }
        zzgp zzgpVar = (zzgp) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzfc.zzz(zzgpVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static zzib zzn() {
        return f46099zzb;
    }

    public static Object zzo(Object obj2, int i, int i2, Object obj3, zzib zzibVar) {
        if (obj3 == null) {
            obj3 = zzibVar.zza(obj2);
        }
        ((zzic) obj3).zzj(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void zzp(zzfi zzfiVar, Object obj2, Object obj3) {
        if (((zzfr) obj3).f46020zzb.f45999zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzib zzibVar, Object obj2, Object obj3) {
        zzfu zzfuVar = (zzfu) obj2;
        zzic zzicVarZze = zzfuVar.f46022zzc;
        zzic zzicVar = ((zzfu) obj3).f46022zzc;
        if (!zzic.zzc().equals(zzicVar)) {
            if (zzic.zzc().equals(zzicVarZze)) {
                zzicVarZze = zzic.zze(zzicVarZze, zzicVar);
            } else {
                zzicVarZze.zzd(zzicVar);
            }
        }
        zzfuVar.f46022zzc = zzicVarZze;
    }

    public static void zzr(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzg(i, list, z);
    }

    public static void zzt(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzj(i, list, z);
    }

    public static void zzu(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzl(i, list, z);
    }

    public static void zzv(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzn(i, list, z);
    }

    public static void zzw(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzp(i, list, z);
    }

    public static void zzx(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzs(i, list, z);
    }

    public static void zzy(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzu(i, list, z);
    }

    public static void zzz(int i, List list, zzit zzitVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzz(i, list, z);
    }
}
