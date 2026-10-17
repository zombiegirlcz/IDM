package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import androidx.core.view.ScrollingView;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import ix0.c2;
import ix0.w0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.jd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/views/WebView;", "Landroid/webkit/WebView;", "Landroidx/core/view/ScrollingView;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mx0/jd", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebView extends android.webkit.WebView implements ScrollingView, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f58930b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.webkit.WebView, android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.webkit.WebView, android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.webkit.WebView, android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.webkit.WebView, android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    @Override // android.webkit.WebView, android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.webkit.WebView, android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return super.onApplyWindowInsets(this.f58929a.a(insets));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i5) {
        super.onScrollChanged(i, i2, i3, i5);
        Iterator it8 = this.f58930b.iterator();
        while (it8.hasNext()) {
            ((jd) it8.next()).onScroll(i, i2, i3, i5);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58929a = new c2(this);
        if ((getResources().getConfiguration().uiMode & 48) == 32 && WebViewFeature.isFeatureSupported("FORCE_DARK_STRATEGY") && WebViewFeature.isFeatureSupported("FORCE_DARK")) {
            WebSettingsCompat.setForceDark(getSettings(), 2);
            WebSettingsCompat.setForceDarkStrategy(getSettings(), 1);
            setBackgroundColor(0);
        }
        this.f58930b = new LinkedHashSet();
    }

    public /* synthetic */ WebView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
