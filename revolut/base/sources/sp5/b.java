package sp5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qp5.b f264878w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, qp5.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f264878w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f264878w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        if (nim.a.a(r1, r24) == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0115, code lost:
    
        if (nim.a.a(r1, r24) == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bc, code lost:
    
        if (nim.a.a(r1, r24) == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0233, code lost:
    
        if (nim.a.a(r1, r24) == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0253, code lost:
    
        if (nim.a.a(r1, r24) == r3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp5.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
