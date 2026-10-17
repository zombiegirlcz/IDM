package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcm<V> extends zzcn<V> {

    final class zza {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zza f45882zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        static final zza f45883zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        final boolean f45884zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        final Throwable f45885zzd;

        static {
            if (zzcn.f45895zzc) {
                f45883zzb = null;
                f45882zza = null;
            } else {
                f45883zzb = new zza(false, null);
                f45882zza = new zza(true, null);
            }
        }

        public zza(boolean z, Throwable th10) {
            this.f45884zzc = z;
            this.f45885zzd = th10;
        }
    }

    final class zzb<V> implements Runnable {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        final zzcm<V> f45886zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final zzdc<? extends V> f45887zzb;

        public zzb(zzcm zzcmVar, zzdc zzdcVar) {
            this.f45886zza = zzcmVar;
            this.f45887zzb = zzdcVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f45886zza.valueField != this) {
                return;
            }
            if (zzcn.zzq(this.f45886zza, this, zzcm.zzr(this.f45887zzb))) {
                zzcm.zzu(this.f45886zza, false);
            }
        }
    }

    final class zzc {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zzc f45888zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.play_billing.zzcm.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final Throwable f45889zzb;

        public zzc(Throwable th10) {
            th10.getClass();
            this.f45889zzb = th10;
        }
    }

    final class zzd {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zzd f45890zza = new zzd();
        zzd next;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final Runnable f45891zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        final Executor f45892zzc;

        public zzd() {
            this.f45891zzb = null;
            this.f45892zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.f45891zzb = runnable;
            this.f45892zzc = executor;
        }
    }

    interface zze<V> extends zzdc<V> {
    }

    public static Object zzc(Object obj2) throws ExecutionException {
        if (obj2 instanceof zza) {
            Throwable th10 = ((zza) obj2).f45885zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th10);
            throw cancellationException;
        }
        if (obj2 instanceof zzc) {
            throw new ExecutionException(((zzc) obj2).f45889zzb);
        }
        if (obj2 == zzcn.f45893zza) {
            return null;
        }
        return obj2;
    }

    public static boolean zzh(Object obj2) {
        return !(obj2 instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzr(zzdc zzdcVar) {
        Throwable thZze;
        if (zzdcVar instanceof zze) {
            Object zzaVar = ((zzcm) zzdcVar).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.f45884zzc) {
                    Throwable th10 = zzaVar2.f45885zzd;
                    zzaVar = th10 != null ? new zza(false, th10) : zza.f45883zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((zzdcVar instanceof zzdi) && (thZze = ((zzdi) zzdcVar).zze()) != null) {
            return new zzc(thZze);
        }
        boolean zIsCancelled = zzdcVar.isCancelled();
        if ((!zzcn.f45895zzc) && zIsCancelled) {
            zza zzaVar3 = zza.f45883zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzs = zzs(zzdcVar);
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdcVar)))) : objZzs == null ? zzcn.f45893zza : objZzs;
        } catch (Error | Exception e) {
            return new zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzdcVar)), e2)) : new zza(false, e2);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdcVar)), e4)) : new zzc(e4.getCause());
        }
    }

    private static Object zzs(Future future) throws ExecutionException {
        Object obj2;
        boolean z = false;
        while (true) {
            try {
                obj2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th10) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th10;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj2;
    }

    private final void zzt(StringBuilder sb6) {
        try {
            Object objZzs = zzs(this);
            sb6.append("SUCCESS, result=[");
            if (objZzs == null) {
                sb6.append("null");
            } else if (objZzs == this) {
                sb6.append("this future");
            } else {
                sb6.append(objZzs.getClass().getName());
                sb6.append("@");
                sb6.append(Integer.toHexString(System.identityHashCode(objZzs)));
            }
            sb6.append("]");
        } catch (CancellationException unused) {
            sb6.append("CANCELLED");
        } catch (ExecutionException e) {
            sb6.append("FAILURE, cause=[");
            sb6.append(e.getCause());
            sb6.append("]");
        } catch (Exception e2) {
            sb6.append("UNKNOWN, cause=[");
            sb6.append(e2.getClass());
            sb6.append(" thrown from get()]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzu(zzcm zzcmVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            zzcmVar.zzo();
            zzcmVar.zzg();
            zzd zzdVar3 = zzdVar2;
            zzd zzdVarZzk = zzcmVar.zzk(zzd.f45890zza);
            zzd zzdVar4 = zzdVar3;
            while (zzdVarZzk != null) {
                zzd zzdVar5 = zzdVarZzk.next;
                zzdVarZzk.next = zzdVar4;
                zzdVar4 = zzdVarZzk;
                zzdVarZzk = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.f45891zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzcmVar = zzbVar.f45886zza;
                    if (zzcmVar.valueField != zzbVar || !zzcn.zzq(zzcmVar, zzbVar, zzr(zzbVar.f45887zzb))) {
                    }
                } else {
                    Executor executor = zzdVar4.f45892zzc;
                    Objects.requireNonNull(executor);
                    zzv(runnable2, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzv(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zzcn.f45894zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", d.s("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.zzcm.zzb
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.play_billing.zzcn.f45895zzc
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.play_billing.zzcm$zza r1 = new com.google.android.gms.internal.play_billing.zzcm$zza
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.play_billing.zzcm$zza r1 = com.google.android.gms.internal.play_billing.zzcm.zza.f45882zza
            goto L26
        L24:
            com.google.android.gms.internal.play_billing.zzcm$zza r1 = com.google.android.gms.internal.play_billing.zzcm.zza.f45883zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = com.google.android.gms.internal.play_billing.zzcn.zzq(r4, r0, r1)
            if (r6 == 0) goto L56
            zzu(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.zzcm.zzb
            if (r4 == 0) goto L55
            com.google.android.gms.internal.play_billing.zzcm$zzb r0 = (com.google.android.gms.internal.play_billing.zzcm.zzb) r0
            com.google.android.gms.internal.play_billing.zzdc<? extends V> r0 = r0.f45887zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.zzcm.zze
            if (r4 == 0) goto L52
            r4 = r0
            com.google.android.gms.internal.play_billing.zzcm r4 = (com.google.android.gms.internal.play_billing.zzcm) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.zzcm.zzb
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = zzh(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzcm.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zzl();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj2 = this.valueField;
        return (obj2 != null) & zzh(obj2);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb6 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb6.append(getClass().getSimpleName());
        } else {
            sb6.append(getClass().getName());
        }
        sb6.append('@');
        sb6.append(Integer.toHexString(System.identityHashCode(this)));
        sb6.append("[status=");
        if (this.valueField instanceof zza) {
            sb6.append("CANCELLED");
        } else if (isDone()) {
            zzt(sb6);
        } else {
            int length = sb6.length();
            sb6.append("PENDING");
            Object obj2 = this.valueField;
            if (obj2 instanceof zzb) {
                sb6.append(", setFuture=[");
                zzdc<? extends V> zzdcVar = ((zzb) obj2).f45887zzb;
                try {
                    if (zzdcVar == this) {
                        sb6.append("this future");
                    } else {
                        sb6.append(zzdcVar);
                    }
                } catch (Throwable th10) {
                    zzdd.zza(th10);
                    sb6.append("Exception thrown from implementation: ");
                    sb6.append(th10.getClass());
                }
                sb6.append("]");
            } else {
                try {
                    strConcat = zzbm.zza(zzd());
                } catch (Throwable th11) {
                    zzdd.zza(th11);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th11.getClass()));
                }
                if (strConcat != null) {
                    d.C(sb6, ", info=[", strConcat, "]");
                }
            }
            if (isDone()) {
                sb6.delete(length, sb6.length());
                zzt(sb6);
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzbj.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.f45890zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.f45890zza);
        }
        zzv(runnable, executor);
    }

    public String zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdi
    public final Throwable zze() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj2 = this.valueField;
        if (obj2 instanceof zzc) {
            return ((zzc) obj2).f45889zzb;
        }
        return null;
    }

    public void zzg() {
    }

    public final boolean zzi(Throwable th10) {
        if (!zzcn.zzq(this, null, new zzc(th10))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    public final boolean zzj(zzdc zzdcVar) {
        zzc zzcVar;
        Object obj2 = this.valueField;
        if (obj2 == null) {
            if (zzdcVar.isDone()) {
                if (!zzcn.zzq(this, null, zzr(zzdcVar))) {
                    return false;
                }
                zzu(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, zzdcVar);
            if (zzcn.zzq(this, null, zzbVar)) {
                try {
                    zzdcVar.zzb(zzbVar, zzcs.INSTANCE);
                } catch (Throwable th10) {
                    try {
                        zzcVar = new zzc(th10);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.f45888zza;
                    }
                    zzcn.zzq(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj2 = this.valueField;
        }
        if (obj2 instanceof zza) {
            zzdcVar.cancel(((zza) obj2).f45884zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzm(j2, timeUnit);
    }
}
