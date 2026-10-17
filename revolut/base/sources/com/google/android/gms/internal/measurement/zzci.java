package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzci {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final ThreadLocal f39896zza = new zzch();

    public static SharedPreferences zza(Context context, String str, int i, zzcc zzccVar) {
        zzbx.zza();
        zzcg zzcgVar = str.equals("") ? new zzcg() : null;
        if (zzcgVar != null) {
            return zzcgVar;
        }
        ThreadLocal threadLocal = f39896zza;
        Preconditions.checkArgument(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th10) {
            f39896zza.set(Boolean.TRUE);
            throw th10;
        }
    }
}
