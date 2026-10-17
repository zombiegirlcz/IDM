package wu0;

import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.internal.Intrinsics;
import vu0.s;
import vu0.u;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f300047b;

    public /* synthetic */ b(d dVar, int i) {
        this.f300046a = i;
        this.f300047b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f300046a) {
            case 0:
                d dVar = this.f300047b;
                dVar.e = null;
                dVar.f300049a.a(true);
                break;
            default:
                d dVar2 = this.f300047b;
                dVar2.d = null;
                SwipeToActionLayout swipeToActionLayout = dVar2.f300049a;
                if (swipeToActionLayout.getState() != u.OPEN && swipeToActionLayout.getState() != u.OPENING) {
                    c listener = new c(dVar2);
                    dVar2.f = listener;
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    swipeToActionLayout.f57614b.add(listener);
                    swipeToActionLayout.c(true, s.FROM_END_TO_START);
                    break;
                }
                break;
        }
    }
}
