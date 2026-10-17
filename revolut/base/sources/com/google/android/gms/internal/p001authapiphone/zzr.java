package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class zzr extends GoogleApi implements SmsCodeAutofillClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Api.ClientKey f38805zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f38806zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Api f38807zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38805zza = clientKey;
        zzn zznVar = new zzn();
        f38806zzb = zznVar;
        f38807zzc = new Api("SmsCodeAutofill.API", zznVar, clientKey);
    }

    public zzr(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f38807zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Integer> checkPermissionState() {
        return doRead(TaskApiCall.builder().setFeatures(zzac.f38792zza).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzh) ((zzw) obj2).getService()).zzc(new zzp(this.f38798zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(1564).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(TaskApiCall.builder().setFeatures(zzac.f38792zza).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzh) ((zzw) obj2).getService()).zzd(str, new zzq(this.f38799zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(1565).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(zzac.f38792zza).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzh) ((zzw) obj2).getService()).zze(new zzo(this.f38801zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(1563).build());
    }

    public zzr(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f38807zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
