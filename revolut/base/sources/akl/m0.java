package akl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f6051w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ cjl.n f6052x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f6053y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, n0 n0Var, cjl.n nVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f6051w = n0Var;
        this.f6052x = nVar;
        this.f6053y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m0(this.v, this.f6051w, this.f6052x, this.f6053y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 == r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r0 == r8) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
