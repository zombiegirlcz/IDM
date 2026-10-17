package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.phone.SmsCodeBrowserClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class zzv extends GoogleApi implements SmsCodeBrowserClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Api.ClientKey f38810zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f38811zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Api f38812zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38810zza = clientKey;
        zzt zztVar = new zzt();
        f38811zzb = zztVar;
        f38812zzc = new Api("SmsCodeBrowser.API", zztVar, clientKey);
    }

    public zzv(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f38812zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeBrowserClient
    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(zzac.f38793zzb).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzh) ((zzw) obj2).getService()).zzf(new zzu(this.f38808zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(1566).build());
    }

    public zzv(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f38812zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
