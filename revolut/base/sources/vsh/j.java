package vsh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public String u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f291800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f291801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f291802y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f291802y = hVar;
        this.z = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f291802y, this.z, continuation);
        jVar.f291801x = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r4.emit(null, r21) == r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0117, code lost:
    
        if (vkm.q.u(r4, r2, r21) == r5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vsh.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
