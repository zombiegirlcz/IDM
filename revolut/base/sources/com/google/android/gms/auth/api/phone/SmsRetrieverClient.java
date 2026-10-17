package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes16.dex */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Api.ClientKey f37458zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f37459zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Api f37460zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f37458zza = clientKey;
        zza zzaVar = new zza();
        f37459zzb = zzaVar;
        f37460zzc = new Api("SmsRetriever.API", zzaVar, clientKey);
    }

    public SmsRetrieverClient(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f37460zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    @NonNull
    public abstract Task<Void> startSmsRetriever();

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    @NonNull
    public abstract Task<Void> startSmsUserConsent(String str);

    public SmsRetrieverClient(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f37460zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
