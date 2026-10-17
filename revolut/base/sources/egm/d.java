package egm;

import android.os.Handler;
import fgm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import jb3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Runnable, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125672a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f125673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f125674c;
    public final Object d;

    public d(Handler handler, Runnable runnable) {
        this.d = handler;
        this.f125673b = runnable;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f125672a) {
            case 0:
                ((Handler) this.d).removeCallbacks(this);
                this.f125674c = true;
                break;
            default:
                this.f125674c = true;
                ((o) this.d).dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f125672a) {
        }
        return this.f125674c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f125672a) {
            case 0:
                try {
                    this.f125673b.run();
                    return;
                } catch (Throwable th10) {
                    l.v(th10);
                    return;
                }
            default:
                if (this.f125674c) {
                    return;
                }
                try {
                    this.f125673b.run();
                    return;
                } catch (Throwable th11) {
                    dispose();
                    l.v(th11);
                    throw th11;
                }
        }
    }

    public d(Runnable runnable, o oVar) {
        this.f125673b = runnable;
        this.d = oVar;
    }
}
