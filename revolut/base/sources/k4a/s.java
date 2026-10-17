package k4a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ qv0.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f180883w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qv0.p pVar, u uVar, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
        this.f180883w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f180883w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
    
        if (((t4a.c) r8).Z2(r7) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        if (r8 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
    
        if (k4a.u.J2(r6, (jq9.t) r1, r7) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4a.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
