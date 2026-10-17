package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* JADX INFO: loaded from: classes16.dex */
final class zza extends AsyncTask {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Context f48430zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ ProviderInstaller.ProviderInstallListener f48431zzb;

    public zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.f48430zza = context;
        this.f48431zzb = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            ProviderInstaller.installIfNeeded(this.f48430zza);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.errorCode);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj2) {
        Integer num = (Integer) obj2;
        if (num.intValue() == 0) {
            this.f48431zzb.onProviderInstalled();
            return;
        }
        Context context = this.f48430zza;
        String str = ProviderInstaller.PROVIDER_NAME;
        this.f48431zzb.onProviderInstallFailed(num.intValue(), ProviderInstaller.f48426zza.getErrorResolutionIntent(context, num.intValue(), "pi"));
    }
}
