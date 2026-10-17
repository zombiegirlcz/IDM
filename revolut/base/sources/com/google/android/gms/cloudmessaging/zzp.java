package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p.a;

/* JADX INFO: loaded from: classes.dex */
final class zzp implements ServiceConnection {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    zzq f37615zzc;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzv f37618zzf;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    int f37613zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Messenger f37614zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                a.z(i, "Received response to request: ", "MessengerIpcClient");
            }
            zzp zzpVar = this.f37610zza;
            synchronized (zzpVar) {
                try {
                    zzs zzsVar = (zzs) zzpVar.f37617zze.get(i);
                    if (zzsVar == null) {
                        String str = "Received response for unknown request: " + i;
                        return true;
                    }
                    zzpVar.f37617zze.remove(i);
                    zzpVar.zzf();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        zzsVar.zzc(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    zzsVar.zza(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final Queue f37616zzd = new ArrayDeque();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final SparseArray f37617zze = new SparseArray();

    public /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) {
        this.f37618zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.f37618zzf.f37627zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = this.f37605zza;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    if (iBinder2 == null) {
                        zzpVar.zza(0, "Null service connection");
                        return;
                    }
                    try {
                        zzpVar.f37615zzc = new zzq(iBinder2);
                        zzpVar.f37613zza = 2;
                        zzpVar.zzc();
                    } catch (RemoteException e) {
                        zzpVar.zza(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.f37618zzf.f37627zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.f37609zza.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i, String str) {
        zzb(i, str, null);
    }

    public final synchronized void zzb(int i, String str, Throwable th10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i2 = this.f37613zza;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f37613zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
            }
            this.f37613zza = 4;
            ConnectionTracker.getInstance().unbindService(this.f37618zzf.f37626zzb, this);
            zzt zztVar = new zzt(i, str, th10);
            Iterator it8 = this.f37616zzd.iterator();
            while (it8.hasNext()) {
                ((zzs) it8.next()).zzc(zztVar);
            }
            this.f37616zzd.clear();
            for (int i3 = 0; i3 < this.f37617zze.size(); i3++) {
                ((zzs) this.f37617zze.valueAt(i3)).zzc(zztVar);
            }
            this.f37617zze.clear();
        } catch (Throwable th11) {
            throw th11;
        }
    }

    public final void zzc() {
        this.f37618zzf.f37627zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final zzs zzsVar;
                while (true) {
                    final zzp zzpVar = this.f37607zza;
                    synchronized (zzpVar) {
                        try {
                            if (zzpVar.f37613zza != 2) {
                                return;
                            }
                            if (zzpVar.f37616zzd.isEmpty()) {
                                zzpVar.zzf();
                                return;
                            } else {
                                zzsVar = (zzs) zzpVar.f37616zzd.poll();
                                zzpVar.f37617zze.put(zzsVar.f37621zza, zzsVar);
                                zzpVar.f37618zzf.f37627zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzpVar.zze(zzsVar.f37621zza);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(zzsVar));
                    }
                    zzv zzvVar = zzpVar.f37618zzf;
                    Messenger messenger = zzpVar.f37614zzb;
                    int i = zzsVar.f37623zzc;
                    Context context = zzvVar.f37626zzb;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = zzsVar.f37621zza;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzsVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzsVar.f37624zzd);
                    messageObtain.setData(bundle);
                    try {
                        zzpVar.f37615zzc.zza(messageObtain);
                    } catch (RemoteException e) {
                        zzpVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.f37613zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i) {
        zzs zzsVar = (zzs) this.f37617zze.get(i);
        if (zzsVar != null) {
            String str = "Timing out request: " + i;
            this.f37617zze.remove(i);
            zzsVar.zzc(new zzt(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        try {
            if (this.f37613zza == 2 && this.f37616zzd.isEmpty() && this.f37617zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                }
                this.f37613zza = 3;
                ConnectionTracker.getInstance().unbindService(this.f37618zzf.f37626zzb, this);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized boolean zzg(zzs zzsVar) {
        int i = this.f37613zza;
        if (i != 0) {
            if (i == 1) {
                this.f37616zzd.add(zzsVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f37616zzd.add(zzsVar);
            zzc();
            return true;
        }
        this.f37616zzd.add(zzsVar);
        Preconditions.checkState(this.f37613zza == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.f37613zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.f37618zzf.f37626zzb, intent, this, 1)) {
                this.f37618zzf.f37627zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37608zza.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            zzb(0, "Unable to bind to service", e);
        }
        return true;
    }
}
