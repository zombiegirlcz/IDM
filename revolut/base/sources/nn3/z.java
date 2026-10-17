package nn3;

import android.content.Intent;
import android.os.Parcelable;
import aw0.o9;
import com.google.protobuf.f3;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationControllerContract$PhoneNumberRemovalAction;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditContract$State;
import com.revolut.feature.tax_residency.api.exemption.model.PartnerInformation;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import cp6.e;
import ie.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mm0.o;
import nnd.c1;
import nnd.i0;
import nnd.l0;
import nnd.m0;
import nnd.n0;
import nnd.p0;
import nnd.s0;
import nnd.v0;
import no.y2;
import org.jmrtd.lds.LDSFile;
import qp6.c;
import tof.a3;
import tof.hb;
import tof.i7;
import tof.y6;
import uo.b1;
import uo.c0;
import uo.e0;
import uo.g0;
import uo.u0;
import uo.w0;
import uo.x0;
import uo.z0;
import vkm.j2;
import yhm.m;
import zhm.d0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f217467b;

    public /* synthetic */ z(Object obj2, int i) {
        this.f217466a = i;
        this.f217467b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        nnd.l lVarB;
        nnd.k kVarK2;
        nnd.i iVar;
        nnd.k kVar;
        Object next;
        TaxExemptionAggregate taxExemptionAggregate;
        dj0.d dVar;
        Object objA;
        int i = this.f217466a;
        int i2 = 2;
        int i3 = 0;
        Object obj3 = this.f217467b;
        switch (i) {
            case 0:
                return c.a((c) obj2, null, null, null, null, null, false, false, (ContactsChooserBannerContent) obj3, 0, null, 130559);
            case 1:
                rnd.d it8 = (rnd.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new s0((AnalyticsAccount.Savings.JointIndividual) obj3, it8);
            case 2:
                rnd.a it9 = (rnd.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new n0((AnalyticsAccount.Savings.PersonalAll) obj3, it9);
            case 3:
                rnd.e it10 = (rnd.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new v0((AnalyticsAccount.Savings.JuniorSaving) obj3, it10);
            case 4:
                rnd.d it11 = (rnd.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new p0((AnalyticsAccount.Savings.PersonalIndividual) obj3, it11);
            case 5:
                AnalyticsAccount.Junior.All all2 = (AnalyticsAccount.Junior.All) obj3;
                List<sf8.m> it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                for (sf8.m mVar : it12) {
                    if (Intrinsics.f(mVar.f262361b, all2.f99184a)) {
                        return new m0(all2, mVar.a());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 6:
                rnd.a it13 = (rnd.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new l0((AnalyticsAccount.Savings.JointAll) obj3, it13);
            case 7:
                nnd.k kVar2 = (nnd.k) obj3;
                nnd.c update = (nnd.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = update.f217532a;
                nnd.a aVar = (nnd.a) data.getContent();
                return nnd.c.a(update, Data.copy$default(data, aVar != null ? nnd.a.a(aVar, kVar2) : null, null, false, 6, null), null, 2);
            case 8:
                i0 i0Var = (i0) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                AnalyticsAccountsSelection analyticsAccountsSelection = (AnalyticsAccountsSelection) rVar.f314202b;
                boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
                nnd.a aVar2 = (nnd.a) ((nnd.c) ((j2) i0Var.f217559x.f22677a).getValue()).f217532a.getContent();
                if (aVar2 == null || (kVar = aVar2.f217519b) == null || (lVarB = kVar.b()) == null) {
                    if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) {
                        lVarB = nnd.l.SPENDING;
                    } else {
                        AnalyticsAccount analyticsAccount = (AnalyticsAccount) d0.a0(analyticsAccountsSelection.getF99208a());
                        if (analyticsAccount instanceof AnalyticsAccount.Pro) {
                            lVarB = nnd.l.PRO;
                        } else if (analyticsAccount instanceof AnalyticsAccount.Savings) {
                            lVarB = nnd.l.SAVINGS;
                        } else {
                            if (!(analyticsAccount instanceof SpendingAnalyticsAccount)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lVarB = nnd.l.SPENDING;
                        }
                    }
                }
                ArrayList arrayListM2 = i0.M2(list, lVarB);
                rnd.i iVar2 = i0Var.f217557t;
                Set f99208a = analyticsAccountsSelection.getF99208a();
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListM2, 10));
                Iterator it14 = arrayListM2.iterator();
                while (it14.hasNext()) {
                    arrayList.add(((c1) it14.next()).a());
                }
                boolean z = iVar2.b(f99208a, arrayList).f255612a;
                if (zBooleanValue) {
                    kVarK2 = i0Var.K2(analyticsAccountsSelection, !(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) && z, lVarB, arrayListM2);
                } else {
                    boolean z3 = analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth;
                    if (z3) {
                        iVar = new nnd.i(analyticsAccountsSelection, false, nnd.l.SPENDING);
                    } else if (i0.L2(analyticsAccountsSelection.getF99208a(), z, arrayListM2)) {
                        iVar = new nnd.i(analyticsAccountsSelection, z && !z3, lVarB);
                    } else {
                        kVarK2 = i0Var.K2(analyticsAccountsSelection, z, lVarB, arrayListM2);
                    }
                    kVarK2 = iVar;
                }
                return new nnd.a(list, kVarK2);
            case 9:
                nne.b bVar = (nne.b) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                one.d dVar2 = (one.d) pair.f186385a;
                xme.f fVar = (xme.f) pair.f186386b;
                ArrayList<one.c> arrayList2 = dVar2.f226944a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (one.c cVar : arrayList2) {
                    bVar.getClass();
                    Iterator it15 = fVar.f307234b.f307221a.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            next = it15.next();
                            xme.c cVar2 = (xme.c) next;
                            if (Intrinsics.f(a0.d.r(cVar2.f307225a, cVar2.f307226b), cVar.f226941a + cVar.f226943c)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    xme.c cVar3 = (xme.c) next;
                    if (cVar3 != null) {
                        dj0.d dVar3 = cVar3.f;
                        dj0.d dVar4 = cVar3.e;
                        Intrinsics.checkNotNullParameter(cVar3, "<this>");
                        PartnerInformation partnerInformation = cVar3.d;
                        if (partnerInformation != null) {
                            dVar = cVar.f226942b.f226938b;
                            if (dVar == null) {
                                throw new IllegalStateException("shared limit can not be null");
                            }
                        } else {
                            dVar = cVar.f226942b.f226937a;
                        }
                        taxExemptionAggregate = new TaxExemptionAggregate(cVar.d, cVar3.f307226b, dVar4, dVar3, dVar, cVar3.f307227c, cVar3.f307228g, partnerInformation, cVar3.f307225a);
                    } else {
                        taxExemptionAggregate = new TaxExemptionAggregate(cVar.d, cVar.f226943c, new dj0.d(0L, cVar.f226942b.f226937a.f115083b), null, cVar.f226942b.f226937a, cVar.e, null, null, cVar.f226941a);
                    }
                    arrayList3.add(taxExemptionAggregate);
                }
                return arrayList3;
            case 10:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                mjf.u uVar = ((nnf.l) obj3).f217625r;
                String groupId = transaction.f272581b;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                xif.i iVar3 = uVar.f206034a;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                return iVar3.d.f(groupId, false);
            case 11:
                zel.h hVar = (zel.h) obj3;
                List performanceAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                List list2 = performanceAssets;
                int iB = q0.b(zhm.w.t(list2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj4 : list2) {
                    linkedHashMap.put(((vel.f) obj4).a(), obj4);
                }
                ArrayList<ScreenerInstrument> arrayList4 = hVar.f321803b;
                ArrayList arrayList5 = new ArrayList();
                for (ScreenerInstrument screenerInstrument : arrayList4) {
                    vel.f fVar2 = (vel.f) linkedHashMap.get(screenerInstrument.f105162a);
                    enh.a aVar3 = fVar2 == null ? null : new enh.a(fVar2, new nnh.b(screenerInstrument));
                    if (aVar3 != null) {
                        arrayList5.add(aVar3);
                    }
                }
                return arrayList5;
            case 12:
                nnj.k update2 = (nnj.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nnj.k.a(update2, null, null, ((InputChecklistDelegate.TextData) obj3).f52533b.toString(), null, null, null, 59);
            case 13:
                return nnk.c.a((nnk.c) obj2, zi0.c.P((PricingPlanTerms) obj3, false, null, 3), 2);
            case 14:
                c0 c0Var = (c0) obj3;
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                e0 e0Var = c0Var.f281464a;
                com.bumptech.glide.c.x(buildStruct, "exitReason", e0Var != null ? e0Var.a() : null);
                com.bumptech.glide.c.v(buildStruct, "exitStatus", Integer.valueOf(c0Var.f281465b));
                uo.n0 n0Var = c0Var.f281466c;
                com.bumptech.glide.c.x(buildStruct, "exitImportance", n0Var != null ? n0Var.a() : null);
                com.bumptech.glide.c.x(buildStruct, "description", c0Var.d);
                com.bumptech.glide.c.w(buildStruct, "timestamp", c0Var.e);
                com.bumptech.glide.c.x(buildStruct, "processStateSummary", c0Var.f);
                return Unit.f186387a;
            case 15:
                u0 u0Var = (u0) obj3;
                f3 buildStruct2 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct2, "$this$buildStruct");
                z0 z0Var = u0Var.f281512a;
                com.bumptech.glide.c.x(buildStruct2, "startType", z0Var != null ? z0Var.a() : null);
                b1 b1Var = u0Var.f281513b;
                com.bumptech.glide.c.x(buildStruct2, "startupState", b1Var != null ? b1Var.a() : null);
                w0 w0Var = u0Var.f281514c;
                com.bumptech.glide.c.x(buildStruct2, "startReason", w0Var != null ? w0Var.a() : null);
                g0 g0Var = u0Var.d;
                com.bumptech.glide.c.x(buildStruct2, "launchMode", g0Var != null ? g0Var.a() : null);
                com.bumptech.glide.c.t(buildStruct2, "wasForceStopped", Boolean.valueOf(u0Var.f));
                Intent intent = u0Var.f281515g;
                com.bumptech.glide.c.x(buildStruct2, "startIntent", intent != null ? intent.toString() : null);
                x0 x0Var = u0Var.e;
                com.bumptech.glide.c.w(buildStruct2, "timestamp_applicationOnCreate", x0Var.f281518a);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_bindApplication", x0Var.f281519b);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_firstFrame", x0Var.f281520c);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_fork", x0Var.d);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_fullyDrawn", x0Var.e);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_initialRenderThreadFrame", x0Var.f);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_launch", x0Var.f281521g);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_reservedRangeDeveloper", x0Var.f281522h);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_reservedRangeDeveloperStart", x0Var.i);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_reservedRangeSystem", x0Var.f281523j);
                com.bumptech.glide.c.w(buildStruct2, "timestamp_surfaceFlingerCompositionComplete", x0Var.k);
                return Unit.f186387a;
            case 16:
                gh0.g gVar = (gh0.g) obj3;
                f3 f3Var = (f3) obj2;
                com.bumptech.glide.c.x(f3Var, "service_code_name", gVar.f143811a.a());
                com.bumptech.glide.c.v(f3Var, "service_apk_version", Integer.valueOf(gVar.f143812b));
                com.bumptech.glide.c.t(f3Var, "is_service_updating", Boolean.valueOf(gVar.f143813c));
                com.bumptech.glide.c.t(f3Var, "is_store_updating", Boolean.valueOf(gVar.d));
                com.bumptech.glide.c.x(f3Var, "error_resolution", gVar.e.name());
                com.bumptech.glide.c.x(f3Var, "status_code", gVar.f);
                return Unit.f186387a;
            case 17:
                y2 y2Var = (y2) obj3;
                lx0.h diagnosticEvent = (lx0.h) obj2;
                Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (!(diagnosticEvent instanceof lx0.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.analytics.tracking.v3.d dVar5 = y2Var.f217879a;
                String resourceId = diagnosticEvent.f200514a;
                com.revolut.analytics.tracking.v3.f fVar3 = (com.revolut.analytics.tracking.v3.f) dVar5;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(resourceId, "resourceId");
                com.revolut.analytics.tracking.v3.f.g(fVar3, AnalyticsProduct.Shared.RevolutUIKit.f, null, null, new no.g0(resourceId, i3), 14);
                objA = Unit.f186387a;
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                return Unit.f186387a;
            case 18:
                no7.l lVar = (no7.l) obj3;
                po7.f result = (po7.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof po7.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar.x2(new no7.k(result, i3));
                return Unit.f186387a;
            case 19:
                LogoutConfirmationControllerContract$PhoneNumberRemovalAction phoneNumberRemovalAction = (LogoutConfirmationControllerContract$PhoneNumberRemovalAction) obj3;
                no8.f update3 = (no8.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                String juniorId = update3.f217948a;
                String juniorFirstName = update3.f217949b;
                String juniorPhoneNumber = update3.f217950c;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
                Intrinsics.checkNotNullParameter(juniorPhoneNumber, "juniorPhoneNumber");
                Intrinsics.checkNotNullParameter(phoneNumberRemovalAction, "phoneNumberRemovalAction");
                return new no8.f(juniorId, juniorFirstName, juniorPhoneNumber, phoneNumberRemovalAction);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((noc.o) obj3).a();
            case 21:
                IllegalStateException illegalStateException = (IllegalStateException) obj3;
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return noe.b.a((noe.b) obj2, new Data(null, illegalStateException, false, 5, null), null, null, null, 14);
            case 22:
                Set groupIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(groupIds, "groupIds");
                i7.c cVar4 = i7.Companion;
                y6[] y6VarArr = {y6.REFUND};
                cVar4.getClass();
                return ((nof.m) obj3).b(i7.c.a(i7.c.d(y6VarArr), new hb(groupIds))).map(new njf.c(new nnf.h(17), 23));
            case 23:
                com.revolut.retail.analytics.tracking.impl.b bVar2 = (com.revolut.retail.analytics.tracking.impl.b) obj3;
                mm0.o session = (mm0.o) obj2;
                Intrinsics.checkNotNullParameter(session, "session");
                ang.f fVar4 = bVar2.f;
                if (session instanceof o.a) {
                    efm.r rVarDefaultIfEmpty = new rfm.m(fVar4.d.c(), new b0(new noi.m(bVar2, i3), 16), i3).n().defaultIfEmpty(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
                    return rVarDefaultIfEmpty;
                }
                if (session instanceof mm0.n) {
                    efm.r rVarSwitchMap = m70.a.g(fVar4.k(false), null, new akg.d(29), 1).distinctUntilChanged(new b0(new jli.f(20), 17)).switchMap(new b0(new noi.m(bVar2, i2), 18));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    return rVarSwitchMap;
                }
                if (session instanceof mm0.p) {
                    efm.r rVarJust = efm.r.just(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                efm.r rVarJust2 = efm.r.just(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                return rVarJust2;
            case 24:
                CryptoWithdrawLimits cryptoWithdrawLimits = (CryptoWithdrawLimits) obj3;
                CryptoWithdrawLimits withdrawLimits = (CryptoWithdrawLimits) obj2;
                Intrinsics.checkNotNullParameter(withdrawLimits, "withdrawLimits");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.crypto_withdrawals_screen_limits_address_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(R$string.crypto_withdrawals_screen_limits_address_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ACCOUNT_LIMITS_LEARN_MORE_ID", false), 10))), null, 28);
                List listK = zhm.v.k(new CellDetailsDelegate.Model("list_id_daily_account_limit", new TextLocalisedClause(R$string.crypto_withdrawals_limits_daily, null, null, 14), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(oo5.b.c(cryptoWithdrawLimits.f71093b, true), oo5.b.c(cryptoWithdrawLimits.f71092a, true))), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("list_id_monthly_account_limit", new TextLocalisedClause(R$string.crypto_withdrawals_limits_monthly, null, null, 14), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(oo5.b.c(cryptoWithdrawLimits.d, true), oo5.b.c(cryptoWithdrawLimits.f71094c, true))), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("header_account_limit_id", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_limits_to_this_address_text, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                yp0.e0 e0Var2 = yp0.e0.INSIDE_BOX;
                return new rp0.y(d0.E0(yp0.b.g(zhm.v.k(new CellDetailsDelegate.Model("list_id_daily_withdraw_limit", new TextLocalisedClause(R$string.crypto_withdrawals_limits_daily, null, null, 14), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(oo5.b.c(withdrawLimits.f71093b, true), oo5.b.c(withdrawLimits.f71092a, true))), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("list_id_monthly_withdraw_limit", new TextLocalisedClause(R$string.crypto_withdrawals_limits_monthly, null, null, 14), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(oo5.b.c(withdrawLimits.d, true), oo5.b.c(withdrawLimits.f71094c, true))), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)), new ListSubheaderDelegate.Model("header_withdraw_limit_id", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_limits_to_all_addresses_text, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var2, 0, R$attr.uikit_dp24, 116), yp0.b.g(listK, model, e0Var2, 0, R$attr.uikit_dp8, 116)), tVar, rp0.l.WINDOW, null, null, null, "", null, null, null, 3832);
            case 25:
                np6.b bVar3 = (np6.b) obj3;
                qp6.c output = (qp6.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                OneClickFeedbackFlowContract$InputData oneClickFeedbackFlowContract$InputData = bVar3.o;
                mp6.o oVar = bVar3.f218151p;
                if (!(oneClickFeedbackFlowContract$InputData instanceof OneClickFeedbackFlowContract$InputData.Comment)) {
                    if (!(oneClickFeedbackFlowContract$InputData instanceof OneClickFeedbackFlowContract$InputData.OneClickFeedback)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oVar.getClass();
                    cp6.c cVar5 = new cp6.c(new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_success_v2, null, null, 14));
                    ParcelableDestination parcelableDestination = bVar3.f218152q;
                    if (parcelableDestination != null) {
                        bVar3.C1(parcelableDestination);
                    }
                    bVar3.C2(new e.a(cVar5));
                } else if (Intrinsics.f(output, c.a.f248299a)) {
                    oVar.getClass();
                    bVar3.C2(new e.a(new cp6.c(new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_success_v2, null, null, 14))));
                } else {
                    if (!Intrinsics.f(output, c.b.f248300a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar3.C2(e.b.f107882a);
                }
                return Unit.f186387a;
            case 26:
                rp8.k kVar3 = (rp8.k) obj3;
                ChallengesEditContract$State update4 = (ChallengesEditContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                String str = kVar3.f256279a;
                String str2 = kVar3.f256280b;
                np8.c cVar6 = update4.f77361b;
                dp8.d dVar6 = update4.f77363g;
                int i5 = np8.g.f218165b[cVar6.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (kVar3.f256281c) {
                        int i6 = np8.g.f218164a[dVar6.ordinal()];
                        if (i6 == 1) {
                            dVar6 = dp8.d.DAILY;
                        } else if (i6 != 2 && i6 != 3 && i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        dVar6 = dp8.d.ONE_OFF;
                    }
                }
                return ChallengesEditContract$State.a(update4, str, str2, null, null, dVar6, 51);
            case 27:
                ChallengesEditContract$State update5 = (ChallengesEditContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ChallengesEditContract$State.a(update5, null, null, ((xp8.i) obj3).f307907a, null, null, LDSFile.EF_DG15_TAG);
            case 28:
                tp8.i iVar4 = (tp8.i) obj3;
                ChallengesEditContract$State update6 = (ChallengesEditContract$State) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ChallengesEditContract$State.a(update6, null, null, null, iVar4.f273317a, iVar4.f273318b, 31);
            default:
                s7a.a0 output2 = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                s7a.c0 c0Var2 = output2.f260599a;
                Intrinsics.i(c0Var2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.country_picker.TaxResidencyCountryPickerInteractor.Result");
                ((ml3.y) obj3).invoke(((npe.c) c0Var2).f218195a);
                return Unit.f186387a;
        }
    }
}
