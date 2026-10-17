package ghl;

import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import com.revolut.feature.cms.stories.impl.data.network.CmsStoriesService;
import com.revolut.feature.defi.asset_details.impl.data.api.DeFiAssetDetailsApiService;
import com.revolut.feature.defi.currency.impl.data.network.DeFiCurrencyService;
import com.revolut.feature.junior_rewards.impl.data.service.JuniorRewardsService;
import com.revolut.feature.payments.transfers.personalisation.impl.data.service.TransfersPersonalisationService;
import com.revolut.feature.revolut_shop.data.service.IppShopService;
import com.revolut.feature.semi_independent_activation.impl.data.service.SemiIndependentActivationInvitationService;
import com.revolut.feature.topup_screen.impl.data.repository.topup_methods.TopUpMethodsRequest;
import com.revolut.feature.user.checklist.impl.data.service.UserChecklistService;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService;
import com.revolut.shared.feature.wealth_orders.domain.impl.data.network.TradingProjectionsService;
import hwi.v;
import ij3.n;
import iz1.q;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jv.r;
import k3c.p;
import k7c.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import retrofit2.Response;
import svi.y0;
import vkm.z1;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f144011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f144012x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f144012x = obj2;
    }

    private final Object A(Object obj2) {
        String str = (String) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        SemiIndependentActivationInvitationService semiIndependentActivationInvitationService = ((k0d.f) this.f144012x).f180019a;
        this.f144011w = null;
        this.v = 1;
        Object incomingInvitations = semiIndependentActivationInvitationService.getIncomingInvitations(str, this);
        return incomingInvitations == aVar ? aVar : incomingInvitations;
    }

    private final Object B(Object obj2) {
        String str = (String) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            TransfersPersonalisationService transfersPersonalisationService = ((k2a.d) this.f144012x).f180450c;
            this.f144011w = null;
            this.v = 1;
            obj2 = transfersPersonalisationService.getPersonalisation(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return i2a.a.a((j2a.h) obj2);
    }

    private final Object C(Object obj2) {
        String str = (String) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            IppShopService ippShopService = ((p) this.f144012x).f180680a;
            this.f144011w = null;
            this.v = 1;
            obj2 = ippShopService.getOrder(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return mif.a.G((j3c.m) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06d0  */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v32, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v35, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v38, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v48, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v55, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v56, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ghl.l.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        i26.f fVar = (i26.f) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            DeFiAssetDetailsApiService deFiAssetDetailsApiService = ((i26.k) this.f144012x).f157869a;
            String str = fVar.f157862a;
            String str2 = fVar.f157863b;
            this.f144011w = null;
            this.v = 1;
            obj2 = deFiAssetDetailsApiService.getAssetDetails(str, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return v13.d.v((h26.i) obj2);
    }

    private final Object n(Object obj2) {
        img.g gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            img.g gVar2 = (img.g) this.f144012x;
            UserChecklistService userChecklistService = gVar2.f162449a;
            this.f144011w = gVar2;
            this.v = 1;
            Object userChecklist = userChecklistService.getUserChecklist(this);
            if (userChecklist == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj2 = userChecklist;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (img.g) this.f144011w;
            o.b(obj2);
        }
        return img.g.f(gVar, (Response) obj2);
    }

    private final Object o(Object obj2) {
        iz1.d dVar = (iz1.d) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        iz1.h hVar = (iz1.h) this.f144012x;
        dx1.b bVar = dVar.f169822a;
        i02.d dVar2 = dVar.f169823b;
        this.f144011w = null;
        this.v = 1;
        Object objB = iz1.h.b(hVar, bVar, dVar2, this);
        return objB == aVar ? aVar : objB;
    }

    private final Object p(Object obj2) {
        t02.g gVar = (t02.g) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ApmTransferService apmTransferService = ((q) this.f144012x).f169844a;
            hz1.h hVarJ = e0.J(gVar);
            this.f144011w = null;
            this.v = 1;
            obj2 = apmTransferService.quote(hVarJ, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return mra.d.R((hz1.o) obj2);
    }

    private final Object s(Object obj2) {
        h36.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            DeFiCurrencyService deFiCurrencyService = ((j36.e) this.f144012x).f170977a;
            h36.a aVar3 = h36.a.f149038a;
            this.f144011w = aVar3;
            this.v = 1;
            obj2 = deFiCurrencyService.getCurrencies(null, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (h36.a) this.f144011w;
            o.b(obj2);
        }
        aVar.getClass();
        return h36.a.a((List) obj2);
    }

    private final Object t(Object obj2) {
        dil.a aVar = (dil.a) this.f144011w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            jil.a aVar3 = (jil.a) this.f144012x;
            TradingProjectionsService tradingProjectionsService = aVar3.f174608a;
            String str = aVar.d;
            String str2 = aVar.f115075a;
            LocalDate localDateE = aVar.f115076b;
            if (localDateE == null) {
                localDateE = ((l80.f) aVar3.d).e();
            }
            String string = localDateE.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String strB = aVar.f115077c.b();
            this.f144011w = null;
            this.v = 1;
            obj2 = tradingProjectionsService.getTradingProjections(str, str2, string, strB, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return gil.a.a((iil.a) obj2);
    }

    private final Object u(Object obj2) {
        jj3.c cVar = (jj3.c) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            CmsStoriesService cmsStoriesService = ((jj3.e) this.f144012x).f174632a;
            String str = cVar.f174630a;
            Map<String, String> map = cVar.f174631b;
            this.f144011w = null;
            this.v = 1;
            obj2 = cmsStoriesService.getStory(str, map, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return gj3.b.a((n) obj2);
    }

    private final Object v(Object obj2) {
        String str = (String) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            JuniorRewardsService juniorRewardsService = ((jm8.b) this.f144012x).f176489a;
            this.f144011w = null;
            this.v = 1;
            obj2 = juniorRewardsService.getPartnershipsEligibility(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return gj7.b.N((lm8.c) obj2);
    }

    private final Object w(Object obj2) {
        String str = (String) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        jtj.k kVar = (jtj.k) this.f144012x;
        this.f144011w = null;
        this.v = 1;
        Serializable serializableA = jtj.k.a(kVar, str, this);
        return serializableA == aVar ? aVar : serializableA;
    }

    private final Object x(Object obj2) {
        IncomeSorter incomeSorterA;
        String str = (String) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            IncomeSorterService incomeSorterService = ((jtj.n) this.f144012x).f178523c;
            this.f144011w = null;
            this.v = 1;
            obj2 = incomeSorterService.getIncomeSorters(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = ((Iterable) obj2).iterator();
        while (it8.hasNext()) {
            try {
                incomeSorterA = gtj.b.a((htj.l) it8.next());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                incomeSorterA = null;
            }
            if (incomeSorterA != null) {
                arrayList.add(incomeSorterA);
            }
        }
        return arrayList;
    }

    private final Object y(Object obj2) {
        Throwable th10 = (Throwable) this.f144011w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            z1 z1Var = ((r) this.f144012x).f178729s;
            Intrinsics.checkNotNullParameter(th10, "<this>");
            Intrinsics.checkNotNullParameter("camera state unexpected error", "message");
            dv.b bVar = new dv.b(new CameraKitException("camera state unexpected error", th10, 4));
            this.f144011w = null;
            this.v = 1;
            if (z1Var.emit(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                l lVar = new l((m) this.f144012x, (Continuation) obj4, 0);
                lVar.f144011w = (String) obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l((gxa.c) this.f144012x, (Continuation) obj4, 1);
                lVar2.f144011w = (String) obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            case 2:
                l lVar3 = new l((h9f.d) this.f144012x, (Continuation) obj4, 2);
                lVar3.f144011w = (String) obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
            case 3:
                l lVar4 = new l((hng.q) this.f144012x, (Continuation) obj4, 3);
                lVar4.f144011w = (hng.n) obj3;
                return lVar4.invokeSuspend(Unit.f186387a);
            case 4:
                l lVar5 = new l((hu7.b) this.f144012x, (Continuation) obj4, 4);
                lVar5.f144011w = (hu7.a) obj3;
                return lVar5.invokeSuspend(Unit.f186387a);
            case 5:
                l lVar6 = new l((hu7.j) this.f144012x, (Continuation) obj4, 5);
                lVar6.f144011w = (hu7.f) obj3;
                return lVar6.invokeSuspend(Unit.f186387a);
            case 6:
                l lVar7 = new l((hu7.j) this.f144012x, (Continuation) obj4, 6);
                lVar7.f144011w = (hu7.h) obj3;
                return lVar7.invokeSuspend(Unit.f186387a);
            case 7:
                l lVar8 = new l((hu7.l) this.f144012x, (Continuation) obj4, 7);
                lVar8.f144011w = (hu7.k) obj3;
                return lVar8.invokeSuspend(Unit.f186387a);
            case 8:
                l lVar9 = new l((hu7.o) this.f144012x, (Continuation) obj4, 8);
                lVar9.f144011w = (hu7.n) obj3;
                return lVar9.invokeSuspend(Unit.f186387a);
            case 9:
                l lVar10 = new l((hve.o) this.f144012x, (Continuation) obj4, 9);
                lVar10.f144011w = (hve.a) obj3;
                return lVar10.invokeSuspend(Unit.f186387a);
            case 10:
                l lVar11 = new l((hve.o) this.f144012x, (Continuation) obj4, 10);
                lVar11.f144011w = (TopUpMethodsRequest) obj3;
                return lVar11.invokeSuspend(Unit.f186387a);
            case 11:
                l lVar12 = new l((v) this.f144012x, (Continuation) obj4, 11);
                lVar12.f144011w = (hwi.q) obj3;
                return lVar12.invokeSuspend(Unit.f186387a);
            case 12:
                l lVar13 = new l((hwi.h0) this.f144012x, (Continuation) obj4, 12);
                lVar13.f144011w = (y0) obj3;
                return lVar13.invokeSuspend(Unit.f186387a);
            case 13:
                l lVar14 = new l((i26.c) this.f144012x, (Continuation) obj4, 13);
                lVar14.f144011w = (i26.a) obj3;
                return lVar14.invokeSuspend(Unit.f186387a);
            case 14:
                l lVar15 = new l((i26.k) this.f144012x, (Continuation) obj4, 14);
                lVar15.f144011w = (i26.h) obj3;
                return lVar15.invokeSuspend(Unit.f186387a);
            case 15:
                l lVar16 = new l((i26.k) this.f144012x, (Continuation) obj4, 15);
                lVar16.f144011w = (i26.f) obj3;
                return lVar16.invokeSuspend(Unit.f186387a);
            case 16:
                return new l((img.g) this.f144012x, (Continuation) obj4, 16).invokeSuspend(Unit.f186387a);
            case 17:
                l lVar17 = new l((iz1.h) this.f144012x, (Continuation) obj4, 17);
                lVar17.f144011w = (iz1.d) obj3;
                return lVar17.invokeSuspend(Unit.f186387a);
            case 18:
                l lVar18 = new l((q) this.f144012x, (Continuation) obj4, 18);
                lVar18.f144011w = (t02.g) obj3;
                return lVar18.invokeSuspend(Unit.f186387a);
            case 19:
                return new l((j36.e) this.f144012x, (Continuation) obj4, 19).invokeSuspend(Unit.f186387a);
            case 20:
                l lVar19 = new l((jil.a) this.f144012x, (Continuation) obj4, 20);
                lVar19.f144011w = (dil.a) obj3;
                return lVar19.invokeSuspend(Unit.f186387a);
            case 21:
                l lVar20 = new l((jj3.e) this.f144012x, (Continuation) obj4, 21);
                lVar20.f144011w = (jj3.c) obj3;
                return lVar20.invokeSuspend(Unit.f186387a);
            case 22:
                l lVar21 = new l((jm8.b) this.f144012x, (Continuation) obj4, 22);
                lVar21.f144011w = (String) obj3;
                return lVar21.invokeSuspend(Unit.f186387a);
            case 23:
                l lVar22 = new l((jtj.k) this.f144012x, (Continuation) obj4, 23);
                lVar22.f144011w = (String) obj3;
                return lVar22.invokeSuspend(Unit.f186387a);
            case 24:
                l lVar23 = new l((jtj.n) this.f144012x, (Continuation) obj4, 24);
                lVar23.f144011w = (String) obj3;
                return lVar23.invokeSuspend(Unit.f186387a);
            case 25:
                l lVar24 = new l((r) this.f144012x, (Continuation) obj4, 25);
                lVar24.f144011w = (Throwable) obj3;
                return lVar24.invokeSuspend(Unit.f186387a);
            case 26:
                l lVar25 = new l((k0d.f) this.f144012x, (Continuation) obj4, 26);
                lVar25.f144011w = (String) obj3;
                return lVar25.invokeSuspend(Unit.f186387a);
            case 27:
                l lVar26 = new l((k2a.d) this.f144012x, (Continuation) obj4, 27);
                lVar26.f144011w = (String) obj3;
                return lVar26.invokeSuspend(Unit.f186387a);
            case 28:
                l lVar27 = new l((p) this.f144012x, (Continuation) obj4, 28);
                lVar27.f144011w = (String) obj3;
                return lVar27.invokeSuspend(Unit.f186387a);
            default:
                l lVar28 = new l((z) this.f144012x, (Continuation) obj4, 29);
                lVar28.f144011w = (u6c.p) obj3;
                return lVar28.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x089d A[LOOP:10: B:364:0x081f->B:388:0x089d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x08ad A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v14, types: [com.revolut.feature.topup_screen.api.model.StoredMethod$Mandate] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v30, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ghl.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
