package yfm;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class g implements dom.b {
    private static final /* synthetic */ g[] $VALUES;
    public static final g CANCELLED;

    static {
        g gVar = new g("CANCELLED", 0);
        CANCELLED = gVar;
        $VALUES = new g[]{gVar};
    }

    public static boolean b(AtomicReference atomicReference) {
        dom.b bVar;
        dom.b bVar2 = (dom.b) atomicReference.get();
        g gVar = CANCELLED;
        if (bVar2 == gVar || (bVar = (dom.b) atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.cancel();
        return true;
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, long j2) {
        dom.b bVar = (dom.b) atomicReference.get();
        if (bVar != null) {
            bVar.a(j2);
            return;
        }
        if (f(j2)) {
            com.bumptech.glide.d.a(atomicLong, j2);
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
        mfm.f.b(bVar, "s is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                mo3.a.m(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(long j2) {
        if (j2 > 0) {
            return true;
        }
        mo3.a.m(new IllegalArgumentException(p.a.m(j2, "n > 0 required but it was ")));
        return false;
    }

    public static boolean h(dom.b bVar, dom.b bVar2) {
        if (bVar2 == null) {
            mo3.a.m(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.cancel();
        mo3.a.m(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // dom.b
    public final void cancel() {
    }
}
