package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzag extends GoogleApi implements TapAndPayClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f46303zza = 0;

    public zzag(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) TapAndPay.f48472zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PushProvisionSessionContext> createPushProvisionSession(final CreatePushProvisionSessionRequest createPushProvisionSessionRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzag zzagVar = this.f46342zza;
                ((zzd) ((zzaj) obj2).getService()).zzd(createPushProvisionSessionRequest, new zzz(zzagVar, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzo).setMethodKey(2107).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void createWallet(final Activity activity, final int i) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zze(new zzai(activity, i));
            }
        }).setMethodKey(2112).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getActiveWalletId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzf(new zzy(this.f46366zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(2103).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getEnvironment() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzg(new zzab(this.f46367zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(2110).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getLinkingToken(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzag zzagVar = this.f46338zza;
                ((zzd) ((zzaj) obj2).getService()).zzh(str, new zzac(zzagVar, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.f48739zzb).setMethodKey(2111).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getStableHardwareId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzi(new zzaa(this.f46352zza, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(2109).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<TokenStatus> getTokenStatus(final int i, final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzag zzagVar = this.f46333zza;
                ((zzd) ((zzaj) obj2).getService()).zzj(i, str, new zzx(zzagVar, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(2102).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Boolean> isTokenized(final IsTokenizedRequest isTokenizedRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzag zzagVar = this.f46336zza;
                ((zzd) ((zzaj) obj2).getService()).zzk(isTokenizedRequest, new zzae(zzagVar, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzz).setMethodKey(2164).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<List<TokenInfo>> listTokens() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzl(new zzad(this.f46347zza, (TaskCompletionSource) obj3));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzz).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void pushTokenize(final Activity activity, final PushTokenizeRequest pushTokenizeRequest, final int i) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzm(pushTokenizeRequest, new zzai(activity, i));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> registerDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(dataChangedListener, "tapAndPayDataChangedListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzn(new com.google.android.gms.tapandpay.zzd(null, listenerHolderRegisterListener));
                ((TaskCompletionSource) obj3).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
            }
        }).setMethodKey(2155).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> removeDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        return TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(ListenerHolders.createListenerKey(dataChangedListener, "tapAndPayDataChangedListener"), 2152));
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void requestDeleteToken(final Activity activity, final String str, final int i, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzo(i, str, new zzai(activity, i2));
            }
        }).setMethodKey(2104).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void requestSelectToken(final Activity activity, final String str, final int i, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzp(i, str, new zzai(activity, i2));
            }
        }).setMethodKey(2105).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void serverPushProvision(final Activity activity, final ServerPushProvisionRequest serverPushProvisionRequest, final int i) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzq(serverPushProvisionRequest, new zzai(activity, i));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzo).setMethodKey(2108).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void tokenize(final Activity activity, final String str, final int i, final String str2, final int i2, final int i3) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzd) ((zzaj) obj2).getService()).zzr(i, str, str2, i2, new zzai(activity, i3));
            }
        }).setMethodKey(2101).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PendingIntent> viewToken(final ViewTokenRequest viewTokenRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzag zzagVar = this.f46340zza;
                ((zzd) ((zzaj) obj2).getService()).zzs(viewTokenRequest, new zzaf(zzagVar, (TaskCompletionSource) obj3));
            }
        }).setMethodKey(2160).setFeatures(com.google.android.gms.tapandpay.zza.f48749zzl).build());
    }

    public zzag(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) TapAndPay.f48472zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
