package qf0;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import com.revolut.core.error.data.model.UnrecoverableStateException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityManager f245210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f245211b;

    public e(ActivityManager activityManager, xk0.a process, pl0.a runtimeWrapper) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(runtimeWrapper, "runtimeWrapper");
        this.f245210a = activityManager;
        this.f245211b = new AtomicBoolean(false);
    }

    @Override // qf0.a
    public final Object P(Exception exc2, Continuation continuation) {
        if (!(exc2 instanceof UnrecoverableStateException)) {
            return Boolean.FALSE;
        }
        if (this.f245211b.compareAndSet(false, true)) {
            try {
                a();
                if (!this.f245210a.clearApplicationUserData()) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "UnrecoverableStateGuardian", "clearApplicationUserData() rejected", null, h0Var);
                }
                b();
                throw null;
            } catch (Exception e) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "UnrecoverableStateGuardian", "clearApplicationUserData() failed", e, h0Var2);
                b();
                throw null;
            }
        }
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            this.f245210a.setProcessStateSummary(a0.w("SEC_REC"));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "UnrecoverableStateGuardian", "Failed to mark security recovery", e, h0Var);
        }
    }

    public final void b() {
        try {
            Process.killProcess(Process.myPid());
            Runtime.getRuntime().halt(0);
            throw new IllegalStateException("Process termination unexpectedly returned");
        } catch (Throwable th10) {
            Runtime.getRuntime().halt(0);
            throw th10;
        }
    }
}
