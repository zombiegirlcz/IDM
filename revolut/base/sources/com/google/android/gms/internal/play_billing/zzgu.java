package com.google.android.gms.internal.play_billing;

import ch.qos.logback.core.util.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzgt f46061zza;

    private zzgu(zzir zzirVar, Object obj2, zzir zzirVar2, Object obj3) {
        this.f46061zza = new zzgt(zzirVar, "", zzirVar2, obj3);
    }

    public static int zzb(zzgt zzgtVar, Object obj2, Object obj3) {
        return zzfm.zza(zzgtVar.f46057zza, 1, obj2) + zzfm.zza(zzgtVar.f46059zzc, 2, obj3);
    }

    public static zzgu zzd(zzir zzirVar, Object obj2, zzir zzirVar2, Object obj3) {
        return new zzgu(zzirVar, "", zzirVar2, obj3);
    }

    public static void zze(zzfc zzfcVar, zzgt zzgtVar, Object obj2, Object obj3) throws IOException {
        zzfm.zzi(zzfcVar, zzgtVar.f46057zza, 1, obj2);
        zzfm.zzi(zzfcVar, zzgtVar.f46059zzc, 2, obj3);
    }

    public final int zza(int i, Object obj2, Object obj3) {
        zzgt zzgtVar = this.f46061zza;
        int iZzy = zzfc.zzy(i << 3);
        int iZzb = zzb(zzgtVar, obj2, obj3);
        return a.z(iZzb, iZzb, iZzy);
    }

    public final zzgt zzc() {
        return this.f46061zza;
    }
}
