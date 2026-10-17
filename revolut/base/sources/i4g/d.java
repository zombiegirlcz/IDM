package i4g;

import com.revolut.chat.domain.model.ChatMode;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitParticipant;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$Step;
import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentOptionsDiscount;
import com.revolut.feature.revolutpay.impl.data.service.MerchantAppVerificationService;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import e7c.u;
import efm.r;
import ft3.h1;
import ggk.g1;
import gim.i;
import ijc.k;
import ip0.v7;
import ish.z;
import iyg.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jyk.d0;
import k37.s;
import k50.c3;
import k50.e3;
import k50.i4;
import k50.j4;
import k50.k2;
import k50.z2;
import k7c.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.SharedFlow;
import ofm.q;
import qua.p;
import rp0.k1;
import skm.a2;
import skm.e0;
import u2f.j;
import v20.x0;
import vf0.n;
import vkm.j2;
import vkm.v1;
import xdb.v;
import yhm.o;
import yji.l;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f158424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f158425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f158426y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Serializable serializable, Object obj2, Object obj3, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f158426y = obj2;
        this.z = serializable;
        this.f158424w = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r12 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r2.emit(r12, r11) != r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[PHI: r12
      0x0098: PHI (r12v15 java.lang.Object) = (r12v12 java.lang.Object), (r12v0 java.lang.Object) binds: [B:24:0x0095, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[PHI: r2 r12
      0x00a7: PHI (r2v2 kotlinx.coroutines.flow.FlowCollector) = (r2v1 kotlinx.coroutines.flow.FlowCollector), (r2v4 kotlinx.coroutines.flow.FlowCollector) binds: [B:27:0x00a4, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r12v18 java.lang.Object) = (r12v17 java.lang.Object), (r12v0 java.lang.Object) binds: [B:27:0x00a4, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f158426y
            wxd.o r0 = (wxd.o) r0
            java.lang.Object r1 = r11.z
            jyd.b r1 = (jyd.b) r1
            java.lang.Object r2 = r11.f158424w
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r11.v
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L42
            if (r4 == r8) goto L3a
            if (r4 == r7) goto L36
            if (r4 == r6) goto L2c
            if (r4 != r5) goto L24
            yhm.o.b(r12)
            goto Lb4
        L24:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2c:
            java.lang.Object r0 = r11.f158425x
            r2 = r0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            yhm.o.b(r12)
            goto La7
        L36:
            yhm.o.b(r12)
            goto L98
        L3a:
            yhm.o.b(r12)
            wxd.p r12 = (wxd.p) r12
            java.lang.String r12 = r12.f300876a
            goto L6e
        L42:
            yhm.o.b(r12)
            boolean r12 = r0 instanceof wxd.m
            if (r12 == 0) goto L4e
            wxd.m r0 = (wxd.m) r0
            java.lang.String r12 = r0.f300873a
            goto L70
        L4e:
            boolean r12 = r0 instanceof wxd.n
            if (r12 == 0) goto Lb7
            nyd.a r12 = r1.f179413a
            wxd.n r0 = (wxd.n) r0
            java.lang.String r4 = r0.f300874a
            gyd.a r10 = gyd.b.Companion
            java.lang.String r10 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)
            java.lang.String r0 = r0.f300875b
            r11.f158424w = r2
            r11.v = r8
            nyd.k r12 = (nyd.k) r12
            java.lang.Object r12 = r12.d(r4, r0, r11)
            if (r12 != r3) goto L6e
            goto Lb3
        L6e:
            java.lang.String r12 = (java.lang.String) r12
        L70:
            nyd.a r0 = r1.f179413a
            nyd.k r0 = (nyd.k) r0
            r0.getClass()
            java.lang.String r4 = "$v$c$com-revolut-feature-statements-api-documents_hub-DocumentRequestId$-requestId$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            x4l.c r0 = r0.e
            nyd.e r4 = new nyd.e
            r4.<init>(r12)
            w4l.h r12 = w4l.h.f294642c
            vkm.d r12 = r0.b(r4, r12)
            zfd.e r12 = zi0.c.w(r12)
            r11.f158424w = r2
            r11.v = r7
            java.lang.Object r12 = vkm.q.x(r12, r11)
            if (r12 != r3) goto L98
            goto Lb3
        L98:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            r11.f158424w = r9
            r11.f158425x = r2
            r11.v = r6
            java.lang.Object r12 = jyd.b.a(r1, r12, r11)
            if (r12 != r3) goto La7
            goto Lb3
        La7:
            r11.f158424w = r9
            r11.f158425x = r9
            r11.v = r5
            java.lang.Object r12 = r2.emit(r12, r11)
            if (r12 != r3) goto Lb4
        Lb3:
            return r3
        Lb4:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lb7:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.d.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        Object cVar;
        List list = (List) this.f158424w;
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
        k1a.g gVar = (k1a.g) this.f158425x;
        p pVar = (p) this.f158426y;
        a2a.g gVar2 = (a2a.g) this.z;
        Object obj3 = null;
        this.f158424w = null;
        this.v = 1;
        k1a.a aVar2 = k1a.g.Companion;
        String strI0 = q.i0(pVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            RecurringSplitSource recurringSplitSource = ((RecurringSplit) obj4).f79921b;
            if (recurringSplitSource.f79929a == gVar2 && Intrinsics.f(recurringSplitSource.f79930b, strI0)) {
                arrayList.add(obj4);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((RecurringSplit) next).f79922c == a2a.e.ACTIVE) {
                obj3 = next;
                break;
            }
        }
        RecurringSplit recurringSplit = (RecurringSplit) obj3;
        if (recurringSplit != null) {
            List list2 = recurringSplit.d;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((RecurringSplitParticipant) it9.next()).f79925a);
            }
            cVar = gVar.f(recurringSplit, arrayList2, this);
        } else {
            cVar = arrayList.isEmpty() ? new a2a.c(pVar) : a2a.b.f715a;
        }
        return cVar == aVar ? aVar : cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (nim.a.a(r8, r7) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f158424w
            u2f.j r0 = (u2f.j) r0
            java.lang.Object r1 = r7.f158425x
            k1f.d r1 = (k1f.d) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r8)
            goto L5e
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            yhm.o.b(r8)
            goto L3a
        L24:
            yhm.o.b(r8)
            com.revolut.feature.trade_rev_points.impl.data.network.TradeRevPointsService r8 = r1.f180227a
            java.lang.Object r3 = r7.f158426y
            java.lang.String r3 = (java.lang.String) r3
            efm.b r8 = r8.unlinkAccount(r3)
            r7.v = r5
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L3a
            goto L5d
        L3a:
            w4l.f r8 = r1.e
            i1f.a r3 = new i1f.a
            java.lang.Object r6 = r7.z
            java.lang.String r6 = (java.lang.String) r6
            r3.<init>(r6, r0)
            od0.h r6 = od0.i.Companion
            r6.getClass()
            od0.i r6 = od0.i.f224256b
            r8.k(r3, r6)
            w4l.f r8 = r1.d
            efm.b r8 = r8.g(r0, r5)
            r7.v = r4
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L5e
        L5d:
            return r2
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.d.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        mp.p pVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            sy3.d dVar = (sy3.d) this.f158424w;
            aim.f builder = new aim.f();
            builder.putAll(dVar.f266609a);
            builder.putAll(dVar.f266610b);
            Intrinsics.checkNotNullParameter(builder, "builder");
            aim.f fVarB = builder.b();
            k34.a aVar2 = (k34.a) this.f158426y;
            mp.p pVar2 = aVar2.f180617c;
            CreditPluginsService creditPluginsService = aVar2.f180616b;
            String str = ((h1) this.z).f137835a;
            this.f158425x = pVar2;
            this.v = 1;
            obj2 = creditPluginsService.submitFinancialSituationChanges(str, fVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = (mp.p) this.f158425x;
            o.b(obj2);
        }
        return pVar.p((tt3.a) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.z
            java.lang.String r0 = (java.lang.String) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L11
            yhm.o.b(r7)
            goto L2f
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f158425x
            k3c.p r7 = (k3c.p) r7
            com.revolut.feature.revolut_shop.data.service.IppShopService r7 = r7.f180680a
            java.lang.Object r2 = r6.f158426y
            java.lang.String r2 = (java.lang.String) r2
            r6.v = r3
            java.lang.Object r7 = r7.getOrderInvoice(r2, r0, r6)
            if (r7 != r1) goto L2f
            return r1
        L2f:
            retrofit2.Response r7 = (retrofit2.Response) r7
            java.lang.Object r1 = r7.body()
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
            if (r1 == 0) goto L9c
            ulm.b1 r2 = r1.contentType()
            if (r2 == 0) goto L94
            ulm.u0 r7 = r7.headers()
            java.lang.String r4 = "Content-Disposition"
            java.lang.String r7 = r7.a(r4)
            if (r7 == 0) goto L8c
            kotlin.text.Regex r4 = k3c.p.f180679h
            kotlin.text.o r7 = r4.b(r7)
            if (r7 == 0) goto L6b
            java.util.List r7 = r7.c()
            kotlin.text.m r7 = (kotlin.text.m) r7
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6b
            boolean r3 = kotlin.text.d0.W(r7)
            if (r3 != 0) goto L68
            goto L69
        L68:
            r7 = 0
        L69:
            if (r7 != 0) goto L82
        L6b:
            java.lang.Object r7 = r6.f158424w
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r2 = r2.f281067c
            java.lang.String r3 = " #"
            java.lang.String r4 = "."
            java.lang.String r5 = "Invoice "
            java.lang.StringBuilder r7 = v0.a.m(r5, r0, r3, r7, r4)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
        L82:
            byte[] r0 = r1.bytes()
            d3c.e r1 = new d3c.e
            r1.<init>(r7, r0)
            return r1
        L8c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing header Content-Disposition"
            r7.<init>(r0)
            throw r7
        L94:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing content type"
            r7.<init>(r0)
            throw r7
        L9c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing body"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.d.p(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2) {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.z;
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f158425x;
        j4 j4Var = (j4) this.f158426y;
        s50.e eVar = j4Var.W;
        r30.a aVar = j4Var.I;
        be7.e eVar2 = j4Var.f181143y;
        UUID chatId = (UUID) this.f158424w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            Job[] jobArr = (Job[]) ref$ObjectRef2.f186409a;
            if (jobArr != null) {
                ref$ObjectRef2.f186409a = null;
                for (Job job2 : jobArr) {
                    job2.f(null);
                }
                Job[] jobArr2 = (Job[]) Arrays.copyOf(jobArr, jobArr.length);
                this.f158424w = chatId;
                this.v = 1;
                if (e0.A(jobArr2, this) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        eVar2.f14697a.remove((UUID) ref$ObjectRef.f186409a);
        eVar2.f14697a.add(chatId);
        ref$ObjectRef.f186409a = chatId;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        r map = aVar.a(chatId).filter(new r25.c(12, new r2d.d(2))).map(new r25.c(13, new r2d.d(3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        h0 customKeys = h0.f322473a;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        r rVarRetry = ue0.e.q(map, customKeys).retry();
        Intrinsics.checkNotNullExpressionValue(rVarRetry, "retry(...)");
        v1 v1Var = new v1(new k0g.b(rd0.e.b(rVarRetry), (Continuation) null, j4Var));
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        a2 a2VarB1 = l.b1(j4Var, vkm.q.m(new pn2.c(v1Var, continuation, 7)), null, new c3(12, j4Var, continuation), 3);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        int i2 = 11;
        r map2 = aVar.a(chatId).filter(new r25.c(14, new r2d.d(4))).map(new r25.c(i2, new r2d.d(5)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        a2 a2VarB12 = l.b1(j4Var, rd0.e.b(ue0.e.q(map2, customKeys)), null, new c3(i2, j4Var, null), 3);
        r rVarH = j4Var.f181136t.h(chatId, true);
        k2 predicate = new k2(j4Var, 0);
        Intrinsics.checkNotNullParameter(rVarH, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        r rVarRetry2 = ue0.e.q(rVarH, customKeys).retry(new n(predicate, 13));
        Intrinsics.checkNotNullExpressionValue(rVarRetry2, "retry(...)");
        Continuation continuation2 = null;
        a2 a2VarB13 = l.b1(j4Var, vkm.q.q(rd0.e.b(rVarRetry2)), null, new c3(5, j4Var, continuation2), 3);
        a2 a2VarB14 = l.b1(j4Var, vkm.q.Q(v7.w(j4Var.f181140w0.B(new s(26))), new z2(1, j4Var, continuation2)), null, new c3(3, j4Var, continuation2), 3);
        a2 a2VarB15 = l.b1(j4Var, vkm.q.q(new b0((SharedFlow) ((n30.b0) j4Var.A).d.getValue(), 16)), null, new i4(j4Var, chatId, null), 3);
        a2 a2VarB16 = l.b1(j4Var, j4Var.M.a(chatId), null, new c3(2, j4Var, continuation2), 3);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        a2 a2VarB17 = l.b1(j4Var, new s50.c(rd0.e.b(((k1) eVar.f259908a).d), chatId, 1), null, new c3(4, j4Var, continuation2), 3);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        int i3 = 0;
        ref$ObjectRef2.f186409a = new Job[]{a2VarB1, a2VarB12, a2VarB13, a2VarB14, a2VarB15, a2VarB16, a2VarB17, l.b1(j4Var, new s50.c(rd0.e.b(((k1) eVar.f259908a).d), chatId, i3), null, new e3(i3, j4Var, continuation2), 3)};
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (nim.a.a(r0, r11) == r2) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.d.t(java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj2) {
        String strS;
        k50.h0 h0Var;
        j4 j4Var = (j4) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            strS = ((x0) this.f158424w).getCategory();
            if (strS == null) {
                return Unit.f186387a;
            }
            k50.h0 h0Var2 = (k50.h0) ((j2) j4Var.f181140w0.f22677a).getValue();
            this.f158425x = strS;
            this.f158426y = h0Var2;
            this.v = 1;
            Object objC3 = j4Var.c3(this);
            if (objC3 == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            obj2 = objC3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (k50.h0) this.f158426y;
            strS = (String) this.f158425x;
            o.b(obj2);
        }
        j4Var.T.f3(new l40.r((ChatMode) obj2, h0Var.f181083h, h0Var.f181079a, strS));
        return Unit.f186387a;
    }

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            RevolutPayService revolutPayService = ((g0) this.f158425x).f181957a;
            AcceptPaymentParams params = (AcceptPaymentParams) this.f158426y;
            String str = params.f84323a;
            Intrinsics.checkNotNullParameter(params, "params");
            String str2 = params.f84324b;
            PaymentOptionsDiscount paymentOptionsDiscount = params.f84325c;
            e7c.a aVar2 = new e7c.a(str2, paymentOptionsDiscount != null ? d7c.d.b(paymentOptionsDiscount, params.d) : null);
            String str3 = (String) this.z;
            String str4 = (String) this.f158424w;
            this.v = 1;
            obj2 = revolutPayService.acceptNew(str, aVar2, str3, str4, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u uVar = (u) obj2;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return new g6c.a(uVar.getId(), l9.l.I(uVar.getState()));
    }

    private final Object w(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            MerchantAppVerificationService merchantAppVerificationService = (MerchantAppVerificationService) ((fn2.c) this.f158425x).f136517b;
            String str = (String) this.f158426y;
            j7c.a aVar2 = new j7c.a((String) this.z, (ArrayList) this.f158424w);
            this.v = 1;
            if (merchantAppVerificationService.verifyMerchantApp(str, aVar2, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.K2(r2, r3, r4, r5, r10) == r7) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.z
            r4 = r0
            wk5.a r4 = (wk5.a) r4
            java.lang.Object r0 = r10.f158426y
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r10.f158425x
            r2 = r0
            com.revolut.feature.crypto.receive_widget.impl.ui.customize.c r2 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) r2
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r0 = r10.v
            r8 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L32
            if (r0 == r9) goto L28
            if (r0 != r8) goto L20
            yhm.o.b(r11)
            goto L76
        L20:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L28:
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2f
            goto L45
        L2c:
            r0 = move-exception
            r11 = r0
            goto L49
        L2f:
            r0 = move-exception
            r11 = r0
            goto L79
        L32:
            yhm.o.b(r11)
            j54.v0 r1 = new j54.v0     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2f
            r6 = 9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2f
            r10.v = r9     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2f
            java.lang.Object r11 = r2.p2(r10, r1)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2f
            if (r11 != r7) goto L45
            goto L75
        L45:
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2f
            r5 = r11
            goto L52
        L49:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r5, r5, r11, r0)
        L52:
            if (r5 != 0) goto L6d
            java.lang.Object r11 = r10.f158424w
            r5 = r11
            java.util.List r5 = (java.util.List) r5
            bib.b r1 = new bib.b
            r6 = 15
            r1.<init>(r2, r3, r4, r5, r6)
            a2.a r11 = new a2.a
            r0 = 26
            r11.<init>(r5, r0, r2, r3)
            r2.L2(r1, r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L6d:
            r10.v = r8
            java.lang.Object r11 = com.revolut.feature.crypto.receive_widget.impl.ui.customize.c.K2(r2, r3, r4, r5, r10)
            if (r11 != r7) goto L76
        L75:
            return r7
        L76:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L79:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.d.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.product.lifecycle.flow.a aVar2 = (com.revolut.feature.product.lifecycle.flow.a) this.f158425x;
            jld.h hVar = new jld.h(4, aVar2, (ProductLifecycleFlowContract$Step) this.f158426y, (jja.a) this.z, (Ref$BooleanRef) this.f158424w, null);
            this.v = 1;
            if (aVar2.p2(this, hVar) == aVar) {
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

    /* JADX WARN: Type inference failed for: r0v14, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v17, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((h) this.f158426y, continuation);
                dVar.f158424w = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((com.revolut.feature.apm.swish.impl.domain.a) this.z, continuation, 1);
                dVar2.f158424w = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.f158425x, (v) this.f158426y, (ieb.i) this.z, continuation, 2);
                dVar3.f158424w = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((ig.e) this.z, continuation, 3);
                dVar4.f158424w = obj2;
                return dVar4;
            case 4:
                return new d((ig.g) this.f158425x, (Map) this.f158424w, (d) this.f158426y, (ie6.q) this.z, continuation);
            case 5:
                d dVar5 = new d((k) this.z, continuation, 5);
                dVar5.f158424w = obj2;
                return dVar5;
            case 6:
                d dVar6 = new d((InsufficientFunds) this.f158425x, (ThreeDSTransaction) this.f158426y, (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.z, continuation, 6);
                dVar6.f158424w = obj2;
                return dVar6;
            case 7:
                d dVar7 = new d((ArrayList) this.f158425x, (ish.a) this.f158426y, (WidgetContext) this.z, continuation, 7);
                dVar7.f158424w = obj2;
                return dVar7;
            case 8:
                d dVar8 = new d((z) this.f158426y, (WidgetContext) this.z, continuation, 8);
                dVar8.f158424w = obj2;
                return dVar8;
            case 9:
                d dVar9 = new d((iuf.d) this.f158426y, (ManualTransferData) this.z, continuation, 9);
                dVar9.f158424w = obj2;
                return dVar9;
            case 10:
                d dVar10 = new d((Function1) this.f158425x, (Function1) this.f158426y, (Function1) this.z, continuation);
                dVar10.f158424w = obj2;
                return dVar10;
            case 11:
                d dVar11 = new d((jc6.s) this.z, continuation, 11);
                dVar11.f158424w = obj2;
                return dVar11;
            case 12:
                return new d(12, (String) this.z, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b) this.f158426y, (g1) this.f158424w, continuation);
            case 13:
                return new d(13, (String) this.z, (jm8.b) this.f158426y, (String) this.f158424w, continuation);
            case 14:
                return new d((com.revolut.feature.robo.impl.ui.flow.edit_goal.f) this.f158425x, (Function0) this.f158426y, (PortfolioGoal) this.z, (Function1) this.f158424w, continuation);
            case 15:
                d dVar12 = new d((jya.d) this.f158425x, (String) this.f158426y, (pwa.n) this.z, continuation, 15);
                dVar12.f158424w = obj2;
                return dVar12;
            case 16:
                d dVar13 = new d((wxd.o) this.f158426y, (jyd.b) this.z, continuation, 16);
                dVar13.f158424w = obj2;
                return dVar13;
            case 17:
                d dVar14 = new d((wkm.l) this.f158425x, (jz.l) this.f158426y, (d0) this.z, continuation, 17);
                dVar14.f158424w = obj2;
                return dVar14;
            case 18:
                d dVar15 = new d((k1a.g) this.f158425x, (p) this.f158426y, (a2a.g) this.z, continuation, 18);
                dVar15.f158424w = obj2;
                return dVar15;
            case 19:
                return new d(19, (k1f.d) this.f158425x, (String) this.f158426y, (String) this.z, (j) this.f158424w, continuation);
            case 20:
                return new d(20, (h1) this.z, (k34.a) this.f158426y, (sy3.d) this.f158424w, continuation);
            case 21:
                return new d(21, (k3c.p) this.f158425x, (String) this.f158426y, (String) this.z, (String) this.f158424w, continuation);
            case 22:
                d dVar16 = new d((Ref$ObjectRef) this.f158425x, (j4) this.f158426y, (Ref$ObjectRef) this.z, continuation, 22);
                dVar16.f158424w = obj2;
                return dVar16;
            case 23:
                d dVar17 = new d((j4) this.z, continuation, 23);
                dVar17.f158424w = obj2;
                return dVar17;
            case 24:
                return new d(this.f158424w, (j4) this.z, continuation);
            case 25:
                return new d(25, (g0) this.f158425x, (AcceptPaymentParams) this.f158426y, (String) this.z, (String) this.f158424w, continuation);
            case 26:
                return new d(26, (fn2.c) this.f158425x, (String) this.f158426y, (String) this.z, (ArrayList) this.f158424w, continuation);
            case 27:
                return new d(27, (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) this.f158425x, (String) this.f158426y, (wk5.a) this.z, (List) this.f158424w, continuation);
            case 28:
                return new d(28, (com.revolut.feature.product.lifecycle.flow.a) this.f158425x, (ProductLifecycleFlowContract$Step) this.f158426y, (jja.a) this.z, (Ref$BooleanRef) this.f158424w, continuation);
            default:
                return new d(29, (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a) this.f158425x, (String) this.f158426y, (String) this.z, (String) this.f158424w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:140|(1:(1:143)(2:144|145))(2:146|(16:478|155|(1:157)(1:160)|161|162|164|165|(1:167)(1:169)|168|476|170|(1:172)(1:175)|176|177|179|180)(2:150|(1:495)(1:153)))|154|165|(0)(0)|168|476|170|(0)(0)|176|177|179|180) */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b4, code lost:
    
        r4 = new com.revolut.data.model.Data(null, r0, r1.getLoading());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039d A[Catch: all -> 0x03a2, TryCatch #2 {all -> 0x03a2, blocks: (B:170:0x0397, B:172:0x039d, B:176:0x03a5), top: B:476:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:494:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v138, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v141, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v104, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f158425x = obj2;
        this.f158426y = obj3;
        this.z = obj4;
        this.f158424w = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.revolut.feature.robo.impl.ui.flow.edit_goal.f fVar, Function0 function0, PortfolioGoal portfolioGoal, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.f158425x = fVar;
        this.f158426y = function0;
        this.z = portfolioGoal;
        this.f158424w = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f158426y = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ig.g gVar, Map map, d dVar, ie6.q qVar, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f158425x = gVar;
        this.f158424w = map;
        this.f158426y = dVar;
        this.z = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158425x = obj2;
        this.f158426y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158426y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj2, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = 24;
        this.f158424w = obj2;
        this.z = j4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f158425x = (i) function1;
        this.f158426y = (i) function12;
        this.z = function13;
    }
}
