package fk;

import android.os.Looper;
import android.view.View;
import efm.r;
import efm.w;
import efm.y;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import lfm.e;
import mfm.f;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f135701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f135702h;

    public /* synthetic */ b(Object obj2, int i) {
        this.f135701g = i;
        this.f135702h = obj2;
    }

    @Override // efm.r
    public final void subscribeActual(y observer) {
        switch (this.f135701g) {
            case 0:
                View view = (View) this.f135702h;
                Intrinsics.j(observer, "observer");
                if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                    observer.onSubscribe(new ifm.a(f.f205042b, 1));
                    StringBuilder sb6 = new StringBuilder("Expected to be called on the main thread but was ");
                    Thread threadCurrentThread = Thread.currentThread();
                    Intrinsics.g(threadCurrentThread, "Thread.currentThread()");
                    sb6.append(threadCurrentThread.getName());
                    observer.onError(new IllegalStateException(sb6.toString()));
                } else {
                    a aVar = new a(view, observer);
                    observer.onSubscribe(aVar);
                    view.setOnClickListener(aVar);
                }
                break;
            case 1:
                try {
                    Object objCall = ((Callable) this.f135702h).call();
                    f.b(objCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) objCall;
                } catch (Throwable th10) {
                    th = th10;
                    m70.a.u(th);
                }
                e.d(th, observer);
                break;
            default:
                ((w) this.f135702h).subscribe(observer);
                break;
        }
    }

    public b(View view) {
        this.f135701g = 0;
        Intrinsics.j(view, "view");
        this.f135702h = view;
    }
}
