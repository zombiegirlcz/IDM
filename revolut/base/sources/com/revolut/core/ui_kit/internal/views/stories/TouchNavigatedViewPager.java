package com.revolut.core.ui_kit.internal.views.stories;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.viewpager2.widget.ViewPager2;
import hy0.c;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru0.h;
import ru0.j;
import v60.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0003\u0019\u000b-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&¨\u0006."}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/stories/TouchNavigatedViewPager;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/viewpager2/widget/ViewPager2;", "a", "Landroidx/viewpager2/widget/ViewPager2;", "getPager", "()Landroidx/viewpager2/widget/ViewPager2;", "pager", "Lv60/i;", "Lhy0/c;", "b", "Lv60/i;", "getLifecycleEventSubject", "()Lv60/i;", "setLifecycleEventSubject", "(Lv60/i;)V", "lifecycleEventSubject", "Lru0/i;", "c", "Lru0/i;", "getTouchNavigationListener", "()Lru0/i;", "setTouchNavigationListener", "(Lru0/i;)V", "touchNavigationListener", "d", "I", "getTopClickPadding", "()I", "setTopClickPadding", "(I)V", "topClickPadding", "e", "getBottomClickPadding", "setBottomClickPadding", "bottomClickPadding", "Companion", "ru0/h", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TouchNavigatedViewPager extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ViewPager2 pager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public i lifecycleEventSubject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ru0.i touchNavigationListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int topClickPadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int bottomClickPadding;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f57597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f57598h;
    public final GestureDetectorCompat i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchNavigatedViewPager(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getBottomClickPadding() {
        return this.bottomClickPadding;
    }

    @NotNull
    public final i getLifecycleEventSubject() {
        return this.lifecycleEventSubject;
    }

    @NotNull
    public final ViewPager2 getPager() {
        return this.pager;
    }

    public final int getTopClickPadding() {
        return this.topClickPadding;
    }

    public final ru0.i getTouchNavigationListener() {
        return this.touchNavigationListener;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        int action;
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = this.f57597g;
        h hVar2 = h.CLOSING_SCROLL_CANCELLED;
        boolean z = hVar == hVar2 || hVar == h.CLOSING_SCROLL;
        boolean zOnTouchEvent = this.i.onTouchEvent(event);
        h hVar3 = this.f57597g;
        boolean z3 = hVar3 == hVar2 || hVar3 == h.CLOSING_SCROLL;
        if (!zOnTouchEvent && ((action = event.getAction()) == 1 || action == 3)) {
            if (this.f57597g == h.CLOSING_SCROLL && event.getEventTime() - event.getDownTime() < 300) {
                this.lifecycleEventSubject.onNext(c.FINISH_REQUESTED);
            }
            ru0.i iVar = this.touchNavigationListener;
            if (iVar != null) {
                iVar.a();
            }
        }
        ViewPager2 viewPager2 = this.pager;
        if (z3 && !z) {
            viewPager2.dispatchTouchEvent(MotionEvent.obtain(event.getDownTime(), event.getEventTime(), 3, event.getX(), event.getY(), 0));
            return true;
        }
        if (!z3) {
            viewPager2.dispatchTouchEvent(event);
        }
        return true;
    }

    public final void setBottomClickPadding(int i) {
        this.bottomClickPadding = i;
    }

    public final void setLifecycleEventSubject(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.lifecycleEventSubject = iVar;
    }

    public final void setTopClickPadding(int i) {
        this.topClickPadding = i;
    }

    public final void setTouchNavigationListener(ru0.i iVar) {
        this.touchNavigationListener = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchNavigatedViewPager(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchNavigatedViewPager(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewPager2 viewPager2 = new ViewPager2(context, attributeSet, i);
        this.pager = viewPager2;
        i iVar = new i();
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        this.lifecycleEventSubject = iVar;
        this.topClickPadding = a.k(context, 120.0f);
        this.bottomClickPadding = a.k(context, 120.0f);
        this.f57597g = h.INITIAL;
        this.f57598h = a.k(context, 16.0f);
        this.i = new GestureDetectorCompat(context, new j(this));
        addView(viewPager2, -1, -1);
    }

    public /* synthetic */ TouchNavigatedViewPager(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
