package mx0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t8 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LabeledVerticalScrollView f210017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f210018b;

    public t8(LabeledVerticalScrollView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f210017a = view;
        this.f210018b = zhm.f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 2) {
            this.f210017a.f58712b.setVisibility(8);
            return true;
        }
        int iMin = Math.min(Math.max((int) (motionEvent.getY() / (r1.getScrollerSizePx$ui_kit_components_release() / Math.max(r2, 1))), 0), this.f210017a.getListItemsCount$ui_kit_components_release() - 1);
        float y2 = motionEvent.getY();
        Clause label = (Clause) zhm.d0.e0(iMin, this.f210018b);
        LabeledVerticalScrollView labeledVerticalScrollView = this.f210017a;
        if (label != null) {
            int scrollerSizePx$ui_kit_components_release = labeledVerticalScrollView.getScrollerSizePx$ui_kit_components_release();
            int searchTrackSizePx$ui_kit_components_release = labeledVerticalScrollView.getSearchTrackSizePx$ui_kit_components_release();
            float fMax = y2 < ((float) (scrollerSizePx$ui_kit_components_release / 2)) ? Math.max(BitmapDescriptorFactory.HUE_RED, y2 - searchTrackSizePx$ui_kit_components_release) : Math.min(scrollerSizePx$ui_kit_components_release - searchTrackSizePx$ui_kit_components_release, y2 - searchTrackSizePx$ui_kit_components_release);
            Intrinsics.checkNotNullParameter(label, "label");
            TextView textView = labeledVerticalScrollView.f58712b;
            textView.setY(fMax);
            ty0.c.b(or0.u.k(labeledVerticalScrollView).b0(), label, labeledVerticalScrollView.f58712b, null, null, 12);
            textView.setVisibility(0);
        }
        this.f210017a.a(iMin);
        return true;
    }
}
