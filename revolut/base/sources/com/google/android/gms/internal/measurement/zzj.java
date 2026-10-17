package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final Map f40300zza = new HashMap();

    public final void zza(String str, Callable callable) {
        this.f40300zza.put(str, callable);
    }
}
