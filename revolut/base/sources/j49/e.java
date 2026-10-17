package j49;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f171324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalDestination.Style f171325b;

    public e(ViewController viewController, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f171324a = viewController;
        this.f171325b = style;
    }
}
