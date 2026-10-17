package s38;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ sfe.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f259452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(sfe.n nVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f259452w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f259452w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r2.Z2(r4, r39) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (s38.h.c3(r1, (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r10, r39) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r2 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
    
        if (r2 == r3) goto L53;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s38.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
