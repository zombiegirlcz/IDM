package wa3;

import kotlinx.coroutines.flow.FlowCollector;
import wbg.s;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f295807b;

    public /* synthetic */ h(FlowCollector flowCollector, int i) {
        this.f295806a = i;
        this.f295807b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wik.a
            if (r0 == 0) goto L13
            r0 = r7
            wik.a r0 = (wik.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            wik.a r0 = new wik.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            r2 = 0
            if (r7 == 0) goto L45
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L45
            goto L5c
        L45:
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r6.next()
            yw4.p r7 = (yw4.p) r7
            yw4.q r7 = r7.e
            yw4.q r4 = yw4.q.ACTIVE
            if (r7 != r4) goto L49
            r2 = r3
        L5c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f295807b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.h.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wjg.b
            if (r0 == 0) goto L13
            r0 = r6
            wjg.b r0 = (wjg.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            wjg.b r0 = new wjg.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            com.revolut.feature.uipersonalisation.api.models.AppTheme r5 = (com.revolut.feature.uipersonalisation.api.models.AppTheme) r5
            if (r5 == 0) goto L3f
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r5 = r5.f94561a
            goto L40
        L3f:
            r5 = 0
        L40:
            boolean r5 = r5 instanceof com.revolut.feature.uipersonalisation.api.ParticlesThemeDeclaration
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f295807b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.h.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wk2.d
            if (r0 == 0) goto L13
            r0 = r7
            wk2.d r0 = (wk2.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            wk2.d r0 = new wk2.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r7 = r6
            mx0.s9 r7 = (mx0.s9) r7
            mx0.r9 r2 = r7.f209998a
            mx0.r9 r4 = mx0.r9.MOVE_STARTED
            if (r2 != r4) goto L4c
            mx0.u9 r7 = r7.f209999b
            mx0.u9 r2 = mx0.u9.REASON_GESTURE
            if (r7 != r2) goto L4c
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f295807b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.h.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.coroutines.flow.FlowCollector] */
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
    public final java.lang.Object emit(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 2324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public h(FlowCollector flowCollector, s sVar) {
        this.f295806a = 9;
        this.f295807b = flowCollector;
    }
}
