package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface zzap {

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzap f39833zzf = new zzau();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public static final zzap f39834zzg = new zzan();

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final zzap f39835zzh = new zzag("continue");

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public static final zzap f39836zzi = new zzag("break");

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public static final zzap f39837zzj = new zzag("return");

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    public static final zzap f39838zzk = new zzaf(Boolean.TRUE);

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    public static final zzap f39839zzl = new zzaf(Boolean.FALSE);
    public static final zzap zzm = new zzat("");

    zzap zzcz(String str, zzg zzgVar, List list);

    zzap zzd();

    Boolean zzg();

    Double zzh();

    String zzi();

    Iterator zzl();
}
