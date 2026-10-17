package wih;

import aii.x;
import android.graphics.Bitmap;
import android.view.View;
import cie.i1;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreen;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import dlk.k;
import e93.f0;
import ft3.h1;
import gim.i;
import h93.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import rd0.e;
import vkm.q;
import vkm.s0;
import vkm.t0;
import wgk.f;
import wl5.s;
import wp4.i0;
import wp5.c1;
import wqj.j;
import wtc.b1;
import wuh.n;
import x0f.w;
import x0f.y;
import x23.p;
import x8j.g0;
import xec.d0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f297898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f297899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f297900y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d dVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f297898w = dVar;
        this.f297899x = str;
        this.f297900y = (i) function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f297898w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L55
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f297899x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r7)
            goto L43
        L25:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f297900y
            wz1.k r7 = (wz1.k) r7
            uw1.c r7 = r7.d
            ty1.b r7 = (ty1.b) r7
            yoj.c r2 = yoj.c.APM_MULTIBANCO
            pfm.z r7 = r7.c(r2)
            r6.f297898w = r5
            r6.f297899x = r0
            r6.v = r4
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r1) goto L43
            goto L54
        L43:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r6.f297898w = r5
            r6.f297899x = r5
            r6.v = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wih.c.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        i61.b bVar;
        y yVar;
        y yVar2 = (y) this.f297900y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            i61.b bVar2 = yVar2.f301607q;
            this.f297898w = yVar2;
            this.f297899x = bVar2;
            this.v = 1;
            Object objI2 = y.I2(yVar2, this);
            if (objI2 == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = objI2;
            yVar = yVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (i61.b) this.f297899x;
            yVar = (y) this.f297898w;
            o.b(obj2);
        }
        return l.a1(yVar, e.b(i61.a.a(bVar, (xi0.b) obj2, yVar2.o.f91100b, 4)), null, null, new w(yVar2, null, 2), 3);
    }

    private final Object n(Object obj2) {
        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) this.f297898w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            a53.a aVar2 = cVar.f65177w;
            String str = (String) this.f297899x;
            String str2 = (String) this.f297900y;
            this.v = 1;
            obj2 = ((f53.b) aVar2).a(str, str2, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        p pVar = cVar.f65175s;
        Bitmap bitmap = ((f0) obj2).f123861b.f59847a;
        Float f = new Float(0.5f);
        pVar.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        CardPersonalisationController cardPersonalisationController = (CardPersonalisationController) pVar.f302493a;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        cardPersonalisationController.d3().f211227c.s0(bitmap, f);
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        x24.a aVar = (x24.a) this.f297898w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            CreditPluginsService creditPluginsService = aVar.f302505b;
            String str = ((h1) this.f297899x).f137835a;
            lu3.d dVar = (lu3.d) this.f297900y;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            k04.b bVar = new k04.b(dVar.f200020a);
            this.v = 1;
            obj2 = creditPluginsService.acceptConsents(str, bVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return aVar.f302504a.p((tt3.a) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f297898w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L48
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f297899x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r7)
            goto L3b
        L25:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f297900y
            x28.j r7 = (x28.j) r7
            n28.d r7 = r7.d
            r6.f297898w = r5
            r6.f297899x = r0
            r6.v = r4
            java.lang.Object r7 = r7.e(r6)
            if (r7 != r1) goto L3b
            goto L47
        L3b:
            r6.f297898w = r5
            r6.f297899x = r5
            r6.v = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L48
        L47:
            return r1
        L48:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wih.c.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (x36.y.K2(r0, r2, r7) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f297898w
            x36.y r0 = (x36.y) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r8)
            goto L88
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            yhm.o.b(r8)
            goto L3b
        L21:
            yhm.o.b(r8)
            opf.z r8 = r0.f302694x
            java.lang.Object r2 = r7.f297899x
            j1j.d r2 = (j1j.d) r2
            k1j.a r5 = r2.d
            com.revolut.core.model.account.AccountId r2 = r2.f170619c
            java.lang.Object r6 = r7.f297900y
            java.lang.String r6 = (java.lang.String) r6
            r7.v = r4
            java.lang.Object r8 = r8.d(r2, r7, r6, r5)
            if (r8 != r1) goto L3b
            goto L87
        L3b:
            com.revolut.feature.transfer.core.models.FundingSource r8 = (com.revolut.feature.transfer.core.models.FundingSource) r8
            r2 = 0
            java.lang.String r4 = "DeFiExchangeAmountScreenModel"
            if (r8 != 0) goto L50
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Funding source not found for the selected DeFi exchange balance"
            rd0.d.a(r0, r4, r1, r2, r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L50:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r5)
            boolean r5 = r8 instanceof com.revolut.feature.transfer.core.models.DeFiBalanceSource
            if (r5 != 0) goto L78
            boolean r5 = r8 instanceof com.revolut.feature.transfer.core.models.PocketSource
            if (r5 == 0) goto L5e
            goto L78
        L5e:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r3 = "Unsupported DeFi exchange funding source selected: "
            java.lang.String r8 = r3.concat(r8)
            rd0.d.a(r1, r4, r8, r2, r0)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L78:
            wwa.a r2 = new wwa.a
            r4 = 26
            r2.<init>(r0, r8, r4)
            r7.v = r3
            java.lang.Object r8 = x36.y.K2(r0, r2, r7)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wih.c.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) {
        FlowCollector flowCollector = (FlowCollector) this.f297898w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            Continuation continuation = null;
            wkm.l lVarQ = q.Q((vkm.y) this.f297899x, new wf0.f0(continuation, (x8h.y) this.f297900y, p.a.w(obj2), 7));
            i1 i1Var = new i1(flowCollector, 5);
            this.f297898w = null;
            this.v = 1;
            if (lVarQ.collect(i1Var, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r1.Y2(r19, r5) == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        if (nim.a.a(r1, r19) == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wih.c.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f297898w;
            t0 t0Var = (t0) this.f297899x;
            s0 s0Var = new s0(flowCollector, (xa9.d) this.f297900y, 20);
            this.f297898w = null;
            this.v = 1;
            if (t0Var.collect(s0Var, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8.a(r1, r0, r3, r7) != r2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f297898w
            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g r0 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) r0
            nd1.i r1 = r0.f60739q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L29
            if (r3 == r6) goto L25
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            yhm.o.b(r8)
            goto L63
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            yhm.o.b(r8)
            goto L46
        L25:
            yhm.o.b(r8)
            goto L35
        L29:
            yhm.o.b(r8)
            r7.v = r6
            java.lang.Object r8 = r1.c(r7)
            if (r8 != r2) goto L35
            goto L62
        L35:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L46
            r7.v = r5
            java.lang.Object r8 = r1.e(r7)
            if (r8 != r2) goto L46
            goto L62
        L46:
            nd1.n r8 = r0.o
            java.lang.Object r1 = r7.f297899x
            com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct r1 = (com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct) r1
            pd1.a r0 = r0.f60743w
            java.lang.String r3 = r1.d
            pd1.c r0 = (pd1.c) r0
            int r0 = r0.c(r3)
            java.lang.Object r3 = r7.f297900y
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r3 = (com.revolut.feature.acquiring.lite_pos.api.model.TaxRate) r3
            r7.v = r4
            java.lang.Object r8 = r8.a(r1, r0, r3, r7)
            if (r8 != r2) goto L63
        L62:
            return r2
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wih.c.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f297898w;
            d0 d0Var = new d0((ShippingContact) this.f297899x, (AddressFlowContract$OutputData) this.f297900y, bVar, null);
            this.v = 1;
            if (bVar.p2(this, d0Var) == aVar) {
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

    /* JADX WARN: Type inference failed for: r12v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v10, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v21, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((x) this.f297899x, (d) this.f297900y, continuation, 0);
                cVar.f297898w = obj2;
                return cVar;
            case 1:
                return new c((Function1) this.f297898w, (f) this.f297899x, (Function1) this.f297900y, continuation);
            case 2:
                return new c((wjk.f) this.f297898w, (k) this.f297899x, (wjk.c) this.f297900y, continuation, 2);
            case 3:
                c cVar2 = new c((AtmMapScreen) this.f297899x, (View) this.f297900y, continuation, 3);
                cVar2.f297898w = obj2;
                return cVar2;
            case 4:
                return new c((Flow) this.f297898w, (wkm.w) this.f297899x, (hlm.i) this.f297900y, continuation, 4);
            case 5:
                c cVar3 = new c((s) this.f297900y, continuation, 5);
                cVar3.f297898w = obj2;
                return cVar3;
            case 6:
                c cVar4 = new c((i0) this.f297899x, (String) this.f297900y, continuation, 6);
                cVar4.f297898w = obj2;
                return cVar4;
            case 7:
                return new c((i0) this.f297898w, (Function0) this.f297899x, (com.revolut.feature.credit_card.autopay.api.models_v3.c) this.f297900y, continuation, 7);
            case 8:
                return new c((c1) this.f297898w, (xi0.b) this.f297899x, (CryptoAddress) this.f297900y, continuation, 8);
            case 9:
                return new c((wq8.c) this.f297898w, (List) this.f297899x, (String) this.f297900y, continuation, 9);
            case 10:
                return new c((com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d) this.f297898w, (String) this.f297899x, (Function1) this.f297900y, continuation);
            case 11:
                c cVar5 = new c((j) this.f297900y, continuation, 11);
                cVar5.f297898w = obj2;
                return cVar5;
            case 12:
                c cVar6 = new c((b1) this.f297899x, (qtc.k) this.f297900y, continuation, 12);
                cVar6.f297898w = obj2;
                return cVar6;
            case 13:
                c cVar7 = new c((n) this.f297899x, (com.revolut.feature.workflow.engine.sdk_flow.f) this.f297900y, continuation, 13);
                cVar7.f297898w = obj2;
                return cVar7;
            case 14:
                return new c((wx2.e) this.f297898w, (l0) this.f297899x, (Function1) this.f297900y, continuation, 14);
            case 15:
                c cVar8 = new c((com.revolut.feature.statements.impl.ui.account.a) this.f297899x, (StatementsFormat) this.f297900y, continuation, 15);
                cVar8.f297898w = obj2;
                return cVar8;
            case 16:
                return new c((String) this.f297898w, (wz1.f) this.f297899x, (String) this.f297900y, continuation, 16);
            case 17:
                c cVar9 = new c((wz1.k) this.f297900y, continuation, 17);
                cVar9.f297898w = obj2;
                return cVar9;
            case 18:
                return new c((y) this.f297900y, continuation, 18);
            case 19:
                return new c((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) this.f297898w, (String) this.f297899x, (String) this.f297900y, continuation, 19);
            case 20:
                return new c((x24.a) this.f297898w, (h1) this.f297899x, (lu3.d) this.f297900y, continuation, 20);
            case 21:
                c cVar10 = new c((x28.j) this.f297900y, continuation, 21);
                cVar10.f297898w = obj2;
                return cVar10;
            case 22:
                return new c((x36.y) this.f297898w, (j1j.d) this.f297899x, (String) this.f297900y, continuation, 22);
            case 23:
                return new c((com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a) this.f297898w, (String) this.f297899x, (Function1) this.f297900y, continuation);
            case 24:
                c cVar11 = new c((vkm.y) this.f297899x, (x8h.y) this.f297900y, continuation, 24);
                cVar11.f297898w = obj2;
                return cVar11;
            case 25:
                return new c((StakingProduct) this.f297898w, (StakingPocket) this.f297899x, (g0) this.f297900y, continuation, 25);
            case 26:
                c cVar12 = new c((t0) this.f297899x, continuation, (xa9.d) this.f297900y);
                cVar12.f297898w = obj2;
                return cVar12;
            case 27:
                return new c((g) this.f297898w, (CatalogueProduct) this.f297899x, (TaxRate) this.f297900y, continuation, 27);
            case 28:
                return new c((com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f297898w, (ShippingContact) this.f297899x, (AddressFlowContract$OutputData) this.f297900y, continuation, 28);
            default:
                return new c((xge.g) this.f297899x, (ProductAccountDescriptor$Value) this.f297900y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x047d A[LOOP:2: B:236:0x0477->B:238:0x047d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09cc A[Catch: all -> 0x09b0, TRY_ENTER, TryCatch #0 {all -> 0x09b0, blocks: (B:439:0x09ac, B:450:0x09cc, B:454:0x09db, B:456:0x09f3, B:458:0x0a02, B:445:0x09b9), top: B:531:0x09a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:597:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:605:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:608:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v15, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v24, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v16, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View$OnLayoutChangeListener, wk2.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:459:0x0a0b -> B:448:0x09c2). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wih.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 23;
        this.f297898w = aVar;
        this.f297899x = str;
        this.f297900y = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297898w = obj2;
        this.f297899x = obj3;
        this.f297900y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297899x = obj2;
        this.f297900y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297900y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, f fVar, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f297898w = (i) function1;
        this.f297899x = fVar;
        this.f297900y = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t0 t0Var, Continuation continuation, xa9.d dVar) {
        super(2, continuation);
        this.u = 26;
        this.f297899x = t0Var;
        this.f297900y = dVar;
    }
}
