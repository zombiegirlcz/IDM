package rkm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f254895b = AtomicIntegerFieldUpdater.newUpdater(d.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f254896a;

    public final int a() {
        return f254895b.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.f254896a);
    }
}
