package yki;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface g extends pki.b {
    default void a(ViewController viewController, Function2 block) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        yj2.b bVar = new yj2.b(block, new ky4.h(this, viewController, 2), 6);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        viewController.H = bVar;
    }

    b s();
}
