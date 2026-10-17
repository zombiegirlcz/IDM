package com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import ghk.t;
import gq5.b;
import gq5.c;
import gq5.d;
import gq5.f;
import gq5.g;
import jii.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lo5.j;
import te0.w;
import tx0.q1;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llo5/j;", "Ldli/a;", "Lgq5/h;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoBeneficiaryDetailsScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CryptoBeneficiaryDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final RowDelegate K;
    public final SwipeToActionDelegate L;
    public final CellDetailsChevronDelegate M;
    public final CellDetailsActionDelegate N;
    public final CellDetailsDelegate O;
    public final LargeActionButtonDelegate P;
    public final PlainTextWarningDelegate Q;
    public final Object R;
    public final h S;
    public final int T;
    public final Object U;
    public final Object V;
    public final Object W;

    public CryptoBeneficiaryDetailsScreen(CryptoBeneficiaryDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.K = rowDelegate;
        this.L = new SwipeToActionDelegate(rowDelegate, false);
        this.M = new CellDetailsChevronDelegate();
        this.N = new CellDetailsActionDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new PlainTextWarningDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: gq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoBeneficiaryDetailsScreen f145566b;

            {
                this.f145566b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen = this.f145566b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoBeneficiaryDetailsScreen.X;
                        CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen2 = this.f145566b;
                        return dli.f.a(cryptoBeneficiaryDetailsScreen2, (g) cryptoBeneficiaryDetailsScreen2.V.getValue(), v.k(cryptoBeneficiaryDetailsScreen2.K, cryptoBeneficiaryDetailsScreen2.L, cryptoBeneficiaryDetailsScreen2.M, cryptoBeneficiaryDetailsScreen2.N, cryptoBeneficiaryDetailsScreen2.O, cryptoBeneficiaryDetailsScreen2.P, cryptoBeneficiaryDetailsScreen2.Q, new FullScreenStateDelegate(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoBeneficiaryDetailsScreen.X;
                        zo5.o oVar = (zo5.o) cryptoBeneficiaryDetailsScreen.U.getValue();
                        switch (oVar.f323931a) {
                            case 0:
                                return (g) oVar.f323937l.get();
                            default:
                                return (g) oVar.f323937l.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CryptoBeneficiaryDetailsScreen.X;
                        zo5.o oVar2 = (zo5.o) cryptoBeneficiaryDetailsScreen.U.getValue();
                        switch (oVar2.f323931a) {
                            case 0:
                                return (j60.a) oVar2.f.get();
                            default:
                                return (j60.a) oVar2.f.get();
                        }
                }
            }
        });
        this.S = s.t(this, b.f);
        this.T = R$layout.screen_recycler_navbarlargecentred;
        this.U = w.y0(new t(this, inputData, 16));
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: gq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoBeneficiaryDetailsScreen f145566b;

            {
                this.f145566b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen = this.f145566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoBeneficiaryDetailsScreen.X;
                        CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen2 = this.f145566b;
                        return dli.f.a(cryptoBeneficiaryDetailsScreen2, (g) cryptoBeneficiaryDetailsScreen2.V.getValue(), v.k(cryptoBeneficiaryDetailsScreen2.K, cryptoBeneficiaryDetailsScreen2.L, cryptoBeneficiaryDetailsScreen2.M, cryptoBeneficiaryDetailsScreen2.N, cryptoBeneficiaryDetailsScreen2.O, cryptoBeneficiaryDetailsScreen2.P, cryptoBeneficiaryDetailsScreen2.Q, new FullScreenStateDelegate(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoBeneficiaryDetailsScreen.X;
                        zo5.o oVar = (zo5.o) cryptoBeneficiaryDetailsScreen.U.getValue();
                        switch (oVar.f323931a) {
                            case 0:
                                return (g) oVar.f323937l.get();
                            default:
                                return (g) oVar.f323937l.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CryptoBeneficiaryDetailsScreen.X;
                        zo5.o oVar2 = (zo5.o) cryptoBeneficiaryDetailsScreen.U.getValue();
                        switch (oVar2.f323931a) {
                            case 0:
                                return (j60.a) oVar2.f.get();
                            default:
                                return (j60.a) oVar2.f.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: gq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoBeneficiaryDetailsScreen f145566b;

            {
                this.f145566b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen = this.f145566b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoBeneficiaryDetailsScreen.X;
                        CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen2 = this.f145566b;
                        return dli.f.a(cryptoBeneficiaryDetailsScreen2, (g) cryptoBeneficiaryDetailsScreen2.V.getValue(), v.k(cryptoBeneficiaryDetailsScreen2.K, cryptoBeneficiaryDetailsScreen2.L, cryptoBeneficiaryDetailsScreen2.M, cryptoBeneficiaryDetailsScreen2.N, cryptoBeneficiaryDetailsScreen2.O, cryptoBeneficiaryDetailsScreen2.P, cryptoBeneficiaryDetailsScreen2.Q, new FullScreenStateDelegate(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoBeneficiaryDetailsScreen.X;
                        zo5.o oVar = (zo5.o) cryptoBeneficiaryDetailsScreen.U.getValue();
                        switch (oVar.f323931a) {
                            case 0:
                                return (g) oVar.f323937l.get();
                            default:
                                return (g) oVar.f323937l.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CryptoBeneficiaryDetailsScreen.X;
                        zo5.o oVar2 = (zo5.o) cryptoBeneficiaryDetailsScreen.U.getValue();
                        switch (oVar2.f323931a) {
                            case 0:
                                return (j60.a) oVar2.f.get();
                            default:
                                return (j60.a) oVar2.f.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        gq5.h uiState = (gq5.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        f fVar = uiState.f145575b;
        TextClause textClause = fVar.f145571a;
        navBarLargeCentred.setToolbarTitle(textClause);
        navBarLargeCentred.setTitle(textClause);
        navBarLargeCentred.setDescriptionText(fVar.f145572b);
        NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, fVar.f145573c, (q1) null, 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zo5.o) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174576b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) this.W.getValue()).d(v.k(this.O, new ListSubheaderDelegate()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.f59292m), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.C()), new c(this, null, 1), 3);
        ihm.f fVar = this.M.f51821c;
        RowDelegate rowDelegate = this.K;
        r rVarMerge = r.merge(v.k(fVar, rowDelegate.f53225r, rowDelegate.f53218h, this.P.d.f121375b, this.N.d, this.O.d));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new d(this, continuation, 1), 3);
    }

    public final y d3() {
        ViewBinding value = this.S.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
