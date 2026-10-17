package x8j;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends gim.i implements Function2 {
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f303482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f303483x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f303482w = g0Var;
        this.f303483x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.f303482w, this.f303483x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (x8j.g0.l3(r15, r13, r24) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0196, code lost:
    
        if (nim.a.a(r3, r24) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a2, code lost:
    
        if (x8j.g0.l3(r15, r13, r24) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ab, code lost:
    
        if (x8j.g0.l3(r15, r13, r24) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[PHI: r2 r4 r5
      0x008c: PHI (r2v8 ??) = (r2v17 ??), (r2v16 ??) binds: [B:16:0x0088, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r4v9 java.util.List) = (r4v7 java.util.List), (r4v13 java.util.List) binds: [B:16:0x0088, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r5v5 java.lang.Object) = (r5v4 java.lang.Object), (r5v24 java.lang.Object) binds: [B:16:0x0088, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[LOOP:0: B:19:0x00a1->B:21:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.Integer, java.util.List] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8j.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
