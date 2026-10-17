package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class IndoorLevel {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.internal.maps.zzx f46658zza;

    public IndoorLevel(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.f46658zza = (com.google.android.gms.internal.maps.zzx) Preconditions.checkNotNull(zzxVar);
    }

    public void activate() {
        try {
            this.f46658zza.zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.f46658zza.zzh(((IndoorLevel) obj2).f46658zza);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public String getName() {
        try {
            return this.f46658zza.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public String getShortName() {
        try {
            return this.f46658zza.zzf();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f46658zza.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
