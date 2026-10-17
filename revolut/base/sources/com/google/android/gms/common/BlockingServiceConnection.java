package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    boolean f37649zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final BlockingQueue f37650zzb = new LinkedBlockingQueue();

    @NonNull
    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.f37649zza) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f37649zza = true;
        return (IBinder) this.f37650zzb.take();
    }

    @NonNull
    @KeepForSdk
    public IBinder getServiceWithTimeout(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f37649zza) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f37649zza = true;
        IBinder iBinder = (IBinder) this.f37650zzb.poll(j2, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f37650zzb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
