package mx0;

import com.revolut.core.ui_kit.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d6 implements f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6 f209646a = new d6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f209647b = R$drawable.internal_fixed_tab_item_background_ripple;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f209648c = R$drawable.internal_fixed_tabs_selector;

    private d6() {
    }

    @Override // mx0.f6
    public final int a(i6 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return style.a();
    }

    @Override // mx0.f6
    public final int b() {
        return f209648c;
    }

    @Override // mx0.f6
    public final int c() {
        return f209647b;
    }
}
