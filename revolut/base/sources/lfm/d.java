package lfm;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class d implements ifm.c {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DISPOSED;

    static {
        d dVar = new d("DISPOSED", 0);
        DISPOSED = dVar;
        $VALUES = new d[]{dVar};
    }

    public static boolean a(AtomicReference atomicReference) {
        ifm.c cVar;
        ifm.c cVar2 = (ifm.c) atomicReference.get();
        d dVar = DISPOSED;
        if (cVar2 == dVar || (cVar = (ifm.c) atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar.dispose();
        return true;
    }

    public static boolean b(ifm.c cVar) {
        return cVar == DISPOSED;
    }

    public static boolean c(AtomicReference atomicReference, ifm.c cVar) {
        while (true) {
            ifm.c cVar2 = (ifm.c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean d(AtomicReference atomicReference, ifm.c cVar) {
        while (true) {
            ifm.c cVar2 = (ifm.c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            if (cVar2 == null) {
                return true;
            }
            cVar2.dispose();
            return true;
        }
    }

    public static boolean e(AtomicReference atomicReference, ifm.c cVar) {
        mfm.f.b(cVar, "d is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                mo3.a.m(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(ifm.c cVar, ifm.c cVar2) {
        if (cVar2 == null) {
            mo3.a.m(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        mo3.a.m(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // ifm.c
    public final void dispose() {
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return true;
    }
}
