package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Context f47695zza;

    public zzpw(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f47695zza = applicationContext;
    }
}
