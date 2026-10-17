package dlf;

import java.io.Serializable;
import jv.r;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f115740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f115741x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Serializable f115742y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(4, continuation);
        this.u = i;
        this.z = obj2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.u) {
            case 0:
                g gVar = new g((twg.c) this.z, (Continuation) obj5, 0);
                gVar.f115740w = (t3) obj2;
                gVar.f115741x = (a3) obj3;
                gVar.f115742y = (j1) obj4;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g((r) this.z, (Continuation) obj5, 1);
                gVar2.f115740w = (uv.e) obj2;
                gVar2.f115741x = (xv.l) obj3;
                gVar2.f115742y = (wv.a) obj4;
                return gVar2.invokeSuspend(Unit.f186387a);
            default:
                g gVar3 = new g((xkf.e) this.z, (Continuation) obj5, 2);
                gVar3.f115741x = (a3) obj2;
                gVar3.f115740w = (t3) obj3;
                gVar3.f115742y = (do3.n) obj4;
                return gVar3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x0697, code lost:
    
        if (r1 == r8) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0728, code lost:
    
        if (jv.r.b(r0, r1, r46) == r8) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x07dd, code lost:
    
        if (r1 != r8) goto L442;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x05b6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dlf.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
