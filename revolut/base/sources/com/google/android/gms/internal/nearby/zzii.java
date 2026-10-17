package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzii extends GoogleApi implements ConnectionsClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f45296zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api.ClientKey f45297zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f45298zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Api f45299zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzfg f45300zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzkq f45301zzf;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f45297zzb = clientKey;
        zzhz zzhzVar = new zzhz();
        f45298zzc = zzhzVar;
        f45299zzd = new Api("Nearby.CONNECTIONS_API", zzhzVar, clientKey);
    }

    private zzii(Activity activity, ConnectionsOptions connectionsOptions) {
        super(activity, (Api<Api.ApiOptions>) f45299zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f45301zzf = zzkq.zza(activity);
    }

    public static zzii zza(Activity activity, ConnectionsOptions connectionsOptions) {
        zzii zziiVar = new zzii(activity, (ConnectionsOptions) null);
        zziiVar.f45300zze = zzfg.zzd(zziiVar, null);
        return zziiVar;
    }

    public static zzii zzb(Context context, ConnectionsOptions connectionsOptions) {
        zzii zziiVar = new zzii(context, (ConnectionsOptions) null);
        zziiVar.f45300zze = zzfg.zzd(zziiVar, null);
        return zziiVar;
    }

    private final Task zzh(final zzie zzieVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzig zzigVar = new zzig(this.f45245zza, (TaskCompletionSource) obj3);
                zzieVar.zza((zzgz) obj2, zzigVar);
            }
        }).build());
    }

    private final Task zzi(final zzih zzihVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzii.f45296zza;
                zzihVar.zza((zzgz) obj2);
                ((TaskCompletionSource) obj3).setResult(null);
            }
        }).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(String str) {
        this.f45300zze.zze(this, RegistrationMethods.builder().withHolder(this.f45300zze.zzc(this, str, "connection")).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                int i = zzii.f45296zza;
                ((TaskCompletionSource) obj3).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                ((TaskCompletionSource) obj3).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1268).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(String str) {
        zzfg zzfgVar = this.f45300zze;
        zzfgVar.zzg(this, zzfgVar.zza(str, "connection"));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> acceptConnection(final String str, PayloadCallback payloadCallback) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(payloadCallback, PayloadCallback.class.getName());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzr(new zzig(this.f45248zza, (TaskCompletionSource) obj3), str, listenerHolderRegisterListener);
            }
        }).setMethodKey(1227).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> cancelPayload(final long j2) {
        return zzh(new zzie() { // from class: com.google.android.gms.internal.nearby.zzhg
            @Override // com.google.android.gms.internal.nearby.zzie
            public final void zza(zzgz zzgzVar, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
                int i = zzii.f45296zza;
                zzgzVar.zzs(resultHolder, j2);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void disconnectFromEndpoint(final String str) {
        zzi(new zzih() { // from class: com.google.android.gms.internal.nearby.zzhf
            @Override // com.google.android.gms.internal.nearby.zzih
            public final void zza(zzgz zzgzVar) throws RemoteException {
                int i = zzii.f45296zza;
                zzgzVar.zzt(str);
            }
        });
        zzk(str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> rejectConnection(final String str) {
        return zzh(new zzie() { // from class: com.google.android.gms.internal.nearby.zzho
            @Override // com.google.android.gms.internal.nearby.zzie
            public final void zza(zzgz zzgzVar, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
                int i = zzii.f45296zza;
                zzgzVar.zzu(resultHolder, str);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzif(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str2);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhe
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzv(new zzig(this.f45239zza, (TaskCompletionSource) obj3), str, str2, listenerHolderRegisterListener);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzid(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> sendPayload(final String str, final Payload payload) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhr
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws Throwable {
                ((zzgz) obj2).zzz(new zzig(this.f45267zza, (TaskCompletionSource) obj3), new String[]{str}, payload, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startAdvertising(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback, final AdvertisingOptions advertisingOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzif(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.f45300zze.zze(this, RegistrationMethods.builder().withHolder(this.f45300zze.zzb(this, new Object(), "advertising")).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzA(new zzig(this.f45233zza, (TaskCompletionSource) obj3), str, str2, listenerHolderRegisterListener, advertisingOptions);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzii.f45296zza;
                ((zzgz) obj2).zzD();
                ((TaskCompletionSource) obj3).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startDiscovery(final String str, EndpointDiscoveryCallback endpointDiscoveryCallback, final DiscoveryOptions discoveryOptions) {
        final ListenerHolder listenerHolderZzb = this.f45300zze.zzb(this, endpointDiscoveryCallback, "discovery");
        return this.f45300zze.zze(this, RegistrationMethods.builder().withHolder(listenerHolderZzb).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzC(new zzig(this.f45263zza, (TaskCompletionSource) obj3), str, listenerHolderZzb, discoveryOptions);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhv
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzii.f45296zza;
                ((zzgz) obj2).zzF();
                ((TaskCompletionSource) obj3).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1267).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.nearby.zzhw
            @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
            public final void onSuccess(Object obj2) {
                this.f45277zza.zze(discoveryOptions, (Void) obj2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.nearby.zzhx
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAdvertising() {
        this.f45300zze.zzf(this, "advertising");
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAllEndpoints() {
        this.f45300zze.zzf(this, "advertising");
        this.f45300zze.zzf(this, "discovery").addOnSuccessListener(new zzhi(this));
        zzi(new zzih() { // from class: com.google.android.gms.internal.nearby.zzhs
            @Override // com.google.android.gms.internal.nearby.zzih
            public final void zza(zzgz zzgzVar) throws RemoteException {
                int i = zzii.f45296zza;
                zzgzVar.zzE();
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.nearby.zzht
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f45271zza.zzf(task);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopDiscovery() {
        this.f45300zze.zzf(this, "discovery").addOnSuccessListener(new zzhi(this));
    }

    public final /* synthetic */ void zze(DiscoveryOptions discoveryOptions, Void r2) {
        zzkq zzkqVar;
        if (discoveryOptions.zzK() && (zzkqVar = this.f45301zzf) != null) {
            zzkqVar.zze();
        }
    }

    public final /* synthetic */ void zzf(Task task) {
        this.f45300zze.zzf(this, "connection");
        disconnectService();
    }

    public final /* synthetic */ void zzg(Void r110) {
        zzkq zzkqVar = this.f45301zzf;
        if (zzkqVar != null) {
            zzkqVar.zzf();
        }
    }

    private zzii(Context context, ConnectionsOptions connectionsOptions) {
        super(context, (Api<Api.ApiOptions>) f45299zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f45301zzf = null;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> sendPayload(final List<String> list, final Payload payload) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhp
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws Throwable {
                ((zzgz) obj2).zzz(new zzig(this.f45260zza, (TaskCompletionSource) obj3), (String[]) list.toArray(new String[0]), payload, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback, final ConnectionOptions connectionOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzif(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str2);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.f48269zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhy
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzx(new zzig(this.f45280zza, (TaskCompletionSource) obj3), str, str2, listenerHolderRegisterListener, connectionOptions);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzia(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startAdvertising(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback, final AdvertisingOptions advertisingOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzif(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.f45300zze.zze(this, RegistrationMethods.builder().withHolder(this.f45300zze.zzb(this, new Object(), "advertising")).setFeatures(com.google.android.gms.nearby.zza.f48269zzf).register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhk
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzB(new zzig(this.f45251zza, (TaskCompletionSource) obj3), bArr, str, listenerHolderRegisterListener, advertisingOptions);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                int i = zzii.f45296zza;
                ((zzgz) obj2).zzD();
                ((TaskCompletionSource) obj3).setResult(Boolean.TRUE);
            }
        }).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzif(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.f48269zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzhu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzw(new zzig(this.f45272zza, (TaskCompletionSource) obj3), bArr, str, listenerHolderRegisterListener);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzic(this, str));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback, final ConnectionOptions connectionOptions) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(new zzif(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzj(str);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.f48269zzf).run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzha
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((zzgz) obj2).zzy(new zzig(this.f45227zza, (TaskCompletionSource) obj3), bArr, str, listenerHolderRegisterListener, connectionOptions);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzib(this, str));
    }
}
