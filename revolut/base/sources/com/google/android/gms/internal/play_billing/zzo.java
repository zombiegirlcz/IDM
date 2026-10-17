package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
public class zzo implements zzdc {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final zzd f46278zzb;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final /* synthetic */ int f46279zzf = 0;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final Object f46281zzh;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    volatile Object f46282zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    volatile zzh f46283zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    volatile zzm f46284zze;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final boolean f46277zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final Logger f46280zzg = Logger.getLogger(zzo.class.getName());

    static {
        zzd zzlVar;
        try {
            zzlVar = new zzj(AtomicReferenceFieldUpdater.newUpdater(zzm.class, Thread.class, "zzb"), AtomicReferenceFieldUpdater.newUpdater(zzm.class, zzm.class, "zzc"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzm.class, "zze"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzh.class, "zzd"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, Object.class, "zzc"));
            th = null;
        } catch (Throwable th10) {
            th = th10;
            zzlVar = new zzl();
        }
        Throwable th11 = th;
        f46278zzb = zzlVar;
        if (th11 != null) {
            f46280zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th11);
        }
        f46281zzh = new Object();
    }

    public static void zzc(zzo zzoVar) {
        zzm zzmVar;
        zzd zzdVar;
        zzh zzhVar;
        do {
            zzmVar = zzoVar.f46284zze;
            zzdVar = f46278zzb;
        } while (!zzdVar.zze(zzoVar, zzmVar, zzm.f46274zza));
        while (zzmVar != null) {
            Thread thread = zzmVar.f46275zzb;
            if (thread != null) {
                zzmVar.f46275zzb = null;
                LockSupport.unpark(thread);
            }
            zzmVar = zzmVar.f46276zzc;
        }
        do {
            zzhVar = zzoVar.f46283zzd;
        } while (!zzdVar.zzc(zzoVar, zzhVar, zzh.f46065zza));
        zzh zzhVar2 = null;
        while (zzhVar != null) {
            zzh zzhVar3 = zzhVar.f46068zzd;
            zzhVar.f46068zzd = zzhVar2;
            zzhVar2 = zzhVar;
            zzhVar = zzhVar3;
        }
        while (zzhVar2 != null) {
            Runnable runnable = zzhVar2.f46066zzb;
            zzh zzhVar4 = zzhVar2.f46068zzd;
            if (runnable instanceof zzk) {
                throw null;
            }
            zzf(runnable, zzhVar2.f46067zzc);
            zzhVar2 = zzhVar4;
        }
    }

    private final void zze(StringBuilder sb6) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th10) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th10;
                }
            } catch (CancellationException unused2) {
                sb6.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb6.append("UNKNOWN, cause=[");
                sb6.append(e.getClass());
                sb6.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb6.append("FAILURE, cause=[");
                sb6.append(e2.getCause());
                sb6.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb6.append("SUCCESS, result=[");
        sb6.append(v == this ? "this future" : String.valueOf(v));
        sb6.append("]");
    }

    private static void zzf(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f46280zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", d.s("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    private final void zzg(zzm zzmVar) {
        zzmVar.f46275zzb = null;
        while (true) {
            zzm zzmVar2 = this.f46284zze;
            if (zzmVar2 != zzm.f46274zza) {
                zzm zzmVar3 = null;
                while (zzmVar2 != null) {
                    zzm zzmVar4 = zzmVar2.f46276zzc;
                    if (zzmVar2.f46275zzb != null) {
                        zzmVar3 = zzmVar2;
                    } else if (zzmVar3 != null) {
                        zzmVar3.f46276zzc = zzmVar4;
                        if (zzmVar3.f46275zzb == null) {
                            break;
                        }
                    } else if (!f46278zzb.zze(this, zzmVar2, zzmVar4)) {
                        break;
                    }
                    zzmVar2 = zzmVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzh(Object obj2) throws ExecutionException {
        if (obj2 instanceof zze) {
            Throwable th10 = ((zze) obj2).f45949zzc;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th10);
            throw cancellationException;
        }
        if (obj2 instanceof zzg) {
            throw new ExecutionException(((zzg) obj2).f46028zza);
        }
        if (obj2 == f46281zzh) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj2 = this.f46282zzc;
        if ((obj2 instanceof zzk) | (obj2 == null)) {
            zze zzeVar = f46277zza ? new zze(z, new CancellationException("Future.cancel() was called.")) : z ? zze.f45947zza : zze.f45948zzb;
            while (!f46278zzb.zzd(this, obj2, zzeVar)) {
                obj2 = this.f46282zzc;
                if (!(obj2 instanceof zzk)) {
                }
            }
            zzc(this);
            if (obj2 instanceof zzk) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj2;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj3 = this.f46282zzc;
        if ((obj3 != null) && (!(obj3 instanceof zzk))) {
            return zzh(obj3);
        }
        zzm zzmVar = this.f46284zze;
        zzm zzmVar2 = zzm.f46274zza;
        if (zzmVar != zzmVar2) {
            zzm zzmVar3 = new zzm();
            do {
                zzd zzdVar = f46278zzb;
                zzdVar.zza(zzmVar3, zzmVar);
                if (zzdVar.zze(this, zzmVar, zzmVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzg(zzmVar3);
                            throw new InterruptedException();
                        }
                        obj2 = this.f46282zzc;
                    } while (!((obj2 != null) & (!(obj2 instanceof zzk))));
                    return zzh(obj2);
                }
                zzmVar = this.f46284zze;
            } while (zzmVar != zzmVar2);
        }
        return zzh(this.f46282zzc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f46282zzc instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f46282zzc != null) & (!(r0 instanceof zzk));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(super.toString());
        sb6.append("[status=");
        if (this.f46282zzc instanceof zze) {
            sb6.append("CANCELLED");
        } else if (isDone()) {
            zze(sb6);
        } else {
            try {
                strConcat = zza();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                d.C(sb6, "PENDING, info=[", strConcat, "]");
            } else if (isDone()) {
                zze(sb6);
            } else {
                sb6.append("PENDING");
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (this.f46282zzc instanceof zzk) {
            return "setFuture=[null]";
        }
        if (this instanceof ScheduledFuture) {
            return a.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void zzb(Runnable runnable, Executor executor) {
        executor.getClass();
        zzh zzhVar = this.f46283zzd;
        zzh zzhVar2 = zzh.f46065zza;
        if (zzhVar != zzhVar2) {
            zzh zzhVar3 = new zzh(runnable, executor);
            do {
                zzhVar3.f46068zzd = zzhVar;
                if (f46278zzb.zzc(this, zzhVar, zzhVar3)) {
                    return;
                } else {
                    zzhVar = this.f46283zzd;
                }
            } while (zzhVar != zzhVar2);
        }
        zzf(runnable, executor);
    }

    public boolean zzd(Object obj2) {
        if (obj2 == null) {
            obj2 = f46281zzh;
        }
        if (!f46278zzb.zzd(this, null, obj2)) {
            return false;
        }
        zzc(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj2 = this.f46282zzc;
            if ((obj2 != null) & (!(obj2 instanceof zzk))) {
                return zzh(obj2);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzm zzmVar = this.f46284zze;
                zzm zzmVar2 = zzm.f46274zza;
                if (zzmVar != zzmVar2) {
                    zzm zzmVar3 = new zzm();
                    z = true;
                    do {
                        zzd zzdVar = f46278zzb;
                        zzdVar.zza(zzmVar3, zzmVar);
                        if (zzdVar.zze(this, zzmVar, zzmVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj3 = this.f46282zzc;
                                    if ((obj3 != null) & (!(obj3 instanceof zzk))) {
                                        return zzh(obj3);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzg(zzmVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzg(zzmVar3);
                        } else {
                            zzmVar = this.f46284zze;
                        }
                    } while (zzmVar != zzmVar2);
                }
                return zzh(this.f46282zzc);
            }
            z = true;
            while (nanos > 0) {
                Object obj4 = this.f46282zzc;
                if ((obj4 != null ? z : false) & (!(obj4 instanceof zzk))) {
                    return zzh(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j3 = -nanos;
                long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(com.google.android.gms.internal.mlkit_vision_face.a.o(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
