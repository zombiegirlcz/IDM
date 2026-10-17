package mx0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e6 implements f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e6 f209675a = new e6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f209676b = R$drawable.internal_fixed_tab_item_background_nav_bar_ripple;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f209677c = R$drawable.internal_fixed_tabs_nav_bar_selector;

    private e6() {
    }

    @Override // mx0.f6
    public final int a(i6 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return R$drawable.internal_fixed_tabs_nav_bar_background;
    }

    @Override // mx0.f6
    public final int b() {
        return f209677c;
    }

    @Override // mx0.f6
    public final int c() {
        return f209676b;
    }
}
