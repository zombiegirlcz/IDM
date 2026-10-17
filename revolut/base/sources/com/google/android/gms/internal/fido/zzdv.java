package com.google.android.gms.internal.fido;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdz f39381zza = new zzds();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdy f39382zzb = new zzdt();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzdz f39385zze;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f39383zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f39384zzd = new HashMap();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzdy f39386zzf = null;

    public final zzdv zza(zzdy zzdyVar) {
        this.f39386zzf = zzdyVar;
        return this;
    }

    public final zzea zzd() {
        return new zzdx(this, null);
    }

    public final void zzg(zzdk zzdkVar) {
        zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            zzdz zzdzVar = f39381zza;
            zzfk.zza(zzdkVar, "key");
            this.f39384zzd.remove(zzdkVar);
            this.f39383zzc.put(zzdkVar, zzdzVar);
            return;
        }
        zzdy zzdyVar = f39382zzb;
        zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.f39383zzc.remove(zzdkVar);
        this.f39384zzd.put(zzdkVar, zzdyVar);
    }
}
