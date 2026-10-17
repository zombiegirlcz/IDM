package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zznn;
import com.google.android.gms.internal.nearby.zznp;
import com.google.android.gms.internal.nearby.zzns;
import com.google.android.gms.internal.nearby.zznt;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzai extends GmsClient {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zznt f48094zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final ClientAppContext f48095zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final int f48096zzg;

    private zzai(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f48094zze = new zznt();
        String realClientPackageName = clientSettings.getRealClientPackageName();
        int iZzp = zzp(context);
        if (messagesOptions != null) {
            this.f48095zzf = new ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.f48096zzg = messagesOptions.f48029zzc;
        } else {
            this.f48095zzf = new ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.f48096zzg = -1;
        }
    }

    public static int zzp(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    public static zzai zzq(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        zzai zzaiVar = new zzai(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, messagesOptions);
        if (zzp(context) == 1 && PlatformVersion.isAtLeastIceCreamSandwich()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String str = "Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for " + activity.getPackageName();
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new zzah(activity, zzaiVar, null));
        }
        return zzaiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        try {
            zzr(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e);
            }
        }
        this.f48094zze.zzb();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        getServiceRequestExtraArgs.putInt("NearbyPermissions", this.f48096zzg);
        getServiceRequestExtraArgs.putParcelable("ClientAppContext", this.f48095zzf);
        return getServiceRequestExtraArgs;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzA(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        zznp zznpVar = new zznp(listenerHolder);
        if (!this.f48094zze.zze(listenerKey)) {
            zznpVar.zzd(new Status(0));
            return;
        }
        zzcb zzcbVar = new zzcb(zznpVar, (IBinder) this.f48094zze.zza(listenerKey));
        zzcbVar.f48176zzd = false;
        ((zzs) getService()).zzg(zzcbVar);
        this.f48094zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(ListenerHolder listenerHolder, PendingIntent pendingIntent) throws RemoteException {
        ((zzs) getService()).zzj(new zzcg(null, new zznp(listenerHolder), pendingIntent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        zznp zznpVar = new zznp(listenerHolder);
        if (!this.f48094zze.zze(listenerKey)) {
            zznpVar.zzd(new Status(0));
            return;
        }
        ((zzs) getService()).zzj(new zzcg((IBinder) this.f48094zze.zza(listenerKey), zznpVar, null));
        this.f48094zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(int i) throws RemoteException {
        String str = i != 1 ? "CLIENT_DISCONNECTED" : "ACTIVITY_STOPPED";
        if (isConnected()) {
            zzj zzjVar = new zzj(1, null, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                "Emitting client lifecycle event ".concat(str);
            }
            ((zzs) getService()).zze(zzjVar);
            return;
        }
        if (Log.isLoggable("NearbyMessagesClient", 3)) {
            String str2 = "Failed to emit client lifecycle event " + str + " due to GmsClient being disconnected";
        }
    }

    @Deprecated
    public final void zzs(ListenerHolder listenerHolder, zzae zzaeVar, zzu zzuVar, PublishOptions publishOptions) throws RemoteException {
        zzt(listenerHolder, zzaeVar, zzuVar, publishOptions, this.f48095zzf.f48063zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(ListenerHolder listenerHolder, zzae zzaeVar, zzu zzuVar, PublishOptions publishOptions, int i) throws RemoteException {
        ((zzs) getService()).zzf(new zzbz(2, zzaeVar, publishOptions.getStrategy(), new zznp(listenerHolder), null, null, false, zzuVar, false, null, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu(ListenerHolder listenerHolder, ListenerHolder listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.f48094zze.zze(listenerKey)) {
            this.f48094zze.zzc(listenerKey, new zzns(listenerHolder2));
        }
        zzcb zzcbVar = new zzcb(new zznp(listenerHolder), (IBinder) this.f48094zze.zza(listenerKey));
        zzcbVar.f48176zzd = true;
        ((zzs) getService()).zzg(zzcbVar);
    }

    @Deprecated
    public final void zzv(ListenerHolder listenerHolder, PendingIntent pendingIntent, zzaa zzaaVar, SubscribeOptions subscribeOptions) throws RemoteException {
        zzw(listenerHolder, pendingIntent, zzaaVar, subscribeOptions, this.f48095zzf.f48063zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw(ListenerHolder listenerHolder, PendingIntent pendingIntent, zzaa zzaaVar, SubscribeOptions subscribeOptions, int i) throws RemoteException {
        ((zzs) getService()).zzh(new SubscribeRequest(null, subscribeOptions.getStrategy(), new zznp(listenerHolder), subscribeOptions.getFilter(), pendingIntent, null, zzaaVar, false, 0, this.f48095zzf.f48063zze));
    }

    @Deprecated
    public final void zzx(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, zzaa zzaaVar, SubscribeOptions subscribeOptions, byte[] bArr) throws RemoteException {
        zzy(listenerHolder, listenerHolder2, zzaaVar, subscribeOptions, null, this.f48095zzf.f48063zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(ListenerHolder listenerHolder, ListenerHolder listenerHolder2, zzaa zzaaVar, SubscribeOptions subscribeOptions, byte[] bArr, int i) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.f48094zze.zze(listenerKey)) {
            this.f48094zze.zzc(listenerKey, new zznn(listenerHolder2));
        }
        ((zzs) getService()).zzh(new SubscribeRequest((IBinder) this.f48094zze.zza(listenerKey), subscribeOptions.getStrategy(), new zznp(listenerHolder), subscribeOptions.getFilter(), null, null, zzaaVar, false, 0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(ListenerHolder listenerHolder, zzae zzaeVar) throws RemoteException {
        ((zzs) getService()).zzi(new zzce(1, zzaeVar, new zznp(listenerHolder), null, null, false, null));
    }
}
