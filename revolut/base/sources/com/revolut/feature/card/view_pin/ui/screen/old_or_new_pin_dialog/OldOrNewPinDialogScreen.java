package com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card.view_pin.R$id;
import com.revolut.feature.card.view_pin.R$layout;
import com.revolut.feature.card.view_pin.api.R$string;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogContract$InputData;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import vo8.b;
import vv2.d;
import vv2.e;
import vv2.j;
import vv2.m;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card/view_pin/ui/screen/old_or_new_pin_dialog/OldOrNewPinDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvv2/d;", "Ldli/a;", "Lvv2/e;", "Companion", "a", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OldOrNewPinDialogScreen extends ViewController<d> implements a {
    public final OldOrNewPinDialogContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(OldOrNewPinDialogScreen.class, "binding", "getBinding()Lcom/revolut/feature/card/view_pin/databinding/ScreenOldOrNewPinDialogBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public OldOrNewPinDialogScreen(OldOrNewPinDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vv2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OldOrNewPinDialogScreen f292443b;

            {
                this.f292443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OldOrNewPinDialogScreen oldOrNewPinDialogScreen = this.f292443b;
                switch (i2) {
                    case 0:
                        OldOrNewPinDialogScreen.Companion companion = OldOrNewPinDialogScreen.INSTANCE;
                        qji.b bVarU2 = oldOrNewPinDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.di.OldOrNewPinDialogInjector");
                        iwh.e eVar = (iwh.e) ((kwh.a) bVarU2);
                        iwh.c cVar = eVar.f169098b;
                        iwh.e eVar2 = eVar.f169099c;
                        OldOrNewPinDialogContract$InputData oldOrNewPinDialogContract$InputData = oldOrNewPinDialogScreen.K;
                        oldOrNewPinDialogContract$InputData.getClass();
                        return new iwh.h(cVar, eVar2, oldOrNewPinDialogContract$InputData);
                    case 1:
                        OldOrNewPinDialogScreen.Companion companion2 = OldOrNewPinDialogScreen.INSTANCE;
                        return (m) ((iwh.h) oldOrNewPinDialogScreen.L.getValue()).f169104b.get();
                    default:
                        OldOrNewPinDialogScreen.Companion companion3 = OldOrNewPinDialogScreen.INSTANCE;
                        OldOrNewPinDialogScreen oldOrNewPinDialogScreen2 = this.f292443b;
                        return dli.f.a(oldOrNewPinDialogScreen2, (m) oldOrNewPinDialogScreen2.M.getValue(), u.c((LargeActionButtonDelegate) oldOrNewPinDialogScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vv2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OldOrNewPinDialogScreen f292443b;

            {
                this.f292443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OldOrNewPinDialogScreen oldOrNewPinDialogScreen = this.f292443b;
                switch (i22) {
                    case 0:
                        OldOrNewPinDialogScreen.Companion companion = OldOrNewPinDialogScreen.INSTANCE;
                        qji.b bVarU2 = oldOrNewPinDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.di.OldOrNewPinDialogInjector");
                        iwh.e eVar = (iwh.e) ((kwh.a) bVarU2);
                        iwh.c cVar = eVar.f169098b;
                        iwh.e eVar2 = eVar.f169099c;
                        OldOrNewPinDialogContract$InputData oldOrNewPinDialogContract$InputData = oldOrNewPinDialogScreen.K;
                        oldOrNewPinDialogContract$InputData.getClass();
                        return new iwh.h(cVar, eVar2, oldOrNewPinDialogContract$InputData);
                    case 1:
                        OldOrNewPinDialogScreen.Companion companion2 = OldOrNewPinDialogScreen.INSTANCE;
                        return (m) ((iwh.h) oldOrNewPinDialogScreen.L.getValue()).f169104b.get();
                    default:
                        OldOrNewPinDialogScreen.Companion companion3 = OldOrNewPinDialogScreen.INSTANCE;
                        OldOrNewPinDialogScreen oldOrNewPinDialogScreen2 = this.f292443b;
                        return dli.f.a(oldOrNewPinDialogScreen2, (m) oldOrNewPinDialogScreen2.M.getValue(), u.c((LargeActionButtonDelegate) oldOrNewPinDialogScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_old_or_new_pin_dialog;
        this.O = w.y0(new b(7));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: vv2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OldOrNewPinDialogScreen f292443b;

            {
                this.f292443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OldOrNewPinDialogScreen oldOrNewPinDialogScreen = this.f292443b;
                switch (i22) {
                    case 0:
                        OldOrNewPinDialogScreen.Companion companion = OldOrNewPinDialogScreen.INSTANCE;
                        qji.b bVarU2 = oldOrNewPinDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.di.OldOrNewPinDialogInjector");
                        iwh.e eVar = (iwh.e) ((kwh.a) bVarU2);
                        iwh.c cVar = eVar.f169098b;
                        iwh.e eVar2 = eVar.f169099c;
                        OldOrNewPinDialogContract$InputData oldOrNewPinDialogContract$InputData = oldOrNewPinDialogScreen.K;
                        oldOrNewPinDialogContract$InputData.getClass();
                        return new iwh.h(cVar, eVar2, oldOrNewPinDialogContract$InputData);
                    case 1:
                        OldOrNewPinDialogScreen.Companion companion2 = OldOrNewPinDialogScreen.INSTANCE;
                        return (m) ((iwh.h) oldOrNewPinDialogScreen.L.getValue()).f169104b.get();
                    default:
                        OldOrNewPinDialogScreen.Companion companion3 = OldOrNewPinDialogScreen.INSTANCE;
                        OldOrNewPinDialogScreen oldOrNewPinDialogScreen2 = this.f292443b;
                        return dli.f.a(oldOrNewPinDialogScreen2, (m) oldOrNewPinDialogScreen2.M.getValue(), u.c((LargeActionButtonDelegate) oldOrNewPinDialogScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, j.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c3(vv2.a.f292436a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (iwh.h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((sv2.a) value).f265828b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.change_pin_pin_selection_title, null, null, 14), new TextLocalisedClause(R$string.change_pin_pin_selection_description, u.c(new TextLocalisedClause(R$string.change_pin_pin_selection_description_link, null, new Click(30, (Integer) null, (Object) null, "ACTIVATE_INSTRUCTIONS_CLAUSE_ID", false), 10)), null, 12), null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        v2e.h0 h0Var = new v2e.h0(rd0.e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b), 19);
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, vkm.q.J(h0Var, new v2e.h0(rd0.e.b(((sv2.a) value).f265828b.F), 20)), new vrl.d(this, null, 6), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
