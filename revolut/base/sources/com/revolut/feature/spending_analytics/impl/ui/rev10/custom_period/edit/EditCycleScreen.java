package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit;

import android.view.View;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WeekdayPickerDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import ip0.fg0;
import ip0.za;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lea.b;
import ljd.e;
import lpd.c;
import lpd.m;
import lpd.n;
import lpd.o;
import ppd.b0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/edit/EditCycleScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llpd/o;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/edit/EditCycleScreenContract$InputData;", "Llpd/m;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditCycleScreen extends BaseRecyclerViewScreen<o, EditCycleScreenContract$InputData, m> {
    public final int U;
    public final int V;
    public final FixedTabsDelegate W;
    public final GridSingleChoiceDelegate X;
    public final WeekdayPickerDelegate Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SingleChoiceDelegate f87669a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f87670b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f87671d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCycleScreen(EditCycleScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_account_picker;
        this.V = R$id.screenAccountPicker_recyclerView;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.W = fixedTabsDelegate;
        GridSingleChoiceDelegate gridSingleChoiceDelegate = new GridSingleChoiceDelegate();
        this.X = gridSingleChoiceDelegate;
        WeekdayPickerDelegate weekdayPickerDelegate = new WeekdayPickerDelegate();
        this.Y = weekdayPickerDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Z = largeActionButtonDelegate;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.f87669a0 = singleChoiceDelegate;
        this.f87670b0 = v.k(new ListSubheaderDelegate(), fixedTabsDelegate, gridSingleChoiceDelegate, weekdayPickerDelegate, largeActionButtonDelegate, singleChoiceDelegate, new HeaderDelegate(), new TextDelegate());
        this.c0 = w.y0(new e(this, 9));
        this.f87671d0 = w.y0(new b(this, inputData, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (b0) this.f87671d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, rd0.e.b(this.Z.d.f121375b), null, new lpd.a(this, null), 3);
        r map = ((SuggestionDelegate) this.Y.f53639c.getValue()).d.map(new fg0(new za(29), 23));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        a.g2(this, rd0.e.b(map), null, new lpd.b(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(this.W.f52339c.f121375b), null, new lpd.b(this, continuation, 1), 3);
        a.g2(this, rd0.e.b(this.X.f52390g.f121375b), null, new lpd.b(this, continuation, 2), 3);
        a.g2(this, rd0.e.b(this.f87669a0.p()), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF87670b0() {
        return this.f87670b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.U;
    }
}
