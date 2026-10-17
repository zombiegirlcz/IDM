package com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import iv4.c;
import iv4.f;
import iv4.g;
import java.util.List;
import jm4.a3;
import jm4.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/accrued_interest/dialog/CreditCardAccruedInterestsBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Liv4/f;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardAccruedInterestsBottomSheetController extends ViewController<Object> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardAccruedInterestsBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardAccruedInterestsBottomSheetControllerContract$InputData L;
    public final int M;
    public final h N;
    public final LargeActionButtonDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CreditCardAccruedInterestsBottomSheetController(CreditCardAccruedInterestsBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_bottom_sheet_list;
        this.N = s.t(this, iv4.b.f);
        this.O = new LargeActionButtonDelegate();
        this.P = w.y0(new is7.b(27));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: iv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsBottomSheetController f168713b;

            {
                this.f168713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController = this.f168713b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsBottomSheetController.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardAccruedInterestsBottomSheetController.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsBottomSheetController.U;
                        CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController2 = this.f168713b;
                        g gVar = (g) creditCardAccruedInterestsBottomSheetController2.T.getValue();
                        List listK = v.k(creditCardAccruedInterestsBottomSheetController2.O, (RowDelegate) creditCardAccruedInterestsBottomSheetController2.P.getValue(), (SwipeToActionDelegate) creditCardAccruedInterestsBottomSheetController2.Q.getValue(), new RowLoadingDelegate());
                        ViewBinding value = creditCardAccruedInterestsBottomSheetController2.N.getValue(creditCardAccruedInterestsBottomSheetController2, CreditCardAccruedInterestsBottomSheetController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(creditCardAccruedInterestsBottomSheetController2, gVar, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAccruedInterestsBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = creditCardAccruedInterestsBottomSheetController.L;
                        creditCardAccruedInterestsBottomSheetControllerContract$InputData.getClass();
                        return new f0(a3Var, creditCardAccruedInterestsBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardAccruedInterestsBottomSheetController.U;
                        return (g) ((f0) creditCardAccruedInterestsBottomSheetController.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: iv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsBottomSheetController f168713b;

            {
                this.f168713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController = this.f168713b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsBottomSheetController.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardAccruedInterestsBottomSheetController.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsBottomSheetController.U;
                        CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController2 = this.f168713b;
                        g gVar = (g) creditCardAccruedInterestsBottomSheetController2.T.getValue();
                        List listK = v.k(creditCardAccruedInterestsBottomSheetController2.O, (RowDelegate) creditCardAccruedInterestsBottomSheetController2.P.getValue(), (SwipeToActionDelegate) creditCardAccruedInterestsBottomSheetController2.Q.getValue(), new RowLoadingDelegate());
                        ViewBinding value = creditCardAccruedInterestsBottomSheetController2.N.getValue(creditCardAccruedInterestsBottomSheetController2, CreditCardAccruedInterestsBottomSheetController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(creditCardAccruedInterestsBottomSheetController2, gVar, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAccruedInterestsBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = creditCardAccruedInterestsBottomSheetController.L;
                        creditCardAccruedInterestsBottomSheetControllerContract$InputData.getClass();
                        return new f0(a3Var, creditCardAccruedInterestsBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardAccruedInterestsBottomSheetController.U;
                        return (g) ((f0) creditCardAccruedInterestsBottomSheetController.S.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: iv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsBottomSheetController f168713b;

            {
                this.f168713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController = this.f168713b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsBottomSheetController.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardAccruedInterestsBottomSheetController.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsBottomSheetController.U;
                        CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController2 = this.f168713b;
                        g gVar = (g) creditCardAccruedInterestsBottomSheetController2.T.getValue();
                        List listK = v.k(creditCardAccruedInterestsBottomSheetController2.O, (RowDelegate) creditCardAccruedInterestsBottomSheetController2.P.getValue(), (SwipeToActionDelegate) creditCardAccruedInterestsBottomSheetController2.Q.getValue(), new RowLoadingDelegate());
                        ViewBinding value = creditCardAccruedInterestsBottomSheetController2.N.getValue(creditCardAccruedInterestsBottomSheetController2, CreditCardAccruedInterestsBottomSheetController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(creditCardAccruedInterestsBottomSheetController2, gVar, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAccruedInterestsBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = creditCardAccruedInterestsBottomSheetController.L;
                        creditCardAccruedInterestsBottomSheetControllerContract$InputData.getClass();
                        return new f0(a3Var, creditCardAccruedInterestsBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardAccruedInterestsBottomSheetController.U;
                        return (g) ((f0) creditCardAccruedInterestsBottomSheetController.S.getValue()).d.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: iv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsBottomSheetController f168713b;

            {
                this.f168713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController = this.f168713b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsBottomSheetController.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardAccruedInterestsBottomSheetController.P.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsBottomSheetController.U;
                        CreditCardAccruedInterestsBottomSheetController creditCardAccruedInterestsBottomSheetController2 = this.f168713b;
                        g gVar = (g) creditCardAccruedInterestsBottomSheetController2.T.getValue();
                        List listK = v.k(creditCardAccruedInterestsBottomSheetController2.O, (RowDelegate) creditCardAccruedInterestsBottomSheetController2.P.getValue(), (SwipeToActionDelegate) creditCardAccruedInterestsBottomSheetController2.Q.getValue(), new RowLoadingDelegate());
                        ViewBinding value = creditCardAccruedInterestsBottomSheetController2.N.getValue(creditCardAccruedInterestsBottomSheetController2, CreditCardAccruedInterestsBottomSheetController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(creditCardAccruedInterestsBottomSheetController2, gVar, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAccruedInterestsBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = creditCardAccruedInterestsBottomSheetController.L;
                        creditCardAccruedInterestsBottomSheetControllerContract$InputData.getClass();
                        return new f0(a3Var, creditCardAccruedInterestsBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardAccruedInterestsBottomSheetController.U;
                        return (g) ((f0) creditCardAccruedInterestsBottomSheetController.S.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((jii.f) value).f174519b;
        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = this.L;
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextClause(creditCardAccruedInterestsBottomSheetControllerContract$InputData.f69673b.f68867a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(creditCardAccruedInterestsBottomSheetControllerContract$InputData.f69673b.f68868b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
