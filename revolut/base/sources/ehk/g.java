package ehk;

import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lhk.z;
import vkm.q;
import vkm.y;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends xfk.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ylk.a f126212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f126213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f126214n;
    public final z1 o;

    public g(ylk.a statusDialogConfigProvider, t pricingPlanInteractor, j planDurableTermsPendingStateResolver) {
        Intrinsics.checkNotNullParameter(statusDialogConfigProvider, "statusDialogConfigProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planDurableTermsPendingStateResolver, "planDurableTermsPendingStateResolver");
        this.f126212l = statusDialogConfigProvider;
        this.f126213m = pricingPlanInteractor;
        this.f126214n = planDurableTermsPendingStateResolver;
        this.o = q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r6.emit(r10, r0) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r6.c3(r10, r9, r7, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        if (r7.emit(r10, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        if (r7.emit(r10, r0) != r1) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ehk.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1, lhk.z] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ehk.g r6, kotlinx.coroutines.flow.FlowCollector r7, zfk.n.a r8, lhk.z r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ehk.g.b3(ehk.g, kotlinx.coroutines.flow.FlowCollector, zfk.n$a, lhk.z, gim.c):java.lang.Object");
    }

    @Override // xfk.b
    public final Object Z2(z zVar, z zVar2) throws Throwable {
        z1 z1Var = this.o;
        z1Var.i();
        Continuation continuation = null;
        return q.x(q.Q(new y(new a35.j(2, 17, continuation), z1Var), new eh9.j(continuation, this, zVar, 1)), zVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(xfk.a r27, zfk.n r28, java.lang.String r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ehk.g.c3(xfk.a, zfk.n, java.lang.String, gim.c):java.lang.Object");
    }
}
