package vkm;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes14.dex */
public final class v implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f290130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gim.i f290131b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Flow flow, Function2 function2) {
        this.f290130a = flow;
        this.f290131b = (gim.i) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v1, types: [gim.c] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v7, types: [gim.c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gim.i, kotlin.jvm.functions.Function2] */
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
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vkm.u
            if (r0 == 0) goto L13
            r0 = r8
            vkm.u r0 = (vkm.u) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vkm.u r0 = new vkm.u
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f290125x
            wkm.t r7 = (wkm.t) r7
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L87
        L2e:
            r8 = move-exception
            goto L8b
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.jvm.internal.Ref$BooleanRef r7 = r0.z
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f290126y
            java.lang.Object r4 = r0.f290125x
            vkm.v r4 = (vkm.v) r4
            yhm.o.b(r8)
            goto L68
        L44:
            yhm.o.b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r8.f186407a = r4
            fa7.c r2 = new fa7.c
            r5 = 1
            r2.<init>(r8, r7, r5)
            r0.f290125x = r6
            r0.f290126y = r7
            r0.z = r8
            r0.v = r4
            kotlinx.coroutines.flow.Flow r4 = r6.f290130a
            java.lang.Object r2 = r4.collect(r2, r0)
            if (r2 != r1) goto L65
            goto L86
        L65:
            r4 = r6
            r2 = r7
            r7 = r8
        L68:
            boolean r7 = r7.f186407a
            if (r7 == 0) goto L8f
            wkm.t r7 = new wkm.t
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            r7.<init>(r2, r8)
            gim.i r8 = r4.f290131b     // Catch: java.lang.Throwable -> L2e
            r0.f290125x = r7     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            r0.f290126y = r2     // Catch: java.lang.Throwable -> L2e
            r0.z = r2     // Catch: java.lang.Throwable -> L2e
            r0.v = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L2e
            if (r8 != r1) goto L87
        L86:
            return r1
        L87:
            r7.releaseIntercepted()
            goto L8f
        L8b:
            r7.releaseIntercepted()
            throw r8
        L8f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.v.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
