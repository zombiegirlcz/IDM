package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import j6.a;

/* JADX INFO: loaded from: classes15.dex */
class LayoutState {
    int mAvailable;
    int mCurrentPosition;
    boolean mInfinite;
    int mItemDirection;
    int mLayoutDirection;
    boolean mStopInFocusable;
    boolean mRecycle = true;
    int mStartLine = 0;
    int mEndLine = 0;

    public boolean hasMore(RecyclerView.State state) {
        int i = this.mCurrentPosition;
        return i >= 0 && i < state.getItemCount();
    }

    public View next(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("LayoutState{mAvailable=");
        sb6.append(this.mAvailable);
        sb6.append(", mCurrentPosition=");
        sb6.append(this.mCurrentPosition);
        sb6.append(", mItemDirection=");
        sb6.append(this.mItemDirection);
        sb6.append(", mLayoutDirection=");
        sb6.append(this.mLayoutDirection);
        sb6.append(", mStartLine=");
        sb6.append(this.mStartLine);
        sb6.append(", mEndLine=");
        return a.t(sb6, this.mEndLine, CoreConstants.CURLY_RIGHT);
    }
}
