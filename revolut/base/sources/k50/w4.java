package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class w4 extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ x4 B;
    public final /* synthetic */ q4 C;
    public long u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f181274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f181275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f181276y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(x4 x4Var, q4 q4Var, Continuation continuation) {
        super(2, continuation);
        this.B = x4Var;
        this.C = q4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w4 w4Var = new w4(this.B, this.C, continuation);
        w4Var.A = obj2;
        return w4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w4) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        if (r1.emit(null, r23) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.w4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
