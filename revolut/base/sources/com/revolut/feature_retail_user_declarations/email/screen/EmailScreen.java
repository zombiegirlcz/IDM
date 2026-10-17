package com.revolut.feature_retail_user_declarations.email.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d01.e;
import dli.c;
import in0.g;
import java.util.ArrayList;
import jh.d;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oai.i0;
import oai.j;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import yai.f;
import yai.i;
import yai.l;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/screen/EmailScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_retail_user_declarations/email/screen/b;", "Lno/m;", "Lin0/g;", "Ldli/a;", "Lyai/m;", "Companion", "a", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailScreen extends ViewController<b> implements m, g, dli.a {
    public final EmailScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final AnalyticsProduct O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final int W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(EmailScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public EmailScreen(EmailScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailScreen f312027b;

            {
                this.f312027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmailScreen emailScreen = this.f312027b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EmailScreen.X;
                        qji.b bVarU2 = emailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.screen.di.EmailScreenInjector");
                        oai.i iVar = (oai.i) bVarU2;
                        i0 i0Var = iVar.f223697b;
                        oai.i iVar2 = iVar.f223698c;
                        EmailScreenContract$InputData emailScreenContract$InputData = emailScreen.K;
                        emailScreenContract$InputData.getClass();
                        return new oai.j(i0Var, iVar2, emailScreen, emailScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailScreen.X;
                        return (l) ((oai.j) emailScreen.L.getValue()).f223719g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EmailScreen.X;
                        EmailScreen emailScreen2 = this.f312027b;
                        return dli.f.a(emailScreen2, emailScreen2.R2(), v.k((InputTextDelegate) emailScreen2.Q.getValue(), (InputChecklistDelegate) emailScreen2.R.getValue(), (RowDelegate) emailScreen2.T.getValue(), (CellDetailsChevronDelegate) emailScreen2.S.getValue(), (TextDelegate) emailScreen2.U.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = EmailScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((oai.j) emailScreen.L.getValue()).f223718c.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: yai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailScreen f312027b;

            {
                this.f312027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmailScreen emailScreen = this.f312027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailScreen.X;
                        qji.b bVarU2 = emailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.screen.di.EmailScreenInjector");
                        oai.i iVar = (oai.i) bVarU2;
                        i0 i0Var = iVar.f223697b;
                        oai.i iVar2 = iVar.f223698c;
                        EmailScreenContract$InputData emailScreenContract$InputData = emailScreen.K;
                        emailScreenContract$InputData.getClass();
                        return new oai.j(i0Var, iVar2, emailScreen, emailScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailScreen.X;
                        return (l) ((oai.j) emailScreen.L.getValue()).f223719g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EmailScreen.X;
                        EmailScreen emailScreen2 = this.f312027b;
                        return dli.f.a(emailScreen2, emailScreen2.R2(), v.k((InputTextDelegate) emailScreen2.Q.getValue(), (InputChecklistDelegate) emailScreen2.R.getValue(), (RowDelegate) emailScreen2.T.getValue(), (CellDetailsChevronDelegate) emailScreen2.S.getValue(), (TextDelegate) emailScreen2.U.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = EmailScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((oai.j) emailScreen.L.getValue()).f223718c.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: yai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailScreen f312027b;

            {
                this.f312027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EmailScreen emailScreen = this.f312027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailScreen.X;
                        qji.b bVarU2 = emailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.screen.di.EmailScreenInjector");
                        oai.i iVar = (oai.i) bVarU2;
                        i0 i0Var = iVar.f223697b;
                        oai.i iVar2 = iVar.f223698c;
                        EmailScreenContract$InputData emailScreenContract$InputData = emailScreen.K;
                        emailScreenContract$InputData.getClass();
                        return new oai.j(i0Var, iVar2, emailScreen, emailScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailScreen.X;
                        return (l) ((oai.j) emailScreen.L.getValue()).f223719g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EmailScreen.X;
                        EmailScreen emailScreen2 = this.f312027b;
                        return dli.f.a(emailScreen2, emailScreen2.R2(), v.k((InputTextDelegate) emailScreen2.Q.getValue(), (InputChecklistDelegate) emailScreen2.R.getValue(), (RowDelegate) emailScreen2.T.getValue(), (CellDetailsChevronDelegate) emailScreen2.S.getValue(), (TextDelegate) emailScreen2.U.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = EmailScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((oai.j) emailScreen.L.getValue()).f223718c.get();
                }
            }
        });
        this.O = inputData.e;
        this.P = s.t(this, yai.b.f);
        this.Q = w.y0(new y7k.h(7));
        this.R = w.y0(new y7k.h(8));
        this.S = w.y0(new y7k.h(9));
        this.T = w.y0(new y7k.h(10));
        this.U = w.y0(new y7k.h(11));
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: yai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailScreen f312027b;

            {
                this.f312027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EmailScreen emailScreen = this.f312027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailScreen.X;
                        qji.b bVarU2 = emailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.screen.di.EmailScreenInjector");
                        oai.i iVar = (oai.i) bVarU2;
                        i0 i0Var = iVar.f223697b;
                        oai.i iVar2 = iVar.f223698c;
                        EmailScreenContract$InputData emailScreenContract$InputData = emailScreen.K;
                        emailScreenContract$InputData.getClass();
                        return new oai.j(i0Var, iVar2, emailScreen, emailScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EmailScreen.X;
                        return (l) ((oai.j) emailScreen.L.getValue()).f223719g.get();
                    case 2:
                        KProperty[] kPropertyArr3 = EmailScreen.X;
                        EmailScreen emailScreen2 = this.f312027b;
                        return dli.f.a(emailScreen2, emailScreen2.R2(), v.k((InputTextDelegate) emailScreen2.Q.getValue(), (InputChecklistDelegate) emailScreen2.R.getValue(), (RowDelegate) emailScreen2.T.getValue(), (CellDetailsChevronDelegate) emailScreen2.S.getValue(), (TextDelegate) emailScreen2.U.getValue()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = EmailScreen.X;
                        return (KeyboardSuggestionsControllerExtension) ((oai.j) emailScreen.L.getValue()).f223718c.get();
                }
            }
        });
        this.W = R$layout.screen_recycler_navbar_nextbutton;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        yai.m uiState = (yai.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f312036b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f312037c;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) this.V.getValue();
        ArrayList items = uiState.d;
        e layoutStyle = e.ACTION_BAR;
        keyboardSuggestionsControllerExtension.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter("email_domain_suggestions", "sourceId");
        Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        d01.g gVarE0 = d.f(keyboardSuggestionsControllerExtension.f51200c.m2()).e0();
        if (gVarE0 != null) {
            ((iz0.e) gVarE0).f(layoutStyle, "email_domain_suggestions", items);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setLoadingButtonTag("EMAIL_SCREEN_CTA_BUTTON_TAG");
        EmailScreenContract$InputData emailScreenContract$InputData = this.K;
        largeActionButton.setText(emailScreenContract$InputData.f.d);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        EmailFlowInputData.EmailScreenItemData emailScreenItemData = emailScreenContract$InputData.f;
        navBarWithToolbar.setDescriptionText(emailScreenItemData.e);
        navBarWithToolbar.setDescriptionVisible(emailScreenItemData.e != null);
        navBarWithToolbar.setNavigationButtonIcon(emailScreenItemData.f.a());
        d3().d.setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((KeyboardSuggestionsControllerExtension) this.V.getValue()).Q("email_domain_suggestions");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.Q.getValue()).e.f121375b), new yai.d(this, null), 3);
        ViewController.P2(this, new y5j.e(((KeyboardSuggestionsControllerExtension) this.V.getValue()).R("email_domain_suggestions"), 5), new yai.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) this.R.getValue()).f52518c), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsChevronDelegate) this.S.getValue()).f51821c), new yai.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.T.getValue()).f53218h), new yai.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.U.getValue()).d), new yai.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new i(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
