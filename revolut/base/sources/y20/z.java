package y20;

import com.revolut.chat.data.db.ChatDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends gim.i implements Function1 {
    public Map A;
    public int B;
    public final /* synthetic */ t C;
    public final /* synthetic */ List D;
    public final /* synthetic */ ChatDatabase E;
    public final /* synthetic */ uvl.c F;
    public final /* synthetic */ r10.q G;
    public ArrayList u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f310574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f310575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f310576y;
    public Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar, List list, ChatDatabase chatDatabase, uvl.c cVar, r10.q qVar, Continuation continuation) {
        super(1, continuation);
        this.C = tVar;
        this.D = list;
        this.E = chatDatabase;
        this.F = cVar;
        this.G = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.C, this.D, this.E, this.F, this.G, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0340, code lost:
    
        if (r1 == r7) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        if (((kdh.b) r0).V(r1, r25) == r7) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        if (((kdh.b) r0).V(r1, r25) == r7) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0222 A[LOOP:2: B:103:0x021c->B:105:0x0222, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0245 A[LOOP:3: B:107:0x023f->B:109:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0090 A[PHI: r1 r2 r3 r4 r8 r9
      0x0090: PHI (r1v11 y20.i) = (r1v5 y20.i), (r1v13 y20.i) binds: [B:146:0x0371, B:9:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v38 java.util.List) = (r2v56 java.util.List), (r2v57 java.util.List) binds: [B:146:0x0371, B:9:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r3v21 java.util.Map) = (r3v32 java.util.Map), (r3v33 java.util.Map) binds: [B:146:0x0371, B:9:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r4v19 java.lang.Object) = (r4v17 java.lang.Object), (r4v21 java.lang.Object) binds: [B:146:0x0371, B:9:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r8v9 java.util.List) = (r8v27 java.util.List), (r8v28 java.util.List) binds: [B:146:0x0371, B:9:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r9v17 ??) = (r9v33 ??), (r9v18 ??) binds: [B:146:0x0371, B:9:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0316 A[LOOP:6: B:136:0x0310->B:138:0x0316, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.ArrayList, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
