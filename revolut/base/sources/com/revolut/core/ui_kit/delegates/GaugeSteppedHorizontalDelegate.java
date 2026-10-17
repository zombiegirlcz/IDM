package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import com.revolut.core.ui_kit.internal.views.gaugechart.bullethorizontal.ProgressStepHorizontalView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.hk;
import ip0.ik;
import ip0.jk;
import ip0.kk;
import ip0.lk;
import ip0.mk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/GaugeSteppedHorizontalDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/kk;", "Lip0/mk;", "<init>", "()V", "ip0/lk", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GaugeSteppedHorizontalDelegate extends BaseRecyclerViewDelegate<kk, mk> {
    public GaugeSteppedHorizontalDelegate() {
        super(R$layout.internal_delegate_gauge_stepped_horizontal, new dk(1));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new mk(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(mk holder, kk data, int i, List list) {
        Iterator it8;
        LayeredImage layeredImageG;
        List<lk> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ProgressStepHorizontalView progressStepHorizontalView = holder.f165395g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof lk)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        if (payloads != null) {
            for (lk lkVar : payloads) {
                zN = zN || lkVar.f165214a;
                zN2 = zN2 || lkVar.f165215b;
                zN3 = zN3 || lkVar.f165216c;
                zN4 = zN4 || lkVar.d;
            }
        }
        if (zN) {
            hk hkVar = data.f165028b;
            hk hkVar2 = data.f165027a;
            int i3 = hkVar2.f164570c;
            progressStepHorizontalView.setProgresses(zhm.v.k(new qt0.d(hkVar.d, hkVar.f164570c), new qt0.d(hkVar2.d, i3)));
            HorizontalChartLegendView horizontalChartLegendView = holder.f;
            aw0.q1 q1Var = new aw0.q1(i3, Integer.valueOf(i3), hkVar2.f164568a, hkVar2.f164569b);
            hk hkVar3 = data.f165028b;
            int i5 = hkVar3.f164570c;
            horizontalChartLegendView.setModel(new aw0.o1(zhm.v.k(q1Var, new aw0.q1(i5, Integer.valueOf(i5), hkVar3.f164568a, hkVar3.f164569b))));
        }
        if (zN2) {
            List list2 = data.f165029c;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                jk jkVar = (jk) it9.next();
                hk hkVar4 = data.f165027a;
                hk hkVar5 = data.f165028b;
                float f = jkVar.e;
                PercentageClause percentageClause = jkVar.f164854a;
                Clause clause = jkVar.f164855b;
                Clause clause2 = jkVar.f164856c;
                ik ikVar = jkVar.d;
                if (ikVar != null) {
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    int i6 = ikVar.f164708a;
                    it8 = it9;
                    Color.Solid solid = new Color.Solid(R$attr.uikit_colorWhite);
                    int i21 = ikVar.f164709b;
                    layeredImageG = LayeredImage.Companion.g(companion, i6, solid, new Color.Solid(i21), new Color.Solid(i21), null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 496);
                } else {
                    it8 = it9;
                    layeredImageG = null;
                }
                float f4 = hkVar4.d;
                arrayList.add(new qt0.b(percentageClause, f, (f4 != BitmapDescriptorFactory.HUE_RED && jkVar.e <= f4) ? hkVar4.f164570c : hkVar5.f164570c, clause, clause2, layeredImageG));
                it9 = it8;
            }
            progressStepHorizontalView.setSteps(arrayList);
        }
        if (zN3) {
            progressStepHorizontalView.setProgressBackgroundLineColor(data.d);
        }
        if (zN4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
