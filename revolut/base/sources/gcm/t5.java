package gcm;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes22.dex */
public final class t5 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f142884c = Logger.getLogger(t5.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f142885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f142886b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f142886b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th10) {
                f142884c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th10);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable, "'task' must not be null.");
        if (this.f142885a) {
            if (this.f142886b == null) {
                this.f142886b = new ArrayDeque(4);
            }
            this.f142886b.add(runnable);
            return;
        }
        this.f142885a = true;
        try {
            runnable.run();
        } catch (Throwable th10) {
            try {
                f142884c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th10);
                if (this.f142886b != null) {
                    a();
                }
                this.f142885a = false;
            } finally {
                if (this.f142886b != null) {
                    a();
                }
                this.f142885a = false;
            }
        }
    }
}
