package kkf;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.retail.feature.crypto_deposits.api.interactors.CryptoDepositsInteractor$Companion;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import tof.gb;
import tof.i7;
import tof.jc;
import tof.qb;
import tof.r9;
import tof.ra;

/* JADX INFO: loaded from: classes8.dex */
public final class m5 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f184825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f184827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f184827y = obj2;
    }

    private final Object b(Object obj2) {
        akg.n nVarV;
        klf.g1 g1Var = (klf.g1) this.f184827y;
        fm4.a aVar = g1Var.e;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f184825w;
            tof.y yVar = (tof.y) this.f184826x;
            w4l.h loadingStrategy = w4l.h.f294642c;
            Continuation continuation = null;
            if (yVar != null) {
                String planId = yVar.f273170b;
                xt4.c cVar = (xt4.c) aVar;
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                nVarV = nim.a.v(nim.a.u(new xt4.a(cVar, continuation, 0), ((om4.r1) cVar.f308754a).j(planId, loadingStrategy)), new xrl.a(17));
            } else {
                String transactionId = g1Var.f185484b.a();
                xt4.c cVar2 = (xt4.c) aVar;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                om4.r1 r1Var = (om4.r1) cVar2.f308754a;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                nVarV = nim.a.v(nim.a.u(new xt4.a(cVar2, continuation, 1), vkm.q.q(nim.a.v(vkm.q.q(vkm.q.Q(((om4.y3) r1Var.f226680c).h(), new om4.r0(continuation, r1Var, loadingStrategy, 1))), new o23.l(transactionId, 27)))), new xrl.a(18));
            }
            this.f184825w = null;
            this.f184826x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, nVarV, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        FlowCollector flowCollector;
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector2 = this.f184825w;
            tof.a3 a3Var = (tof.a3) this.f184826x;
            klf.h1 h1Var = (klf.h1) this.f184827y;
            tof.f5 f5Var = a3Var.y0;
            String str = f5Var != null ? f5Var.f272749a : null;
            tof.z6 z6Var = a3Var.H;
            String str2 = z6Var != null ? z6Var.f273196a : null;
            String str3 = z6Var != null ? z6Var.f273198c : null;
            String str4 = z6Var != null ? z6Var.d : null;
            String str5 = z6Var != null ? z6Var.i : null;
            String str6 = z6Var != null ? z6Var.f273200h : null;
            if (str == null || kotlin.text.d0.W(str) || str2 == null || kotlin.text.d0.W(str2) || str2.equals(str) || str3 == null || kotlin.text.d0.W(str3) || str4 == null || kotlin.text.d0.W(str4) || str5 == null || kotlin.text.d0.W(str5) || str6 == null || kotlin.text.d0.W(str6)) {
                flowCollector = null;
                gVar = new go.g(new Data(null, null, false, 6, null), 2);
            } else {
                flowCollector = null;
                gVar = boh.f.e(zh9.u0.m(nim.a.v(rd0.e.b(((wsg.n) h1Var.f185504c).d0(null, w4l.h.f294642c)), new k7c.n(str, 11)), nim.a.v(rd0.e.b(h1Var.d.m(str, false)), new kkk.u(15))), new aqd.f(h1Var, str, str2, z6Var, str3, str4, str5, str6, 4));
            }
            this.f184825w = flowCollector;
            this.f184826x = flowCollector;
            this.v = 1;
            if (vkm.q.u(flowCollector2, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f184825w;
            tof.a3 a3Var = (tof.a3) this.f184826x;
            klf.o1 o1Var = (klf.o1) this.f184827y;
            tof.e1 e1Var = a3Var.f272580a0;
            String str = e1Var != null ? e1Var.u : null;
            String str2 = e1Var != null ? e1Var.v : null;
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                gVar = new go.g(new n35.b(null, null), 2);
            } else {
                StringBuilder sb6 = new StringBuilder();
                int length = str2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str2.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb6.append(cCharAt);
                    }
                }
                gVar = new acb.i(o1Var.f185547b.e(), str, str2, e1Var, sb6.toString(), 6);
            }
            this.f184825w = null;
            this.f184826x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        Flow v1Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f184825w;
            tof.a3 a3Var = (tof.a3) this.f184826x;
            klf.p1 p1Var = (klf.p1) this.f184827y;
            String str = a3Var.f272581b;
            tof.e1 e1Var = a3Var.f272580a0;
            String str2 = e1Var != null ? e1Var.f272707c : null;
            if (str2 == null) {
                od0.i.Companion.getClass();
                v1Var = new go.g(od0.i.f224256b, 2);
            } else {
                v1Var = new vkm.v1(new fc0.e(p1Var, str2, str, (Continuation) null));
            }
            this.f184825w = null;
            this.f184826x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, v1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object p(Object obj2) {
        String portfolioId;
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f184825w;
            tof.a3 transaction = (tof.a3) this.f184826x;
            glc.d dVar = ((klf.r1) this.f184827y).f185568c;
            jc jcVar = transaction.J0;
            if (jcVar == null || (portfolioId = jcVar.f272866a) == null) {
                throw new IllegalStateException("Portfolio info is null");
            }
            vmc.a aVar2 = (vmc.a) dVar;
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            RoboTransaction transaction2 = yoc.e.a(transaction);
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(transaction2, "transaction");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Flow flowA = glc.a.a(aVar2.f290554a, portfolioId);
            if (transaction2 instanceof RoboTransaction.RecurringDeposit) {
                t1j.b bVar = aVar2.f290555b;
                String orderId = ((RoboTransaction.RecurringDeposit) transaction2).e;
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                r10.q qVar = (r10.q) bVar.f267380b;
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                gVar = rd0.e.b(((w4l.f) qVar.d).e(orderId, loadingStrategy));
            } else {
                od0.i.Companion.getClass();
                gVar = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
            }
            jhi.b bVarG = mo3.a.g(nim.a.v(zh9.u0.m(flowA, gVar), new vh2.j(transaction2, 16)), null, klf.q1.f185561a, 1);
            this.f184825w = null;
            this.f184826x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, bVarG, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f184825w;
            tof.a3 a3Var = (tof.a3) this.f184826x;
            stc.e eVar = ((klf.c2) this.f184827y).f185461c;
            String transactionId = a3Var.f272581b;
            tof.v6 state = a3Var.f;
            r10.r rVar = (r10.r) eVar;
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(state, "state");
            boolean z = state == tof.v6.PENDING;
            boolean zD = ((wtc.g0) rVar.f250853c).d();
            Continuation continuation = null;
            if (z && zD) {
                ufm.d dVar = (ufm.d) rVar.f250851a;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                gVar = rd0.e.e(vkm.q.Q(new vkm.v1(new s56.d0(dVar, transactionId, continuation, 23)), new a32.b(continuation, rVar, transactionId, 15)), zhm.h0.f322473a, new a35.k(3, 27, continuation));
            } else {
                gVar = new go.g(stc.c.f265553a, 2);
            }
            this.f184825w = null;
            this.f184826x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object t(Object obj2) {
        klf.n2 n2Var = (klf.n2) this.f184827y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f184825w;
            SplitBillLink splitBillLink = (SplitBillLink) this.f184826x;
            Flow gVar = splitBillLink == null ? new go.g(null, 2) : new hy1.b0(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(n2Var.e, new ra(splitBillLink.f79939a), null, null, null, null, 30)), n2Var, splitBillLink, 16);
            this.f184825w = null;
            this.f184826x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m5 m5Var = new m5(continuation, (p5) this.f184827y, 0);
                m5Var.f184825w = flowCollector;
                m5Var.f184826x = obj3;
                return m5Var.invokeSuspend(Unit.f186387a);
            case 1:
                m5 m5Var2 = new m5(continuation, (h6) this.f184827y, 1);
                m5Var2.f184825w = flowCollector;
                m5Var2.f184826x = obj3;
                return m5Var2.invokeSuspend(Unit.f186387a);
            case 2:
                m5 m5Var3 = new m5(continuation, (y6) this.f184827y, 2);
                m5Var3.f184825w = flowCollector;
                m5Var3.f184826x = obj3;
                return m5Var3.invokeSuspend(Unit.f186387a);
            case 3:
                m5 m5Var4 = new m5(continuation, (nof.i) this.f184827y, 3);
                m5Var4.f184825w = flowCollector;
                m5Var4.f184826x = obj3;
                return m5Var4.invokeSuspend(Unit.f186387a);
            case 4:
                m5 m5Var5 = new m5(continuation, (s7) this.f184827y, 4);
                m5Var5.f184825w = flowCollector;
                m5Var5.f184826x = obj3;
                return m5Var5.invokeSuspend(Unit.f186387a);
            case 5:
                m5 m5Var6 = new m5(continuation, (a8) this.f184827y, 5);
                m5Var6.f184825w = flowCollector;
                m5Var6.f184826x = obj3;
                return m5Var6.invokeSuspend(Unit.f186387a);
            case 6:
                m5 m5Var7 = new m5(continuation, (j8) this.f184827y, 6);
                m5Var7.f184825w = flowCollector;
                m5Var7.f184826x = obj3;
                return m5Var7.invokeSuspend(Unit.f186387a);
            case 7:
                m5 m5Var8 = new m5(continuation, (k98.a) this.f184827y, 7);
                m5Var8.f184825w = flowCollector;
                m5Var8.f184826x = obj3;
                return m5Var8.invokeSuspend(Unit.f186387a);
            case 8:
                m5 m5Var9 = new m5(continuation, (f9) this.f184827y, 8);
                m5Var9.f184825w = flowCollector;
                m5Var9.f184826x = obj3;
                return m5Var9.invokeSuspend(Unit.f186387a);
            case 9:
                m5 m5Var10 = new m5(continuation, (k9) this.f184827y, 9);
                m5Var10.f184825w = flowCollector;
                m5Var10.f184826x = obj3;
                return m5Var10.invokeSuspend(Unit.f186387a);
            case 10:
                m5 m5Var11 = new m5(continuation, (klf.c) this.f184827y, 10);
                m5Var11.f184825w = flowCollector;
                m5Var11.f184826x = obj3;
                return m5Var11.invokeSuspend(Unit.f186387a);
            case 11:
                m5 m5Var12 = new m5(continuation, (klf.k) this.f184827y, 11);
                m5Var12.f184825w = flowCollector;
                m5Var12.f184826x = obj3;
                return m5Var12.invokeSuspend(Unit.f186387a);
            case 12:
                m5 m5Var13 = new m5(continuation, (klf.m) this.f184827y, 12);
                m5Var13.f184825w = flowCollector;
                m5Var13.f184826x = obj3;
                return m5Var13.invokeSuspend(Unit.f186387a);
            case 13:
                m5 m5Var14 = new m5(continuation, (klf.o) this.f184827y, 13);
                m5Var14.f184825w = flowCollector;
                m5Var14.f184826x = obj3;
                return m5Var14.invokeSuspend(Unit.f186387a);
            case 14:
                m5 m5Var15 = new m5(continuation, (klf.p) this.f184827y, 14);
                m5Var15.f184825w = flowCollector;
                m5Var15.f184826x = obj3;
                return m5Var15.invokeSuspend(Unit.f186387a);
            case 15:
                m5 m5Var16 = new m5(continuation, (klf.s0) this.f184827y, 15);
                m5Var16.f184825w = flowCollector;
                m5Var16.f184826x = obj3;
                return m5Var16.invokeSuspend(Unit.f186387a);
            case 16:
                m5 m5Var17 = new m5(continuation, (gim.i) this.f184827y);
                m5Var17.f184825w = flowCollector;
                m5Var17.f184826x = obj3;
                return m5Var17.invokeSuspend(Unit.f186387a);
            case 17:
                m5 m5Var18 = new m5(continuation, (klf.y0) this.f184827y, 17);
                m5Var18.f184825w = flowCollector;
                m5Var18.f184826x = obj3;
                return m5Var18.invokeSuspend(Unit.f186387a);
            case 18:
                m5 m5Var19 = new m5(continuation, (klf.z0) this.f184827y, 18);
                m5Var19.f184825w = flowCollector;
                m5Var19.f184826x = obj3;
                return m5Var19.invokeSuspend(Unit.f186387a);
            case 19:
                m5 m5Var20 = new m5(continuation, (klf.b1) this.f184827y, 19);
                m5Var20.f184825w = flowCollector;
                m5Var20.f184826x = obj3;
                return m5Var20.invokeSuspend(Unit.f186387a);
            case 20:
                m5 m5Var21 = new m5(continuation, (klf.f1) this.f184827y, 20);
                m5Var21.f184825w = flowCollector;
                m5Var21.f184826x = obj3;
                return m5Var21.invokeSuspend(Unit.f186387a);
            case 21:
                m5 m5Var22 = new m5(continuation, (klf.g1) this.f184827y, 21);
                m5Var22.f184825w = flowCollector;
                m5Var22.f184826x = obj3;
                return m5Var22.invokeSuspend(Unit.f186387a);
            case 22:
                m5 m5Var23 = new m5(continuation, (klf.h1) this.f184827y, 22);
                m5Var23.f184825w = flowCollector;
                m5Var23.f184826x = obj3;
                return m5Var23.invokeSuspend(Unit.f186387a);
            case 23:
                m5 m5Var24 = new m5(continuation, (klf.m1) this.f184827y, 23);
                m5Var24.f184825w = flowCollector;
                m5Var24.f184826x = obj3;
                return m5Var24.invokeSuspend(Unit.f186387a);
            case 24:
                m5 m5Var25 = new m5(continuation, (klf.o1) this.f184827y, 24);
                m5Var25.f184825w = flowCollector;
                m5Var25.f184826x = obj3;
                return m5Var25.invokeSuspend(Unit.f186387a);
            case 25:
                m5 m5Var26 = new m5(continuation, (klf.p1) this.f184827y, 25);
                m5Var26.f184825w = flowCollector;
                m5Var26.f184826x = obj3;
                return m5Var26.invokeSuspend(Unit.f186387a);
            case 26:
                m5 m5Var27 = new m5(continuation, (klf.r1) this.f184827y, 26);
                m5Var27.f184825w = flowCollector;
                m5Var27.f184826x = obj3;
                return m5Var27.invokeSuspend(Unit.f186387a);
            case 27:
                m5 m5Var28 = new m5(continuation, (klf.c2) this.f184827y, 27);
                m5Var28.f184825w = flowCollector;
                m5Var28.f184826x = obj3;
                return m5Var28.invokeSuspend(Unit.f186387a);
            case 28:
                m5 m5Var29 = new m5(continuation, (klf.n2) this.f184827y, 28);
                m5Var29.f184825w = flowCollector;
                m5Var29.f184826x = obj3;
                return m5Var29.invokeSuspend(Unit.f186387a);
            default:
                m5 m5Var30 = new m5(continuation, (klf.z2) this.f184827y, 29);
                m5Var30.f184825w = flowCollector;
                m5Var30.f184826x = obj3;
                return m5Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v44, types: [use.d] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v62, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v32, types: [gim.i, kotlin.jvm.functions.Function1] */
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        String lowerCase;
        gal.h suspiciousType;
        Flow gVar2;
        efm.r rVarJust;
        String str;
        ?? arrayList;
        efm.r rVarD;
        Flow flowE;
        Flow gVar3;
        tof.y6 y6Var;
        Flow flowB;
        Flow flowQ;
        Flow gVar4;
        Flow flowE2;
        int i = this.u;
        int i2 = 26;
        int i3 = 22;
        w4l.h hVar = w4l.h.f294642c;
        int i5 = 13;
        int i6 = 3;
        int i21 = 0;
        Object obj3 = this.f184827y;
        Continuation continuation = null;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f184825w;
                    tof.t3 t3Var = (tof.t3) this.f184826x;
                    p5 p5Var = (p5) obj3;
                    String str2 = t3Var != null ? t3Var.i0 : null;
                    if (str2 != null) {
                        com.revolut.domain.interactors.transactions.a aVar2 = p5Var.f184885m;
                        i7.c cVar = tof.i7.Companion;
                        tof.i7[] i7VarArr = {new r9(str2), new tof.l7()};
                        cVar.getClass();
                        tof.q7 q7VarA = i7.c.a(i7VarArr);
                        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.LOANS, TransactionContext.TransactionData.MERCHANT_PAYMENTS, TransactionContext.TransactionData.ACQUIRING_CASHBACK, TransactionContext.TransactionData.TRANSFER_USERS, TransactionContext.TransactionData.EXCLUDED_FROM_SPENDING_ANALYTICS};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        vkm.d dVarB = rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar2, q7VarA, null, 1, null, new TransactionContext(null, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements)), 1), 10));
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        gVar = new t38.e(vkm.q.q(new a6e.b(rd0.e.n(dVarB, h0Var), 13)), 24, vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(hng.g.b(((ang.b) p5Var.f184886n).f7765a)), h0Var), 14)), new j40.d(p5Var, continuation, 15));
                    } else {
                        p5Var.getClass();
                        gVar = new go.g(zhm.f0.f322471a, 2);
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f184825w;
                    Flow x5Var = !((klf.j1) this.f184826x).c() ? new x5((SharedFlow) ((h6) obj3).f184722l.d.getValue(), i22) : new go.g(zhm.f0.f322471a, 2);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, x5Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f184825w;
                    Flow flowQ2 = ((Boolean) this.f184826x).booleanValue() ? vkm.q.q(new a6e.b(rd0.e.n(glc.a.c(((y6) obj3).i), zhm.h0.f322473a), 17)) : new go.g(zhm.r0.g(), 2);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowQ2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f184825w;
                    tof.a3 transaction = (tof.a3) this.f184826x;
                    nof.m mVar = (nof.m) ((nof.i) obj3);
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    ne0.p pVar = mVar.f218044h;
                    pVar.getClass();
                    efm.r rVarDefer = efm.r.defer(new m1i.t(pVar, transaction, 9));
                    Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
                    vkm.d dVarB2 = rd0.e.b(rVarDefer);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                s7 s7Var = (s7) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f184825w;
                    Pair pair = (Pair) this.f184826x;
                    String str3 = (String) pair.f186385a;
                    boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                    ((pal.a) s7Var.f184938n).getClass();
                    if (str3 != null) {
                        lowerCase = str3.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (Intrinsics.f(lowerCase, "suspicious_transaction_tm_declined")) {
                        suspiciousType = gal.h.TM_DECLINED;
                    } else {
                        fal.b.Companion.getClass();
                        suspiciousType = zhm.d0.T(fal.a.f133411b, lowerCase) ? gal.h.OTHER : null;
                    }
                    if (zBooleanValue || suspiciousType == null) {
                        gVar2 = new go.g(zhm.f0.f322471a, 2);
                    } else {
                        cal.c cVar2 = s7Var.o;
                        String transactionId = s7Var.f184936l.f185494j;
                        k7i.i iVar = (k7i.i) cVar2;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(transactionId, "groupId");
                        Intrinsics.checkNotNullParameter(suspiciousType, "suspiciousType");
                        if (kotlin.text.d0.W(transactionId)) {
                            rVarJust = efm.r.just(zhm.f0.f322471a);
                            Intrinsics.h(rVarJust);
                        } else {
                            ial.f fVar = (ial.f) ((hal.a) iVar.f182069b);
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            Intrinsics.checkNotNullParameter(suspiciousType, "suspiciousType");
                            w4l.f fVar2 = fVar.d;
                            int i74 = ial.e.f160057a[suspiciousType.ordinal()];
                            if (i74 == 1) {
                                str = "alert";
                            } else {
                                if (i74 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "remediation";
                            }
                            rVarJust = fVar2.f(new ial.d(transactionId, str), true).map(new ma1.v(13, new m98.k(iVar, 8)));
                            Intrinsics.h(rVarJust);
                        }
                        gVar2 = rd0.e.b(rVarJust);
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, gVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                a8 a8Var = (a8) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f184825w;
                    Pair pair2 = (Pair) this.f184826x;
                    tof.f4 f4Var = (tof.f4) pair2.f186385a;
                    Flow gVar5 = (f4Var == null || ((Boolean) pair2.f186386b).booleanValue()) ? new go.g(zhm.f0.f322471a, 2) : rd0.e.e(new kh4.f(new z7(mo3.a.g(rd0.e.b(a8Var.f184604n.b(f4Var.f272746a, w4l.h.f294642c)), null, new b4(4), 1), f4Var, i21), a8Var, 29), zhm.h0.f322473a, new i23.c(3, 22, continuation));
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, gVar5, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                j8 j8Var = (j8) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f184825w;
                    List list = (List) ((Data) this.f184826x).getContent();
                    if (list != null) {
                        List list2 = list;
                        arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((kse.a) it8.next()).f189436a);
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = zhm.f0.f322471a;
                    }
                    Flow gVar6 = arrayList.isEmpty() ? new go.g(zhm.f0.f322471a, 2) : new t38.e(j8Var.f184779m.b(arrayList, hVar), 24, j8Var.f184782q, new j40.d(j8Var, continuation, 17));
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, gVar6, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f184825w;
                    Flow gVar7 = ((Boolean) this.f184826x).booleanValue() ? (Flow) ((k98.a) obj3).invoke() : new go.g(null, 2);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, gVar7, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f184825w;
                    mga.d0 d0Var = (mga.d0) this.f184826x;
                    Flow bVar = d0Var != null ? new a6e.b(rd0.e.n(((tga.k) ((f9) obj3).f184686n).d(d0Var), zhm.h0.f322473a), 19) : new go.g(zhm.f0.f322471a, 2);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, bVar, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                k9 k9Var = (k9) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f184825w;
                    Flow z7Var = !((klf.j1) this.f184826x).c() ? new z7((SharedFlow) k9Var.f184799l.d.getValue(), k9Var, 8) : new go.g(zhm.f0.f322471a, 2);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, z7Var, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = this.f184825w;
                    tof.a3 transaction2 = (tof.a3) this.f184826x;
                    ur2.c cVar3 = ((klf.c) obj3).f185454b;
                    Intrinsics.checkNotNullParameter(transaction2, "transaction");
                    tof.f5 f5Var = transaction2.y0;
                    vkm.q0 q0VarN = rd0.e.n(zi0.c.w(rd0.e.b(nim.a.w(ur2.c.c(cVar3, f5Var != null ? f5Var.f272749a : null, 2), new aqd.g(cVar3, transaction2, 13)))), zhm.h0.f322473a);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector11);
                    Object objCollect = q0VarN.collect(new h9(flowCollector11, 10), this);
                    if (objCollect != aVar12) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar12) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = this.f184825w;
                    tof.a3 transaction3 = (tof.a3) this.f184826x;
                    ynf.d dVar = (ynf.d) ((klf.k) obj3).f185519b;
                    dVar.getClass();
                    com.revolut.domain.interactors.transactions.a aVar14 = dVar.f315467b;
                    Intrinsics.checkNotNullParameter(transaction3, "transaction");
                    String str4 = transaction3.q0;
                    tof.y6 y6Var2 = transaction3.e;
                    String str5 = transaction3.f272581b;
                    if (!k71.k.Y0(transaction3)) {
                        tof.y6 y6Var3 = tof.y6.CARD_PAYMENT;
                        if (y6Var2 == y6Var3 && cp5.d.z(transaction3.k.f115083b)) {
                            i7.c cVar4 = tof.i7.Companion;
                            tof.i7[] i7VarArr2 = {new gb(str5), new tof.c8(tof.r.CRYPTO)};
                            cVar4.getClass();
                            rVarD = com.revolut.domain.interactors.transactions.a.d(aVar14, i7.c.a(i7VarArr2), null, null, null, ynf.d.f, 14);
                        } else if (transaction3.A0 == tof.r.CRYPTO) {
                            i7.c cVar5 = tof.i7.Companion;
                            tof.i7[] i7VarArr3 = {new gb(str5)};
                            cVar5.getClass();
                            rVarD = com.revolut.domain.interactors.transactions.a.d(aVar14, i7.c.a(i7VarArr3), null, null, null, ynf.d.f, 14);
                        } else if (y6Var2 == tof.y6.REWARD && transaction3.f272624y.f273144b == io3.l.VESTING) {
                            if (str4 == null || (rVarD = nim.a.w(com.revolut.domain.interactors.transactions.a.d(aVar14, new r9(str4), null, null, null, ynf.d.f, 14), new yed.g0(dVar, 25))) == null) {
                                rVarD = z9h.n.f(null, null, false, 6, null);
                                Intrinsics.checkNotNullExpressionValue(rVarD, "just(...)");
                            }
                        } else if (y6Var2 == y6Var3 || y6Var2 == tof.y6.CASHBACK || y6Var2 == tof.y6.MERCHANT_CB || k71.k.m(transaction3)) {
                            i7.c cVar6 = tof.i7.Companion;
                            tof.i7[] i7VarArr4 = {new gb(str5), i7.k.f272817a, new qb(zhm.v.k(tof.v6.COMPLETED, tof.v6.PENDING))};
                            cVar6.getClass();
                            rVarD = com.revolut.domain.interactors.transactions.a.d(aVar14, i7.c.a(i7VarArr4), null, null, null, ynf.d.f, 14);
                        } else {
                            rVarD = efm.r.just(new Data(null, null, false, 6, null));
                            Intrinsics.h(rVarD);
                        }
                    } else if (str4 == null || (rVarD = com.revolut.domain.interactors.transactions.a.d(aVar14, new r9(str4), null, null, null, ynf.d.f, 14)) == null) {
                        rVarD = z9h.n.f(null, null, false, 6, null);
                        Intrinsics.checkNotNullExpressionValue(rVarD, "just(...)");
                    }
                    int i104 = 24;
                    efm.r map = te0.w.o(m70.a.e(rVarD, new yjh.b0(20), new yjh.b0(21)), m70.a.g(((anf.r) dVar.f315466a).b(AccountId.Personal.f51414a), null, new yjh.b0(22), 1), dVar.f315468c.b(), ue0.e.E(m70.a.e(dVar.d.b(transaction3), new yjh.b0(23), new yjh.b0(i104)), new snf.y(null, null)), rd0.e.c(dVar.e.a(transaction3), kotlin.coroutines.g.f186406a)).map(new yma.r(new yjj.j(i104), 20));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    vkm.d dVarB3 = rd0.e.b(ue0.e.E(map, new xnf.a(null, new snf.y(null, null), null, 10)));
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector12);
                    Object objCollect2 = dVarB3.collect(new h9(flowCollector12, 13), this);
                    if (objCollect2 != aVar13) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar13) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = this.f184825w;
                    tof.a3 a3Var = (tof.a3) this.f184826x;
                    if (a3Var.f272600m == null) {
                        flowE = new go.g(null, 2);
                    } else {
                        Flow flowM = ((klf.m) obj3).f185528c.m(a3Var);
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        flowE = rd0.e.e(new a6e.b(rd0.e.n(flowM, h0Var2), i3), h0Var2, new i23.c(i6, 23, continuation));
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowE, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                klf.o oVar = (klf.o) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = this.f184825w;
                    tof.a3 a3Var2 = (tof.a3) this.f184826x;
                    if (a3Var2.k.f115082a >= 0 || !((y6Var = a3Var2.e) == tof.y6.ATM || y6Var == tof.y6.CARD_PAYMENT)) {
                        gVar3 = new go.g(null, 2);
                    } else {
                        bal.a aVar17 = oVar.f185543c;
                        String transactionId2 = a3Var2.f272581b;
                        ayc.i iVar2 = (ayc.i) aVar17;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        gVar3 = new kge.b(rd0.e.b(nim.a.w(iVar2.f11133h.f(transactionId2, true), new ayc.a(iVar2, i6))), 11);
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, gVar3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = this.f184825w;
                    tof.s sVar = ((tof.a3) this.f184826x).E0;
                    if (sVar == null) {
                        flowB = new go.g(null, 2);
                    } else {
                        whf.b bVar2 = ((klf.p) obj3).f185551b;
                        i7.c cVar7 = tof.i7.Companion;
                        tof.f8 f8Var = new tof.f8(sVar.f273033a);
                        tof.y6[] y6VarArr = {tof.y6.EXCHANGE};
                        cVar7.getClass();
                        flowB = rd0.e.b(m70.a.g(whf.b.a(bVar2, te0.w.h(i7.c.a(f8Var, i7.c.d(y6VarArr), new tof.l7())), null, null, null, 14), null, null, 3));
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, flowB, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = this.f184825w;
                    klf.o0 o0Var = (klf.o0) this.f184826x;
                    klf.s0 s0Var = (klf.s0) obj3;
                    Flow gVar8 = o0Var == null ? new go.g(null, 2) : new vkm.y(new kb7.c(o0Var, continuation, 20), new hy1.b0(n14.k.p(nim.a.v(rd0.e.b(whf.b.a(s0Var.f185571c, te0.w.h(o0Var.f185544a), null, 1, null, 10)), new kkk.u(6)), new kkk.u(7)), s0Var, o0Var, 15));
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, gVar8, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = this.f184825w;
                    Flow v1Var = ((Boolean) this.f184826x).booleanValue() ? new vkm.v1(new k0g.b(vkm.q.t(ta6.a.I(10000L, TimeUnit.MILLISECONDS), 1), (Continuation) null, (Function1) obj3)) : vkm.i.f290039a;
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, v1Var, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                klf.y0 y0Var = (klf.y0) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = this.f184825w;
                    tof.a3 a3Var3 = (tof.a3) this.f184826x;
                    vkm.j2 j2VarC = vkm.q.c(Boolean.FALSE);
                    fbj.a aVar22 = y0Var.f185609b;
                    CryptoDepositsInteractor$Companion cryptoDepositsInteractor$Companion = fbj.a.Companion;
                    vkm.q0 q0Var = new vkm.q0(new z7(zi0.c.w(aVar22.f(a3Var3, hVar)), a3Var3, 9), new kae.d(j2VarC, continuation, 19), 1);
                    klf.u0 u0Var = klf.y0.Companion;
                    iyi.j jVar = new iyi.j(y0Var, continuation, i2);
                    u0Var.getClass();
                    vkm.f fVarJ = vkm.q.J(q0Var, vkm.q.Q(vkm.q.q(j2VarC), new m5(null, jVar)));
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, fVarJ, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = this.f184825w;
                    String feeBreakdownId = (String) this.f184826x;
                    if (feeBreakdownId == null) {
                        flowQ = new go.g(new Data(null, null, false, 7, null), 2);
                    } else {
                        h76.a aVar24 = ((klf.z0) obj3).f185614b;
                        Intrinsics.checkNotNullParameter(feeBreakdownId, "feeBreakdownId");
                        flowQ = vkm.q.Q(vkm.q.q(rd0.e.b(xv5.c.b(aVar24.f149863b))), new eh9.j(continuation, aVar24, feeBreakdownId, 16));
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, flowQ, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                klf.b1 b1Var = (klf.b1) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = this.f184825w;
                    Pair pair3 = (Pair) this.f184826x;
                    Data data = (Data) pair3.f186385a;
                    boolean zBooleanValue2 = ((Boolean) pair3.f186386b).booleanValue();
                    if (Intrinsics.f(data.getContent(), Boolean.TRUE) && zBooleanValue2 && !((o8b.c) b1Var.e).g()) {
                        sa6.z zVar = b1Var.d;
                        String transactionId3 = b1Var.f185447b.f185494j;
                        Intrinsics.checkNotNullParameter(transactionId3, "transactionId");
                        ya6.d0 d0Var2 = (ya6.d0) zVar.f261354a;
                        d0Var2.getClass();
                        Intrinsics.checkNotNullParameter(transactionId3, "transactionId");
                        xe0.e eVar = d0Var2.f311959a;
                        String strQ = j6.a.q("BANNER_STATE_TRANSACTION_ID_", transactionId3);
                        Type CARD_DONATION_BANNER_STATE_TYPE = ya6.d0.f311958b;
                        Intrinsics.checkNotNullExpressionValue(CARD_DONATION_BANNER_STATE_TYPE, "CARD_DONATION_BANNER_STATE_TYPE");
                        efm.r map2 = rd0.e.c(eVar.C0(strQ, CARD_DONATION_BANNER_STATE_TYPE), kotlin.coroutines.g.f186406a).map(new sa6.a(new sa6.y(i22), i5));
                        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                        gVar4 = new kge.b(rd0.e.b(map2), i5);
                    } else {
                        gVar4 = (data.getLoading() && data.getContent() == null) ? new go.g(new Data(null, null, true, 3, null), 2) : new go.g(zi0.c.P(ba6.h0.DISMISSED, false, null, 3), 2);
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, gVar4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = this.f184825w;
                    String value = (String) this.f184826x;
                    if (value == null) {
                        flowE2 = new go.g(null, 2);
                    } else {
                        b9k.f fVar3 = ((klf.f1) obj3).f185475a;
                        Intrinsics.checkNotNullParameter(value, "value");
                        flowE2 = rd0.e.e(new g48.r(mo3.a.g(fVar3.s(value, hVar), null, klf.d1.f185465a, 1), i3), zhm.h0.f322473a, new i23.c(i6, i2, continuation));
                    }
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, flowE2, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                return b(obj2);
            case 22:
                return c(obj2);
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = this.f184825w;
                    String str6 = (String) this.f184826x;
                    Flow gVar9 = str6 == null ? new go.g(null, 2) : rd0.e.e(mo3.a.g(hj8.a.a(((klf.m1) obj3).f185531c, str6, hVar), null, klf.k1.f185521a, 1), zhm.h0.f322473a, new i23.c(i6, 28, continuation));
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, gVar9, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                return n(obj2);
            case 25:
                return o(obj2);
            case 26:
                return p(obj2);
            case 27:
                return s(obj2);
            case 28:
                return t(obj2);
            default:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = this.f184825w;
                    String str7 = (String) this.f184826x;
                    Flow bVar3 = str7 != null ? new a6e.b(rd0.e.n(zi0.c.w(rd0.e.b(((yua.q) ((klf.z2) obj3).d).o(str7))), zhm.h0.f322473a), i2) : new go.g(null, 2);
                    this.f184825w = null;
                    this.f184826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, bVar3, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5(Continuation continuation, Function1 function1) {
        super(3, continuation);
        this.u = 16;
        this.f184827y = (gim.i) function1;
    }
}
