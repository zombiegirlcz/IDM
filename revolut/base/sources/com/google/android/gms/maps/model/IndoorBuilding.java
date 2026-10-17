package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class IndoorBuilding {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.internal.maps.zzu f46656zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzh f46657zzb;

    public IndoorBuilding(com.google.android.gms.internal.maps.zzu zzuVar) {
        zzh zzhVar = zzh.f46748zza;
        this.f46656zza = (com.google.android.gms.internal.maps.zzu) Preconditions.checkNotNull(zzuVar, "delegate");
        this.f46657zzb = (zzh) Preconditions.checkNotNull(zzhVar, "shim");
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.f46656zza.zzh(((IndoorBuilding) obj2).f46656zza);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int getActiveLevelIndex() {
        try {
            return this.f46656zza.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.f46656zza.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public List<IndoorLevel> getLevels() {
        try {
            List listZzg = this.f46656zza.zzg();
            ArrayList arrayList = new ArrayList(listZzg.size());
            Iterator it8 = listZzg.iterator();
            while (it8.hasNext()) {
                arrayList.add(new IndoorLevel(com.google.android.gms.internal.maps.zzw.zzb((IBinder) it8.next())));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f46656zza.zzf();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isUnderground() {
        try {
            return this.f46656zza.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
