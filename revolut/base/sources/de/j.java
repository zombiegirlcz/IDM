package de;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f113280b;

    public /* synthetic */ j(Runnable runnable, int i) {
        this.f113279a = i;
        this.f113280b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f113279a) {
            case 0:
                this.f113280b.run();
                break;
            case 1:
                Process.setThreadPriority(10);
                this.f113280b.run();
                break;
            default:
                try {
                    this.f113280b.run();
                } catch (Exception e) {
                    nim.a.k("Executor", "Background execution failure.", e);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f113279a) {
            case 0:
                return this.f113280b.toString();
            default:
                return super.toString();
        }
    }
}
