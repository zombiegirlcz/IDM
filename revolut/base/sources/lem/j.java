package lem;

import io.ktor.utils.io.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import skm.q;

/* JADX INFO: loaded from: classes23.dex */
public final class j extends gim.i implements Function2 {
    public long A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ t E;
    public final /* synthetic */ klm.b F;
    public final /* synthetic */ Long G;
    public Object u;
    public klm.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f194609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q f194610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f194611y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, klm.b bVar, Long l2, Continuation continuation) {
        super(2, continuation);
        this.E = tVar;
        this.F = bVar;
        this.G = l2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.E, this.F, this.G, continuation);
        jVar.D = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0321, code lost:
    
        if (r8.send(r2, r20) != r7) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0361, code lost:
    
        if (r0.send(r4, r20) == r7) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x0158, B:42:0x0173], limit reached: 123 */
    /* JADX WARN: Path cross not found for [B:42:0x0173, B:39:0x0158], limit reached: 123 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c7 A[PHI: r0 r1 r3
      0x02c7: PHI (r0v26 kotlinx.coroutines.channels.ProducerScope) = (r0v25 kotlinx.coroutines.channels.ProducerScope), (r0v1 kotlinx.coroutines.channels.ProducerScope) binds: [B:98:0x02c3, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r1v32 long) = (r1v30 long), (r1v34 long) binds: [B:98:0x02c3, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r3v34 io.ktor.utils.io.p0) = (r3v31 io.ktor.utils.io.p0), (r3v38 io.ktor.utils.io.p0) binds: [B:98:0x02c3, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173 A[PHI: r0 r1 r2 r3 r5 r8
      0x0173: PHI (r0v20 kotlinx.coroutines.channels.ProducerScope) = 
      (r0v1 kotlinx.coroutines.channels.ProducerScope)
      (r0v1 kotlinx.coroutines.channels.ProducerScope)
      (r0v1 kotlinx.coroutines.channels.ProducerScope)
      (r0v17 kotlinx.coroutines.channels.ProducerScope)
      (r0v22 kotlinx.coroutines.channels.ProducerScope)
     binds: [B:38:0x0156, B:40:0x016f, B:27:0x00e6, B:56:0x01c9, B:75:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r1v25 klm.b) = (r1v4 klm.b), (r1v4 klm.b), (r1v6 klm.b), (r1v21 klm.b), (r1v26 klm.b) binds: [B:38:0x0156, B:40:0x016f, B:27:0x00e6, B:56:0x01c9, B:75:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r2v10 klm.b) = (r2v0 klm.b), (r2v0 klm.b), (r2v0 klm.b), (r2v7 klm.b), (r2v12 klm.b) binds: [B:38:0x0156, B:40:0x016f, B:27:0x00e6, B:56:0x01c9, B:75:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r3v26 long) = (r3v2 long), (r3v2 long), (r3v4 long), (r3v23 long), (r3v28 long) binds: [B:38:0x0156, B:40:0x016f, B:27:0x00e6, B:56:0x01c9, B:75:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r5v35 io.ktor.utils.io.p0) = 
      (r5v5 io.ktor.utils.io.p0)
      (r5v5 io.ktor.utils.io.p0)
      (r5v9 io.ktor.utils.io.p0)
      (r5v31 io.ktor.utils.io.p0)
      (r5v36 io.ktor.utils.io.p0)
     binds: [B:38:0x0156, B:40:0x016f, B:27:0x00e6, B:56:0x01c9, B:75:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r8v14 int) = (r8v0 int), (r8v0 int), (r8v0 int), (r8v8 int), (r8v15 int) binds: [B:38:0x0156, B:40:0x016f, B:27:0x00e6, B:56:0x01c9, B:75:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3 A[PHI: r0 r1 r2 r3 r5 r8 r13
      0x01c3: PHI (r0v17 kotlinx.coroutines.channels.ProducerScope) = (r0v1 kotlinx.coroutines.channels.ProducerScope), (r0v18 kotlinx.coroutines.channels.ProducerScope) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r1v21 klm.b) = (r1v9 klm.b), (r1v23 klm.b) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r2v7 klm.b) = (r2v0 klm.b), (r2v8 klm.b) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r3v23 long) = (r3v7 long), (r3v24 long) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r5v31 io.ktor.utils.io.p0) = (r5v15 io.ktor.utils.io.p0), (r5v33 io.ktor.utils.io.p0) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r8v8 int) = (r8v0 int), (r8v12 int) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v27 java.lang.Object) = (r13v14 java.lang.Object), (r13v33 java.lang.Object) binds: [B:24:0x00bb, B:53:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0231 A[Catch: all -> 0x0268, TRY_LEAVE, TryCatch #3 {all -> 0x0268, blocks: (B:67:0x0228, B:69:0x0231), top: B:131:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026d A[Catch: all -> 0x0262, TryCatch #2 {all -> 0x0262, blocks: (B:75:0x0259, B:71:0x024f, B:81:0x026d, B:82:0x027a), top: B:129:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0293 A[PHI: r0 r3 r5
      0x0293: PHI (r0v5 kotlinx.coroutines.channels.ProducerScope) = (r0v19 kotlinx.coroutines.channels.ProducerScope), (r0v20 kotlinx.coroutines.channels.ProducerScope) binds: [B:48:0x0199, B:43:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r3v12 long) = (r3v25 long), (r3v26 long) binds: [B:48:0x0199, B:43:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r5v20 io.ktor.utils.io.p0) = (r5v34 io.ktor.utils.io.p0), (r5v35 io.ktor.utils.io.p0) binds: [B:48:0x0199, B:43:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01c9 -> B:42:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0257 -> B:129:0x0259). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lem.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
