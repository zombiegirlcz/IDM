package sf0;

import java.lang.Thread;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Thread.UncaughtExceptionHandler, e0m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f262254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0m.b f262255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f262256c;

    public f() {
        this(0);
    }

    @Override // e0m.d
    public final void init() {
        this.f262255b.init();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t2, Throwable e) {
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f262254a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t2, this.f262256c.a(e));
        }
    }

    public f(int i) {
        this.f262254a = Thread.getDefaultUncaughtExceptionHandler();
        this.f262255b = new e0m.b(new ite.d(this, 27));
        this.f262256c = new e(new o());
    }
}
