package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzlp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzlp f40428zza = new zzlp(true);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final /* synthetic */ int f40429zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static volatile boolean f40430zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static volatile zzlp f40431zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Map f40432zze;

    public zzlp() {
        this.f40432zze = new HashMap();
    }

    public static zzlp zza() {
        zzlp zzlpVar = f40431zzd;
        if (zzlpVar != null) {
            return zzlpVar;
        }
        synchronized (zzlp.class) {
            try {
                zzlp zzlpVar2 = f40431zzd;
                if (zzlpVar2 != null) {
                    return zzlpVar2;
                }
                int i = zznp.f40513zza;
                zzlp zzlpVarZzb = zzlx.zzb(zzlp.class);
                f40431zzd = zzlpVarZzb;
                return zzlpVarZzb;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final zzmc zzb(zznh zznhVar, int i) {
        return (zzmc) this.f40432zze.get(new zzlo(zznhVar, i));
    }

    public zzlp(boolean z) {
        this.f40432zze = Collections.EMPTY_MAP;
    }
}
