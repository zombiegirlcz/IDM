package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.RangingMeasurement;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zztb extends zzpo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zztc f45699zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ListenerHolder f45700zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final RangingSessionCallback f45701zzc;

    public zztb(zztc zztcVar, RangingSessionCallback rangingSessionCallback) {
        this.f45699zza = zztcVar;
        this.f45700zzb = zztcVar.registerListener(rangingSessionCallback, RangingSessionCallback.class.getName());
        this.f45701zzc = rangingSessionCallback;
    }

    public static /* bridge */ /* synthetic */ RangingPosition zzb(zztb zztbVar, zzqz zzqzVar) {
        return new RangingPosition(zzi(zzqzVar.zzd()), zzqzVar.zzc() != null ? zzi(zzqzVar.zzc()) : null, zzqzVar.zze() != null ? zzi(zzqzVar.zze()) : null, zzqzVar.zzb(), zzqzVar.zza());
    }

    private static final RangingMeasurement zzi(zzqt zzqtVar) {
        return new RangingMeasurement(zzqtVar.zzb(), zzqtVar.zza());
    }

    @Override // com.google.android.gms.internal.nearby.zzpp
    public final void zzd(final zzqd zzqdVar) {
        int i = zztc.f45702zza;
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.nearby.zzsv
            @Override // java.lang.Runnable
            public final void run() {
                this.f45687zza.zzh(zzqdVar);
            }
        };
        this.f45699zza.doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                runnable.run();
                ((TaskCompletionSource) obj3).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzsx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                ((TaskCompletionSource) obj3).setResult(null);
            }
        }).withHolder(this.f45700zzb).setFeatures(com.google.android.gms.nearby.zza.zzS).setMethodKey(1304).build());
    }

    @Override // com.google.android.gms.internal.nearby.zzpp
    public final void zze(zzqf zzqfVar) {
        int i = zztc.f45702zza;
        this.f45700zzb.notifyListener(new zzsz(this, zzqfVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzpp
    public final void zzf(zzqh zzqhVar) {
        int i = zztc.f45702zza;
        this.f45700zzb.notifyListener(new zzta(this, zzqhVar));
    }

    public final /* synthetic */ void zzh(zzqd zzqdVar) {
        this.f45700zzb.notifyListener(new zzsy(this, zzqdVar));
    }
}
