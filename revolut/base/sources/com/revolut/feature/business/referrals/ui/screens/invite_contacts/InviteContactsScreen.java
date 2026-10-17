package com.revolut.feature.business.referrals.ui.screens.invite_contacts;

import aii.q;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.R$layout;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d9.t0;
import grl.x0;
import koi.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n5j.b;
import no.m;
import org.jetbrains.annotations.NotNull;
import rp0.f1;
import rp0.g1;
import rp0.k1;
import te0.w;
import us2.d;
import vc.s;
import vu.f;
import vu.g;
import yp0.y;
import zhm.u;
import zhm.v;
import zs2.e;
import zs2.i;
import zs2.j;
import zs2.l;
import zs2.p;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/invite_contacts/InviteContactsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzs2/m;", "Lno/m;", "Companion", "a", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InviteContactsScreen extends ViewController<q> implements dli.a, m {
    public final InviteContactsScreenContract$InputData K;
    public final AnalyticsProduct.Business L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final ActionWidgetDelegate Q;
    public final RowDelegate R;
    public final FullScreenStateDelegate S;
    public final ReferralContactDelegate T;
    public final koi.h U;
    public final Object V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(InviteContactsScreen.class, "binding", "getBinding()Lcom/revolut/feature/business/referrals/databinding/ScreenInviteContactsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public InviteContactsScreen(InviteContactsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        x0 value = x0.Referrals;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.L = new AnalyticsProduct.Business(value);
        this.M = R$layout.screen_invite_contacts;
        this.N = s.t(this, e.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteContactsScreen f324790b;

            {
                this.f324790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InviteContactsScreen inviteContactsScreen = this.f324790b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InviteContactsScreen.W;
                        qji.b bVarU2 = inviteContactsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.invite_contacts.di.InviteContactsScreenInjector");
                        us2.h hVar = (us2.h) bVarU2;
                        us2.j jVar = hVar.f282403b;
                        us2.h hVar2 = hVar.f282404c;
                        InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData = inviteContactsScreen.K;
                        inviteContactsScreenContract$InputData.getClass();
                        return new us2.d(jVar, hVar2, inviteContactsScreen, inviteContactsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InviteContactsScreen.W;
                        return (l) ((us2.d) inviteContactsScreen.O.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = InviteContactsScreen.W;
                        InviteContactsScreen inviteContactsScreen2 = this.f324790b;
                        return dli.f.a(inviteContactsScreen2, inviteContactsScreen2.d(), v.k(inviteContactsScreen2.Q, inviteContactsScreen2.R, new RowLoadingDelegate(), inviteContactsScreen2.S), R$id.inviteContacts_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteContactsScreen f324790b;

            {
                this.f324790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InviteContactsScreen inviteContactsScreen = this.f324790b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InviteContactsScreen.W;
                        qji.b bVarU2 = inviteContactsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.invite_contacts.di.InviteContactsScreenInjector");
                        us2.h hVar = (us2.h) bVarU2;
                        us2.j jVar = hVar.f282403b;
                        us2.h hVar2 = hVar.f282404c;
                        InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData = inviteContactsScreen.K;
                        inviteContactsScreenContract$InputData.getClass();
                        return new us2.d(jVar, hVar2, inviteContactsScreen, inviteContactsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InviteContactsScreen.W;
                        return (l) ((us2.d) inviteContactsScreen.O.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = InviteContactsScreen.W;
                        InviteContactsScreen inviteContactsScreen2 = this.f324790b;
                        return dli.f.a(inviteContactsScreen2, inviteContactsScreen2.d(), v.k(inviteContactsScreen2.Q, inviteContactsScreen2.R, new RowLoadingDelegate(), inviteContactsScreen2.S), R$id.inviteContacts_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new ActionWidgetDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new FullScreenStateDelegate();
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.T = referralContactDelegate;
        this.U = new koi.h(new c(u.c(new ScrollerDelegate(u.c(referralContactDelegate), false))), false, false, 6);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: zs2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteContactsScreen f324790b;

            {
                this.f324790b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InviteContactsScreen inviteContactsScreen = this.f324790b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InviteContactsScreen.W;
                        qji.b bVarU2 = inviteContactsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.invite_contacts.di.InviteContactsScreenInjector");
                        us2.h hVar = (us2.h) bVarU2;
                        us2.j jVar = hVar.f282403b;
                        us2.h hVar2 = hVar.f282404c;
                        InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData = inviteContactsScreen.K;
                        inviteContactsScreenContract$InputData.getClass();
                        return new us2.d(jVar, hVar2, inviteContactsScreen, inviteContactsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InviteContactsScreen.W;
                        return (l) ((us2.d) inviteContactsScreen.O.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = InviteContactsScreen.W;
                        InviteContactsScreen inviteContactsScreen2 = this.f324790b;
                        return dli.f.a(inviteContactsScreen2, inviteContactsScreen2.d(), v.k(inviteContactsScreen2.Q, inviteContactsScreen2.R, new RowLoadingDelegate(), inviteContactsScreen2.S), R$id.inviteContacts_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        zs2.m uiState = (zs2.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f273947c.setHint(uiState.f324797c);
        this.U.c(uiState.f324796b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) d();
        aVar.getClass();
        if (i == 101 || i == 102) {
            int i3 = p.f324801b[aVar.f64353x.o0().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.f64352w.R(h60.a.f149577a);
                return;
            }
            g1 g1Var = aVar.f64348q;
            zs2.c cVar = (zs2.c) aVar.f64349r;
            k1 k1Var = (k1) g1Var;
            k1Var.d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "INVITE_SENT_ID", new TextLocalisedClause(((b) cVar.f324788a).b(f.business_referrals_invite_contacts_invite_sent), null, null, 14), f1.ABOVE_ANCHOR_VIEW, 44));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f273947c;
        ?? r110 = this.O;
        g gVarA = ((d) r110.getValue()).f282388b.f282408a.a();
        s.j(gVarA);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(((b) gVarA).b(f.business_referrals_invite_contacts_title), null, null, 14);
        g gVarA2 = ((d) r110.getValue()).f282388b.f282408a.a();
        s.j(gVarA2);
        TextLocalisedClause textLocalisedClauseG = t0.G(textLocalisedClause, ((b) gVarA2).b(f.referrals_invite_screen));
        navBarWithToolbar.setToolbarTitle(textLocalisedClauseG);
        navBarWithToolbar.setTitle(textLocalisedClauseG, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSearchButtonActive(true);
        ScreenContentRecyclerView inviteContactsActions = d3().f273946b;
        Intrinsics.checkNotNullExpressionValue(inviteContactsActions, "inviteContactsActions");
        y.h(inviteContactsActions, this.U, new LinearLayoutManager(inviteContactsActions.getContext()));
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f273947c;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new z3f.b(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, t1.d(rd0.e.b(navBarWithToolbar.f59409p.f57337m), 300L), null, new zs2.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f51589c.f121375b), null, new zs2.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53220l), null, new zs2.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.q()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((n60.b) ((d) this.O.getValue()).d.get()).d), null, new zs2.f(this, continuation, 1), 3);
    }

    public final ts2.a d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ts2.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
