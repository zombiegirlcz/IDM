package com.revolut.uicomponent.toolbar.app_bar;

import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.ScrollerCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes12.dex */
final class ScrollBehaviorHelper {
    private boolean mPassEventsToScroller;
    private ScrollerCompat mScroller;

    public ScrollBehaviorHelper(@NonNull NestedScrollView nestedScrollView) {
        attachNestedScrollView(nestedScrollView);
    }

    private void attachNestedScrollView(@NonNull NestedScrollView nestedScrollView) {
        try {
            Field declaredField = nestedScrollView.getClass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.mScroller = (ScrollerCompat) declaredField.get(nestedScrollView);
        } catch (Throwable unused) {
            this.mPassEventsToScroller = true;
            this.mScroller = ScrollerCompat.create(nestedScrollView.getContext());
        }
    }

    private void attachRecyclerView(@NonNull RecyclerView recyclerView) {
        try {
            Field declaredField = recyclerView.getClass().getDeclaredField("mViewFlinger");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(recyclerView);
            Field declaredField2 = obj2.getClass().getDeclaredField("mScroller");
            declaredField2.setAccessible(true);
            this.mScroller = (ScrollerCompat) declaredField2.get(obj2);
        } catch (Throwable unused) {
            this.mPassEventsToScroller = true;
            this.mScroller = ScrollerCompat.create(recyclerView.getContext());
        }
    }

    public Pair<Boolean, Integer> isOverScrollReached(@NonNull NestedScrollView nestedScrollView) {
        int finalY = this.mScroller.getFinalY();
        return Pair.create(Boolean.valueOf(Math.abs(nestedScrollView.getScrollY()) - Math.abs(finalY) <= 0), Integer.valueOf(finalY));
    }

    public boolean onNestedFling(boolean z, float f, float f4) {
        if (!z) {
            return false;
        }
        this.mScroller.fling(0, 0, (int) f, (int) f4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return true;
    }

    public void onNestedScroll(int i, int i2) {
        if (this.mPassEventsToScroller) {
            ScrollerCompat scrollerCompat = this.mScroller;
            scrollerCompat.startScroll(scrollerCompat.getCurrX(), this.mScroller.getCurrY(), i, i2);
        }
    }

    public ScrollBehaviorHelper(@NonNull RecyclerView recyclerView) {
        attachRecyclerView(recyclerView);
    }

    public Pair<Boolean, Integer> isOverScrollReached(@NonNull RecyclerView recyclerView) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        return Pair.create(Boolean.valueOf(Math.abs(recyclerView.getScrollY()) - Math.abs(iComputeVerticalScrollOffset) <= 0), Integer.valueOf(iComputeVerticalScrollOffset));
    }
}
