package tf1;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class e0 extends gim.i implements Function3 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f270155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f270156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f270157y;
    public final /* synthetic */ su9.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Continuation continuation, ArrayList arrayList, su9.c cVar) {
        super(3, continuation);
        this.f270157y = arrayList;
        this.z = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(continuation, this.z, this.f270157y);
                e0Var.f270155w = flowCollector;
                e0Var.f270156x = obj3;
                return e0Var.invokeSuspend(Unit.f186387a);
            default:
                e0 e0Var2 = new e0(continuation, this.f270157y, this.z);
                e0Var2.f270155w = flowCollector;
                e0Var2.f270156x = obj3;
                return e0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Continuation continuation, su9.c cVar, ArrayList arrayList) {
        super(3, continuation);
        this.z = cVar;
        this.f270157y = arrayList;
    }
}
