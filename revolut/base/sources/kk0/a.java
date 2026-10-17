package kk0;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f184498a = new HashMap();

    public final void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f184498a) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f184498a.get(key);
                if (reentrantReadWriteLock != null && !reentrantReadWriteLock.hasQueuedThreads()) {
                    this.f184498a.remove(key);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
