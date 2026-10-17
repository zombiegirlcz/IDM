package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhe extends zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private char f47034zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private long f47035zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private String f47036zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzhc f47037zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzhc f47038zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzhc f47039zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final zzhc f47040zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final zzhc f47041zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final zzhc f47042zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final zzhc f47043zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final zzhc f47044zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final zzhc f47045zzl;

    public zzhe(zzio zzioVar) {
        super(zzioVar);
        this.f47034zza = (char) 0;
        this.f47035zzb = -1L;
        this.f47037zzd = new zzhc(this, 6, false, false);
        this.f47038zze = new zzhc(this, 6, true, false);
        this.f47039zzf = new zzhc(this, 6, false, true);
        this.f47040zzg = new zzhc(this, 5, false, false);
        this.f47041zzh = new zzhc(this, 5, true, false);
        this.f47042zzi = new zzhc(this, 5, false, true);
        this.f47043zzj = new zzhc(this, 4, false, false);
        this.f47044zzk = new zzhc(this, 3, false, false);
        this.f47045zzl = new zzhc(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzhd(str);
    }

    public static String zzo(boolean z, String str, Object obj2, Object obj3, Object obj4) {
        String strZzp = zzp(z, obj2);
        String strZzp2 = zzp(z, obj3);
        String strZzp3 = zzp(z, obj4);
        StringBuilder sb6 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb6.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZzp)) {
            sb6.append(str2);
            sb6.append(strZzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZzp2)) {
            str3 = str2;
        } else {
            sb6.append(str2);
            sb6.append(strZzp2);
        }
        if (!TextUtils.isEmpty(strZzp3)) {
            sb6.append(str3);
            sb6.append(strZzp3);
        }
        return sb6.toString();
    }

    public static String zzp(boolean z, Object obj2) {
        String className;
        if (obj2 == null) {
            return "";
        }
        if (obj2 instanceof Integer) {
            obj2 = Long.valueOf(((Integer) obj2).intValue());
        }
        int i = 0;
        if (obj2 instanceof Long) {
            if (!z) {
                return obj2.toString();
            }
            Long l2 = (Long) obj2;
            if (Math.abs(l2.longValue()) < 100) {
                return obj2.toString();
            }
            char cCharAt = obj2.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb6 = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            sb6.append(str);
            sb6.append(jRound);
            sb6.append("...");
            sb6.append(str);
            sb6.append(jRound2);
            return sb6.toString();
        }
        if (obj2 instanceof Boolean) {
            return obj2.toString();
        }
        if (!(obj2 instanceof Throwable)) {
            return obj2 instanceof zzhd ? ((zzhd) obj2).f47033zza : z ? "-" : obj2.toString();
        }
        Throwable th10 = (Throwable) obj2;
        StringBuilder sb9 = new StringBuilder(z ? th10.getClass().getName() : th10.toString());
        String strZzq = zzq(zzio.class.getCanonicalName());
        StackTraceElement[] stackTrace = th10.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(strZzq)) {
                sb9.append(": ");
                sb9.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb9.toString();
    }

    public static String zzq(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final boolean zzc() {
        return false;
    }

    public final zzhc zzd() {
        return this.f47044zzk;
    }

    public final zzhc zze() {
        return this.f47037zzd;
    }

    public final zzhc zzf() {
        return this.f47039zzf;
    }

    public final zzhc zzh() {
        return this.f47038zze;
    }

    public final zzhc zzi() {
        return this.f47043zzj;
    }

    public final zzhc zzj() {
        return this.f47045zzl;
    }

    public final zzhc zzk() {
        return this.f47040zzg;
    }

    public final zzhc zzl() {
        return this.f47042zzi;
    }

    public final zzhc zzm() {
        return this.f47041zzh;
    }

    public final String zzr() {
        String str;
        synchronized (this) {
            try {
                if (this.f47036zzc == null) {
                    zzio zzioVar = this.zzu;
                    if (zzioVar.zzz() != null) {
                        this.f47036zzc = zzioVar.zzz();
                    } else {
                        this.f47036zzc = this.zzu.zzf().zzq();
                    }
                }
                Preconditions.checkNotNull(this.f47036zzc);
                str = this.f47036zzc;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return str;
    }

    public final void zzu(int i, boolean z, boolean z3, String str, Object obj2, Object obj3, Object obj4) {
        if (!z && Log.isLoggable(zzr(), i)) {
            zzo(false, str, obj2, obj3, obj4);
            zzr();
        }
        if (z3 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzil zzilVarZzo = this.zzu.zzo();
        if (zzilVarZzo == null) {
            zzr();
        } else {
            if (!zzilVarZzo.zzy()) {
                zzr();
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzilVarZzo.zzq(new zzhb(this, i, str, obj2, obj3, obj4));
        }
    }
}
