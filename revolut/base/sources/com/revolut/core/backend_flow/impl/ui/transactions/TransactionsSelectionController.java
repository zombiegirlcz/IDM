package com.revolut.core.backend_flow.impl.ui.transactions;

import android.view.View;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import y1a.a;
import y99.c;
import yb0.b;
import yb0.d;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/transactions/TransactionsSelectionController;", "Lcom/revolut/core/backend_flow/impl/ui/base_form_screen/BaseFormController;", "Lyb0/d;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsSelectionController extends BaseFormController<d> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f51291b0 = 0;
    public final Object V;
    public final Object W;
    public final FullScreenStateDelegate X;
    public final SelectableDelegate Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final f0 f51292a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsSelectionController(FormScreen screen) {
        super(screen);
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.V = w.y0(new a(this, screen, 14));
        this.W = w.y0(new c(this, 2));
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.X = fullScreenStateDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(this.O);
        this.Y = selectableDelegate;
        this.Z = v.k(fullScreenStateDelegate, this.O, selectableDelegate, new SwipeToActionDelegate(this.O, false), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate());
        this.f51292a0 = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fa0.w) this.V.getValue();
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        com.revolut.kompot.navigable.a.g2(this, sb0.e.a((ScreenContentRecyclerView) h()), null, new y5g.d(this, null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f52371h.f121375b), null, new yb0.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.r()), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new yb0.c(this, null), 3);
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: f3 */
    public final List getC0() {
        return this.f51292a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    public final ta0.a g3() {
        return (fa0.w) this.V.getValue();
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: i3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: k3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final yb0.e h3() {
        return (yb0.e) this.W.getValue();
    }
}
