package mx0;

import android.view.WindowInsets;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface aa {
    void a(lki.s sVar);

    void b();

    default boolean c(ModalDestination.Style incomingStyle) {
        Intrinsics.checkNotNullParameter(incomingStyle, "incomingStyle");
        return false;
    }

    default void d(ebi.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    void e();

    default WindowInsets f(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return null;
    }

    default void g(ebi.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    default void h(ek2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    default void i() {
    }

    void init();

    default void j(ek2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    void k();

    void l(mhd.b bVar);

    void reset();

    default void setExpandableModalState(zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
