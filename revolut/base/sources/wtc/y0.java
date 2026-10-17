package wtc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 extends gim.i implements Function2 {
    public final /* synthetic */ a1 A;
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f299921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f299922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f299923y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Continuation continuation) {
        super(2, continuation);
        this.A = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y0 y0Var = new y0(this.A, continuation);
        y0Var.z = obj2;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        if (r2.emit(r6, r12) != r3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
