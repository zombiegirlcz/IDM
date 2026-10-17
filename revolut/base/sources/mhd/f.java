package mhd;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f205494b;

    public /* synthetic */ f(FlowCollector flowCollector, int i) {
        this.f205493a = i;
        this.f205494b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mkk.n
            if (r0 == 0) goto L13
            r0 = r8
            mkk.n r0 = (mkk.n) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mkk.n r0 = new mkk.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L57
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            vf0.h r7 = (vf0.h) r7
            java.lang.Object r8 = r7.f288433a
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r2 = r7.f288434b
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            java.lang.Object r4 = r7.f288435c
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Object r7 = r7.d
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            mkk.e r5 = new mkk.e
            kotlin.jvm.internal.Intrinsics.h(r8)
            r5.<init>(r8, r4, r7, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f205494b
            java.lang.Object r7 = r7.emit(r5, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mhd.f.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
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
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 2878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mhd.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ f(FlowCollector flowCollector, Object obj2, int i) {
        this.f205493a = i;
        this.f205494b = flowCollector;
    }
}
