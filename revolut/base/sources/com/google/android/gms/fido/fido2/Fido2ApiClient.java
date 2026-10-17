package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public class Fido2ApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Api.ClientKey f38436zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api f38437zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38436zza = clientKey;
        f38437zzb = new Api("Fido.FIDO2_API", new com.google.android.gms.internal.fido.zzo(), clientKey);
    }

    @Deprecated
    public Fido2ApiClient(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f38437zzb, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @NonNull
    @Deprecated
    public Task<Fido2PendingIntent> getRegisterIntent(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(TaskApiCall.builder().setMethodKey(5409).run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj2).getService()).zzc(new zzh(this.f38643zza, (TaskCompletionSource) obj3), publicKeyCredentialCreationOptions);
            }
        }).build());
    }

    @NonNull
    public Task<PendingIntent> getRegisterPendingIntent(@NonNull final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zza
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj2).getService()).zzc(new zzf(this.f38641zza, (TaskCompletionSource) obj3), publicKeyCredentialCreationOptions);
            }
        }).setMethodKey(5407).build());
    }

    @NonNull
    @Deprecated
    public Task<Fido2PendingIntent> getSignIntent(@NonNull final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return doRead(TaskApiCall.builder().setMethodKey(5410).run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zze
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj2).getService()).zzd(new zzi(this.f38648zza, (TaskCompletionSource) obj3), publicKeyCredentialRequestOptions);
            }
        }).build());
    }

    @NonNull
    public Task<PendingIntent> getSignPendingIntent(@NonNull final PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj2).getService()).zzd(new zzg(this.f38645zza, (TaskCompletionSource) obj3), publicKeyCredentialRequestOptions);
            }
        }).setMethodKey(5408).build());
    }

    @NonNull
    public Task<Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj2).getService()).zze(new zzj(this.f38647zza, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.fido.zza.f38761zzh).setMethodKey(5411).build());
    }

    @Deprecated
    public Fido2ApiClient(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f38437zzb, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }
}
