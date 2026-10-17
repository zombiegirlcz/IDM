package com.revolut.core.backend_flow.impl.ui.entities_selection;

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
import fa0.o;
import iv0.p;
import j2c.b;
import j68.a;
import java.util.List;
import jb0.c;
import jb0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/entities_selection/EntitiesSelectionController;", "Lcom/revolut/core/backend_flow/impl/ui/base_form_screen/BaseFormController;", "Ljb0/d;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EntitiesSelectionController extends BaseFormController<d> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f51262b0 = 0;
    public final Object V;
    public final Object W;
    public final FullScreenStateDelegate X;
    public final SelectableDelegate Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final f0 f51263a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntitiesSelectionController(FormScreen screen) {
        super(screen);
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.V = w.y0(new a(this, screen, 9));
        this.W = w.y0(new p(this, 23));
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.X = fullScreenStateDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(this.O);
        this.Y = selectableDelegate;
        this.Z = v.k(fullScreenStateDelegate, this.O, selectableDelegate, new SwipeToActionDelegate(this.O, false), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate());
        this.f51263a0 = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.V.getValue();
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        com.revolut.kompot.navigable.a.g2(this, sb0.e.a((ScreenContentRecyclerView) h()), null, new b(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f52371h.f121375b), null, new jb0.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.r()), null, new jb0.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new c(this, null), 3);
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: f3 */
    public final List getC0() {
        return this.f51263a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    public final ta0.a g3() {
        return (o) this.V.getValue();
    }

    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: i3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController
    /* JADX INFO: renamed from: k3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final jb0.e h3() {
        return (jb0.e) this.W.getValue();
    }
}
