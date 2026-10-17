package com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_remote_login.impl.R$layout;
import com.revolut.feature.junior_remote_login.impl.R$string;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import il8.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.s2;
import tx0.j0;
import ul8.b;
import ul8.c;
import ul8.d;
import ul8.e;
import ul8.f;
import ul8.g;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lul8/f;", "Lcli/w;", "Lul8/e;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAddPhoneNumberScreen extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(JuniorAddPhoneNumberScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_remote_login/impl/databinding/ScreenJuniorAddPhoneNumberBinding;", 0))};
    public final JuniorAddPhoneNumberScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public JuniorAddPhoneNumberScreen(JuniorAddPhoneNumberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_junior_add_phone_number;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: ul8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAddPhoneNumberScreen f280898b;

            {
                this.f280898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAddPhoneNumberScreen juniorAddPhoneNumberScreen = this.f280898b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAddPhoneNumberScreen.Q;
                        return n14.e.a(juniorAddPhoneNumberScreen, juniorAddPhoneNumberScreen.d());
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAddPhoneNumberScreen.Q;
                        qji.b bVarU2 = juniorAddPhoneNumberScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.di.JuniorAddPhoneNumberScreenInjector");
                        }
                        il8.c cVar = (il8.c) bVarU2;
                        k kVar = cVar.f162141b;
                        il8.c cVar2 = cVar.f162142c;
                        JuniorAddPhoneNumberScreenContract$InputData juniorAddPhoneNumberScreenContract$InputData = juniorAddPhoneNumberScreen.K;
                        juniorAddPhoneNumberScreenContract$InputData.getClass();
                        return new il8.e(kVar, cVar2, juniorAddPhoneNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAddPhoneNumberScreen.Q;
                        return (g) ((il8.e) juniorAddPhoneNumberScreen.O.getValue()).f162148c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: ul8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAddPhoneNumberScreen f280898b;

            {
                this.f280898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAddPhoneNumberScreen juniorAddPhoneNumberScreen = this.f280898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAddPhoneNumberScreen.Q;
                        return n14.e.a(juniorAddPhoneNumberScreen, juniorAddPhoneNumberScreen.d());
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAddPhoneNumberScreen.Q;
                        qji.b bVarU2 = juniorAddPhoneNumberScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.di.JuniorAddPhoneNumberScreenInjector");
                        }
                        il8.c cVar = (il8.c) bVarU2;
                        k kVar = cVar.f162141b;
                        il8.c cVar2 = cVar.f162142c;
                        JuniorAddPhoneNumberScreenContract$InputData juniorAddPhoneNumberScreenContract$InputData = juniorAddPhoneNumberScreen.K;
                        juniorAddPhoneNumberScreenContract$InputData.getClass();
                        return new il8.e(kVar, cVar2, juniorAddPhoneNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAddPhoneNumberScreen.Q;
                        return (g) ((il8.e) juniorAddPhoneNumberScreen.O.getValue()).f162148c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: ul8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAddPhoneNumberScreen f280898b;

            {
                this.f280898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAddPhoneNumberScreen juniorAddPhoneNumberScreen = this.f280898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAddPhoneNumberScreen.Q;
                        return n14.e.a(juniorAddPhoneNumberScreen, juniorAddPhoneNumberScreen.d());
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAddPhoneNumberScreen.Q;
                        qji.b bVarU2 = juniorAddPhoneNumberScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.di.JuniorAddPhoneNumberScreenInjector");
                        }
                        il8.c cVar = (il8.c) bVarU2;
                        k kVar = cVar.f162141b;
                        il8.c cVar2 = cVar.f162142c;
                        JuniorAddPhoneNumberScreenContract$InputData juniorAddPhoneNumberScreenContract$InputData = juniorAddPhoneNumberScreen.K;
                        juniorAddPhoneNumberScreenContract$InputData.getClass();
                        return new il8.e(kVar, cVar2, juniorAddPhoneNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAddPhoneNumberScreen.Q;
                        return (g) ((il8.e) juniorAddPhoneNumberScreen.O.getValue()).f162148c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d dVar = qVar instanceof d ? (d) qVar : null;
        if (dVar == null) {
            dVar = new d(true, true, true);
        }
        gl8.a aVarD3 = d3();
        if (dVar.f280899a) {
            String str = uiState.f280904c;
            wi0.b bVar = uiState.f280902a;
            if (str.length() > 0 && bVar.f297794a.length() > 0) {
                aVarD3.d.setPhoneCountryCode(uiState.f280904c, bVar);
            }
        }
        if (dVar.f280900b) {
            aVarD3.d.setPhoneNumber(uiState.f280903b);
        }
        if (dVar.f280901c) {
            aVarD3.f144571b.setEnabled(uiState.d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (il8.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        gl8.a aVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = aVarD3.f144572c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_add_phone_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.junior_add_phone_subtitle_without_name, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        LargeActionButton largeActionButton = aVarD3.f144571b;
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_add_phone_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("BUTTON_LOADING_ID");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        gl8.a aVarD3 = d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarD3.f144572c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarD3.f144571b.o), null, new c(this, null, 1), 3);
        PhoneInputTextView phoneInputTextView = aVarD3.d;
        r map = phoneInputTextView.d.map(new s2(new mul.k(27), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new uf0.d(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(phoneInputTextView.e()), null, new c(this, null, 2), 3);
        phoneInputTextView.g();
    }

    public final gl8.a d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gl8.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }
}
