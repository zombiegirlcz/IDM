package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcq extends zza implements zzcs {
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzcs
    public final void zzb(Status status, List list) throws RemoteException {
        throw null;
    }
}
