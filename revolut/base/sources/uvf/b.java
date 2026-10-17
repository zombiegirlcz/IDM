package uvf;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.product.onboarding.domain.models.DeclarationValue;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import dj0.d;
import ft3.h1;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o02.e;
import s15.j;
import tk0.g;
import ukm.q;
import v17.r;
import v20.f0;
import v6l.b1;
import vc2.u;
import vdl.p0;
import vdl.y0;
import vfh.l;
import vge.g0;
import vge.t0;
import vge.t3;
import vha.q0;
import wd6.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f283366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f283367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f283368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283366w = obj2;
        this.f283367x = obj3;
        this.f283368y = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r2 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        if (r2 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvf.b.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        q0 q0Var;
        Function1 function1 = (Function1) this.f283367x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            q0 q0Var2 = (q0) this.f283368y;
            this.f283367x = null;
            this.f283366w = q0Var2;
            this.v = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == aVar) {
                return aVar;
            }
            q0Var = q0Var2;
            obj2 = objInvoke;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (q0) this.f283366w;
            o.b(obj2);
        }
        q0Var.A2(u0.c((FeatureConfig) obj2));
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.product.onboarding.flow.a aVar2 = (com.revolut.feature.product.onboarding.flow.a) this.f283366w;
            int i2 = 25;
            j jVar = new j(i2, aVar2, (DeclarationValue) this.f283368y, (String) this.f283367x, (Continuation) null);
            this.v = 1;
            if (aVar2.p2(this, jVar) == aVar) {
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

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b((fti.b) this.f283368y, continuation, 0);
                bVar.f283367x = obj2;
                return bVar;
            case 1:
                return new b((uy1.j) this.f283366w, (Alias) this.f283367x, (String) this.f283368y, continuation, 1);
            case 2:
                return new b((uy1.j) this.f283366w, (zz1.i) this.f283367x, (wj0.b) this.f283368y, continuation, 2);
            case 3:
                return new b((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f283366w, (TopupWithNewCardFlowDescriptor$InputData) this.f283367x, (TopupFlowContract$Step) this.f283368y, continuation, 3);
            case 4:
                return new b((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f283366w, (d) this.f283367x, (String) this.f283368y, continuation, 4);
            case 5:
                return new b((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f283366w, (h) this.f283367x, (Float) this.f283368y, continuation, 5);
            case 6:
                return new b((iua.b) this.f283367x, (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f283368y, continuation, 6);
            case 7:
                return new b((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f283366w, (Double) this.f283367x, (Double) this.f283368y, continuation, 7);
            case 8:
                b bVar2 = new b(this.f283366w, this.f283368y, false, continuation, 8);
                bVar2.f283367x = obj2;
                return bVar2;
            case 9:
                b bVar3 = new b((r) this.f283368y, continuation, 9);
                bVar3.f283367x = obj2;
                return bVar3;
            case 10:
                return new b((f0) this.f283368y, continuation, 10);
            case 11:
                b bVar4 = new b(this.f283366w, this.f283368y, false, continuation, 11);
                bVar4.f283367x = obj2;
                return bVar4;
            case 12:
                return new b((v24.a) this.f283367x, (h1) this.f283368y, continuation, 12);
            case 13:
                return new b((b1) this.f283366w, (List) this.f283367x, (b93.d) this.f283368y, continuation, 13);
            case 14:
                return new b((v73.o) this.f283366w, (String) this.f283367x, (j60.a) this.f283368y, continuation, 14);
            case 15:
                b bVar5 = new b(this.f283366w, this.f283368y, false, continuation, 15);
                bVar5.f283367x = obj2;
                return bVar5;
            case 16:
                return new b((u) this.f283366w, (e) this.f283367x, (e) this.f283368y, continuation, 16);
            case 17:
                return new b((p0) this.f283366w, (String) this.f283367x, (d) this.f283368y, continuation, 17);
            case 18:
                return new b((y0) this.f283366w, (String) this.f283367x, (TradingProductCode) this.f283368y, continuation, 18);
            case 19:
                return new b((l) this.f283366w, (hdh.h) this.f283367x, (kul.b) this.f283368y, continuation, 19);
            case 20:
                b bVar6 = new b(this.f283366w, this.f283368y, false, continuation, 20);
                bVar6.f283367x = obj2;
                return bVar6;
            case 21:
                b bVar7 = new b((t0) this.f283368y, continuation, 21);
                bVar7.f283367x = obj2;
                return bVar7;
            case 22:
                b bVar8 = new b(this.f283366w, this.f283368y, false, continuation, 22);
                bVar8.f283367x = obj2;
                return bVar8;
            case 23:
                return new b((f9.d) this.f283366w, (g0) this.f283368y, this.f283367x, false, continuation, 23);
            case 24:
                return new b((q) this.f283367x, (t3) this.f283368y, continuation, 24);
            case 25:
                return new b((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f283366w, (String) this.f283367x, (zm3.l) this.f283368y, continuation, 25);
            case 26:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a) this.f283366w, (dz3.a) this.f283367x, (x35.e) this.f283368y, continuation, 26);
            case 27:
                b bVar9 = new b((q0) this.f283368y, continuation, 27);
                bVar9.f283367x = obj2;
                return bVar9;
            case 28:
                return new b((com.revolut.feature.product.onboarding.flow.a) this.f283366w, (String) this.f283367x, (DeclarationValue) this.f283368y, continuation, 28);
            default:
                return new b((mk0.a) this.f283366w, (g) this.f283368y, this.f283367x, false, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0667 A[LOOP:2: B:329:0x0661->B:331:0x0667, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00e2 -> B:47:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e5 -> B:47:0x00bd). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvf.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283366w = obj2;
        this.f283368y = obj3;
        this.f283367x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283367x = obj2;
        this.f283368y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283366w = obj2;
        this.f283368y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283368y = obj2;
    }
}
