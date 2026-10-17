package yf1;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function3 {
    public List A;
    public qf1.c B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object[] f313139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f313140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ tf1.b f313141y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Continuation continuation, y yVar, tf1.b bVar) {
        super(3, continuation);
        this.f313140x = yVar;
        this.f313141y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        w wVar = new w((Continuation) obj4, this.f313140x, this.f313141y);
        wVar.v = (FlowCollector) obj2;
        wVar.f313139w = (Object[]) obj3;
        return wVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0137, code lost:
    
        if (r14.emit(r5, r13) == r0) goto L49;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf1.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
