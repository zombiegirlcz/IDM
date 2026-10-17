package com.revolut.feature.apm.upi.impl.qr.screens.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.feature.apm.upi.impl.R$id;
import com.revolut.feature.apm.upi.impl.R$layout;
import com.revolut.feature.apm.upi.impl.qr.screens.amount.InputAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import if2.c;
import kae.d;
import kg2.e;
import kg2.i;
import kg2.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import qd0.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/qr/screens/amount/InputAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkg2/i;", "Ldli/a;", "Lkg2/o;", "Companion", "a", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputAmountScreen extends ViewController<i> implements a {
    public final boolean K;
    public final int L;
    public final Object M;
    public final h N;
    public b O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(InputAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/upi/impl/databinding/ScreenUpiInputAmountBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.apm.upi.impl.qr.screens.amount.InputAmountScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InputAmountScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_upi_input_amount;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: kg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f183905b;

            {
                this.f183905b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InputAmountScreen inputAmountScreen = this.f183905b;
                switch (i2) {
                    case 0:
                        InputAmountScreen.Companion companion = InputAmountScreen.INSTANCE;
                        return (r) ((if2.c) inputAmountScreen.R.getValue()).e.get();
                    case 1:
                        InputAmountScreen.Companion companion2 = InputAmountScreen.INSTANCE;
                        qd0.b bVar = inputAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        InputAmountScreen.Companion companion3 = InputAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new k3k.k(inputAmountScreen, 22));
                    default:
                        InputAmountScreen.Companion companion4 = InputAmountScreen.INSTANCE;
                        InputAmountScreen inputAmountScreen2 = this.f183905b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.R2(), u.c((CenteredAmountDelegate) inputAmountScreen2.Q.getValue()), R$id.qrInputAmount_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, kg2.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: kg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f183905b;

            {
                this.f183905b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InputAmountScreen inputAmountScreen = this.f183905b;
                switch (i22) {
                    case 0:
                        InputAmountScreen.Companion companion = InputAmountScreen.INSTANCE;
                        return (r) ((if2.c) inputAmountScreen.R.getValue()).e.get();
                    case 1:
                        InputAmountScreen.Companion companion2 = InputAmountScreen.INSTANCE;
                        qd0.b bVar = inputAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        InputAmountScreen.Companion companion3 = InputAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new k3k.k(inputAmountScreen, 22));
                    default:
                        InputAmountScreen.Companion companion4 = InputAmountScreen.INSTANCE;
                        InputAmountScreen inputAmountScreen2 = this.f183905b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.R2(), u.c((CenteredAmountDelegate) inputAmountScreen2.Q.getValue()), R$id.qrInputAmount_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: kg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f183905b;

            {
                this.f183905b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InputAmountScreen inputAmountScreen = this.f183905b;
                switch (i22) {
                    case 0:
                        InputAmountScreen.Companion companion = InputAmountScreen.INSTANCE;
                        return (r) ((if2.c) inputAmountScreen.R.getValue()).e.get();
                    case 1:
                        InputAmountScreen.Companion companion2 = InputAmountScreen.INSTANCE;
                        qd0.b bVar = inputAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        InputAmountScreen.Companion companion3 = InputAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new k3k.k(inputAmountScreen, 22));
                    default:
                        InputAmountScreen.Companion companion4 = InputAmountScreen.INSTANCE;
                        InputAmountScreen inputAmountScreen2 = this.f183905b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.R2(), u.c((CenteredAmountDelegate) inputAmountScreen2.Q.getValue()), R$id.qrInputAmount_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new k8e.a(this, inputData, 11));
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: kg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAmountScreen f183905b;

            {
                this.f183905b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InputAmountScreen inputAmountScreen = this.f183905b;
                switch (i22) {
                    case 0:
                        InputAmountScreen.Companion companion = InputAmountScreen.INSTANCE;
                        return (r) ((if2.c) inputAmountScreen.R.getValue()).e.get();
                    case 1:
                        InputAmountScreen.Companion companion2 = InputAmountScreen.INSTANCE;
                        qd0.b bVar = inputAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 2:
                        InputAmountScreen.Companion companion3 = InputAmountScreen.INSTANCE;
                        return new CenteredAmountDelegate(new k3k.k(inputAmountScreen, 22));
                    default:
                        InputAmountScreen.Companion companion4 = InputAmountScreen.INSTANCE;
                        InputAmountScreen inputAmountScreen2 = this.f183905b;
                        return dli.f.a(inputAmountScreen2, inputAmountScreen2.R2(), u.c((CenteredAmountDelegate) inputAmountScreen2.Q.getValue()), R$id.qrInputAmount_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        kg2.o uiState = (kg2.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f143335b.setEnabled(uiState.f183916b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        b bVarN = ((c) this.R.getValue()).f160843b.f160851a.n();
        s.j(bVarN);
        this.O = bVarN;
        d3().f143336c.setMenuItems(u.c(new TextNavBarMenuItem("LIST_ID_MENU_ITEM_REMOVE", new TextLocalisedClause(R$string.upi_qr_code_add_amount_actions_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, 12)));
        d3().f143336c.setTitle(new TextLocalisedClause(R$string.upi_qr_code_add_amount_title, null, null, 14));
        d3().f143336c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f143335b.setText(new TextLocalisedClause(R$string.upi_qr_code_add_amount_actions_add_amount, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.Q.getValue()).d.f121375b), null, new d(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143335b.o), null, new kg2.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143336c.f59210a.f57403b), null, new kg2.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143336c.f59211b), null, new kg2.c(this, null, 2), 3);
    }

    public final gf2.b d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gf2.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
