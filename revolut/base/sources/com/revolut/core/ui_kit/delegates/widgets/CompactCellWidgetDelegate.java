package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CompactCellDelegate;
import com.revolut.core.ui_kit.delegates.CompactCellLoadingDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CompactCellWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/CompactCellDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/b4;", "<init>", "()V", "Companion", "com/revolut/core/ui_kit/delegates/widgets/m0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompactCellWidgetDelegate extends GridWidgetDelegate<CompactCellDelegate.Model, com.revolut.core.ui_kit.delegates.b4> {
    public CompactCellWidgetDelegate() {
        int i = R$id.internal_compact_cell_grid_widget_view_type;
        ood.g0 rule = new ood.g0(28);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final List t() {
        return zhm.v.k(new CompactCellDelegate(), new CompactCellLoadingDelegate());
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final op0.a2 u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 8.0f);
        return new op0.a2(iK, iK);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate
    public final efm.r w(List innerDelegates, Function0 widgetModelProvider) {
        Intrinsics.checkNotNullParameter(innerDelegates, "innerDelegates");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        Object obj2 = innerDelegates.get(0);
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CompactCellDelegate");
        CompactCellDelegate compactCellDelegate = (CompactCellDelegate) obj2;
        o10.c cVar = (o10.c) widgetModelProvider;
        efm.r rVarMerge = efm.r.merge(compactCellDelegate.f52103c.map(new op0.x(5, new op0.g(cVar, 4))), compactCellDelegate.e.map(new op0.x(4, new op0.g(cVar, 3))), compactCellDelegate.d.map(new op0.x(2, new op0.g(cVar, 1))), compactCellDelegate.f.map(new op0.x(3, new op0.g(cVar, 2))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }
}
