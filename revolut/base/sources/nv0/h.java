package nv0;

import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f219352a = new h();

    private h() {
    }

    @Override // nv0.i
    public final int a(k view, boolean z) {
        int i = view.f219355c;
        Intrinsics.checkNotNullParameter(view, "view");
        return z ? ColorUtils.compositeColors(i, view.f) : i;
    }

    @Override // nv0.i
    public final int b(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.k;
    }

    @Override // nv0.i
    public final int c(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.f219357h;
    }
}
