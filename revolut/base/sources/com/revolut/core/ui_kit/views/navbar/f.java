package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.views.CenteredFixedTabsView;
import ix0.x0;
import kotlin.jvm.internal.Intrinsics;
import mx0.q3;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CenteredFixedTabsView f59526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f59527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicNavBar f59528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BasicNavBar basicNavBar) {
        super(basicNavBar.getContext());
        this.f59528c = basicNavBar;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CenteredFixedTabsView centeredFixedTabsView = new CenteredFixedTabsView(context, null, 6, 0);
        this.f59526a = centeredFixedTabsView;
        addView(centeredFixedTabsView, new FrameLayout.LayoutParams(-1, -2, 17));
    }

    public final void a(d content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Iterable<q3> iterable = content.f59522a;
        String str = content.f59523b;
        CenteredFixedTabsView centeredFixedTabsView = this.f59526a;
        centeredFixedTabsView.setItems(iterable, str);
        centeredFixedTabsView.setOnMedia$ui_kit_components_release(content.f59524c);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return x0.a(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59527b = this.f59526a.f58424a.map(new twl.h(21, new tx.f(2))).subscribe(new twl.h(22, new tpl.o(this.f59528c, 24)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ifm.c cVar = this.f59527b;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
