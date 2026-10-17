package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* JADX INFO: loaded from: classes16.dex */
public final class zznx implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzny f47566zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile boolean f47567zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile zzgy f47568zzc;

    public zznx(zzny zznyVar) {
        this.f47566zza = zznyVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f47566zza.zzu.zzaX().zzn();
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f47568zzc);
                this.f47566zza.zzu.zzaX().zzq(new zzns(this, (zzgl) this.f47568zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f47568zzc = null;
                this.f47567zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzny zznyVar = this.f47566zza;
        zznyVar.zzu.zzaX().zzn();
        zzhe zzheVarZzl = zznyVar.zzu.zzl();
        if (zzheVarZzl != null) {
            zzheVarZzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f47567zzb = false;
            this.f47568zzc = null;
        }
        this.f47566zza.zzu.zzaX().zzq(new zznw(this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzio zzioVar = this.f47566zza.zzu;
        zzioVar.zzaX().zzn();
        zzioVar.zzaW().zzd().zza("Service connection suspended");
        zzioVar.zzaX().zzq(new zznt(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f47566zza.zzu.zzaX().zzn();
        synchronized (this) {
            if (iBinder == null) {
                this.f47567zzb = false;
                this.f47566zza.zzu.zzaW().zze().zza("Service connected with null binder");
                return;
            }
            zzgl zzgjVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzgjVar = iInterfaceQueryLocalInterface instanceof zzgl ? (zzgl) iInterfaceQueryLocalInterface : new zzgj(iBinder);
                    this.f47566zza.zzu.zzaW().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.f47566zza.zzu.zzaW().zze().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f47566zza.zzu.zzaW().zze().zza("Service connect failed to get IMeasurementService");
            }
            if (zzgjVar == null) {
                this.f47567zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    zzny zznyVar = this.f47566zza;
                    connectionTracker.unbindService(zznyVar.zzu.zzaT(), zznyVar.f47569zza);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f47566zza.zzu.zzaX().zzq(new zznq(this, zzgjVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzio zzioVar = this.f47566zza.zzu;
        zzioVar.zzaX().zzn();
        zzioVar.zzaW().zzd().zza("Service disconnected");
        zzioVar.zzaX().zzq(new zznr(this, componentName));
    }

    public final void zzb(Intent intent) {
        zzny zznyVar = this.f47566zza;
        zznyVar.zzg();
        Context contextZzaT = zznyVar.zzu.zzaT();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.f47567zzb) {
                    this.f47566zza.zzu.zzaW().zzj().zza("Connection attempt already in progress");
                    return;
                }
                zzny zznyVar2 = this.f47566zza;
                zznyVar2.zzu.zzaW().zzj().zza("Using local app measurement service");
                this.f47567zzb = true;
                connectionTracker.bindService(contextZzaT, intent, zznyVar2.f47569zza, 129);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzc() {
        zzny zznyVar = this.f47566zza;
        zznyVar.zzg();
        Context contextZzaT = zznyVar.zzu.zzaT();
        synchronized (this) {
            try {
                if (this.f47567zzb) {
                    this.f47566zza.zzu.zzaW().zzj().zza("Connection attempt already in progress");
                    return;
                }
                if (this.f47568zzc != null && (this.f47568zzc.isConnecting() || this.f47568zzc.isConnected())) {
                    this.f47566zza.zzu.zzaW().zzj().zza("Already awaiting connection attempt");
                    return;
                }
                this.f47568zzc = new zzgy(contextZzaT, Looper.getMainLooper(), this, this);
                this.f47566zza.zzu.zzaW().zzj().zza("Connecting to remote service");
                this.f47567zzb = true;
                Preconditions.checkNotNull(this.f47568zzc);
                this.f47568zzc.checkAvailabilityAndConnect();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzd() {
        if (this.f47568zzc != null && (this.f47568zzc.isConnected() || this.f47568zzc.isConnecting())) {
            this.f47568zzc.disconnect();
        }
        this.f47568zzc = null;
    }
}
