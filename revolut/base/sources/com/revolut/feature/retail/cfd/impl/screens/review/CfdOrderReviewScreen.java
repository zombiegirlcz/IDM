package com.revolut.feature.retail.cfd.impl.screens.review;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import exe.j;
import f4h.a;
import i13.d;
import i1d.b;
import i4b.c;
import i4b.f;
import i4b.i0;
import i4b.r;
import i4b.s0;
import java.util.List;
import jii.k;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m2b.c0;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/review/CfdOrderReviewScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Li4b/r;", "Lcom/revolut/feature/retail/cfd/impl/screens/review/CfdOrderReviewScreenContract$InputData;", "Laii/q;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdOrderReviewScreen extends BaseRecyclerViewScreen<r, CfdOrderReviewScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(CfdOrderReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final int X;
    public final FullScreenStateDelegate Y;
    public final CellDetailsLoadingDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TextDelegate f82271a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsActionDelegate f82272b0;
    public final CellDetailsDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final a f82273d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i0 f82274e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f82275h0;
    public final Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CfdOrderReviewScreen(CfdOrderReviewScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_action_footer;
        this.V = true;
        this.W = s.t(this, c.f);
        this.X = R$id.screenRecyclerNavbarActionFooter_recyclerView;
        this.Y = new FullScreenStateDelegate();
        this.Z = new CellDetailsLoadingDelegate();
        this.f82271a0 = new TextDelegate();
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.f82272b0 = cellDetailsActionDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.c0 = cellDetailsDelegate;
        this.f82273d0 = new a(this);
        this.f82274e0 = new i0(cellDetailsActionDelegate, cellDetailsDelegate, new LargeActionButtonDelegate());
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: i4b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOrderReviewScreen f158322b;

            {
                this.f158322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdOrderReviewScreen cfdOrderReviewScreen = this.f158322b;
                switch (i2) {
                    case 0:
                        return zhm.v.k(cfdOrderReviewScreen.Z, cfdOrderReviewScreen.Y, cfdOrderReviewScreen.f82271a0, cfdOrderReviewScreen.f82272b0, new CellDetailsStandaloneNoteDelegate(), cfdOrderReviewScreen.c0, new PlainTextDelegate());
                    case 1:
                        KProperty[] kPropertyArr = CfdOrderReviewScreen.j0;
                        m2b.c0 c0Var = (m2b.c0) cfdOrderReviewScreen.g0.getValue();
                        switch (c0Var.f201781a) {
                            case 0:
                                return (q) c0Var.u.get();
                            default:
                                return (q) c0Var.u.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CfdOrderReviewScreen.j0;
                        m2b.c0 c0Var2 = (m2b.c0) cfdOrderReviewScreen.g0.getValue();
                        switch (c0Var2.f201781a) {
                            case 0:
                                return (s0) c0Var2.A.get();
                            default:
                                return (s0) c0Var2.A.get();
                        }
                }
            }
        });
        this.g0 = w.y0(new b(this, inputData, 2));
        final int i2 = 1;
        this.f82275h0 = w.y0(new Function0(this) { // from class: i4b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOrderReviewScreen f158322b;

            {
                this.f158322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdOrderReviewScreen cfdOrderReviewScreen = this.f158322b;
                switch (i22) {
                    case 0:
                        return zhm.v.k(cfdOrderReviewScreen.Z, cfdOrderReviewScreen.Y, cfdOrderReviewScreen.f82271a0, cfdOrderReviewScreen.f82272b0, new CellDetailsStandaloneNoteDelegate(), cfdOrderReviewScreen.c0, new PlainTextDelegate());
                    case 1:
                        KProperty[] kPropertyArr = CfdOrderReviewScreen.j0;
                        m2b.c0 c0Var = (m2b.c0) cfdOrderReviewScreen.g0.getValue();
                        switch (c0Var.f201781a) {
                            case 0:
                                return (q) c0Var.u.get();
                            default:
                                return (q) c0Var.u.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CfdOrderReviewScreen.j0;
                        m2b.c0 c0Var2 = (m2b.c0) cfdOrderReviewScreen.g0.getValue();
                        switch (c0Var2.f201781a) {
                            case 0:
                                return (s0) c0Var2.A.get();
                            default:
                                return (s0) c0Var2.A.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: i4b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdOrderReviewScreen f158322b;

            {
                this.f158322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfdOrderReviewScreen cfdOrderReviewScreen = this.f158322b;
                switch (i22) {
                    case 0:
                        return zhm.v.k(cfdOrderReviewScreen.Z, cfdOrderReviewScreen.Y, cfdOrderReviewScreen.f82271a0, cfdOrderReviewScreen.f82272b0, new CellDetailsStandaloneNoteDelegate(), cfdOrderReviewScreen.c0, new PlainTextDelegate());
                    case 1:
                        KProperty[] kPropertyArr = CfdOrderReviewScreen.j0;
                        m2b.c0 c0Var = (m2b.c0) cfdOrderReviewScreen.g0.getValue();
                        switch (c0Var.f201781a) {
                            case 0:
                                return (q) c0Var.u.get();
                            default:
                                return (q) c0Var.u.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CfdOrderReviewScreen.j0;
                        m2b.c0 c0Var2 = (m2b.c0) cfdOrderReviewScreen.g0.getValue();
                        switch (c0Var2.f201781a) {
                            case 0:
                                return (s0) c0Var2.A.get();
                            default:
                                return (s0) c0Var2.A.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c0) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i4b.q) this.f82275h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        final s0 s0Var = (s0) this.i0.getValue();
        i0 i0Var = s0Var.f158379c;
        hsl.c cVar = new hsl.c(e.b(i0Var.f158346a.d), 18);
        final int i = 0;
        Function1 function1 = new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        };
        f fVar = s0Var.f158377a;
        fVar.a(cVar, function1);
        ihm.f fVar2 = i0Var.f158347b.d;
        final int i2 = 6;
        fVar.a(new hsl.c(e.b(fVar2), 19), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ihm.f fVar3 = i0Var.f158346a.d;
        final int i3 = 7;
        fVar.a(new hsl.c(e.b(fVar3), 20), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i5 = 8;
        fVar.a(new hsl.c(e.b(fVar3), 21), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i6 = 9;
        fVar.a(new j(new hsl.c(e.b(fVar2), 22), 21), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        e01.a aVar = i0Var.f158348c.d;
        efm.r rVarFilter = aVar.f121375b.filter(new i31.e(14, new i3k.h(10)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i21 = 1;
        fVar.a(e.b(rVarFilter), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i22 = 2;
        fVar.a(new hsl.c(e.b(fVar2), 23), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i32 = 3;
        fVar.a(new hsl.c(e.b(fVar2), 24), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i33 = 4;
        fVar.a(new hsl.c(e.b(fVar3), 25), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        efm.r rVarFilter2 = aVar.f121375b.filter(new i31.e(15, new i3k.h(9)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        final int i43 = 5;
        fVar.a(e.b(rVarFilter2), new Function1() { // from class: i4b.h0
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 870
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i4b.h0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        KProperty[] kPropertyArr = j0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.W;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = ((k) value).f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarActionFooterNavBar.f59410q), null, new i4b.e(this, continuation, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = ((k) value2).f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarActionFooterActionFooterView.f), null, new i4b.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new hsl.c(e.b(this.f82271a0.d), 17), null, new d(this, continuation, 12), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = ((k) value).f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setTag("CFD_ORDER_REVIEW_SCREEN_NAVBAR_TAG");
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h().setTag("CFD_ORDER_REVIEW_SCREEN_RECYCLER_VIEW_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF95992b0() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
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
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(r uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        s0 s0Var = (s0) this.i0.getValue();
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        s0Var.f158382j = uiState.e;
        s0Var.k = uiState.f;
        s0Var.f158383l = uiState.f158374g;
        KProperty[] kPropertyArr = j0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.W;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = ((k) value).f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        ?? r4 = uiState.f158371a;
        screenRecyclerNavbarActionFooterNavBar.setTitle(r4, null);
        screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(r4);
        screenRecyclerNavbarActionFooterNavBar.setDescriptionText(uiState.f158372b);
        screenRecyclerNavbarActionFooterNavBar.setDescriptionVisible(true);
        screenRecyclerNavbarActionFooterNavBar.setEndIconImage(uiState.f158373c);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = ((k) value2).f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setModel(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
