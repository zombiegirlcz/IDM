package im9;

import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.View;
import androidx.room.util.DBUtil;
import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.financial_evidence.FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.donations.impl.ui.mapper.DonateSuccessStatusDialogMapper;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.api.navigation.MandateDetailsDestination;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.shared.help_centre.impl.utils.FaqNotFoundException;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import d27.g0;
import ft3.h1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jq9.t;
import jxi.e0;
import k25.u;
import khg.s;
import knd.i1;
import knd.j0;
import knd.n;
import knd.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kye.c0;
import kye.k3;
import l97.i0;
import mii.q;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import skm.l;
import vkm.j2;
import wim.z;
import xu3.o0;
import yhm.m;
import yhm.o;
import yhm.r;
import yw4.p;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f162326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f162327x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f162327x = str;
        this.f162326w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h((i) this.f162326w, (String) this.f162327x, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.f162326w, (imh.j) this.f162327x, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                return new h((j34.g) this.v, (h1) this.f162326w, (String) this.f162327x, continuation, 2);
            case 3:
                return new h((j34.g) this.v, (h1) this.f162326w, (o0) this.f162327x, continuation, 3);
            case 4:
                return new h((j34.g) this.v, (h1) this.f162326w, (Set) this.f162327x, continuation, 4);
            case 5:
                h hVar3 = new h((j72.b) this.f162326w, (Function0) this.f162327x, continuation, 5);
                hVar3.v = obj2;
                return hVar3;
            case 6:
                h hVar4 = new h((jh6.g) this.f162326w, (Mandate) this.f162327x, continuation, 6);
                hVar4.v = obj2;
                return hVar4;
            case 7:
                h hVar5 = new h((com.revolut.feature.address.common.impl.flow.screen.find.b) this.f162326w, (String) this.f162327x, continuation, 7);
                hVar5.v = obj2;
                return hVar5;
            case 8:
                h hVar6 = new h((js7.d) this.f162326w, (Function1) this.f162327x, continuation, 8);
                hVar6.v = obj2;
                return hVar6;
            case 9:
                h hVar7 = new h(continuation, (u) this.f162326w, (p) this.f162327x, 9);
                hVar7.v = obj2;
                return hVar7;
            case 10:
                h hVar8 = new h(continuation, (List) this.f162326w, (u) this.f162327x, 10);
                hVar8.v = obj2;
                return hVar8;
            case 11:
                h hVar9 = new h((String) this.f162327x, (com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.f162326w, continuation);
                hVar9.v = obj2;
                return hVar9;
            case 12:
                h hVar10 = new h((y0) this.f162326w, (kb6.c) this.f162327x, continuation, 12);
                hVar10.v = obj2;
                return hVar10;
            case 13:
                h hVar11 = new h((kge.d) this.f162326w, (String) this.f162327x, continuation, 13);
                hVar11.v = obj2;
                return hVar11;
            case 14:
                return new h((kge.d) this.v, (List) this.f162326w, (ArrayList) this.f162327x, continuation, 14);
            case 15:
                h hVar12 = new h((Function0) this.f162326w, (k8e.a) this.f162327x, continuation, 15);
                hVar12.v = obj2;
                return hVar12;
            case 16:
                return new h(16, (kl9.c) this.v, (File) this.f162326w, (String) this.f162327x, continuation);
            case 17:
                h hVar13 = new h((List) this.f162326w, (knd.e) this.f162327x, continuation, 17);
                hVar13.v = obj2;
                return hVar13;
            case 18:
                h hVar14 = new h((knd.p) this.f162326w, (v) this.f162327x, continuation, 18);
                hVar14.v = obj2;
                return hVar14;
            case 19:
                h hVar15 = new h((j0) this.f162326w, (amd.i) this.f162327x, continuation, 19);
                hVar15.v = obj2;
                return hVar15;
            case 20:
                return new h((knd.h1) this.v, (l) this.f162326w, (skm.h1) this.f162327x, continuation, 20);
            case 21:
                return new h((kq.i[]) this.v, (kq.h) this.f162326w, (kq.i[]) this.f162327x, continuation, 21);
            case 22:
                h hVar16 = new h((a5h.g) this.f162326w, (Function2) this.f162327x, continuation, 22);
                hVar16.v = obj2;
                return hVar16;
            case 23:
                h hVar17 = new h((View) this.f162326w, (AmountNewScreen) this.f162327x, continuation, 23);
                hVar17.v = obj2;
                return hVar17;
            case 24:
                return new h(24, (kyl.i) this.v, (Bitmap) this.f162326w, (String) this.f162327x, continuation);
            case 25:
                h hVar18 = new h((l25.u) this.f162326w, (zl4.h) this.f162327x, continuation, 25);
                hVar18.v = obj2;
                return hVar18;
            case 26:
                h hVar19 = new h((GlobalSearchScreen) this.f162326w, (String) this.f162327x, continuation, 26);
                hVar19.v = obj2;
                return hVar19;
            case 27:
                return new h((StatusDialogScreen) this.v, (com.revolut.core.backend_flow.impl.internal_flow.b) this.f162326w, (BackendFlow) this.f162327x, continuation, 27);
            case 28:
                h hVar20 = new h((ldi.f) this.f162326w, (RevPointsTransactionPageParams) this.f162327x, continuation, 28);
                hVar20.v = obj2;
                return hVar20;
            default:
                h hVar21 = new h((le3.f) this.f162326w, (AnalyticsAccount) this.f162327x, continuation, 29);
                hVar21.v = obj2;
                return hVar21;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((h) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((h) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((h) create((nie.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((h) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((h) create((DateTime) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((h) create((GroupingExtraData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((h) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((h) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((h) create((RevPointsPocketState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException, FaqNotFoundException {
        Object obj3;
        String strA;
        i1 i1Var;
        CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData;
        int i = this.u;
        int i2 = 2;
        int i3 = 10;
        int i5 = 0;
        int i6 = 1;
        Continuation continuation = null;
        Object obj4 = this.f162327x;
        Object obj5 = this.f162326w;
        switch (i) {
            case 0:
                Map map = (Map) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) obj5;
                String str = (String) obj4;
                Iterator it8 = w.u(map.values()).iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        f4h.a aVar2 = iVar.d;
                        if (Intrinsics.f(f4h.a.m((t) next), str)) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                t tVar = (t) obj3;
                if (tVar != null && (strA = tVar.a()) != null) {
                    return strA;
                }
                m70.a.c(t0.f186434a);
                return "";
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a aVar4 = (com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) obj5;
                aVar4.H2(aVar4.H, new ijg.c((imh.j) obj4, data, 11));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j34.g gVar = (j34.g) this.v;
                ve0.c cVar = gVar.e;
                h1 h1Var = (h1) obj5;
                String strE = j34.g.e(h1Var);
                ve0.c cVar2 = gVar.e;
                String strE2 = j34.g.e(h1Var);
                Type type = new FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getRevolutTransactionIdsType(...)");
                LinkedHashSet linkedHashSetJ = a1.j((Set) cVar2.v0(h0.f322473a, strE2, type), (String) obj4);
                Type type2 = new FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type2, "access$getRevolutTransactionIdsType(...)");
                cVar.G(linkedHashSetJ, strE, type2);
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j34.g gVar2 = (j34.g) this.v;
                gVar2.e.G((o0) obj4, j34.g.b(gVar2, (h1) obj5), z.d(kotlin.jvm.internal.o0.b(o0.class)));
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ve0.c cVar3 = ((j34.g) this.v).e;
                String strE3 = j34.g.e((h1) obj5);
                Type type3 = new FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type3, "access$getRevolutTransactionIdsType(...)");
                cVar3.G((Set) obj4, strE3, type3);
                return Unit.f186387a;
            case 5:
                n1 n1Var = (n1) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j72.b) obj5).Z2(n1Var, (Function0) obj4);
                return Unit.f186387a;
            case 6:
                jh6.g gVar3 = (jh6.g) obj5;
                n1 n1Var2 = (n1) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var2 instanceof l1) {
                    gVar3.C1(new MandateDetailsDestination((Mandate) obj4));
                } else {
                    gVar3.y2();
                }
                return Unit.f186387a;
            case 7:
                Data data2 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar = (com.revolut.feature.address.common.impl.flow.screen.find.b) obj5;
                bVar.H2(bVar.u, new j2c.o(bVar, 9, data2, (String) obj4));
                return Unit.f186387a;
            case 8:
                List list = (List) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list2 = list;
                js7.d dVar = (js7.d) obj5;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList.add(dVar.f178154c.a(((p) it9.next()).f317325a, wr7.a.CREDIT_CARD, w4l.h.f294642c));
                }
                if (arrayList.isEmpty()) {
                    return new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
                }
                Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
                return nim.a.v(u0.l((Flow[]) Arrays.copyOf(flowArr, flowArr.length)), new js7.c(i5, (Function1) obj4));
            case 9:
                r rVar = (r) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar2 = (r) rVar.f314201a;
                r rVar3 = (r) rVar.f314202b;
                Pair pair = (Pair) rVar.f314203c;
                Object obj6 = rVar2.f314201a;
                Object obj7 = rVar2.f314202b;
                Object obj8 = rVar2.f314203c;
                Object obj9 = rVar3.f314201a;
                Object obj10 = rVar3.f314202b;
                Object obj11 = rVar3.f314203c;
                Object obj12 = pair.f186385a;
                xr7.f fVar = (xr7.f) pair.f186386b;
                od0.i iVar2 = (od0.i) obj12;
                wi0.b bVar2 = (wi0.b) obj9;
                CreditCard creditCard = (CreditCard) obj6;
                boolean zN = com.bumptech.glide.d.n(bVar2);
                u uVar = (u) obj5;
                m25.l lVar = uVar.f180350c;
                CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) ((od0.i) obj8).f224257a;
                ll4.o oVar = (ll4.o) ((Map) obj10).get(((p) obj4).f317325a);
                AdditionalCardholdersState additionalCardholdersState = creditCard.v;
                yw4.l lVar2 = creditCard.u;
                List list3 = creditCard.f69802q;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(new yw4.g((yw4.f) it10.next()));
                }
                return lVar.a(uVar.q(creditCard, creditCardAutopayPayments, zN, oVar, additionalCardholdersState, lVar2, bVar2, arrayList2, fVar, iVar2));
            case 10:
                Pair pair2 = (Pair) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar4 = (r) pair2.f186385a;
                Pair pair3 = (Pair) pair2.f186386b;
                Object obj13 = rVar4.f314201a;
                Object obj14 = rVar4.f314202b;
                Object obj15 = rVar4.f314203c;
                Object obj16 = pair3.f186385a;
                Map map2 = (Map) pair3.f186386b;
                Map map3 = (Map) obj16;
                Map map4 = (Map) obj15;
                wi0.b bVar3 = (wi0.b) obj14;
                Map map5 = (Map) obj13;
                boolean zN2 = com.bumptech.glide.d.n(bVar3);
                List<CreditCard> list4 = (List) obj5;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                for (CreditCard creditCard2 : list4) {
                    u uVar2 = (u) obj4;
                    String str2 = creditCard2.f69792a;
                    String str3 = creditCard2.f69792a;
                    od0.i iVar3 = (od0.i) map5.get(str2);
                    CreditCardAutopayPayments creditCardAutopayPayments2 = iVar3 != null ? (CreditCardAutopayPayments) iVar3.f224257a : continuation;
                    ll4.o oVar2 = (ll4.o) map4.get(str3);
                    AdditionalCardholdersState additionalCardholdersState2 = creditCard2.v;
                    yw4.l lVar3 = yw4.l.FULL_ACCESS;
                    List list5 = creditCard2.f69802q;
                    Map map6 = map4;
                    Map map7 = map5;
                    List arrayList4 = new ArrayList(w.t(list5, i3));
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        arrayList4.add(new yw4.g((yw4.f) it11.next()));
                    }
                    xr7.f fVar2 = (xr7.f) map2.get(str3);
                    if (fVar2 == null) {
                        fVar2 = xr7.d.f308290a;
                    }
                    xr7.f fVar3 = fVar2;
                    od0.i iVar4 = (od0.i) map3.get(str3);
                    if (iVar4 == null) {
                        od0.i.Companion.getClass();
                        iVar4 = od0.i.f224256b;
                    }
                    od0.i iVar5 = iVar4;
                    k25.b bVar4 = u.Companion;
                    arrayList3.add(uVar2.q(creditCard2, creditCardAutopayPayments2, zN2, oVar2, additionalCardholdersState2, lVar3, bVar3, arrayList4, fVar3, iVar5));
                    map4 = map6;
                    map5 = map7;
                    i3 = 10;
                    continuation = null;
                }
                return arrayList3;
            case 11:
                Data data3 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!data3.getLoading() && data3.getContent() == null && data3.getError() == null) {
                    throw new FaqNotFoundException((String) obj4);
                }
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) obj5).x2(new e0(data3, 25));
                return Unit.f186387a;
            case 12:
                kb6.c cVar4 = (kb6.c) obj4;
                n1 n1Var3 = (n1) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String str4 = ((y0) obj5).f216243a;
                boolean zF = Intrinsics.f(str4, "REGULAR_DONATION_SUCCESS_STATUS_VIEW_ID");
                kb6.a aVar16 = kb6.a.f182522b;
                if (zF) {
                    Parcelable parcelableA = n1Var3.a().a();
                    DonateSuccessStatusDialogMapper.SuccessUrl successUrl = parcelableA instanceof DonateSuccessStatusDialogMapper.SuccessUrl ? (DonateSuccessStatusDialogMapper.SuccessUrl) parcelableA : null;
                    String str5 = successUrl != null ? successUrl.f72113a : null;
                    if (str5 == null || str5.length() <= 0) {
                        cVar4.r2().M0(aVar16);
                    } else {
                        cVar4.r2().M0(aVar16);
                        cVar4.A2(new ExternalDestination.Browser(str5, null));
                    }
                } else if (Intrinsics.f(str4, "CARD_UNLOCK_DONATION_SUCCESS_STATUS_VIEW_ID")) {
                    if (n1Var3 instanceof l1) {
                        Parcelable parcelableA2 = ((l1) n1Var3).f216190a.a();
                        if (parcelableA2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cVar4.r2().M0(aVar16);
                        cVar4.A2(new BridgeDestination(cVar4.f182523l.c(((DonateSuccessStatusDialogMapper.CampaignUnlocked) parcelableA2).f72112a)));
                    } else if ((n1Var3 instanceof m1) || (n1Var3 instanceof k1)) {
                        cVar4.r2().M0(aVar16);
                    } else {
                        if (!(n1Var3 instanceof j1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i21 = jli.h.f175850a;
                    }
                }
                return Unit.f186387a;
            case 13:
                String str6 = (String) obj4;
                ne0.d dVar2 = (ne0.d) ((kge.d) obj5).f183975c;
                nie.a aVar17 = (nie.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (aVar17 == null) {
                } else {
                    dVar2.f(str6, aVar17);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dge.b bVar5 = (dge.b) ((kge.d) this.v).f183974b;
                DBUtil.performBlocking(bVar5.f114648a, false, true, new g0(bVar5, 17, cj9.c.X((List) obj5), cj9.c.X((ArrayList) obj4)));
                return Unit.f186387a;
            case 15:
                n1 n1Var4 = (n1) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var4 instanceof l1) {
                    ((Function0) obj5).invoke();
                } else {
                    ((k8e.a) obj4).invoke();
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                File file = (File) obj5;
                File file2 = new File(((a80.h) ((kl9.c) this.v).f185410a).k((String) obj4), j6.a.q("scan_flow_file.", lim.o.n(file)));
                if (Intrinsics.f(file.getCanonicalPath(), file2.getCanonicalPath())) {
                    return file;
                }
                file2.delete();
                if (file.renameTo(file2)) {
                    return file2;
                }
                lim.o.l(file, file2);
                file.delete();
                return file2;
            case 17:
                knd.e eVar = (knd.e) obj4;
                xi0.b bVar6 = (xi0.b) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list6 = (List) obj5;
                if (list6.isEmpty()) {
                    od0.h hVar = od0.i.Companion;
                    dj0.d dVar3 = new dj0.d(0L, bVar6);
                    hVar.getClass();
                    return zi0.c.i(od0.h.a(dVar3));
                }
                List list7 = list6;
                if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                    Iterator it12 = list7.iterator();
                    while (it12.hasNext()) {
                        if (!Intrinsics.f(((dj0.d) it12.next()).f115083b, bVar6)) {
                            ppk.f fVar4 = eVar.d;
                            ArrayList arrayList5 = new ArrayList(w.t(list7, 10));
                            Iterator it13 = list7.iterator();
                            while (it13.hasNext()) {
                                arrayList5.add(((dj0.d) it13.next()).f115083b);
                            }
                            return nim.a.v(cp5.c.D(fVar4, d0.U(arrayList5), bVar6), new s(eVar, i6, bVar6, list6));
                        }
                    }
                }
                od0.h hVar2 = od0.i.Companion;
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                for (Object obj17 : list7) {
                    int i22 = i5 + 1;
                    if (i5 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarO = i5 == 0 ? (dj0.d) obj17 : pyd.c.O(dVarO, (dj0.d) obj17);
                    i5 = i22;
                }
                hVar2.getClass();
                return zi0.c.i(od0.h.a(dVarO));
            case 18:
                DateTime dateTime = (DateTime) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                LocalDate localDate = dateTime.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                java.time.LocalDate localDateE = jli.b.e(localDate);
                knd.p pVar = (knd.p) obj5;
                if (pVar instanceof knd.o) {
                    knd.o oVar3 = (knd.o) pVar;
                    List list8 = oVar3.f186120a;
                    List list9 = oVar3.f186121b;
                    if (oVar3.d) {
                        localDateE = java.time.LocalDate.MIN;
                    }
                    Intrinsics.h(localDateE);
                    i1Var = new i1(list8, list9, localDateE);
                } else {
                    if (!(pVar instanceof n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n nVar = (n) pVar;
                    lzi.j jVar = nVar.f186115a;
                    lzi.h hVarN = xam.a.n(nVar.f186116b, jVar.f200980a, jVar.b());
                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = jVar.f200981b;
                    lzi.i iVar6 = jVar.f200980a;
                    kzi.a aVar24 = ((v) obj4).e;
                    i1Var = new i1(hVarN != null ? ((gqj.c) aVar24).a(localDateE, hVarN) : ((gqj.c) aVar24).c(localDateE, iVar6, analyticsSpendingPeriod$Interval), zhm.u.c(jVar.f200981b), localDateE);
                }
                return i1Var;
            case 19:
                GroupingExtraData groupingExtraData = (GroupingExtraData) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j0) obj5).e.put((amd.i) obj4, groupingExtraData);
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar4 = (l) obj5;
                skm.h1 h1Var2 = (skm.h1) obj4;
                if (!lVar4.y()) {
                    m.Companion companion = m.INSTANCE;
                    lVar4.resumeWith(h1Var2);
                }
                return Unit.f186387a;
            case 21:
                kq.h hVar3 = (kq.h) obj5;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kq.i[] iVarArr = (kq.i[]) this.v;
                if (iVarArr.length == 0) {
                    return Boolean.valueOf(hVar3.c().I0("widgets"));
                }
                if (Arrays.equals(iVarArr, (kq.i[]) obj4)) {
                    return Unit.f186387a;
                }
                hVar3.c().G(iVarArr, "widgets", kii.e.o(kq.i.class, KTypeProjection.INSTANCE, kq.i[].class));
                return Unit.f186387a;
            case 22:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Function2 function2 = (Function2) obj4;
                Iterator it14 = ((List) ((a5h.g) obj5).f1407c).iterator();
                while (true) {
                    int i32 = i5;
                    if (!it14.hasNext()) {
                        return Unit.f186387a;
                    }
                    Object next2 = it14.next();
                    i5 = i32 + 1;
                    Continuation continuation2 = null;
                    if (i32 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    skm.e0.C(coroutineScope, null, null, new dp4.y0((StateFlow) next2, function2, i32, continuation2, 8), 3);
                }
                break;
            case 23:
                ty0.a aVar29 = (ty0.a) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0m.e.a((View) obj5);
                kye.g0 g0VarF3 = ((AmountNewScreen) obj4).R2();
                String id10 = aVar29.f275445a;
                k3 k3Var = (k3) g0VarF3;
                k3Var.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "UNVERIFIED_CARD_LIMIT_REACHED_LEARN_MORE_ID")) {
                    y yVar = k3Var.f190763d0;
                    String str7 = ((kye.m) ((j2) yVar.f22677a).getValue()).f190775b;
                    kye.m mVar = (kye.m) ((j2) yVar.f22677a).getValue();
                    if (k3Var.f190762b0) {
                        List list10 = mVar.E;
                        if (list10 == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("state.unverifiedCardLimitsRevamped should be in state once limit learn more footer clicked");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        } else {
                            SelectedMethod selectedMethod = mVar.f190786s;
                            if (selectedMethod instanceof SelectedMethod.StoredMethod.Card) {
                                k3Var.C2(mra.d.C(list10) ? new kye.s(((SelectedMethod.StoredMethod.Card) selectedMethod).f90903a, str7, null) : new kye.d0(((SelectedMethod.StoredMethod.Card) selectedMethod).f90903a, list10, str7, null));
                            } else if (!(selectedMethod instanceof vye.b) || (cardDetailsScreenDescriptor$OutputData$CardData = ((vye.b) selectedMethod).e) == null) {
                                IllegalStateException illegalStateException2 = new IllegalStateException("Selected method should be card or new card with card data once unverified card limits dialog called");
                                h0 h0Var2 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                            } else {
                                CardDetails cardDetails = cardDetailsScreenDescriptor$OutputData$CardData.f90484a;
                                String str8 = cardDetailsScreenDescriptor$OutputData$CardData.d;
                                if (str8 == null) {
                                    IllegalStateException illegalStateException3 = new IllegalStateException("New card id was null once unverified card limits dialog called");
                                    h0 h0Var3 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                } else {
                                    k3Var.C2(mra.d.C(list10) ? new kye.s(str8, str7, cardDetails) : new kye.d0(str8, list10, str7, cardDetails));
                                }
                            }
                        }
                    } else {
                        aue.a aVar31 = mVar.C;
                        if (aVar31 == null) {
                            IllegalStateException illegalStateException4 = new IllegalStateException("unverifiedCardLimit should be in state once limit learn more footer clicked");
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
                        } else {
                            dj0.d dVar4 = aVar31.f9805c;
                            dj0.d dVar5 = aVar31.f9804b;
                            xi0.b.Companion.getClass();
                            k3Var.C2(new c0(dVar4, dVar5, xi0.a.a(str7)));
                        }
                    }
                } else if (Intrinsics.f(id10, "PRE_KYC_LEARN_MORE_ID")) {
                    j60.a aVar32 = k3Var.v;
                    ((gye.e) k3Var.u).getClass();
                    rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.topup_prekyc_dialog_learn_more_title, null, null, 14), new TextLocalisedClause(R$string.topup_prekyc_dialog_learn_more_subtitle, null, null, 14), null, 28);
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ITEM_PRE_KYC_LEARN_MORE_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.topup_checkout_got_it, null, null, 14), false, null, null, null, null, 1000);
                    int i33 = R$attr.uikit_dp24;
                    int i43 = R$attr.uikit_dp16;
                    yp0.b.p(model, i33, R$attr.uikit_dp8, i43, i43);
                    aVar32.x(new rp0.y(zhm.u.c(model), tVar2, null, null, null, null, 1020));
                } else {
                    IllegalStateException illegalStateException5 = new IllegalStateException(p.a.p("Clause click for id ", id10, " is invalid on Add money"));
                    h0 h0Var5 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException5, h0Var5);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                File file3 = ((kyl.i) this.v).f191024a;
                file3.mkdirs();
                File file4 = new File(file3, (String) obj4);
                FileOutputStream fileOutputStream = new FileOutputStream(file4);
                try {
                    ((Bitmap) obj5).compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
                    fileOutputStream.close();
                    file4.setLastModified(System.currentTimeMillis());
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        com.bumptech.glide.d.e(fileOutputStream, th10);
                        throw th11;
                    }
                }
            case 25:
                q qVar = (q) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (qVar instanceof mii.m) {
                    l25.u uVar3 = (l25.u) obj5;
                    r25.b.c3(uVar3, "undo-credit-card-display-amount", new l25.n(uVar3, (zl4.h) obj4, continuation, i2), 4);
                }
                return Unit.f186387a;
            case 26:
                List items = (List) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l97.r rVar5 = ((GlobalSearchScreen) obj5).f74630v0;
                if (rVar5 != null) {
                    l97.r rVar6 = ((i0) rVar5).f193063a.equals((String) obj4) ? rVar5 : null;
                    if (rVar6 != null) {
                        Intrinsics.h(items);
                        i0 i0Var = (i0) rVar6;
                        Intrinsics.checkNotNullParameter(items, "items");
                        int size = items.size();
                        while (i5 < size) {
                            i0Var.i.add(((koi.j) items.get(i5)).getF55091b());
                            i5++;
                        }
                    }
                }
                return Unit.f186387a;
            case 27:
                BackendFlow backendFlow = (BackendFlow) obj4;
                com.revolut.core.backend_flow.impl.internal_flow.b bVar7 = (com.revolut.core.backend_flow.impl.internal_flow.b) obj5;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String str9 = ((StatusDialogScreen) this.v).f;
                if (str9 != null) {
                    bVar7.K2(backendFlow);
                    bVar7.l2(new la0.f(bVar7, str9, continuation, i6), new yi5.b(26));
                } else {
                    bVar7.K2(backendFlow);
                }
                return Unit.f186387a;
            case 28:
                RevPointsTransactionPageParams revPointsTransactionPageParams = (RevPointsTransactionPageParams) obj4;
                ldi.f fVar5 = (ldi.f) obj5;
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                RevPointsPocketInfo revPointsPocketInfoA = com.revolut.feature_rev_points_pocket_api.model.a.a(revPointsPocketState);
                Continuation continuation3 = null;
                String str10 = revPointsPocketInfoA != null ? revPointsPocketInfoA.f97784a : null;
                return str10 == null ? vkm.i.f290039a : xam.a.h(new a9h.a(fVar5, str10, revPointsTransactionPageParams, continuation3, 16), rd0.e.b(fVar5.d.c(revPointsTransactionPageParams)));
            default:
                Data data4 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list11 = (List) data4.getContent();
                if (list11 != null) {
                    ((le3.f) obj5).e.put((AnalyticsAccount) obj4, list11);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f162326w = obj3;
        this.f162327x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162326w = obj2;
        this.f162327x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, com.revolut.feature.shared.help_centre.impl.faq.screens.list.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 11;
        this.f162327x = str;
        this.f162326w = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.u = i;
        this.f162326w = obj2;
        this.f162327x = obj3;
    }
}
