package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
abstract class zza extends zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final int f38134zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final Bundle f38135zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f38136zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.f38136zzc = baseGmsClient;
        this.f38134zza = i;
        this.f38135zzb = bundle;
    }

    public abstract boolean zza();

    public abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zzc(Object obj2) {
        int i = this.f38134zza;
        if (i != 0) {
            this.f38136zzc.zzd(1, null);
            Bundle bundle = this.f38135zzb;
            zzb(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (zza()) {
                return;
            }
            this.f38136zzc.zzd(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }
}
