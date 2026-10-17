package nv0;

import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f219350a = new f();

    private f() {
    }

    @Override // nv0.i
    public final int a(k view, boolean z) {
        int i = view.f219354b;
        Intrinsics.checkNotNullParameter(view, "view");
        return z ? ColorUtils.compositeColors(i, view.getDarkBackCardBackgroundColor$ui_kit_components_release()) : i;
    }

    @Override // nv0.i
    public final int b(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return -1;
    }

    @Override // nv0.i
    public final int c(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.f219356g;
    }
}
