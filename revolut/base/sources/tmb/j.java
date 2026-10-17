package tmb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f272179w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f272179w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f272179w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r0 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        if (r0 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        if (r0 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
    
        if (r0 == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
    
        return r6;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tmb.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
