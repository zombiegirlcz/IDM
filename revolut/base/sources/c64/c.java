package c64;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function1 {
    public e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f21616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f21618y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, e eVar, Continuation continuation) {
        super(1, continuation);
        this.f21618y = lVar;
        this.z = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f21618y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (c84.t.N2(r3, (it3.d) r14, r13, 2) == r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c64.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
