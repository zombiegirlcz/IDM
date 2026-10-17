package lki;

import android.view.View;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface r {
    void a(s sVar);

    void b();

    void c(vt3.a aVar);

    void d(View view);

    default r e(ModalDestination.Style style, r10.t navActionsSchedulerObserver) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(navActionsSchedulerObserver, "navActionsSchedulerObserver");
        return null;
    }

    void f(q qVar);

    void g(View view);

    View getView();

    void h(s sVar);
}
