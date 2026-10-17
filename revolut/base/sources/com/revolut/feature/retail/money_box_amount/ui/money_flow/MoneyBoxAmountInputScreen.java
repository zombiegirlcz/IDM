package com.revolut.feature.retail.money_box_amount.ui.money_flow;

import a94.q;
import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ccb.c;
import ccb.c0;
import ccb.d;
import ccb.f;
import ccb.l;
import ccb.p;
import ccb.r;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.money_box_amount.R$id;
import com.revolut.feature.retail.money_box_amount.R$layout;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import sji.b;
import ta6.a;
import te0.w;
import vc.s;
import vkm.z1;
import wpg.o;
import zbb.g;
import zbb.i;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/money_box_amount/ui/money_flow/MoneyBoxAmountInputScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lccb/r;", "Lcom/revolut/feature/retail/money_box_amount/ui/money_flow/MoneyBoxAmountInputScreenContract$InputData;", "Lccb/l;", "Lno/m;", "feature_retail_money_box_amount_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyBoxAmountInputScreen extends BaseRecyclerViewScreen<r, MoneyBoxAmountInputScreenContract$InputData, l> implements m {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(MoneyBoxAmountInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/money_box_amount/databinding/ScreenMoneyBoxInputBinding;", 0))};
    public final Object U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final z1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f82761a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AnalyticsProduct f82762b0;
    public final int c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f82763d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f82764e0;
    public final List f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f82765h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyBoxAmountInputScreen(MoneyBoxAmountInputScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: ccb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyBoxAmountInputScreen f22969b;

            {
                this.f22969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i2 = i;
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.f22969b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar.f299300a) {
                            case 0:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = ((r6e.o) oVar.f299302c).o.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296098b;
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296099c;
                    case 4:
                        KProperty[] kPropertyArr5 = MoneyBoxAmountInputScreen.i0;
                        return new CenteredAmountDelegate(new c9f.c(moneyBoxAmountInputScreen, 9));
                    default:
                        KProperty[] kPropertyArr6 = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar2 = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar2.f299300a) {
                            case 0:
                                return (p) oVar2.i.get();
                            case 1:
                                return (p) oVar2.i.get();
                            case 2:
                                return (p) oVar2.i.get();
                            default:
                                return (p) oVar2.i.get();
                        }
                }
            }
        });
        this.V = s.t(this, c.f);
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: ccb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyBoxAmountInputScreen f22969b;

            {
                this.f22969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i2;
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.f22969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar.f299300a) {
                            case 0:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = ((r6e.o) oVar.f299302c).o.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296098b;
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296099c;
                    case 4:
                        KProperty[] kPropertyArr5 = MoneyBoxAmountInputScreen.i0;
                        return new CenteredAmountDelegate(new c9f.c(moneyBoxAmountInputScreen, 9));
                    default:
                        KProperty[] kPropertyArr6 = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar2 = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar2.f299300a) {
                            case 0:
                                return (p) oVar2.i.get();
                            case 1:
                                return (p) oVar2.i.get();
                            case 2:
                                return (p) oVar2.i.get();
                            default:
                                return (p) oVar2.i.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: ccb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyBoxAmountInputScreen f22969b;

            {
                this.f22969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i3;
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.f22969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar.f299300a) {
                            case 0:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = ((r6e.o) oVar.f299302c).o.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296098b;
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296099c;
                    case 4:
                        KProperty[] kPropertyArr5 = MoneyBoxAmountInputScreen.i0;
                        return new CenteredAmountDelegate(new c9f.c(moneyBoxAmountInputScreen, 9));
                    default:
                        KProperty[] kPropertyArr6 = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar2 = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar2.f299300a) {
                            case 0:
                                return (p) oVar2.i.get();
                            case 1:
                                return (p) oVar2.i.get();
                            case 2:
                                return (p) oVar2.i.get();
                            default:
                                return (p) oVar2.i.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.Y = w.y0(new Function0(this) { // from class: ccb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyBoxAmountInputScreen f22969b;

            {
                this.f22969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i5;
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.f22969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar.f299300a) {
                            case 0:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = ((r6e.o) oVar.f299302c).o.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296098b;
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296099c;
                    case 4:
                        KProperty[] kPropertyArr5 = MoneyBoxAmountInputScreen.i0;
                        return new CenteredAmountDelegate(new c9f.c(moneyBoxAmountInputScreen, 9));
                    default:
                        KProperty[] kPropertyArr6 = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar2 = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar2.f299300a) {
                            case 0:
                                return (p) oVar2.i.get();
                            case 1:
                                return (p) oVar2.i.get();
                            case 2:
                                return (p) oVar2.i.get();
                            default:
                                return (p) oVar2.i.get();
                        }
                }
            }
        });
        this.Z = a.a(0);
        final int i6 = 4;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: ccb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyBoxAmountInputScreen f22969b;

            {
                this.f22969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i6;
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.f22969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar.f299300a) {
                            case 0:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = ((r6e.o) oVar.f299302c).o.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296098b;
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296099c;
                    case 4:
                        KProperty[] kPropertyArr5 = MoneyBoxAmountInputScreen.i0;
                        return new CenteredAmountDelegate(new c9f.c(moneyBoxAmountInputScreen, 9));
                    default:
                        KProperty[] kPropertyArr6 = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar2 = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar2.f299300a) {
                            case 0:
                                return (p) oVar2.i.get();
                            case 1:
                                return (p) oVar2.i.get();
                            case 2:
                                return (p) oVar2.i.get();
                            default:
                                return (p) oVar2.i.get();
                        }
                }
            }
        });
        this.f82761a0 = lazyY0;
        this.f82762b0 = inputData.f82769g;
        this.c0 = R$layout.screen_money_box_input;
        this.f82763d0 = R$id.moneyBoxInput_recyclerView;
        this.f82764e0 = true;
        this.f0 = u.c((CenteredAmountDelegate) lazyY0.getValue());
        this.g0 = w.y0(new buf.u(this, inputData, 26));
        final int i21 = 5;
        this.f82765h0 = w.y0(new Function0(this) { // from class: ccb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoneyBoxAmountInputScreen f22969b;

            {
                this.f22969b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i21;
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = this.f22969b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar.f299300a) {
                            case 0:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 1:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            case 2:
                                bVarN = ((wpg.l) oVar.f299302c).f299289s.n();
                                vc.s.j(bVarN);
                                break;
                            default:
                                bVarN = ((r6e.o) oVar.f299302c).o.n();
                                vc.s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296098b;
                    case 2:
                        KProperty[] kPropertyArr3 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().d;
                    case 3:
                        KProperty[] kPropertyArr4 = MoneyBoxAmountInputScreen.i0;
                        return moneyBoxAmountInputScreen.h3().f296099c;
                    case 4:
                        KProperty[] kPropertyArr5 = MoneyBoxAmountInputScreen.i0;
                        return new CenteredAmountDelegate(new c9f.c(moneyBoxAmountInputScreen, 9));
                    default:
                        KProperty[] kPropertyArr6 = MoneyBoxAmountInputScreen.i0;
                        wpg.o oVar2 = (wpg.o) moneyBoxAmountInputScreen.g0.getValue();
                        switch (oVar2.f299300a) {
                            case 0:
                                return (p) oVar2.i.get();
                            case 1:
                                return (p) oVar2.i.get();
                            case 2:
                                return (p) oVar2.i.get();
                            default:
                                return (p) oVar2.i.get();
                        }
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.f82762b0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (o) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        c0 c0Var = (c0) T2();
        xi0.b bVarA = ((i) c0Var.u).a(new g(i, i2, intent));
        if (bVarA != null) {
            c0Var.x2(new q(15, bVarA));
            c0Var.v.k(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButton) this.X.getValue()).o), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButton) this.Y.getValue()).o), null, new d(this, continuation, 1), 3);
        efm.r rVarDoOnNext = i3().f59338a.doOnNext(new c64.a(new ccb.b(view, 0), 19));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDoOnNext), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().f59339b), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, this.Z, null, new aee.g(2, T2(), p.class, "onAmountChanged", "onAmountChanged(Lcom/revolut/feature/retail/money_box_amount/ui/money_flow/MoneyBoxAmountInputScreenContract$AmountInput;)V", 4, 19), 3);
        ?? r132 = this.f82761a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r132.getValue()).e.f121375b), null, new ccb.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CenteredAmountDelegate) r132.getValue()).f.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        i3().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        NavBarWithAvatar navBarWithAvatarI3 = i3();
        MoneyBoxAmountInputScreenContract$InputData moneyBoxAmountInputScreenContract$InputData = (MoneyBoxAmountInputScreenContract$InputData) this.G;
        navBarWithAvatarI3.setToolbarTitle(moneyBoxAmountInputScreenContract$InputData.f82768c.f82771b);
        ((LargeActionButton) this.X.getValue()).setText(moneyBoxAmountInputScreenContract$InputData.f82768c.f82770a);
        LargeActionButton largeActionButton = (LargeActionButton) this.Y.getValue();
        knm.b.z(largeActionButton, moneyBoxAmountInputScreenContract$InputData.f82768c.f82772c, null, 14);
        largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.f82763d0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(r uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ccb.q qVar = oVar instanceof ccb.q ? (ccb.q) oVar : null;
        if (qVar == null || qVar.f23010a) {
            ((LargeActionButton) this.X.getValue()).setEnabled(uiState.f23014b);
        }
        if (qVar == null || qVar.f23011b) {
            i3().setToolbarDescription(uiState.f23015c);
        }
        if (qVar == null || qVar.f23012c) {
            i3().setAvatarImage(uiState.d);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.c0;
    }

    public final wbb.a h3() {
        ViewBinding value = this.V.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wbb.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NavBarWithAvatar i3() {
        return (NavBarWithAvatar) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final p T2() {
        return (p) this.f82765h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f82764e0);
    }
}
