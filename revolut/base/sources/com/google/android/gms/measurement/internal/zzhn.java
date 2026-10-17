package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzht f47067zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47068zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f47069zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f47070zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f47071zze;

    public zzhn(zzht zzhtVar, String str, boolean z) {
        this.f47067zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.f47068zzb = str;
        this.f47069zzc = z;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor editorEdit = this.f47067zza.zzb().edit();
        editorEdit.putBoolean(this.f47068zzb, z);
        editorEdit.apply();
        this.f47071zze = z;
    }

    public final boolean zzb() {
        if (!this.f47070zzd) {
            this.f47070zzd = true;
            zzht zzhtVar = this.f47067zza;
            this.f47071zze = zzhtVar.zzb().getBoolean(this.f47068zzb, this.f47069zzc);
        }
        return this.f47071zze;
    }
}
