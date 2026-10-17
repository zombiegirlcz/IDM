package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro;

import aw0.k9;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import h3a.n;
import h3a.p;
import h5a.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l5a.k;
import l5a.l;
import l5a.o;
import l5a.r;
import l5a.t;
import l5a.w;
import oki.h;
import r10.q;
import utk.f;
import wje.m;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h implements o {
    public final com.revolut.kompot.navigable.a A;
    public final s70.a B;
    public final pn3.a C;
    public final f D;
    public final j40.a E;
    public final b5a.b F;
    public final cw9.d G;
    public final q H;
    public final i4b.f I;
    public final y J;
    public final com.revolut.kompot.navigable.vc.modal.a K;
    public final PaymentsIntroScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i5a.b f80195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f80196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f80197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c9e.c f80198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f80199t;
    public final wsg.n u;
    public final bn2.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h5a.d f80200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g3a.d f80201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cl3.a f80202y;
    public final y80.a z;

    public e(PaymentsIntroScreenContract$InputData inputData, cli.n stateMapper, i5a.b homeNavBarTitleProvider, n navBarSearchFieldActionButtonsProvider, j transferProductIntroStateProvider, c9e.c subscriptionNavigationProvider, p searchActionsNavigationCommandFactory, wsg.n walletInteractor, bn2.p backgroundsInteractor, h5a.d newTransferNavigationDestinationProvider, g3a.d paymentsSearchScreenProvider, cl3.a contactsInteractor, y80.a permissionRequestResolver, com.revolut.kompot.navigable.a controller, s70.a intentProvider, pn3.a contactsPermissionsController, f profileNotificationInteractor, j40.a assistantModelExtension, b5a.b inviteFriendsDestinationProvider, cw9.d paymentsProductFeatureChecker, q userRegisteredIdentitiesInteractor, i4b.f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(homeNavBarTitleProvider, "homeNavBarTitleProvider");
        Intrinsics.checkNotNullParameter(navBarSearchFieldActionButtonsProvider, "navBarSearchFieldActionButtonsProvider");
        Intrinsics.checkNotNullParameter(transferProductIntroStateProvider, "transferProductIntroStateProvider");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(searchActionsNavigationCommandFactory, "searchActionsNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(newTransferNavigationDestinationProvider, "newTransferNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(paymentsSearchScreenProvider, "paymentsSearchScreenProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(permissionRequestResolver, "permissionRequestResolver");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(inviteFriendsDestinationProvider, "inviteFriendsDestinationProvider");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = inputData;
        this.f80195p = homeNavBarTitleProvider;
        this.f80196q = navBarSearchFieldActionButtonsProvider;
        this.f80197r = transferProductIntroStateProvider;
        this.f80198s = subscriptionNavigationProvider;
        this.f80199t = searchActionsNavigationCommandFactory;
        this.u = walletInteractor;
        this.v = backgroundsInteractor;
        this.f80200w = newTransferNavigationDestinationProvider;
        this.f80201x = paymentsSearchScreenProvider;
        this.f80202y = contactsInteractor;
        this.z = permissionRequestResolver;
        this.A = controller;
        this.B = intentProvider;
        this.C = contactsPermissionsController;
        this.D = profileNotificationInteractor;
        this.E = assistantModelExtension;
        this.F = inviteFriendsDestinationProvider;
        this.G = paymentsProductFeatureChecker;
        this.H = userRegisteredIdentitiesInteractor;
        this.I = legalEntityContextProvider;
        this.J = mra.d.b(this, new l(null, new k9(null, null, 3), null, new Data(f0.f322471a, null, true, 2, null), permissionRequestResolver.d(controller.m2(), v.k("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS")), false, k.LOADING, null, false, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.K = hx7.e.a(this, new l0c.v(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.f80195p.a(new TextLocalisedClause(R$string.payments_transfer_title, null, null, 14))), null, null, new r(this, continuation, 3), 3);
        l2(new t(this, continuation, 1), new yi5.b(26));
        l2(new l5a.v(this, null), new l2d.a(29));
        l2(new d(this, null), new yi5.b(26));
        efm.r rVarStartWith = nim.a.w(((sl3.k) ((wl3.h) this.f80202y).f298380a).g(), new m(27)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        yji.l.a1(this, rd0.e.b(rVarStartWith), null, null, new r(this, continuation, 2), 3);
        yji.l.a1(this, this.I.j(null), null, null, new r(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.K;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new t(this, continuation, 4), new whi.b(6));
        H2(this.J, new l5a.q(this, 0));
        yji.l.b1(this, this.D.d(), null, new w(this, continuation, 0), 3);
        if (this.o.f80190a) {
            yji.l.b1(this, this.E.Z2(), null, new r(this, continuation, 4), 3);
        }
        yji.l.b1(this, this.G.g(), null, new w(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.J;
    }
}
