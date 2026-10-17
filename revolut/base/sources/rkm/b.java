package rkm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f254893b = AtomicIntegerFieldUpdater.newUpdater(b.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f254894a;

    public final boolean a() {
        return f254893b.compareAndSet(this, 0, 1);
    }

    public final boolean b() {
        return this.f254894a != 0;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
