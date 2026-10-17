package com.revolut.feature.transport.impl.ui.location;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hvf.u;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nuh.j;
import nwc.f;
import nwf.b;
import nwf.c;
import nwf.d;
import nwf.g;
import nwf.i;
import rd0.e;
import te0.w;
import vc.s;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/location/TransportLocationChooserScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnwf/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lnwf/g;", "<init>", "()V", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportLocationChooserScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(TransportLocationChooserScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92554a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f92555b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TransportLocationChooserScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: nwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportLocationChooserScreen f219858b;

            {
                this.f219858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransportLocationChooserScreen transportLocationChooserScreen = this.f219858b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransportLocationChooserScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(transportLocationChooserScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new u(((hvf.q) aVar2.b()).k, transportLocationChooserScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr2 = TransportLocationChooserScreen.c0;
                        return (h) ((u) transportLocationChooserScreen.X.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: nwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportLocationChooserScreen f219858b;

            {
                this.f219858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransportLocationChooserScreen transportLocationChooserScreen = this.f219858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportLocationChooserScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(transportLocationChooserScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new u(((hvf.q) aVar2.b()).k, transportLocationChooserScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr2 = TransportLocationChooserScreen.c0;
                        return (h) ((u) transportLocationChooserScreen.X.getValue()).f.get();
                }
            }
        });
        Lazy lazyY0 = w.y0(new b(0));
        this.Z = lazyY0;
        Lazy lazyY02 = w.y0(new b(1));
        this.f92554a0 = lazyY02;
        this.f92555b0 = v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (RowDelegate) lazyY0.getValue(), (FullScreenStateDelegate) lazyY02.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (u) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (nwf.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        g3().f174540c.setItemAnimator(null);
        y.g(h(), m2());
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.transport_hub_location_search_hint, null, null, 14));
        navBarWithToolbar.post(new k0.b(navBarWithToolbar, this, 24));
        SearchView searchView = g3().f174539b.f59409p;
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57337m), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57336l), null, new j(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.f92554a0.getValue()).f52371h.f121375b), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92555b0() {
        return this.f92555b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final m g3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }
}
