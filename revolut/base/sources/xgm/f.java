package xgm;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class f implements dom.b {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CANCELLED;

    static {
        f fVar = new f("CANCELLED", 0);
        CANCELLED = fVar;
        $VALUES = new f[]{fVar};
    }

    public static void b(AtomicReference atomicReference) {
        dom.b bVar;
        dom.b bVar2 = (dom.b) atomicReference.get();
        f fVar = CANCELLED;
        if (bVar2 == fVar || (bVar = (dom.b) atomicReference.getAndSet(fVar)) == fVar || bVar == null) {
            return;
        }
        bVar.cancel();
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, long j2) {
        dom.b bVar = (dom.b) atomicReference.get();
        if (bVar != null) {
            bVar.a(j2);
            return;
        }
        if (f(j2)) {
            xam.a.b(atomicLong, j2);
            dom.b bVar2 = (dom.b) atomicReference.get();
            if (bVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    bVar2.a(andSet);
                }
            }
        }
    }

    public static void d(AtomicReference atomicReference, AtomicLong atomicLong, dom.b bVar) {
        if (e(atomicReference, bVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                bVar.a(andSet);
            }
        }
    }

    public static boolean e(AtomicReference atomicReference, dom.b bVar) {
        Objects.requireNonNull(bVar, "s is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                l.v(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(long j2) {
        if (j2 > 0) {
            return true;
        }
        l.v(new IllegalArgumentException(p.a.m(j2, "n > 0 required but it was ")));
        return false;
    }

    public static boolean h(dom.b bVar, dom.b bVar2) {
        if (bVar2 == null) {
            l.v(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.cancel();
        l.v(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // dom.b
    public final void cancel() {
    }
}
