package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends zzz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private BaseGmsClient f38149zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f38150zzb;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.f38149zza = baseGmsClient;
        this.f38150zzb = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, Bundle bundle) {
        Preconditions.checkNotNull(this.f38149zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f38149zza.onPostInitHandler(i, iBinder, bundle, this.f38150zzb);
        this.f38149zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i, Bundle bundle) {
        new Exception();
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.f38149zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.zzc(zzjVar);
        onPostInitComplete(i, iBinder, zzjVar.f38157zza);
    }
}
