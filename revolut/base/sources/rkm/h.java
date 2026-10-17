package rkm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f254899b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f254900a;

    public final boolean a(Object obj2, Object obj3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f254899b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj3)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj2);
        return false;
    }

    public final String toString() {
        return String.valueOf(this.f254900a);
    }
}
