package mjf;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends gim.i implements Function2 {
    public boolean A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ k0 E;
    public final /* synthetic */ boolean F;
    public k71.q u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Serializable f205994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ref$ObjectRef f205995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f205996y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.E = k0Var;
        this.F = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.E, this.F, continuation);
        e0Var.D = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0454, code lost:
    
        if (r2.b(r10) != r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04e4, code lost:
    
        if (r2.b(r6) != r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0517, code lost:
    
        if (mjf.k0.a(r1, r26) != r4) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0282, code lost:
    
        if (r10 != r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:69:0x0273, B:72:0x0281], limit reached: 135 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c6 A[PHI: r3 r5 r7 r8 r9 r12 r13 r14
      0x03c6: PHI (r3v5 kotlinx.coroutines.CoroutineScope) = (r3v1 kotlinx.coroutines.CoroutineScope), (r3v6 kotlinx.coroutines.CoroutineScope) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r5v54 boolean) = (r5v51 boolean), (r5v57 boolean) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r7v26 java.util.List) = (r7v22 java.util.List), (r7v29 java.util.List) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r8v25 kotlin.jvm.internal.Ref$ObjectRef) = (r8v20 kotlin.jvm.internal.Ref$ObjectRef), (r8v28 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r9v22 org.joda.time.DateTime) = (r9v18 org.joda.time.DateTime), (r9v26 org.joda.time.DateTime) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r12v1 ??) = (r12v17 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r12v21 ??) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r13v22 java.util.Map) = (r13v17 java.util.Map), (r13v25 java.util.Map) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]
      0x03c6: PHI (r14v20 k71.q) = (r14v15 k71.q), (r14v23 k71.q) binds: [B:11:0x0092, B:107:0x03c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ef A[LOOP:1: B:110:0x03e9->B:112:0x03ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ce A[PHI: r1 r3 r6
      0x04ce: PHI (r1v12 ??) = (r1v23 ??), (r1v24 ??) binds: [B:133:0x04cb, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x04ce: PHI (r3v21 boolean) = (r3v19 boolean), (r3v22 boolean) binds: [B:133:0x04cb, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x04ce: PHI (r6v38 ??) = (r6v41 ??), (r6v39 ??) binds: [B:133:0x04cb, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7 A[PHI: r3 r5 r6 r7 r8 r9 r12 r13 r14
      0x00f7: PHI (r3v12 kotlinx.coroutines.CoroutineScope) = (r3v1 kotlinx.coroutines.CoroutineScope), (r3v13 kotlinx.coroutines.CoroutineScope) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r5v59 ??) = (r5v81 ??), (r5v82 ??) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r6v17 java.lang.Object) = (r6v2 java.lang.Object), (r6v30 java.lang.Object) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r7v31 boolean) = (r7v18 boolean), (r7v32 boolean) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r8v30 kotlin.jvm.internal.Ref$ObjectRef) = (r8v15 kotlin.jvm.internal.Ref$ObjectRef), (r8v33 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r9v28 org.joda.time.DateTime) = (r9v14 org.joda.time.DateTime), (r9v31 org.joda.time.DateTime) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r12v9 java.util.List) = (r12v14 java.util.List), (r12v18 java.util.List) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r13v27 java.util.Map) = (r13v11 java.util.Map), (r13v30 java.util.Map) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r14v25 k71.q) = (r14v10 k71.q), (r14v33 k71.q) binds: [B:15:0x00e2, B:84:0x02db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0149 A[PHI: r5 r7 r8
      0x0149: PHI (r5v18 boolean) = (r5v16 boolean), (r5v39 boolean) binds: [B:46:0x01df, B:20:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r7v8 k71.q) = (r7v6 k71.q), (r7v10 k71.q) binds: [B:46:0x01df, B:20:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r8v4 java.lang.Object) = (r8v3 java.lang.Object), (r8v6 java.lang.Object) binds: [B:46:0x01df, B:20:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ee  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [xif.u] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v58, types: [int] */
    /* JADX WARN: Type inference failed for: r5v59, types: [int] */
    /* JADX WARN: Type inference failed for: r5v60, types: [int] */
    /* JADX WARN: Type inference failed for: r5v61, types: [int] */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.io.Serializable, java.lang.Object, java.lang.String, java.util.List, java.util.Map, k71.q, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.io.Serializable, java.lang.Object, java.util.Map, k71.q, kotlin.jvm.internal.Ref$ObjectRef, org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.io.Serializable, java.lang.Boolean, java.lang.Object, java.util.Map, k71.q, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0454 -> B:120:0x0458). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x046f -> B:126:0x0479). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
