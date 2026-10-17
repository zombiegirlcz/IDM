package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes16.dex */
public final class zzeu extends zzei {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Set f39423zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzea f39424zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zzer f39425zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f39426zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzdn f39427zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Level f39428zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Set f39429zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final zzea f39430zzh;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzdh.f39356zza, zzdm.f39375zza)));
        f39423zza = setUnmodifiableSet;
        f39424zzb = zzed.zza(setUnmodifiableSet).zzd();
        f39425zzc = new zzer();
    }

    public /* synthetic */ zzeu(String str, String str2, boolean z, zzdn zzdnVar, Level level, Set set, zzea zzeaVar, zzet zzetVar) {
        super(str2);
        if (str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        this.f39426zzd = strConcat.substring(0, Math.min(strConcat.length(), 23));
        this.f39427zze = zzdnVar;
        this.f39428zzf = level;
        this.f39429zzg = set;
        this.f39430zzh = zzeaVar;
    }

    public static zzer zzc() {
        return f39425zzc;
    }
}
