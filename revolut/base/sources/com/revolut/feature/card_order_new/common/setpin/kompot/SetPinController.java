package com.revolut.feature.card_order_new.common.setpin.kompot;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.common.R$layout;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinController;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import hy2.l;
import i0k.f;
import i13.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import qwd.o;
import tz2.p;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_order_new/common/setpin/kompot/SetPinController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card_order_new/common/setpin/kompot/b;", "Lcli/w;", "Li13/m;", "Lno/m;", "feature_card_order_new_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetPinController extends ViewController<b> implements w, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SetPinController.class, "binding", "getBinding()Lcom/revolut/feature/card_order_new/common/databinding/ScreenSetPinBinding;", 0))};
    public final SetPinScreenContract$InputData K;
    public final AnalyticsProduct L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SetPinController(SetPinScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.getF65013a();
        this.M = R$layout.screen_set_pin;
        this.N = s.t(this, i13.b.f);
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: i13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetPinController f157529b;

            {
                this.f157529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SetPinController setPinController = this.f157529b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SetPinController.R;
                        qji.b bVarU2 = setPinController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.common.setpin.kompot.di.SetPinControllerInjector");
                        p pVar = (p) ((j13.a) bVarU2).b().mo3808a(setPinController);
                        SetPinScreenContract$InputData setPinScreenContract$InputData = setPinController.K;
                        switch (pVar.f275816a) {
                            case 0:
                                setPinScreenContract$InputData.getClass();
                                pVar.f275818c = setPinScreenContract$InputData;
                                break;
                            default:
                                setPinScreenContract$InputData.getClass();
                                pVar.f275818c = setPinScreenContract$InputData;
                                break;
                        }
                        return (j13.b) pVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SetPinController.R;
                        return ((j13.b) setPinController.O.getValue()).d();
                    default:
                        KProperty[] kPropertyArr3 = SetPinController.R;
                        return n14.e.a(setPinController, (h) setPinController.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: i13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetPinController f157529b;

            {
                this.f157529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SetPinController setPinController = this.f157529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetPinController.R;
                        qji.b bVarU2 = setPinController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.common.setpin.kompot.di.SetPinControllerInjector");
                        p pVar = (p) ((j13.a) bVarU2).b().mo3808a(setPinController);
                        SetPinScreenContract$InputData setPinScreenContract$InputData = setPinController.K;
                        switch (pVar.f275816a) {
                            case 0:
                                setPinScreenContract$InputData.getClass();
                                pVar.f275818c = setPinScreenContract$InputData;
                                break;
                            default:
                                setPinScreenContract$InputData.getClass();
                                pVar.f275818c = setPinScreenContract$InputData;
                                break;
                        }
                        return (j13.b) pVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SetPinController.R;
                        return ((j13.b) setPinController.O.getValue()).d();
                    default:
                        KProperty[] kPropertyArr3 = SetPinController.R;
                        return n14.e.a(setPinController, (h) setPinController.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: i13.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetPinController f157529b;

            {
                this.f157529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SetPinController setPinController = this.f157529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetPinController.R;
                        qji.b bVarU2 = setPinController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.common.setpin.kompot.di.SetPinControllerInjector");
                        p pVar = (p) ((j13.a) bVarU2).b().mo3808a(setPinController);
                        SetPinScreenContract$InputData setPinScreenContract$InputData = setPinController.K;
                        switch (pVar.f275816a) {
                            case 0:
                                setPinScreenContract$InputData.getClass();
                                pVar.f275818c = setPinScreenContract$InputData;
                                break;
                            default:
                                setPinScreenContract$InputData.getClass();
                                pVar.f275818c = setPinScreenContract$InputData;
                                break;
                        }
                        return (j13.b) pVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SetPinController.R;
                        return ((j13.b) setPinController.O.getValue()).d();
                    default:
                        KProperty[] kPropertyArr3 = SetPinController.R;
                        return n14.e.a(setPinController, (h) setPinController.P.getValue());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // cli.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(cli.o r4, cli.q r5) {
        /*
            r3 = this;
            i13.m r4 = (i13.m) r4
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r5 instanceof i13.l
            r1 = 0
            if (r0 == 0) goto Lf
            i13.l r5 = (i13.l) r5
            goto L10
        Lf:
            r5 = r1
        L10:
            if (r5 == 0) goto L19
            boolean r0 = r5.f157539a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L1a
        L19:
            r0 = r1
        L1a:
            boolean r0 = pd.b.k(r0)
            if (r0 != 0) goto L30
            if (r5 == 0) goto L29
            boolean r0 = r5.f157540b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L2a
        L29:
            r0 = r1
        L2a:
            boolean r0 = pd.b.k(r0)
            if (r0 == 0) goto L44
        L30:
            h13.a r0 = r3.d3()
            com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar r0 = r0.f148454c
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r4.f157542a
            r0.setTitle(r2, r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r4.f157543b
            r0.setDescriptionText(r2)
            r2 = 1
            r0.setDescriptionVisible(r2)
        L44:
            if (r5 == 0) goto L4c
            boolean r5 = r5.f157541c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
        L4c:
            boolean r5 = pd.b.k(r1)
            if (r5 == 0) goto L71
            h13.a r5 = r3.d3()
            com.revolut.core.ui_kit.views.code.CodeEditor r5 = r5.f148453b
            ip0.ab r0 = r5.mode
            int r0 = r0.a()
            r1 = 0
        L5f:
            if (r1 >= r0) goto L69
            java.lang.String r2 = ""
            r5.l0(r1, r2)
            int r1 = r1 + 1
            goto L5f
        L69:
            boolean r0 = r5.autoFocusEnabled
            r5.f0(r0)
            r5.g0()
        L71:
            boolean r4 = r4.d
            h13.a r5 = r3.d3()
            com.revolut.core.ui_kit.views.code.CodeEditor r5 = r5.f148453b
            r5.setAutoFocusEnabled(r4)
            if (r4 != 0) goto L93
            h13.a r4 = r3.d3()
            com.revolut.core.ui_kit.views.code.CodeEditor r4 = r4.f148453b
            android.view.View r4 = r4.getFocusedChild()
            if (r4 == 0) goto L93
            h13.a r5 = r3.d3()
            com.revolut.core.ui_kit.views.code.CodeEditor r5 = r5.f148453b
            r5.clearChildFocus(r4)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.common.setpin.kompot.SetPinController.B(cli.o, cli.q):void");
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j13.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i13.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f148454c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        CodeEditor screenSetPinCodeInput = d3().f148453b;
        Intrinsics.checkNotNullExpressionValue(screenSetPinCodeInput, "screenSetPinCodeInput");
        pd.b.p(screenSetPinCodeInput, new TextLocalisedClause(R$string.card_pin_input_accessibility_label, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148454c.f59410q), null, new i13.c(this, null, 0), 3);
        r rVarFilter = te0.w.q0(d3().f148453b.f59038h).filter(new l(new f(6), 28));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new i13.c(this, null, 1), 3);
        r map = d3().f148453b.f59037g.map(new qsa.a(17, new o(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new d(this, (Continuation) null, 0), 3);
    }

    public final h13.a d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h13.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
