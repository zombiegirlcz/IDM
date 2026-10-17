package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.internal.play_billing.zzcm;
import com.google.android.gms.internal.play_billing.zzcn;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzcn<V> extends zzdi implements zzdc<V> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Object f45893zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final zzdb f45894zzb = new zzdb(zzcm.class);

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final boolean f45895zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zza f45896zzd;
    volatile zzcm.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(zzcr zzcrVar) {
        }

        public abstract zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar);

        public abstract zze zzb(zzcn zzcnVar, zze zzeVar);

        public abstract void zzc(zze zzeVar, zze zzeVar2);

        public abstract void zzd(zze zzeVar, Thread thread);

        public abstract boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2);

        public abstract boolean zzf(zzcn zzcnVar, Object obj2, Object obj3);

        public abstract boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2);
    }

    final class zzb extends zza {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<zze, Thread> f45897zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<zze, zze> f45898zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<? super zzcn<?>, zze> f45899zzc = AtomicReferenceFieldUpdater.newUpdater(zzcn.class, zze.class, "waitersField");

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<? super zzcn<?>, zzcm.zzd> f45900zzd = AtomicReferenceFieldUpdater.newUpdater(zzcn.class, zzcm.zzd.class, "listenersField");

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater<? super zzcn<?>, Object> f45901zze = AtomicReferenceFieldUpdater.newUpdater(zzcn.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar) {
            return f45900zzd.getAndSet(zzcnVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final zze zzb(zzcn zzcnVar, zze zzeVar) {
            return f45899zzc.getAndSet(zzcnVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final void zzc(zze zzeVar, zze zzeVar2) {
            f45898zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final void zzd(zze zzeVar, Thread thread) {
            f45897zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
            return zzco.zza(f45900zzd, zzcnVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zzf(zzcn zzcnVar, Object obj2, Object obj3) {
            return zzco.zza(f45901zze, zzcnVar, obj2, obj3);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2) {
            return zzco.zza(f45899zzc, zzcnVar, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzb(zzcr zzcrVar) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar) {
            zzcm.zzd zzdVar2;
            synchronized (zzcnVar) {
                try {
                    zzdVar2 = zzcnVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzcnVar.listenersField = zzdVar;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final zze zzb(zzcn zzcnVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzcnVar) {
                try {
                    zzeVar2 = zzcnVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzcnVar.waitersField = zzeVar;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
            synchronized (zzcnVar) {
                try {
                    if (zzcnVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzcnVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zzf(zzcn zzcnVar, Object obj2, Object obj3) {
            synchronized (zzcnVar) {
                try {
                    if (zzcnVar.valueField != obj2) {
                        return false;
                    }
                    zzcnVar.valueField = obj3;
                    return true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzcnVar) {
                try {
                    if (zzcnVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzcnVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        public /* synthetic */ zzc(zzcr zzcrVar) {
            super(null);
        }
    }

    final class zzd extends zza {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final Unsafe f45902zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        static final long f45903zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        static final long f45904zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        static final long f45905zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        static final long f45906zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        static final long f45907zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        public static final /* synthetic */ int f45908zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcq
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException {
                        int i = zzcn.zzd.f45908zzg;
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
                f45904zzc = unsafe.objectFieldOffset(zzcn.class.getDeclaredField("waitersField"));
                f45903zzb = unsafe.objectFieldOffset(zzcn.class.getDeclaredField("listenersField"));
                f45905zzd = unsafe.objectFieldOffset(zzcn.class.getDeclaredField("valueField"));
                f45906zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                f45907zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                f45902zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar) {
            zzcm.zzd zzdVar2;
            do {
                zzdVar2 = zzcnVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzcnVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final zze zzb(zzcn zzcnVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzcnVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzcnVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final void zzc(zze zzeVar, zze zzeVar2) {
            f45902zza.putObject(zzeVar, f45907zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final void zzd(zze zzeVar, Thread thread) {
            f45902zza.putObject(zzeVar, f45906zze, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
            return zzcp.zza(f45902zza, zzcnVar, f45903zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zzf(zzcn zzcnVar, Object obj2, Object obj3) {
            return zzcp.zza(f45902zza, zzcnVar, f45905zzd, obj2, obj3);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        public final boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2) {
            return zzcp.zza(f45902zza, zzcnVar, f45904zzc, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzd(zzcr zzcrVar) {
            super(null);
        }
    }

    final class zze {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        static final zze f45909zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z) {
        }

        public zze() {
            zzcn.zzn(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th10;
        Throwable th11;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f45895zzc = z;
        String property = System.getProperty("java.runtime.name", "");
        zzcr zzcrVar = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(zzcrVar);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(zzcrVar);
                    th10 = null;
                    th11 = e;
                } catch (Error | Exception e2) {
                    th10 = e2;
                    th11 = e;
                    zzcVar = new zzc(zzcrVar);
                }
            }
        } else {
            try {
                zzcVar = new zzb(zzcrVar);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(zzcrVar);
            }
        }
        th10 = null;
        th11 = null;
        f45896zzd = zzcVar;
        if (th10 != null) {
            zzdb zzdbVar = f45894zzb;
            Logger loggerZza = zzdbVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th11);
            zzdbVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th10);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.f45909zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!f45896zzd.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static /* synthetic */ void zzn(zze zzeVar, Thread thread) {
        f45896zzd.zzd(zzeVar, thread);
    }

    public static boolean zzq(zzcn zzcnVar, Object obj2, Object obj3) {
        return f45896zzd.zzf(zzcnVar, obj2, obj3);
    }

    public final zzcm.zzd zzk(zzcm.zzd zzdVar) {
        return f45896zzd.zza(this, zzdVar);
    }

    public final Object zzl() throws ExecutionException, InterruptedException {
        Object obj2;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj3 = this.valueField;
        if ((obj3 != null) && zzcm.zzh(obj3)) {
            return zzcm.zzc(obj3);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.f45909zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = f45896zzd;
                zzaVar.zzc(zzeVar2, zzeVar);
                if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj2 = this.valueField;
                    } while (!((obj2 != null) & zzcm.zzh(obj2)));
                    return zzcm.zzc(obj2);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.f45909zza);
        }
        Object obj4 = this.valueField;
        Objects.requireNonNull(obj4);
        return zzcm.zzc(obj4);
    }

    public final Object zzm(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        boolean z = true;
        if ((obj2 != null) && zzcm.zzh(obj2)) {
            return zzcm.zzc(obj2);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.f45909zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = f45896zzd;
                    zzaVar.zzc(zzeVar2, zzeVar);
                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj3 = this.valueField;
                            if ((obj3 != null) && zzcm.zzh(obj3)) {
                                return zzcm.zzc(obj3);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.f45909zza);
            }
            Object obj4 = this.valueField;
            Objects.requireNonNull(obj4);
            return zzcm.zzc(obj4);
        }
        while (nanos > 0) {
            Object obj5 = this.valueField;
            if ((obj5 != null) && zzcm.zzh(obj5)) {
                return zzcm.zzc(obj5);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
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
        throw new TimeoutException(a.o(strConcat, " for ", string));
    }

    public final void zzo() {
        for (zze zzeVarZzb = f45896zzd.zzb(this, zze.f45909zza); zzeVarZzb != null; zzeVarZzb = zzeVarZzb.next) {
            Thread thread = zzeVarZzb.thread;
            if (thread != null) {
                zzeVarZzb.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean zzp(zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
        return f45896zzd.zze(this, zzdVar, zzdVar2);
    }
}
