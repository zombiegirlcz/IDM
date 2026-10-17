package r12;

import android.graphics.drawable.ColorDrawable;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.ApmToggles$ApmBackground;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q97.p1;
import tx0.r3;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends yji.d implements y02.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewController f250885c;
    public final y02.c d;
    public final gte.a e;
    public final ActionsDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionWidgetDelegate f250886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ContactsWidgetDelegate f250887h;
    public final RowsWidgetDelegate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RowDelegate f250888j;
    public final FullScreenStateDelegate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f250889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f250890m;

    public g(ViewController controller, y02.c host, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f250885c = controller;
        this.d = host;
        this.e = featureToggleInteractor;
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f = actionsDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.f250886g = actionWidgetDelegate;
        ContactsWidgetDelegate contactsWidgetDelegate = new ContactsWidgetDelegate();
        this.f250887h = contactsWidgetDelegate;
        RowsWidgetDelegate rowsWidgetDelegate = new RowsWidgetDelegate();
        this.i = rowsWidgetDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f250888j = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.k = fullScreenStateDelegate;
        this.f250889l = v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlaceholderRowDelegate(), fullScreenStateDelegate, actionsDelegate, actionWidgetDelegate, contactsWidgetDelegate, rowsWidgetDelegate, rowDelegate);
        this.f250890m = j.b(new p1(this, 29));
    }

    @Override // yji.d
    public final void M() {
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(((w02.a) this.f250890m.getValue()).f293619c.f59410q), new r0e.c(this, continuation, 1), 3);
        yji.d.H(this, rd0.e.b(this.k.f52371h.f121375b), new b(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f.f51611c.f121375b), new c(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f250886g.f51589c.f121375b), new qp7.g(this, continuation, 21), 3);
        yji.d.H(this, rd0.e.b(this.f250888j.f53218h), new d(this, null), 3);
        yji.d.H(this, rd0.e.b(this.i.f), new e(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f250887h.f), new f(this, null), 3);
    }

    public final void Q(y02.b uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ((w02.a) this.f250890m.getValue()).f293618b.setBackgroundType(uiState.m());
    }

    @Override // yji.d
    public final void onCreate() {
        Lazy lazy = this.f250890m;
        NavBarWithToolbar navBarWithToolbar = ((w02.a) lazy.getValue()).f293619c;
        y02.c cVar = this.d;
        navBarWithToolbar.setTitle(cVar.G(), null);
        navBarWithToolbar.setToolbarTitle(cVar.G());
        navBarWithToolbar.setEndImage(new r3(new yy0.j(cVar.l().F())));
        if (((jte.d) this.e).c(ApmToggles$ApmBackground.f61776c)) {
            ((w02.a) lazy.getValue()).f293618b.setForeground(new ColorDrawable(io0.a.d(0.2f, kli.a.s(R$attr.uikit_colorBackground, this.f250885c.m2()))));
        }
    }
}
