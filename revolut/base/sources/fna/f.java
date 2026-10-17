package fna;

import cli.y;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlow;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreen;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreen;
import fjd.g0;
import fnc.d0;
import fnc.n;
import fo1.e0;
import foa.z;
import fr8.r;
import fuk.t;
import fv6.k;
import fvk.q;
import fwf.m;
import fwj.p;
import fxc.j;
import fxc.u;
import i93.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0j.c;
import vkm.j2;
import xzg.r0;
import yhm.o;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f136573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f136573w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f((h) this.f136573w, continuation);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f((PortfolioDetailsScreen) this.f136573w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f((AmountScreen) this.f136573w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f((NotificationSettingDetailsViewController) this.f136573w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                f fVar5 = new f((DocumentsPreviewScreen) this.f136573w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
            case 5:
                f fVar6 = new f((fr7.i) this.f136573w, continuation, 5);
                fVar6.v = obj2;
                return fVar6;
            case 6:
                f fVar7 = new f((r) this.f136573w, continuation, 6);
                fVar7.v = obj2;
                return fVar7;
            case 7:
                f fVar8 = new f((frk.b) this.f136573w, continuation, 7);
                fVar8.v = obj2;
                return fVar8;
            case 8:
                f fVar9 = new f((frk.d) this.f136573w, continuation, 8);
                fVar9.v = obj2;
                return fVar9;
            case 9:
                f fVar10 = new f((BlockedPaymentsListFlow) this.f136573w, continuation, 9);
                fVar10.v = obj2;
                return fVar10;
            case 10:
                f fVar11 = new f((twg.c) this.f136573w, continuation, 10);
                fVar11.v = obj2;
                return fVar11;
            case 11:
                f fVar12 = new f((ft2.i) this.f136573w, continuation, 11);
                fVar12.v = obj2;
                return fVar12;
            case 12:
                f fVar13 = new f((t) this.f136573w, continuation, 12);
                fVar13.v = obj2;
                return fVar13;
            case 13:
                f fVar14 = new f((com.revolut.feature.credit.card.impl.ui.statement.details.a) this.f136573w, continuation, 13);
                fVar14.v = obj2;
                return fVar14;
            case 14:
                f fVar15 = new f((FreelancerAcquiringPaymentListScreen) this.f136573w, continuation, 14);
                fVar15.v = obj2;
                return fVar15;
            case 15:
                return new f((com.revolut.feature.kyc.impl.egov_kyc.flow.a) this.v, (String) this.f136573w, continuation, 15);
            case 16:
                f fVar16 = new f((m) this.f136573w, continuation, 16);
                fVar16.v = obj2;
                return fVar16;
            case 17:
                return new f((p) this.v, (cdd.b) this.f136573w, continuation, 17);
            case 18:
                return new f((o0j.c) this.v, (p) this.f136573w, continuation, 18);
            case 19:
                return new f((p) this.v, (cdd.a) this.f136573w, continuation, 19);
            case 20:
                f fVar17 = new f((fwk.e) this.f136573w, continuation, 20);
                fVar17.v = obj2;
                return fVar17;
            case 21:
                f fVar18 = new f((fx5.i) this.f136573w, continuation, 21);
                fVar18.v = obj2;
                return fVar18;
            case 22:
                f fVar19 = new f((fx6.i) this.f136573w, continuation, 22);
                fVar19.v = obj2;
                return fVar19;
            case 23:
                f fVar20 = new f((SelectPaymentScreen) this.f136573w, continuation, 23);
                fVar20.v = obj2;
                return fVar20;
            case 24:
                f fVar21 = new f((u) this.f136573w, continuation, 24);
                fVar21.v = obj2;
                return fVar21;
            case 25:
                f fVar22 = new f((InvoicePaymentScheduleScreen) this.f136573w, continuation, 25);
                fVar22.v = obj2;
                return fVar22;
            case 26:
                f fVar23 = new f((com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) this.f136573w, continuation, 26);
                fVar23.v = obj2;
                return fVar23;
            case 27:
                f fVar24 = new f((DirectDebitNewAccountScreen) this.f136573w, continuation, 27);
                fVar24.v = obj2;
                return fVar24;
            case 28:
                f fVar25 = new f((InvoiceTemplateOverrideScreen) this.f136573w, continuation, 28);
                fVar25.v = obj2;
                return fVar25;
            default:
                f fVar26 = new f((DisposableCardSettingsController) this.f136573w, continuation, 29);
                fVar26.v = obj2;
                return fVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String id10;
        Data data;
        Data data2;
        Data data3;
        i93.i iVar;
        l lVar;
        int i = this.u;
        int i2 = 22;
        int i3 = 10;
        int i5 = 12;
        int i6 = 19;
        int i21 = 21;
        int i22 = 26;
        int i32 = 6;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f136573w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Pair pair2 = (Pair) pair.f186385a;
                Pair pair3 = (Pair) pair.f186386b;
                yhm.r rVar = (yhm.r) pair2.f186385a;
                yhm.r rVar2 = (yhm.r) pair2.f186386b;
                yhm.r rVar3 = (yhm.r) pair3.f186385a;
                Pair pair4 = (Pair) pair3.f186386b;
                Object obj4 = rVar.f314201a;
                Object obj5 = rVar.f314202b;
                Object obj6 = rVar.f314203c;
                Object obj7 = rVar2.f314201a;
                Object obj8 = rVar2.f314202b;
                Object obj9 = rVar2.f314203c;
                Object obj10 = rVar3.f314201a;
                Object obj11 = rVar3.f314202b;
                Object obj12 = rVar3.f314203c;
                Object obj13 = pair4.f186385a;
                List list = (List) pair4.f186386b;
                boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                od0.i iVar2 = (od0.i) obj10;
                od0.i iVar3 = (od0.i) obj9;
                r0 r0Var = (r0) obj8;
                List list2 = (List) obj7;
                uib.a aVar2 = (uib.a) obj6;
                List list3 = (List) obj5;
                n38.a aVar3 = (n38.a) ((od0.i) obj4).f224257a;
                if (aVar3 == null || (id10 = aVar3.f211924b) == null) {
                    str = null;
                } else {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    str = id10;
                }
                break;
            case 1:
                n nVar = (n) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fnc.o oVarE3 = ((PortfolioDetailsScreen) obj3).d();
                String portfolioId = nVar.f136647a;
                d0 d0Var = (d0) oVarE3;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                d0Var.C1(u0.c(new RoboFeatureConfig.PortfolioStrategyInformation(portfolioId)));
                break;
            case 2:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e0) ((AmountScreen) obj3).d()).I2(new fo1.m(charSequence.toString()));
                break;
            case 3:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                foa.c cVarE3 = ((NotificationSettingDetailsViewController) obj3).R2();
                Intrinsics.h(clickData);
                com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a aVar7 = (com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.a) cVarE3;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, z.PERSONALIZED_THIRD_PARTY.toString())) {
                    aVar7.n2(new foa.f(aVar7, objArr == true ? 1 : 0, 0), new whi.b(i32));
                }
                break;
            case 4:
                ty0.a aVar8 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fr7.i) ((fr7.f) ((DocumentsPreviewScreen) obj3).N.getValue())).I2(aVar8.d, aVar8.f275445a);
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fr7.i iVar4 = (fr7.i) obj3;
                iVar4.H2(iVar4.f137404q, new fk4.o(data4, i21));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    Object content = data5.getContent();
                    data = new Data(content != null ? (io3.d) ((yhm.r) content).f314201a : null, data5.getError(), data5.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data5.getLoading());
                }
                try {
                    Object content2 = data5.getContent();
                    data2 = new Data(content2 != null ? (io3.d) ((yhm.r) content2).f314202b : null, data5.getError(), data5.getLoading());
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data5.getLoading());
                }
                try {
                    Object content3 = data5.getContent();
                    data3 = new Data(content3 != null ? (Pair) ((yhm.r) content3).f314203c : null, data5.getError(), data5.getLoading());
                } catch (Throwable th12) {
                    data3 = new Data(null, th12, data5.getLoading());
                }
                ((r) obj3).x2(new afg.h(i32, data, data3, data2));
                break;
            case 7:
                String str2 = (String) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m2l.i iVar5 = (m2l.i) j6.a.k(m2l.i.class, ((frk.b) obj3).f137489b, frk.b.b(str2));
                if (iVar5 != null) {
                }
                break;
            case 8:
                cel.b bVar = (cel.b) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = ((frk.d) obj3).f137493c;
                String strA = frk.d.a(bVar);
                Type type = frk.d.e;
                Intrinsics.checkNotNullExpressionValue(type, "access$getStorageType$cp(...)");
                Map map = (Map) cVar.T2(strA, type);
                if (map != null) {
                }
                break;
            case 9:
                String tabId = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fs2.c cVar2 = (fs2.c) ((BlockedPaymentsListFlow) obj3).P.getValue();
                Intrinsics.h(tabId);
                fs2.o oVar = (fs2.o) cVar2;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                oVar.H2(oVar.f137573r, new f9g.l(tabId, i6));
                break;
            case 10:
                twg.c cVar3 = (twg.c) obj3;
                yhm.r rVar4 = (yhm.r) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Collection collection = (Collection) rVar4.f314201a;
                List list4 = (List) rVar4.f314202b;
                List list5 = (List) rVar4.f314203c;
                ArrayList arrayList = new ArrayList();
                for (Object obj14 : list4) {
                    psg.a aVar16 = (psg.a) obj14;
                    if (ta6.a.y(aVar16) && ta6.a.A(aVar16)) {
                        arrayList.add(obj14);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collection collection2 = collection;
                    ArrayList juniorIds = new ArrayList(w.t(collection2, 10));
                    Iterator it8 = collection2.iterator();
                    while (it8.hasNext()) {
                        juniorIds.add(((JuniorBankingProfile) it8.next()).f77103j);
                    }
                    zq.a aVar17 = (zq.a) cVar3.f275019c;
                    Intrinsics.checkNotNullParameter(juniorIds, "juniorIds");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                }
                break;
            case 11:
                Data data6 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ft2.i iVar6 = (ft2.i) obj3;
                y yVar = iVar6.f137793r;
                iVar6.H2(yVar, new fk4.o(data6, i2));
                if (!((ft2.e) ((j2) yVar.f22677a).getValue()).f137785b) {
                    ru.a aVar19 = (ru.a) data6.getContent();
                    if ((aVar19 != null ? aVar19.d : null) instanceof ru.g) {
                        iVar6.f137792q.R(h60.a.f149577a);
                        iVar6.H2(yVar, new fo9.a(28));
                    }
                }
                break;
            case 12:
                Data data7 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t tVar = (t) obj3;
                tVar.X2(tVar.f138272p, new fk4.o(data7, 29));
                break;
            case 13:
                Data data8 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement.details.a aVar22 = (com.revolut.feature.credit.card.impl.ui.statement.details.a) obj3;
                aVar22.H2(aVar22.f69664s, new fpk.b(data8, aVar22, i5));
                break;
            case 14:
                String listId = (String) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen = (FreelancerAcquiringPaymentListScreen) obj3;
                k kVarE3 = freelancerAcquiringPaymentListScreen.R2();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) kVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("MENU_ITEM_ID_SEARCH")) {
                    bVar2.H2(bVar2.f73736s, new ft4.w(27));
                }
                if (listId.equals("MENU_ITEM_ID_SEARCH")) {
                    freelancerAcquiringPaymentListScreen.d3().f174539b.E0();
                    NavBarWithToolbar navBarWithToolbar = freelancerAcquiringPaymentListScreen.d3().f174539b;
                    Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                    kli.c.f(navBarWithToolbar);
                }
                break;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.kyc.impl.egov_kyc.flow.a) this.v).C2(new ss8.c((String) obj3));
                break;
            case 16:
                Data data9 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) obj3).x2(new fv6.r(data9, 7));
                break;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                twj.i iVar7 = ((p) this.v).E;
                cdd.b user = (cdd.b) obj3;
                iVar7.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                iVar7.c(user.f23236c);
                iVar7.b(user.e);
                break;
            case 18:
                p pVar = (p) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                o0j.c cVar4 = (o0j.c) this.v;
                if (cVar4 instanceof o0j.l) {
                    ((cn0.g) pVar.i).l(new mm0.i(rl0.d.PASSCODE));
                    ((cn0.g) pVar.i).l(new mm0.h(((o0j.l) cVar4).f221242a));
                } else if (cVar4 instanceof c.k) {
                    ((cn0.g) pVar.i).l(new mm0.i(rl0.d.PASSKEY));
                }
                break;
            case 19:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((p) this.v).j((cdd.a) obj3);
                break;
            case 20:
                Data data10 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fwk.e eVar = (fwk.e) obj3;
                eVar.H2(eVar.f138707q, new fv6.r(data10, 8));
                break;
            case 21:
                List list6 = (List) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fx5.i) obj3).x2(new q(list6, 4));
                break;
            case 22:
                Data data11 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fx6.i iVar8 = (fx6.i) obj3;
                iVar8.H2(iVar8.f138755q, new fv6.r(data11, 9));
                break;
            case 23:
                String menuItemId = (String) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fxc.l lVarD3 = ((SelectPaymentScreen) obj3).R2();
                Intrinsics.h(menuItemId);
                u uVar = (u) lVarD3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (Intrinsics.f(menuItemId, "ADD_NEW_CARD_MENU_ITEM_ACTION_ID")) {
                    uVar.C2(j.a.f138796a);
                }
                break;
            case 24:
                Data data12 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar2 = (u) obj3;
                uVar2.H2(uVar2.f138808s, new fv6.r(data12, i3));
                break;
            case 25:
                g6 g6Var = (g6) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fy6.o oVarE32 = ((InvoicePaymentScheduleScreen) obj3).R2();
                String tabId2 = g6Var.f54199a;
                com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar5 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) oVarE32;
                y yVar2 = cVar5.v;
                Intrinsics.checkNotNullParameter(tabId2, "tabId");
                if (Intrinsics.f(tabId2, "ITEM_ID_ONE_TIME_TAB")) {
                    cVar5.H2(yVar2, new fwf.n(13));
                } else if (Intrinsics.f(tabId2, "ITEM_ID_RECURRING_TAB")) {
                    cVar5.H2(yVar2, new fwf.n(14));
                }
                break;
            case 26:
                Data data13 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar6 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) obj3;
                cVar6.H2(cVar6.v, new fv6.r(data13, i5));
                break;
            case 27:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fz4.i iVarH3 = ((DirectDebitNewAccountScreen) obj3).T2();
                Intrinsics.h(clickData2);
                fz4.l lVar2 = (fz4.l) iVarH3;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                lVar2.n2(new g0(lVar2, clickData2, objArr2 == true ? 1 : 0, i22), new whi.b(i32));
                break;
            case 28:
                ty0.a aVar37 = (ty0.a) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fz6.j jVarE3 = ((InvoiceTemplateOverrideScreen) obj3).d();
                Object obj15 = aVar37.d;
                com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar39 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a) jVarE3;
                aVar39.getClass();
                if (obj15 instanceof fz6.r) {
                    String str3 = ((fz6.r) obj15).f139130a;
                    y yVar3 = aVar39.o;
                    switch (str3.hashCode()) {
                        case -1089863045:
                            if (str3.equals("LIST_ID_HEADER_INPUT")) {
                                aVar39.H2(yVar3, new fwf.n(i6));
                            }
                            break;
                        case -735732392:
                            if (str3.equals("LIST_ID_SELECT_LANGUAGE")) {
                                aVar39.H2(yVar3, new fwf.n(i21));
                            }
                            break;
                        case 222083043:
                            if (str3.equals("LIST_ID_INVOICE_TITLE")) {
                                aVar39.H2(yVar3, new fwf.n(20));
                            }
                            break;
                        case 551605001:
                            if (str3.equals("LIST_ID_FOOTER_INPUT")) {
                                aVar39.H2(yVar3, new fwf.n(18));
                            }
                            break;
                    }
                }
                break;
            default:
                ty0.a aVar40 = (ty0.a) this.v;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g03.e eVarD3 = ((DisposableCardSettingsController) obj3).d();
                String id11 = aVar40.f275445a;
                Object obj16 = aVar40.d;
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar3 = (com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b) eVarD3;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if ((obj16 instanceof i93.i) && (lVar = (iVar = (i93.i) obj16).d) != null) {
                    bVar3.l2(new etj.l(bVar3, iVar, lVar, null, 25), new yi5.b(i22));
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f136573w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136573w = obj2;
    }
}
