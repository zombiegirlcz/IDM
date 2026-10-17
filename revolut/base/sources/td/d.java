package td;

import java.util.concurrent.Executor;
import y8.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269906a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f269906a) {
            case 0:
                runnable.run();
                break;
            case 1:
                l.f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
