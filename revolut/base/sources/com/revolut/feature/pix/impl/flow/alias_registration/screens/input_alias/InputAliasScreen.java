package com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias;

import a0l.k;
import a9a.b;
import a9a.c;
import a9a.d;
import a9a.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.InputAliasScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.d0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_registration/screens/input_alias/InputAliasScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationType;", "Ldli/a;", "La9a/h;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputAliasScreen extends ViewController<AliasRegistrationType> implements a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(InputAliasScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AliasRegistrationType.Inputtable K;
    public final boolean L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final InputTextDelegate Q;
    public final PhoneEditorDelegate R;
    public final Object S;

    public InputAliasScreen(AliasRegistrationType.Inputtable inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: a9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAliasScreen f2389b;

            {
                this.f2389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InputAliasScreen inputAliasScreen = this.f2389b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InputAliasScreen.T;
                        qji.b bVarU2 = inputAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.di.InputAliasScreenInjector");
                        p8a.f fVar = (p8a.f) bVarU2;
                        d0 d0Var = fVar.f233958b;
                        p8a.f fVar2 = fVar.f233959c;
                        AliasRegistrationType.Inputtable inputtable = inputAliasScreen.K;
                        inputtable.getClass();
                        return new p8a.i(d0Var, fVar2, inputtable);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAliasScreen.T;
                        return (g) ((p8a.i) ((b9a.a) inputAliasScreen.O.getValue())).f233985c.get();
                    default:
                        KProperty[] kPropertyArr3 = InputAliasScreen.T;
                        InputAliasScreen inputAliasScreen2 = this.f2389b;
                        return dli.f.a(inputAliasScreen2, inputAliasScreen2.e3(), v.k(inputAliasScreen2.Q, inputAliasScreen2.R), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: a9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAliasScreen f2389b;

            {
                this.f2389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InputAliasScreen inputAliasScreen = this.f2389b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputAliasScreen.T;
                        qji.b bVarU2 = inputAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.di.InputAliasScreenInjector");
                        p8a.f fVar = (p8a.f) bVarU2;
                        d0 d0Var = fVar.f233958b;
                        p8a.f fVar2 = fVar.f233959c;
                        AliasRegistrationType.Inputtable inputtable = inputAliasScreen.K;
                        inputtable.getClass();
                        return new p8a.i(d0Var, fVar2, inputtable);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAliasScreen.T;
                        return (g) ((p8a.i) ((b9a.a) inputAliasScreen.O.getValue())).f233985c.get();
                    default:
                        KProperty[] kPropertyArr3 = InputAliasScreen.T;
                        InputAliasScreen inputAliasScreen2 = this.f2389b;
                        return dli.f.a(inputAliasScreen2, inputAliasScreen2.e3(), v.k(inputAliasScreen2.Q, inputAliasScreen2.R), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new InputTextDelegate(null);
        this.R = new PhoneEditorDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: a9a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAliasScreen f2389b;

            {
                this.f2389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InputAliasScreen inputAliasScreen = this.f2389b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputAliasScreen.T;
                        qji.b bVarU2 = inputAliasScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.di.InputAliasScreenInjector");
                        p8a.f fVar = (p8a.f) bVarU2;
                        d0 d0Var = fVar.f233958b;
                        p8a.f fVar2 = fVar.f233959c;
                        AliasRegistrationType.Inputtable inputtable = inputAliasScreen.K;
                        inputtable.getClass();
                        return new p8a.i(d0Var, fVar2, inputtable);
                    case 1:
                        KProperty[] kPropertyArr2 = InputAliasScreen.T;
                        return (g) ((p8a.i) ((b9a.a) inputAliasScreen.O.getValue())).f233985c.get();
                    default:
                        KProperty[] kPropertyArr3 = InputAliasScreen.T;
                        InputAliasScreen inputAliasScreen2 = this.f2389b;
                        return dli.f.a(inputAliasScreen2, inputAliasScreen2.e3(), v.k(inputAliasScreen2.Q, inputAliasScreen2.R), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a9a.h uiState = (a9a.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f2392b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b9a.a) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Pair pair;
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        AliasRegistrationType.Inputtable inputtable = this.K;
        if (inputtable instanceof AliasRegistrationType.Email) {
            pair = new Pair(new TextLocalisedClause(R$string.pix_alias_input_header_email_title, null, null, 14), Integer.valueOf(R$string.pix_alias_input_header_email_caption));
        } else {
            if (!(inputtable instanceof AliasRegistrationType.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(new TextLocalisedClause(R$string.pix_alias_input_header_phone_title, null, null, 14), Integer.valueOf(R$string.pix_alias_input_header_phone_caption));
        }
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) pair.f186385a;
        int iIntValue = ((Number) pair.f186386b).intValue();
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(iIntValue, null, null, 14));
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.pix_alias_input_cta_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e.f121375b), null, new d(this, null), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), null, new a9a.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.d.f121375b), null, new k(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), null, new c(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final g e3() {
        return (g) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
