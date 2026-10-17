package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
final class zzlk implements zzqe {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlw f47368zza;

    public zzlk(zzlw zzlwVar) {
        this.f47368zza = zzlwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzqe
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f47368zza.zzO("auto", "_err", bundle);
        } else {
            this.f47368zza.zzQ("auto", "_err", bundle, str);
        }
    }
}
