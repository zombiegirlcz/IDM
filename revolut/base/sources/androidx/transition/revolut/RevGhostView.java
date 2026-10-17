package androidx.transition.revolut;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.transition.RevTransitionUtils;
import com.revolut.core.ui_kit.R$id;

/* JADX INFO: loaded from: classes16.dex */
class RevGhostView extends ViewGroup {
    private Matrix mMatrix;
    private final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    final View mView;
    private int viewVisibilityBeforeAttachToWindow;

    public RevGhostView(View view) {
        super(view.getContext());
        this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.revolut.RevGhostView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                RevGhostView.this.postInvalidateOnAnimation();
                return true;
            }
        };
        this.mView = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static RevGhostView addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        RevGhostViewHolder revGhostViewHolder;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        RevGhostViewHolder holder = RevGhostViewHolder.getHolder(viewGroup);
        RevGhostView ghostView = getGhostView(view);
        if (ghostView == null || (revGhostViewHolder = (RevGhostViewHolder) ghostView.getParent()) == holder) {
            i = 0;
        } else {
            i = ghostView.mReferences;
            revGhostViewHolder.removeView(ghostView);
            ghostView = null;
        }
        if (ghostView == null) {
            if (matrix == null) {
                matrix = new Matrix();
                calculateMatrix(view, viewGroup, matrix);
            }
            ghostView = new RevGhostView(view);
            ghostView.setMatrix(matrix);
            if (holder == null) {
                holder = new RevGhostViewHolder(viewGroup);
            } else {
                holder.popToOverlayTop();
            }
            copySize(viewGroup, holder);
            copySize(viewGroup, ghostView);
            holder.addGhostView(ghostView);
            ghostView.mReferences = i;
        } else if (matrix != null) {
            ghostView.setMatrix(matrix);
        }
        ghostView.mReferences++;
        return ghostView;
    }

    public static void calculateMatrix(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        RevTransitionUtils.transformMatrixToGlobal(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        RevTransitionUtils.transformMatrixToLocal(viewGroup, matrix);
    }

    public static void copySize(View view, View view2) {
        RevTransitionUtils.setLeftTopRightBottom(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    public static RevGhostView getGhostView(View view) {
        return (RevGhostView) view.getTag(R$id.internal_ghost_view);
    }

    public static void removeGhost(View view) {
        RevGhostView ghostView = getGhostView(view);
        if (ghostView != null) {
            int i = ghostView.mReferences - 1;
            ghostView.mReferences = i;
            if (i <= 0) {
                ((RevGhostViewHolder) ghostView.getParent()).removeView(ghostView);
            }
        }
    }

    public static void setGhostView(@NonNull View view, RevGhostView revGhostView) {
        view.setTag(R$id.internal_ghost_view, revGhostView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        this.viewVisibilityBeforeAttachToWindow = this.mView.getVisibility();
        RevTransitionUtils.setTransitionVisibility(this.mView, 4);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        RevTransitionUtils.setTransitionVisibility(this.mView, this.viewVisibilityBeforeAttachToWindow);
        setGhostView(this.mView, null);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        RevTransitionUtils.enableZ(canvas, true);
        canvas.setMatrix(this.mMatrix);
        RevTransitionUtils.setTransitionVisibility(this.mView, 0);
        this.mView.invalidate();
        RevTransitionUtils.setTransitionVisibility(this.mView, 4);
        drawChild(canvas, this.mView, getDrawingTime());
        RevTransitionUtils.enableZ(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i5) {
    }

    public void setMatrix(@NonNull Matrix matrix) {
        this.mMatrix = matrix;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getGhostView(this.mView) == this) {
            RevTransitionUtils.setTransitionVisibility(this.mView, i == 0 ? 4 : 0);
        }
    }
}
