package ps0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import ip0.h3;
import ip0.i3;
import ip0.m3;
import ip0.n3;
import ip0.o3;
import ip0.z3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends us0.f {
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f239363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BarChartView f239364h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BarChartView barChartView) {
        super(barChartView, us0.b.BAR_CHART);
        this.f239364h = barChartView;
        this.f = new RectF();
        this.f239363g = new Rect();
    }

    @Override // us0.f
    public final Clause a() {
        return this.f239364h.getDataset().f163919c;
    }

    @Override // us0.f
    public final Rect b() {
        RectF drawRect$ui_kit_components_release = this.f239364h.getDrawRect$ui_kit_components_release();
        Rect rect = this.f239363g;
        knm.b.R(rect, drawRect$ui_kit_components_release);
        return rect;
    }

    @Override // us0.f
    public final int c(float f, float f4) {
        Integer numValueOf;
        i3 key;
        BarChartView barChartView = this.f239364h;
        float f5 = barChartView.getDrawRect$ui_kit_components_release().top;
        RectF rectF = this.f;
        rectF.top = f5;
        rectF.bottom = barChartView.getDrawRect$ui_kit_components_release().bottom;
        List list = barChartView.getBarDataset().f165762a;
        int size = list.size();
        float f6 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        if (size > 1) {
            RectF rectF2 = barChartView.getCategoryRects$ui_kit_components_release().get(((h3) list.get(0)).f164499a);
            RectF rectF3 = barChartView.getCategoryRects$ui_kit_components_release().get(((h3) list.get(1)).f164499a);
            if (rectF3 != null && rectF2 != null) {
                f6 = rectF3.left - rectF2.right;
            }
        }
        Iterator<Map.Entry<i3, RectF>> it8 = barChartView.getCategoryRects$ui_kit_components_release().entrySet().iterator();
        while (true) {
            numValueOf = null;
            if (!it8.hasNext()) {
                key = null;
                break;
            }
            Map.Entry<i3, RectF> next = it8.next();
            float f32 = f6 / 2.0f;
            rectF.left = next.getValue().left - f32;
            rectF.right = next.getValue().right + f32;
            key = rectF.contains(f, f4) ? next.getKey() : null;
            if (key != null) {
                break;
            }
        }
        if (key != null) {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    i = -1;
                    break;
                }
                if (((h3) it9.next()).f164499a.equals(key)) {
                    break;
                }
                i++;
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -1;
    }

    @Override // us0.f
    public final void d(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        int size = this.f239364h.getBarDataset().f165762a.size();
        for (int i = 0; i < size; i++) {
            virtualViewIds.add(Integer.valueOf(i));
        }
    }

    @Override // us0.f
    public final void e(int i, AccessibilityNodeInfoCompat node) {
        Rect rect;
        Parcelable moneyClause;
        MoneyClause moneyClause2;
        Intrinsics.checkNotNullParameter(node, "node");
        BarChartView barChartView = this.f239364h;
        h3 h3Var = (h3) barChartView.getBarDataset().f165762a.get(i);
        Collection<z3> collectionValues = h3Var.f164501c.values();
        RectF rectF = barChartView.getCategoryRects$ui_kit_components_release().get(h3Var.f164499a);
        if (rectF != null) {
            rect = new Rect();
            rectF.roundOut(rect);
        } else {
            rect = null;
        }
        node.setBoundsInParent(rect);
        ArrayList arrayList = new ArrayList();
        arrayList.add(h3Var.f164500b);
        for (z3 z3Var : collectionValues) {
            if (z3Var == null) {
                moneyClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                long j2 = (long) z3Var.f167391a;
                o3 o3Var = barChartView.getBarDataset().d;
                if (o3Var instanceof m3) {
                    Iterator it8 = ((m3) o3Var).f165309a.values().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            moneyClause2 = null;
                            break;
                        }
                        Clause clause = (Clause) it8.next();
                        MoneyClause moneyClause3 = clause instanceof MoneyClause ? (MoneyClause) clause : null;
                        if (moneyClause3 != null) {
                            moneyClause2 = moneyClause3;
                            break;
                        }
                    }
                    moneyClause = moneyClause2 == null ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : MoneyClause.b(moneyClause2, dj0.d.c(moneyClause2.f57821a, j2, null, 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                } else {
                    if (!(o3Var instanceof n3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyClause = new MoneyClause(new dj0.d(j2, ((n3) o3Var).f165449a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                }
            }
            arrayList.add(moneyClause);
        }
        ty0.c cVarB0 = u.k(barChartView).b0();
        CompositeClause compositeClause = new CompositeClause(arrayList, new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        Context context = barChartView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        node.setContentDescription(ty0.c.a(cVarB0, compositeClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
    }
}
