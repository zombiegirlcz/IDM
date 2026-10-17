package rkm;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f254897b = AtomicLongFieldUpdater.newUpdater(f.class, "a");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f254898a;

    public final String toString() {
        return String.valueOf(this.f254898a);
    }
}
