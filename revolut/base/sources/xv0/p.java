package xv0;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements RecyclerView.OnItemTouchListener {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f309167a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f309168b = r.f309171a;

    public static final class a {
        private a() {
        }
    }

    public static RecyclerView a(View view) {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        if ((view instanceof RecyclerView) && (layoutManager = (recyclerView = (RecyclerView) view).getLayoutManager()) != null && layoutManager.canScrollVertically()) {
            return recyclerView;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            RecyclerView recyclerViewA = a(childAt);
            if (recyclerViewA != null) {
                return recyclerViewA;
            }
        }
        return null;
    }

    public static boolean b(RecyclerView recyclerView, MotionEvent motionEvent, MotionEvent motionEvent2) {
        int iFindPointerIndex;
        if (motionEvent2.getActionMasked() == 2 && (iFindPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0))) >= 0) {
            float fAbs = Math.abs(motionEvent2.getX(iFindPointerIndex) - motionEvent.getX());
            float fAbs2 = Math.abs(motionEvent2.getY(iFindPointerIndex) - motionEvent.getY());
            if (fAbs2 > fAbs && fAbs2 > ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv4, MotionEvent e) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        v vVar = this.f309168b;
        if (e.getActionMasked() == 0 && !(vVar instanceof s)) {
            MotionEvent motionEventObtain = MotionEvent.obtain(e);
            Intrinsics.checkNotNullExpressionValue(motionEventObtain, "access$copy(...)");
            this.f309168b = new u(motionEventObtain);
            return true;
        }
        if (vVar instanceof s) {
            return false;
        }
        if (vVar instanceof t) {
            t tVar = (t) vVar;
            if (b(rv4, tVar.f309173a, e) || (recyclerView = tVar.f309174b) == null || recyclerView.getScrollState() != 0) {
                return false;
            }
        } else if (rv4.getScrollState() != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView rv4, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        v vVar = this.f309168b;
        MotionEvent motionEventA = vVar.a();
        if (motionEventA != null) {
            boolean zB = b(rv4, motionEventA, e);
            if ((vVar instanceof u) && zB) {
                MotionEvent motionEvent = ((u) vVar).f309175a;
                MotionEvent motionEventObtain = MotionEvent.obtain(e);
                Intrinsics.checkNotNullExpressionValue(motionEventObtain, "access$copy(...)");
                this.f309168b = new q(motionEvent, zhm.v.n(motionEvent, motionEventObtain));
                return;
            }
            if (vVar instanceof q) {
                Handler handler = this.f309167a;
                if (!zB) {
                    this.f309168b = r.f309171a;
                    handler.removeCallbacksAndMessages(null);
                    this.f309168b = new u(((q) vVar).f309169a);
                    return;
                }
                ArrayList arrayList = ((q) vVar).f309170b;
                Intrinsics.checkNotNullParameter(e, "e");
                MotionEvent motionEventObtain2 = MotionEvent.obtain(e);
                Intrinsics.checkNotNullExpressionValue(motionEventObtain2, "access$copy(...)");
                arrayList.add(motionEventObtain2);
                if (arrayList.size() == 3) {
                    handler.post(new vf.c(this, 6, vVar, rv4));
                }
            }
        }
    }
}
