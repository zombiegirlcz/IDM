package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
public class zzy {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final zzy f38392zze = new zzy(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final boolean f38393zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final String f38394zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final Throwable f38395zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final int f38396zzd;

    private zzy(boolean z, int i, int i2, String str, Throwable th10, long j2) {
        this.f38393zza = z;
        this.f38396zzd = i;
        this.f38394zzb = str;
        this.f38395zzc = th10;
    }

    @Deprecated
    public static zzy zzb() {
        return f38392zze;
    }

    public static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    public static zzy zzd(@NonNull String str, @NonNull Throwable th10) {
        return new zzy(false, 1, 5, str, th10, -1L);
    }

    public static zzy zzf(int i, long j2) {
        return new zzy(true, i, 1, null, null, j2);
    }

    public static zzy zzg(int i, int i2, @NonNull String str, Throwable th10) {
        return new zzy(false, i, i2, str, th10, -1L);
    }

    public String zza() {
        return this.f38394zzb;
    }

    public final void zze() {
        if (this.f38393zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f38395zzc != null) {
            zza();
        } else {
            zza();
        }
    }

    public /* synthetic */ zzy(boolean z, int i, int i2, String str, Throwable th10, long j2, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
