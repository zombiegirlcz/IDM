package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;

/* JADX INFO: loaded from: classes16.dex */
final class zzco implements zzcl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzco f38953zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Context f38954zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ContentObserver f38955zzc;

    private zzco() {
        this.f38954zzb = null;
        this.f38955zzc = null;
    }

    public static zzco zza(Context context) {
        zzco zzcoVar;
        synchronized (zzco.class) {
            try {
                if (f38953zza == null) {
                    f38953zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
                }
                zzcoVar = f38953zza;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zzcoVar;
    }

    public static synchronized void zze() {
        Context context;
        try {
            zzco zzcoVar = f38953zza;
            if (zzcoVar != null && (context = zzcoVar.f38954zzb) != null && zzcoVar.f38955zzc != null) {
                context.getContentResolver().unregisterContentObserver(f38953zza.f38955zzc);
            }
            f38953zza = null;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.f38954zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                    @Override // com.google.android.gms.internal.auth.zzck
                    public final Object zza() {
                        return this.f38951zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.f38954zzb.getContentResolver(), str, null);
    }

    private zzco(Context context) {
        this.f38954zzb = context;
        zzcn zzcnVar = new zzcn(this, null);
        this.f38955zzc = zzcnVar;
        context.getContentResolver().registerContentObserver(zzcb.f38923zza, true, zzcnVar);
    }
}
