package zz9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f326612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f326613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d f326614y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f326614y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i0 i0Var = new i0(0, this.f326614y, continuation);
                i0Var.f326612w = flowCollector;
                i0Var.f326613x = obj3;
                return i0Var.invokeSuspend(Unit.f186387a);
            default:
                i0 i0Var2 = new i0(1, this.f326614y, continuation);
                i0Var2.f326612w = flowCollector;
                i0Var2.f326613x = obj3;
                return i0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zz9.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
