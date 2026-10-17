package com.revolut.feature.transfer_reasons.impl.ui.refund;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.impl.ui.refund.TransferReasonsIsRefundScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import jkc.g;
import jsl.b;
import jtf.f;
import jtf.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/refund/TransferReasonsIsRefundScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljtf/f;", "Ldli/a;", "Ljtf/i;", "<init>", "()V", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsIsRefundScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TransferReasonsIsRefundScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_recycler_navbar;
    public final Object O = w.y0(new b(13));
    public final h P = s.t(this, a.f);

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

    public TransferReasonsIsRefundScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: jtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsIsRefundScreen f178503b;

            {
                this.f178503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferReasonsIsRefundScreen transferReasonsIsRefundScreen = this.f178503b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsIsRefundScreen.Q;
                        TransferReasonsIsRefundScreen transferReasonsIsRefundScreen2 = this.f178503b;
                        return dli.f.a(transferReasonsIsRefundScreen2, (h) transferReasonsIsRefundScreen2.N.getValue(), u.c((RowDelegate) transferReasonsIsRefundScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsIsRefundScreen.Q;
                        qji.b bVarU2 = transferReasonsIsRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.refund.di.TransferReasonsIsRefundScreenInjector");
                        nsf.e eVar = new nsf.e();
                        eVar.f218813a = e4m.b.b(new m0m.a(18));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = TransferReasonsIsRefundScreen.Q;
                        return (h) ((nsf.e) transferReasonsIsRefundScreen.M.getValue()).f218813a.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: jtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsIsRefundScreen f178503b;

            {
                this.f178503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferReasonsIsRefundScreen transferReasonsIsRefundScreen = this.f178503b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsIsRefundScreen.Q;
                        TransferReasonsIsRefundScreen transferReasonsIsRefundScreen2 = this.f178503b;
                        return dli.f.a(transferReasonsIsRefundScreen2, (h) transferReasonsIsRefundScreen2.N.getValue(), u.c((RowDelegate) transferReasonsIsRefundScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsIsRefundScreen.Q;
                        qji.b bVarU2 = transferReasonsIsRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.refund.di.TransferReasonsIsRefundScreenInjector");
                        nsf.e eVar = new nsf.e();
                        eVar.f218813a = e4m.b.b(new m0m.a(18));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = TransferReasonsIsRefundScreen.Q;
                        return (h) ((nsf.e) transferReasonsIsRefundScreen.M.getValue()).f218813a.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: jtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferReasonsIsRefundScreen f178503b;

            {
                this.f178503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferReasonsIsRefundScreen transferReasonsIsRefundScreen = this.f178503b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferReasonsIsRefundScreen.Q;
                        TransferReasonsIsRefundScreen transferReasonsIsRefundScreen2 = this.f178503b;
                        return dli.f.a(transferReasonsIsRefundScreen2, (h) transferReasonsIsRefundScreen2.N.getValue(), u.c((RowDelegate) transferReasonsIsRefundScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferReasonsIsRefundScreen.Q;
                        qji.b bVarU2 = transferReasonsIsRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.refund.di.TransferReasonsIsRefundScreenInjector");
                        nsf.e eVar = new nsf.e();
                        eVar.f218813a = e4m.b.b(new m0m.a(18));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = TransferReasonsIsRefundScreen.Q;
                        return (h) ((nsf.e) transferReasonsIsRefundScreen.M.getValue()).f218813a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nsf.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jtf.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_reasons_refund_step_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.transfer_reasons_refund_step_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new g(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new jtf.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.L.getValue();
    }
}
