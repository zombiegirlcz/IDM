package com.google.android.gms.internal.fido;

import java.util.Collections;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Comparator f39450zza = new zzfa();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Comparator f39451zzb = new zzfb();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzfi f39452zzc = new zzfi(new zzfg(Collections.EMPTY_LIST));

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzfg f39453zzd;

    private zzfi(zzfg zzfgVar) {
        this.f39453zzd = zzfgVar;
    }

    public static zzfi zza() {
        return f39452zzc;
    }

    public final boolean equals(@NullableDecl Object obj2) {
        return (obj2 instanceof zzfi) && ((zzfi) obj2).f39453zzd.equals(this.f39453zzd);
    }

    public final int hashCode() {
        return ~this.f39453zzd.hashCode();
    }

    public final String toString() {
        return this.f39453zzd.toString();
    }
}
