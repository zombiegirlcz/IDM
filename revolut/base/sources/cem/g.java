package cem;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends i implements Function3 {
    public final /* synthetic */ bem.b A;
    public final /* synthetic */ Function2 B;
    public Object u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f23513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f23515y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bem.b bVar, Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.A = bVar;
        this.B = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = new g(this.A, this.B, (Continuation) obj4);
        gVar.f23515y = (a) obj2;
        gVar.z = (hem.c) obj3;
        return gVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r0.f23507a.d(r1, r13) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0128, code lost:
    
        if (r0.f23507a.d(r6, r13) != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cem.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
