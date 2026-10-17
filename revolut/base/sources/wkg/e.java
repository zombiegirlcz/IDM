package wkg;

import com.revolut.feature.apm.bills.boleto.impl.finder.hidden.HiddenBoletosScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.perks.list.FreelancerPerksListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.home.InsuranceCarHomeScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreen;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreen;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillSplitsResult;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.profile.impl.ui.profile.screens.general_settings.GeneralSettingsScreen;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelController;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreen;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerController;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import lzi.q;
import lzi.r;
import lzi.s;
import lzi.u;
import vkm.j2;
import wim.z;
import wol.t;
import wp9.v;
import wp9.x;
import wuk.y;
import wxh.j;
import wxh.l;
import yhm.o;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((f) this.v, continuation, 0);
            case 1:
                return new e((PlanBenefitsScreen) this.v, continuation, 1);
            case 2:
                return new e((LinkedAccountConsentDetailsScreen) this.v, continuation, 2);
            case 3:
                return new e((HiddenBoletosScreen) this.v, continuation, 3);
            case 4:
                return new e((PayeesOverviewScreen) this.v, continuation, 4);
            case 5:
                return new e((InsuranceCarHomeScreen) this.v, continuation, 5);
            case 6:
                return new e((GeneralSettingsScreen) this.v, continuation, 6);
            case 7:
                return new e((TemplatesScreen) this.v, continuation, 7);
            case 8:
                return new e((BankAccountSwitchingRequestStatusScreen) this.v, continuation, 8);
            case 9:
                return new e((WaitlistInvitationScreen) this.v, continuation, 9);
            case 10:
                return new e((QrDisplayerController) this.v, continuation, 10);
            case 11:
                return new e((com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) this.v, continuation, 11);
            case 12:
                return new e((wpj.e) this.v, continuation, 12);
            case 13:
                return new e((DocumentsScreen) this.v, continuation, 13);
            case 14:
                return new e((ProductClosuresScreen) this.v, continuation, 14);
            case 15:
                return new e((AccountClosureProgressScreen) this.v, continuation, 15);
            case 16:
                return new e((BondDetailsController) this.v, continuation, 16);
            case 17:
                return new e((ShowCardPinScreen) this.v, continuation, 17);
            case 18:
                return new e((wvd.b) this.v, continuation, 18);
            case 19:
                return new e((wvl.d) this.v, continuation, 19);
            case 20:
                return new e((AirportSearchScreen) this.v, continuation, 20);
            case 21:
                return new e((j) this.v, continuation, 21);
            case 22:
                return new e((ReferralsTroubleshooterTopLevelController) this.v, continuation, 22);
            case 23:
                return new e((com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) this.v, continuation, 23);
            case 24:
                return new e((wyk.b) this.v, continuation, 24);
            case 25:
                return new e((FreelancerPerksListScreen) this.v, continuation, 25);
            case 26:
                return new e((RevPointsExpiryHomeScreen) this.v, continuation, 26);
            case 27:
                return new e((com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) this.v, continuation, 27);
            case 28:
                return new e((x0d.b) this.v, continuation, 28);
            default:
                return new e((x0d.e) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        Object next;
        u sVar;
        int i = this.u;
        Object obj4 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) obj4).v2(new c(true));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PlanBenefitsScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a) ((LinkedAccountConsentDetailsScreen) obj4).e3()).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((wm1.h) ((wm1.d) ((HiddenBoletosScreen) obj4).M.getValue())).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.payees.impl.ui.payees_overview.personal.a) ((PayeesOverviewScreen) obj4).d()).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((InsuranceCarHomeScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((GeneralSettingsScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TemplatesScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((BankAccountSwitchingRequestStatusScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) ((WaitlistInvitationScreen) obj4).d()).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((t) ((QrDisplayerController) obj4).R.getValue()).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) obj4;
                yp9.e eVar = cVar.o;
                v domainState = (v) ((j2) cVar.z.f22677a).getValue();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                String str = eVar.f315802c.f115083b.f306286a;
                SplitMembersType splitMembersType = domainState.d;
                x xVar = domainState.f299205g;
                List f79224b = splitMembersType.getF79224b();
                int iB = q0.b(w.t(f79224b, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj5 : f79224b) {
                    linkedHashMap.put(((SplitMemberType) obj5).O7(), obj5);
                }
                List<SplitBillItem> list = xVar.f299207a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (SplitBillItem splitBillItem : list) {
                    Set<String> set = splitBillItem.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : set) {
                        SplitMemberType splitMemberType = (SplitMemberType) linkedHashMap.get(str2);
                        if (splitMemberType == null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown member id: ", str2));
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                            splitMemberType = null;
                        }
                        if (splitMemberType != null) {
                            arrayList2.add(splitMemberType);
                        }
                    }
                    String str3 = splitBillItem.f79226b;
                    yp9.e eVar2 = eVar;
                    long j2 = splitBillItem.f79227c;
                    boolean zIsEmpty = arrayList2.isEmpty();
                    List listC = arrayList2;
                    if (zIsEmpty) {
                        SplitMembersType splitMembersType2 = domainState.d;
                        if (splitMembersType2 instanceof SplitMembersType.Group) {
                            obj3 = ((SplitMembersType.Group) splitMembersType2).f79221a;
                        } else {
                            if (!(splitMembersType2 instanceof SplitMembersType.Split)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj3 = ((SplitMembersType.Split) splitMembersType2).f79223a;
                        }
                        listC = zhm.u.c(obj3);
                    }
                    arrayList.add(new SplitLineItem(str3, j2, str, listC));
                    eVar = eVar2;
                }
                BillType billType = (BillType) d0.d0(eVar.f315801b);
                if (billType == null) {
                    throw new IllegalStateException("There must be one bill");
                }
                cVar.C2(new bp9.f(r0.t(zhm.u.c(new Pair(billType, new BillSplitsResult.Itemized(new ItemizedBillData(arrayList, xVar.f299208b))))), splitMembersType.u2()));
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xpj.a aVar14 = (xpj.a) j6.a.k(xpj.a.class, ((wpj.e) obj4).f299349c, "budget_suggestion_config");
                if (aVar14 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar14, "<this>");
                List<xpj.b> percentageBands = aVar14.getPercentageBands();
                ArrayList arrayList3 = new ArrayList();
                for (xpj.b bVar : percentageBands) {
                    String id10 = bVar.getId();
                    Iterator<E> it8 = lzi.v.a().iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((lzi.v) next).b(), id10)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    lzi.v vVar = (lzi.v) next;
                    if (vVar == null) {
                        sVar = null;
                    } else if (bVar.getMinPercentage() == null && bVar.getMaxPercentage() != null) {
                        sVar = new lzi.t(vVar, bVar.getMaxPercentage().intValue());
                    } else if (bVar.getMinPercentage() == null || bVar.getMaxPercentage() == null) {
                        if (bVar.getMinPercentage() == null) {
                            throw new IllegalStateException(a10.b.s("Percentage band ", bVar.getId(), " has no boundaries"));
                        }
                        sVar = new s(vVar, bVar.getMinPercentage().intValue());
                    } else {
                        sVar = new r(vVar, bVar.getMinPercentage().intValue(), bVar.getMaxPercentage().intValue());
                    }
                    if (sVar != null) {
                        arrayList3.add(sVar);
                    }
                }
                return new q(arrayList3);
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((DocumentsScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.workflow.engine.product_closures.screen.a) ((wth.i) ((ProductClosuresScreen) obj4).Q.getValue())).C2(wth.f.f299987a);
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((wug.j) ((wug.e) ((AccountClosureProgressScreen) obj4).P.getValue())).B2();
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y) ((wuk.h) ((BondDetailsController) obj4).O.getValue())).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ShowCardPinScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return p.a.j(vvd.c.class, KTypeProjection.INSTANCE, List.class, ((wvd.b) obj4).f300312a, "AUTO_STAKING_STORAGE_KEY");
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((wvl.d) obj4).d.Z2();
                return Unit.f186387a;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((AirportSearchScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) obj4).r2().M0(l.f300996b);
                return Unit.f186387a;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a) ((ReferralsTroubleshooterTopLevelController) obj4).d()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar26 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) obj4;
                aVar26.J2();
                if (((wyg.a) ((j2) aVar26.f95110w.f22677a).getValue()).d) {
                    aVar26.I2();
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((wyk.b) obj4).f301306r);
                return Unit.f186387a;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((FreelancerPerksListScreen) obj4).R2().B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) ((RevPointsExpiryHomeScreen) obj4).d()).B2();
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) obj4).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return wp5.y.t(z0d.t.class, ((x0d.b) obj4).f301568c, "MEMORY_CACHE_KEY_SUPERVISION_CONFIG");
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xe0.e eVar3 = ((x0d.e) obj4).f301573c;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = o0.b(z0d.f.class);
                companion.getClass();
                return eVar3.T2("CACHE_KEY_GUARDIAN_INVITATIONS", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
        }
    }
}
