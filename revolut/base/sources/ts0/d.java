package ts0;

import android.view.View;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f273862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f273863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f273864c;
    public View d;

    public d(LinearLayout container, UIKitTextView label, UIKitTextView value) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f273862a = container;
        this.f273863b = label;
        this.f273864c = value;
    }
}
