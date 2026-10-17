package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes16.dex */
final class zzeh extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f39973zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Object f39974zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzff f39975zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzff zzffVar, boolean z, int i, String str, Object obj2, Object obj3, Object obj4) {
        super(zzffVar, false);
        this.f39973zza = str;
        this.f39974zzb = obj2;
        this.f39975zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39975zzc.f40044zzj)).logHealthData(5, this.f39973zza, ObjectWrapper.wrap(this.f39974zzb), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
