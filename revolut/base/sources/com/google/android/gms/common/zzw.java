package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes16.dex */
final class zzw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f38388zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f38389zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f38390zzc;

    public /* synthetic */ zzw(String str, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, byte[] bArr) {
        this.f38388zza = str;
        this.f38389zzb = z;
        this.f38390zzc = z6;
    }

    public final boolean zza() {
        return this.f38390zzc;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    public final zzp zzb(Context context) {
        return new zzp(this.f38388zza, this.f38389zzb, false, ObjectWrapper.wrap(context), false, true, false);
    }
}
