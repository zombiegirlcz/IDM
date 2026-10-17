package amf;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.onboarding.impl.onboarding.v;
import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedWifi;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.retail.feature.api.userauth.models.UserAuthElement;
import com.revolut.rxdata.core.CompositeException;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import fnc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.q;
import kkf.u4;
import klf.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mkf.i0;
import mx0.i1;
import mx0.v5;
import pie.s;
import qoc.r;
import tof.a3;
import wtc.k0;
import zbj.u;
import zbj.u0;
import zbj.y;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6383y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f6382x = obj2;
        this.f6383y = obj3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                k kVar = new k((l) this.f6382x, (Function1) this.f6383y, (Continuation) obj4, 0);
                kVar.v = (a3) obj2;
                kVar.f6381w = (j1) obj3;
                return kVar.invokeSuspend(Unit.f186387a);
            case 1:
                k kVar2 = new k((List) this.f6382x, (cge.h) this.f6383y, (Continuation) obj4, 1);
                kVar2.v = (Map) obj2;
                kVar2.f6381w = (Map) obj3;
                return kVar2.invokeSuspend(Unit.f186387a);
            case 2:
                k kVar3 = new k((v) this.f6382x, (UserAuthElement) this.f6383y, (Continuation) obj4, 2);
                kVar3.v = (OnboardingFlowContract$InputData) obj2;
                kVar3.f6381w = (OnboardingFlowContract$State) obj3;
                return kVar3.invokeSuspend(Unit.f186387a);
            case 3:
                k kVar4 = new k((gmd.b) this.f6382x, (String) this.f6383y, (Continuation) obj4, 3);
                kVar4.v = (Data) obj2;
                kVar4.f6381w = (Data) obj3;
                return kVar4.invokeSuspend(Unit.f186387a);
            case 4:
                k kVar5 = new k((dj0.d) this.f6382x, (dj0.d) this.f6383y, (Continuation) obj4, 4);
                kVar5.v = (dj0.d) obj2;
                kVar5.f6381w = (dj0.d) obj3;
                return kVar5.invokeSuspend(Unit.f186387a);
            case 5:
                k kVar6 = new k((i0) this.f6382x, (a3) this.f6383y, (Continuation) obj4, 5);
                kVar6.v = (a3) obj2;
                kVar6.f6381w = (q) obj3;
                return kVar6.invokeSuspend(Unit.f186387a);
            case 6:
                k kVar7 = new k((jul.o) this.f6382x, (Address) this.f6383y, (Continuation) obj4, 6);
                kVar7.v = (Data) obj2;
                kVar7.f6381w = (Data) obj3;
                return kVar7.invokeSuspend(Unit.f186387a);
            case 7:
                k kVar8 = new k((oh5.d) this.f6382x, (xi0.b) this.f6383y, (Continuation) obj4, 7);
                kVar8.v = (Data) obj2;
                kVar8.f6381w = (Data) obj3;
                return kVar8.invokeSuspend(Unit.f186387a);
            case 8:
                k kVar9 = new k((r) this.f6382x, (jlc.g) this.f6383y, (Continuation) obj4, 8);
                kVar9.v = (xoc.a) obj2;
                kVar9.f6381w = (Data) obj3;
                return kVar9.invokeSuspend(Unit.f186387a);
            case 9:
                k kVar10 = new k((jlc.k) this.f6382x, (r) this.f6383y, (Continuation) obj4, 9);
                kVar10.v = (xoc.a) obj2;
                kVar10.f6381w = (Data) obj3;
                return kVar10.invokeSuspend(Unit.f186387a);
            case 10:
                k kVar11 = new k((rbj.l) this.f6382x, (u0) this.f6383y, (Continuation) obj4, 10);
                kVar11.v = (u) obj2;
                kVar11.f6381w = (y) obj3;
                return kVar11.invokeSuspend(Unit.f186387a);
            case 11:
                k kVar12 = new k((OrderQuote) this.f6382x, (wi0.b) this.f6383y, (Continuation) obj4, 11);
                kVar12.v = (qv0.i) obj2;
                kVar12.f6381w = (Data) obj3;
                return kVar12.invokeSuspend(Unit.f186387a);
            default:
                k kVar13 = new k((k0) this.f6382x, (ConnectedWifi) this.f6383y, (Continuation) obj4, 12);
                kVar13.v = (Data) obj2;
                kVar13.f6381w = (List) obj3;
                return kVar13.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        ArrayList arrayList;
        dj0.d dVarF3;
        int i = this.u;
        boolean z = false;
        Object obj3 = this.f6382x;
        Object obj4 = this.f6383y;
        switch (i) {
            case 0:
                a3 a3Var = (a3) this.v;
                j1 j1Var = (j1) this.f6381w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Function1 function1 = (Function1) obj4;
                if (!j1Var.c() && !k71.k.m0(a3Var) && a3Var.f272624y.f273145c != io3.i.EXTERNAL && ((Boolean) function1.invoke(a3Var)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Map map = (Map) this.v;
                Map map2 = (Map) this.f6381w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                cge.h hVar = (cge.h) obj4;
                for (Object obj5 : (List) obj3) {
                    s sVar = (s) obj5;
                    List list = (List) map.get(sVar);
                    if (list == null) {
                        list = f0.f322471a;
                    }
                    List list2 = (List) map2.get(sVar);
                    if (list2 == null) {
                        list2 = f0.f322471a;
                    }
                    linkedHashMap.put(obj5, cge.h.a(hVar, list, list2));
                }
                return linkedHashMap;
            case 2:
                OnboardingFlowContract$InputData onboardingFlowContract$InputData = (OnboardingFlowContract$InputData) this.v;
                OnboardingFlowContract$State onboardingFlowContract$State = (OnboardingFlowContract$State) this.f6381w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v.L2((v) obj3, onboardingFlowContract$InputData, onboardingFlowContract$State, (UserAuthElement) obj4, false);
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                Data data3 = (Data) this.f6381w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) obj4;
                od0.i iVar = (od0.i) data3.getContent();
                n38.a aVar5 = iVar != null ? (n38.a) iVar.f224257a : null;
                Pair pair = (Pair) data2.getContent();
                fo3.c cVar = pair != null ? (fo3.c) pair.f186385a : null;
                if (Intrinsics.f(aVar5 != null ? aVar5.f211924b : null, str)) {
                    return new Data(l38.a.c(aVar5), data3.getError(), data3.getLoading());
                }
                if (Intrinsics.f(cVar != null ? cVar.f136801a : null, str)) {
                    return new Data(AccountId.Personal.f51414a, data2.getError(), data2.getLoading());
                }
                if (data2.getContent() == null || data3.getContent() == null) {
                    boolean z3 = data2.getLoading() || data3.getLoading();
                    Throwable[] elements = {data2.getError(), data3.getError()};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    if (((ArrayList) listL).isEmpty()) {
                        listL = null;
                    }
                    data = new Data(null, listL != null ? new CompositeException(listL) : null, z3, 1, null);
                } else {
                    data = new Data(null, new IllegalArgumentException("No supported account found for provided wallet"), false, 5, null);
                }
                return data;
            case 4:
                dj0.d dVar = (dj0.d) this.v;
                dj0.d dVar2 = (dj0.d) this.f6381w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dj0.d dVarA = ((dj0.d) obj3).a();
                if (dVarA.compareTo(dVar) >= 0 && dVarA.compareTo(dVar2) <= 0) {
                    z = true;
                }
                return new u4((dj0.d) obj4, z);
            case 5:
                a3 a3Var2 = (a3) this.v;
                q qVar = (q) this.f6381w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) obj3;
                a3 a3Var3 = (a3) obj4;
                Intrinsics.h(qVar);
                i0Var.getClass();
                if (a3Var2 == null) {
                    return f0.f322471a;
                }
                List listR = i2b.a.r(new PlainTextDelegate.Model("ID_DIRECT_DEBIT_REFUND_TITLE", (Clause) null, (Clause) new TextLocalisedClause(R$string.transaction_description_refunds_title, null, null, 14), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006), RowDelegate.Model.x(((anf.k) i0Var.o).p(a3Var2, qVar, new thf.f(false, 3)), null, new RowDelegate.Model.MainImage.Avatar(((bnf.o) i0Var.f206250p).h(a3Var3, qVar), (i1) null, 6), null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -3, 15));
                yp0.b.k(listR, 0, 0, 0, 0, 31);
                return listR;
            case 6:
                Data data4 = (Data) this.v;
                Data data5 = (Data) this.f6381w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data dataT = t1.t(data4, data5);
                jul.o oVar = (jul.o) obj3;
                Address address = (Address) obj4;
                try {
                    Object content = dataT.getContent();
                    if (content != null) {
                        Pair pair2 = (Pair) content;
                        List listB = jul.o.b(oVar, jul.o.b(oVar, (List) pair2.f186385a, ((FiscalProfileDetails) pair2.f186386b).f84192a), address);
                        arrayList = new ArrayList();
                        for (Object obj6 : listB) {
                            if (!cp5.c.B((Address) obj6)) {
                                arrayList.add(obj6);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return new Data(arrayList, dataT.getError(), dataT.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, dataT.getLoading());
                }
            case 7:
                Data data6 = (Data) this.v;
                Data data7 = (Data) this.f6381w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return oh5.d.a((oh5.d) obj3, data6, (xi0.b) obj4, (StakingPocket) data7.getContent());
            case 8:
                xoc.a aVar10 = (xoc.a) this.v;
                Data data8 = (Data) this.f6381w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) obj3;
                jlc.r rVarA = jlc.r.a((jlc.r) rVar.b3(), (jlc.g) obj4, new Data(aVar10.f307785a, null, false, 6, null), null, aVar10.f307786b, aVar10.f307787c, null, data8, null, null, null, null, null, null, null, 32676);
                rVar.d3(new z(rVarA, 5));
                rVar.j3(rVarA);
                return aVar10;
            case 9:
                r rVar2 = (r) obj4;
                xoc.a aVar12 = (xoc.a) this.v;
                Data data9 = (Data) this.f6381w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jlc.k kVar = (jlc.k) obj3;
                jlc.j jVar = kVar.f175689c;
                if (jVar instanceof jlc.h) {
                    dVarF3 = r.f3(rVar2, kVar.a(), zi0.c.P(aVar12.f307785a, false, null, 3), aVar12.f307786b);
                } else {
                    if (!(jVar instanceof jlc.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarF3 = aVar12.f307787c;
                }
                dj0.d dVar3 = dVarF3;
                jlc.r rVar3 = (jlc.r) rVar2.b3();
                dj0.d dVar4 = aVar12.f307786b;
                PortfolioGoal portfolioGoalA = kVar.a();
                if (portfolioGoalA != null && rVar2.h3(portfolioGoalA)) {
                    z = true;
                }
                jlc.r rVarA2 = jlc.r.a(rVar3, kVar, new Data(aVar12.f307785a, null, false, 6, null), dVar4, dVar4, dVar3, aVar12.d, data9, Boolean.valueOf(z), null, null, null, null, null, null, 32512);
                rVar2.d3(new z(rVarA2, 5));
                rVar2.j3(rVarA2);
                return aVar12;
            case 10:
                u uVar = (u) this.v;
                y yVar = (y) this.f6381w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u0 u0Var = (u0) obj4;
                ((rbj.l) obj3).getClass();
                if (u0Var == null) {
                    u0Var = u0.WALLET;
                }
                return new zbj.v(u0Var, uVar, yVar);
            case 11:
                qv0.i iVar2 = (qv0.i) this.v;
                Data data10 = (Data) this.f6381w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Throwable error = data10.getError();
                if (error != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                }
                OrderQuote orderQuote = (OrderQuote) obj3;
                wi0.b bVar = (wi0.b) obj4;
                List list3 = (List) data10.getContent();
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                return new Data(new w4i.l(orderQuote, bVar, list3, iVar2), null, false, 6, null);
            default:
                Data data11 = (Data) this.v;
                List list4 = (List) this.f6381w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                StreetModeInfo streetModeInfo = (StreetModeInfo) data11.getContent();
                if (streetModeInfo == null || !streetModeInfo.f85423a) {
                    return f0.f322471a;
                }
                k0 k0Var = (k0) obj3;
                String str2 = ((ConnectedWifi) obj4).f85467a;
                StreetModeInfo streetModeInfo2 = (StreetModeInfo) data11.getContent();
                List list5 = streetModeInfo2 != null ? streetModeInfo2.e : null;
                k0Var.getClass();
                if (list5 != null && !list4.contains(str2)) {
                    List list6 = list5;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it8 = list6.iterator();
                        while (it8.hasNext()) {
                            if (Intrinsics.f(((StreetModeTrustedWifi) it8.next()).f85432b, str2)) {
                                return f0.f322471a;
                            }
                        }
                    }
                    List listC = zhm.u.c(new ActionWidgetDelegate.Model("STREET_MODE_WIFI_SUGGESTION_LIST_ITEM_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_street_mode_trusted_wifi_suggestion_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_street_mode_trusted_wifi_suggestion_subtitle, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new com.revolut.core.ui_kit.delegates.m(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_street_mode_trusted_wifi_suggestion_action_agree, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_wealth_protection_street_mode_trusted_wifi_suggestion_action_disagree, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE), null, str2, null, false, 8016));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    return listC;
                }
                return f0.f322471a;
        }
    }
}
