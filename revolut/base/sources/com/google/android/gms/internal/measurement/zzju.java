package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzju implements zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzju f40335zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Context f40336zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ContentObserver f40337zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f40338zzd;

    private zzju() {
        this.f40338zzd = false;
        this.f40336zzb = null;
        this.f40337zzc = null;
    }

    public static zzju zza(Context context) {
        zzju zzjuVar;
        synchronized (zzju.class) {
            try {
                if (f40335zza == null) {
                    f40335zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzju(context) : new zzju();
                }
                zzju zzjuVar2 = f40335zza;
                if (zzjuVar2 != null && zzjuVar2.f40337zzc != null && !zzjuVar2.f40338zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjc.f40302zza, true, f40335zza.f40337zzc);
                        ((zzju) Preconditions.checkNotNull(f40335zza)).f40338zzd = true;
                    } catch (SecurityException e) {
                    }
                }
                zzjuVar = (zzju) Preconditions.checkNotNull(f40335zza);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zzjuVar;
    }

    public static synchronized void zze() {
        Context context;
        try {
            zzju zzjuVar = f40335zza;
            if (zzjuVar != null && (context = zzjuVar.f40336zzb) != null && zzjuVar.f40337zzc != null && zzjuVar.f40338zzd) {
                context.getContentResolver().unregisterContentObserver(f40335zza.f40337zzc);
            }
            f40335zza = null;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f40336zzb;
        if (context != null && !zzji.zza(context)) {
            try {
                return (String) zzjp.zza(new zzjq() { // from class: com.google.android.gms.internal.measurement.zzjs
                    @Override // com.google.android.gms.internal.measurement.zzjq
                    public final Object zza() {
                        return zzjb.zza(((Context) Preconditions.checkNotNull(this.f40333zza.f40336zzb)).getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                "Unable to read GServices for: ".concat(str);
            }
        }
        return null;
    }

    private zzju(Context context) {
        this.f40338zzd = false;
        this.f40336zzb = context;
        this.f40337zzc = new zzjt(this, null);
    }
}
