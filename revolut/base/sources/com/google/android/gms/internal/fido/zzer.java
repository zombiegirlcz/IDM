package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes16.dex */
public final class zzer implements zzek {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39414zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzdn f39415zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Level f39416zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Set f39417zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzea f39418zze;

    private zzer(String str, boolean z, zzdn zzdnVar, Level level, boolean z3, Set set, zzea zzeaVar) {
        this.f39414zza = "";
        this.f39415zzb = zzdnVar;
        this.f39416zzc = level;
        this.f39417zzd = set;
        this.f39418zze = zzeaVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzeu(this.f39414zza, str, true, this.f39415zzb, this.f39416zzc, this.f39417zzd, this.f39418zze, null);
    }

    public final zzer zzb(boolean z) {
        Set set = this.f39417zzd;
        zzea zzeaVar = this.f39418zze;
        return new zzer(this.f39414zza, true, this.f39415zzb, Level.OFF, false, set, zzeaVar);
    }

    private zzer() {
        this("", true, zzdo.NO_OP, Level.ALL, false, zzeu.f39423zza, zzeu.f39424zzb);
    }
}
