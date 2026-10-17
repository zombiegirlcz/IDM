package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzht f47076zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47077zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final long f47078zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f47079zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private long f47080zze;

    public zzhp(zzht zzhtVar, String str, long j2) {
        this.f47076zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.f47077zzb = str;
        this.f47078zzc = j2;
    }

    public final long zza() {
        if (!this.f47079zzd) {
            this.f47079zzd = true;
            zzht zzhtVar = this.f47076zza;
            this.f47080zze = zzhtVar.zzb().getLong(this.f47077zzb, this.f47078zzc);
        }
        return this.f47080zze;
    }

    public final void zzb(long j2) {
        SharedPreferences.Editor editorEdit = this.f47076zza.zzb().edit();
        editorEdit.putLong(this.f47077zzb, j2);
        editorEdit.apply();
        this.f47080zze = j2;
    }
}
