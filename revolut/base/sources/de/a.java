package de;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f113261a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113263c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f113262b = str;
        this.f113263c = i;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = e.newThread(new ce.j(this, runnable, 3));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f113262b + " Thread #" + this.f113261a.getAndIncrement());
        return threadNewThread;
    }
}
