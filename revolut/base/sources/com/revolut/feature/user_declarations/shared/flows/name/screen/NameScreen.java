package com.revolut.feature.user_declarations.shared.flows.name.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.R$id;
import com.revolut.feature.user_declarations.shared.R$layout;
import com.revolut.feature.user_declarations.shared.flows.name.screen.NameScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$OutputData;
import dli.a;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nng.i;
import no.m;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;
import zng.c;
import zng.d;
import zng.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/name/screen/NameScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/NameControllerDescriptor$OutputData;", "Ldli/a;", "Lzng/h;", "Lno/m;", "Lin0/g;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NameScreen extends ViewController<NameControllerDescriptor$OutputData> implements a, m, g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(NameScreen.class, "binding", "getBinding()Lcom/revolut/feature/user_declarations/shared/databinding/ScreenNameBinding;", 0))};
    public final NameControllerDescriptor$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final boolean T;

    public NameScreen(NameControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = w.y0(new zj9.a(19));
        this.N = w.y0(new zj9.a(20));
        this.O = R$layout.screen_name;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zng.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameScreen f323818b;

            {
                this.f323818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NameScreen nameScreen = this.f323818b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NameScreen.U;
                        qji.c cVarZ2 = nameScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getM();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = NameScreen.U;
                        nng.i iVar = (nng.i) nameScreen.S.getValue();
                        switch (iVar.f217653a) {
                            case 0:
                                return (i) iVar.f.get();
                            case 1:
                                return (i) iVar.f.get();
                            case 2:
                                return (i) iVar.f.get();
                            default:
                                return (i) iVar.f.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = NameScreen.U;
                        NameScreen nameScreen2 = this.f323818b;
                        return dli.f.a(nameScreen2, (i) nameScreen2.Q.getValue(), v.k((InputTextDelegate) nameScreen2.M.getValue(), (ListSubheaderDelegate) nameScreen2.N.getValue()), R$id.name_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NameScreen.U;
                        qji.b bVarU2 = nameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.name.screen.di.NameScreenInjector");
                        return (nng.i) ((aog.a) ((aog.b) bVarU2).b().U(nameScreen.K).mo3808a(nameScreen)).mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zng.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameScreen f323818b;

            {
                this.f323818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NameScreen nameScreen = this.f323818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NameScreen.U;
                        qji.c cVarZ2 = nameScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getM();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = NameScreen.U;
                        nng.i iVar = (nng.i) nameScreen.S.getValue();
                        switch (iVar.f217653a) {
                            case 0:
                                return (i) iVar.f.get();
                            case 1:
                                return (i) iVar.f.get();
                            case 2:
                                return (i) iVar.f.get();
                            default:
                                return (i) iVar.f.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = NameScreen.U;
                        NameScreen nameScreen2 = this.f323818b;
                        return dli.f.a(nameScreen2, (i) nameScreen2.Q.getValue(), v.k((InputTextDelegate) nameScreen2.M.getValue(), (ListSubheaderDelegate) nameScreen2.N.getValue()), R$id.name_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NameScreen.U;
                        qji.b bVarU2 = nameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.name.screen.di.NameScreenInjector");
                        return (nng.i) ((aog.a) ((aog.b) bVarU2).b().U(nameScreen.K).mo3808a(nameScreen)).mo3783build();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zng.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameScreen f323818b;

            {
                this.f323818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NameScreen nameScreen = this.f323818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NameScreen.U;
                        qji.c cVarZ2 = nameScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getM();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = NameScreen.U;
                        nng.i iVar = (nng.i) nameScreen.S.getValue();
                        switch (iVar.f217653a) {
                            case 0:
                                return (i) iVar.f.get();
                            case 1:
                                return (i) iVar.f.get();
                            case 2:
                                return (i) iVar.f.get();
                            default:
                                return (i) iVar.f.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = NameScreen.U;
                        NameScreen nameScreen2 = this.f323818b;
                        return dli.f.a(nameScreen2, (i) nameScreen2.Q.getValue(), v.k((InputTextDelegate) nameScreen2.M.getValue(), (ListSubheaderDelegate) nameScreen2.N.getValue()), R$id.name_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NameScreen.U;
                        qji.b bVarU2 = nameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.name.screen.di.NameScreenInjector");
                        return (nng.i) ((aog.a) ((aog.b) bVarU2).b().U(nameScreen.K).mo3808a(nameScreen)).mo3783build();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: zng.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameScreen f323818b;

            {
                this.f323818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                NameScreen nameScreen = this.f323818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NameScreen.U;
                        qji.c cVarZ2 = nameScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getM();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = NameScreen.U;
                        nng.i iVar = (nng.i) nameScreen.S.getValue();
                        switch (iVar.f217653a) {
                            case 0:
                                return (i) iVar.f.get();
                            case 1:
                                return (i) iVar.f.get();
                            case 2:
                                return (i) iVar.f.get();
                            default:
                                return (i) iVar.f.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = NameScreen.U;
                        NameScreen nameScreen2 = this.f323818b;
                        return dli.f.a(nameScreen2, (i) nameScreen2.Q.getValue(), v.k((InputTextDelegate) nameScreen2.M.getValue(), (ListSubheaderDelegate) nameScreen2.N.getValue()), R$id.name_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = NameScreen.U;
                        qji.b bVarU2 = nameScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.name.screen.di.NameScreenInjector");
                        return (nng.i) ((aog.a) ((aog.b) bVarU2).b().U(nameScreen.K).mo3808a(nameScreen)).mo3783build();
                }
            }
        });
        this.T = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        zng.h uiState = (zng.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f197253b.setEnabled(uiState.e);
        NavBarWithToolbar navBarWithToolbar = d3().f197254c;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TextLocalisedClause textLocalisedClause = uiState.f323823b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(uiState.f323824c);
        TextLocalisedClause textLocalisedClause2 = uiState.d;
        CollapsingActionButton collapsingActionButton = d3().f197253b;
        collapsingActionButton.setLargeButtonText(textLocalisedClause2);
        collapsingActionButton.setCollapsible(true);
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return (AnalyticsProduct) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (zng.i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.z = this.K.e.b();
        d3().d.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f197254c;
        navBarWithToolbar.setNavigationButtonIcon(this.K.e.a());
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f197253b.c()), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f197253b.d()), null, new zng.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b), null, new f(this, null), 3);
    }

    public final lng.b d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lng.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.T);
    }
}
