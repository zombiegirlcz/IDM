package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.nearby.uwb.RangingControleeParameters;
import com.google.android.gms.nearby.uwb.RangingParameters;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.nearby.uwb.UwbClient;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.nearby.uwb.UwbDevice;
import com.google.android.gms.nearby.uwb.UwbRangeDataNtfConfig;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes16.dex */
public final class zztc extends GoogleApi implements UwbClient {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f45702zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Api f45703zzb = new Api("Nearby.UWB_API", new zzsp(), new Api.ClientKey());

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private UwbAddress f45704zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private UwbComplexChannel f45705zzd;

    public zztc(@NonNull Context context, com.google.android.gms.nearby.uwb.zze zzeVar) {
        super(context, (Api<com.google.android.gms.nearby.uwb.zze>) f45703zzb, zzeVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> addControlee(final UwbAddress uwbAddress) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzoi zzoiVar = new zzoi();
                zzrv zzrvVar = new zzrv();
                zzrvVar.zza(uwbAddress.getAddress());
                zzoiVar.zza(zzrvVar.zzb());
                zzoiVar.zzb(new zzsu(this.f45660zza, (TaskCompletionSource) obj3));
                zzpjVar.zzd(zzoiVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzT).setMethodKey(1316).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> addControleeWithSessionParams(final RangingControleeParameters rangingControleeParameters) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzom zzomVar = new zzom();
                zzqp zzqpVar = new zzqp();
                zzrv zzrvVar = new zzrv();
                RangingControleeParameters rangingControleeParameters2 = rangingControleeParameters;
                zzrvVar.zza(rangingControleeParameters2.getAddress().getAddress());
                zzqpVar.zza(zzrvVar.zzb());
                zzqpVar.zzb(rangingControleeParameters2.getSubSessionId());
                zzqpVar.zzc(rangingControleeParameters2.getSubSessionKey());
                zzomVar.zza(zzqpVar.zzd());
                zzomVar.zzb(new zzsu(this.f45666zza, (TaskCompletionSource) obj3));
                zzpjVar.zze(zzomVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzX).setMethodKey(1316).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<UwbComplexChannel> getComplexChannel() {
        if (((com.google.android.gms.nearby.uwb.zze) getApiOptions()).zza() == 2) {
            return Tasks.forException(new ApiException(new Status(UwbStatusCodes.INVALID_API_CALL)));
        }
        UwbComplexChannel uwbComplexChannel = this.f45705zzd;
        return uwbComplexChannel != null ? Tasks.forResult(uwbComplexChannel) : doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzou zzouVar = new zzou();
                zzouVar.zza(new zzst(this.f45665zza, (TaskCompletionSource) obj3));
                zzpjVar.zzg(zzouVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzS).setMethodKey(1303).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<UwbAddress> getLocalAddress() {
        UwbAddress uwbAddress = this.f45704zzc;
        return uwbAddress != null ? Tasks.forResult(uwbAddress) : doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzoy zzoyVar = new zzoy();
                zzoyVar.zza(new zzss(this.f45659zza, (TaskCompletionSource) obj3));
                zzpjVar.zzh(zzoyVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzS).setMethodKey(1302).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<RangingCapabilities> getRangingCapabilities() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzpc zzpcVar = new zzpc();
                zzpcVar.zza(new zzsr(this.f45664zza, (TaskCompletionSource) obj3));
                zzpjVar.zzi(zzpcVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzS).setMethodKey(1301).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Boolean> isAvailable() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzse
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzpz zzpzVar = new zzpz();
                zzpzVar.zza(new zzsq(this.f45658zza, (TaskCompletionSource) obj3));
                zzpjVar.zzj(zzpzVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzS).setMethodKey(1300).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> reconfigureRangeDataNtf(@UwbRangeDataNtfConfig.RangeDataNtfConfig final int i, final int i2, final int i3) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzso
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzrb zzrbVar = new zzrb();
                zzqj zzqjVar = new zzqj();
                zzqjVar.zzc(i);
                zzqjVar.zzb(i2);
                zzqjVar.zza(i3);
                zzrbVar.zza(zzqjVar.zzd());
                zzrbVar.zzb(new zzsu(this.f45676zza, (TaskCompletionSource) obj3));
                zzpjVar.zzk(zzrbVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzY).setMethodKey(1380).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> reconfigureRangingInterval(final int i) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzrf zzrfVar = new zzrf();
                zzrfVar.zza(i);
                zzrfVar.zzb(new zzsu(this.f45662zza, (TaskCompletionSource) obj3));
                zzpjVar.zzl(zzrfVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzZ).setMethodKey(1381).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> removeControlee(final UwbAddress uwbAddress) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zzpj zzpjVar = (zzpj) ((zzrz) obj2).getService();
                zzrj zzrjVar = new zzrj();
                zzrv zzrvVar = new zzrv();
                zzrvVar.zza(uwbAddress.getAddress());
                zzrjVar.zza(zzrvVar.zzb());
                zzrjVar.zzb(new zzsu(this.f45670zza, (TaskCompletionSource) obj3));
                zzpjVar.zzm(zzrjVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzU).setMethodKey(1317).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> startRanging(final RangingParameters rangingParameters, RangingSessionCallback rangingSessionCallback) {
        final UwbAddress uwbAddress = this.f45704zzc;
        UwbComplexChannel uwbComplexChannel = this.f45705zzd;
        if (uwbAddress == null) {
            return Tasks.forException(new ApiException(new Status(UwbStatusCodes.INVALID_API_CALL)));
        }
        if (uwbComplexChannel == null && rangingParameters.getComplexChannel() == null) {
            return Tasks.forException(new ApiException(new Status(UwbStatusCodes.INVALID_API_CALL)));
        }
        final zztb zztbVar = new zztb(this, rangingSessionCallback);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                this.f45672zza.zze(uwbAddress, rangingParameters, zztbVar, (zzrz) obj2, (TaskCompletionSource) obj3);
            }
        }).setMethodKey(1304).setFeatures(com.google.android.gms.nearby.zza.zzS).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> stopRanging(final RangingSessionCallback rangingSessionCallback) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                this.f45668zza.zzf(rangingSessionCallback, (zzrz) obj2, (TaskCompletionSource) obj3);
            }
        }).setMethodKey(1305).setFeatures(com.google.android.gms.nearby.zza.zzS).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zze(UwbAddress uwbAddress, RangingParameters rangingParameters, zztb zztbVar, zzrz zzrzVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zztf[] zztfVarArr;
        zzpj zzpjVar = (zzpj) zzrzVar.getService();
        zzrn zzrnVar = new zzrn();
        UwbComplexChannel uwbComplexChannel = this.f45705zzd;
        zzqv zzqvVar = new zzqv();
        zzqvVar.zzg(rangingParameters.getSessionId());
        zzqvVar.zzl(rangingParameters.getUwbConfigId());
        zzqvVar.zzf(rangingParameters.getRangingUpdateRate());
        int i = 0;
        if (rangingParameters.getPeerDevices().isEmpty()) {
            zztfVarArr = new zztf[0];
        } else {
            zztfVarArr = new zztf[rangingParameters.getPeerDevices().size()];
            for (UwbDevice uwbDevice : rangingParameters.getPeerDevices()) {
                zztd zztdVar = new zztd();
                zzrv zzrvVar = new zzrv();
                zzrvVar.zza(uwbDevice.getAddress().getAddress());
                zztdVar.zza(zzrvVar.zzb());
                zztfVarArr[i] = zztdVar.zzb();
                i++;
            }
        }
        zzqvVar.zzd(zztfVarArr);
        zztd zztdVar2 = new zztd();
        zzrv zzrvVar2 = new zzrv();
        zzrvVar2.zza(uwbAddress.getAddress());
        zztdVar2.zza(zzrvVar2.zzb());
        zzqvVar.zzc(zztdVar2.zzb());
        zzqvVar.zzi(rangingParameters.getSlotDuration());
        zzqvVar.zzb(rangingParameters.isAoaDisabled());
        byte[] sessionKeyInfo = rangingParameters.getSessionKeyInfo();
        if (sessionKeyInfo != null) {
            zzqvVar.zzh(sessionKeyInfo);
        }
        UwbComplexChannel complexChannel = rangingParameters.getComplexChannel();
        if (complexChannel != null) {
            uwbComplexChannel = complexChannel;
        }
        if (uwbComplexChannel != null) {
            zzsa zzsaVar = new zzsa();
            zzsaVar.zza(uwbComplexChannel.getChannel());
            zzsaVar.zzb(uwbComplexChannel.getPreambleIndex());
            zzqvVar.zza(zzsaVar.zzc());
        }
        UwbRangeDataNtfConfig uwbRangeDataNtfConfig = rangingParameters.getUwbRangeDataNtfConfig();
        if (uwbRangeDataNtfConfig == null) {
            uwbRangeDataNtfConfig = new UwbRangeDataNtfConfig.Builder().build();
        }
        zzqj zzqjVar = new zzqj();
        zzqjVar.zzc(uwbRangeDataNtfConfig.getRangeDataNtfConfigType());
        zzqjVar.zzb(uwbRangeDataNtfConfig.getNtfProximityNear());
        zzqjVar.zza(uwbRangeDataNtfConfig.getNtfProximityFar());
        zzqvVar.zze(zzqjVar.zzd());
        byte[] subSessionKeyInfo = rangingParameters.getSubSessionKeyInfo();
        if (subSessionKeyInfo != null) {
            zzqvVar.zzj(rangingParameters.getSubSessionId());
            zzqvVar.zzk(subSessionKeyInfo);
        }
        zzrnVar.zzb(zzqvVar.zzm());
        zzrnVar.zza(zztbVar);
        zzrnVar.zzc(new zzsu(this, taskCompletionSource));
        zzpjVar.zzn(zzrnVar.zzd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(RangingSessionCallback rangingSessionCallback, zzrz zzrzVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzpj zzpjVar = (zzpj) zzrzVar.getService();
        zzrr zzrrVar = new zzrr();
        zzrrVar.zza(new zzsu(this, taskCompletionSource));
        zzpjVar.zzo(zzrrVar.zzb());
        doUnregisterEventListener(ListenerHolders.createListenerKey(rangingSessionCallback, RangingSessionCallback.class.getName()), 1305);
        this.f45704zzc = null;
        this.f45705zzd = null;
    }
}
