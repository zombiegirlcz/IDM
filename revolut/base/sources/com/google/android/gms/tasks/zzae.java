package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class zzae<T> implements zzad<T> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f48760zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f48761zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzw f48762zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f48763zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f48764zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f48765zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private Exception f48766zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f48767zzh;

    public zzae(int i, zzw zzwVar) {
        this.f48761zzb = i;
        this.f48762zzc = zzwVar;
    }

    private final void zza() {
        if (this.f48763zzd + this.f48764zze + this.f48765zzf == this.f48761zzb) {
            if (this.f48766zzg == null) {
                if (this.f48767zzh) {
                    this.f48762zzc.zzc();
                    return;
                } else {
                    this.f48762zzc.zzb(null);
                    return;
                }
            }
            this.f48762zzc.zza(new ExecutionException(this.f48764zze + " out of " + this.f48761zzb + " underlying tasks failed", this.f48766zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.f48760zza) {
            this.f48765zzf++;
            this.f48767zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc2) {
        synchronized (this.f48760zza) {
            this.f48764zze++;
            this.f48766zzg = exc2;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(T t2) {
        synchronized (this.f48760zza) {
            this.f48763zzd++;
            zza();
        }
    }
}
