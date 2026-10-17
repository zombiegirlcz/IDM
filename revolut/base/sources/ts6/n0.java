package ts6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends gim.i implements Function2 {
    public m0 u;
    public ds6.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jf0.c f274014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s0 f274015y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(jf0.c cVar, s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.f274014x = cVar;
        this.f274015y = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.f274014x, this.f274015y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r15 == r0) goto L57;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
