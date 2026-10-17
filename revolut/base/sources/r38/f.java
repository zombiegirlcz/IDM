package r38;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public n38.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f251208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0 f251209x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, d0 d0Var, Continuation continuation) {
        super(2, continuation);
        this.f251208w = lVar;
        this.f251209x = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.f251208w, this.f251209x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (kotlin.Unit.f186387a == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (kotlin.Unit.f186387a != r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:17:0x0037, B:28:0x0078, B:30:0x007e, B:33:0x009b, B:18:0x003b, B:24:0x0064, B:21:0x0044), top: B:41:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:17:0x0037, B:28:0x0078, B:30:0x007e, B:33:0x009b, B:18:0x003b, B:24:0x0064, B:21:0x0044), top: B:41:0x0010 }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r38.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
