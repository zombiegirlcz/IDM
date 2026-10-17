package com.revolut.feature.security_hub.impl.ui.security_hub;

import ax9.o;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.hidden_accounts.api.HiddenAccountsApi$Toggles$SecretAccounts;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.security_hub.api.R$string;
import go.g;
import ha3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jvc.a0;
import jvc.c0;
import jvc.d0;
import jvc.g0;
import jvc.i;
import jvc.j0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l93.f;
import mkd.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qtc.l;
import r10.q;
import smd.s;
import st2.e;
import til.m;
import vfg.p;
import vkm.j2;
import vkm.v1;
import wtc.a1;
import wtc.n0;
import wtc.t;
import wtc.y0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends h implements a0 {

    @NotNull
    private static final d0 Companion = new d0();
    public final d A;
    public final t B;
    public final se9.d C;
    public final ptc.a D;
    public final vqb.b E;
    public final e F;
    public final m G;
    public final t1j.b H;
    public final zrc.d I;
    public final l61.a J;
    public final y K;
    public final com.revolut.kompot.navigable.vc.modal.a L;
    public final SecurityHubScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jla.h f85643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f85644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f85645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kye.e f85646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lvc.a f85647t;
    public final rul.e u;
    public final zja.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final otc.b f85648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kdh.b f85649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f85650y;
    public final s z;

    public c(j0 stateMapper, SecurityHubScreenContract$InputData inputData, gte.a featureToggleInteractor, jla.h productCatalogueInteractor, f cardInteractor, j60.a bottomExpandableDialogControllerExtension, kye.e securityHubCardListDialogMapper, lvc.a securityHubDeviceDialogMapper, rul.e securityHubFeatureChecker, zja.a productArticleInteractor, otc.b securityHubType, kdh.b deviceInteractor, ang.f userInteractor, s countryTransactionLimitsInteractor, d slotManagerFeedControllerModelExtension, t securityHubCardInteractor, se9.d passcodeReminderPigeonRepository, ptc.a wealthProtectionInteractor, vqb.b slotManagerChecklistDeeplinkParser, e callSecurityPermissionBannerInteractor, m workflowFlowDestinationProvider, t1j.b transactionsLimitsGlobalAccountsInteractor, zrc.d scaInteractor, p callSecurityInfoAvailabilityInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(securityHubCardListDialogMapper, "securityHubCardListDialogMapper");
        Intrinsics.checkNotNullParameter(securityHubDeviceDialogMapper, "securityHubDeviceDialogMapper");
        Intrinsics.checkNotNullParameter(securityHubFeatureChecker, "securityHubFeatureChecker");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        Intrinsics.checkNotNullParameter(deviceInteractor, "deviceInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(countryTransactionLimitsInteractor, "countryTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(securityHubCardInteractor, "securityHubCardInteractor");
        Intrinsics.checkNotNullParameter(passcodeReminderPigeonRepository, "passcodeReminderPigeonRepository");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        Intrinsics.checkNotNullParameter(slotManagerChecklistDeeplinkParser, "slotManagerChecklistDeeplinkParser");
        Intrinsics.checkNotNullParameter(callSecurityPermissionBannerInteractor, "callSecurityPermissionBannerInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        Intrinsics.checkNotNullParameter(transactionsLimitsGlobalAccountsInteractor, "transactionsLimitsGlobalAccountsInteractor");
        Intrinsics.checkNotNullParameter(scaInteractor, "scaInteractor");
        Intrinsics.checkNotNullParameter(callSecurityInfoAvailabilityInteractor, "callSecurityInfoAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = inputData;
        this.f85643p = productCatalogueInteractor;
        this.f85644q = cardInteractor;
        this.f85645r = bottomExpandableDialogControllerExtension;
        this.f85646s = securityHubCardListDialogMapper;
        this.f85647t = securityHubDeviceDialogMapper;
        this.u = securityHubFeatureChecker;
        this.v = productArticleInteractor;
        this.f85648w = securityHubType;
        this.f85649x = deviceInteractor;
        this.f85650y = userInteractor;
        this.z = countryTransactionLimitsInteractor;
        this.A = slotManagerFeedControllerModelExtension;
        this.B = securityHubCardInteractor;
        this.C = passcodeReminderPigeonRepository;
        this.D = wealthProtectionInteractor;
        this.E = slotManagerChecklistDeeplinkParser;
        this.F = callSecurityPermissionBannerInteractor;
        this.G = workflowFlowDestinationProvider;
        this.H = transactionsLimitsGlobalAccountsInteractor;
        this.I = scaInteractor;
        this.J = userCompanyInteractor;
        f0 f0Var = f0.f322471a;
        boolean zD = callSecurityInfoAvailabilityInteractor.d();
        jte.d dVar = (jte.d) featureToggleInteractor;
        boolean zC = dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c);
        boolean zC2 = dVar.c(HiddenAccountsApi$Toggles$SecretAccounts.f74645c);
        this.K = mra.d.b(this, new i(false, false, l.f249085a, f0Var, false, null, null, null, false, n0.f299889a, null, true, zD, zC, zC2, null), stateMapper, null, false, 12);
        this.L = hx7.e.a(this, new jnf.d(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum I2(com.revolut.feature.security_hub.impl.ui.security_hub.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof jvc.e0
            if (r0 == 0) goto L13
            r0 = r5
            jvc.e0 r0 = (jvc.e0) r0
            int r1 = r0.f178820w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178820w = r1
            goto L18
        L13:
            jvc.e0 r0 = new jvc.e0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178820w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r4 = r4.f85650y
            r5 = 0
            efm.d0 r4 = r4.f(r5)
            r0.f178820w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            com.revolut.feature.address.models.Address r4 = r5.k
            r5 = 0
            if (r4 == 0) goto L4e
            wi0.b r4 = nz8.d.g(r4)
            goto L4f
        L4e:
            r4 = r5
        L4f:
            boolean r0 = com.bumptech.glide.d.u(r4)
            if (r0 == 0) goto L58
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r4 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.TRANSACTION_MX_LIMIT_INTRO
            return r4
        L58:
            boolean r0 = com.bumptech.glide.d.v(r4)
            if (r0 == 0) goto L61
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r4 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.TRANSACTION_LIMIT_INTRO
            return r4
        L61:
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.I0
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r0)
            if (r4 == 0) goto L71
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r4 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.TRANSACTION_HU_LIMIT_INTRO
            return r4
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.security_hub.c.I2(com.revolut.feature.security_hub.impl.ui.security_hub.c, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.security_hub.impl.ui.security_hub.c r4, com.revolut.feature.product_article.api.models.ProductArticleKey r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jvc.h0
            if (r0 == 0) goto L13
            r0 = r6
            jvc.h0 r0 = (jvc.h0) r0
            int r1 = r0.f178823w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178823w = r1
            goto L18
        L13:
            jvc.h0 r0 = new jvc.h0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178823w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            zja.a r4 = r4.v
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = rwc.d.a(r5)
            r0.f178823w = r3
            kka.h r4 = (kka.h) r4
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r6 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r4.e(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.security_hub.c.J2(com.revolut.feature.security_hub.impl.ui.security_hub.c, com.revolut.feature.product_article.api.models.ProductArticleKey, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Flow gVar;
        t1j.b bVar = this.H;
        q qVar = (q) bVar.f267380b;
        Continuation continuation = null;
        if (qVar.E()) {
            q qVar2 = (q) bVar.f267380b;
            do3.f fVar = do3.f.BANKING;
            gVar = new o(yh5.b.d(q.m0(qVar2, fVar, null, 6), q.k0(qVar, fVar)), 20);
        } else {
            gVar = new g(n0.f299889a, 2);
        }
        yji.l.a1(this, gVar, null, null, new g0(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(hng.g.b(((ang.b) this.J).f7765a)), null, null, new g0(this, continuation, 1), 3);
        yji.l.a1(this, ((gld.f0) this.A).f144638l.e(), null, null, new a(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.L;
    }

    public final void K2() {
        List cards = ((i) ((j2) this.K.f22677a).getValue()).d;
        if (ue0.e.n(cards)) {
            throw new IllegalStateException("Cards shouldn't be null or empty");
        }
        if (cards.size() == 1) {
            C2(L2(((h93.f0) zhm.d0.b0(cards)).f150110a));
            return;
        }
        kye.e eVar = this.f85646s;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(cards, "cards");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.security_hub_lost_card_dialog_title, null, null, 14), null, null, 30);
        List<h93.f0> list = cards;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (h93.f0 f0Var : list) {
            xtc.c cVar = (xtc.c) eVar.f190729b;
            xtc.b bVar = xtc.c.Companion;
            arrayList.add(cVar.a(f0Var, true, null));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp32, 0, 0, 29);
        this.f85645r.x(new rp0.y(arrayList, tVar, null, null, null, null, 1020));
    }

    public final jvc.q L2(String str) {
        Object next;
        Iterator it8 = ((i) ((j2) this.K.f22677a).getValue()).d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h93.f0) next).f150110a, str)) {
                break;
            }
        }
        if (next != null) {
            return new jvc.q((h93.f0) next);
        }
        throw new IllegalArgumentException(p.a.p("Card with id ", str, " shouldn't be null").toString());
    }

    @Override // yji.l
    public final void T1(long j2) {
        a1 a1Var = (a1) this.D;
        a1Var.getClass();
        Continuation continuation = null;
        yji.l.b1(this, new v1(new y0(a1Var, null)), null, new g0(this, continuation, 5), 3);
        n2(new jvc.f0(this, continuation, 1), new whi.b(6));
        otc.b bVar = otc.b.RETAIL;
        otc.b bVar2 = this.f85648w;
        if (bVar2 == bVar) {
            f fVar = this.f85644q;
            yji.l.b1(this, rd0.e.b(kli.a.h(f.d(fVar, null, true, 5), ((x) fVar).y())), null, new g0(this, continuation, 3), 3);
        }
        yji.l.b1(this, rd0.e.b(this.f85649x.j0(true, true)), null, new g0(this, continuation, 4), 3);
        yji.l.a1(this, vkm.q.g(this.C.f262164b), null, null, new jkc.g(this, continuation, 21), 3);
        n2(new jvc.f0(this, continuation, 0), new whi.b(6));
        H2(this.K, new c0(this, 0));
        Intrinsics.checkNotNullParameter(bVar2, "<this>");
        if (bVar2 == bVar) {
            yji.l.b1(this, vkm.q.g(((zt2.e) this.F).f325057b), null, new g0(this, continuation, 2), 3);
        }
        if (bVar2 == otc.b.REVOLUT_X) {
            yji.l.b1(this, mo3.a.e(this.I.d(), new jul.c(6), new jul.c(7)), null, new g0(this, continuation, 6), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.K;
    }
}
