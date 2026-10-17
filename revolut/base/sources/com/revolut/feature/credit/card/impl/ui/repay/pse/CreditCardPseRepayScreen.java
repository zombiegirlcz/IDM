package com.revolut.feature.credit.card.impl.ui.repay.pse;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import ep4.b;
import java.util.List;
import jii.u;
import jij.d;
import jm4.a3;
import jm4.v1;
import jm4.w1;
import ju4.e;
import ju4.f;
import ju4.g;
import ju4.i;
import ju4.j;
import ju4.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import w01.k;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/pse/CreditCardPseRepayScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lju4/e;", "Ldli/a;", "Lju4/j;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardPseRepayScreen extends ViewController<e> implements a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CreditCardPseRepayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardPseRepayContract$InputData L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int S;
    public final Object T;
    public final boolean U;
    public final Object V;
    public final Object W;

    public CreditCardPseRepayScreen(CreditCardPseRepayContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = s.t(this, l.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ju4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPseRepayScreen f178588b;

            {
                this.f178588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardPseRepayScreen creditCardPseRepayScreen = this.f178588b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPseRepayScreen.X;
                        qd0.b bVarN = ((w1) creditCardPseRepayScreen.V.getValue()).f176416b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardPseRepayScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardPseRepayScreen.X;
                        return new CenteredAmountDelegate(new jnf.d(creditCardPseRepayScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardPseRepayScreen.X;
                        return (q) ((w1) creditCardPseRepayScreen.V.getValue()).f.get();
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardPseRepayScreen.X;
                        qji.b bVarU2 = creditCardPseRepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.pse.di.CreditCardPseRepayScreenInjector");
                        v1 v1Var = (v1) bVarU2;
                        a3 a3Var = v1Var.f176396b;
                        v1 v1Var2 = v1Var.f176397c;
                        CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = creditCardPseRepayScreen.L;
                        creditCardPseRepayContract$InputData.getClass();
                        return new w1(a3Var, v1Var2, creditCardPseRepayScreen, creditCardPseRepayContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardPseRepayScreen.X;
                        CreditCardPseRepayScreen creditCardPseRepayScreen2 = this.f178588b;
                        return dli.f.a(creditCardPseRepayScreen2, (q) creditCardPseRepayScreen2.T.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), new FooterTextDelegate(), new AmountEditDelegate(null), (GridBoxDelegate) creditCardPseRepayScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardPseRepayScreen2.O.getValue(), (CenteredAmountDelegate) creditCardPseRepayScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new jsl.b(14));
        this.P = w.y0(new jsl.b(15));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ju4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPseRepayScreen f178588b;

            {
                this.f178588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardPseRepayScreen creditCardPseRepayScreen = this.f178588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPseRepayScreen.X;
                        qd0.b bVarN = ((w1) creditCardPseRepayScreen.V.getValue()).f176416b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardPseRepayScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardPseRepayScreen.X;
                        return new CenteredAmountDelegate(new jnf.d(creditCardPseRepayScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardPseRepayScreen.X;
                        return (q) ((w1) creditCardPseRepayScreen.V.getValue()).f.get();
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardPseRepayScreen.X;
                        qji.b bVarU2 = creditCardPseRepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.pse.di.CreditCardPseRepayScreenInjector");
                        v1 v1Var = (v1) bVarU2;
                        a3 a3Var = v1Var.f176396b;
                        v1 v1Var2 = v1Var.f176397c;
                        CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = creditCardPseRepayScreen.L;
                        creditCardPseRepayContract$InputData.getClass();
                        return new w1(a3Var, v1Var2, creditCardPseRepayScreen, creditCardPseRepayContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardPseRepayScreen.X;
                        CreditCardPseRepayScreen creditCardPseRepayScreen2 = this.f178588b;
                        return dli.f.a(creditCardPseRepayScreen2, (q) creditCardPseRepayScreen2.T.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), new FooterTextDelegate(), new AmountEditDelegate(null), (GridBoxDelegate) creditCardPseRepayScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardPseRepayScreen2.O.getValue(), (CenteredAmountDelegate) creditCardPseRepayScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ju4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPseRepayScreen f178588b;

            {
                this.f178588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardPseRepayScreen creditCardPseRepayScreen = this.f178588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPseRepayScreen.X;
                        qd0.b bVarN = ((w1) creditCardPseRepayScreen.V.getValue()).f176416b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardPseRepayScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardPseRepayScreen.X;
                        return new CenteredAmountDelegate(new jnf.d(creditCardPseRepayScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardPseRepayScreen.X;
                        return (q) ((w1) creditCardPseRepayScreen.V.getValue()).f.get();
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardPseRepayScreen.X;
                        qji.b bVarU2 = creditCardPseRepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.pse.di.CreditCardPseRepayScreenInjector");
                        v1 v1Var = (v1) bVarU2;
                        a3 a3Var = v1Var.f176396b;
                        v1 v1Var2 = v1Var.f176397c;
                        CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = creditCardPseRepayScreen.L;
                        creditCardPseRepayContract$InputData.getClass();
                        return new w1(a3Var, v1Var2, creditCardPseRepayScreen, creditCardPseRepayContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardPseRepayScreen.X;
                        CreditCardPseRepayScreen creditCardPseRepayScreen2 = this.f178588b;
                        return dli.f.a(creditCardPseRepayScreen2, (q) creditCardPseRepayScreen2.T.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), new FooterTextDelegate(), new AmountEditDelegate(null), (GridBoxDelegate) creditCardPseRepayScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardPseRepayScreen2.O.getValue(), (CenteredAmountDelegate) creditCardPseRepayScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar_nextbutton;
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: ju4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPseRepayScreen f178588b;

            {
                this.f178588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardPseRepayScreen creditCardPseRepayScreen = this.f178588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPseRepayScreen.X;
                        qd0.b bVarN = ((w1) creditCardPseRepayScreen.V.getValue()).f176416b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardPseRepayScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardPseRepayScreen.X;
                        return new CenteredAmountDelegate(new jnf.d(creditCardPseRepayScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardPseRepayScreen.X;
                        return (q) ((w1) creditCardPseRepayScreen.V.getValue()).f.get();
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardPseRepayScreen.X;
                        qji.b bVarU2 = creditCardPseRepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.pse.di.CreditCardPseRepayScreenInjector");
                        v1 v1Var = (v1) bVarU2;
                        a3 a3Var = v1Var.f176396b;
                        v1 v1Var2 = v1Var.f176397c;
                        CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = creditCardPseRepayScreen.L;
                        creditCardPseRepayContract$InputData.getClass();
                        return new w1(a3Var, v1Var2, creditCardPseRepayScreen, creditCardPseRepayContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardPseRepayScreen.X;
                        CreditCardPseRepayScreen creditCardPseRepayScreen2 = this.f178588b;
                        return dli.f.a(creditCardPseRepayScreen2, (q) creditCardPseRepayScreen2.T.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), new FooterTextDelegate(), new AmountEditDelegate(null), (GridBoxDelegate) creditCardPseRepayScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardPseRepayScreen2.O.getValue(), (CenteredAmountDelegate) creditCardPseRepayScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = true;
        final int i6 = 4;
        this.V = w.y0(new Function0(this) { // from class: ju4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPseRepayScreen f178588b;

            {
                this.f178588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardPseRepayScreen creditCardPseRepayScreen = this.f178588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPseRepayScreen.X;
                        qd0.b bVarN = ((w1) creditCardPseRepayScreen.V.getValue()).f176416b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardPseRepayScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardPseRepayScreen.X;
                        return new CenteredAmountDelegate(new jnf.d(creditCardPseRepayScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardPseRepayScreen.X;
                        return (q) ((w1) creditCardPseRepayScreen.V.getValue()).f.get();
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardPseRepayScreen.X;
                        qji.b bVarU2 = creditCardPseRepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.pse.di.CreditCardPseRepayScreenInjector");
                        v1 v1Var = (v1) bVarU2;
                        a3 a3Var = v1Var.f176396b;
                        v1 v1Var2 = v1Var.f176397c;
                        CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = creditCardPseRepayScreen.L;
                        creditCardPseRepayContract$InputData.getClass();
                        return new w1(a3Var, v1Var2, creditCardPseRepayScreen, creditCardPseRepayContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardPseRepayScreen.X;
                        CreditCardPseRepayScreen creditCardPseRepayScreen2 = this.f178588b;
                        return dli.f.a(creditCardPseRepayScreen2, (q) creditCardPseRepayScreen2.T.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), new FooterTextDelegate(), new AmountEditDelegate(null), (GridBoxDelegate) creditCardPseRepayScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardPseRepayScreen2.O.getValue(), (CenteredAmountDelegate) creditCardPseRepayScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i21 = 5;
        this.W = w.y0(new Function0(this) { // from class: ju4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPseRepayScreen f178588b;

            {
                this.f178588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CreditCardPseRepayScreen creditCardPseRepayScreen = this.f178588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPseRepayScreen.X;
                        qd0.b bVarN = ((w1) creditCardPseRepayScreen.V.getValue()).f176416b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardPseRepayScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardPseRepayScreen.X;
                        return new CenteredAmountDelegate(new jnf.d(creditCardPseRepayScreen, 14));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardPseRepayScreen.X;
                        return (q) ((w1) creditCardPseRepayScreen.V.getValue()).f.get();
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardPseRepayScreen.X;
                        qji.b bVarU2 = creditCardPseRepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay.pse.di.CreditCardPseRepayScreenInjector");
                        v1 v1Var = (v1) bVarU2;
                        a3 a3Var = v1Var.f176396b;
                        v1 v1Var2 = v1Var.f176397c;
                        CreditCardPseRepayContract$InputData creditCardPseRepayContract$InputData = creditCardPseRepayScreen.L;
                        creditCardPseRepayContract$InputData.getClass();
                        return new w1(a3Var, v1Var2, creditCardPseRepayScreen, creditCardPseRepayContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardPseRepayScreen.X;
                        CreditCardPseRepayScreen creditCardPseRepayScreen2 = this.f178588b;
                        return dli.f.a(creditCardPseRepayScreen2, (q) creditCardPseRepayScreen2.T.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new TextDelegate(), new FooterTextDelegate(), new AmountEditDelegate(null), (GridBoxDelegate) creditCardPseRepayScreen2.Q.getValue(), (FullScreenStateDelegate) creditCardPseRepayScreen2.O.getValue(), (CenteredAmountDelegate) creditCardPseRepayScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        i iVar = uiState.f178586b;
        LargeActionButton largeActionButton = d3().f174564b;
        if ((iVar instanceof ju4.h) || (iVar instanceof g)) {
            k.a(largeActionButton);
        } else {
            if (!(iVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            k.d(largeActionButton);
            f fVar = (f) iVar;
            largeActionButton.setText(fVar.f178581a);
            largeActionButton.setEnabled(fVar.f178582b);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w1) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ju4.q) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.U);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setNestedScrollingEnabled(false);
        screenContentRecyclerView.setOverScrollMode(2);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_topup_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new ay4.f(vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((AttributeSelectorSmallDelegate) this.P.getValue()).p()), new d(rd0.e.b(d3().f174564b.o), 15)), yx4.b.Companion, 14), new jij.h(this, continuation, 28), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new jkc.g(this, continuation, 17), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }
}
