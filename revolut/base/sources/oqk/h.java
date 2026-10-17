package oqk;

import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import pdg.i0;
import rh8.n0;
import skm.p0;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f227946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f227947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f227948y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f227947x = obj2;
        this.f227946w = str;
        this.f227948y = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.e(r6, r5) == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f227948y
            rc8.k r0 = (rc8.k) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r5.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            java.lang.Object r1 = r5.f227946w
            java.lang.String r1 = (java.lang.String) r1
            yhm.o.b(r6)
            goto L57
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            yhm.o.b(r6)
            goto L60
        L24:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f227947x
            kn8.d r6 = (kn8.d) r6
            boolean r2 = r6 instanceof kn8.b
            if (r2 == 0) goto L3e
            jul.o r0 = r0.f253231m
            kn8.b r6 = (kn8.b) r6
            java.lang.String r6 = r6.f186030a
            r5.v = r4
            java.lang.Object r6 = r0.e(r6, r5)
            if (r6 != r1) goto L60
            goto L54
        L3e:
            boolean r2 = r6 instanceof kn8.c
            if (r2 == 0) goto L63
            kn8.c r6 = (kn8.c) r6
            java.lang.String r6 = r6.f186031a
            ufm.i r2 = rc8.k.b3(r0, r6)
            r5.f227946w = r6
            r5.v = r3
            java.lang.Object r2 = nim.a.b(r2, r5)
            if (r2 != r1) goto L55
        L54:
            return r1
        L55:
            r1 = r6
            r6 = r2
        L57:
            rc8.f r6 = (rc8.f) r6
            rc8.g r0 = r0.f253232n
            boolean r6 = r6.f253227a
            r0.Z2(r1, r6)
        L60:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L63:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.h.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        wo1.b bVar = ((rf9.l) this.f227947x).f253730n;
        xo1.i iVar = new xo1.i((xo1.g) this.f227948y, (ArrayList) this.f227946w);
        this.v = 1;
        rm6.c cVar = new rm6.c(((vp1.c) bVar).f291042a, iVar, null, 12);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, cVar, this);
        return objJ == aVar ? aVar : objJ;
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        prl.e eVar = ((rga.i) this.f227947x).f254053l;
        Object obj3 = this.f227948y;
        this.v = 1;
        Object objO = eVar.o(obj3, this);
        return objO == aVar ? aVar : objO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r13 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.h.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2) {
        rmk.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            rmk.i iVar2 = (rmk.i) this.f227948y;
            ufm.i iVarC = ((rre.d) iVar2.f255358r).c((TermsScope) this.f227946w, null);
            this.f227947x = iVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (rmk.i) this.f227947x;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return iVar.C1(u0.b((NaviCommand) obj2));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((k) this.f227947x, (a3) this.f227948y, (String) this.f227946w, continuation, 0);
            case 1:
                return new h(1, (p25.a) this.f227947x, (lg0.a) this.f227948y, (String) this.f227946w, continuation);
            case 2:
                return new h(2, (p2a.b) this.f227947x, (em2.g) this.f227948y, (String) this.f227946w, continuation);
            case 3:
                return new h(3, (p2b.b) this.f227947x, (String) this.f227948y, (String) this.f227946w, continuation);
            case 4:
                return new h(4, (p4c.x) this.f227947x, (Function1) this.f227948y, (String) this.f227946w, continuation);
            case 5:
                return new h((i0) this.f227948y, (HotelsProperty) this.f227946w, continuation, 5);
            case 6:
                return new h((pf9.e) this.f227948y, (qua.p) this.f227946w, continuation, 6);
            case 7:
                return new h((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) this.f227948y, (hha.d) this.f227946w, continuation, 7);
            case 8:
                return new h((com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b) this.f227947x, (Ref$ObjectRef) this.f227948y, (String) this.f227946w, continuation, 8);
            case 9:
                return new h(this.f227947x, this.f227948y, false, continuation, 9);
            case 10:
                return new h((com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f227948y, (CoroutineScope) this.f227946w, continuation, 10);
            case 11:
                return new h((String) this.f227946w, (qg7.u) this.f227947x, (Function1) this.f227948y, continuation);
            case 12:
                return new h(12, (qh4.b0) this.f227947x, (qce.a) this.f227948y, (String) this.f227946w, continuation);
            case 13:
                return new h(13, (qh4.b0) this.f227947x, (qg7.v) this.f227948y, (String) this.f227946w, continuation);
            case 14:
                return new h((com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b) this.f227947x, (iy9.d) this.f227948y, (TransferTrustData) this.f227946w, continuation, 14);
            case 15:
                return new h((com.revolut.feature.staking.impl.stake.v2.b) this.f227947x, (io3.d) this.f227948y, (StakingProduct) this.f227946w, continuation, 15);
            case 16:
                return new h((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f227947x, (xi0.b) this.f227948y, (CheckoutScreenContract$CheckoutContent$Order) this.f227946w, continuation, 16);
            case 17:
                return new h(17, (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f227947x, (xi0.b) this.f227948y, (String) this.f227946w, continuation);
            case 18:
                return new h(18, (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f227947x, (jxe.f) this.f227948y, (String) this.f227946w, continuation);
            case 19:
                return new h((ty0.a) this.f227947x, (r15.n) this.f227948y, (String) this.f227946w, continuation, 19);
            case 20:
                return new h((s1a.d) this.f227947x, (r1a.d) this.f227948y, (SplitBillLinkAction) this.f227946w, continuation, 20);
            case 21:
                return new h((com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a) this.f227948y, (t27.m) this.f227946w, continuation, 21);
            case 22:
                return new h((rbh.m) this.f227946w, continuation);
            case 23:
                return new h((rc8.e) this.f227948y, (String) this.f227946w, continuation, 23);
            case 24:
                return new h(this.f227947x, this.f227948y, false, continuation, 24);
            case 25:
                return new h((rf9.l) this.f227947x, (xo1.g) this.f227948y, (ArrayList) this.f227946w, continuation, 25);
            case 26:
                return new h(26, (rga.i) this.f227947x, this.f227948y, (String) this.f227946w, continuation);
            case 27:
                return new h(27, (n0) this.f227947x, (kf8.i) this.f227948y, (String) this.f227946w, continuation);
            case 28:
                return new h((rmk.i) this.f227948y, (TermsScope) this.f227946w, continuation, 28);
            default:
                return new h((rwb.h) this.f227947x, (VoucherProduct) this.f227948y, (String) this.f227946w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:520:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:551:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARN: Type inference failed for: r0v80, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f227947x = obj2;
        this.f227948y = obj3;
        this.f227946w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f227948y = obj2;
        this.f227946w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f227947x = obj2;
        this.f227948y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(String str, qg7.u uVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 11;
        this.f227946w = str;
        this.f227947x = uVar;
        this.f227948y = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rbh.m mVar, Continuation continuation) {
        super(1, continuation);
        this.u = 22;
        this.f227946w = mVar;
    }
}
