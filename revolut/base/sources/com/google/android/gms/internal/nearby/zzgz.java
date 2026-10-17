package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgz extends GmsClient {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final /* synthetic */ int f45218zze = 0;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private long f45219zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Set f45220zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Set f45221zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final Set f45222zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final Set f45223zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Set f45224zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Set f45225zzl;
    private zzlu zzm;

    public zzgz(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        this.f45220zzg = new ArraySet();
        this.f45221zzh = new ArraySet();
        this.f45222zzi = new ArraySet();
        this.f45223zzj = new ArraySet();
        this.f45224zzk = new ArraySet();
        this.f45225zzl = new ArraySet();
        zzme.zzc(context.getCacheDir());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zzG(int i) {
        return new Status(i, ConnectionsStatusCodes.getStatusCodeString(i));
    }

    private final void zzH() {
        Iterator it8 = this.f45220zzg.iterator();
        while (it8.hasNext()) {
            ((zzgh) it8.next()).zze();
        }
        Iterator it9 = this.f45221zzh.iterator();
        while (it9.hasNext()) {
            ((zzgc) it9.next()).zza();
        }
        Iterator it10 = this.f45222zzi.iterator();
        while (it10.hasNext()) {
            ((zzgl) it10.next()).zzf();
        }
        Iterator it11 = this.f45223zzj.iterator();
        while (it11.hasNext()) {
            ((zzgl) it11.next()).zzf();
        }
        Iterator it12 = this.f45224zzk.iterator();
        while (it12.hasNext()) {
            ((zzgl) it12.next()).zzf();
        }
        Iterator it13 = this.f45225zzl.iterator();
        while (it13.hasNext()) {
            ((zzgl) it13.next()).zzf();
        }
        this.f45220zzg.clear();
        this.f45221zzh.clear();
        this.f45222zzi.clear();
        this.f45223zzj.clear();
        this.f45224zzk.clear();
        this.f45225zzl.clear();
        zzlu zzluVar = this.zzm;
        if (zzluVar != null) {
            zzluVar.zzd();
            this.zzm = null;
        }
    }

    public static zzgz zzq(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzgz zzgzVar = new zzgz(context, looper, clientSettings, connectionsOptions, connectionCallbacks, onConnectionFailedListener);
        zzgzVar.f45219zzf = zzgzVar.hashCode();
        return zzgzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof zzke ? (zzke) iInterfaceQueryLocalInterface : new zzke(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzke) getService()).zzf(new zzfp());
            } catch (RemoteException e) {
            }
        }
        zzH();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.f48269zzf, com.google.android.gms.nearby.zza.zzI, com.google.android.gms.nearby.zza.zzM, com.google.android.gms.nearby.zza.zzK, com.google.android.gms.nearby.zza.zzN, com.google.android.gms.nearby.zza.zzJ, com.google.android.gms.nearby.zza.f48270zzg, com.google.android.gms.nearby.zza.zzL, com.google.android.gms.nearby.zza.f48271zzh, com.google.android.gms.nearby.zza.zzO};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.f45219zzf);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ void onConnectedLocked(@NonNull IInterface iInterface) {
        super.onConnectedLocked((zzke) iInterface);
        this.zzm = new zzlu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            zzH();
            i = 1;
        }
        super.onConnectionSuspended(i);
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
    public final void zzA(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.f45224zzk.add(zzfxVar);
        zzke zzkeVar = (zzke) getService();
        zzmr zzmrVar = new zzmr();
        zzmrVar.zzg(new zzgy(resultHolder));
        zzmrVar.zze(str);
        zzmrVar.zzh(str2);
        zzmrVar.zzf(advertisingOptions);
        zzmrVar.zzb(zzfxVar);
        zzkeVar.zzk(zzmrVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.f45224zzk.add(zzfxVar);
        zzke zzkeVar = (zzke) getService();
        zzmr zzmrVar = new zzmr();
        zzmrVar.zzg(new zzgy(resultHolder));
        zzmrVar.zzd(bArr);
        zzmrVar.zzh(str);
        zzmrVar.zzf(advertisingOptions);
        zzmrVar.zzb(zzfxVar);
        zzkeVar.zzk(zzmrVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) throws RemoteException {
        zzgh zzghVar = new zzgh(listenerHolder);
        this.f45220zzg.add(zzghVar);
        zzke zzkeVar = (zzke) getService();
        zzmv zzmvVar = new zzmv();
        zzmvVar.zzd(new zzgw(resultHolder));
        zzmvVar.zze(str);
        zzmvVar.zzc(discoveryOptions);
        zzmvVar.zza(zzghVar);
        zzkeVar.zzl(zzmvVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() throws RemoteException {
        ((zzke) getService()).zzm(new zzmz());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzE() throws RemoteException {
        ((zzke) getService()).zzn(new zznb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzF() throws RemoteException {
        ((zzke) getService()).zzo(new zznd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzgv zzgvVar = new zzgv(getContext(), listenerHolder, this.zzm);
        this.f45222zzi.add(zzgvVar);
        zzke zzkeVar = (zzke) getService();
        zzfh zzfhVar = new zzfh();
        zzfhVar.zze(new zzgw(resultHolder));
        zzfhVar.zzd(str);
        zzfhVar.zzc(zzgvVar);
        zzkeVar.zzd(zzfhVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(BaseImplementation.ResultHolder resultHolder, long j2) throws RemoteException {
        zzke zzkeVar = (zzke) getService();
        zzfl zzflVar = new zzfl();
        zzflVar.zzb(new zzgw(resultHolder));
        zzflVar.zza(j2);
        zzkeVar.zze(zzflVar.zzc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(String str) throws RemoteException {
        zzke zzkeVar = (zzke) getService();
        zzjk zzjkVar = new zzjk();
        zzjkVar.zza(str);
        zzkeVar.zzg(zzjkVar.zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu(BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        zzke zzkeVar = (zzke) getService();
        zzmf zzmfVar = new zzmf();
        zzmfVar.zzb(new zzgw(resultHolder));
        zzmfVar.zza(str);
        zzkeVar.zzh(zzmfVar.zzc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzv(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.f45224zzk.add(zzfxVar);
        zzke zzkeVar = (zzke) getService();
        zzmj zzmjVar = new zzmj();
        zzmjVar.zzi(new zzgw(resultHolder));
        zzmjVar.zzf(str);
        zzmjVar.zzh(str2);
        zzmjVar.zzb(zzfxVar);
        zzkeVar.zzi(zzmjVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.f45224zzk.add(zzfxVar);
        zzke zzkeVar = (zzke) getService();
        zzmj zzmjVar = new zzmj();
        zzmjVar.zzi(new zzgw(resultHolder));
        zzmjVar.zzd(bArr);
        zzmjVar.zzh(str);
        zzmjVar.zzb(zzfxVar);
        zzkeVar.zzi(zzmjVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.f45224zzk.add(zzfxVar);
        zzke zzkeVar = (zzke) getService();
        zzmj zzmjVar = new zzmj();
        zzmjVar.zzi(new zzgw(resultHolder));
        zzmjVar.zzf(str);
        zzmjVar.zzh(str2);
        zzmjVar.zzb(zzfxVar);
        zzmjVar.zzg(connectionOptions);
        zzkeVar.zzi(zzmjVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.f45224zzk.add(zzfxVar);
        zzke zzkeVar = (zzke) getService();
        zzmj zzmjVar = new zzmj();
        zzmjVar.zzi(new zzgw(resultHolder));
        zzmjVar.zzd(bArr);
        zzmjVar.zzh(str);
        zzmjVar.zzb(zzfxVar);
        zzmjVar.zzg(connectionOptions);
        zzkeVar.zzi(zzmjVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(BaseImplementation.ResultHolder resultHolder, String[] strArr, Payload payload, boolean z) throws Throwable {
        Pair pairCreate;
        try {
            int type = payload.getType();
            if (type == 1) {
                zzma zzmaVar = new zzma();
                zzmaVar.zzd(payload.getId());
                zzmaVar.zzm(payload.getType());
                byte[] bArrAsBytes = payload.asBytes();
                if (bArrAsBytes == null || bArrAsBytes.length <= 32768) {
                    zzmaVar.zza(bArrAsBytes);
                } else {
                    zzlw zzlwVar = new zzlw();
                    zzlwVar.zza(bArrAsBytes);
                    zzmaVar.zzk(zzlwVar.zzb());
                    zzmaVar.zza(Arrays.copyOf(bArrAsBytes, 32768));
                }
                pairCreate = Pair.create(zzmaVar.zzn(), zztm.zzc());
            } else if (type == 2) {
                Payload.File fileAsFile = payload.asFile();
                zztq.zzc(fileAsFile, "File cannot be null for Payload.Type.FILE");
                File fileAsJavaFile = fileAsFile.asJavaFile();
                String absolutePath = fileAsJavaFile == null ? null : fileAsJavaFile.getAbsolutePath();
                zzma zzmaVar2 = new zzma();
                zzmaVar2.zzd(payload.getId());
                zzmaVar2.zzm(payload.getType());
                zzmaVar2.zzb(fileAsFile.asParcelFileDescriptor());
                zzmaVar2.zzf(absolutePath);
                zzmaVar2.zzg(fileAsFile.getSize());
                zzmaVar2.zzh(payload.getOffset());
                zzmaVar2.zze(payload.zzf());
                zzmaVar2.zzj(0L);
                zzmaVar2.zzc(payload.zzd());
                zzmaVar2.zzi(payload.zze());
                pairCreate = Pair.create(zzmaVar2.zzn(), zztm.zzc());
            } else {
                if (type != 3) {
                    throw new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(payload.getId()), Integer.valueOf(payload.getType())));
                }
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = ParcelFileDescriptor.createPipe();
                    zzma zzmaVar3 = new zzma();
                    zzmaVar3.zzd(payload.getId());
                    zzmaVar3.zzm(payload.getType());
                    zzmaVar3.zzb(parcelFileDescriptorArrCreatePipe[0]);
                    zzmaVar3.zzl(parcelFileDescriptorArrCreatePipe2[0]);
                    zzmaVar3.zzh(payload.getOffset());
                    zzmaVar3.zzj(0L);
                    pairCreate = Pair.create(zzmaVar3.zzn(), zztm.zzd(Pair.create(parcelFileDescriptorArrCreatePipe[1], parcelFileDescriptorArrCreatePipe2[1])));
                } catch (IOException e) {
                    String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(payload.getId()));
                    throw e;
                }
            }
            zzke zzkeVar = (zzke) getService();
            zzmn zzmnVar = new zzmn();
            zzmnVar.zzc(new zzgw(resultHolder));
            zzmnVar.zzb(strArr);
            zzmnVar.zza((zzmc) pairCreate.first);
            zzkeVar.zzj(zzmnVar.zzd());
            if (((zztm) pairCreate.second).zzb()) {
                Object objZza = ((zztm) pairCreate.second).zza();
                zzlu zzluVar = this.zzm;
                if (zzluVar != null) {
                    Pair pair = (Pair) objZza;
                    zzluVar.zzc(((Payload.Stream) Preconditions.checkNotNull(payload.asStream())).asInputStream(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second), (zzmc) pairCreate.first, payload.getId());
                }
            }
        } catch (IOException e2) {
            resultHolder.setResult(zzG(ConnectionsStatusCodes.STATUS_PAYLOAD_IO_ERROR));
        }
    }
}
