package com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.PixAuthorisationRejectReasonScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m3g.c;
import m9a.b;
import m9a.e;
import m9a.f;
import m9a.g;
import no.d1;
import p12.s0;
import p8a.r;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/authorisation_request/screens/reject/PixAuthorisationRejectReasonScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm9a/e;", "Ldli/a;", "Lm9a/f;", "Lno/d1;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAuthorisationRejectReasonScreen extends ViewController<e> implements dli.a, d1 {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PixAuthorisationRejectReasonScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixBottomSheetTwoButtonsBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_pix_bottom_sheet_two_buttons;
    public final h O = s.t(this, a.f);
    public final Object P = w.y0(new c(13));

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, o8a.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/pix/impl/databinding/ScreenPixBottomSheetTwoButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return o8a.c.a(p0);
        }
    }

    public PixAuthorisationRejectReasonScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: m9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationRejectReasonScreen f203673b;

            {
                this.f203673b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen = this.f203673b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationRejectReasonScreen.Q;
                        return (g) ((r) pixAuthorisationRejectReasonScreen.M.getValue()).f234073b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationRejectReasonScreen.Q;
                        qji.b bVarU2 = pixAuthorisationRejectReasonScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.di.PixAuthorisationRejectReasonScreenInjector");
                        r rVar = new r();
                        int i3 = 18;
                        rVar.f234072a = e4m.b.b(new s0(rVar, 1, i3));
                        rVar.f234073b = e4m.b.b(new s0(rVar, 0, i3));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationRejectReasonScreen.Q;
                        PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen2 = this.f203673b;
                        return dli.f.a(pixAuthorisationRejectReasonScreen2, pixAuthorisationRejectReasonScreen2.d(), u.c((SelectableDelegate) pixAuthorisationRejectReasonScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: m9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationRejectReasonScreen f203673b;

            {
                this.f203673b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen = this.f203673b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationRejectReasonScreen.Q;
                        return (g) ((r) pixAuthorisationRejectReasonScreen.M.getValue()).f234073b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationRejectReasonScreen.Q;
                        qji.b bVarU2 = pixAuthorisationRejectReasonScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.di.PixAuthorisationRejectReasonScreenInjector");
                        r rVar = new r();
                        int i3 = 18;
                        rVar.f234072a = e4m.b.b(new s0(rVar, 1, i3));
                        rVar.f234073b = e4m.b.b(new s0(rVar, 0, i3));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationRejectReasonScreen.Q;
                        PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen2 = this.f203673b;
                        return dli.f.a(pixAuthorisationRejectReasonScreen2, pixAuthorisationRejectReasonScreen2.d(), u.c((SelectableDelegate) pixAuthorisationRejectReasonScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: m9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAuthorisationRejectReasonScreen f203673b;

            {
                this.f203673b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen = this.f203673b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAuthorisationRejectReasonScreen.Q;
                        return (g) ((r) pixAuthorisationRejectReasonScreen.M.getValue()).f234073b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixAuthorisationRejectReasonScreen.Q;
                        qji.b bVarU2 = pixAuthorisationRejectReasonScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.authorisation_request.screens.reject.di.PixAuthorisationRejectReasonScreenInjector");
                        r rVar = new r();
                        int i32 = 18;
                        rVar.f234072a = e4m.b.b(new s0(rVar, 1, i32));
                        rVar.f234073b = e4m.b.b(new s0(rVar, 0, i32));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr3 = PixAuthorisationRejectReasonScreen.Q;
                        PixAuthorisationRejectReasonScreen pixAuthorisationRejectReasonScreen2 = this.f203673b;
                        return dli.f.a(pixAuthorisationRejectReasonScreen2, pixAuthorisationRejectReasonScreen2.d(), u.c((SelectableDelegate) pixAuthorisationRejectReasonScreen2.P.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        o8a.c cVar = (o8a.c) value;
        l.A(R.string.common_action_reject, null, null, 14, cVar.f222970b);
        l.A(R.string.common_action_cancel, null, null, 14, cVar.d);
        cVar.f222971c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_authorisation_request_reject_modal_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.P.getValue()).r()), null, new b(this, null), 3);
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        o8a.c cVar = (o8a.c) value;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cVar.f222970b.o), null, new m9a.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cVar.d.o), null, new m9a.c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
