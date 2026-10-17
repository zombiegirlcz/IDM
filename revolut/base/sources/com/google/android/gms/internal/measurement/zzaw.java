package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzaw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final List f39847zza = new ArrayList();

    public abstract zzap zza(String str, zzg zzgVar, List list);

    public final zzap zzb(String str) {
        if (this.f39847zza.contains(zzh.zze(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
