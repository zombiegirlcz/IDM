package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final String f47081zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzht f47082zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f47083zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f47084zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final long f47085zze;

    public /* synthetic */ zzhq(zzht zzhtVar, String str, long j2, zzhs zzhsVar) {
        this.f47082zzb = zzhtVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j2 > 0);
        this.f47081zza = "health_monitor:start";
        this.f47083zzc = "health_monitor:count";
        this.f47084zzd = "health_monitor:value";
        this.f47085zze = j2;
    }

    private final long zzc() {
        return this.f47082zzb.zzb().getLong(this.f47081zza, 0L);
    }

    private final void zzd() {
        zzht zzhtVar = this.f47082zzb;
        zzhtVar.zzg();
        long jCurrentTimeMillis = zzhtVar.zzu.zzaU().currentTimeMillis();
        SharedPreferences.Editor editorEdit = zzhtVar.zzb().edit();
        editorEdit.remove(this.f47083zzc);
        editorEdit.remove(this.f47084zzd);
        editorEdit.putLong(this.f47081zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public final Pair zza() {
        long jAbs;
        zzht zzhtVar = this.f47082zzb;
        zzhtVar.zzg();
        zzhtVar.zzg();
        long jZzc = zzc();
        if (jZzc == 0) {
            zzd();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jZzc - zzhtVar.zzu.zzaU().currentTimeMillis());
        }
        long j2 = this.f47085zze;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > j2 + j2) {
            zzd();
            return null;
        }
        String string = zzhtVar.zzb().getString(this.f47084zzd, null);
        long j3 = zzhtVar.zzb().getLong(this.f47083zzc, 0L);
        zzd();
        return (string == null || j3 <= 0) ? zzht.f47090zza : new Pair(string, Long.valueOf(j3));
    }

    public final void zzb(String str, long j2) {
        zzht zzhtVar = this.f47082zzb;
        zzhtVar.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesZzb = zzhtVar.zzb();
        String str2 = this.f47083zzc;
        long j3 = sharedPreferencesZzb.getLong(str2, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor editorEdit = zzhtVar.zzb().edit();
            editorEdit.putString(this.f47084zzd, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = zzhtVar.zzu.zzw().zzJ().nextLong() & Long.MAX_VALUE;
        long j5 = j3 + 1;
        long j16 = Long.MAX_VALUE / j5;
        SharedPreferences.Editor editorEdit2 = zzhtVar.zzb().edit();
        if (jNextLong < j16) {
            editorEdit2.putString(this.f47084zzd, str);
        }
        editorEdit2.putLong(str2, j5);
        editorEdit2.apply();
    }
}
