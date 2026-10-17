package j40;

import aw0.o9;
import bjk.f2;
import com.revolut.chat.domain.model.LastMessage;
import com.revolut.chat_core.R$plurals;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsights;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.DocumentFilesGroup;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanUnlockableBenefitsLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBillingPicker;
import com.revolut.retail.feature.pricing_plans.ui.api.models.StudentHubScreenConfig;
import ecm.k0;
import ep6.m;
import ggk.b1;
import ggk.k;
import gim.i;
import iil.a;
import ij3.p;
import ij3.s;
import ij3.t;
import ip0.ej;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jtj.n;
import kjk.b0;
import kjk.f0;
import kkf.c6;
import kkf.j8;
import kkf.l5;
import kkf.p5;
import kkf.q;
import kl7.h2;
import kl7.s1;
import kl7.w1;
import klf.j1;
import knd.h1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlin.time.b;
import le.u1;
import ljk.m;
import ll7.e0;
import ll7.i0;
import mjk.r;
import mx0.c7;
import nf6.e;
import r10.v;
import skm.l;
import tof.a3;
import v30.j;
import wim.z;
import yhm.m;
import yhm.o;
import ysj.y;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f171271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f171272x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f171272x = obj2;
    }

    private final Object b(Object obj2) {
        Data data;
        ArrayList arrayList;
        Data data2 = (Data) this.v;
        Data data3 = (Data) this.f171271w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        zel.f fVar = (zel.f) this.f171272x;
        try {
            Object content = data3.getContent();
            if (content != null) {
                List<g0h.a> list = (List) content;
                arrayList = new ArrayList(w.t(list, 10));
                for (g0h.a aVar2 : list) {
                    arrayList.add(new p5d.b(aVar2.f139493b.a(), zi0.c.N(aVar2.f139493b), null));
                }
            } else {
                arrayList = null;
            }
            data = new Data(arrayList, data3.getError(), data3.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data3.getLoading());
        }
        Data data4 = data;
        zel.h hVar = (zel.h) data2.getContent();
        return new lmh.e(fVar, data2, data3, data4, hVar != null ? hVar.f321804c : null, true);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                d dVar = new d((f) this.f171272x, (Continuation) obj4, 0);
                dVar.v = (j) obj2;
                dVar.f171271w = (UUID) obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                d dVar2 = new d((ja.b) this.f171272x, (Continuation) obj4, 1);
                dVar2.v = (String) obj2;
                dVar2.f171271w = (fa.j) obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
            case 2:
                d dVar3 = new d((jb7.b) this.f171272x, (Continuation) obj4, 2);
                dVar3.v = (List) obj2;
                dVar3.f171271w = (Set) obj3;
                return dVar3.invokeSuspend(Unit.f186387a);
            case 3:
                d dVar4 = new d((v) this.f171272x, (Continuation) obj4, 3);
                dVar4.v = (Data) obj2;
                dVar4.f171271w = (Set) obj3;
                return dVar4.invokeSuspend(Unit.f186387a);
            case 4:
                d dVar5 = new d((jil.a) this.f171272x, (Continuation) obj4, 4);
                dVar5.v = (dil.a) obj2;
                dVar5.f171271w = (tel.d) obj3;
                return dVar5.invokeSuspend(Unit.f186387a);
            case 5:
                d dVar6 = new d((jj3.e) this.f171272x, (Continuation) obj4, 5);
                dVar6.v = (jj3.c) obj2;
                dVar6.f171271w = (hj3.a) obj3;
                return dVar6.invokeSuspend(Unit.f186387a);
            case 6:
                d dVar7 = new d((jm8.b) this.f171272x, (Continuation) obj4, 6);
                dVar7.v = (String) obj2;
                dVar7.f171271w = (hm8.b) obj3;
                return dVar7.invokeSuspend(Unit.f186387a);
            case 7:
                d dVar8 = new d((n) this.f171272x, (Continuation) obj4, 7);
                dVar8.v = (String) obj2;
                dVar8.f171271w = (List) obj3;
                return dVar8.invokeSuspend(Unit.f186387a);
            case 8:
                d dVar9 = new d((k0d.f) this.f171272x, (Continuation) obj4, 8);
                dVar9.v = (String) obj2;
                dVar9.f171271w = (List) obj3;
                return dVar9.invokeSuspend(Unit.f186387a);
            case 9:
                d dVar10 = new d((k2a.d) this.f171272x, (Continuation) obj4, 9);
                dVar10.v = (String) obj2;
                dVar10.f171271w = (P2pPersonalisation) obj3;
                return dVar10.invokeSuspend(Unit.f186387a);
            case 10:
                d dVar11 = new d((f0) this.f171272x, (Continuation) obj4, 10);
                dVar11.v = (String) obj2;
                dVar11.f171271w = (k) obj3;
                return dVar11.invokeSuspend(Unit.f186387a);
            case 11:
                d dVar12 = new d((f0) this.f171272x, (Continuation) obj4, 11);
                dVar12.v = (b0) obj2;
                dVar12.f171271w = (PricingPlanBillingPicker) obj3;
                return dVar12.invokeSuspend(Unit.f186387a);
            case 12:
                d dVar13 = new d((f0) this.f171272x, (Continuation) obj4, 12);
                dVar13.v = (String) obj2;
                dVar13.f171271w = (PlanUnlockableBenefitsLayout) obj3;
                return dVar13.invokeSuspend(Unit.f186387a);
            case 13:
                d dVar14 = new d((f0) this.f171272x, (Continuation) obj4, 13);
                dVar14.v = (String) obj2;
                dVar14.f171271w = (StudentHubScreenConfig) obj3;
                return dVar14.invokeSuspend(Unit.f186387a);
            case 14:
                d dVar15 = new d((q) this.f171272x, (Continuation) obj4, 14);
                dVar15.v = (m) obj2;
                dVar15.f171271w = (Data) obj3;
                return dVar15.invokeSuspend(Unit.f186387a);
            case 15:
                d dVar16 = new d((p5) this.f171272x, (Continuation) obj4, 15);
                dVar16.v = (a3) obj2;
                dVar16.f171271w = (UserCompanyRegion) obj3;
                return dVar16.invokeSuspend(Unit.f186387a);
            case 16:
                d dVar17 = new d((c6) this.f171272x, (Continuation) obj4, 16);
                dVar17.v = (glc.i) obj2;
                dVar17.f171271w = (j1) obj3;
                return dVar17.invokeSuspend(Unit.f186387a);
            case 17:
                d dVar18 = new d((j8) this.f171272x, (Continuation) obj4, 17);
                dVar18.v = (Data) obj2;
                dVar18.f171271w = (String) obj3;
                return dVar18.invokeSuspend(Unit.f186387a);
            case 18:
                return new d((h1) this.v, (l) this.f171271w, (skm.h1) this.f171272x, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 19:
                d dVar19 = new d((Data) this.f171272x, (Continuation) obj4, 19);
                dVar19.v = (Data) obj2;
                dVar19.f171271w = (List) obj3;
                return dVar19.invokeSuspend(Unit.f186387a);
            case 20:
                d dVar20 = new d((l05.g) this.f171272x, (Continuation) obj4, 20);
                dVar20.v = (LocalDate) obj2;
                dVar20.f171271w = (CreditScoreInsights) obj3;
                return dVar20.invokeSuspend(Unit.f186387a);
            case 21:
                d dVar21 = new d((lf6.j) this.f171272x, (Continuation) obj4, 21);
                dVar21.v = (String) obj2;
                dVar21.f171271w = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) obj3;
                return dVar21.invokeSuspend(Unit.f186387a);
            case 22:
                d dVar22 = new d((ll7.h) this.f171272x, (Continuation) obj4, 22);
                dVar22.v = (String) obj2;
                dVar22.f171271w = (ApplicationForm) obj3;
                return dVar22.invokeSuspend(Unit.f186387a);
            case 23:
                d dVar23 = new d((e0) this.f171272x, (Continuation) obj4, 23);
                dVar23.v = (String) obj2;
                dVar23.f171271w = (h2) obj3;
                return dVar23.invokeSuspend(Unit.f186387a);
            case 24:
                d dVar24 = new d((e0) this.f171272x, (Continuation) obj4, 24);
                dVar24.v = (String) obj2;
                dVar24.f171271w = (DocumentFilesGroup) obj3;
                return dVar24.invokeSuspend(Unit.f186387a);
            case 25:
                d dVar25 = new d((e0) this.f171272x, (Continuation) obj4, 25);
                dVar25.v = (String) obj2;
                dVar25.f171271w = (MtaAvailabilityContainer) obj3;
                return dVar25.invokeSuspend(Unit.f186387a);
            case 26:
                d dVar26 = new d((e0) this.f171272x, (Continuation) obj4, 26);
                dVar26.v = (String) obj2;
                dVar26.f171271w = (ApplicationForm) obj3;
                return dVar26.invokeSuspend(Unit.f186387a);
            case 27:
                d dVar27 = new d((i0) this.f171272x, (Continuation) obj4, 27);
                dVar27.v = (Pair) obj2;
                dVar27.f171271w = (List) obj3;
                return dVar27.invokeSuspend(Unit.f186387a);
            case 28:
                d dVar28 = new d((zel.f) this.f171272x, (Continuation) obj4, 28);
                dVar28.v = (Data) obj2;
                dVar28.f171271w = (Data) obj3;
                return dVar28.invokeSuspend(Unit.f186387a);
            default:
                d dVar29 = new d((lo9.e) this.f171272x, (Continuation) obj4, 29);
                dVar29.v = (String) obj2;
                dVar29.f171271w = (PaymentWidget) obj3;
                return dVar29.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ia.b bVar;
        ia.a aVar;
        ia.a aVar2;
        p pVar;
        ij3.k kVar;
        Iterator it8;
        ij3.f fVar;
        String str;
        String str2;
        String str3;
        y yVar;
        String str4;
        f2.a aVar3;
        TextLocalisedClause textLocalisedClause;
        Data data;
        ArrayList arrayList;
        int i = this.u;
        int i2 = 2;
        int i3 = 1;
        List list = null;
        Object obj3 = this.f171272x;
        switch (i) {
            case 0:
                f fVar2 = (f) obj3;
                j jVar = (j) this.v;
                UUID uuid = (UUID) this.f171271w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (jVar != null) {
                    LastMessage lastMessage = jVar.f285790j;
                    int i5 = jVar.k;
                    if (i5 > 0) {
                        if (!Intrinsics.f(lastMessage != null ? lastMessage.getServerId() : null, uuid) && (lastMessage == null || fVar2.o.a().toEpochMilli() - lastMessage.getTime().getMillis() < 172800000)) {
                            String customInAppText = (i5 != 1 || lastMessage == null) ? null : lastMessage.getCustomInAppText();
                            return new NavBarMessage("assistant", customInAppText != null ? new TextClause(customInAppText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedQuantityClause(R$plurals.chat_messages_new_money_assistant_message_plain, new Integer(i5), (List) null, (Style) null, 28), customInAppText == null, ((rf3.d) fVar2.f171276n).c(), 16);
                        }
                    }
                }
                return null;
            case 1:
                String str5 = (String) this.v;
                fa.j domain = (fa.j) this.f171271w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ja.b bVar2 = (ja.b) obj3;
                ue0.c cVar = bVar2.f172401c;
                String strQ = j6.a.q("NAVIGATION_HUB_STORAGE_KEY", str5);
                k0 k0Var = bVar2.f172399a;
                Intrinsics.checkNotNullParameter(domain, "domain");
                String str6 = domain.f133012a;
                String str7 = domain.f133013b;
                ArrayList arrayList2 = domain.f133014c;
                int i6 = 10;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    fa.k kVar2 = (fa.k) it9.next();
                    String str8 = kVar2.f133015a;
                    ArrayList<fa.h> arrayList4 = kVar2.f133016b;
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, i6));
                    for (fa.h hVar : arrayList4) {
                        String str9 = hVar.f133007a;
                        String str10 = hVar.f133008b;
                        fa.g gVar = hVar.f133009c;
                        Iterator it10 = it9;
                        if (gVar instanceof fa.e) {
                            bVar = new ia.b("IMAGE", ((fa.e) gVar).f133005a, null, null, 12);
                        } else if (gVar instanceof fa.f) {
                            bVar = new ia.b("TRANSACTION", null, ((fa.f) gVar).f133006a, null, 10);
                        } else {
                            if (!(gVar instanceof fa.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new ia.b("COUNTRY", null, null, ((fa.d) gVar).f133004a, 6);
                        }
                        ia.b bVar3 = bVar;
                        fa.m mVar = hVar.d;
                        ia.h hVar2 = new ia.h(mVar.f133018b, u1.g(mVar.f133017a, k0Var.f124832a));
                        fa.c cVar2 = hVar.e;
                        if (cVar2 != null) {
                            if (cVar2 instanceof fa.b) {
                                aVar2 = new ia.a(6, "WORKFLOW", null, ((fa.b) cVar2).f133003a, null);
                            } else {
                                if (!(cVar2 instanceof fa.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fa.a aVar6 = (fa.a) cVar2;
                                aVar2 = new ia.a(8, "FORM", aVar6.f133001a, null, aVar6.f133002b);
                            }
                            aVar = aVar2;
                        } else {
                            aVar = null;
                        }
                        arrayList5.add(new ia.c(str9, str10, bVar3, hVar2, aVar, hVar.f));
                        it9 = it10;
                    }
                    arrayList3.add(new ia.g(str8, arrayList5));
                    i6 = 10;
                }
                fa.i iVar = domain.d;
                cVar.G(new ia.f(str6, str7, arrayList3, new ia.d(iVar.f133010a, iVar.f133011b)), strQ, z.d(o0.b(ia.f.class)));
                return Unit.f186387a;
            case 2:
                List spaces = (List) this.v;
                Set hiddenAccountIds = (Set) this.f171271w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.checkNotNullParameter(spaces, "spaces");
                Intrinsics.checkNotNullParameter(hiddenAccountIds, "hiddenAccountIds");
                ArrayList arrayList6 = new ArrayList();
                Iterator it11 = spaces.iterator();
                while (it11.hasNext()) {
                    SpaceContentModel spaceContentModelB = jb7.f.b((SpaceContentModel) it11.next(), new imk.e(2, hiddenAccountIds));
                    if (spaceContentModelB != null) {
                        arrayList6.add(spaceContentModelB);
                    }
                }
                return new fb7.k(arrayList6);
            case 3:
                Data data2 = (Data) this.v;
                Set set = (Set) this.f171271w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.h(data2);
                v vVar = (v) obj3;
                try {
                    Object content = data2.getContent();
                    return new Data(content != null ? set.isEmpty() ? zhm.f0.f322471a : uj3.b.g((List) content, (za7.c) vVar.d, new imk.e(1, set)) : null, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data2.getLoading());
                }
            case 4:
                dil.a params = (dil.a) this.v;
                tel.d projections = (tel.d) this.f171271w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jul.o oVar = ((jil.a) obj3).f174610c;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(projections, "projections");
                Intrinsics.checkNotNullParameter(projections, "<this>");
                ArrayList arrayList7 = projections.f270123a;
                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                Iterator it12 = arrayList7.iterator();
                while (it12.hasNext()) {
                    tel.b bVar4 = (tel.b) it12.next();
                    Intrinsics.checkNotNullParameter(bVar4, "<this>");
                    String string = bVar4.f270117a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    String string2 = bVar4.f270119c.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    tel.c cVar3 = bVar4.f270118b;
                    Intrinsics.checkNotNullParameter(cVar3, "<this>");
                    String string3 = cVar3.f270120a.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    String string4 = cVar3.f270121b.toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                    Iterator it13 = it12;
                    String string5 = cVar3.f270122c.toString();
                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                    String string6 = cVar3.d.toString();
                    Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                    String string7 = cVar3.e.toString();
                    Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                    arrayList8.add(new a.C0924a(string, string2, new a.b(string3, string4, string5, string6, string7)));
                    it12 = it13;
                }
                ArrayList arrayList9 = projections.f270124b;
                ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                Iterator it14 = arrayList9.iterator();
                while (it14.hasNext()) {
                    arrayList10.add(mo3.a.p((dj0.d) it14.next()));
                }
                iil.a aVar10 = new iil.a(arrayList8, arrayList10, mo3.a.p(projections.f270125c));
                LocalDate localDateE = params.f115076b;
                if (localDateE == null) {
                    localDateE = ((l80.f) ((l80.e) oVar.f178696c)).e();
                }
                String string8 = localDateE.toString();
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                ((ue0.c) oVar.f178695b).G(new kil.a(aVar10, string8), params.e, z.d(o0.b(kil.a.class)));
                return Unit.f186387a;
            case 5:
                jj3.c cVar4 = (jj3.c) this.v;
                hj3.a aVar11 = (hj3.a) this.f171271w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jj3.e eVar = (jj3.e) obj3;
                ue0.c cVar5 = eVar.f174634c;
                String strA = eVar.a(cVar4);
                Intrinsics.checkNotNullParameter(aVar11, "<this>");
                String str11 = aVar11.f152650a;
                hj3.f fVar3 = aVar11.f152651b;
                Intrinsics.checkNotNullParameter(fVar3, "<this>");
                int i21 = gj3.a.f144235c[fVar3.ordinal()];
                if (i21 == 1) {
                    pVar = p.MARKETING;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar = p.FIN_CRIME;
                }
                p pVar2 = pVar;
                hj3.e eVar2 = aVar11.f152652c;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                int i22 = gj3.a.d[eVar2.ordinal()];
                if (i22 == 1) {
                    kVar = ij3.k.NONE;
                } else if (i22 == 2) {
                    kVar = ij3.k.ALL_SCREENS;
                } else {
                    if (i22 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = ij3.k.END_SCREEN;
                }
                ij3.k kVar3 = kVar;
                String str12 = aVar11.d;
                ArrayList<hj3.d> arrayList11 = aVar11.e;
                ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                for (hj3.d dVar : arrayList11) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    arrayList12.add(new ij3.i(dVar.f152659a, dVar.f152660b));
                }
                ArrayList arrayList13 = aVar11.f;
                ArrayList arrayList14 = new ArrayList(w.t(arrayList13, 10));
                Iterator it15 = arrayList13.iterator();
                while (it15.hasNext()) {
                    hj3.g gVar2 = (hj3.g) it15.next();
                    Intrinsics.checkNotNullParameter(gVar2, "<this>");
                    String str13 = gVar2.f152661a;
                    hj3.c cVar6 = gVar2.f152662b;
                    if (cVar6 != null) {
                        Intrinsics.checkNotNullParameter(cVar6, "<this>");
                        it8 = it15;
                        fVar = new ij3.f(cVar6.f152657a, cVar6.f152658b);
                    } else {
                        it8 = it15;
                        fVar = null;
                    }
                    String str14 = gVar2.f152663c;
                    String str15 = gVar2.d;
                    hj3.b bVar5 = gVar2.e;
                    Intrinsics.checkNotNullParameter(bVar5, "<this>");
                    arrayList14.add(new s(str13, fVar, str14, str15, new ij3.c(bVar5.f152655a, bVar5.f152656b)));
                    it15 = it8;
                }
                String str16 = aVar11.f152653g;
                hj3.h hVar3 = aVar11.f152654h;
                Intrinsics.checkNotNullParameter(hVar3, "<this>");
                long j2 = hVar3.f152664a;
                b.Companion companion = kotlin.time.b.INSTANCE;
                pkm.e eVar3 = pkm.e.SECONDS;
                cVar5.G(new ij3.n(str11, pVar2, kVar3, str12, arrayList12, arrayList14, str16, new t(kotlin.time.b.n(j2, eVar3), kotlin.time.b.n(hVar3.f152665b, eVar3))), strA, z.d(o0.b(ij3.n.class)));
                return Unit.f186387a;
            case 6:
                String str17 = (String) this.v;
                hm8.b bVar6 = (hm8.b) this.f171271w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar7 = ((jm8.b) obj3).f176491c;
                String strB = jm8.b.b(str17);
                Intrinsics.checkNotNullParameter(bVar6, "<this>");
                cVar7.G(new lm8.c(bVar6.f153538a.name()), strB, z.d(o0.b(lm8.c.class)));
                return Unit.f186387a;
            case 7:
                String str18 = (String) this.v;
                List list2 = (List) this.f171271w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wsj.e eVar4 = ((n) obj3).f178521a;
                List list3 = list2;
                ArrayList arrayList15 = new ArrayList(w.t(list3, 10));
                Iterator it16 = list3.iterator();
                while (it16.hasNext()) {
                    IncomeSorter incomeSorter = (IncomeSorter) it16.next();
                    Intrinsics.checkNotNullParameter(incomeSorter, "<this>");
                    String str19 = incomeSorter.f99160a;
                    String str20 = incomeSorter.f99161b;
                    String str21 = incomeSorter.f99162c;
                    int i32 = zsj.a.f324938a[incomeSorter.d.ordinal()];
                    if (i32 == i3) {
                        str = "ACTIVE";
                    } else {
                        if (i32 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "INACTIVE";
                    }
                    String str22 = str;
                    int i33 = zsj.a.f324939b[incomeSorter.e.ordinal()];
                    if (i33 == i3) {
                        str2 = "ONE_TIME";
                    } else {
                        if (i33 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "RECURRING";
                    }
                    String str23 = str2;
                    long j3 = incomeSorter.f99163g;
                    long j5 = incomeSorter.f;
                    ArrayList arrayList16 = incomeSorter.f99164h;
                    Iterator it17 = it16;
                    ArrayList arrayList17 = new ArrayList(w.t(arrayList16, 10));
                    Iterator it18 = arrayList16.iterator();
                    while (it18.hasNext()) {
                        arrayList17.add(zsj.b.c((IncomeSorterDestination) it18.next()));
                    }
                    hzi.a aVar15 = incomeSorter.i;
                    int i43 = aVar15 == null ? -1 : zsj.a.f324940c[aVar15.ordinal()];
                    if (i43 != -1) {
                        if (i43 == 1) {
                            str4 = "MANUAL";
                        } else {
                            if (i43 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str4 = "AUTO";
                        }
                        str3 = str4;
                    } else {
                        str3 = null;
                    }
                    IncomeSorterDestinationId incomeSorterDestinationId = incomeSorter.f99165j;
                    if (incomeSorterDestinationId != null) {
                        IncomeSorterDestinationId.Pocket pocket = incomeSorterDestinationId instanceof IncomeSorterDestinationId.Pocket ? (IncomeSorterDestinationId.Pocket) incomeSorterDestinationId : null;
                        String str24 = pocket != null ? pocket.f99175a : null;
                        IncomeSorterDestinationId.Savings savings = incomeSorterDestinationId instanceof IncomeSorterDestinationId.Savings ? (IncomeSorterDestinationId.Savings) incomeSorterDestinationId : null;
                        yVar = new y(str24, savings != null ? savings.f99178a : null);
                    } else {
                        yVar = null;
                    }
                    arrayList15.add(new ysj.g(str19, str20, str21, str22, str23, j5, j3, arrayList17, str3, yVar));
                    it16 = it17;
                    i2 = 2;
                    i3 = 1;
                }
                eVar4.a(str18, arrayList15);
                return Unit.f186387a;
            case 8:
                String str25 = (String) this.v;
                List list4 = (List) this.f171271w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k0d.f) obj3).f180021c.G(list4, k0d.f.a(str25), kii.e.o(j0d.q.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 9:
                String str26 = (String) this.v;
                P2pPersonalisation p2pPersonalisation = (P2pPersonalisation) this.f171271w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k2a.d) obj3).f180449b.G(i2a.a.c(p2pPersonalisation), j6.a.q("PERSONALISATION_KEY_", str26), z.d(o0.b(j2a.h.class)));
                return Unit.f186387a;
            case 10:
                String str27 = (String) this.v;
                k kVar4 = (k) this.f171271w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xe0.e eVar5 = ((f0) obj3).f184434b;
                String str28 = "plans_benefits_suggestions_" + str27;
                Intrinsics.checkNotNullParameter(kVar4, "<this>");
                b1 b1Var = kVar4.f143738a;
                eVar5.G(new bjk.l(b1Var != null ? r.n(b1Var) : null), str28, z.d(o0.b(bjk.l.class)));
                return Unit.f186387a;
            case 11:
                b0 b0Var = (b0) this.v;
                PricingPlanBillingPicker pricingPlanBillingPicker = (PricingPlanBillingPicker) this.f171271w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xe0.e eVar6 = ((f0) obj3).f184434b;
                String strA2 = b0Var.a();
                Intrinsics.checkNotNullParameter(pricingPlanBillingPicker, "<this>");
                ArrayList arrayList18 = pricingPlanBillingPicker.f102812a;
                ArrayList arrayList19 = new ArrayList(w.t(arrayList18, 10));
                Iterator it19 = arrayList18.iterator();
                while (it19.hasNext()) {
                    arrayList19.add(mjk.k.d((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) it19.next()));
                }
                eVar6.G(new bjk.m(arrayList19), strA2, z.d(o0.b(bjk.m.class)));
                return Unit.f186387a;
            case 12:
                String str29 = (String) this.v;
                PlanUnlockableBenefitsLayout planUnlockableBenefitsLayout = (PlanUnlockableBenefitsLayout) this.f171271w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xe0.e eVar7 = ((f0) obj3).f184434b;
                String strD = f0.d(str29);
                Intrinsics.checkNotNullParameter(planUnlockableBenefitsLayout, "<this>");
                PlanUnlockableBenefitsLayout.Header header = planUnlockableBenefitsLayout.f102717a;
                f2.c cVar8 = new f2.c(header.f102727a, header.f102728b, header.f102729c, header.d, header.e, header.f, header.f102730g);
                ArrayList<PlanUnlockableBenefitsLayout.ContentItem> arrayList20 = planUnlockableBenefitsLayout.f102718b;
                ArrayList arrayList21 = new ArrayList(w.t(arrayList20, 10));
                for (PlanUnlockableBenefitsLayout.ContentItem contentItem : arrayList20) {
                    String str30 = contentItem.f102724a;
                    PlanUnlockableBenefitsLayout.Icon icon = contentItem.f102725b;
                    arrayList21.add(new f2.b(str30, icon != null ? new f2.d(icon.f102731a) : null, contentItem.f102726c));
                }
                ArrayList<PlanUnlockableBenefitsLayout.Button> arrayList22 = planUnlockableBenefitsLayout.f102719c;
                ArrayList arrayList23 = new ArrayList(w.t(arrayList22, 10));
                for (PlanUnlockableBenefitsLayout.Button button : arrayList22) {
                    if (button instanceof PlanUnlockableBenefitsLayout.Button.Primary) {
                        PlanUnlockableBenefitsLayout.Button.Primary primary = (PlanUnlockableBenefitsLayout.Button.Primary) button;
                        aVar3 = new f2.a("BUTTON_PRIMARY", primary.f102720a, primary.f102721b);
                    } else {
                        if (!(button instanceof PlanUnlockableBenefitsLayout.Button.Secondary)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlanUnlockableBenefitsLayout.Button.Secondary secondary = (PlanUnlockableBenefitsLayout.Button.Secondary) button;
                        aVar3 = new f2.a("BUTTON_SECONDARY", secondary.f102722a, secondary.f102723b);
                    }
                    arrayList23.add(aVar3);
                }
                eVar7.G(new f2(cVar8, arrayList21, arrayList23), strD, z.d(o0.b(f2.class)));
                return Unit.f186387a;
            case 13:
                String str31 = (String) this.v;
                StudentHubScreenConfig domain2 = (StudentHubScreenConfig) this.f171271w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xe0.e eVar8 = ((f0) obj3).f184434b;
                String str32 = "student_hub_screen_config_" + str31;
                Intrinsics.checkNotNullParameter(domain2, "domain");
                m.b bVarG = mjk.i.g(domain2.f102858a);
                ArrayList arrayList24 = domain2.f102859b;
                ArrayList arrayList25 = new ArrayList(w.t(arrayList24, 10));
                Iterator it20 = arrayList24.iterator();
                while (it20.hasNext()) {
                    arrayList25.add(mjk.z.o((PlanScreenElementView) it20.next()));
                }
                eVar8.G(new ljk.q(bVarG, arrayList25), str32, z.d(o0.b(ljk.q.class)));
                return Unit.f186387a;
            case 14:
                ep6.m mVar2 = (ep6.m) this.v;
                Data data3 = (Data) this.f171271w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                q qVar = (q) obj3;
                if (!(mVar2 instanceof ep6.k)) {
                    return zhm.f0.f322471a;
                }
                Feedback feedback = (Feedback) data3.getContent();
                List listA = feedback != null ? qVar.f184899r.a(feedback, null, bp6.a.FAQ) : null;
                return listA == null ? zhm.f0.f322471a : listA;
            case 15:
                a3 a3Var = (a3) this.v;
                UserCompanyRegion userCompanyRegion = (UserCompanyRegion) this.f171271w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((p5) obj3).getClass();
                n6c.a aVarC = hb9.b.C(userCompanyRegion);
                if (a3Var != null && k71.k.s(a3Var)) {
                    int i59 = l5.f184808a[aVarC.ordinal()];
                    if (i59 == 1) {
                        textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_uk_ltd_crypto, zhm.v.k(p5.c3("https://www.revolut.com/legal/terms/"), p5.b3("https://www.revolut.com/legal/cryptocurrency-terms/")), null, 12);
                    } else if (i59 == 2) {
                        textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_uk_bank_crypto, zhm.v.k(p5.c3("https://www.revolut.com/legal/terms/"), p5.b3("https://www.revolut.com/legal/cryptocurrency-terms/")), null, 12);
                    } else if (i59 != 3) {
                        if (i59 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = null;
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_buab_crypto, zhm.v.k(p5.c3("https://www.revolut.com/en-LT/legal/terms/"), p5.b3("https://www.revolut.com/en-LT/legal/cryptocurrency-terms/")), null, 12);
                    }
                } else if (a3Var == null || !k71.k.n(a3Var)) {
                    textLocalisedClause = null;
                } else {
                    int i66 = l5.f184808a[aVarC.ordinal()];
                    if (i66 == 1) {
                        textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_uk_ltd_commodities, zhm.v.k(p5.c3("https://www.revolut.com/legal/terms/"), p5.Z2()), null, 12);
                    } else if (i66 == 2) {
                        textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_uk_bank_commodities, zhm.v.k(p5.c3("https://www.revolut.com/legal/terms/"), p5.Z2()), null, 12);
                    } else if (i66 != 3) {
                        if (i66 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = null;
                    } else {
                        textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_buab_commodities, zhm.v.k(p5.c3("https://www.revolut.com/en-LT/legal/terms/"), p5.Z2()), null, 12);
                    }
                }
                return textLocalisedClause == null ? zhm.f0.f322471a : u.c(new ej("ID_REV_PAYMENT_FOOTER", new c7(textLocalisedClause, false, null, 6)));
            case 16:
                glc.i iVar2 = (glc.i) this.v;
                j1 j1Var = (j1) this.f171271w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return !j1Var.c() ? ((glc.j) ((c6) obj3).f184625n.invoke(iVar2)).f144614g : zhm.f0.f322471a;
            case 17:
                Data data4 = (Data) this.v;
                String str33 = (String) this.f171271w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List<TicketDetails> list5 = (List) data4.getContent();
                if (list5 != null) {
                    j8 j8Var = (j8) obj3;
                    ArrayList arrayList26 = new ArrayList();
                    for (TicketDetails ticketDetails : list5) {
                        ose.e eVar9 = j8Var.o;
                        ose.c cVar9 = new ose.c(Intrinsics.f(ticketDetails.f90447a, str33), true);
                        ose.a aVar26 = ose.e.Companion;
                        List<Object> listB = eVar9.b(ticketDetails, null, cVar9, false);
                        ArrayList arrayList27 = new ArrayList(w.t(listB, 10));
                        for (Object objE : listB) {
                            if (objE instanceof CellDetailsDelegate.Model) {
                                CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) objE;
                                if (a0.H(model.f51832a, "TICKET_HEADER_", false)) {
                                    objE = CellDetailsDelegate.Model.e(model, null, null, true, 67104767);
                                }
                            }
                            arrayList27.add(objE);
                        }
                        zhm.a0.x(arrayList27, arrayList26);
                    }
                    list = arrayList26;
                }
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                List list6 = list;
                yp0.b.k(list6, 0, 0, 0, 0, 31);
                return list6;
            case 18:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) this.f171271w;
                skm.h1 h1Var = (skm.h1) obj3;
                if (!lVar.y()) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    lVar.resumeWith(h1Var);
                }
                return Unit.f186387a;
            case 19:
                Data data5 = (Data) this.v;
                List list7 = (List) this.f171271w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.h(data5);
                try {
                    Object content2 = data5.getContent();
                    if (content2 != null) {
                        arrayList = new ArrayList();
                        for (Object obj4 : (List) content2) {
                            if (list7.contains(z92.f.l((io3.d) obj4))) {
                                arrayList.add(obj4);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    data = new Data(arrayList, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th11) {
                    data = new Data(null, th11, data5.getLoading());
                }
                return Data.copy$default(data, null, null, data5.getLoading() || ((Data) obj3).getLoading(), 3, null);
            case 20:
                LocalDate localDate = (LocalDate) this.v;
                CreditScoreInsights creditScoreInsights = (CreditScoreInsights) this.f171271w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l05.g) obj3).f191183c.G(n05.a.c(creditScoreInsights), l05.g.a(localDate), z.d(o0.b(m05.m.class)));
                return Unit.f186387a;
            case 21:
                String str34 = (String) this.v;
                com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar10 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) this.f171271w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar11 = ((lf6.j) obj3).f194654c;
                String str35 = "CONSENTS_STORAGE_KEY" + str34;
                Intrinsics.checkNotNullParameter(cVar10, "<this>");
                String str36 = cVar10.f72413a;
                String str37 = cVar10.f72414b;
                dj0.d dVar2 = cVar10.f72415c;
                e.b bVar7 = dVar2 != null ? new e.b(dVar2.f115082a, dVar2.f115083b.f306286a) : null;
                OpenBankingBrazilPayment.PaymentInformation paymentInformation = cVar10.d;
                Intrinsics.checkNotNullParameter(paymentInformation, "<this>");
                List list8 = paymentInformation.f72409a;
                ArrayList arrayList28 = new ArrayList(w.t(list8, 10));
                Iterator it21 = list8.iterator();
                while (it21.hasNext()) {
                    ArrayList<OpenBankingBrazilPayment.Item> arrayList29 = ((OpenBankingBrazilPayment.InfoGroup) it21.next()).f72405a;
                    ArrayList arrayList30 = new ArrayList(w.t(arrayList29, 10));
                    for (OpenBankingBrazilPayment.Item item : arrayList29) {
                        arrayList30.add(new e.C1204e(item.f72406a, item.f72407b));
                    }
                    arrayList28.add(new e.d(arrayList30));
                }
                cVar11.G(new nf6.e(str36, str37, bVar7, new e.f(arrayList28), cVar10.e, foh.i.G(cVar10.f)), str35, z.d(o0.b(nf6.e.class)));
                return Unit.f186387a;
            case 22:
                String str38 = (String) this.v;
                ApplicationForm applicationForm = (ApplicationForm) this.f171271w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ll7.h) obj3).f196633c.G(jl7.c.d(applicationForm), j6.a.q("RENEWAL_APPLICATION_FORM_", str38), z.d(o0.b(hl7.i.class)));
                return Unit.f186387a;
            case 23:
                String str39 = (String) this.v;
                h2 h2Var = (h2) this.f171271w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e0) obj3).f196611c.G(h2Var, j6.a.q("TELEMATICS_DEVICE_UNPLUGGED_PREFIX_", str39), z.d(o0.b(h2.class)));
                return Unit.f186387a;
            case 24:
                String str40 = (String) this.v;
                DocumentFilesGroup documentFilesGroup = (DocumentFilesGroup) this.f171271w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e0) obj3).f196611c.G(documentFilesGroup, j6.a.q("DOCUMENT_FILES_PREFIX_", str40), z.d(o0.b(DocumentFilesGroup.class)));
                return Unit.f186387a;
            case 25:
                String str41 = (String) this.v;
                MtaAvailabilityContainer mtaAvailabilityContainer = (MtaAvailabilityContainer) this.f171271w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e0) obj3).f196611c.G(mtaAvailabilityContainer, j6.a.q("MTA_AVAILABILITY_PREFIX_", str41), z.d(o0.b(MtaAvailabilityContainer.class)));
                return Unit.f186387a;
            case 26:
                String str42 = (String) this.v;
                ApplicationForm applicationForm2 = (ApplicationForm) this.f171271w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e0) obj3).f196611c.G(jl7.c.d(applicationForm2), j6.a.q("POLICY_APPLICATION_FORM_PREFIX_", str42), z.d(o0.b(hl7.i.class)));
                return Unit.f186387a;
            case 27:
                Pair pair = (Pair) this.v;
                List list9 = (List) this.f171271w;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String str43 = (String) pair.f186385a;
                ((i0) obj3).f196638c.G(list9, "KEY_QUESTIONNAIRE_" + ((w1) pair.f186386b) + "_" + str43, kii.e.o(s1.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 28:
                return b(obj2);
            default:
                String widgetId = (String) this.v;
                PaymentWidget widget = (PaymentWidget) this.f171271w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lo9.b bVar8 = ((lo9.e) obj3).f197426b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(widget, "widget");
                ue0.c cVar12 = bVar8.f197422b;
                lo9.b.Companion.getClass();
                cVar12.G(widget, lo9.a.a(widgetId), z.d(o0.b(PaymentWidget.class)));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h1 h1Var, l lVar, skm.h1 h1Var2, Continuation continuation) {
        super(3, continuation);
        this.u = 18;
        this.v = h1Var;
        this.f171271w = lVar;
        this.f171272x = h1Var2;
    }
}
