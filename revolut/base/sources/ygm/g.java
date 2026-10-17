package ygm;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q75.t;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f313672a = new t("No further exceptions", 1);

    public static boolean a(AtomicReference atomicReference, Throwable th10) {
        while (true) {
            Throwable th11 = (Throwable) atomicReference.get();
            if (th11 == f313672a) {
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

    public static NullPointerException b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void c(Object obj2, String str) {
        if (obj2 == null) {
            throw b(str);
        }
    }

    public static Throwable d(AtomicReference atomicReference) {
        Throwable th10 = (Throwable) atomicReference.get();
        t tVar = f313672a;
        return th10 != tVar ? (Throwable) atomicReference.getAndSet(tVar) : th10;
    }

    public static String e(long j2, TimeUnit timeUnit) {
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "The source did not signal an event for ", " ");
        sbV.append(timeUnit.toString().toLowerCase());
        sbV.append(" and has been terminated.");
        return sbV.toString();
    }

    public static RuntimeException f(Throwable th10) {
        if (th10 instanceof Error) {
            throw ((Error) th10);
        }
        return th10 instanceof RuntimeException ? (RuntimeException) th10 : new RuntimeException(th10);
    }
}
