package z0c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f318207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f318208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kad.a f318209y;
    public final /* synthetic */ ys.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, kad.a aVar, ys.i iVar2, Continuation continuation) {
        super(2, continuation);
        this.f318208x = iVar;
        this.f318209y = aVar;
        this.z = iVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f318208x, this.f318209y, this.z, continuation);
        hVar.f318207w = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r1 != r2) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0c.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
