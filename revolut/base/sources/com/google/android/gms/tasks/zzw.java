package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzw<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f48809zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzr f48810zzb = new zzr();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f48811zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private volatile boolean f48812zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private Object f48813zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private Exception f48814zzf;

    private final void zzf() {
        Preconditions.checkState(this.f48811zzc, "Task is not yet complete");
    }

    private final void zzg() {
        if (this.f48812zzd) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void zzh() {
        if (this.f48811zzc) {
            throw DuplicateTaskCompletionException.of(this);
        }
    }

    private final void zzi() {
        synchronized (this.f48809zza) {
            try {
                if (this.f48811zzc) {
                    this.f48810zzb.zzb(this);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Activity activity, @NonNull OnCanceledListener onCanceledListener) {
        zzh zzhVar = new zzh(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.f48810zzb.zza(zzhVar);
        zzv.zza(activity).zzb(zzhVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        zzj zzjVar = new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.f48810zzb.zza(zzjVar);
        zzv.zza(activity).zzb(zzjVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        zzl zzlVar = new zzl(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.f48810zzb.zza(zzlVar);
        zzv.zza(activity).zzb(zzlVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        zzn zznVar = new zzn(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.f48810zzb.zza(zznVar);
        zzv.zza(activity).zzb(zznVar);
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc2;
        synchronized (this.f48809zza) {
            exc2 = this.f48814zzf;
        }
        return exc2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f48809zza) {
            try {
                zzf();
                zzg();
                Exception exc2 = this.f48814zzf;
                if (exc2 != null) {
                    throw new RuntimeExecutionException(exc2);
                }
                tresult = (TResult) this.f48813zze;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f48812zzd;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f48809zza) {
            z = this.f48811zzc;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f48809zza) {
            try {
                z = false;
                if (this.f48811zzc && !this.f48812zzd && this.f48814zzf == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzw zzwVar = new zzw();
        this.f48810zzb.zza(new zzp(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    public final void zza(@NonNull Exception exc2) {
        Preconditions.checkNotNull(exc2, "Exception must not be null");
        synchronized (this.f48809zza) {
            zzh();
            this.f48811zzc = true;
            this.f48814zzf = exc2;
        }
        this.f48810zzb.zzb(this);
    }

    public final void zzb(Object obj2) {
        synchronized (this.f48809zza) {
            zzh();
            this.f48811zzc = true;
            this.f48813zze = obj2;
        }
        this.f48810zzb.zzb(this);
    }

    public final boolean zzc() {
        synchronized (this.f48809zza) {
            try {
                if (this.f48811zzc) {
                    return false;
                }
                this.f48811zzc = true;
                this.f48812zzd = true;
                this.f48810zzb.zzb(this);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean zzd(@NonNull Exception exc2) {
        Preconditions.checkNotNull(exc2, "Exception must not be null");
        synchronized (this.f48809zza) {
            try {
                if (this.f48811zzc) {
                    return false;
                }
                this.f48811zzc = true;
                this.f48814zzf = exc2;
                this.f48810zzb.zzb(this);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean zze(Object obj2) {
        synchronized (this.f48809zza) {
            try {
                if (this.f48811zzc) {
                    return false;
                }
                this.f48811zzc = true;
                this.f48813zze = obj2;
                this.f48810zzb.zzb(this);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        zzw zzwVar = new zzw();
        this.f48810zzb.zza(new zzd(executor, continuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        zzw zzwVar = new zzw();
        this.f48810zzb.zza(new zzf(executor, continuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f48810zzb.zza(new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        zzw zzwVar = new zzw();
        this.f48810zzb.zza(new zzp(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f48810zzb.zza(new zzh(executor, onCanceledListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f48810zzb.zza(new zzl(executor, onFailureListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f48810zzb.zza(new zzn(executor, onSuccessListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f48810zzb.zza(new zzj(executor, onCompleteListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f48809zza) {
            try {
                zzf();
                zzg();
                if (!cls.isInstance(this.f48814zzf)) {
                    Exception exc2 = this.f48814zzf;
                    if (exc2 == null) {
                        tresult = (TResult) this.f48813zze;
                    } else {
                        throw new RuntimeExecutionException(exc2);
                    }
                } else {
                    throw cls.cast(this.f48814zzf);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return tresult;
    }
}
