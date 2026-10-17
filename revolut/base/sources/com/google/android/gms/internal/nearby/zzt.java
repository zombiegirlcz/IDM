package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzt implements RemoteCall {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final /* synthetic */ zzax f45695zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final /* synthetic */ String f45696zzb;

    public /* synthetic */ zzt(zzax zzaxVar, String str) {
        this.f45695zza = zzaxVar;
        this.f45696zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj2, Object obj3) throws RemoteException {
        zzau zzauVar = new zzau(this.f45695zza, (TaskCompletionSource) obj3);
        zzdr zzdrVar = (zzdr) ((zzn) obj2).getService();
        zzbs zzbsVar = new zzbs();
        zzbsVar.zza(zzauVar);
        zzbsVar.zzb(this.f45696zzb);
        zzdrVar.zzi(zzbsVar.zzc());
    }
}
