package com.revolut.feature.insurance_credit.impl.ui.screen.contact;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt7.c;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lt7.b;
import lt7.d;
import lt7.f;
import lt7.g;
import lt7.j;
import lt7.k;
import mx0.c7;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/contact/ContactScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Llt7/k;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ContactScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final ContactScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final CounterTextDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public ContactScreen(ContactScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new CounterTextDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: lt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactScreen f199828b;

            {
                this.f199828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ContactScreen contactScreen = this.f199828b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ContactScreen.U;
                        ContactScreen contactScreen2 = this.f199828b;
                        return dli.f.a(contactScreen2, contactScreen2.d(), v.k(contactScreen2.N, contactScreen2.O, contactScreen2.P, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ContactScreen.U;
                        qji.b bVarU2 = contactScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.contact.di.ContactScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        ContactScreenContract$InputData contactScreenContract$InputData = contactScreen.K;
                        contactScreenContract$InputData.getClass();
                        return new bt7.c(iVar, jVar2, contactScreen, contactScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ContactScreen.U;
                        return (j) ((bt7.c) contactScreen.S.getValue()).f.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: lt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactScreen f199828b;

            {
                this.f199828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ContactScreen contactScreen = this.f199828b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContactScreen.U;
                        ContactScreen contactScreen2 = this.f199828b;
                        return dli.f.a(contactScreen2, contactScreen2.d(), v.k(contactScreen2.N, contactScreen2.O, contactScreen2.P, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ContactScreen.U;
                        qji.b bVarU2 = contactScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.contact.di.ContactScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        ContactScreenContract$InputData contactScreenContract$InputData = contactScreen.K;
                        contactScreenContract$InputData.getClass();
                        return new bt7.c(iVar, jVar2, contactScreen, contactScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ContactScreen.U;
                        return (j) ((bt7.c) contactScreen.S.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: lt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactScreen f199828b;

            {
                this.f199828b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ContactScreen contactScreen = this.f199828b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContactScreen.U;
                        ContactScreen contactScreen2 = this.f199828b;
                        return dli.f.a(contactScreen2, contactScreen2.d(), v.k(contactScreen2.N, contactScreen2.O, contactScreen2.P, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ContactScreen.U;
                        qji.b bVarU2 = contactScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.contact.di.ContactScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        ContactScreenContract$InputData contactScreenContract$InputData = contactScreen.K;
                        contactScreenContract$InputData.getClass();
                        return new bt7.c(iVar, jVar2, contactScreen, contactScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ContactScreen.U;
                        return (j) ((bt7.c) contactScreen.S.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        Clause clause = uiState.f199832b;
        Clause clause2 = uiState.e;
        Clause clause3 = uiState.d;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setTitle(clause, null);
        }
        navBarWithToolbar.setLoadingVisible(uiState.f199833c);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(clause3);
        largeActionButton.setVisibility(clause3 != null ? 0 : 8);
        FooterTextView footerTextView = d3().f174558c;
        if (clause2 != null) {
            footerTextView.setContent(new c7(clause2, false, null, 6));
        }
        footerTextView.setVisibility(clause2 != null ? 0 : 8);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setLoadingButtonTag("MAKE_CLAIM_LOADING_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new d(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new lt7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new lt.d(rd0.e.b(this.N.f52371h.f121375b), i), null, new g(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
