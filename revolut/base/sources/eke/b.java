package eke;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ux0.s;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements c, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f127031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f127032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f127033c;

    public b(ImmutableSet extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f127031a = extensions;
        List listP0 = d0.P0(extensions, new a());
        this.f127032b = listP0;
        this.f127033c = new AtomicReference(d0.b0(listP0));
    }

    @Override // dje.b
    public final Object A0(String str, ActionsView.Item item, zje.h hVar) {
        Object objA0 = ((dje.a) this.f127033c.get()).A0(str, item, hVar);
        return objA0 == fim.a.COROUTINE_SUSPENDED ? objA0 : Unit.f186387a;
    }

    @Override // dje.b
    public final void L(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        ((dje.a) this.f127033c.get()).L(clickData);
    }

    @Override // dje.b
    public final void N1(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ((dje.a) this.f127033c.get()).N1(model);
    }

    @Override // dje.b
    public final void Q(AccountSelectionNavBarContentView.b scrollingState) {
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
        ((dje.a) this.f127033c.get()).Q(scrollingState);
    }

    @Override // dje.b
    public final void V1(s state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((dje.a) this.f127033c.get()).V1(state);
    }

    @Override // dje.b
    public final void W1() {
        ((dje.a) this.f127033c.get()).W1();
    }

    public final void a(String accountId) {
        Object next;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Iterator it8 = this.f127031a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((dje.a) next).i().a7(accountId)) {
                    break;
                }
            }
        }
        dje.a aVar = (dje.a) next;
        if (aVar != null) {
            this.f127033c.set(aVar);
        }
    }

    @Override // dje.b
    public final void c1() {
        ((dje.a) this.f127033c.get()).c1();
    }

    @Override // dje.b
    public final void j() {
        ((dje.a) this.f127033c.get()).j();
    }

    @Override // dje.b
    public final void m1(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ((dje.a) this.f127033c.get()).m1(accountId);
    }

    @Override // dje.b
    public final void q0(String accountId, String menuItemId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
        ((dje.a) this.f127033c.get()).q0(accountId, menuItemId);
    }
}
