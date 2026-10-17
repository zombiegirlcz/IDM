package eh9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f125798w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f125798w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f125798w, continuation, 0);
            case 1:
                return new w(this.f125798w, continuation, 1);
            case 2:
                return new w(this.f125798w, continuation, 2);
            case 3:
                return new w(this.f125798w, continuation, 3);
            case 4:
                return new w(this.f125798w, continuation, 4);
            default:
                return new w(this.f125798w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r9 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
    
        if (r9 == r0) goto L65;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eh9.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
