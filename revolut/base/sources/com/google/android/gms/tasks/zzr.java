package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class zzr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f48803zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Queue f48804zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f48805zzc;

    public final void zza(@NonNull zzq zzqVar) {
        synchronized (this.f48803zza) {
            try {
                if (this.f48804zzb == null) {
                    this.f48804zzb = new ArrayDeque();
                }
                this.f48804zzb.add(zzqVar);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzb(@NonNull Task task) {
        zzq zzqVar;
        synchronized (this.f48803zza) {
            if (this.f48804zzb != null && !this.f48805zzc) {
                this.f48805zzc = true;
                while (true) {
                    synchronized (this.f48803zza) {
                        try {
                            zzqVar = (zzq) this.f48804zzb.poll();
                            if (zzqVar == null) {
                                this.f48805zzc = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    zzqVar.zzd(task);
                }
            }
        }
    }
}
