package ldh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nel.v0;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ v0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f194111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f194112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ bfl.g f194113y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v0 v0Var, boolean z, i iVar, bfl.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = v0Var;
        this.f194111w = z;
        this.f194112x = iVar;
        this.f194113y = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f194111w, this.f194112x, this.f194113y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f6, code lost:
    
        if (r14 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010c, code lost:
    
        if (r14 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        if (r14 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0141, code lost:
    
        if (r14 == r0) goto L85;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ldh.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
