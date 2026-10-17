package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzbh implements RemoteCall, zzdr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbi f39624zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzbg f39625zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private ListenerHolder f39626zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f39627zzd = true;

    public zzbh(zzbi zzbiVar, ListenerHolder listenerHolder, zzbg zzbgVar) {
        this.f39624zza = zzbiVar;
        this.f39626zzc = listenerHolder;
        this.f39625zzb = zzbgVar;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj2, Object obj3) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey;
        boolean z;
        zzdz zzdzVar = (zzdz) obj2;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
        synchronized (this) {
            listenerKey = this.f39626zzc.getListenerKey();
            z = this.f39627zzd;
            this.f39626zzc.clear();
        }
        if (listenerKey == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.f39625zzb.zza(zzdzVar, listenerKey, z, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized ListenerHolder zza() {
        return this.f39626zzc;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized void zzb(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f39626zzc;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f39626zzc = listenerHolder;
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
        ListenerHolder.ListenerKey<?> listenerKey;
        synchronized (this) {
            this.f39627zzd = false;
            listenerKey = this.f39626zzc.getListenerKey();
        }
        if (listenerKey != null) {
            this.f39624zza.doUnregisterEventListener(listenerKey, 2441);
        }
    }
}
