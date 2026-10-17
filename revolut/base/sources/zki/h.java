package zki;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zf5.n;

/* JADX INFO: loaded from: classes10.dex */
public interface h extends pki.b {
    com.revolut.kompot.navigable.vc.modal.a K();

    default void a(ViewController viewController, Function2 block) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        n nVar = new n(block, new g(this), 15);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        viewController.H = nVar;
    }
}
