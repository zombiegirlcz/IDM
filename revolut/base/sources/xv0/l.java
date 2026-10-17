package xv0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements RecyclerView.OnItemTouchListener, ScaleGestureDetector.OnScaleGestureListener {

    @NotNull
    public static final j Companion = new j();
    public static final DecelerateInterpolator k = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7 f309153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f309154c;
    public RecyclerView d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f309155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f309156h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f309157j;

    public l(Context context, List delegates, a7 pinchToZoomListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(pinchToZoomListener, "pinchToZoomListener");
        this.f309152a = delegates;
        this.f309153b = pinchToZoomListener;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.f309154c = scaleGestureDetector;
        this.f309156h = 1.0f;
        this.i = 1.0f;
        this.f309157j = 1.0f;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent event) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f309155g) {
            int actionMasked = event.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1 && actionMasked != 3) {
                    return false;
                }
                this.f309155g = false;
                return false;
            }
            this.f309155g = false;
        }
        this.d = recyclerView;
        this.f309154c.onTouchEvent(event);
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        this.f309155g = z;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            return false;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
            if (childLayoutPosition != -1 && childLayoutPosition == this.f) {
                float fMax = Math.max(1.0f, detector.getCurrentSpan() / this.f309156h);
                float focusX = detector.getFocusX() - this.i;
                float focusY = detector.getFocusY() - this.f309157j;
                View.SCALE_X.set(childAt, Float.valueOf(fMax));
                View.SCALE_Y.set(childAt, Float.valueOf(fMax));
                View.TRANSLATION_X.set(childAt, Float.valueOf(focusX));
                View.TRANSLATION_Y.set(childAt, Float.valueOf(focusY));
            }
        }
        recyclerView.invalidateItemDecorations();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(detector, "detector");
        RecyclerView recyclerView2 = this.d;
        View viewFindChildViewUnder = recyclerView2 != null ? recyclerView2.findChildViewUnder(detector.getFocusX(), detector.getFocusY()) : null;
        int childLayoutPosition = (viewFindChildViewUnder == null || (recyclerView = this.d) == null) ? -1 : recyclerView.getChildLayoutPosition(viewFindChildViewUnder);
        this.f = childLayoutPosition;
        boolean z = childLayoutPosition != -1;
        this.e = z;
        if (z) {
            List list = this.f309152a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(Integer.valueOf(((BaseRecyclerViewDelegate) it8.next()).getF58165c()));
            }
            RecyclerView recyclerView3 = this.d;
            if (d0.T(arrayList, (recyclerView3 == null || (adapter = recyclerView3.getAdapter()) == null) ? null : Integer.valueOf(adapter.getItemViewType(this.f)))) {
                this.f309156h = detector.getCurrentSpan();
                this.i = detector.getFocusX();
                this.f309157j = detector.getFocusY();
                if (viewFindChildViewUnder != null) {
                    viewFindChildViewUnder.setTranslationZ(1.0f);
                }
                RecyclerView recyclerView4 = this.d;
                ViewParent parent = recyclerView4 != null ? recyclerView4.getParent() : null;
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f309153b.invoke(k.BEGIN);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
                if (childLayoutPosition != -1 && childLayoutPosition == this.f) {
                    childAt.animate().scaleX(1.0f).scaleY(1.0f).translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(250L).setInterpolator(k).withEndAction(new uk.a(childAt, this, 7)).start();
                }
            }
            this.e = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent event) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f309154c.onTouchEvent(event);
    }
}
