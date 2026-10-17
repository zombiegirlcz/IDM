package com.google.android.gms.wallet;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
final class zzc implements OnCompleteListener, Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Handler f49027zza = new com.google.android.gms.internal.wallet.zzd(Looper.getMainLooper());

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final SparseArray f49028zzb = new SparseArray(2);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final AtomicInteger f49029zzd = new AtomicInteger();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    int f49030zzc;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzd f49031zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Task f49032zzf;

    public static zzc zza(Task task) {
        zzc zzcVar = new zzc();
        int iIncrementAndGet = f49029zzd.incrementAndGet();
        zzcVar.f49030zzc = iIncrementAndGet;
        f49028zzb.put(iIncrementAndGet, zzcVar);
        f49027zza.postDelayed(zzcVar, AutoResolveHelper.f48822zzb);
        task.addOnCompleteListener(zzcVar);
        return zzcVar;
    }

    private final void zzd() {
        if (this.f49032zzf == null || this.f49031zze == null) {
            return;
        }
        f49028zzb.delete(this.f49030zzc);
        f49027zza.removeCallbacks(this);
        zzd zzdVar = this.f49031zze;
        if (zzdVar != null) {
            zzdVar.zzb(this.f49032zzf);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f49032zzf = task;
        zzd();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f49028zzb.delete(this.f49030zzc);
    }

    public final void zzb(zzd zzdVar) {
        if (this.f49031zze == zzdVar) {
            this.f49031zze = null;
        }
    }

    public final void zzc(zzd zzdVar) {
        this.f49031zze = zzdVar;
        zzd();
    }
}
