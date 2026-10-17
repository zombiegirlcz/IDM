package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c43.p;
import c43.q;
import cli.o;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.CardLimitsInfoScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l43.b;
import l43.d;
import l43.e;
import l43.f;
import l43.j;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/link_card/screens/limits/CardLimitsInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll43/e;", "Ldli/a;", "Ll43/j;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardLimitsInfoScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CardLimitsInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final d K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final NotificationCentreItemDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CardLimitsInfoScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new NotificationCentreItemDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: l43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsInfoScreen f192049b;

            {
                this.f192049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardLimitsInfoScreen cardLimitsInfoScreen = this.f192049b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardLimitsInfoScreen.S;
                        q qVar = (q) cardLimitsInfoScreen.Q.getValue();
                        switch (qVar.f21073a) {
                            case 0:
                                return (f) qVar.d.get();
                            default:
                                return (f) qVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CardLimitsInfoScreen.S;
                        qji.b bVarU2 = cardLimitsInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.di.CardLimitsInfoScreenInjector");
                        p pVar = (p) ((m43.a) bVarU2).b().mo3808a(cardLimitsInfoScreen);
                        d dVar = cardLimitsInfoScreen.K;
                        switch (pVar.f21070a) {
                            case 0:
                                dVar.getClass();
                                pVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                pVar.d = dVar;
                                break;
                        }
                        return (q) pVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CardLimitsInfoScreen.S;
                        CardLimitsInfoScreen cardLimitsInfoScreen2 = this.f192049b;
                        return dli.f.a(cardLimitsInfoScreen2, (f) cardLimitsInfoScreen2.P.getValue(), v.k(cardLimitsInfoScreen2.N, new RowLoadingDelegate(), cardLimitsInfoScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: l43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsInfoScreen f192049b;

            {
                this.f192049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardLimitsInfoScreen cardLimitsInfoScreen = this.f192049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardLimitsInfoScreen.S;
                        q qVar = (q) cardLimitsInfoScreen.Q.getValue();
                        switch (qVar.f21073a) {
                            case 0:
                                return (f) qVar.d.get();
                            default:
                                return (f) qVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CardLimitsInfoScreen.S;
                        qji.b bVarU2 = cardLimitsInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.di.CardLimitsInfoScreenInjector");
                        p pVar = (p) ((m43.a) bVarU2).b().mo3808a(cardLimitsInfoScreen);
                        d dVar = cardLimitsInfoScreen.K;
                        switch (pVar.f21070a) {
                            case 0:
                                dVar.getClass();
                                pVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                pVar.d = dVar;
                                break;
                        }
                        return (q) pVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CardLimitsInfoScreen.S;
                        CardLimitsInfoScreen cardLimitsInfoScreen2 = this.f192049b;
                        return dli.f.a(cardLimitsInfoScreen2, (f) cardLimitsInfoScreen2.P.getValue(), v.k(cardLimitsInfoScreen2.N, new RowLoadingDelegate(), cardLimitsInfoScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: l43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsInfoScreen f192049b;

            {
                this.f192049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardLimitsInfoScreen cardLimitsInfoScreen = this.f192049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardLimitsInfoScreen.S;
                        q qVar = (q) cardLimitsInfoScreen.Q.getValue();
                        switch (qVar.f21073a) {
                            case 0:
                                return (f) qVar.d.get();
                            default:
                                return (f) qVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CardLimitsInfoScreen.S;
                        qji.b bVarU2 = cardLimitsInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_payment_method.impl.flows.link_card.screens.limits.di.CardLimitsInfoScreenInjector");
                        p pVar = (p) ((m43.a) bVarU2).b().mo3808a(cardLimitsInfoScreen);
                        d dVar = cardLimitsInfoScreen.K;
                        switch (pVar.f21070a) {
                            case 0:
                                dVar.getClass();
                                pVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                pVar.d = dVar;
                                break;
                        }
                        return (q) pVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CardLimitsInfoScreen.S;
                        CardLimitsInfoScreen cardLimitsInfoScreen2 = this.f192049b;
                        return dli.f.a(cardLimitsInfoScreen2, (f) cardLimitsInfoScreen2.P.getValue(), v.k(cardLimitsInfoScreen2.N, new RowLoadingDelegate(), cardLimitsInfoScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_title, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new ko2.b(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53226s), new l1g.e(this, (Continuation) null, 2), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
