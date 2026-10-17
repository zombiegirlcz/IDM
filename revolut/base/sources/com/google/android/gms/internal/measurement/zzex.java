package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzex extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Bundle f40014zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Activity f40015zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzfe f40016zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfe zzfeVar, Bundle bundle, Activity activity) {
        super(zzfeVar.f40034zza, true);
        this.f40014zza = bundle;
        this.f40015zzb = activity;
        this.f40016zzc = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        Bundle bundle;
        Bundle bundle2 = this.f40014zza;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj2 = bundle2.get("com.google.app_measurement.screen_service");
                if (obj2 instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj2);
                }
            }
        } else {
            bundle = null;
        }
        zzcv zzcvVar = (zzcv) Preconditions.checkNotNull(this.f40016zzc.f40034zza.f40044zzj);
        Activity activity = this.f40015zzb;
        zzcvVar.onActivityCreatedByScionActivityInfo(zzdj.zza(activity), bundle, this.f40009zzi);
    }
}
