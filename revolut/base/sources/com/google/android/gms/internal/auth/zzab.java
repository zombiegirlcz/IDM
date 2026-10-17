package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzab extends GoogleApi implements zzg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Api.ClientKey f38864zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f38865zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Api f38866zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Logger f38867zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Context f38868zze;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f38864zza = clientKey;
        zzv zzvVar = new zzv();
        f38865zzb = zzvVar;
        f38866zzc = new Api("GoogleAuthService.API", zzvVar, clientKey);
        f38867zzd = com.google.android.gms.auth.zzd.zza("GoogleAuthServiceClient");
    }

    public zzab(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f38866zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f38868zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj2, TaskCompletionSource taskCompletionSource) {
        if (TaskUtil.trySetResultOrApiException(status, obj2, taskCompletionSource)) {
            return;
        }
        f38867zzd.w("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.f37551zzl).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzab zzabVar = this.f39194zza;
                ((zzp) ((zzi) obj2).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj3), zzbwVar);
            }
        }).setMethodKey(1513).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(@NonNull final AccountChangeEventsRequest accountChangeEventsRequest) {
        Preconditions.checkNotNull(accountChangeEventsRequest, "request cannot be null.");
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.f37550zzk).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzab zzabVar = this.f39196zza;
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((zzp) ((zzi) obj2).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj3), accountChangeEventsRequest2);
            }
        }).setMethodKey(1515).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(@NonNull final Account account, @NonNull final String str, final Bundle bundle) {
        Preconditions.checkNotNull(account, "Account name cannot be null!");
        Preconditions.checkNotEmpty(str, "Scope cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.f37551zzl).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzab zzabVar = this.f39190zza;
                ((zzp) ((zzi) obj2).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj3), account, str, bundle);
            }
        }).setMethodKey(1512).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(@NonNull final Account account) {
        Preconditions.checkNotNull(account, "account cannot be null.");
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.f37550zzk).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzab zzabVar = this.f39188zza;
                ((zzp) ((zzi) obj2).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj3), account);
            }
        }).setMethodKey(1517).build());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(@NonNull final String str) {
        Preconditions.checkNotNull(str, "Client package name cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.auth.zze.f37550zzk).run(new RemoteCall() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzab zzabVar = this.f39186zza;
                ((zzp) ((zzi) obj2).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj3), str);
            }
        }).setMethodKey(1514).build());
    }
}
