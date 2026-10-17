package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes16.dex */
final class zzes extends zzei {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzdn f39419zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Level f39420zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Set f39421zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzea f39422zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(String str, @NullableDecl String str2, boolean z, zzdn zzdnVar, boolean z3, boolean z4) {
        super(str2);
        Level level = Level.ALL;
        Set set = zzeu.f39423zza;
        zzea zzeaVar = zzeu.f39424zzb;
        this.f39419zza = zzdnVar;
        this.f39420zzb = level;
        this.f39421zzc = set;
        this.f39422zzd = zzeaVar;
    }
}
