package com.revolut.feature.apm.breb.impl.ui.qr_request.add_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.R$layout;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreenContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr.h2;
import kw1.b;
import kw1.c;
import kw1.e;
import kw1.f;
import kw1.i;
import nv1.o;
import nv1.p;
import te0.w;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/qr_request/add_details/BrebQrRequestAddDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkw1/e;", "Ldli/a;", "Lkw1/f;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebQrRequestAddDetailsScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BrebQrRequestAddDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/breb/impl/databinding/ScreenBrebQrRequestDetailsBinding;", 0))};
    public final BrebQrRequestAddDetailsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Lazy O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;

    public BrebQrRequestAddDetailsScreen(BrebQrRequestAddDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_breb_qr_request_details;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: kw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestAddDetailsScreen f190199b;

            {
                this.f190199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen = this.f190199b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestAddDetailsScreen.T;
                        return (i) ((o) brebQrRequestAddDetailsScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestAddDetailsScreen.T;
                        return new CenteredAmountDelegate(new kj4.c(brebQrRequestAddDetailsScreen, 20));
                    case 2:
                        KProperty[] kPropertyArr3 = BrebQrRequestAddDetailsScreen.T;
                        qd0.b bVarN = ((o) brebQrRequestAddDetailsScreen.S.getValue()).f219434b.f219401j.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = BrebQrRequestAddDetailsScreen.T;
                        BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen2 = this.f190199b;
                        return dli.f.a(brebQrRequestAddDetailsScreen2, (i) brebQrRequestAddDetailsScreen2.M.getValue(), v.k((CenteredAmountDelegate) brebQrRequestAddDetailsScreen2.N.getValue(), (LargeActionButtonDelegate) brebQrRequestAddDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = BrebQrRequestAddDetailsScreen.T;
                        qji.b bVarU2 = brebQrRequestAddDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.di.BrebQrRequestAddDetailsScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        BrebQrRequestAddDetailsScreenContract$InputData brebQrRequestAddDetailsScreenContract$InputData = brebQrRequestAddDetailsScreen.K;
                        brebQrRequestAddDetailsScreenContract$InputData.getClass();
                        return new o(gVar, pVar2, brebQrRequestAddDetailsScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: kw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestAddDetailsScreen f190199b;

            {
                this.f190199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen = this.f190199b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestAddDetailsScreen.T;
                        return (i) ((o) brebQrRequestAddDetailsScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestAddDetailsScreen.T;
                        return new CenteredAmountDelegate(new kj4.c(brebQrRequestAddDetailsScreen, 20));
                    case 2:
                        KProperty[] kPropertyArr3 = BrebQrRequestAddDetailsScreen.T;
                        qd0.b bVarN = ((o) brebQrRequestAddDetailsScreen.S.getValue()).f219434b.f219401j.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = BrebQrRequestAddDetailsScreen.T;
                        BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen2 = this.f190199b;
                        return dli.f.a(brebQrRequestAddDetailsScreen2, (i) brebQrRequestAddDetailsScreen2.M.getValue(), v.k((CenteredAmountDelegate) brebQrRequestAddDetailsScreen2.N.getValue(), (LargeActionButtonDelegate) brebQrRequestAddDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = BrebQrRequestAddDetailsScreen.T;
                        qji.b bVarU2 = brebQrRequestAddDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.di.BrebQrRequestAddDetailsScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        BrebQrRequestAddDetailsScreenContract$InputData brebQrRequestAddDetailsScreenContract$InputData = brebQrRequestAddDetailsScreen.K;
                        brebQrRequestAddDetailsScreenContract$InputData.getClass();
                        return new o(gVar, pVar2, brebQrRequestAddDetailsScreenContract$InputData);
                }
            }
        });
        this.O = j.b(new h2(29));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: kw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestAddDetailsScreen f190199b;

            {
                this.f190199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen = this.f190199b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestAddDetailsScreen.T;
                        return (i) ((o) brebQrRequestAddDetailsScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestAddDetailsScreen.T;
                        return new CenteredAmountDelegate(new kj4.c(brebQrRequestAddDetailsScreen, 20));
                    case 2:
                        KProperty[] kPropertyArr3 = BrebQrRequestAddDetailsScreen.T;
                        qd0.b bVarN = ((o) brebQrRequestAddDetailsScreen.S.getValue()).f219434b.f219401j.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = BrebQrRequestAddDetailsScreen.T;
                        BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen2 = this.f190199b;
                        return dli.f.a(brebQrRequestAddDetailsScreen2, (i) brebQrRequestAddDetailsScreen2.M.getValue(), v.k((CenteredAmountDelegate) brebQrRequestAddDetailsScreen2.N.getValue(), (LargeActionButtonDelegate) brebQrRequestAddDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = BrebQrRequestAddDetailsScreen.T;
                        qji.b bVarU2 = brebQrRequestAddDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.di.BrebQrRequestAddDetailsScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        BrebQrRequestAddDetailsScreenContract$InputData brebQrRequestAddDetailsScreenContract$InputData = brebQrRequestAddDetailsScreen.K;
                        brebQrRequestAddDetailsScreenContract$InputData.getClass();
                        return new o(gVar, pVar2, brebQrRequestAddDetailsScreenContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: kw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestAddDetailsScreen f190199b;

            {
                this.f190199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen = this.f190199b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestAddDetailsScreen.T;
                        return (i) ((o) brebQrRequestAddDetailsScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestAddDetailsScreen.T;
                        return new CenteredAmountDelegate(new kj4.c(brebQrRequestAddDetailsScreen, 20));
                    case 2:
                        KProperty[] kPropertyArr3 = BrebQrRequestAddDetailsScreen.T;
                        qd0.b bVarN = ((o) brebQrRequestAddDetailsScreen.S.getValue()).f219434b.f219401j.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = BrebQrRequestAddDetailsScreen.T;
                        BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen2 = this.f190199b;
                        return dli.f.a(brebQrRequestAddDetailsScreen2, (i) brebQrRequestAddDetailsScreen2.M.getValue(), v.k((CenteredAmountDelegate) brebQrRequestAddDetailsScreen2.N.getValue(), (LargeActionButtonDelegate) brebQrRequestAddDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = BrebQrRequestAddDetailsScreen.T;
                        qji.b bVarU2 = brebQrRequestAddDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.di.BrebQrRequestAddDetailsScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        BrebQrRequestAddDetailsScreenContract$InputData brebQrRequestAddDetailsScreenContract$InputData = brebQrRequestAddDetailsScreen.K;
                        brebQrRequestAddDetailsScreenContract$InputData.getClass();
                        return new o(gVar, pVar2, brebQrRequestAddDetailsScreenContract$InputData);
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: kw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebQrRequestAddDetailsScreen f190199b;

            {
                this.f190199b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen = this.f190199b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebQrRequestAddDetailsScreen.T;
                        return (i) ((o) brebQrRequestAddDetailsScreen.S.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebQrRequestAddDetailsScreen.T;
                        return new CenteredAmountDelegate(new kj4.c(brebQrRequestAddDetailsScreen, 20));
                    case 2:
                        KProperty[] kPropertyArr3 = BrebQrRequestAddDetailsScreen.T;
                        qd0.b bVarN = ((o) brebQrRequestAddDetailsScreen.S.getValue()).f219434b.f219401j.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = BrebQrRequestAddDetailsScreen.T;
                        BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen2 = this.f190199b;
                        return dli.f.a(brebQrRequestAddDetailsScreen2, (i) brebQrRequestAddDetailsScreen2.M.getValue(), v.k((CenteredAmountDelegate) brebQrRequestAddDetailsScreen2.N.getValue(), (LargeActionButtonDelegate) brebQrRequestAddDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = BrebQrRequestAddDetailsScreen.T;
                        qji.b bVarU2 = brebQrRequestAddDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.di.BrebQrRequestAddDetailsScreenInjector");
                        p pVar = (p) bVarU2;
                        nv1.g gVar = pVar.f219437b;
                        p pVar2 = pVar.f219438c;
                        BrebQrRequestAddDetailsScreenContract$InputData brebQrRequestAddDetailsScreenContract$InputData = brebQrRequestAddDetailsScreen.K;
                        brebQrRequestAddDetailsScreenContract$InputData.getClass();
                        return new o(gVar, pVar2, brebQrRequestAddDetailsScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f200275b.setEnabled(uiState.f190204b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f200276c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.bre_b_qr_request_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(basicNavBar.f59211b), null, new c(this, null, 0), 3);
        d3().f200275b.setText(new TextLocalisedClause(R$string.bre_b_qr_request_amount_action_create, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f200275b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.N.getValue()).d.f121375b), null, new krc.h(this, null, 13), 3);
    }

    public final lv1.b d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lv1.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
