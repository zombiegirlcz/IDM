package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzht f47086zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47087zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f47088zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private String f47089zzd;

    public zzhr(zzht zzhtVar, String str, String str2) {
        this.f47086zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.f47087zzb = str;
    }

    public final String zza() {
        if (!this.f47088zzc) {
            this.f47088zzc = true;
            zzht zzhtVar = this.f47086zza;
            this.f47089zzd = zzhtVar.zzb().getString(this.f47087zzb, null);
        }
        return this.f47089zzd;
    }

    public final void zzb(String str) {
        SharedPreferences.Editor editorEdit = this.f47086zza.zzb().edit();
        editorEdit.putString(this.f47087zzb, str);
        editorEdit.apply();
        this.f47089zzd = str;
    }
}
