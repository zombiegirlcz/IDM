package v6l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class v0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h93.f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b1 f286509w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(h93.f0 f0Var, b1 b1Var, Continuation continuation) {
        super(2, continuation);
        this.v = f0Var;
        this.f286509w = b1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v0(this.v, this.f286509w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x026b, code lost:
    
        if (r2 == r1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d4, code lost:
    
        if (r2 == r1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d6, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e1  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
