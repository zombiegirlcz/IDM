package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.u2;
import tx0.x2;
import vx0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarContentViewSwitcher;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "offset", "", "setBackgroundOffset", "(I)V", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarContentViewSwitcher extends FrameLayout implements x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vx0.b f59285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarContentViewSwitcher(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59285a = new vx0.b();
    }

    @Override // tx0.x2
    public final void H(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt instanceof x2) {
                ((x2) childAt).H(i);
            }
        }
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int childCount = getChildCount();
        Object obj2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof x2)) {
                obj2 = childAt;
            }
        }
        if (obj2 != null) {
            return ((x2) obj2).N(context);
        }
        throw new IllegalStateException();
    }

    public final void a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt = getChildAt(childCount);
            if (childAt != null && childAt.getVisibility() == 0 && (childAt instanceof x2)) {
                this.f59285a.b(childAt);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof x2)) {
            throw new IllegalArgumentException("Only views of type NavBarWithContainer.ContentView can be added to NavBarContentViewSwitcher");
        }
        vx0.b bVar = this.f59285a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        ((x2) view).setColorSchemeListener(new rul.e(bVar, view));
        if (isAttachedToWindow()) {
            a();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super.addView(view, i, ((x2) view).N(context));
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt instanceof x2) {
                ((x2) childAt).d(f, i);
            }
        }
    }

    @Override // tx0.x2
    public final void d0(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt instanceof x2) {
                ((x2) childAt).d0(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        if (view != 0 && (view instanceof x2)) {
            vx0.b bVar = this.f59285a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            ((x2) view).setColorSchemeListener(new b.a());
            bVar.f292771a.remove(view);
            a();
        }
        super.onViewRemoved(view);
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
        setClipChildren(offset == 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof x2) {
                ((x2) childAt).setBackgroundOffset(offset);
            }
        }
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        vx0.a aVar;
        Intrinsics.checkNotNullParameter(listener, "listener");
        vx0.b bVar = this.f59285a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        bVar.f292773c = listener;
        bVar.f292772b = null;
        View view = bVar.d;
        if (view == null || (aVar = (vx0.a) bVar.f292771a.get(view)) == null) {
            return;
        }
        bVar.a(aVar);
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int childCount = getChildCount();
        Object obj2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof x2)) {
                obj2 = childAt;
            }
        }
        if (obj2 != null) {
            return ((x2) obj2).w(context);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarContentViewSwitcher(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
