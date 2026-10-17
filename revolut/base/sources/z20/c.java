package z20;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ Set A;
    public final /* synthetic */ Set B;
    public final /* synthetic */ q C;
    public final /* synthetic */ Set D;
    public final /* synthetic */ hlm.i E;
    public List u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f318903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f318905y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Set set, Set set2, q qVar, Set set3, hlm.i iVar, Continuation continuation) {
        super(2, continuation);
        this.A = set;
        this.B = set2;
        this.C = qVar;
        this.D = set3;
        this.E = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.A, this.B, this.C, this.D, this.E, continuation);
        cVar.z = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0164, code lost:
    
        if (r5 != r2) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[PHI: r3 r5 r6 r7 r8 r9
      0x00b4: PHI (r3v21 java.util.List) = (r3v3 java.util.List), (r3v26 java.util.List) binds: [B:21:0x008a, B:24:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r5v14 java.util.Set) = (r5v0 java.util.Set), (r5v15 java.util.Set) binds: [B:21:0x008a, B:24:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r6v10 z20.q) = (r6v0 z20.q), (r6v11 z20.q) binds: [B:21:0x008a, B:24:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r7v11 java.util.Set) = (r7v0 java.util.Set), (r7v12 java.util.Set) binds: [B:21:0x008a, B:24:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r8v18 ??) = (r8v23 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r8v30 ??) binds: [B:21:0x008a, B:24:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r9v15 java.lang.Object) = (r9v0 java.lang.Object), (r9v22 java.lang.Object) binds: [B:21:0x008a, B:24:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bb  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v3, types: [z20.d] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, skm.d0, z20.d] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, z20.d] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, java.util.List, z20.d] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0164 -> B:53:0x0167). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
