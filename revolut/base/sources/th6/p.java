package th6;

import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import com.revolut.core.faq.data.network.HelpCenterService;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.junior_transfer.impl.service.JuniorDetailedTransferSettingsService;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.feature.trading_asset_quotes.impl.data.network.services.FiatExchangeOrderQuoteService;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingEligibilityService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingReceiverService;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import vdl.d0;
import vdl.h0;
import vdl.j1;
import vdl.l1;
import wf0.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f271289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f271290x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b80.c cVar, vdl.h hVar, Continuation continuation) {
        super(3, continuation);
        this.u = 16;
        this.f271289w = cVar;
        this.f271290x = hVar;
    }

    private final Object b(Object obj2) {
        String str = (String) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ApmPaymentAuthorisationsService apmPaymentAuthorisationsService = ((vz1.g) this.f271290x).f293363a;
            this.f271289w = null;
            this.v = 1;
            obj2 = apmPaymentAuthorisationsService.getPaymentAuthorisationsById(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return l02.c.a((k02.e) obj2);
    }

    private final Object c(Object obj2) {
        DraftRoutingKey draftRoutingKey = (DraftRoutingKey) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            w20.e eVar = (w20.e) this.f271290x;
            this.f271289w = null;
            this.v = 1;
            obj2 = w20.e.a(eVar, draftRoutingKey, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        o30.c cVar = (o30.c) obj2;
        if (cVar != null) {
            return cVar;
        }
        o30.c.Companion.getClass();
        return o30.c.f221671c;
    }

    private final Object n(Object obj2) {
        kbk.h hVar;
        kbk.g gVar;
        String str = (String) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        kbk.g gVar2 = null;
        if (i == 0) {
            yhm.o.b(obj2);
            PlanGiftingEligibilityService planGiftingEligibilityService = ((wbk.b) this.f271290x).f296240a;
            this.f271289w = null;
            this.v = 1;
            obj2 = planGiftingEligibilityService.getEligibility(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        vbk.d dVar = (vbk.d) obj2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String eligibility = dVar.getEligibility();
        kbk.h[] hVarArrValues = kbk.h.values();
        int length = hVarArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i3];
            if (kotlin.text.a0.z(hVar.name(), eligibility, true)) {
                break;
            }
            i3++;
        }
        if (hVar == null) {
            hVar = kbk.h.DISABLED;
        }
        String receiverReason = dVar.getReceiverReason();
        if (receiverReason != null) {
            kbk.g[] gVarArrValues = kbk.g.values();
            int length2 = gVarArrValues.length;
            for (int i5 = 0; i5 < length2; i5++) {
                gVar = gVarArrValues[i5];
                if (kotlin.text.a0.z(gVar.name(), receiverReason, true)) {
                    break;
                }
            }
            gVar = null;
        } else {
            gVar = null;
        }
        String senderReason = dVar.getSenderReason();
        if (senderReason != null) {
            kbk.g[] gVarArrValues2 = kbk.g.values();
            int length3 = gVarArrValues2.length;
            while (true) {
                if (i2 >= length3) {
                    break;
                }
                kbk.g gVar3 = gVarArrValues2[i2];
                if (kotlin.text.a0.z(gVar3.name(), senderReason, true)) {
                    gVar2 = gVar3;
                    break;
                }
                i2++;
            }
        }
        return new kbk.i(hVar, gVar, gVar2);
    }

    private final Object o(Object obj2) {
        String str = (String) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            PlanGiftingReceiverService planGiftingReceiverService = ((wbk.h) this.f271290x).f296245a;
            this.f271289w = null;
            this.v = 1;
            obj2 = planGiftingReceiverService.getIntro(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ce9.m.J((vbk.f) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    private final Object p(Object obj2) {
        String plainString;
        FiatExchangeOrderQuoteService fiatExchangeOrderQuoteService;
        boolean z;
        String str;
        String str2;
        Object orderQuote;
        ?? arrayList;
        FiatExchangeOrderQuoteParams fiatExchangeOrderQuoteParams = (FiatExchangeOrderQuoteParams) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FiatExchangeOrderQuoteService fiatExchangeOrderQuoteService2 = (FiatExchangeOrderQuoteService) ((usc.a) this.f271290x).f282889b;
            OrderQuoteParams orderQuoteParams = fiatExchangeOrderQuoteParams.f91689a;
            rcf.a aVar2 = fiatExchangeOrderQuoteParams.f91690b;
            String str3 = orderQuoteParams.f104783a.f306286a;
            Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteParams, "<this>");
            rcf.a aVar3 = rcf.a.TRADING_GIA_CBP;
            if (aVar2 == aVar3) {
                str3 = null;
            }
            String str4 = orderQuoteParams.f104784b.f306286a;
            String strN = e0.N(orderQuoteParams.f);
            String strR = n14.e.R(orderQuoteParams.f104785c);
            BigDecimal bigDecimal = orderQuoteParams.f104786g;
            String string = bigDecimal != null ? bigDecimal.toString() : null;
            BigDecimal bigDecimal2 = orderQuoteParams.d;
            if (bigDecimal2 == null || (plainString = bigDecimal2.toPlainString()) == null) {
                plainString = "";
            }
            String strN2 = e0.N(orderQuoteParams.e);
            boolean z3 = orderQuoteParams.f104787h;
            String str5 = orderQuoteParams.i;
            String str6 = orderQuoteParams.k;
            String str7 = orderQuoteParams.f104789l;
            if (aVar2 != null) {
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                fiatExchangeOrderQuoteService = fiatExchangeOrderQuoteService2;
                int i2 = tcf.a.f269775a[aVar2.ordinal()];
                z = z3;
                if (i2 == 1) {
                    str = "TRADING_GIA_CBP";
                } else if (i2 == 2) {
                    str = "TRADING_POCKET";
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "RETAIL_POCKET";
                }
            } else {
                fiatExchangeOrderQuoteService = fiatExchangeOrderQuoteService2;
                z = z3;
                str = null;
            }
            String str8 = fiatExchangeOrderQuoteParams.f91691c;
            Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteParams, "<this>");
            if (aVar2 != aVar3) {
                str8 = null;
            }
            this.f271289w = null;
            this.v = 1;
            str2 = "<this>";
            orderQuote = fiatExchangeOrderQuoteService.getOrderQuote(str3, str4, strR, string, strN2, strN, plainString, z, str5, str6, str7, str, str8, this);
            if (orderQuote == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            orderQuote = obj2;
            str2 = "<this>";
        }
        vcf.a aVar4 = (vcf.a) orderQuote;
        Intrinsics.checkNotNullParameter(aVar4, str2);
        List quotes = aVar4.getQuotes();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(quotes, 10));
        Iterator it8 = quotes.iterator();
        while (it8.hasNext()) {
            arrayList2.add(d8l.f.a((e8l.m) it8.next(), null));
        }
        Amount amountF = mif.a.F(aVar4.getRemainingAmount());
        List marginQuotes = aVar4.getMarginQuotes();
        if (marginQuotes != null) {
            List list = marginQuotes;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(d8l.f.a((e8l.m) it9.next(), null));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return new FiatExchangeOrderQuote(arrayList2, amountF, arrayList);
    }

    private final Object s(Object obj2) {
        cg0.r rVar = (cg0.r) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            HelpCenterService helpCenterService = ((u0) this.f271290x).f296927a;
            this.f271289w = null;
            this.v = 1;
            obj2 = helpCenterService.getQuickActionTroubleshooters(rVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((cg0.s) obj2).getTroubleshooters();
    }

    private final Object t(Object obj2) {
        String str = (String) this.f271289w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            JuniorDetailedTransferSettingsService juniorDetailedTransferSettingsService = ((wq8.c) this.f271290x).f299423c;
            this.f271289w = null;
            this.v = 1;
            JuniorDetailedTransferSettingsService.Companion aVar2 = JuniorDetailedTransferSettingsService.INSTANCE;
            obj2 = juniorDetailedTransferSettingsService.getTransfersCounterpartiesSettings(str, "MANAGE_YOUTH_ACCOUNTS_IN_SECURITY_TAB", this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return md6.s.v((List) obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                p pVar = new p((q) this.f271290x, (Continuation) obj4, 0);
                pVar.f271289w = (String) obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p((trb.c) this.f271290x, (Continuation) obj4, 1);
                pVar2.f271289w = (trb.b) obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            case 2:
                p pVar3 = new p((tuj.g) this.f271290x, (Continuation) obj4, 2);
                pVar3.f271289w = (String) obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
            case 3:
                p pVar4 = new p((u1l.e) this.f271290x, (Continuation) obj4, 3);
                pVar4.f271289w = (String) obj3;
                return pVar4.invokeSuspend(Unit.f186387a);
            case 4:
                p pVar5 = new p((u66.b) this.f271290x, (Continuation) obj4, 4);
                pVar5.f271289w = (q66.c) obj3;
                return pVar5.invokeSuspend(Unit.f186387a);
            case 5:
                p pVar6 = new p((ua5.e) this.f271290x, (Continuation) obj4, 5);
                pVar6.f271289w = (ua5.a) obj3;
                return pVar6.invokeSuspend(Unit.f186387a);
            case 6:
                p pVar7 = new p((un8.b) this.f271290x, (Continuation) obj4, 6);
                pVar7.f271289w = (String) obj3;
                return pVar7.invokeSuspend(Unit.f186387a);
            case 7:
                p pVar8 = new p((un8.h) this.f271290x, (Continuation) obj4, 7);
                pVar8.f271289w = (String) obj3;
                return pVar8.invokeSuspend(Unit.f186387a);
            case 8:
                p pVar9 = new p((un8.k) this.f271290x, (Continuation) obj4, 8);
                pVar9.f271289w = (String) obj3;
                return pVar9.invokeSuspend(Unit.f186387a);
            case 9:
                p pVar10 = new p((uwa.q) this.f271290x, (Continuation) obj4, 9);
                pVar10.f271289w = (uwa.f) obj3;
                return pVar10.invokeSuspend(Unit.f186387a);
            case 10:
                p pVar11 = new p((uwa.q) this.f271290x, (Continuation) obj4, 10);
                pVar11.f271289w = (pwa.n) obj3;
                return pVar11.invokeSuspend(Unit.f186387a);
            case 11:
                p pVar12 = new p((uwa.q) this.f271290x, (Continuation) obj4, 11);
                pVar12.f271289w = (uwa.j) obj3;
                return pVar12.invokeSuspend(Unit.f186387a);
            case 12:
                p pVar13 = new p((uwa.q) this.f271290x, (Continuation) obj4, 12);
                pVar13.f271289w = (uwa.k) obj3;
                return pVar13.invokeSuspend(Unit.f186387a);
            case 13:
                return new p((v20.f0) this.f271290x, (Continuation) obj4, 13).invokeSuspend(Unit.f186387a);
            case 14:
                p pVar14 = new p((v20.f0) this.f271290x, (Continuation) obj4, 14);
                pVar14.f271289w = (UUID) obj3;
                return pVar14.invokeSuspend(Unit.f186387a);
            case 15:
                p pVar15 = new p((vdl.f) this.f271290x, (Continuation) obj4, 15);
                pVar15.f271289w = (String) obj3;
                return pVar15.invokeSuspend(Unit.f186387a);
            case 16:
                return new p((b80.c) this.f271289w, (vdl.h) this.f271290x, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 17:
                p pVar16 = new p((vdl.y) this.f271290x, (Continuation) obj4, 17);
                pVar16.f271289w = (Set) obj3;
                return pVar16.invokeSuspend(Unit.f186387a);
            case 18:
                p pVar17 = new p((d0) this.f271290x, (Continuation) obj4, 18);
                pVar17.f271289w = (Map) obj3;
                return pVar17.invokeSuspend(Unit.f186387a);
            case 19:
                p pVar18 = new p((h0) this.f271290x, (Continuation) obj4, 19);
                pVar18.f271289w = (String) obj3;
                return pVar18.invokeSuspend(Unit.f186387a);
            case 20:
                p pVar19 = new p((l1) this.f271290x, (Continuation) obj4, 20);
                pVar19.f271289w = (j1) obj3;
                return pVar19.invokeSuspend(Unit.f186387a);
            case 21:
                p pVar20 = new p((vmi.d) this.f271290x, (Continuation) obj4, 21);
                pVar20.f271289w = (OAuthAuthorizeParams) obj3;
                return pVar20.invokeSuspend(Unit.f186387a);
            case 22:
                p pVar21 = new p((vz1.g) this.f271290x, (Continuation) obj4, 22);
                pVar21.f271289w = (String) obj3;
                return pVar21.invokeSuspend(Unit.f186387a);
            case 23:
                p pVar22 = new p((w20.e) this.f271290x, (Continuation) obj4, 23);
                pVar22.f271289w = (DraftRoutingKey) obj3;
                return pVar22.invokeSuspend(Unit.f186387a);
            case 24:
                p pVar23 = new p((wbk.b) this.f271290x, (Continuation) obj4, 24);
                pVar23.f271289w = (String) obj3;
                return pVar23.invokeSuspend(Unit.f186387a);
            case 25:
                p pVar24 = new p((wbk.h) this.f271290x, (Continuation) obj4, 25);
                pVar24.f271289w = (String) obj3;
                return pVar24.invokeSuspend(Unit.f186387a);
            case 26:
                p pVar25 = new p((usc.a) this.f271290x, (Continuation) obj4, 26);
                pVar25.f271289w = (FiatExchangeOrderQuoteParams) obj3;
                return pVar25.invokeSuspend(Unit.f186387a);
            case 27:
                p pVar26 = new p((u0) this.f271290x, (Continuation) obj4, 27);
                pVar26.f271289w = (cg0.r) obj3;
                return pVar26.invokeSuspend(Unit.f186387a);
            case 28:
                p pVar27 = new p((wq8.c) this.f271290x, (Continuation) obj4, 28);
                pVar27.f271289w = (String) obj3;
                return pVar27.invokeSuspend(Unit.f186387a);
            default:
                p pVar28 = new p((wqj.j) this.f271290x, (Continuation) obj4, 29);
                pVar28.f271289w = (wqj.e) obj3;
                return pVar28.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0731  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v63, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v67, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v71, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v75, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v3, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th6.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f271290x = obj2;
    }
}
