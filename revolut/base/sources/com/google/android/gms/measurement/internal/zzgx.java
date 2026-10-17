package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected static final AtomicReference f47001zza = new AtomicReference();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    protected static final AtomicReference f47002zzb = new AtomicReference();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    protected static final AtomicReference f47003zzc = new AtomicReference();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzgw f47004zzd;

    public zzgx(zzgw zzgwVar) {
        this.f47004zzd = zzgwVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbS = a.s("[");
        for (Object obj2 : objArr) {
            String strZzb = obj2 instanceof Bundle ? zzb((Bundle) obj2) : String.valueOf(obj2);
            if (strZzb != null) {
                if (sbS.length() != 1) {
                    sbS.append(", ");
                }
                sbS.append(strZzb);
            }
        }
        sbS.append("]");
        return sbS.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f47004zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbS = a.s("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbS.length() != 8) {
                sbS.append(", ");
            }
            sbS.append(zze(str));
            sbS.append("=");
            Object obj2 = bundle.get(str);
            sbS.append(obj2 instanceof Bundle ? zza(new Object[]{obj2}) : obj2 instanceof Object[] ? zza((Object[]) obj2) : obj2 instanceof ArrayList ? zza(((ArrayList) obj2).toArray()) : String.valueOf(obj2));
        }
        sbS.append("}]");
        return sbS.toString();
    }

    public final String zzc(zzbh zzbhVar) {
        zzgw zzgwVar = this.f47004zzd;
        if (!zzgwVar.zza()) {
            return zzbhVar.toString();
        }
        StringBuilder sb6 = new StringBuilder("origin=");
        sb6.append(zzbhVar.f46953zzc);
        sb6.append(",name=");
        sb6.append(zzd(zzbhVar.f46951zza));
        sb6.append(",params=");
        zzbf zzbfVar = zzbhVar.f46952zzb;
        sb6.append(zzbfVar == null ? null : !zzgwVar.zza() ? zzbfVar.toString() : zzb(zzbfVar.zzc()));
        return sb6.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.f47004zzd.zza() ? str : zzg(str, zzjy.f47273zzc, zzjy.f47271zza, f47001zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.f47004zzd.zza() ? str : zzg(str, zzjz.f47276zzb, zzjz.f47275zza, f47002zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.f47004zzd.zza() ? str : str.startsWith("_exp_") ? a.p("experiment_id(", str, ")") : zzg(str, zzka.f47284zzb, zzka.f47283zza, f47003zzc);
    }
}
