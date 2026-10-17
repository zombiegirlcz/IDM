package rnd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f255637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f255638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f255639y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Continuation continuation, y yVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f255639y = yVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(continuation, this.f255639y, 0);
                uVar.f255637w = flowCollector;
                uVar.f255638x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            default:
                u uVar2 = new u(continuation, this.f255639y, 1);
                uVar2.f255637w = flowCollector;
                uVar2.f255638x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rnd.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
