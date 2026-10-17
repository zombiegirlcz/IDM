package nv0;

import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f219351a = new g();

    private g() {
    }

    @Override // nv0.i
    public final int a(k view, boolean z) {
        int i = view.f219353a;
        Intrinsics.checkNotNullParameter(view, "view");
        return z ? ColorUtils.compositeColors(i, view.getBackCardBackgroundColor$ui_kit_components_release()) : i;
    }

    @Override // nv0.i
    public final int b(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.i;
    }

    @Override // nv0.i
    public final int c(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.f219358j;
    }
}
