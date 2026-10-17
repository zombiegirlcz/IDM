package a67;

import a26.s;
import ahe.a1;
import ahe.z0;
import au.c0;
import au6.k0;
import c64.b0;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import cv3.u;
import d6a.m;
import dej.o3;
import dfj.g0;
import e7l.g;
import efm.r;
import eq5.m0;
import eq5.x0;
import gim.i;
import go.g;
import h93.j0;
import h93.l0;
import j54.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jt1.z;
import kd8.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kye.k3;
import kye.r2;
import kye.s2;
import le.u1;
import ngm.n;
import nii.y0;
import pi3.p;
import q6i.a0;
import skm.e0;
import skm.p0;
import v30.b1;
import v30.c1;
import v30.d1;
import vkm.q;
import vkm.v1;
import w4l.h;
import w4l.j;
import w4l.k;
import wkm.l;
import xdb.y;
import yhm.o;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function3 {
    public Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f1552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f1553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f1554y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f1554y = obj2;
        this.A = obj3;
        this.z = str;
    }

    private final Object b(Object obj2) throws IOException {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            List blockchains = (List) this.f1553x;
            ap5.b bVar = ((x0) this.f1554y).f;
            xi0.b currency = ((CryptoAddress) this.z).f71060b;
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchains, "blockchains");
            hp5.o oVar = (hp5.o) bVar.f8094a;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchains, "blockchains");
            List list = blockchains;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(u1.h((wk5.a) it8.next(), wk5.b.a()));
            }
            jhi.b bVarE = mo3.a.e(nim.a.v(rd0.e.b(oVar.f154489m.e(new hp5.f(d0.k0(arrayList, ",", null, null, 0, null, 62), currency), h.f294642c)), new s((List) this.A, blockchains, 15)), new k0(blockchains, 1), m0.f128290a);
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            if (q.u(flowCollector, bVarE, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        if (vkm.q.u(r3, r15, r14) == r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f1554y
            com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j r0 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) r0
            com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r14.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2e
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            yhm.o.b(r15)
            r13 = r14
            goto L9f
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            java.lang.Object r1 = r14.A
            xi0.b r1 = (xi0.b) r1
            java.lang.Object r3 = r14.z
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            yhm.o.b(r15)
            r13 = r14
            goto L66
        L2e:
            yhm.o.b(r15)
            kotlinx.coroutines.flow.FlowCollector r3 = r14.f1552w
            java.lang.Object r15 = r14.f1553x
            kotlin.Pair r15 = (kotlin.Pair) r15
            java.lang.Object r7 = r15.f186385a
            r9 = r7
            xi0.b r9 = (xi0.b) r9
            java.lang.Object r15 = r15.f186386b
            r11 = r15
            wk5.a r11 = (wk5.a) r11
            eq5.x0 r8 = r0.f71278q
            com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r15 = r1.getF71153a()
            wk5.a r15 = r15.f71063h
            wk5.k r10 = wk5.m.a(r15)
            com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r15 = r1.getF71153a()
            java.util.Set r12 = r15.i
            r14.f1552w = r6
            r14.f1553x = r6
            r14.z = r3
            r14.A = r9
            r14.v = r5
            r13 = r14
            java.lang.Object r15 = r8.k(r9, r10, r11, r12, r13)
            if (r15 != r2) goto L65
            goto L9e
        L65:
            r1 = r9
        L66:
            wk5.a r15 = (wk5.a) r15
            ap5.b r5 = r0.f71277p
            r7 = 0
            ho5.a r8 = ho5.a.NONE
            efm.r r5 = ap5.b.f(r5, r7, r8)
            vkm.d r5 = rd0.e.b(r5)
            a9j.n r7 = new a9j.n
            r8 = 2
            r7.<init>(r0, r8, r1, r15)
            akg.n r0 = nim.a.v(r5, r7)
            go.g r5 = new go.g
            r7 = 2
            r5.<init>(r1, r7)
            go.g r1 = new go.g
            r1.<init>(r15, r7)
            j23.b r15 = yh5.b.e(r0, r5, r1)
            r13.f1552w = r6
            r13.f1553x = r6
            r13.z = r6
            r13.A = r6
            r13.v = r4
            java.lang.Object r15 = vkm.q.u(r3, r15, r14)
            if (r15 != r2) goto L9f
        L9e:
            return r2
        L9f:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: a67.c.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            if (((Boolean) this.f1553x).booleanValue()) {
                gVar = nim.a.v(((yb5.e) ((com.revolut.feature.credit.card.impl.ui.repay.flow.b) this.A).u).b((String) this.z, j.f294644c), gu4.i.f146699a);
            } else {
                gVar = new g((Data) this.f1554y, 2);
            }
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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

    private final Object o(Object obj2) {
        FlowCollector flowCollector = this.f1552w;
        Throwable th10 = (Throwable) this.f1553x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsOrderingInteractor", null, th10, h0Var);
            Data dataP = zi0.c.P(d0.P0((List) this.f1554y, new fad.i((o3) this.A, 18)), false, null, 3);
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            if (flowCollector.emit(dataP, this) == aVar) {
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

    private final Object p(Object obj2) throws Throwable {
        com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f1554y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            Data data = (Data) this.f1553x;
            z5i.c cVar = dVar.z;
            AccountWrapper accountWrapper = (AccountWrapper) this.z;
            dj0.d dVar2 = new dj0.d(0L, accountWrapper.getCurrency());
            f0 f0Var = f0.f322471a;
            x5i.a aVar2 = new x5i.a(dVar2, accountWrapper, null, f0Var);
            AccountWrapper accountWrapper2 = (AccountWrapper) this.A;
            x5i.a aVar3 = new x5i.a(new dj0.d(0L, accountWrapper2.getCurrency()), accountWrapper2, null, f0Var);
            OrderMode.Market market = new OrderMode.Market(null);
            OrderQuote orderQuote = (OrderQuote) data.getContent();
            TransferAvailability transferAvailability = orderQuote != null ? orderQuote.f104760n : null;
            OrderQuote orderQuote2 = (OrderQuote) data.getContent();
            l lVarC = ((a0) cVar).c(aVar2, aVar3, market, transferAvailability, orderQuote2 != null ? orderQuote2.f104761p : null);
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            q.w(flowCollector);
            Object objCollect = lVarC.collect(new b8d.a0(flowCollector, data, 4), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (vkm.q.u(r4, r11, r10) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1554y
            jt1.z r0 = (jt1.z) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r11)
            goto L99
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r2 = r10.A
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r2 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData) r2
            java.lang.Object r4 = r10.z
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            yhm.o.b(r11)
            goto L4b
        L2a:
            yhm.o.b(r11)
            kotlinx.coroutines.flow.FlowCollector r11 = r10.f1552w
            java.lang.Object r2 = r10.f1553x
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r2 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData) r2
            rt1.a r6 = r0.f178307r
            efm.b r6 = r6.c0(r2)
            r10.f1552w = r5
            r10.f1553x = r5
            r10.z = r11
            r10.A = r2
            r10.v = r4
            java.lang.Object r4 = nim.a.a(r6, r10)
            if (r4 != r1) goto L4a
            goto L98
        L4a:
            r4 = r11
        L4b:
            com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b r11 = r0.f178305p
            r11.getClass()
            java.lang.String r0 = "transferData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            x02.b r0 = r11.d
            com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData r6 = r11.f61616a
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection r6 = r6.k7()
            q12.f r0 = (q12.f) r0
            t38.e r0 = r0.b(r6, r2)
            vo9.a r6 = r11.f
            com.revolut.feature.transfer.core.models.FundingSource r7 = r2.f61631a
            com.revolut.core.model.account.AccountId r8 = r2.f61633c
            yt9.g r6 = (yt9.g) r6
            kotlinx.coroutines.flow.Flow r6 = r6.g(r7, r8)
            a32.c r7 = new a32.c
            r8 = 3
            r9 = 4
            r7.<init>(r8, r9, r5)
            t38.e r8 = new t38.e
            r9 = 24
            r8.<init>(r0, r9, r6, r7)
            eh9.j r0 = new eh9.j
            r6 = 28
            r0.<init>(r5, r11, r2, r6)
            wkm.l r11 = vkm.q.Q(r8, r0)
            r10.f1552w = r5
            r10.f1553x = r5
            r10.z = r5
            r10.A = r5
            r10.v = r3
            java.lang.Object r11 = vkm.q.u(r4, r11, r10)
            if (r11 != r1) goto L99
        L98:
            return r1
        L99:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a67.c.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            v1 v1VarK = n.K(new v0((jt4.i) this.f1554y, (String) this.z, (String) this.A, (Continuation) null, 6));
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            if (q.u(flowCollector, v1VarK, this) == aVar) {
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

    private final Object u(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            Flow flowJ = ((Boolean) this.f1553x).booleanValue() ? ((k1c.b) this.f1554y).j((String) this.z, (RevPointsRimWidgetContext) this.A) : org.bouncycastle.jcajce.provider.digest.a.s(3, null);
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            if (q.u(flowCollector, flowJ, this) == aVar) {
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

    private final Object v(Object obj2) {
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            if (((Boolean) this.f1553x).booleanValue()) {
                gd8.q qVar = ((x) this.f1554y).f182859a;
                k loadingStrategy = (k) this.z;
                gd8.x xVar = (gd8.x) qVar;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                gVar = nim.a.v(xVar.d.b(Unit.f186387a, loadingStrategy), new ghk.x((xc8.d) this.A, 17));
            } else {
                gVar = new g(new Data(f0.f322471a, null, false, 6, null), 2);
            }
            this.f1552w = null;
            this.f1553x = null;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (vkm.q.u(r9, r1, r8) != r2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f1554y
            kkf.q r0 = (kkf.q) r0
            ep6.n r1 = r0.f184898q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2c
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r9)
            goto L8d
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r3 = r8.z
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r8.A
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            yhm.o.b(r9)
            goto L60
        L2c:
            yhm.o.b(r9)
            kotlinx.coroutines.flow.FlowCollector r9 = r8.f1552w
            java.lang.Object r3 = r8.f1553x
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L3f
            zhm.f0 r0 = zhm.f0.f322471a
            go.g r1 = new go.g
            r1.<init>(r0, r4)
            goto L7c
        L3f:
            r8.f1552w = r6
            r8.f1553x = r6
            r8.A = r9
            r8.z = r3
            r8.v = r5
            use.d r5 = r0.f184900s
            pfm.r r5 = r5.d(r3)
            pfm.a r5 = ue0.e.v(r5)
            java.lang.Object r5 = nim.a.a(r5, r8)
            if (r5 != r2) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L5c:
            if (r5 != r2) goto L5f
            goto L8c
        L5f:
            r5 = r9
        L60:
            yo6.d r9 = yo6.d.TICKETOR
            ep6.e r7 = ep6.n.Companion
            kotlinx.coroutines.flow.Flow r9 = r1.I1(r3, r9, r6)
            kotlinx.coroutines.flow.Flow r1 = r1.F1()
            j40.d r3 = new j40.d
            r7 = 14
            r3.<init>(r0, r6, r7)
            t38.e r0 = new t38.e
            r7 = 24
            r0.<init>(r9, r7, r1, r3)
            r1 = r0
            r9 = r5
        L7c:
            r8.f1552w = r6
            r8.f1553x = r6
            r8.A = r6
            r8.z = r6
            r8.v = r4
            java.lang.Object r9 = vkm.q.u(r9, r1, r8)
            if (r9 != r2) goto L8d
        L8c:
            return r2
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a67.c.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final Object x(Object obj2) {
        ?? r56;
        Flow gVar;
        k3 k3Var = (k3) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f1552w;
            dj0.d dVar = (dj0.d) this.f1553x;
            long j2 = dVar.f115082a;
            Continuation continuation = null;
            if (j2 == -1 || j2 == 0) {
                r56 = 0;
                gVar = new g(null, 2);
            } else {
                SelectedMethod selectedMethod = (SelectedMethod) this.f1554y;
                if (selectedMethod instanceof vye.b) {
                    gVar = ((vye.b) selectedMethod).e == null ? new g(null, 2) : k3.Y2(new jld.h(8, k3Var, selectedMethod, dVar, (l71.d) this.A, null));
                } else if (selectedMethod instanceof SelectedMethod.StoredMethod.Card) {
                    gVar = k3.Y2(new r2(k3Var, selectedMethod, dVar, (l71.d) this.A, null));
                } else if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.d) {
                    gVar = ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.d) selectedMethod).e ? k3.Y2(new s2(k3Var, dVar, continuation, 0)) : new g(null, 2);
                } else if (selectedMethod instanceof vye.a) {
                    gVar = k3.Y2(new s2(k3Var, dVar, continuation, 1));
                } else if (selectedMethod instanceof vye.d) {
                    vye.d dVar2 = (vye.d) selectedMethod;
                    vye.c cVar = dVar2.e;
                    if (cVar == vye.c.UPI_APP || cVar == vye.c.NET_BANKING) {
                        Continuation continuation2 = null;
                        gVar = k3.Y2(new v0(k3Var, dVar2, dVar, continuation2, 15));
                        r56 = continuation2;
                    } else {
                        gVar = new g(null, 2);
                    }
                } else {
                    Continuation continuation3 = null;
                    if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) {
                        TopupMethodType topupMethodType = TopupMethodType.UPI_APP;
                        if (((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) selectedMethod).f90932g) {
                            gVar = new g(null, 2);
                            r56 = continuation3;
                        } else {
                            gVar = k3.Y2(new v0(k3Var, topupMethodType, dVar, continuation3, 14));
                            r56 = continuation3;
                        }
                    } else if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) {
                        TopupMethodType topupMethodType2 = TopupMethodType.NET_BANKING;
                        if (((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) selectedMethod).f90918g) {
                            gVar = new g(null, 2);
                            r56 = continuation3;
                        } else {
                            gVar = k3.Y2(new v0(k3Var, topupMethodType2, dVar, continuation3, 14));
                            r56 = continuation3;
                        }
                    } else {
                        gVar = new g(null, 2);
                        r56 = continuation3;
                    }
                }
                r56 = 0;
            }
            this.f1552w = r56;
            this.f1553x = r56;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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

    /* JADX WARN: Type inference failed for: r2v21, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                c cVar = new c((Continuation) obj4, (d) this.f1554y, (String) this.z, (String) this.A, 0);
                cVar.f1552w = flowCollector;
                cVar.f1553x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c((Continuation) obj4, (a8k.d) this.f1554y, (PaymentLinksTransferData) this.z, (OrderQuote) this.A, 1);
                cVar2.f1552w = flowCollector;
                cVar2.f1553x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c((Continuation) obj4, (List) this.f1554y, (a1) this.z, (Data) this.A, 2);
                cVar3.f1552w = flowCollector;
                cVar3.f1553x = obj3;
                return cVar3.invokeSuspend(Unit.f186387a);
            case 3:
                c cVar4 = new c((Continuation) obj4, (b67.c) this.f1554y, (String) this.z, (String) this.A, 3);
                cVar4.f1552w = flowCollector;
                cVar4.f1553x = obj3;
                return cVar4.invokeSuspend(Unit.f186387a);
            case 4:
                c cVar5 = new c((Continuation) obj4, (com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) this.f1554y, (Reservation.Guarantee) this.z, (y) this.A, 4);
                cVar5.f1552w = flowCollector;
                cVar5.f1553x = obj3;
                return cVar5.invokeSuspend(Unit.f186387a);
            case 5:
                c cVar6 = new c((Continuation) obj4, (buf.a1) this.f1554y, 5);
                cVar6.f1552w = flowCollector;
                cVar6.f1553x = obj3;
                return cVar6.invokeSuspend(Unit.f186387a);
            case 6:
                c cVar7 = new c((Continuation) obj4, (Function1) this.f1554y, (tji.f) this.z, (y0) this.A, 6);
                cVar7.f1552w = flowCollector;
                cVar7.f1553x = obj3;
                return cVar7.invokeSuspend(Unit.f186387a);
            case 7:
                c cVar8 = new c((Continuation) obj4, (c0a.b) this.f1554y, (zm3.a) this.z, (zz9.s) this.A, 7);
                cVar8.f1552w = flowCollector;
                cVar8.f1553x = obj3;
                return cVar8.invokeSuspend(Unit.f186387a);
            case 8:
                c cVar9 = new c((MutableStateFlow) this.f1554y, (TranscriptIdentifier) this.z, (c30.h) this.A, (Continuation) obj4, 8);
                cVar9.f1552w = flowCollector;
                cVar9.f1553x = (d1) obj3;
                return cVar9.invokeSuspend(Unit.f186387a);
            case 9:
                c cVar10 = new c((Continuation) obj4, (b0) this.f1554y, 9);
                cVar10.f1552w = flowCollector;
                cVar10.f1553x = obj3;
                return cVar10.invokeSuspend(Unit.f186387a);
            case 10:
                c cVar11 = new c((Continuation) obj4, (c67.b) this.f1554y, (String) this.z, (String) this.A, 10);
                cVar11.f1552w = flowCollector;
                cVar11.f1553x = obj3;
                return cVar11.invokeSuspend(Unit.f186387a);
            case 11:
                c cVar12 = new c((Continuation) obj4, (Ref$BooleanRef) this.f1554y, (Function2) this.z);
                cVar12.f1552w = flowCollector;
                cVar12.f1553x = obj3;
                return cVar12.invokeSuspend(Unit.f186387a);
            case 12:
                int i = 12;
                c cVar13 = new c(i, (y5a.d) this.f1554y, (m) this.A, (String) this.z, (Continuation) obj4);
                cVar13.f1552w = flowCollector;
                cVar13.f1553x = obj3;
                return cVar13.invokeSuspend(Unit.f186387a);
            case 13:
                c cVar14 = new c((Continuation) obj4, (dfj.w) this.f1554y, (String) this.z, (String) this.A, 13);
                cVar14.f1552w = flowCollector;
                cVar14.f1553x = obj3;
                return cVar14.invokeSuspend(Unit.f186387a);
            case 14:
                c cVar15 = new c((Continuation) obj4, (g0) this.f1554y, (String) this.z, (k) this.A, 14);
                cVar15.f1552w = flowCollector;
                cVar15.f1553x = obj3;
                return cVar15.invokeSuspend(Unit.f186387a);
            case 15:
                c cVar16 = new c((Continuation) obj4, (e0i.d) this.f1554y, (dj0.d) this.z, (wd6.h) this.A, 15);
                cVar16.f1552w = flowCollector;
                cVar16.f1553x = obj3;
                return cVar16.invokeSuspend(Unit.f186387a);
            case 16:
                c cVar17 = new c((Continuation) obj4, (ei3.m) this.f1554y, (pi3.l) this.z, (pi3.l) this.A, 16);
                cVar17.f1552w = flowCollector;
                cVar17.f1553x = obj3;
                return cVar17.invokeSuspend(Unit.f186387a);
            case 17:
                c cVar18 = new c((Continuation) obj4, (x0) this.f1554y, (CryptoAddress) this.z, (List) this.A, 17);
                cVar18.f1552w = flowCollector;
                cVar18.f1553x = obj3;
                return cVar18.invokeSuspend(Unit.f186387a);
            case 18:
                c cVar19 = new c((Continuation) obj4, (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.f1554y, 18);
                cVar19.f1552w = flowCollector;
                cVar19.f1553x = obj3;
                return cVar19.invokeSuspend(Unit.f186387a);
            case 19:
                c cVar20 = new c((Continuation) obj4, (akg.n) this.f1554y, (fnc.d0) this.z, (akg.n) this.A, 19);
                cVar20.f1552w = flowCollector;
                cVar20.f1553x = obj3;
                return cVar20.invokeSuspend(Unit.f186387a);
            case 20:
                int i2 = 20;
                c cVar21 = new c(i2, (Data) this.f1554y, (com.revolut.feature.credit.card.impl.ui.repay.flow.b) this.A, (String) this.z, (Continuation) obj4);
                cVar21.f1552w = flowCollector;
                cVar21.f1553x = obj3;
                return cVar21.invokeSuspend(Unit.f186387a);
            case 21:
                c cVar22 = new c((List) this.f1554y, (r10.a) this.z, (o3) this.A, (Continuation) obj4, 21);
                cVar22.f1552w = flowCollector;
                cVar22.f1553x = (Throwable) obj3;
                return cVar22.invokeSuspend(Unit.f186387a);
            case 22:
                c cVar23 = new c((Continuation) obj4, (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f1554y, (AccountWrapper) this.z, (AccountWrapper) this.A, 22);
                cVar23.f1552w = flowCollector;
                cVar23.f1553x = obj3;
                return cVar23.invokeSuspend(Unit.f186387a);
            case 23:
                c cVar24 = new c((Continuation) obj4, (z) this.f1554y, 23);
                cVar24.f1552w = flowCollector;
                cVar24.f1553x = obj3;
                return cVar24.invokeSuspend(Unit.f186387a);
            case 24:
                c cVar25 = new c((Continuation) obj4, (jt4.i) this.f1554y, (String) this.z, (String) this.A, 24);
                cVar25.f1552w = flowCollector;
                cVar25.f1553x = obj3;
                return cVar25.invokeSuspend(Unit.f186387a);
            case 25:
                c cVar26 = new c((Continuation) obj4, (k1c.b) this.f1554y, (String) this.z, (RevPointsRimWidgetContext) this.A, 25);
                cVar26.f1552w = flowCollector;
                cVar26.f1553x = obj3;
                return cVar26.invokeSuspend(Unit.f186387a);
            case 26:
                c cVar27 = new c((Continuation) obj4, (x) this.f1554y, (k) this.z, (xc8.d) this.A, 26);
                cVar27.f1552w = flowCollector;
                cVar27.f1553x = obj3;
                return cVar27.invokeSuspend(Unit.f186387a);
            case 27:
                c cVar28 = new c((Continuation) obj4, (kkf.q) this.f1554y, 27);
                cVar28.f1552w = flowCollector;
                cVar28.f1553x = obj3;
                return cVar28.invokeSuspend(Unit.f186387a);
            case 28:
                c cVar29 = new c((Continuation) obj4, (SelectedMethod) this.f1554y, (k3) this.z, (l71.d) this.A, 28);
                cVar29.f1552w = flowCollector;
                cVar29.f1553x = obj3;
                return cVar29.invokeSuspend(Unit.f186387a);
            default:
                c cVar30 = new c((le3.i) this.z, (Set) this.A, (Continuation) obj4);
                cVar30.f1552w = flowCollector;
                cVar30.f1554y = (Data) obj3;
                return cVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v97, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowCollector flowCollector;
        Flow flowS;
        Iterable iterable;
        Flow iVar;
        FlowCollector flowCollector2;
        Flow flowS2;
        FlowCollector flowCollector3;
        ManualTransferData transferData;
        Flow gVar;
        Flow gVar2;
        r map;
        FlowCollector flowCollector4;
        u uVar;
        FlowCollector flowCollector5;
        Flow flowS3;
        FlowCollector flowCollector6;
        FlowCollector flowCollector7;
        Object objInvoke;
        Object objInvoke2;
        Flow flowC;
        Flow flowB;
        Flow flowD;
        y5a.d dVar;
        FlowCollector flowCollector8;
        Flow gVar3;
        vkm.d b4;
        p pVar;
        p pVar2;
        p pVar3;
        vkm.d dVarB;
        List list;
        int i = this.u;
        int i2 = 16;
        int i3 = 12;
        od0.i iVar2 = od0.i.f224256b;
        Object[] objArr = 0;
        int i5 = 3;
        Continuation continuation = null;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector9 = this.f1552w;
                    if (((Boolean) this.f1553x).booleanValue()) {
                        flowS = ((d) this.f1554y).j((String) this.z, (String) this.A);
                        flowCollector = null;
                    } else {
                        flowCollector = null;
                        flowS = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    }
                    this.f1552w = flowCollector;
                    this.f1553x = flowCollector;
                    this.v = 1;
                    if (q.u(flowCollector9, flowS, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                PaymentLinksTransferData transferData2 = (PaymentLinksTransferData) this.z;
                a8k.d dVar2 = (a8k.d) this.f1554y;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector10 = this.f1552w;
                    Pair pair = (Pair) this.f1553x;
                    PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) pair.f186385a;
                    long jLongValue = ((Number) pair.f186386b).longValue();
                    p8k.a aVar3 = dVar2.f2282m;
                    OrderQuote orderQuote = (OrderQuote) this.A;
                    p8k.j jVar = (p8k.j) aVar3;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(transferData2, "transferData");
                    l lVarQ = q.Q(jVar.f234180w, new p8k.g(null, jVar, orderQuote, transferData2, jLongValue));
                    OrderQuote orderQuote2 = (OrderQuote) this.A;
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    q.w(flowCollector10);
                    Object objCollect = lVarQ.collect(new a8k.c(flowCollector10, orderQuote2, jLongValue, dVar2, transferData2, paymentPocketInfo), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                List list2 = (List) this.f1554y;
                a1 a1Var = (a1) this.z;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector11 = this.f1552w;
                    List list3 = (List) this.f1553x;
                    int i32 = 10;
                    if (list3.isEmpty()) {
                        iterable = list2;
                    } else {
                        List list4 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list4, 10));
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            ohe.b bVar = (ohe.b) it8.next();
                            List list5 = list3;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list5) {
                                if (obj3 instanceof ProductAccountDescriptor$Value.Main) {
                                    arrayList2.add(obj3);
                                }
                            }
                            zhm.q qVarK1 = d0.k1(arrayList2);
                            int iB = q0.b(w.t(qVarK1, i32));
                            if (iB < i2) {
                                iB = i2;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                            Iterator it9 = qVarK1.iterator();
                            while (true) {
                                kotlin.jvm.internal.d dVar3 = (kotlin.jvm.internal.d) it9;
                                if (((Iterator) dVar3.f186416c).hasNext()) {
                                    IndexedValue indexedValue = (IndexedValue) dVar3.next();
                                    linkedHashMap.put(((ProductAccountDescriptor$Value.Main) indexedValue.f186392b).f89728b.f89729a, Integer.valueOf(indexedValue.f186391a));
                                } else {
                                    ArrayList<ProductAccountDescriptor$Value.Main> arrayList3 = new ArrayList();
                                    for (Object obj4 : list5) {
                                        if (obj4 instanceof ProductAccountDescriptor$Value.Main) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    int iB2 = q0.b(w.t(arrayList3, i32));
                                    if (iB2 < i2) {
                                        iB2 = i2;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                                    for (ProductAccountDescriptor$Value.Main main : arrayList3) {
                                        linkedHashMap2.put(main.f89728b.f89729a, main.f89727a);
                                    }
                                    ArrayList arrayListB = bVar.b();
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj5 : arrayListB) {
                                        ohe.a aVar5 = (ohe.a) obj5;
                                        ProductAccount productAccount = aVar5.f225352b;
                                        Iterator it10 = it8;
                                        ProductAccount.ValueItem.Main main2 = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
                                        if (main2 == null || linkedHashMap2.get(main2.f89504c.f89729a) != aVar5.f225351a.f89553a) {
                                            arrayList5.add(obj5);
                                        } else {
                                            arrayList4.add(obj5);
                                        }
                                        it8 = it10;
                                    }
                                    arrayList.add(ohe.b.a(bVar, arrayList5, d0.P0(arrayList4, new z0(linkedHashMap, 0))));
                                    it8 = it8;
                                    i2 = 16;
                                    i32 = 10;
                                }
                            }
                        }
                        iterable = arrayList;
                    }
                    ArrayList<ahe.x0> arrayList6 = new ArrayList();
                    int i33 = 0;
                    for (Object obj6 : iterable) {
                        int i43 = i33 + 1;
                        if (i33 < 0) {
                            v.s();
                            throw null;
                        }
                        ohe.b bVar2 = (ohe.b) obj6;
                        if (!bVar2.d.isEmpty()) {
                            ProductSpaceIdentifier.Favourites favourites = ProductSpaceIdentifier.Favourites.f89744c;
                            pie.v vVar = pie.v.FLAT_ROOT;
                            List list6 = bVar2.d;
                            ArrayList arrayList7 = new ArrayList(w.t(list6, 10));
                            Iterator it11 = list6.iterator();
                            while (it11.hasNext()) {
                                arrayList7.add(a1.a((ohe.a) it11.next()));
                            }
                            arrayList6.add(new ahe.x0(favourites, vVar, arrayList7, bVar2.d, i33, true));
                        }
                        List list7 = bVar2.f225355b;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Object obj7 : list7) {
                            ProductContext productContext = ((ohe.a) obj7).f225351a;
                            Pair pair2 = new Pair(productContext.f89554b, productContext.f89555c);
                            Object arrayList8 = linkedHashMap3.get(pair2);
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                                linkedHashMap3.put(pair2, arrayList8);
                            }
                            ((List) arrayList8).add(obj7);
                        }
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Pair pair3 = (Pair) entry.getKey();
                            List list8 = (List) entry.getValue();
                            ProductSpaceIdentifier productSpaceIdentifier = (ProductSpaceIdentifier) pair3.f186385a;
                            pie.v vVar2 = (pie.v) pair3.f186386b;
                            List list9 = list8;
                            ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
                            Iterator it12 = list9.iterator();
                            while (it12.hasNext()) {
                                arrayList9.add(a1.a((ohe.a) it12.next()));
                            }
                            arrayList6.add(new ahe.x0(productSpaceIdentifier, vVar2, arrayList9, list8, i33, false));
                        }
                        i33 = i43;
                    }
                    if (arrayList6.isEmpty()) {
                        iVar = new g(Data.copy$default((Data) this.A, iterable, null, false, 6, null), 2);
                    } else {
                        ArrayList arrayList10 = new ArrayList(w.t(arrayList6, 10));
                        for (ahe.x0 x0Var : arrayList6) {
                            arrayList10.add(a1Var.f4975b.n(x0Var.f5054a, x0Var.f5055b, new g(new Data(x0Var.f5056c, null, false, 6, null), 2)));
                        }
                        iVar = new acb.i((Flow[]) d0.d1(arrayList10).toArray(new Flow[0]), arrayList6, iterable, (Data) this.A, a1Var, 1);
                    }
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector11, iVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector12 = this.f1552w;
                    if (((Boolean) this.f1553x).booleanValue()) {
                        flowS2 = ((b67.c) this.f1554y).j((String) this.z, (String) this.A);
                        flowCollector2 = null;
                    } else {
                        flowCollector2 = null;
                        flowS2 = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    }
                    this.f1552w = flowCollector2;
                    this.f1553x = flowCollector2;
                    this.v = 1;
                    if (q.u(flowCollector12, flowS2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector13 = this.f1552w;
                    Flow flowD2 = ((com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) this.f1554y).f82837q.d((Reservation.Guarantee) this.z, ((y) this.A).f304415a);
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector13, flowD2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                buf.a1 a1Var2 = (buf.a1) this.f1554y;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    flowCollector3 = this.f1552w;
                    transferData = (ManualTransferData) this.f1553x;
                    efm.b bVarC0 = a1Var2.f18775s.c0(transferData);
                    this.f1552w = null;
                    this.f1553x = null;
                    this.z = flowCollector3;
                    this.A = transferData;
                    this.v = 1;
                    if (nim.a.a(bVarC0, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    transferData = (ManualTransferData) this.A;
                    flowCollector3 = (FlowCollector) this.z;
                    o.b(obj2);
                }
                com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a aVar9 = a1Var2.f18773q;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                Continuation continuation2 = null;
                l lVarQ2 = q.Q(yh5.b.d(((yt9.g) aVar9.e).g(transferData.f92455a, transferData.f92456b), new v1(new a1a.c(aVar9, transferData, continuation2, 24))), new a32.b(continuation2, aVar9, transferData, i2));
                this.f1552w = null;
                this.f1553x = null;
                this.z = null;
                this.A = null;
                this.v = 2;
                if (q.u(flowCollector3, lVarQ2, this) == aVar8) {
                    return aVar8;
                }
                return Unit.f186387a;
            case 6:
                tji.f fVar = (tji.f) this.z;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector14 = this.f1552w;
                    Object obj8 = this.f1553x;
                    nii.m0 m0Var = (nii.m0) ((Function1) this.f1554y).invoke(obj8);
                    if (m0Var != null) {
                        gVar = new ba4.x(new byc.i(fVar.d(new y0("operation_succeed", m0Var, false, 4)), 1), obj8, i3);
                    } else {
                        y0 y0Var = (y0) this.A;
                        if (y0Var != null) {
                            fVar.b(y0Var);
                            gVar = new g(obj8, 2);
                        } else {
                            gVar = new g(obj8, 2);
                        }
                    }
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector14, gVar, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                zm3.a contact = (zm3.a) this.z;
                c0a.b bVar3 = (c0a.b) this.f1554y;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector15 = this.f1552w;
                    vf0.h hVar = (vf0.h) this.f1553x;
                    Data data = (Data) hVar.f288433a;
                    Map reactions = (Map) hVar.f288434b;
                    Map personalisationsMap = (Map) hVar.f288435c;
                    P2PChatItem p2PChatItem = (P2PChatItem) hVar.d;
                    List listA = (List) data.getContent();
                    if (p2PChatItem != null) {
                        c0a.a aVar12 = bVar3.f20197g;
                        listA = c0a.a.a(listA, p2PChatItem);
                    }
                    List items = listA;
                    if (items != null && items.isEmpty()) {
                        r10.f fVar2 = bVar3.f20195b;
                        zz9.s eligibility = (zz9.s) this.A;
                        b0a.k kVar = (b0a.k) fVar2.c;
                        Intrinsics.checkNotNullParameter(contact, "contact");
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        xu9.a aVar13 = (xu9.a) ((hu9.a) fVar2.b);
                        Intrinsics.checkNotNullParameter(contact, "contact");
                        if (hx7.q.M(contact)) {
                            od0.i.Companion.getClass();
                            map = r.just(iVar2);
                            Intrinsics.checkNotNullExpressionValue(map, "just(...)");
                        } else {
                            map = m70.a.g(((ik3.c) aVar13.f308996a).k(g.b.f123407a), null, null, 3).map(new xt1.a(i3, new xrl.a(23)));
                            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        }
                        gVar2 = ta6.a.h(rd0.e.b(map), kVar.f11641a.e(), kVar.a(contact), new d0a.a(eligibility, null));
                    } else if (items != null) {
                        o7.d dVar4 = bVar3.f20196c;
                        zz9.s eligibility2 = (zz9.s) this.A;
                        Intrinsics.checkNotNullParameter(contact, "contact");
                        Intrinsics.checkNotNullParameter(eligibility2, "eligibility");
                        Intrinsics.checkNotNullParameter(items, "items");
                        Intrinsics.checkNotNullParameter(reactions, "reactions");
                        Intrinsics.checkNotNullParameter(personalisationsMap, "personalisationsMap");
                        gVar2 = new acb.i(((b0a.k) dVar4.f222642b).a(contact), eligibility2, items, reactions, personalisationsMap, 3);
                    } else {
                        gVar2 = data.getLoading() ? new go.g(a.b.f79776a, 2) : new go.g(a.C0519a.f79775a, 2);
                    }
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector15, gVar2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector16 = this.f1552w;
                d1 d1Var = (d1) this.f1553x;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    this.f1552w = null;
                    this.f1553x = d1Var;
                    this.v = 1;
                    if (flowCollector16.emit(d1Var, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (!(d1Var instanceof v30.y0) && !(d1Var instanceof v30.z0) && !(d1Var instanceof v30.a1) && !(d1Var instanceof b1)) {
                    if (!Intrinsics.f(d1Var, c1.f285761a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p0 p0Var = p0.f264001a;
                    elm.f fVar3 = elm.f.f127540b;
                    c30.e eVar = new c30.e((MutableStateFlow) this.f1554y, (TranscriptIdentifier) this.z, (c30.h) this.A, null);
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 2;
                    if (e0.J(fVar3, eVar, this) == aVar14) {
                        return aVar14;
                    }
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    flowCollector4 = this.f1552w;
                    uVar = (u) this.f1553x;
                    this.f1552w = null;
                    this.f1553x = null;
                    this.z = flowCollector4;
                    this.A = uVar;
                    this.v = 1;
                    if (skm.k0.b(300L, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    uVar = (u) this.A;
                    flowCollector4 = (FlowCollector) this.z;
                    o.b(obj2);
                }
                vkm.q0 q0VarK2 = ((b0) this.f1554y).K2(uVar);
                this.f1552w = null;
                this.f1553x = null;
                this.z = null;
                this.A = null;
                this.v = 2;
                if (q.u(flowCollector4, q0VarK2, this) == aVar15) {
                    return aVar15;
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector17 = this.f1552w;
                    if (((Boolean) this.f1553x).booleanValue()) {
                        flowS3 = ((c67.b) this.f1554y).j((String) this.z, (String) this.A);
                        flowCollector5 = null;
                    } else {
                        flowCollector5 = null;
                        flowS3 = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    }
                    this.f1552w = flowCollector5;
                    this.f1553x = flowCollector5;
                    this.v = 1;
                    if (q.u(flowCollector17, flowS3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                ?? r110 = (i) this.z;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    flowCollector6 = this.f1552w;
                    Object obj9 = this.f1553x;
                    Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f1554y;
                    if (ref$BooleanRef.f186407a) {
                        this.f1552w = null;
                        this.f1553x = null;
                        this.A = flowCollector6;
                        this.v = 1;
                        objInvoke2 = r110.invoke(obj9, this);
                        if (objInvoke2 == aVar17) {
                            return aVar17;
                        }
                        flowC = q.C((Flow) objInvoke2, p0.f264002b);
                        flowCollector7 = null;
                    } else {
                        ref$BooleanRef.f186407a = true;
                        flowCollector7 = null;
                        this.f1552w = null;
                        this.f1553x = null;
                        this.A = flowCollector6;
                        this.v = 2;
                        objInvoke = r110.invoke(obj9, this);
                        if (objInvoke == aVar17) {
                            return aVar17;
                        }
                        flowC = (Flow) objInvoke;
                    }
                } else if (i102 == 1) {
                    FlowCollector flowCollector18 = (FlowCollector) this.A;
                    o.b(obj2);
                    flowCollector6 = flowCollector18;
                    objInvoke2 = obj2;
                    flowC = q.C((Flow) objInvoke2, p0.f264002b);
                    flowCollector7 = null;
                } else {
                    if (i102 != 2) {
                        if (i102 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    FlowCollector flowCollector19 = (FlowCollector) this.A;
                    o.b(obj2);
                    flowCollector6 = flowCollector19;
                    flowCollector7 = null;
                    objInvoke = obj2;
                    flowC = (Flow) objInvoke;
                }
                this.f1552w = flowCollector7;
                this.f1553x = flowCollector7;
                this.A = flowCollector7;
                this.v = 3;
                if (q.u(flowCollector6, flowC, this) == aVar17) {
                    return aVar17;
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector20 = this.f1552w;
                    String query = (String) this.f1553x;
                    if (query.length() != 0 || (dVar = (y5a.d) this.f1554y) == null) {
                        m mVar = (m) this.A;
                        String str = (String) this.z;
                        v5a.c cVar = mVar.f111477a;
                        Intrinsics.checkNotNullParameter(query, "query");
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        if (query.length() <= 0 || query.length() >= 2) {
                            b6a.e eVar2 = cVar.f286175a;
                            eVar2.getClass();
                            Intrinsics.checkNotNullParameter(query, "query");
                            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                            flowB = eVar2.e.b(new y5a.a(query, str), loadingStrategy);
                        } else {
                            flowB = new go.g(new Data(new y5a.d(f0.f322471a), null, false, 6, null), 2);
                        }
                        flowD = rd0.e.d(flowB, h0.f322473a);
                    } else {
                        flowD = new go.g(new Data(dVar, null, false, 6, null), 2);
                    }
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    q.w(flowCollector20);
                    Object objCollect2 = flowD.collect(new ahd.b(flowCollector20, query, i5), this);
                    if (objCollect2 != aVar18) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar18) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector21 = this.f1552w;
                    List list10 = (List) ((Data) this.f1553x).getContent();
                    if (list10 == null) {
                        list10 = f0.f322471a;
                    }
                    vkm.d dVarA = nfj.k.a(((dfj.w) this.f1554y).f114137a, w4l.i.f294643c, zhm.u.c((String) this.z), list10, null, null, (String) this.A, 24);
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector21, dVarA, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector22 = this.f1552w;
                    List installedSimProfiles = (List) this.f1553x;
                    nfj.b0 b0Var = ((g0) this.f1554y).f113974a;
                    String str2 = (String) this.z;
                    k loadingStrategy2 = (k) this.A;
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(installedSimProfiles, "installedSimProfiles");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB2 = b0Var.d.b(new nfj.a0(str2, installedSimProfiles), loadingStrategy2);
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector22, dVarB2, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector23 = this.f1552w;
                    boolean zBooleanValue = ((Boolean) this.f1553x).booleanValue();
                    tga.k kVar2 = ((e0i.d) this.f1554y).f121721a;
                    dj0.d dVar5 = (dj0.d) this.z;
                    int i107 = e0i.c.f121720a[((wd6.h) this.A).ordinal()];
                    vkm.d dVarB3 = rd0.e.b(kVar2.c(i107 != 1 ? i107 != 2 ? i107 != 3 ? i107 != 4 ? new UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering.Exchange.TPSLExchange(dVar5, zBooleanValue) : new UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering.Exchange.RecurringBuyExchange(dVar5, zBooleanValue) : new UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering.Exchange.StopOrderExchange(dVar5, zBooleanValue) : new UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering.Exchange.LimitOrderExchange(dVar5, zBooleanValue) : new UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering.Exchange.MarketOrderExchange(dVar5, zBooleanValue)));
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector23, dVarB3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                pi3.l lVar = (pi3.l) this.z;
                ei3.m mVar2 = (ei3.m) this.f1554y;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector24 = this.f1552w;
                    Data data2 = (Data) this.f1553x;
                    h93.f0 f0Var = (h93.f0) data2.getContent();
                    if (f0Var != null) {
                        l0 l0Var = f0Var.G;
                        j0 j0Var = f0Var.H;
                        h93.h hVar2 = f0Var.k;
                        if (f0Var.f150112c) {
                            mVar2.getClass();
                            v6l.s sVar = mVar2.f126386b;
                            go.g gVar4 = new go.g(new Data(f0Var, null, false, 6, null), 2);
                            if (((jte.d) mVar2.f126390j).c(CardsCoreApi$Toggles.CardDesignApiFlagsMigration.f65556c)) {
                                String str3 = f0Var.u;
                                if (j0Var == null) {
                                    j0Var = j0.RETAIL;
                                }
                                j0 j0Var2 = j0Var;
                                if (l0Var == null) {
                                    l0Var = l0.DEBIT;
                                }
                                dVarB = rd0.e.b(sVar.h(false, (126 & 2) != 0 ? null : j0Var2, (126 & 4) != 0 ? null : l0Var, (126 & 8) != 0 ? null : str3, null, null, null));
                            } else {
                                dVarB = rd0.e.b(sVar.j(false, (2046 & 2) != 0 ? null : f0Var.u, (2046 & 4) != 0 ? false : f0Var.C(), (2046 & 8) != 0 ? false : f0Var.M(), false, false, null, null, (2046 & 256) != 0 ? null : f0Var.G, null, null));
                            }
                            gVar3 = nim.a.v(zi0.c.k(gVar4, dVarB), new ei3.a(lVar, objArr == true ? 1 : 0));
                        } else {
                            Address address = hVar2.f;
                            String postcode = address != null ? address.getPostcode() : null;
                            Address address2 = hVar2.f;
                            String country = address2 != null ? address2.getCountry() : null;
                            if (postcode == null || kotlin.text.d0.W(postcode) || country == null || country.length() == 0) {
                                od0.i.Companion.getClass();
                                gVar3 = new go.g(new Data(iVar2, data2.getError(), data2.getLoading()), 2);
                            } else {
                                pi3.l lVar2 = (pi3.l) this.A;
                                mVar2.getClass();
                                v6l.s sVar2 = mVar2.f126386b;
                                go.g a7 = new go.g(new Data(f0Var, null, false, 6, null), 2);
                                if (((jte.d) mVar2.f126390j).c(CardsCoreApi$Toggles.CardDesignApiFlagsMigration.f65556c)) {
                                    String str4 = f0Var.u;
                                    if (j0Var == null) {
                                        j0Var = j0.RETAIL;
                                    }
                                    j0 j0Var3 = j0Var;
                                    if (l0Var == null) {
                                        l0Var = l0.DEBIT;
                                    }
                                    b4 = rd0.e.b(sVar2.d(false, str4, (1984 & 4) != 0 ? null : j0Var3, (1984 & 8) != 0 ? null : l0Var, (1984 & 16) != 0 ? null : f0Var.o, (1984 & 32) != 0 ? null : (lVar2 == null || (pVar3 = lVar2.d) == null) ? null : pVar3.f236414a, null, null, e93.o.DEFAULT, null, false));
                                } else {
                                    b4 = rd0.e.b(sVar2.f(f0Var.u, false, (7872 & 4) != 0 ? false : f0Var.C(), (7872 & 8) != 0 ? false : f0Var.M(), (7872 & 16) != 0 ? null : f0Var.o, (7872 & 32) != 0 ? null : (lVar2 == null || (pVar = lVar2.d) == null) ? null : pVar.f236414a, null, null, (7872 & 256) != 0 ? null : f0Var.G, null, e93.o.DEFAULT, null, false));
                                }
                                u13.g gVar5 = mVar2.f126387c;
                                b93.j jVar2 = f0Var.f150114h;
                                String cardBrand = jVar2.f13640b;
                                String cardDesignCode = jVar2.f13639a.f13615a;
                                String str5 = f0Var.o;
                                String str6 = (lVar2 == null || (pVar2 = lVar2.d) == null) ? null : pVar2.f236414a;
                                String str7 = f0Var.u;
                                boolean z = f0Var.f150117m;
                                String str8 = f0Var.J;
                                Intrinsics.checkNotNullParameter(postcode, "postcode");
                                Intrinsics.checkNotNullParameter(country, "country");
                                Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
                                Intrinsics.checkNotNullParameter(cardDesignCode, "cardDesignCode");
                                vkm.d c2 = rd0.e.b(gVar5.d.f(new u13.c(postcode, country, cardBrand, cardDesignCode, str5, str6, str7, str8, z), true));
                                Intrinsics.checkNotNullParameter(a7, "a");
                                Intrinsics.checkNotNullParameter(b4, "b");
                                Intrinsics.checkNotNullParameter(c2, "c");
                                gVar3 = nim.a.v(u0.i(a7, b4, c2), new ei3.a(lVar, 2));
                            }
                        }
                        flowCollector8 = null;
                    } else {
                        flowCollector8 = null;
                        gVar3 = new go.g(new Data(null, data2.getError(), data2.getLoading()), 2);
                    }
                    this.f1552w = flowCollector8;
                    this.f1553x = flowCollector8;
                    this.v = 1;
                    if (q.u(flowCollector24, gVar3, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                return b(obj2);
            case 18:
                return c(obj2);
            case 19:
                fnc.d0 d0Var = (fnc.d0) this.z;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector25 = this.f1552w;
                    Flow flowH = xam.a.h(new f23.y(d0Var, (k) this.f1553x, continuation, 5), xam.a.h(new c0(d0Var, (akg.n) this.A, continuation, i5), (akg.n) this.f1554y));
                    this.f1552w = null;
                    this.f1553x = null;
                    this.v = 1;
                    if (q.u(flowCollector25, flowH, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                return n(obj2);
            case 21:
                return o(obj2);
            case 22:
                return p(obj2);
            case 23:
                return s(obj2);
            case 24:
                return t(obj2);
            case 25:
                return u(obj2);
            case 26:
                return v(obj2);
            case 27:
                return w(obj2);
            case 28:
                return x(obj2);
            default:
                FlowCollector flowCollector26 = this.f1552w;
                Data data3 = (Data) this.f1554y;
                Object obj10 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    List list11 = (List) data3.getContent();
                    if (list11 != null && !data3.getLoading()) {
                        ((le3.i) this.z).f194467c.set(new le3.g(list11, (Set) this.A));
                    }
                    this.f1552w = null;
                    this.f1554y = data3;
                    this.f1553x = list11;
                    this.v = 1;
                    if (flowCollector26.emit(data3, this) == obj10) {
                        return obj10;
                    }
                    list = list11;
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f1553x;
                    o.b(obj2);
                }
                return Boolean.valueOf(list == null || data3.getLoading());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f1554y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f1554y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, Object obj2, Object obj3, Object obj4, int i) {
        super(3, continuation);
        this.u = i;
        this.f1554y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Continuation continuation, Ref$BooleanRef ref$BooleanRef, Function2 function2) {
        super(3, continuation);
        this.u = 11;
        this.f1554y = ref$BooleanRef;
        this.z = (i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(le3.i iVar, Set set, Continuation continuation) {
        super(3, continuation);
        this.u = 29;
        this.z = iVar;
        this.A = set;
    }
}
