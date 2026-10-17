package cuc;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pjl.z0;
import xge.g0;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f108944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f108945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f108946y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i, com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, int i2, Set set, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.v = i;
        this.f108944w = aVar;
        this.f108945x = i2;
        this.z = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0((e0) this.f108946y, (String) this.f108944w, (LocationDomain) this.z, this.f108945x, continuation, 0);
            case 1:
                return new c0((dp4.c0) this.f108946y, (String) this.f108944w, (String) this.z, this.f108945x, continuation, 1);
            case 2:
                return new c0((dp4.c0) this.f108946y, (String) this.f108944w, this.f108945x, (dj0.d) this.z, continuation);
            case 3:
                return new c0((gq.i) this.z, continuation, 3);
            case 4:
                return new c0((com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) this.z, continuation, 4);
            case 5:
                return new c0((z0) this.z, continuation, 5);
            case 6:
                c0 c0Var = new c0(this.v, (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.f108944w, this.f108945x, (Set) this.z, continuation);
                c0Var.f108946y = obj2;
                return c0Var;
            case 7:
                c0 c0Var2 = new c0((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f108944w, (dj0.d) this.z, this.f108945x, continuation);
                c0Var2.f108946y = obj2;
                return c0Var2;
            case 8:
                return new c0((Flow[]) this.f108946y, this.f108945x, (AtomicInteger) this.f108944w, (ukm.q) this.z, continuation);
            default:
                return new c0((g0) this.f108946y, (String) this.f108944w, (List) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cuc.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, dj0.d dVar, int i, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f108944w = iVar;
        this.z = dVar;
        this.f108945x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(dp4.c0 c0Var, String str, int i, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f108946y = c0Var;
        this.f108944w = str;
        this.f108945x = i;
        this.z = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, String str, Object obj3, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f108946y = obj2;
        this.f108944w = str;
        this.z = obj3;
        this.f108945x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.f108946y = g0Var;
        this.f108944w = str;
        this.z = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Flow[] flowArr, int i, AtomicInteger atomicInteger, ukm.q qVar, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.f108946y = flowArr;
        this.f108945x = i;
        this.f108944w = atomicInteger;
        this.z = qVar;
    }
}
