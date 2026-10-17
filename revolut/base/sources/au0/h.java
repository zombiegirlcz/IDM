package au0;

import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitTextView f9214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp0.p f9215b;

    public h(UIKitTextView view, fp0.p clickHandler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.f9214a = view;
        this.f9215b = clickHandler;
    }
}
