package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zznn;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbh extends GoogleApi implements MessagesClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f48132zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api.ClientKey f48133zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f48134zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Api f48135zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final int f48136zze;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f48133zzb = clientKey;
        zzav zzavVar = new zzav();
        f48134zzc = zzavVar;
        f48135zzd = new Api("Nearby.MESSAGES_API", zzavVar, clientKey);
    }

    public zzbh(Activity activity, MessagesOptions messagesOptions) {
        super(activity, (Api<MessagesOptions>) f48135zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f48136zze = 1;
        activity.getApplication().registerActivityLifecycleCallbacks(new zzbb(activity, this, null));
    }

    public static /* bridge */ /* synthetic */ void zza(zzbh zzbhVar, int i) {
        final int i2 = 1;
        zzbhVar.zzl(new zzbc(i2) { // from class: com.google.android.gms.nearby.messages.internal.zzal
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                int i3 = zzbh.f48132zza;
                zzaiVar.zzr(1);
            }
        }, 0);
    }

    private final ListenerHolder zzh(Object obj2) {
        if (obj2 == null) {
            return null;
        }
        return registerListener(obj2, obj2.getClass().getName());
    }

    private final ListenerHolder zzi(TaskCompletionSource taskCompletionSource) {
        return registerListener(new zzay(this, taskCompletionSource), Status.class.getName());
    }

    private final Task zzj(ListenerHolder listenerHolder, final zzbc zzbcVar, final zzbc zzbcVar2, int i) {
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.nearby.messages.internal.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                this.f48116zza.zzd(zzbcVar, (zzai) obj2, (TaskCompletionSource) obj3);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.nearby.messages.internal.zzau
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                this.f48118zza.zzc(zzbcVar2, (zzai) obj2, (TaskCompletionSource) obj3);
            }
        }).setMethodKey(i).build());
    }

    private final Task zzk(Object obj2, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Preconditions.checkNotNull(obj2);
        doUnregisterEventListener(ListenerHolders.createListenerKey(obj2, obj2.getClass().getName()), i).addOnCompleteListener(new zzaz(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private final Task zzl(final zzbc zzbcVar, int i) {
        return doWrite(TaskApiCall.builder().setMethodKey(i).run(new RemoteCall() { // from class: com.google.android.gms.nearby.messages.internal.zzas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                this.f48114zza.zzg(zzbcVar, (zzai) obj2, (TaskCompletionSource) obj3);
            }
        }).build());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            String str = ((MessagesOptions) getApiOptions()).f48031zze;
        }
        return builderCreateClientSettingsBuilder;
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final void handleIntent(Intent intent, MessageListener messageListener) {
        zznn.zzb(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> publish(Message message) {
        PublishOptions publishOptions = PublishOptions.DEFAULT;
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderZzh = zzh(message);
        return zzj(listenerHolderZzh, new zzam(this, message, new zzaw(this, zzh(publishOptions.getCallback()), listenerHolderZzh), publishOptions), new zzan(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> registerStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        final ListenerHolder listenerHolderZzh = zzh(statusCallback);
        return zzj(listenerHolderZzh, new zzbc() { // from class: com.google.android.gms.nearby.messages.internal.zzao
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                int i = zzbh.f48132zza;
                zzaiVar.zzu(listenerHolder, listenerHolderZzh);
            }
        }, new zzbc() { // from class: com.google.android.gms.nearby.messages.internal.zzap
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                int i = zzbh.f48132zza;
                zzaiVar.zzA(listenerHolder, listenerHolderZzh);
            }
        }, 1270);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(PendingIntent pendingIntent) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderZzh = zzh(subscribeOptions.getCallback());
        return zzl(new zzak(this, pendingIntent, listenerHolderZzh == null ? null : new zzbg(listenerHolderZzh), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unpublish(Message message) {
        Preconditions.checkNotNull(message);
        return zzk(message, 1290);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unregisterStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return zzk(statusCallback, 1271);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unsubscribe(final PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        return zzl(new zzbc() { // from class: com.google.android.gms.nearby.messages.internal.zzaj
            @Override // com.google.android.gms.nearby.messages.internal.zzbc
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                int i = zzbh.f48132zza;
                zzaiVar.zzB(listenerHolder, pendingIntent);
            }
        }, 1287);
    }

    public final /* synthetic */ void zzb(Message message, zzbe zzbeVar, PublishOptions publishOptions, zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        zzaiVar.zzt(listenerHolder, zzae.zza(message), zzbeVar, publishOptions, this.f48136zze);
    }

    public final /* synthetic */ void zzc(zzbc zzbcVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbcVar.zza(zzaiVar, zzi(taskCompletionSource));
    }

    public final /* synthetic */ void zzd(zzbc zzbcVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbcVar.zza(zzaiVar, zzi(taskCompletionSource));
    }

    public final /* synthetic */ void zze(ListenerHolder listenerHolder, zzbg zzbgVar, SubscribeOptions subscribeOptions, zzai zzaiVar, ListenerHolder listenerHolder2) throws RemoteException {
        zzaiVar.zzy(listenerHolder2, listenerHolder, zzbgVar, subscribeOptions, null, this.f48136zze);
    }

    public final /* synthetic */ void zzf(PendingIntent pendingIntent, zzbg zzbgVar, SubscribeOptions subscribeOptions, zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        zzaiVar.zzw(listenerHolder, pendingIntent, zzbgVar, subscribeOptions, this.f48136zze);
    }

    public final /* synthetic */ void zzg(zzbc zzbcVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbcVar.zza(zzaiVar, zzi(taskCompletionSource));
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unsubscribe(MessageListener messageListener) {
        Preconditions.checkNotNull(messageListener);
        return zzk(messageListener, 1286);
    }

    public zzbh(Context context, MessagesOptions messagesOptions) {
        super(context, (Api<MessagesOptions>) f48135zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f48136zze = zzai.zzp(context);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> publish(Message message, PublishOptions publishOptions) {
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderZzh = zzh(message);
        return zzj(listenerHolderZzh, new zzam(this, message, new zzaw(this, zzh(publishOptions.getCallback()), listenerHolderZzh), publishOptions), new zzan(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(PendingIntent pendingIntent, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderZzh = zzh(subscribeOptions.getCallback());
        return zzl(new zzak(this, pendingIntent, listenerHolderZzh == null ? null : new zzbg(listenerHolderZzh), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(MessageListener messageListener) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderZzh = zzh(messageListener);
        ListenerHolder listenerHolderZzh2 = zzh(subscribeOptions.getCallback());
        return zzj(listenerHolderZzh, new zzaq(this, listenerHolderZzh, new zzax(this, listenerHolderZzh2, listenerHolderZzh2), subscribeOptions), new zzar(listenerHolderZzh), 1289);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(MessageListener messageListener, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderZzh = zzh(messageListener);
        ListenerHolder listenerHolderZzh2 = zzh(subscribeOptions.getCallback());
        return zzj(listenerHolderZzh, new zzaq(this, listenerHolderZzh, new zzax(this, listenerHolderZzh2, listenerHolderZzh2), subscribeOptions), new zzar(listenerHolderZzh), 1289);
    }
}
