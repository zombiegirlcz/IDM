package je;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.Tasks;
import ht0.b0;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f173167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f173168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f173169c;

    public d(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.f173167a = new b(backgroundExecutorService);
        this.f173168b = new b(backgroundExecutorService);
        Tasks.forResult(null);
        this.f173169c = new b(blockingExecutorService);
    }

    public static final void a() {
        c cVar = Companion;
        cVar.getClass();
        if (((Boolean) new b0(0, cVar, c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 4).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + c.a() + CoreConstants.DOT;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    public static final void b() {
        c cVar = Companion;
        cVar.getClass();
        if (((Boolean) new b0(0, cVar, c.class, "isBlockingThread", "isBlockingThread()Z", 0, 5).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + c.a() + CoreConstants.DOT;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    public static final void c() {
        c cVar = Companion;
        cVar.getClass();
        if (((Boolean) new b0(0, cVar, c.class, "isNotMainThread", "isNotMainThread()Z", 0, 6).invoke()).booleanValue()) {
            return;
        }
        String str = "Must not be called on a main thread, was called on " + c.a() + CoreConstants.DOT;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    public static final void d() {
        Companion.getClass();
    }
}
