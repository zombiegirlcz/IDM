package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfh f45993zza = new zzfh(true);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final /* synthetic */ int f45994zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static volatile boolean f45995zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f45996zzd;

    public zzfh() {
        this.f45996zzd = new HashMap();
    }

    public final zzft zza(zzhb zzhbVar, int i) {
        return (zzft) this.f45996zzd.get(new zzfg(zzhbVar, i));
    }

    public zzfh(boolean z) {
        this.f45996zzd = Collections.EMPTY_MAP;
    }
}
