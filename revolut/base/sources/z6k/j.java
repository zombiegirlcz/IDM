package z6k;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f319795b;

    public /* synthetic */ j(FlowCollector flowCollector, int i) {
        this.f319794a = i;
        this.f319795b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zi0.b
            if (r0 == 0) goto L13
            r0 = r6
            zi0.b r0 = (zi0.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zi0.b r0 = new zi0.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = r5
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r2 = r6.getContent()
            if (r2 != 0) goto L42
            boolean r6 = r6.getLoading()
            if (r6 == 0) goto L42
            goto L4d
        L42:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f319795b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z6k.j.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
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
    public final java.lang.Object emit(java.lang.Object r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instruction units count: 2720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6k.j.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public j(FlowCollector flowCollector, vfg.p pVar) {
        this.f319794a = 6;
        this.f319795b = flowCollector;
    }
}
