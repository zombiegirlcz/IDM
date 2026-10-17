package com.revolut.feature.apm.breb.impl.ui.qr_request.request;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalSmallButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.R$id;
import com.revolut.feature.apm.breb.impl.R$layout;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableStateFlow;
import nv1.r;
import oli.f;
import oqj.d;
import ow1.b;
import ow1.c;
import ow1.g;
import ow1.m;
import ow1.n;
import te0.w;
import vc.s;
import vkm.j2;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/request/BrebQrRequestScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Low1/m;", "Ldli/a;", "Low1/n;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebQrRequestScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(BrebQrRequestScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/breb/impl/databinding/ScreenBrebQrRequestBinding;", 0))};
    public final MutableStateFlow K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Lazy P;
    public final Lazy Q;
    public final Lazy R;
    public final Lazy S;
    public final Lazy T;
    public final Lazy U;
    public final Object V;

    public BrebQrRequestScreen(j2 inputDataFlow) {
        Intrinsics.checkNotNullParameter(inputDataFlow, "inputDataFlow");
        this.K = inputDataFlow;
        this.L = R$layout.screen_breb_qr_request;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ow1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestScreen f230258b;

            {
                this.f230258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebQrRequestScreen brebQrRequestScreen = this.f230258b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestScreen.W;
                        qji.b bVarU2 = brebQrRequestScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.request.di.BrebQrRequestScreenInjector");
                        nv1.p pVar = (nv1.p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        nv1.p pVar2 = pVar.f219438c;
                        MutableStateFlow mutableStateFlow = brebQrRequestScreen.K;
                        mutableStateFlow.getClass();
                        return new nv1.r(gVar, pVar2, mutableStateFlow);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestScreen.W;
                        return (q) ((nv1.r) brebQrRequestScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = BrebQrRequestScreen.W;
                        BrebQrRequestScreen brebQrRequestScreen2 = this.f230258b;
                        return dli.f.a(brebQrRequestScreen2, brebQrRequestScreen2.R2(), v.k((TextDelegate) brebQrRequestScreen2.R.getValue(), new QRCodeDelegate(), new QRCodeLoadingDelegate(), new RowLoadingDelegate(), new ActionsLoadingDelegate(), (CircleActionButtonsBarDelegate) brebQrRequestScreen2.U.getValue(), (TwinHorizontalSmallButtonDelegate) brebQrRequestScreen2.T.getValue(), (SmallActionButtonDelegate) brebQrRequestScreen2.S.getValue(), (FullScreenStateDelegate) brebQrRequestScreen2.P.getValue(), (ActionsDelegate) brebQrRequestScreen2.Q.getValue()), R$id.brebArea_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ow1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestScreen f230258b;

            {
                this.f230258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebQrRequestScreen brebQrRequestScreen = this.f230258b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestScreen.W;
                        qji.b bVarU2 = brebQrRequestScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.request.di.BrebQrRequestScreenInjector");
                        nv1.p pVar = (nv1.p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        nv1.p pVar2 = pVar.f219438c;
                        MutableStateFlow mutableStateFlow = brebQrRequestScreen.K;
                        mutableStateFlow.getClass();
                        return new nv1.r(gVar, pVar2, mutableStateFlow);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestScreen.W;
                        return (q) ((nv1.r) brebQrRequestScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = BrebQrRequestScreen.W;
                        BrebQrRequestScreen brebQrRequestScreen2 = this.f230258b;
                        return dli.f.a(brebQrRequestScreen2, brebQrRequestScreen2.R2(), v.k((TextDelegate) brebQrRequestScreen2.R.getValue(), new QRCodeDelegate(), new QRCodeLoadingDelegate(), new RowLoadingDelegate(), new ActionsLoadingDelegate(), (CircleActionButtonsBarDelegate) brebQrRequestScreen2.U.getValue(), (TwinHorizontalSmallButtonDelegate) brebQrRequestScreen2.T.getValue(), (SmallActionButtonDelegate) brebQrRequestScreen2.S.getValue(), (FullScreenStateDelegate) brebQrRequestScreen2.P.getValue(), (ActionsDelegate) brebQrRequestScreen2.Q.getValue()), R$id.brebArea_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = j.b(new d(21));
        this.Q = j.b(new d(22));
        this.R = j.b(new d(23));
        this.S = j.b(new d(24));
        this.T = j.b(new d(25));
        this.U = j.b(new d(26));
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: ow1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestScreen f230258b;

            {
                this.f230258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebQrRequestScreen brebQrRequestScreen = this.f230258b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestScreen.W;
                        qji.b bVarU2 = brebQrRequestScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.request.di.BrebQrRequestScreenInjector");
                        nv1.p pVar = (nv1.p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        nv1.p pVar2 = pVar.f219438c;
                        MutableStateFlow mutableStateFlow = brebQrRequestScreen.K;
                        mutableStateFlow.getClass();
                        return new nv1.r(gVar, pVar2, mutableStateFlow);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestScreen.W;
                        return (q) ((nv1.r) brebQrRequestScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = BrebQrRequestScreen.W;
                        BrebQrRequestScreen brebQrRequestScreen2 = this.f230258b;
                        return dli.f.a(brebQrRequestScreen2, brebQrRequestScreen2.R2(), v.k((TextDelegate) brebQrRequestScreen2.R.getValue(), new QRCodeDelegate(), new QRCodeLoadingDelegate(), new RowLoadingDelegate(), new ActionsLoadingDelegate(), (CircleActionButtonsBarDelegate) brebQrRequestScreen2.U.getValue(), (TwinHorizontalSmallButtonDelegate) brebQrRequestScreen2.T.getValue(), (SmallActionButtonDelegate) brebQrRequestScreen2.S.getValue(), (FullScreenStateDelegate) brebQrRequestScreen2.P.getValue(), (ActionsDelegate) brebQrRequestScreen2.Q.getValue()), R$id.brebArea_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BasicNavBar basicNavBar = ((lv1.a) value).f200273b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.bre_b_qr_request_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((lv1.a) value).f200273b.f59211b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), null, new ow1.d(this, null), 3);
        Lazy lazy = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) lazy.getValue()).f53530c), null, new ow1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) lazy.getValue()).d), null, new f(this, null, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.Q.getValue()).f51611c.f121375b), null, new ow1.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SmallActionButtonDelegate) this.S.getValue()).f53336c.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CircleActionButtonsBarDelegate) this.U.getValue()).f52087c.f121375b), null, new ow1.h(this, null), 3);
        Lazy lazy2 = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TwinHorizontalSmallButtonDelegate) lazy2.getValue()).f53573c.f121375b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TwinHorizontalSmallButtonDelegate) lazy2.getValue()).d.f121375b), null, new c(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final ow1.q R2() {
        return (ow1.q) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
