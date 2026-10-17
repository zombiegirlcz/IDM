package zb;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f320790a;

    public p(ExecutorService executorService) {
        this.f320790a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f320790a.execute(new de.j(runnable, 2));
    }
}
