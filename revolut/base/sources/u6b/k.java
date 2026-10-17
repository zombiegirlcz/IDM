package u6b;

import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlowContract$FlowState;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.payments.money_request.api.MoneyRequestApi$Toggles;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedAccountCouldNotBeLinkedOrCreated;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.tracking.v3.CryptoAssetDetailsContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.g0;
import nii.y0;
import org.joda.time.DateTime;
import org.joda.time.Period;
import qee.s;
import qua.p;
import qua.u;
import til.n;
import til.o;
import til.r;
import u83.j;
import ud3.e0;
import vkm.j2;
import vq5.w;
import yhm.m;
import yua.q;
import zh9.u0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f277536b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f277535a = i;
        this.f277536b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        Object next;
        pd5.j jVar;
        Object next2;
        ibd.f fVar;
        int i = this.f277535a;
        od0.i iVarA = od0.i.f224256b;
        int i2 = 14;
        int i3 = 10;
        int i5 = 4;
        boolean z = false;
        int i6 = 1;
        Continuation continuation = null;
        Object obj3 = this.f277536b;
        switch (i) {
            case 0:
                l lVar = (l) obj3;
                y yVar = lVar.f277539r;
                Throwable t2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(t2, "t");
                int i21 = 22;
                if (t2 instanceof CobrandedAccountCouldNotBeLinkedOrCreated) {
                    lVar.H2(yVar, new u4e.i(i2));
                    lVar.H2(yVar, new rk.b(null == true ? 1 : 0, i21));
                    z = true;
                } else {
                    lVar.H2(yVar, new rk.b(null == true ? 1 : 0, i21));
                }
                return Boolean.valueOf(z);
            case 1:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return nkm.y.J(nkm.y.n(nkm.y.x(d0.Q(config.M), new u4e.i(17)), new u69.g(config, (u6e.a) obj3, i6)));
            case 2:
                ((nzl.a) ((u6k.c) obj3).f).a(((k71.i) obj2).a());
                return Unit.f186387a;
            case 3:
                u6k.h hVar = (u6k.h) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        list = (List) content;
                        if (!((jte.d) hVar.d).c(MoneyRequestApi$Toggles.IsraelMoneyRequestBeneficiary.f79587c)) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : list) {
                                MoneyRequest moneyRequest = (MoneyRequest) obj4;
                                if (!(moneyRequest.f60320l instanceof MoneyRequestCounterParty.BankBeneficiary) && !(moneyRequest.k instanceof MoneyRequestCounterParty.BankBeneficiary) && !(moneyRequest.f60321m instanceof MoneyRequestCounterParty.BankBeneficiary)) {
                                    arrayList.add(obj4);
                                }
                            }
                            list = arrayList;
                        }
                    } else {
                        list = null;
                    }
                    return new Data(list, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 4:
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) obj3;
                dii.g it8 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof dii.e) {
                    w7k.b bVar2 = bVar.o;
                    Object content2 = ((u7k.a) ((j2) bVar.v.f22677a).getValue()).f277943a.getContent();
                    if (content2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    TransferLinkDetails.Active linkDetails = ((u7k.b) content2).f277945a;
                    tyl.a onFinish = new tyl.a(bVar, 9);
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(linkDetails, "linkDetails");
                    Intrinsics.checkNotNullParameter(onFinish, "onFinish");
                    bVar2.T2(new w(bVar2, linkDetails, onFinish, null, 22), new yi5.b(27));
                }
                return Unit.f186387a;
            case 5:
                u82.d update = (u82.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return u82.d.a(update, null, null, ((u82.d) ((j2) ((u82.m) obj3).v.f22677a).getValue()).f278081c + 1, 3);
            case 6:
                return u82.d.a((u82.d) obj2, (t82.a) obj3, null, 0, 6);
            case 7:
                return u82.d.a((u82.d) obj2, null, (u82.e) obj3, 0, 5);
            case 8:
                u83.g gVar = (u83.g) obj3;
                com.revolut.kompot.common.flow.permissions.a output = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, a.C0596a.f98352a)) {
                    gVar.n2(new u83.f(gVar, null, null == true ? 1 : 0), new whi.b(6));
                } else {
                    gVar.C2(j.a.f278104a);
                }
                return Unit.f186387a;
            case 9:
                com.revolut.feature.devicemanagement.impl.ui.flow.b bVar3 = (com.revolut.feature.devicemanagement.impl.ui.flow.b) obj3;
                s86.h output2 = (s86.h) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3.H2(bVar3.f71942s, new k(output2, i3));
                UserDevice userDevice = output2.f260906a;
                bVar3.I2(userDevice.f71921m ? new h86.e(false) : new h86.d(userDevice));
                return Unit.f186387a;
            case 10:
                DeviceManagementFlowContract$FlowState update2 = (DeviceManagementFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ((s86.h) obj3).getClass();
                update2.getClass();
                return new DeviceManagementFlowContract$FlowState("DEVICE_ACTIONS_LOGOUT_LIST_ID");
            case 11:
                u8e.j jVar2 = (u8e.j) obj3;
                p recurringPayment = (p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                return !u.h(recurringPayment, ((l80.f) jVar2.f278192l).k()) ? new pfm.h(((q) jVar2.f278194n).f(recurringPayment.f249314a.f160150a), 4) : pfm.m.f235744a;
            case 12:
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                pd5.d dVar = (pd5.d) pair.f186385a;
                xi0.b bVar4 = (xi0.b) pair.f186386b;
                Iterator it9 = dVar.f235097c.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((pd5.g) next).f235102a.equals(((u8j.b) ((j2) aVar.M.f22677a).getValue()).f278224b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                pd5.g gVar2 = (pd5.g) next;
                return Boolean.valueOf(Intrinsics.f((gVar2 == null || (jVar = gVar2.f235106h) == null) ? null : jVar.f235111a, bVar4));
            case 13:
                AnalyticsContext.INSTANCE.getClass();
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AnalyticsContext(AnalyticsContext.Companion.a((CryptoAssetDetailsContext) obj3)), null, null, 3670015);
            case 14:
                com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar = (com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c) obj3;
                r it10 = (r) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if ((it10 instanceof til.q) || (it10 instanceof n)) {
                    cVar.K2(ExchangeGlobalAccessOutput.FeatureAvailable.f78171a);
                } else {
                    boolean z3 = it10 instanceof o;
                    ExchangeGlobalAccessOutput.FeatureNotAvailable featureNotAvailable = ExchangeGlobalAccessOutput.FeatureNotAvailable.f78172a;
                    if (z3) {
                        cVar.K2(featureNotAvailable);
                    } else {
                        if (!(it10 instanceof til.p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            throw new IllegalStateException(("Unexpected RedirectStep in MCY activation workflow: " + ((til.p) it10).f271584a).toString());
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th11) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            Throwable thA = yhm.m.a(yhm.o.a(th11));
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            cVar.K2(featureNotAvailable);
                        }
                    }
                }
                return Unit.f186387a;
            case 15:
                ua2.d update3 = (ua2.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ua2.d.a(update3, null, null, ((ua2.l) ((ua2.n) obj3)).f278526a, 3);
            case 16:
                ua7.f fVar2 = (ua7.f) obj3;
                dii.g gVar3 = (dii.g) obj2;
                if ((gVar3 instanceof dii.c) && Intrinsics.f(((dii.c) gVar3).f115066a.f275445a, "HIDDEN_ACCOUNTS_FROM_VIEW_CLICK_ID")) {
                    fVar2.A2(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.HiddenAccountsAndTransactions.f85375a, false, (String) null, true, 22));
                }
                return Unit.f186387a;
            case 17:
                uag.e update4 = (uag.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return uag.e.a(update4, ((TravelHotelsHomeFlowContract$PagerItem) obj3).getF94249a(), null, 5);
            case 18:
                com.revolut.feature.apm.payto.impl.screen.topup.flow.b bVar5 = (com.revolut.feature.apm.payto.impl.screen.topup.flow.b) obj3;
                vb2.f result = (vb2.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar5.l2(new com.revolut.feature.apm.payto.impl.screen.topup.flow.a(bVar5, result, null), new yi5.b(26));
                return Unit.f186387a;
            case 19:
                jt0.b bVar6 = (jt0.b) obj3;
                nb8.b allowance = (nb8.b) obj2;
                Intrinsics.checkNotNullParameter(allowance, "allowance");
                String str = allowance.i.f214012a;
                return nim.a.v(u0.m(hj8.a.a((hj8.a) bVar6.f178265b, str, w4l.h.f294642c), rd0.e.b(((ao.h) bVar6.f178266c).m(str, false))), new k(allowance, 20));
            case 20:
                nb8.b bVar7 = (nb8.b) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                JuniorBankingProfile profile = (JuniorBankingProfile) pair2.f186385a;
                Iterator it11 = ((List) pair2.f186386b).iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next2 = it11.next();
                        if (Intrinsics.f(((vd8.a) next2).f287813a, bVar7.f214010h.f214014b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 == null) {
                    throw new IllegalArgumentException("Could not find coparent by originator.guardianId");
                }
                vd8.a coparent = (vd8.a) next2;
                Intrinsics.checkNotNullParameter(bVar7, "<this>");
                Intrinsics.checkNotNullParameter(profile, "profile");
                Intrinsics.checkNotNullParameter(coparent, "coparent");
                String str2 = bVar7.f214006a;
                ibd.h hVar2 = ibd.h.YOUTH_ALLOWANCE;
                DateTime dateTime = new DateTime(bVar7.d.toEpochMilli());
                nb8.e eVar = bVar7.e;
                ibd.e eVar2 = new ibd.e(str2, eVar != null ? Period.parse(eVar.name()) : null, hVar2, dateTime, jli.b.i(bVar7.f), jli.b.i(bVar7.f214009g), Boolean.TRUE, null, null, null, null, 1920);
                String strT = ta6.a.t(profile);
                int i22 = vb8.a.d[bVar7.f214007b.ordinal()];
                if (i22 == 1) {
                    fVar = ibd.f.ACTIVE;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = ibd.f.INACTIVE;
                }
                ibd.f fVar3 = fVar;
                dj0.d dVar2 = bVar7.f214011j;
                long j2 = dVar2.f115082a;
                String str3 = dVar2.f115083b.f306286a;
                String str4 = bVar7.i.f214012a;
                xi0.b.Companion.getClass();
                xi0.b bVar8 = xi0.b.f306271c;
                ibd.b bVar9 = ibd.b.UNKNOWN;
                return new p(eVar2, fVar3, str4, null, null, null, null, str3, str3, Long.valueOf(j2), strT, null, null, null, null, null, null, null, new vua.a(profile.f77103j, profile.f77099b, profile.f77100c, null, profile.f77102h, profile.f77101g), null, null, null, null, null, null, null, new ibd.a(str4, bVar8, bVar9), null, null, null, null, new ibd.a(bVar7.f214010h.f214013a, bVar8, bVar9), null, 0, null, null, null, null, new qua.o(coparent.f287813a, ngm.n.n(coparent)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2080110712, 33554367);
            case 21:
                ubh.a aVar2 = (ubh.a) obj3;
                od0.i it12 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Set set = (Set) it12.f224257a;
                return set == null ? l1h.a.b(((jte.d) aVar2.f278897b).c(FeatureWealthApi$Toggles.CommoditiesMoveMoney.f95156c), true, true) : set;
            case 22:
                tbi.a aVar3 = (tbi.a) obj3;
                ubi.f fVar4 = (ubi.f) obj2;
                od0.i iVar = fVar4.f278902b;
                if (iVar.d() && iVar.c() == aVar3) {
                    od0.i.Companion.getClass();
                } else {
                    od0.i.Companion.getClass();
                    iVarA = od0.h.a(aVar3);
                }
                return ubi.f.a(fVar4, null, iVarA, 1);
            case 23:
                s sVar = (s) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                Lazy lazy = rbi.a.f253115a;
                List listA = rbi.a.a(((OccupationChooserScreenContract$InputData) sVar.f245144b).f97702a);
                od0.i.Companion.getClass();
                return new ubi.h(sVar.b(), sVar.a(), ubi.i.a(listA, iVarA, true), false);
            case 24:
                uc6.a aVar4 = (uc6.a) obj3;
                wi0.b countryCode = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                wi0.b.Companion.getClass();
                if (!Intrinsics.f(countryCode, wi0.b.J2)) {
                    return aVar4.f278999b.getString(R$string.donations_onboarding_assistant_second_subtitle);
                }
                StringBuilder sb6 = new StringBuilder();
                t70.g gVar4 = aVar4.f278999b;
                sb6.append(gVar4.getString(R$string.donations_onboarding_assistant_second_subtitle));
                m70.a.t(t0.f186434a);
                sb6.append(" ");
                sb6.append(gVar4.i(R$string.donations_onboarding_screen_note, gVar4.getString(R$string.donations_terms_title)));
                return sb6.toString();
            case 25:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) ((ucd.b) obj3).f279030b.get("SAVING_ACCOUNT_REQUESTS_KEY");
            case 26:
                com.revolut.feature_retail_user_declarations.transaction_countries.flow.a aVar5 = (com.revolut.feature_retail_user_declarations.transaction_countries.flow.a) obj3;
                qci.f outputData = (qci.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof qci.d) {
                    aVar5.l2(new u2i.g(aVar5, ((qci.d) outputData).f244793a, continuation, i3), new yi5.b(26));
                } else {
                    int i32 = 26;
                    if (!Intrinsics.f(outputData, qci.e.f244794a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.l2(new u83.f(aVar5, continuation, i5), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 27:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (pck.g) ((uck.f) obj3).f279051b.get("PLAN_REFERRALS_CAMPAIGN_INFO");
            case 28:
                ud2.q qVar = (ud2.q) obj3;
                zz1.e eVar3 = (zz1.e) obj2;
                int i33 = eVar3 == null ? -1 : ud2.p.f279082a[eVar3.ordinal()];
                if (i33 == -1) {
                    ud2.q.I2(qVar);
                } else if (i33 == 1 || i33 == 2) {
                    v02.c cVar2 = qVar.f279085r;
                    TextLocalisedClause textLocalisedClauseJ = ApmSpin.f61827c.e();
                    ((j12.d) cVar2).getClass();
                    yji.l.a1(qVar, qVar.X1(new y0("ID_DIALOG_PENDING_DECLINE", new g0(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_decline_claim_dialog_pending_title, zhm.u.c(textLocalisedClauseJ), null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_decline_claim_dialog_pending_subtitle, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_decline_claim_dialog_pending_action, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 4)), null, null, new ud2.l(qVar, null, 1), 3);
                } else if (i33 != 3) {
                    if (i33 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ud2.q.I2(qVar);
                } else {
                    qVar.X1(new mii.f("TOAST_ID_DECLINE", new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_deregister_request_decline_success, null, null, 14), null, null, null, null, 124));
                    qVar.C2(ud2.h.f279077a);
                }
                return Unit.f186387a;
            default:
                e0 e0Var = (e0) obj3;
                CashbackBySources cashbackBySources = (CashbackBySources) obj2;
                Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                ArrayList arrayListA = cashbackBySources.a();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListA, 10));
                Iterator it13 = arrayListA.iterator();
                while (it13.hasNext()) {
                    arrayList2.add(((CashbackSource) it13.next()).f65689b);
                }
                if (!arrayList2.isEmpty()) {
                    return whf.b.a(e0Var.f279100x, e0Var.f279099w.a(arrayList2), null, 4, null, 10);
                }
                f0 f0Var = f0.f322471a;
                k71.q.Companion.getClass();
                efm.r rVarJust = efm.r.just(zi0.c.P(new whf.p(f0Var, k71.p.a(), new ud3.p()), false, null, 3));
                Intrinsics.h(rVarJust);
                return rVarJust;
        }
    }

    public /* synthetic */ k(ubi.l lVar, tbi.a aVar) {
        this.f277535a = 22;
        this.f277536b = aVar;
    }
}
