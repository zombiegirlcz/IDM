package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class r2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v2 f114087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f114088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114089y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(Continuation continuation, v2 v2Var, String str, int i) {
        super(2, continuation);
        this.u = i;
        this.f114087w = v2Var;
        this.f114088x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r2(continuation, this.f114087w, this.f114088x, 0);
            case 1:
                return new r2(continuation, this.f114087w, this.f114088x, 1);
            default:
                return new r2(continuation, this.f114087w, this.f114088x, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r0 == r12) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
