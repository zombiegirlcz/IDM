package com.revolut.feature.card_screen.impl.kompot.cards_list.screen;

import a07.p;
import a83.a0;
import a83.a1;
import a83.b0;
import a83.e0;
import a83.g0;
import a83.j0;
import a83.m0;
import a83.n;
import a83.n0;
import a83.o;
import a83.o0;
import a83.x;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import d73.u;
import efm.r;
import eub.i;
import g48.r0;
import grl.r2;
import ha3.k;
import i4b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import mii.l;
import n6e.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pi3.s;
import r10.q;
import rp0.z1;
import skm.p0;
import te0.w;
import te8.e;
import tki.d;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements d, x {

    @NotNull
    public static final e0 Companion = new e0();
    public final e A;
    public final k B;
    public final z1 C;
    public final b D;
    public final bm4.a E;
    public final l63.a F;
    public final i G;
    public final f H;
    public final yj2.d I;
    public final al4.b J;
    public final gte.a K;
    public final a1 L;
    public final qe7.a M;
    public final pf7.b N;
    public final pf7.a O;
    public final Object P;
    public final y Q;
    public final com.revolut.kompot.navigable.vc.modal.a R;
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f65472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mt8.d f65473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sh3.a f65474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f65475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xh9.a f65476t;
    public final ti9.h u;
    public final n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final di9.d f65477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sb7.b f65478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wsg.n f65479y;
    public final zf8.k z;

    public a(cli.n stateMapper, CardsListScreenContract$InputData inputData, l93.f cardsInteractor, u cardsScreenInteractor, mt8.d kycInteractor, sh3.a checkoutInteractor, r0 jointAccountsInteractor, xh9.a payLaterInteractor, ti9.h payLaterProductFeatureToggleInteractor, n domainStateMapper, di9.d payLaterToggleActionExtension, sb7.b homeNPSWidgetExtension, wsg.n walletInteractor, zf8.k juniorAccountInfoProvider, e juniorAccountInteractor, k cardsTypeInfoInteractor, z1 tipPopupDisplayer, b pocketSubaccountsProvider, bm4.a creditCardEntryPointUiInteractor, l63.a cardsContentInteractor, q revolutPayManagementInteractor, i revPointsOptInInteractor, f legalEntityContextProvider, yj2.d atmMapDataProvider, al4.b comboCardInteractor, gte.a featureToggleInteractor, a1 cardsListStateSnapshot, qe7.a incentiveExperimentInteractor, pf7.b incentiveRewardFreeCardNavigationProvider, pf7.a incentiveRewardCardOrderReimbursedNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(cardsScreenInteractor, "cardsScreenInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureToggleInteractor, "payLaterProductFeatureToggleInteractor");
        Intrinsics.checkNotNullParameter(domainStateMapper, "domainStateMapper");
        Intrinsics.checkNotNullParameter(payLaterToggleActionExtension, "payLaterToggleActionExtension");
        Intrinsics.checkNotNullParameter(homeNPSWidgetExtension, "homeNPSWidgetExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(cardsTypeInfoInteractor, "cardsTypeInfoInteractor");
        Intrinsics.checkNotNullParameter(tipPopupDisplayer, "tipPopupDisplayer");
        Intrinsics.checkNotNullParameter(pocketSubaccountsProvider, "pocketSubaccountsProvider");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiInteractor, "creditCardEntryPointUiInteractor");
        Intrinsics.checkNotNullParameter(cardsContentInteractor, "cardsContentInteractor");
        Intrinsics.checkNotNullParameter(revolutPayManagementInteractor, "revolutPayManagementInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(atmMapDataProvider, "atmMapDataProvider");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardsListStateSnapshot, "cardsListStateSnapshot");
        Intrinsics.checkNotNullParameter(incentiveExperimentInteractor, "incentiveExperimentInteractor");
        Intrinsics.checkNotNullParameter(incentiveRewardFreeCardNavigationProvider, "incentiveRewardFreeCardNavigationProvider");
        Intrinsics.checkNotNullParameter(incentiveRewardCardOrderReimbursedNavigationProvider, "incentiveRewardCardOrderReimbursedNavigationProvider");
        this.o = cardsInteractor;
        this.f65472p = cardsScreenInteractor;
        this.f65473q = kycInteractor;
        this.f65474r = checkoutInteractor;
        this.f65475s = jointAccountsInteractor;
        this.f65476t = payLaterInteractor;
        this.u = payLaterProductFeatureToggleInteractor;
        this.v = domainStateMapper;
        this.f65477w = payLaterToggleActionExtension;
        this.f65478x = homeNPSWidgetExtension;
        this.f65479y = walletInteractor;
        this.z = juniorAccountInfoProvider;
        this.A = juniorAccountInteractor;
        this.B = cardsTypeInfoInteractor;
        this.C = tipPopupDisplayer;
        this.D = pocketSubaccountsProvider;
        this.E = creditCardEntryPointUiInteractor;
        this.F = cardsContentInteractor;
        this.G = revPointsOptInInteractor;
        this.H = legalEntityContextProvider;
        this.I = atmMapDataProvider;
        this.J = comboCardInteractor;
        this.K = featureToggleInteractor;
        this.L = cardsListStateSnapshot;
        this.M = incentiveExperimentInteractor;
        this.N = incentiveRewardFreeCardNavigationProvider;
        this.O = incentiveRewardCardOrderReimbursedNavigationProvider;
        this.P = w.y0(new b0(this, 1));
        Data data = (Data) cardsListStateSnapshot.f2035a.get();
        this.Q = mra.d.b(this, new o(data == null ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), f0.f322471a, null, new Data(null, null, true, 3, null), inputData.f65470b, new Data(null, null, true, 3, null), revolutPayManagementInteractor.O(), new Data(null, null, true, 3, null), true, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.R = hx7.e.a(this, new a09.b(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof a83.t0
            if (r0 == 0) goto L13
            r0 = r13
            a83.t0 r0 = (a83.t0) r0
            int r1 = r0.f2086w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2086w = r1
            goto L18
        L13:
            a83.t0 r0 = new a83.t0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2086w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L3b
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            r0.f2086w = r3
            java.lang.Object r13 = r12.K2(r0)
            if (r13 != r1) goto L3b
            return r1
        L3b:
            java.util.List r13 = r12.J2()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r13, r1)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L50:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r13.next()
            h93.f0 r1 = (h93.f0) r1
            com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetContract$ExpiringCardItem r2 = new com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetContract$ExpiringCardItem
            java.lang.String r3 = r1.f150110a
            java.lang.String r4 = r1.u
            java.lang.String r5 = r1.f150111b
            java.lang.String r6 = r1.f150115j
            boolean r7 = r1.K()
            org.joda.time.LocalDate r8 = r1.f150120q
            if (r8 == 0) goto L7f
            java.util.Date r8 = r8.toDate()
            if (r8 == 0) goto L7f
            long r8 = r8.getTime()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
        L7d:
            r8 = r10
            goto L81
        L7f:
            r10 = 0
            goto L7d
        L81:
            b93.j r9 = r1.f150114h
            r10 = r9
            java.lang.String r9 = r10.f13640b
            b93.b r10 = r10.f13639a
            java.lang.String r10 = r10.f13615a
            java.lang.String r11 = r1.I
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r2)
            goto L50
        L93:
            com.revolut.kompot.navigable.vc.modal.a r12 = r12.R
            com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardsListScreenContract$ModalStep$ShowExpiringCardsBottomSheet r13 = new com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardsListScreenContract$ModalStep$ShowExpiringCardsBottomSheet
            r13.<init>(r0)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r12, r13, r0)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a.I2(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        L2();
        u uVar = this.f65472p;
        l lVar = (l) uVar.f.get("TOAST_TO_DISPLAY_ON_CARDS_LIST");
        if (lVar != null) {
            X1(lVar);
            uVar.f.clear();
        }
    }

    public final List J2() {
        List list = (List) ((o) ((j2) this.Q.f22677a).getValue()).f2064a.getContent();
        if (list == null) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            h93.f0 f0Var = ((f83.a) obj2).f132693a;
            if (!f0Var.f150112c && !pd.b.j(f0Var.f150121r) && (Intrinsics.f(f0Var.f150122s, Boolean.TRUE) || f0Var.K())) {
                if (f0Var.f150120q != null) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((f83.a) it8.next()).f132693a);
        }
        return d0.V0(d0.P0(arrayList2, new a83.f0(cim.b.g(cim.b.e()), 0)), 6);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a83.k0
            if (r0 == 0) goto L13
            r0 = r6
            a83.k0 r0 = (a83.k0) r0
            int r1 = r0.f2057w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2057w = r1
            goto L18
        L13:
            a83.k0 r0 = new a83.k0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2057w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            g48.r0 r6 = r5.f65475s
            akg.n r6 = r6.c()
            a07.p r2 = new a07.p
            r4 = 3
            r2.<init>(r6, r4)
            a83.j0 r6 = new a83.j0
            r4 = 0
            r6.<init>(r2, r4)
            r0.f2057w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            a07.l r0 = new a07.l
            r1 = 15
            r0.<init>(r6, r1)
            cli.y r6 = r5.Q
            r5.H2(r6, r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a.K2(gim.c):java.lang.Object");
    }

    public final void L2() {
        Continuation continuation = null;
        l2(new g0(this, continuation, 1), new yi5.b(26));
        qe7.a aVar = this.M;
        yji.l.a1(this, new t38.e(qe7.a.b(aVar), 24, qe7.a.a(aVar), new o0(3, 0, continuation)), null, null, new n0(this, continuation, 6), 3);
        akg.n nVarV = nim.a.v(this.u.f(r2.PAY_LATER_SWITCH), new a82.l(7));
        od0.i.Companion.getClass();
        yji.l.a1(this, xam.a.h(new m0((Continuation) null, this), nVarV), null, null, new n0(this, continuation, 7), 3);
        r rVarA = ((d73.l) this.F).a("retail_disposable", ((o) ((j2) this.Q.f22677a).getValue()).f2067g);
        r rVarA2 = this.f65473q.a(false);
        List listC = zhm.u.c(s.CARD);
        sh3.a aVar2 = this.f65474r;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        r rVarC = sh3.a.c(aVar2, listC, personal, null, 4);
        r0 r0Var = this.f65475s;
        j0 j0Var = new j0(new p(r0Var.c(), 4), 1);
        g gVar = g.f186406a;
        r rVarFlatMap = rd0.e.c(j0Var, gVar).distinctUntilChanged().flatMap(new a6b.a(new a08.o(this, listC, 17), 16));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r rVarDistinctUntilChanged = nim.a.w(kli.a.h(rVarC, rVarFlatMap), new a82.l(4)).map(new a6b.a(new a82.l(5), 17)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarB = xh9.a.b(this.f65476t);
        wsg.n nVar = this.f65479y;
        w4l.h hVar = w4l.h.f294642c;
        r rVarR = pd.b.r(osg.b.g(nVar, hVar, null, null, null, null, null, personal, 62), new a0(this, 0));
        f0 f0Var = f0.f322471a;
        r rVarStartWith = rVarR.startWith(new Data(f0Var, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r rVarFlatMap2 = rd0.e.c(new j0(new p(r0Var.c(), 4), 1), gVar).flatMap(new a6b.a(new a0(this, 1), 18));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "flatMap(...)");
        r rVarStartWith2 = pd.b.r(rVarFlatMap2, new a0(this, 4)).startWith(new Data(f0Var, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith2, "startWith(...)");
        r rVarDistinctUntilChanged2 = nim.a.w(kli.a.h(rVarStartWith, rVarStartWith2), new a82.l(2)).map(new a6b.a(new a82.l(3), 15)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        wkm.l lVarE = this.z.e();
        kotlinx.coroutines.d dVar = p0.f264003c;
        r rVarC2 = rd0.e.c(lVarE, dVar);
        r rVarC3 = ((jte.d) this.K).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c) ? rd0.e.c(e.b(this.A, hVar), dVar) : c.j(zhm.r0.g());
        r rVarX = this.B.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = w.r(rVarA, rVarA2, rVarDistinctUntilChanged, rVarB, rVarDistinctUntilChanged2, rVarC2, rVarC3, rVarX).map(new a6b.a(new a0(this, 3), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.a1(this, new a3i.i(rd0.e.b(map), this, 3), null, null, new n0(this, continuation, 8), 3);
        yji.l.a1(this, ((cc7.h) this.f65478x).Z2(zb7.f.CARDS), null, null, new n0(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(rd0.e.c(((ha3.x) this.o).f.s(false), gVar)), null, null, new n0(this, continuation, 1), 3);
        it4.b bVar = (it4.b) this.E;
        yji.l.a1(this, boh.f.e(((om4.b) bVar.f168341b).e(r2.CARDS_LIST), new it4.a(bVar, 1)), null, null, new n0(this, continuation, 2), 3);
        yji.l.a1(this, rd0.e.b(((nyb.o) this.G).f(false)), null, null, new n0(this, continuation, 3), 3);
        yji.l.a1(this, this.H.j(new md6.i(md6.h.DEBIT_CARD)), null, null, new n0(this, continuation, 4), 3);
        yji.l.a1(this, (StateFlow) this.I.f.getValue(), null, null, new n0(this, continuation, 5), 3);
        yji.l.a1(this, ((om4.f) this.J).b(), null, null, new m0(this, (Continuation) null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.Q;
    }
}
