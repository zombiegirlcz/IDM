package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzec<V> extends zzez implements zzev<V> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final boolean f41350zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Logger f41351zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final zza f41352zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object f41353zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzj waiters;

    abstract class zza {
        public /* synthetic */ zza(zzeb zzebVar) {
        }

        public abstract zzd zza(zzec zzecVar, zzd zzdVar);

        public abstract zzj zzb(zzec zzecVar, zzj zzjVar);

        public abstract void zzc(zzj zzjVar, zzj zzjVar2);

        public abstract void zzd(zzj zzjVar, Thread thread);

        public abstract boolean zze(zzec zzecVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzec zzecVar, Object obj2, Object obj3);

        public abstract boolean zzg(zzec zzecVar, zzj zzjVar, zzj zzjVar2);
    }

    final class zzb {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zzb f41354zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        static final zzb f41355zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        final boolean f41356zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        final Throwable f41357zzd;

        static {
            if (zzec.f41350zza) {
                f41355zzb = null;
                f41354zza = null;
            } else {
                f41355zzb = new zzb(false, null);
                f41354zza = new zzb(true, null);
            }
        }

        public zzb(boolean z, Throwable th10) {
            this.f41356zzc = z;
            this.f41357zzd = th10;
        }
    }

    final class zzc {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zzc f41358zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final Throwable f41359zzb;

        public zzc(Throwable th10) {
            th10.getClass();
            this.f41359zzb = th10;
        }
    }

    final class zzd {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zzd f41360zza = new zzd();
        zzd next;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final Runnable f41361zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        final Executor f41362zzc;

        public zzd() {
            this.f41361zzb = null;
            this.f41362zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.f41361zzb = runnable;
            this.f41362zzc = executor;
        }
    }

    final class zze extends zza {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzj, Thread> f41363zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzj, zzj> f41364zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzec, zzj> f41365zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzec, zzd> f41366zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzec, Object> f41367zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.f41363zza = atomicReferenceFieldUpdater;
            this.f41364zzb = atomicReferenceFieldUpdater2;
            this.f41365zzc = atomicReferenceFieldUpdater3;
            this.f41366zzd = atomicReferenceFieldUpdater4;
            this.f41367zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final zzd zza(zzec zzecVar, zzd zzdVar) {
            return this.f41366zzd.getAndSet(zzecVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final zzj zzb(zzec zzecVar, zzj zzjVar) {
            return this.f41365zzc.getAndSet(zzecVar, zzjVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            this.f41364zzb.lazySet(zzjVar, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            this.f41363zza.lazySet(zzjVar, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zze(zzec zzecVar, zzd zzdVar, zzd zzdVar2) {
            return zzed.zza(this.f41366zzd, zzecVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zzf(zzec zzecVar, Object obj2, Object obj3) {
            return zzed.zza(this.f41367zze, zzecVar, obj2, obj3);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zzg(zzec zzecVar, zzj zzjVar, zzj zzjVar2) {
            return zzed.zza(this.f41365zzc, zzecVar, zzjVar, zzjVar2);
        }
    }

    final class zzf<V> implements Runnable {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        final zzec<V> f41368zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        final zzev<? extends V> f41369zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    final class zzg extends zza {
        public /* synthetic */ zzg(zzee zzeeVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final zzd zza(zzec zzecVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzecVar) {
                try {
                    zzdVar2 = zzecVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzecVar.listeners = zzdVar;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final zzj zzb(zzec zzecVar, zzj zzjVar) {
            zzj zzjVar2;
            synchronized (zzecVar) {
                try {
                    zzjVar2 = zzecVar.waiters;
                    if (zzjVar2 != zzjVar) {
                        zzecVar.waiters = zzjVar;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            zzjVar.next = zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            zzjVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zze(zzec zzecVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzecVar) {
                try {
                    if (zzecVar.listeners != zzdVar) {
                        return false;
                    }
                    zzecVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zzf(zzec zzecVar, Object obj2, Object obj3) {
            synchronized (zzecVar) {
                try {
                    if (zzecVar.value != obj2) {
                        return false;
                    }
                    zzecVar.value = obj3;
                    return true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zzg(zzec zzecVar, zzj zzjVar, zzj zzjVar2) {
            synchronized (zzecVar) {
                try {
                    if (zzecVar.waiters != zzjVar) {
                        return false;
                    }
                    zzecVar.waiters = zzjVar2;
                    return true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        private zzg() {
            super(null);
        }
    }

    interface zzh<V> extends zzev<V> {
    }

    final class zzi extends zza {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final Unsafe f41370zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        static final long f41371zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        static final long f41372zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        static final long f41373zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        static final long f41374zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        static final long f41375zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzi.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj2 = field.get(null);
                            if (Unsafe.class.isInstance(obj2)) {
                                return (Unsafe) Unsafe.class.cast(obj2);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                f41372zzc = unsafe.objectFieldOffset(zzec.class.getDeclaredField("waiters"));
                f41371zzb = unsafe.objectFieldOffset(zzec.class.getDeclaredField("listeners"));
                f41373zzd = unsafe.objectFieldOffset(zzec.class.getDeclaredField("value"));
                f41374zze = unsafe.objectFieldOffset(zzj.class.getDeclaredField("thread"));
                f41375zzf = unsafe.objectFieldOffset(zzj.class.getDeclaredField("next"));
                f41370zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e4) {
                throw e4;
            }
        }

        public /* synthetic */ zzi(zzeg zzegVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final zzd zza(zzec zzecVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzecVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzecVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final zzj zzb(zzec zzecVar, zzj zzjVar) {
            zzj zzjVar2;
            do {
                zzjVar2 = zzecVar.waiters;
                if (zzjVar == zzjVar2) {
                    break;
                }
            } while (!zzg(zzecVar, zzjVar2, zzjVar));
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            f41370zza.putObject(zzjVar, f41375zzf, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            f41370zza.putObject(zzjVar, f41374zze, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zze(zzec zzecVar, zzd zzdVar, zzd zzdVar2) {
            return zzef.zza(f41370zza, zzecVar, f41371zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zzf(zzec zzecVar, Object obj2, Object obj3) {
            return zzef.zza(f41370zza, zzecVar, f41373zzd, obj2, obj3);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza
        public final boolean zzg(zzec zzecVar, zzj zzjVar, zzj zzjVar2) {
            return zzef.zza(f41370zza, zzecVar, f41372zzc, zzjVar, zzjVar2);
        }

        private zzi() {
            super(null);
        }
    }

    final class zzj {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zzj f41376zza = new zzj(false);
        volatile zzj next;
        volatile Thread thread;

        public zzj(boolean z) {
        }

        public zzj() {
            zzec.f41352zzc.zzd(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        Throwable th10;
        zza zzgVar;
        Throwable th11;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f41350zza = z;
        f41351zzb = Logger.getLogger(zzec.class.getName());
        Object[] objArr = 0;
        try {
            zzgVar = new zzi(null);
            th10 = null;
            th11 = null;
        } catch (Error | RuntimeException e) {
            try {
                th10 = null;
                th11 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzj.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzj.class, zzj.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzec.class, zzj.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzec.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzec.class, Object.class, "value"));
            } catch (Error | RuntimeException e2) {
                th10 = e2;
                zzgVar = new zzg(objArr == true ? 1 : 0);
                th11 = e;
            }
        }
        f41352zzc = zzgVar;
        if (th10 != null) {
            Logger logger = f41351zzb;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th11);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th10);
        }
        f41353zzd = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzo(zzev zzevVar) {
        Throwable thZzf;
        if (zzevVar instanceof zzh) {
            Object zzbVar = ((zzec) zzevVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.f41356zzc) {
                    Throwable th10 = zzbVar2.f41357zzd;
                    zzbVar = th10 != null ? new zzb(false, th10) : zzb.f41355zzb;
                }
            }
            zzbVar.getClass();
            return zzbVar;
        }
        if ((zzevVar instanceof zzez) && (thZzf = ((zzez) zzevVar).zzf()) != null) {
            return new zzc(thZzf);
        }
        boolean zIsCancelled = zzevVar.isCancelled();
        if ((!f41350zza) && zIsCancelled) {
            zzb zzbVar3 = zzb.f41355zzb;
            zzbVar3.getClass();
            return zzbVar3;
        }
        try {
            Object objZzp = zzp(zzevVar);
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzevVar)))) : objZzp == null ? f41353zzd : objZzp;
        } catch (Error | RuntimeException e) {
            return new zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzevVar)), e2)) : new zzb(false, e2);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzevVar)), e4)) : new zzc(e4.getCause());
        }
    }

    private static Object zzp(Future future) throws ExecutionException {
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

    private final void zzq(StringBuilder sb6) {
        try {
            Object objZzp = zzp(this);
            sb6.append("SUCCESS, result=[");
            if (objZzp == null) {
                sb6.append("null");
            } else if (objZzp == this) {
                sb6.append("this future");
            } else {
                sb6.append(objZzp.getClass().getName());
                sb6.append("@");
                sb6.append(Integer.toHexString(System.identityHashCode(objZzp)));
            }
            sb6.append("]");
        } catch (CancellationException unused) {
            sb6.append("CANCELLED");
        } catch (RuntimeException e) {
            sb6.append("UNKNOWN, cause=[");
            sb6.append(e.getClass());
            sb6.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb6.append("FAILURE, cause=[");
            sb6.append(e2.getCause());
            sb6.append("]");
        }
    }

    private final void zzr(StringBuilder sb6) {
        String strConcat;
        int length = sb6.length();
        sb6.append("PENDING");
        Object obj2 = this.value;
        if (obj2 instanceof zzf) {
            sb6.append(", setFuture=[");
            zzs(sb6, ((zzf) obj2).f41369zzb);
            sb6.append("]");
        } else {
            try {
                strConcat = zzbd.zza(zze());
            } catch (RuntimeException | StackOverflowError e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null) {
                d.C(sb6, ", info=[", strConcat, "]");
            }
        }
        if (isDone()) {
            sb6.delete(length, sb6.length());
            zzq(sb6);
        }
    }

    private final void zzs(StringBuilder sb6, Object obj2) {
        try {
            if (obj2 == this) {
                sb6.append("this future");
            } else {
                sb6.append(obj2);
            }
        } catch (RuntimeException e) {
            e = e;
            sb6.append("Exception thrown from implementation: ");
            sb6.append(e.getClass());
        } catch (StackOverflowError e2) {
            e = e2;
            sb6.append("Exception thrown from implementation: ");
            sb6.append(e.getClass());
        }
    }

    private static void zzt(zzec zzecVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzj zzjVarZzb = f41352zzc.zzb(zzecVar, zzj.f41376zza); zzjVarZzb != null; zzjVarZzb = zzjVarZzb.next) {
                Thread thread = zzjVarZzb.thread;
                if (thread != null) {
                    zzjVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzecVar.zzk();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZza = f41352zzc.zza(zzecVar, zzd.f41360zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.f41361zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzecVar = zzfVar.f41368zza;
                    if (zzecVar.value == zzfVar) {
                        if (f41352zzc.zzf(zzecVar, zzfVar, zzo(zzfVar.f41369zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.f41362zzc;
                    executor.getClass();
                    zzu(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private static void zzu(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f41351zzb.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", d.s("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    private final void zzv(zzj zzjVar) {
        zzjVar.thread = null;
        while (true) {
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzj.f41376zza) {
                zzj zzjVar3 = null;
                while (zzjVar2 != null) {
                    zzj zzjVar4 = zzjVar2.next;
                    if (zzjVar2.thread != null) {
                        zzjVar3 = zzjVar2;
                    } else if (zzjVar3 != null) {
                        zzjVar3.next = zzjVar4;
                        if (zzjVar3.thread == null) {
                            break;
                        }
                    } else if (!f41352zzc.zzg(this, zzjVar2, zzjVar4)) {
                        break;
                    }
                    zzjVar2 = zzjVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzw(Object obj2) throws ExecutionException {
        if (obj2 instanceof zzb) {
            Throwable th10 = ((zzb) obj2).f41357zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th10);
            throw cancellationException;
        }
        if (obj2 instanceof zzc) {
            throw new ExecutionException(((zzc) obj2).f41359zzb);
        }
        if (obj2 == f41353zzd) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
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
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzf
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
            boolean r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzec.f41350zza
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_barcode.zzec$zzb r1 = new com.google.android.gms.internal.mlkit_vision_barcode.zzec$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_barcode.zzec$zzb r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzb.f41354zza
            goto L26
        L24:
            com.google.android.gms.internal.mlkit_vision_barcode.zzec$zzb r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzb.f41355zzb
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.mlkit_vision_barcode.zzec$zza r6 = com.google.android.gms.internal.mlkit_vision_barcode.zzec.f41352zzc
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzt(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzf
            if (r4 == 0) goto L57
            com.google.android.gms.internal.mlkit_vision_barcode.zzec$zzf r0 = (com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzf) r0
            com.google.android.gms.internal.mlkit_vision_barcode.zzev<? extends V> r0 = r0.f41369zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzh
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_barcode.zzec r4 = (com.google.android.gms.internal.mlkit_vision_barcode.zzec) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzf
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzec.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj2;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj3 = this.value;
        if ((obj3 != null) && (!(obj3 instanceof zzf))) {
            return zzw(obj3);
        }
        zzj zzjVar = this.waiters;
        if (zzjVar != zzj.f41376zza) {
            zzj zzjVar2 = new zzj();
            do {
                zza zzaVar = f41352zzc;
                zzaVar.zzc(zzjVar2, zzjVar);
                if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzv(zzjVar2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                    } while (!((obj2 != null) & (!(obj2 instanceof zzf))));
                    return zzw(obj2);
                }
                zzjVar = this.waiters;
            } while (zzjVar != zzj.f41376zza);
        }
        Object obj4 = this.value;
        obj4.getClass();
        return zzw(obj4);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb6.append(getClass().getSimpleName());
        } else {
            sb6.append(getClass().getName());
        }
        sb6.append('@');
        sb6.append(Integer.toHexString(System.identityHashCode(this)));
        sb6.append("[status=");
        if (this.value instanceof zzb) {
            sb6.append("CANCELLED");
        } else if (isDone()) {
            zzq(sb6);
        } else {
            zzr(sb6);
        }
        sb6.append("]");
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zze() {
        if (this instanceof ScheduledFuture) {
            return p.a.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzez
    public final Throwable zzf() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj2 = this.value;
        if (obj2 instanceof zzc) {
            return ((zzc) obj2).f41359zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzev
    public final void zzj(Runnable runnable, Executor executor) {
        zzd zzdVar;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (zzdVar = this.listeners) != zzd.f41360zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (f41352zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.f41360zza);
        }
        zzu(runnable, executor);
    }

    public void zzk() {
    }

    public final boolean zzl(Throwable th10) {
        if (!f41352zzc.zzf(this, null, new zzc(th10))) {
            return false;
        }
        zzt(this, false);
        return true;
    }

    public final boolean zzm(zzev zzevVar) {
        zzevVar.getClass();
        Object obj2 = this.value;
        if (obj2 != null) {
            if (obj2 instanceof zzb) {
            }
            return false;
        }
        if (!f41352zzc.zzf(this, null, zzo(zzevVar))) {
            return false;
        }
        zzt(this, false);
        return true;
    }

    public final boolean zzn() {
        Object obj2 = this.value;
        return (obj2 instanceof zzb) && ((zzb) obj2).f41356zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            boolean z = true;
            if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                return zzw(obj2);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzj zzjVar = this.waiters;
                if (zzjVar != zzj.f41376zza) {
                    zzj zzjVar2 = new zzj();
                    do {
                        zza zzaVar = f41352zzc;
                        zzaVar.zzc(zzjVar2, zzjVar);
                        if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj3 = this.value;
                                    if ((obj3 != null) & (!(obj3 instanceof zzf))) {
                                        return zzw(obj3);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzv(zzjVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzv(zzjVar2);
                        } else {
                            zzjVar = this.waiters;
                        }
                    } while (zzjVar != zzj.f41376zza);
                }
                Object obj4 = this.value;
                obj4.getClass();
                return zzw(obj4);
            }
            while (nanos > 0) {
                Object obj5 = this.value;
                if ((obj5 != null) & (!(obj5 instanceof zzf))) {
                    return zzw(obj5);
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
