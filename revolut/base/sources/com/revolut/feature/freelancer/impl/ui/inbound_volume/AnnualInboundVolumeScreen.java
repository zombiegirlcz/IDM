package com.revolut.feature.freelancer.impl.ui.inbound_volume;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.inbound_volume.AnnualInboundVolumeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fx6.b;
import fx6.d;
import fx6.f;
import fx6.g;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import ufg.k0;
import us6.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/inbound_volume/AnnualInboundVolumeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfx6/g;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnnualInboundVolumeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AnnualInboundVolumeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final boolean K = true;
    public final int L = R$layout.screen_recycler_navbar_nextbutton;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new ft3.h0(25));
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AnnualInboundVolumeScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: fx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnnualInboundVolumeScreen f138747b;

            {
                this.f138747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnnualInboundVolumeScreen annualInboundVolumeScreen = this.f138747b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AnnualInboundVolumeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(annualInboundVolumeScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.c cVar = new us6.c();
                        int i6 = 18;
                        cVar.f282468a = e4m.b.b(new k0(qVar, cVar, i3, i6));
                        cVar.f282469b = e4m.b.b(new k0(qVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AnnualInboundVolumeScreen.S;
                        return (f) ((us6.c) annualInboundVolumeScreen.P.getValue()).f282469b.get();
                    default:
                        KProperty[] kPropertyArr3 = AnnualInboundVolumeScreen.S;
                        AnnualInboundVolumeScreen annualInboundVolumeScreen2 = this.f138747b;
                        return dli.f.a(annualInboundVolumeScreen2, annualInboundVolumeScreen2.R2(), v.k((InputChecklistDelegate) annualInboundVolumeScreen2.N.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), annualInboundVolumeScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: fx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnnualInboundVolumeScreen f138747b;

            {
                this.f138747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnnualInboundVolumeScreen annualInboundVolumeScreen = this.f138747b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnnualInboundVolumeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(annualInboundVolumeScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.c cVar = new us6.c();
                        int i6 = 18;
                        cVar.f282468a = e4m.b.b(new k0(qVar, cVar, i3, i6));
                        cVar.f282469b = e4m.b.b(new k0(qVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AnnualInboundVolumeScreen.S;
                        return (f) ((us6.c) annualInboundVolumeScreen.P.getValue()).f282469b.get();
                    default:
                        KProperty[] kPropertyArr3 = AnnualInboundVolumeScreen.S;
                        AnnualInboundVolumeScreen annualInboundVolumeScreen2 = this.f138747b;
                        return dli.f.a(annualInboundVolumeScreen2, annualInboundVolumeScreen2.R2(), v.k((InputChecklistDelegate) annualInboundVolumeScreen2.N.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), annualInboundVolumeScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: fx6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnnualInboundVolumeScreen f138747b;

            {
                this.f138747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AnnualInboundVolumeScreen annualInboundVolumeScreen = this.f138747b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnnualInboundVolumeScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(annualInboundVolumeScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.c cVar = new us6.c();
                        int i6 = 18;
                        cVar.f282468a = e4m.b.b(new k0(qVar, cVar, i32, i6));
                        cVar.f282469b = e4m.b.b(new k0(qVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AnnualInboundVolumeScreen.S;
                        return (f) ((us6.c) annualInboundVolumeScreen.P.getValue()).f282469b.get();
                    default:
                        KProperty[] kPropertyArr3 = AnnualInboundVolumeScreen.S;
                        AnnualInboundVolumeScreen annualInboundVolumeScreen2 = this.f138747b;
                        return dli.f.a(annualInboundVolumeScreen2, annualInboundVolumeScreen2.R2(), v.k((InputChecklistDelegate) annualInboundVolumeScreen2.N.getValue(), new PlainTextDelegate(), new RowLoadingDelegate(), annualInboundVolumeScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f138750a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f138751b);
        largeActionButton.setEnabled(uiState.f138752c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.N.getValue()).f52518c), null, new fx6.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
