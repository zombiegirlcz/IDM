package zfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f322035a = new g("No further exceptions");

    public static boolean a(AtomicReference atomicReference, Throwable th10) {
        while (true) {
            Throwable th11 = (Throwable) atomicReference.get();
            if (th11 == f322035a) {
                return false;
            }
            Throwable compositeException = th11 == null ? th10 : new CompositeException(th11, th10);
            while (!atomicReference.compareAndSet(th11, compositeException)) {
                if (atomicReference.get() != th11) {
                    break;
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th10 = (Throwable) atomicReference.get();
        g gVar = f322035a;
        return th10 != gVar ? (Throwable) atomicReference.getAndSet(gVar) : th10;
    }

    public static String c(long j2, TimeUnit timeUnit) {
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "The source did not signal an event for ", " ");
        sbV.append(timeUnit.toString().toLowerCase());
        sbV.append(" and has been terminated.");
        return sbV.toString();
    }

    public static RuntimeException d(Throwable th10) {
        if (th10 instanceof Error) {
            throw ((Error) th10);
        }
        return th10 instanceof RuntimeException ? (RuntimeException) th10 : new RuntimeException(th10);
    }
}
