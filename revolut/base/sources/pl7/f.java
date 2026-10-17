package pl7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jf0.c f237282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, jf0.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f237282w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f237282w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r9 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r9 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r9 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (r9 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (r9 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        if (r9 == r0) goto L54;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl7.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
