package e8;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123430a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f123430a) {
            case 0:
                return new Thread(new de.j(runnable, 1), "glide-active-resources");
            default:
                return new Thread(runnable, "SplitCompatBackgroundThread");
        }
    }
}
