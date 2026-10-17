package d6j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f111567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String str, n0 n0Var, Continuation continuation) {
        super(1, continuation);
        this.v = str;
        this.f111567w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l0(this.v, this.f111567w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r3.b3(r0, r2, r13) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r3.g3(r0, r1, r14, r13) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r0.b3(r7, r2, r3, (xi0.b) r14) != r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d6j.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
