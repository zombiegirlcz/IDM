package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.revolut.core.ui_kit.views.pager.RevolutViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/NoSwipeableViewPager;", "Lcom/revolut/core/ui_kit/views/pager/RevolutViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "Z", "isSwipesEnabled", "()Z", "setSwipesEnabled", "(Z)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoSwipeableViewPager extends RevolutViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isSwipesEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSwipeableViewPager(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSwipesEnabled = true;
    }

    @Override // com.revolut.core.ui_kit.views.pager.RevolutViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isSwipesEnabled) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.isSwipesEnabled) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setSwipesEnabled(boolean z) {
        this.isSwipesEnabled = z;
    }
}
