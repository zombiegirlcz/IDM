package ie;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.r f160568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fc.g f160569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f160570c;
    public final fe.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public t(mp.r rVar, fc.g gVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fe.a aVar) {
        this.f160568a = rVar;
        this.f160569b = gVar;
        this.f160570c = uncaughtExceptionHandler;
        this.d = aVar;
    }

    public final boolean a(Thread thread, Throwable th10) {
        if (thread != null && th10 != null) {
            if (!this.d.b()) {
                return true;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th10) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f160570c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th10)) {
                    this.f160568a.l(this.f160569b, thread, th10);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th10);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                fe.c cVar = fe.c.f134428a;
                if (cVar.a(6)) {
                }
                if (uncaughtExceptionHandler != null) {
                    cVar.b("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th10);
                } else {
                    cVar.b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th11) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                uncaughtExceptionHandler.uncaughtException(thread, th10);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th11;
        }
    }
}
