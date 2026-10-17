package q3j;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f241983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f241984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n61.c f241985y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, h hVar, n61.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f241983w = list;
        this.f241984x = hVar;
        this.f241985y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f241983w, this.f241984x, this.f241985y, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L58;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3j.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
