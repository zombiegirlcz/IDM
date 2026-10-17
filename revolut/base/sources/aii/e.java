package aii;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface e {
    default g a(ViewController viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        return new g(viewController);
    }
}
