package com.revolut.feature.credit.card.impl.ui.limit_hub.manage;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import jii.y;
import jm4.p1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tk5.c;
import tna.p;
import tt4.n;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/limit_hub/manage/CreditCardLimitHubManageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltt4/n;", "Ldli/a;", "Ltt4/o;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardLimitHubManageScreen extends ViewController<n> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CreditCardLimitHubManageScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public CreditCardLimitHubManageScreen(CreditCardLimitHubManageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbarlargecentred;
        this.M = w.y0(new ts1.h(4));
        this.N = w.y0(new ts1.h(5));
        this.O = w.y0(new ts1.h(6));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: tt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitHubManageScreen f274207b;

            {
                this.f274207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitHubManageScreen.T;
                        CreditCardLimitHubManageScreen creditCardLimitHubManageScreen = this.f274207b;
                        return dli.f.a(creditCardLimitHubManageScreen, (s) creditCardLimitHubManageScreen.S.getValue(), v.k((RowDelegate) creditCardLimitHubManageScreen.M.getValue(), (CellDetailsLoadingDelegate) creditCardLimitHubManageScreen.N.getValue(), (FullScreenStateDelegate) creditCardLimitHubManageScreen.O.getValue()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardLimitHubManageScreen.T;
                        return (s) ((p1) this.f274207b.R.getValue()).f176246b.get();
                }
            }
        });
        this.Q = s.t(this, tt4.b.f);
        this.R = w.y0(new tml.a(this, inputData, 12));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: tt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitHubManageScreen f274207b;

            {
                this.f274207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitHubManageScreen.T;
                        CreditCardLimitHubManageScreen creditCardLimitHubManageScreen = this.f274207b;
                        return dli.f.a(creditCardLimitHubManageScreen, (s) creditCardLimitHubManageScreen.S.getValue(), v.k((RowDelegate) creditCardLimitHubManageScreen.M.getValue(), (CellDetailsLoadingDelegate) creditCardLimitHubManageScreen.N.getValue(), (FullScreenStateDelegate) creditCardLimitHubManageScreen.O.getValue()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardLimitHubManageScreen.T;
                        return (s) ((p1) this.f274207b.R.getValue()).f176246b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tt4.o uiState = (tt4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((y) value).f174576b.setModel(uiState.f274224a);
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
        return (p1) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tt4.s) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((y) value).f174576b.f59292m), new c(this, null, 13), 3);
        ViewController.P2(this, new ss4.h(vkm.q.J(rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b)), yx4.b.Companion, 2), new p(this, null, 9), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
