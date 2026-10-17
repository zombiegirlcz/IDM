package com.google.android.gms.internal.fido;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes16.dex */
final class zzee {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzeg f39393zza = zzb(zzeg.f39397zzd);

    private static zzeg zzb(String[] strArr) {
        zzeg zzegVarZza;
        try {
            zzegVarZza = zzeh.zza();
        } catch (NoClassDefFoundError unused) {
            zzegVarZza = null;
        }
        if (zzegVarZza != null) {
            return zzegVarZza;
        }
        StringBuilder sb6 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzeg) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th10) {
                th = th10;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb6.append('\n');
                sb6.append(str);
                sb6.append(": ");
                sb6.append(th);
            }
        }
        throw new IllegalStateException(sb6.insert(0, "No logging platforms found:").toString());
    }
}
