package com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.PixAuthorisationConfirmScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import i52.j;
import i83.b;
import i9a.e;
import i9a.f;
import i9a.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.d1;
import o8a.c;
import p12.s0;
import p8a.p;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/confirm/PixAuthorisationConfirmScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li9a/e;", "Ldli/a;", "Li9a/f;", "Lno/d1;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAuthorisationConfirmScreen extends ViewController<e> implements dli.a, d1 {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PixAuthorisationConfirmScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixBottomSheetTwoButtonsBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_pix_bottom_sheet_two_buttons;
    public final h O = s.t(this, a.f);
    public final Object P = w.y0(new b(4));

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/pix/impl/databinding/ScreenPixBottomSheetTwoButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return c.a(p0);
        }
    }

    public PixAuthorisationConfirmScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: i9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationConfirmScreen f159614b;

            {
                this.f159614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen = this.f159614b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationConfirmScreen.Q;
                        return (g) ((p) pixAuthorisationConfirmScreen.M.getValue()).f234050b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationConfirmScreen.Q;
                        qji.b bVarU2 = pixAuthorisationConfirmScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.di.PixAuthorisationConfirmScreenInjector");
                        p pVar = new p();
                        int i3 = 17;
                        pVar.f234049a = e4m.b.b(new s0(pVar, 1, i3));
                        pVar.f234050b = e4m.b.b(new s0(pVar, 0, i3));
                        return pVar;
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationConfirmScreen.Q;
                        PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen2 = this.f159614b;
                        return dli.f.a(pixAuthorisationConfirmScreen2, (g) pixAuthorisationConfirmScreen2.L.getValue(), u.c((SelectableDelegate) pixAuthorisationConfirmScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: i9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationConfirmScreen f159614b;

            {
                this.f159614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen = this.f159614b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationConfirmScreen.Q;
                        return (g) ((p) pixAuthorisationConfirmScreen.M.getValue()).f234050b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationConfirmScreen.Q;
                        qji.b bVarU2 = pixAuthorisationConfirmScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.di.PixAuthorisationConfirmScreenInjector");
                        p pVar = new p();
                        int i3 = 17;
                        pVar.f234049a = e4m.b.b(new s0(pVar, 1, i3));
                        pVar.f234050b = e4m.b.b(new s0(pVar, 0, i3));
                        return pVar;
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationConfirmScreen.Q;
                        PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen2 = this.f159614b;
                        return dli.f.a(pixAuthorisationConfirmScreen2, (g) pixAuthorisationConfirmScreen2.L.getValue(), u.c((SelectableDelegate) pixAuthorisationConfirmScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: i9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationConfirmScreen f159614b;

            {
                this.f159614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen = this.f159614b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationConfirmScreen.Q;
                        return (g) ((p) pixAuthorisationConfirmScreen.M.getValue()).f234050b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationConfirmScreen.Q;
                        qji.b bVarU2 = pixAuthorisationConfirmScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.di.PixAuthorisationConfirmScreenInjector");
                        p pVar = new p();
                        int i32 = 17;
                        pVar.f234049a = e4m.b.b(new s0(pVar, 1, i32));
                        pVar.f234050b = e4m.b.b(new s0(pVar, 0, i32));
                        return pVar;
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationConfirmScreen.Q;
                        PixAuthorisationConfirmScreen pixAuthorisationConfirmScreen2 = this.f159614b;
                        return dli.f.a(pixAuthorisationConfirmScreen2, (g) pixAuthorisationConfirmScreen2.L.getValue(), u.c((SelectableDelegate) pixAuthorisationConfirmScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f222970b.setEnabled(uiState.f159617a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        c cVarD3 = d3();
        cVarD3.f222970b.setText(new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_confirmation_modal_confirm, null, null, 14));
        cVarD3.d.setText(new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_confirmation_modal_go_back, null, null, 14));
        cVarD3.f222971c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_authorisation_request_down_payment_confirmation_modal_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarFilter = ((SelectableDelegate) this.P.getValue()).r().filter(new j(8, new i6j.p(17)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new i9a.b(this, null), 3);
        c cVarD3 = d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cVarD3.f222970b.o), null, new i9a.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cVarD3.d.o), null, new i9a.c(this, null, 1), 3);
    }

    public final c d3() {
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
