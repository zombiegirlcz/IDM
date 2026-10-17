package com.revolut.feature.credit.card.impl.ui.cashback.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import efm.r;
import ep4.b;
import jm4.a3;
import jm4.q0;
import jp9.l;
import jq4.i;
import jq4.j;
import jq4.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkd.g;
import no.m;
import te0.w;
import vc.s;
import vkm.d;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cashback/details/CreditCardCashbackDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ljq4/k;", "Lno/m;", "Lmkd/g;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardCashbackDetailsScreen extends ViewController<q> implements a, m, g {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(CreditCardCashbackDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardCashbackDetailsScreenContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public CreditCardCashbackDetailsScreen(CreditCardCashbackDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, jq4.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: jq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardCashbackDetailsScreen f177412b;

            {
                this.f177412b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen = this.f177412b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardCashbackDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardCashbackDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = creditCardCashbackDetailsScreen.L;
                        creditCardCashbackDetailsScreenContract$InputData.getClass();
                        return new q0(a3Var, creditCardCashbackDetailsScreen, creditCardCashbackDetailsScreenContract$InputData, creditCardCashbackDetailsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardCashbackDetailsScreen.Z;
                        return new ScrollerDelegate(u.c((ActionWidgetDelegate) creditCardCashbackDetailsScreen.W.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardCashbackDetailsScreen.Z;
                        CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen2 = this.f177412b;
                        i iVar = (i) creditCardCashbackDetailsScreen2.P.getValue();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) creditCardCashbackDetailsScreen2.R.getValue();
                        ?? r56 = creditCardCashbackDetailsScreen2.U;
                        return dli.f.a(creditCardCashbackDetailsScreen2, iVar, v.k(listSubheaderDelegate, (RowDelegate) r56.getValue(), (ListCellDelegate) creditCardCashbackDetailsScreen2.S.getValue(), (VaultsProgressDelegate) creditCardCashbackDetailsScreen2.V.getValue(), (LargeActionButtonDelegate) creditCardCashbackDetailsScreen2.T.getValue(), new SwipeToActionDelegate((RowDelegate) r56.getValue(), true), new CounterTextDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), (ScrollerDelegate) creditCardCashbackDetailsScreen2.X.getValue(), (ActionWidgetDelegate) creditCardCashbackDetailsScreen2.W.getValue(), new ActionWidgetLoadingDelegate()), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardCashbackDetailsScreen.Z;
                        return (i) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f176265l.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardCashbackDetailsScreen.Z;
                        return (j60.a) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f.get();
                }
            }
        });
        final int i2 = 3;
        this.P = w.y0(new Function0(this) { // from class: jq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardCashbackDetailsScreen f177412b;

            {
                this.f177412b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen = this.f177412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardCashbackDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardCashbackDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = creditCardCashbackDetailsScreen.L;
                        creditCardCashbackDetailsScreenContract$InputData.getClass();
                        return new q0(a3Var, creditCardCashbackDetailsScreen, creditCardCashbackDetailsScreenContract$InputData, creditCardCashbackDetailsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardCashbackDetailsScreen.Z;
                        return new ScrollerDelegate(u.c((ActionWidgetDelegate) creditCardCashbackDetailsScreen.W.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardCashbackDetailsScreen.Z;
                        CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen2 = this.f177412b;
                        i iVar = (i) creditCardCashbackDetailsScreen2.P.getValue();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) creditCardCashbackDetailsScreen2.R.getValue();
                        ?? r56 = creditCardCashbackDetailsScreen2.U;
                        return dli.f.a(creditCardCashbackDetailsScreen2, iVar, v.k(listSubheaderDelegate, (RowDelegate) r56.getValue(), (ListCellDelegate) creditCardCashbackDetailsScreen2.S.getValue(), (VaultsProgressDelegate) creditCardCashbackDetailsScreen2.V.getValue(), (LargeActionButtonDelegate) creditCardCashbackDetailsScreen2.T.getValue(), new SwipeToActionDelegate((RowDelegate) r56.getValue(), true), new CounterTextDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), (ScrollerDelegate) creditCardCashbackDetailsScreen2.X.getValue(), (ActionWidgetDelegate) creditCardCashbackDetailsScreen2.W.getValue(), new ActionWidgetLoadingDelegate()), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardCashbackDetailsScreen.Z;
                        return (i) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f176265l.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardCashbackDetailsScreen.Z;
                        return (j60.a) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f.get();
                }
            }
        });
        final int i3 = 4;
        this.Q = w.y0(new Function0(this) { // from class: jq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardCashbackDetailsScreen f177412b;

            {
                this.f177412b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen = this.f177412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardCashbackDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardCashbackDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = creditCardCashbackDetailsScreen.L;
                        creditCardCashbackDetailsScreenContract$InputData.getClass();
                        return new q0(a3Var, creditCardCashbackDetailsScreen, creditCardCashbackDetailsScreenContract$InputData, creditCardCashbackDetailsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardCashbackDetailsScreen.Z;
                        return new ScrollerDelegate(u.c((ActionWidgetDelegate) creditCardCashbackDetailsScreen.W.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardCashbackDetailsScreen.Z;
                        CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen2 = this.f177412b;
                        i iVar = (i) creditCardCashbackDetailsScreen2.P.getValue();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) creditCardCashbackDetailsScreen2.R.getValue();
                        ?? r56 = creditCardCashbackDetailsScreen2.U;
                        return dli.f.a(creditCardCashbackDetailsScreen2, iVar, v.k(listSubheaderDelegate, (RowDelegate) r56.getValue(), (ListCellDelegate) creditCardCashbackDetailsScreen2.S.getValue(), (VaultsProgressDelegate) creditCardCashbackDetailsScreen2.V.getValue(), (LargeActionButtonDelegate) creditCardCashbackDetailsScreen2.T.getValue(), new SwipeToActionDelegate((RowDelegate) r56.getValue(), true), new CounterTextDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), (ScrollerDelegate) creditCardCashbackDetailsScreen2.X.getValue(), (ActionWidgetDelegate) creditCardCashbackDetailsScreen2.W.getValue(), new ActionWidgetLoadingDelegate()), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardCashbackDetailsScreen.Z;
                        return (i) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f176265l.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardCashbackDetailsScreen.Z;
                        return (j60.a) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f.get();
                }
            }
        });
        this.R = w.y0(new l(1));
        this.S = w.y0(new l(2));
        this.T = w.y0(new l(3));
        this.U = w.y0(new l(4));
        this.V = w.y0(new l(5));
        this.W = w.y0(new l(6));
        final int i5 = 1;
        this.X = w.y0(new Function0(this) { // from class: jq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardCashbackDetailsScreen f177412b;

            {
                this.f177412b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen = this.f177412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardCashbackDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardCashbackDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = creditCardCashbackDetailsScreen.L;
                        creditCardCashbackDetailsScreenContract$InputData.getClass();
                        return new q0(a3Var, creditCardCashbackDetailsScreen, creditCardCashbackDetailsScreenContract$InputData, creditCardCashbackDetailsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardCashbackDetailsScreen.Z;
                        return new ScrollerDelegate(u.c((ActionWidgetDelegate) creditCardCashbackDetailsScreen.W.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardCashbackDetailsScreen.Z;
                        CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen2 = this.f177412b;
                        i iVar = (i) creditCardCashbackDetailsScreen2.P.getValue();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) creditCardCashbackDetailsScreen2.R.getValue();
                        ?? r56 = creditCardCashbackDetailsScreen2.U;
                        return dli.f.a(creditCardCashbackDetailsScreen2, iVar, v.k(listSubheaderDelegate, (RowDelegate) r56.getValue(), (ListCellDelegate) creditCardCashbackDetailsScreen2.S.getValue(), (VaultsProgressDelegate) creditCardCashbackDetailsScreen2.V.getValue(), (LargeActionButtonDelegate) creditCardCashbackDetailsScreen2.T.getValue(), new SwipeToActionDelegate((RowDelegate) r56.getValue(), true), new CounterTextDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), (ScrollerDelegate) creditCardCashbackDetailsScreen2.X.getValue(), (ActionWidgetDelegate) creditCardCashbackDetailsScreen2.W.getValue(), new ActionWidgetLoadingDelegate()), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardCashbackDetailsScreen.Z;
                        return (i) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f176265l.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardCashbackDetailsScreen.Z;
                        return (j60.a) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f.get();
                }
            }
        });
        final int i6 = 2;
        this.Y = w.y0(new Function0(this) { // from class: jq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardCashbackDetailsScreen f177412b;

            {
                this.f177412b = this;
            }

            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen = this.f177412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardCashbackDetailsScreen.Z;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardCashbackDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = creditCardCashbackDetailsScreen.L;
                        creditCardCashbackDetailsScreenContract$InputData.getClass();
                        return new q0(a3Var, creditCardCashbackDetailsScreen, creditCardCashbackDetailsScreenContract$InputData, creditCardCashbackDetailsScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardCashbackDetailsScreen.Z;
                        return new ScrollerDelegate(u.c((ActionWidgetDelegate) creditCardCashbackDetailsScreen.W.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardCashbackDetailsScreen.Z;
                        CreditCardCashbackDetailsScreen creditCardCashbackDetailsScreen2 = this.f177412b;
                        i iVar = (i) creditCardCashbackDetailsScreen2.P.getValue();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) creditCardCashbackDetailsScreen2.R.getValue();
                        ?? r56 = creditCardCashbackDetailsScreen2.U;
                        return dli.f.a(creditCardCashbackDetailsScreen2, iVar, v.k(listSubheaderDelegate, (RowDelegate) r56.getValue(), (ListCellDelegate) creditCardCashbackDetailsScreen2.S.getValue(), (VaultsProgressDelegate) creditCardCashbackDetailsScreen2.V.getValue(), (LargeActionButtonDelegate) creditCardCashbackDetailsScreen2.T.getValue(), new SwipeToActionDelegate((RowDelegate) r56.getValue(), true), new CounterTextDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), (ScrollerDelegate) creditCardCashbackDetailsScreen2.X.getValue(), (ActionWidgetDelegate) creditCardCashbackDetailsScreen2.W.getValue(), new ActionWidgetLoadingDelegate()), 0, null, null, null, 60);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardCashbackDetailsScreen.Z;
                        return (i) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f176265l.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardCashbackDetailsScreen.Z;
                        return (j60.a) ((q0) creditCardCashbackDetailsScreen.O.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = uiState.f177455a;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(jVar.f177453b);
        navBarWithToolbar.setNavigationButtonImage(jVar.f177454c);
        TextLocalisedClause textLocalisedClause = jVar.f177452a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setFilters(jVar.d);
        navBarWithToolbar.setMenuItems(jVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final r F1() {
        return ((ScrollerDelegate) this.X.getValue()).i;
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
    public final e R1() {
        return (q0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(v.k((ListCellDelegate) this.S.getValue(), (LargeActionButtonDelegate) this.T.getValue()));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new jkc.g(this, continuation, 8), 3);
        d dVarB = rd0.e.b(d3().f174539b.o.f57403b);
        d dVarB2 = rd0.e.b(d3().f174539b.s0());
        d dVarB3 = rd0.e.b(((LargeActionButtonDelegate) this.T.getValue()).d.f121375b);
        d dVarB4 = rd0.e.b(((RowDelegate) this.U.getValue()).f53218h);
        d dVarB5 = rd0.e.b(((ListCellDelegate) this.S.getValue()).f52692c);
        d dVarB6 = rd0.e.b(((ListSubheaderDelegate) this.R.getValue()).f52707c);
        ?? r87 = this.V;
        ViewController.P2(this, vkm.q.J(dVarB, dVarB2, dVarB3, dVarB4, dVarB5, dVarB6, rd0.e.b(((VaultsProgressDelegate) r87.getValue()).r()), rd0.e.b(((VaultsProgressDelegate) r87.getValue()).e)), new jij.h(this, continuation, 16), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.N.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((c) this.Y.getValue()).w().f;
    }
}
