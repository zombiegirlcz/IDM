package com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection;

import afj.k;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.EsimGiftRecipientSelectionScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import uhj.c;
import uhj.e;
import uhj.f;
import uhj.g;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/gift_recipient_selection/EsimGiftRecipientSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luhj/e;", "Ldli/a;", "Luhj/g;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimGiftRecipientSelectionScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimGiftRecipientSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final h N = s.t(this, a.f);
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public EsimGiftRecipientSelectionScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: uhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGiftRecipientSelectionScreen f280254b;

            {
                this.f280254b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen = this.f280254b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGiftRecipientSelectionScreen.R;
                        EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen2 = this.f280254b;
                        return dli.f.a(esimGiftRecipientSelectionScreen2, (f) esimGiftRecipientSelectionScreen2.Q.getValue(), v.k(esimGiftRecipientSelectionScreen2.L, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), esimGiftRecipientSelectionScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGiftRecipientSelectionScreen.R;
                        qji.b bVarU2 = esimGiftRecipientSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.di.EsimGiftRecipientSelectionScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        return new k(mVar.f4337b, mVar.f4338c);
                    default:
                        KProperty[] kPropertyArr3 = EsimGiftRecipientSelectionScreen.R;
                        return (f) ((k) esimGiftRecipientSelectionScreen.P.getValue()).f4308a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: uhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGiftRecipientSelectionScreen f280254b;

            {
                this.f280254b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen = this.f280254b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGiftRecipientSelectionScreen.R;
                        EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen2 = this.f280254b;
                        return dli.f.a(esimGiftRecipientSelectionScreen2, (f) esimGiftRecipientSelectionScreen2.Q.getValue(), v.k(esimGiftRecipientSelectionScreen2.L, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), esimGiftRecipientSelectionScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGiftRecipientSelectionScreen.R;
                        qji.b bVarU2 = esimGiftRecipientSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.di.EsimGiftRecipientSelectionScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        return new k(mVar.f4337b, mVar.f4338c);
                    default:
                        KProperty[] kPropertyArr3 = EsimGiftRecipientSelectionScreen.R;
                        return (f) ((k) esimGiftRecipientSelectionScreen.P.getValue()).f4308a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimGiftRecipientSelectionScreen f280254b;

            {
                this.f280254b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen = this.f280254b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimGiftRecipientSelectionScreen.R;
                        EsimGiftRecipientSelectionScreen esimGiftRecipientSelectionScreen2 = this.f280254b;
                        return dli.f.a(esimGiftRecipientSelectionScreen2, (f) esimGiftRecipientSelectionScreen2.Q.getValue(), v.k(esimGiftRecipientSelectionScreen2.L, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), esimGiftRecipientSelectionScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimGiftRecipientSelectionScreen.R;
                        qji.b bVarU2 = esimGiftRecipientSelectionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.di.EsimGiftRecipientSelectionScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        return new k(mVar.f4337b, mVar.f4338c);
                    default:
                        KProperty[] kPropertyArr3 = EsimGiftRecipientSelectionScreen.R;
                        return (f) ((k) esimGiftRecipientSelectionScreen.P.getValue()).f4308a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_gifting_recipients_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_gifting_recipients_title, null, null, 14), null);
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new uea.e(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new uhj.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
