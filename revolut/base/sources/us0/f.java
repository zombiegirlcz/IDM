package us0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import aw0.o9;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.youTransactor.uCube.rpc.Constants;
import es0.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f extends ExploreByTouchHelper {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f282377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f282378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f282379c;
    public final RectF d;
    public final a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View host, b element) {
        super(host);
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f282377a = host;
        this.f282378b = element;
        this.f282379c = c.OVERVIEW;
        this.d = new RectF();
        this.e = new a(this, 0);
        host.addOnAttachStateChangeListener(new k(this, 9));
    }

    public abstract Clause a();

    public abstract Rect b();

    public abstract int c(float f, float f4);

    public abstract void d(List list);

    public abstract void e(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f4) {
        int i = e.f282376a[this.f282379c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c(f, f4);
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(b(), "<this>");
        RectF destination = this.d;
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.top = r1.top;
        destination.bottom = r1.bottom;
        destination.left = r1.left;
        destination.right = r1.right;
        Integer num = destination.contains(f, f4) ? Integer.MAX_VALUE : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        int i = e.f282376a[this.f282379c.ordinal()];
        if (i == 1) {
            virtualViewIds.add(Integer.MAX_VALUE);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d(virtualViewIds);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i != Integer.MAX_VALUE || i2 != 16) {
            return false;
        }
        this.f282379c = c.EXPLORE;
        invalidateRoot();
        this.f282377a.post(new a(this, 1));
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onPopulateEventForVirtualView(i, event);
        int eventType = event.getEventType();
        a aVar = this.e;
        View view = this.f282377a;
        if (eventType == 32768) {
            view.removeCallbacks(aVar);
        } else {
            if (eventType != 65536) {
                return;
            }
            view.postDelayed(aVar, 200L);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (i != Integer.MAX_VALUE) {
            e(i, node);
            return;
        }
        Clause clauseA = a();
        if (clauseA == null) {
            clauseA = new TextLocalisedClause(this.f282378b.a(), null, null, 14);
        }
        CompositeClause compositeClause = new CompositeClause(v.k(clauseA, new TextLocalisedClause(R$string.uikit_charts_default_description_action, null, null, 14)), new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        View view = this.f282377a;
        ty0.c cVarB0 = u.k(view).b0();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        node.setContentDescription(ty0.c.a(cVarB0, compositeClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        node.setBoundsInParent(b());
        node.setClickable(true);
        node.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
    }
}
