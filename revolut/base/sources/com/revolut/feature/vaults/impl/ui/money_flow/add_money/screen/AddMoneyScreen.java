package com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen;

import android.content.Intent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.vaults.impl.R$id;
import com.revolut.feature.vaults.impl.R$layout;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import jki.o;
import jpg.e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import pqg.d;
import pqg.f;
import pqg.i0;
import pqg.j;
import pqg.t;
import sji.b;
import ta6.a;
import te0.w;
import vc.s;
import vkm.z1;
import zbb.g;
import zbb.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/screen/AddMoneyScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpqg/t;", "Lcom/revolut/kompot/common/IOData$Input;", "Ljpg/e;", "Lno/k;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddMoneyScreen extends BaseRecyclerViewScreen<t, IOData$Input, e> implements k {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(AddMoneyScreen.class, "binding", "getBinding()Lcom/revolut/feature/vaults/impl/databinding/ScreenAddMoneyV2Binding;", 0))};
    public final AddMoneyScreenContract$InputData U;
    public final Object V;
    public final z1 W;
    public final h X;
    public final LargeActionButtonDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnalyticsContext f94770a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f94771b0;
    public final CellDetailsDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f94772d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f94773e0;
    public final boolean f0;
    public final List g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f94774h0;
    public final Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyScreen(AddMoneyScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = input;
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: pqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyScreen f238737b;

            {
                this.f238737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddMoneyScreen addMoneyScreen = this.f238737b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyScreen.j0;
                        qd0.b bVarN = ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299245b.f299289s.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                        return (j60.a) ((wpg.d) addMoneyScreen.f94774h0.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddMoneyScreen.j0;
                        return new CenteredAmountDelegate(new plb.g(addMoneyScreen, 18));
                    case 3:
                        KProperty[] kPropertyArr4 = AddMoneyScreen.j0;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = addMoneyScreen.U;
                        addMoneyScreenContract$InputData.getClass();
                        return new wpg.d(lVar, addMoneyScreen, addMoneyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AddMoneyScreen.j0;
                        return (r) ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299252n.get();
                }
            }
        });
        this.W = a.a(0);
        this.X = s.t(this, d.f);
        this.Y = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: pqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyScreen f238737b;

            {
                this.f238737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddMoneyScreen addMoneyScreen = this.f238737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyScreen.j0;
                        qd0.b bVarN = ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299245b.f299289s.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                        return (j60.a) ((wpg.d) addMoneyScreen.f94774h0.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddMoneyScreen.j0;
                        return new CenteredAmountDelegate(new plb.g(addMoneyScreen, 18));
                    case 3:
                        KProperty[] kPropertyArr4 = AddMoneyScreen.j0;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = addMoneyScreen.U;
                        addMoneyScreenContract$InputData.getClass();
                        return new wpg.d(lVar, addMoneyScreen, addMoneyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AddMoneyScreen.j0;
                        return (r) ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299252n.get();
                }
            }
        });
        String str = input.f94776b;
        this.f94770a0 = str != null ? new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE)) : null;
        final int i3 = 2;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: pqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyScreen f238737b;

            {
                this.f238737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddMoneyScreen addMoneyScreen = this.f238737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyScreen.j0;
                        qd0.b bVarN = ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299245b.f299289s.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                        return (j60.a) ((wpg.d) addMoneyScreen.f94774h0.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddMoneyScreen.j0;
                        return new CenteredAmountDelegate(new plb.g(addMoneyScreen, 18));
                    case 3:
                        KProperty[] kPropertyArr4 = AddMoneyScreen.j0;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = addMoneyScreen.U;
                        addMoneyScreenContract$InputData.getClass();
                        return new wpg.d(lVar, addMoneyScreen, addMoneyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AddMoneyScreen.j0;
                        return (r) ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299252n.get();
                }
            }
        });
        this.f94771b0 = lazyY0;
        this.c0 = new CellDetailsDelegate();
        this.f94772d0 = R$layout.screen_add_money_v2;
        this.f94773e0 = R$id.addMoneyScreen_recyclerView;
        this.f0 = true;
        this.g0 = u.c((CenteredAmountDelegate) lazyY0.getValue());
        final int i5 = 3;
        this.f94774h0 = w.y0(new Function0(this) { // from class: pqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyScreen f238737b;

            {
                this.f238737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AddMoneyScreen addMoneyScreen = this.f238737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyScreen.j0;
                        qd0.b bVarN = ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299245b.f299289s.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                        return (j60.a) ((wpg.d) addMoneyScreen.f94774h0.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddMoneyScreen.j0;
                        return new CenteredAmountDelegate(new plb.g(addMoneyScreen, 18));
                    case 3:
                        KProperty[] kPropertyArr4 = AddMoneyScreen.j0;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = addMoneyScreen.U;
                        addMoneyScreenContract$InputData.getClass();
                        return new wpg.d(lVar, addMoneyScreen, addMoneyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AddMoneyScreen.j0;
                        return (r) ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299252n.get();
                }
            }
        });
        final int i6 = 4;
        this.i0 = w.y0(new Function0(this) { // from class: pqg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyScreen f238737b;

            {
                this.f238737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AddMoneyScreen addMoneyScreen = this.f238737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddMoneyScreen.j0;
                        qd0.b bVarN = ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299245b.f299289s.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                        return (j60.a) ((wpg.d) addMoneyScreen.f94774h0.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddMoneyScreen.j0;
                        return new CenteredAmountDelegate(new plb.g(addMoneyScreen, 18));
                    case 3:
                        KProperty[] kPropertyArr4 = AddMoneyScreen.j0;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = addMoneyScreen.U;
                        addMoneyScreenContract$InputData.getClass();
                        return new wpg.d(lVar, addMoneyScreen, addMoneyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AddMoneyScreen.j0;
                        return (r) ((wpg.d) addMoneyScreen.f94774h0.getValue()).f299252n.get();
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f94770a0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getC0() {
        return this.f94770a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (wpg.d) this.f94774h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        i0 i0Var = (i0) T2();
        xi0.b bVarA = ((i) i0Var.H).a(new g(i, i2, intent));
        if (bVarA != null) {
            i0Var.x2(new ou5.a(7, bVarA));
            i0Var.L.onNext(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        tpg.a aVarH3 = h3();
        r rVarDoOnNext = aVarH3.d.o.doOnNext(new po9.w(10, new ccb.b(view, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDoOnNext), null, new pqg.e(this, continuation, 0), 3);
        NavBarWithAvatar navBarWithAvatar = aVarH3.f273365b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithAvatar.f59338a), null, new f(view, this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithAvatar.f59339b), null, new pqg.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarH3.f273366c.o), null, new f(view, this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, this.W, null, new pp4.h(2, T2(), pqg.r.class, "onAmountChanged", "onAmountChanged(Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/screen/AddMoneyScreenContract$AmountInput;)V", 4, 4), 3);
        ?? r142 = this.f94771b0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r142.getValue()).e.f121375b), null, new pqg.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r142.getValue()).f.f121375b), null, new pqg.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r142.getValue()).f51964g.f121375b), null, new pqg.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.d.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.d), null, new pqg.k(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f273365b.setNavigationButtonIcon(Integer.valueOf(this.U.d));
        ((j60.a) this.Z.getValue()).d(v.k(this.Y, this.c0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF80882d0() {
        return this.g0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.f94773e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(t uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        pqg.s sVar = oVar instanceof pqg.s ? (pqg.s) oVar : null;
        tpg.a aVarH3 = h3();
        NavBarWithAvatar navBarWithAvatar = aVarH3.f273365b;
        final LargeActionButton addMoneyScreenScheduleButton = aVarH3.f273366c;
        LargeActionButton addMoneyScreenSubmitButton = aVarH3.d;
        TextLocalisedClause textLocalisedClause = uiState.f238768g;
        final boolean z = uiState.f;
        TextLocalisedClause textLocalisedClause2 = uiState.e;
        navBarWithAvatar.setToolbarTitle(textLocalisedClause);
        if (sVar == null || sVar.f238762a) {
            addMoneyScreenSubmitButton.setEnabled(uiState.f238766b);
        }
        if (sVar == null || sVar.f238763b) {
            navBarWithAvatar.setToolbarDescription(uiState.f238767c);
        }
        if (sVar == null || sVar.f238764c) {
            navBarWithAvatar.setAvatarImage(uiState.d);
        }
        if (sVar == null || sVar.d) {
            addMoneyScreenSubmitButton.setText(textLocalisedClause2);
            Intrinsics.checkNotNullExpressionValue(addMoneyScreenSubmitButton, "addMoneyScreenSubmitButton");
            pd.b.p(addMoneyScreenSubmitButton, new TextLocalisedClause(R$string.savings_accessibility_button, u.c(textLocalisedClause2), null, 12));
        }
        if (sVar == null || sVar.e) {
            Intrinsics.checkNotNullExpressionValue(addMoneyScreenScheduleButton, "addMoneyScreenScheduleButton");
            LinearInterpolator animationInterpolator = new LinearInterpolator();
            Intrinsics.checkNotNullParameter(addMoneyScreenScheduleButton, "<this>");
            Intrinsics.checkNotNullParameter(animationInterpolator, "animationInterpolator");
            if ((!z || addMoneyScreenScheduleButton.getVisibility() != 0) && (z || addMoneyScreenScheduleButton.getVisibility() != 8)) {
                addMoneyScreenScheduleButton.setAlpha(z ? 0.0f : 1.0f);
                final int i = 0;
                ViewPropertyAnimator viewPropertyAnimatorWithStartAction = addMoneyScreenScheduleButton.animate().alpha(z ? 1.0f : 0.0f).setDuration(1L).setInterpolator(animationInterpolator).withStartAction(new Runnable() { // from class: w01.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                if (z) {
                                    addMoneyScreenScheduleButton.setVisibility(0);
                                }
                                break;
                            default:
                                if (!z) {
                                    addMoneyScreenScheduleButton.setVisibility(8);
                                }
                                break;
                        }
                    }
                });
                final int i2 = 1;
                viewPropertyAnimatorWithStartAction.withEndAction(new Runnable() { // from class: w01.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                if (z) {
                                    addMoneyScreenScheduleButton.setVisibility(0);
                                }
                                break;
                            default:
                                if (!z) {
                                    addMoneyScreenScheduleButton.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).setStartDelay(0L).start();
            }
            if (z) {
                addMoneyScreenScheduleButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.f94772d0;
    }

    public final tpg.a h3() {
        ViewBinding value = this.X.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (tpg.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final pqg.r T2() {
        return (pqg.r) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f0);
    }
}
