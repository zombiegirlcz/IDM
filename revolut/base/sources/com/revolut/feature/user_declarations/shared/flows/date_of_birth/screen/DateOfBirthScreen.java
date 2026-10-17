package com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import aw0.o9;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$layout;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.DateOfBirthScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import in0.g;
import java.time.LocalDate;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sng.b;
import sng.c;
import sng.e;
import sng.i;
import vc.s;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/date_of_birth/screen/DateOfBirthScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/DateOfBirthControllerDescriptor$OutputData;", "Lcli/w;", "Lsng/e;", "Lno/m;", "Lin0/g;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DateOfBirthScreen extends ViewController<DateOfBirthControllerDescriptor$OutputData> implements w, m, g {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DateOfBirthScreen.class, "binding", "getBinding()Lcom/revolut/feature/user_declarations/shared/databinding/ScreenDateOfBirthBinding;", 0))};
    public final DateOfBirthControllerDescriptor$InputData K;
    public final h L;
    public final int M;
    public final Lazy N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final boolean R;

    public DateOfBirthScreen(DateOfBirthControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_date_of_birth;
        final int i = 0;
        this.N = j.b(new Function0(this) { // from class: sng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateOfBirthScreen f264607b;

            {
                this.f264607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DateOfBirthScreen dateOfBirthScreen = this.f264607b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DateOfBirthScreen.S;
                        qji.c cVarZ2 = dateOfBirthScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = DateOfBirthScreen.S;
                        qji.b bVarU2 = dateOfBirthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.di.DateOfBirthScreenInjector");
                        return (nng.e) ((tng.a) ((tng.b) bVarU2).q().z(dateOfBirthScreen.K).mo3808a(dateOfBirthScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = DateOfBirthScreen.S;
                        nng.e eVar = (nng.e) dateOfBirthScreen.O.getValue();
                        switch (eVar.f217641a) {
                            case 0:
                                return (i) eVar.e.get();
                            case 1:
                                return (i) eVar.e.get();
                            case 2:
                                return (i) eVar.e.get();
                            default:
                                return (i) eVar.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = DateOfBirthScreen.S;
                        return n14.e.a(dateOfBirthScreen, (i) dateOfBirthScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: sng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateOfBirthScreen f264607b;

            {
                this.f264607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DateOfBirthScreen dateOfBirthScreen = this.f264607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateOfBirthScreen.S;
                        qji.c cVarZ2 = dateOfBirthScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = DateOfBirthScreen.S;
                        qji.b bVarU2 = dateOfBirthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.di.DateOfBirthScreenInjector");
                        return (nng.e) ((tng.a) ((tng.b) bVarU2).q().z(dateOfBirthScreen.K).mo3808a(dateOfBirthScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = DateOfBirthScreen.S;
                        nng.e eVar = (nng.e) dateOfBirthScreen.O.getValue();
                        switch (eVar.f217641a) {
                            case 0:
                                return (i) eVar.e.get();
                            case 1:
                                return (i) eVar.e.get();
                            case 2:
                                return (i) eVar.e.get();
                            default:
                                return (i) eVar.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = DateOfBirthScreen.S;
                        return n14.e.a(dateOfBirthScreen, (i) dateOfBirthScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: sng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateOfBirthScreen f264607b;

            {
                this.f264607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DateOfBirthScreen dateOfBirthScreen = this.f264607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateOfBirthScreen.S;
                        qji.c cVarZ2 = dateOfBirthScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = DateOfBirthScreen.S;
                        qji.b bVarU2 = dateOfBirthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.di.DateOfBirthScreenInjector");
                        return (nng.e) ((tng.a) ((tng.b) bVarU2).q().z(dateOfBirthScreen.K).mo3808a(dateOfBirthScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = DateOfBirthScreen.S;
                        nng.e eVar = (nng.e) dateOfBirthScreen.O.getValue();
                        switch (eVar.f217641a) {
                            case 0:
                                return (i) eVar.e.get();
                            case 1:
                                return (i) eVar.e.get();
                            case 2:
                                return (i) eVar.e.get();
                            default:
                                return (i) eVar.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = DateOfBirthScreen.S;
                        return n14.e.a(dateOfBirthScreen, (i) dateOfBirthScreen.P.getValue());
                }
            }
        });
        final int i5 = 3;
        this.Q = te0.w.y0(new Function0(this) { // from class: sng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DateOfBirthScreen f264607b;

            {
                this.f264607b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DateOfBirthScreen dateOfBirthScreen = this.f264607b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DateOfBirthScreen.S;
                        qji.c cVarZ2 = dateOfBirthScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = DateOfBirthScreen.S;
                        qji.b bVarU2 = dateOfBirthScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.di.DateOfBirthScreenInjector");
                        return (nng.e) ((tng.a) ((tng.b) bVarU2).q().z(dateOfBirthScreen.K).mo3808a(dateOfBirthScreen)).mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = DateOfBirthScreen.S;
                        nng.e eVar = (nng.e) dateOfBirthScreen.O.getValue();
                        switch (eVar.f217641a) {
                            case 0:
                                return (i) eVar.e.get();
                            case 1:
                                return (i) eVar.e.get();
                            case 2:
                                return (i) eVar.e.get();
                            default:
                                return (i) eVar.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = DateOfBirthScreen.S;
                        return n14.e.a(dateOfBirthScreen, (i) dateOfBirthScreen.P.getValue());
                }
            }
        });
        this.R = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ActionFooterView actionFooterView = d3().f197250b;
        Clause clause = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f264611b;
        actionFooterView.setModel(new aw0.e(false, null, null, new n6(clause, LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f264612c, null, null, 988), null, null, 55));
        LocalDate localDate = uiState.f264610a;
        if (localDate != null && !localDate.equals(d3().f197251c.getDate())) {
            d3().f197251c.setDate(localDate);
        }
        if (textLocalisedClause != null) {
            d3().f197251c.setError(true);
            d3().f197251c.setHelperText(textLocalisedClause);
        } else {
            d3().f197251c.setError(false);
            d3().f197251c.setHelperText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return (AnalyticsProduct) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (nng.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        DateOfBirthControllerDescriptor$InputData dateOfBirthControllerDescriptor$InputData = this.K;
        this.z = dateOfBirthControllerDescriptor$InputData.f105051c.b();
        DateInputView dateOfBirthScreenDateInput = d3().f197251c;
        Intrinsics.checkNotNullExpressionValue(dateOfBirthScreenDateInput, "dateOfBirthScreenDateInput");
        dateOfBirthScreenDateInput.setVisibility(0);
        InputText dateOfBirthScreenDateOfBirthView = d3().d;
        Intrinsics.checkNotNullExpressionValue(dateOfBirthScreenDateOfBirthView, "dateOfBirthScreenDateOfBirthView");
        dateOfBirthScreenDateOfBirthView.setVisibility(8);
        d3().f197251c.setEnableQuickClear(true);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        DateOfBirthScreenConfig dateOfBirthScreenConfig = dateOfBirthControllerDescriptor$InputData.f105050b;
        WorkflowScreenConfiguration workflowScreenConfiguration = dateOfBirthScreenConfig.f105035c;
        Object textLocalisedClause = workflowScreenConfiguration != null ? workflowScreenConfiguration.f105668a : null;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.signup_registration_dob_new_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(new TextLocalisedClause(com.revolut.shared.feature.user_declarations.api.R$string.declaration_date_of_birth_title, u.c(textLocalisedClause), null, 12), null);
        WorkflowScreenConfiguration workflowScreenConfiguration2 = dateOfBirthScreenConfig.f105035c;
        String str = workflowScreenConfiguration2 != null ? workflowScreenConfiguration2.f105669b : null;
        navBarWithToolbar.setDescriptionText(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : dateOfBirthScreenConfig.f105033a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(this.K.f105051c.a());
        a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new c(this, null, 1), 3);
        a.g2(this, rd0.e.b(d3().f197250b.f), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(d3().f197251c.k), null, new sek.q(this, null, 11), 3);
    }

    public final lng.a d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lng.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
