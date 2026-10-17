package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyboardSuggestionsView.b f59162b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        KeyboardSuggestionsView.b bVar = new KeyboardSuggestionsView.b(context);
        bVar.setFillViewport(true);
        bVar.setHorizontalScrollBarEnabled(false);
        bVar.setHorizontalFadingEdgeEnabled(true);
        bVar.setFadingEdgeLength(kli.a.k(context, 16.0f));
        bVar.setOverScrollMode(2);
        bVar.addView((LinearLayout) this.f22677a, new FrameLayout.LayoutParams(-2, -2));
        this.f59162b = bVar;
    }

    @Override // cam.f
    public final View p() {
        return this.f59162b;
    }
}
