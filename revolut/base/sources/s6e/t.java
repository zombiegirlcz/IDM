package s6e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f260309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ aim.o f260310x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, aim.o oVar, Continuation continuation) {
        super(2, continuation);
        this.f260309w = zVar;
        this.f260310x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.f260309w, this.f260310x, continuation);
        tVar.v = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0198, code lost:
    
        if (r3.collect(r4, r17) == r2) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
