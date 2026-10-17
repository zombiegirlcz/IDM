package ht0;

import android.content.Context;
import android.graphics.Rect;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends us0.f {
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f155184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TrendView f155185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(TrendView trendView) {
        super(trendView, us0.b.LINE_CHART);
        this.f155185h = trendView;
        this.f = new Rect();
        this.f155184g = new Rect();
    }

    @Override // us0.f
    public final Clause a() {
        return this.f155185h.getContentDescription();
    }

    @Override // us0.f
    public final Rect b() {
        Rect rect = this.f155184g;
        rect.top = 0;
        TrendView trendView = this.f155185h;
        rect.bottom = trendView.getHeight();
        rect.left = 0;
        rect.right = trendView.getWidth();
        return rect;
    }

    @Override // us0.f
    public final int c(float f, float f4) {
        TrendView trendView = this.f155185h;
        int size = trendView.f155121b.size();
        int i = -1;
        if (size == 0) {
            return -1;
        }
        float f5 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            trendView.getClass();
            float fAbs = Math.abs((trendView.s(i2) + BitmapDescriptorFactory.HUE_RED) - f);
            if (fAbs < f5) {
                i = i2;
                f5 = fAbs;
            }
        }
        return i;
    }

    @Override // us0.f
    public final void d(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        int size = this.f155185h.f155121b.size();
        for (int i = 0; i < size; i++) {
            virtualViewIds.add(Integer.valueOf(i));
        }
    }

    @Override // us0.f
    public final void e(int i, AccessibilityNodeInfoCompat node) {
        Intrinsics.checkNotNullParameter(node, "node");
        aim.e eVarB = zhm.u.b();
        TrendView trendView = this.f155185h;
        List mDataLists = trendView.f155121b;
        Intrinsics.checkNotNullExpressionValue(mDataLists, "mDataLists");
        hw0.k kVar = (hw0.k) zhm.d0.e0(i, mDataLists);
        if (kVar != null) {
            Clause clauseF = kVar.f156009g;
            if (clauseF == null) {
                clauseF = f(kVar.f156007b);
            }
            eVarB.add(clauseF);
        }
        List<hw0.d> additionalChartData = trendView.getAdditionalChartData();
        if (additionalChartData != null) {
            Iterator<T> it8 = additionalChartData.iterator();
            while (it8.hasNext()) {
                hw0.k kVar2 = (hw0.k) zhm.d0.e0(i, ((hw0.d) it8.next()).f155993a);
                if (kVar2 != null) {
                    Clause clauseF2 = kVar2.f156009g;
                    if (clauseF2 == null) {
                        clauseF2 = f(kVar2.f156007b);
                    }
                    eVarB.add(clauseF2);
                }
            }
        }
        aim.e eVarA = zhm.u.a(eVarB);
        ty0.c cVarB0 = or0.u.k(trendView).b0();
        CompositeClause compositeClause = new CompositeClause(eVarA, new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        Context context = trendView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        node.setContentDescription(ty0.c.a(cVarB0, compositeClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        float fS = trendView.s(i) + BitmapDescriptorFactory.HUE_RED;
        float fB = trendView.f155121b.size() > 1 ? (trendView.b() / (r3 - 1)) / 2.0f : trendView.b() / 2.0f;
        int iF = (int) (trendView.f() - trendView.a());
        int iF2 = (int) trendView.f();
        Rect rect = this.f;
        rect.set((int) (fS - fB), iF, (int) (fS + fB), iF2);
        node.setBoundsInParent(rect);
    }

    public final Clause f(float f) {
        List list;
        MoneyClause moneyClause;
        hw0.z yAxisBadges = this.f155185h.getYAxisBadges();
        if (yAxisBadges != null && (list = yAxisBadges.d) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    moneyClause = null;
                    break;
                }
                Object obj2 = ((hw0.a) it8.next()).f155991a;
                MoneyClause moneyClause2 = obj2 instanceof MoneyClause ? (MoneyClause) obj2 : null;
                if (moneyClause2 != null) {
                    moneyClause = moneyClause2;
                    break;
                }
            }
            if (moneyClause != null) {
                return MoneyClause.b(moneyClause, dj0.d.c(moneyClause.f57821a, (long) f, null, 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            }
        }
        return new TextClause(String.valueOf(f), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
