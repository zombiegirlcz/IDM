package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.fido.zzw;
import com.google.android.gms.internal.fido.zzx;
import com.google.android.gms.internal.fido.zzy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class U2fApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Api.ClientKey f38672zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api f38673zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38672zza = clientKey;
        f38673zzb = new Api("Fido.U2F_API", new zzx(), clientKey);
    }

    public U2fApiClient(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f38673zzb, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    @NonNull
    public Task<U2fPendingIntent> getRegisterIntent(@NonNull final RegisterRequestParams registerRequestParams) {
        return doRead(TaskApiCall.builder().setMethodKey(5424).run(new RemoteCall() { // from class: com.google.android.gms.fido.u2f.zza
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzw) ((zzy) obj2).getService()).zzc(new zzc(this.f38748zza, (TaskCompletionSource) obj3), registerRequestParams);
            }
        }).build());
    }

    @NonNull
    public Task<U2fPendingIntent> getSignIntent(@NonNull final SignRequestParams signRequestParams) {
        return doRead(TaskApiCall.builder().setMethodKey(5425).run(new RemoteCall() { // from class: com.google.android.gms.fido.u2f.zzb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzw) ((zzy) obj2).getService()).zzd(new zzd(this.f38750zza, (TaskCompletionSource) obj3), signRequestParams);
            }
        }).build());
    }

    public U2fApiClient(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f38673zzb, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }
}
