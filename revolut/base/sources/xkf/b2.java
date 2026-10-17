package xkf;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b2 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f306684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f306685c;

    public /* synthetic */ b2(FlowCollector flowCollector, Object obj2, int i) {
        this.f306683a = i;
        this.f306684b = flowCollector;
        this.f306685c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zhl.j
            if (r0 == 0) goto L13
            r0 = r9
            zhl.j r0 = (zhl.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zhl.j r0 = new zhl.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L7b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r9 = r8.f186385a
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            java.lang.Object r8 = r8.f186386b
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            r2 = 0
            java.lang.Object r4 = r8.getContent()     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L58
            eel.e r4 = (eel.e) r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r9 = r9.getContent()     // Catch: java.lang.Throwable -> L56
            com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r9 = (com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker) r9     // Catch: java.lang.Throwable -> L56
            if (r9 == 0) goto L59
            java.lang.Object r5 = r7.f306685c     // Catch: java.lang.Throwable -> L56
            zhl.k r5 = (zhl.k) r5     // Catch: java.lang.Throwable -> L56
            eel.e r4 = zhl.k.b(r5, r4, r9)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r9 = move-exception
            goto L67
        L58:
            r4 = r2
        L59:
            java.lang.Throwable r9 = r8.getError()     // Catch: java.lang.Throwable -> L56
            boolean r5 = r8.getLoading()     // Catch: java.lang.Throwable -> L56
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L56
            r6.<init>(r4, r9, r5)     // Catch: java.lang.Throwable -> L56
            goto L70
        L67:
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            boolean r8 = r8.getLoading()
            r6.<init>(r2, r9, r8)
        L70:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f306684b
            java.lang.Object r8 = r8.emit(r6, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zkf.m
            if (r0 == 0) goto L13
            r0 = r8
            zkf.m r0 = (zkf.m) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zkf.m r0 = new zkf.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.f322968y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f322967x
            yhm.o.b(r8)
            goto L54
        L3a:
            yhm.o.b(r8)
            tof.t3 r7 = (tof.t3) r7
            java.lang.Object r8 = r6.f306685c
            zkf.n r8 = (zkf.n) r8
            kotlinx.coroutines.flow.FlowCollector r2 = r6.f306684b
            r0.f322967x = r2
            r5 = 0
            r0.f322968y = r5
            r0.v = r4
            java.io.Serializable r8 = zkf.n.Z2(r8, r7, r0)
            if (r8 != r1) goto L53
            goto L61
        L53:
            r7 = r5
        L54:
            r4 = 0
            r0.f322967x = r4
            r0.f322968y = r7
            r0.v = r3
            java.lang.Object r7 = r2.emit(r8, r0)
            if (r7 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof znd.o0
            if (r0 == 0) goto L13
            r0 = r10
            znd.o0 r0 = (znd.o0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            znd.o0 r0 = new znd.o0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L7d
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            int r9 = r0.z
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f323785y
            java.lang.Object r4 = r0.f323784x
            yhm.o.b(r10)
            r7 = r9
            r9 = r4
            goto L65
        L3e:
            yhm.o.b(r10)
            r10 = r9
            vf0.e r10 = (vf0.e) r10
            java.lang.Object r2 = r10.f288410a
            yld.c r2 = (yld.c) r2
            java.lang.Object r10 = r10.f288411b
            lzi.j r10 = (lzi.j) r10
            java.lang.Object r5 = r8.f306685c
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b r5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) r5
            lzi.i r10 = r10.f200980a
            r0.f323784x = r9
            kotlinx.coroutines.flow.FlowCollector r6 = r8.f306684b
            r0.f323785y = r6
            r7 = 0
            r0.z = r7
            r0.v = r4
            java.lang.Object r10 = com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.I2(r5, r2, r10, r0)
            if (r10 != r1) goto L64
            goto L7c
        L64:
            r2 = r6
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            r10 = 0
            r0.f323784x = r10
            r0.f323785y = r10
            r0.z = r7
            r0.v = r3
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof zrd.t
            if (r0 == 0) goto L13
            r0 = r14
            zrd.t r0 = (zrd.t) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zrd.t r0 = new zrd.t
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L64
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r14 = r13.f186385a
            r5 = r14
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r13 = r13.f186386b
            r6 = r13
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r13 = r12.f306685c
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a r13 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) r13
            cli.y r13 = r13.f88028y
            java.lang.Object r13 = r13.f22677a
            vkm.j2 r13 = (vkm.j2) r13
            java.lang.Object r13 = r13.getValue()
            r4 = r13
            zrd.a r4 = (zrd.a) r4
            r10 = 0
            r11 = 124(0x7c, float:1.74E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            zrd.a r13 = zrd.a.a(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r14 = r12.f306684b
            java.lang.Object r13 = r14.emit(r13, r0)
            if (r13 != r1) goto L64
            return r1
        L64:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zzd.c0
            if (r0 == 0) goto L13
            r0 = r9
            zzd.c0 r0 = (zzd.c0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zzd.c0 r0 = new zzd.c0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L6e
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            r9 = 0
            java.lang.Object r2 = r8.getContent()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            wxd.t r2 = (wxd.t) r2     // Catch: java.lang.Throwable -> L49
            zzd.y r4 = new zzd.y     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r7.f306685c     // Catch: java.lang.Throwable -> L49
            zzd.v r5 = (zzd.v) r5     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r5.f326698a     // Catch: java.lang.Throwable -> L49
            r4.<init>(r2, r9, r5)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r2 = move-exception
            goto L5a
        L4b:
            r4 = r9
        L4c:
            java.lang.Throwable r2 = r8.getError()     // Catch: java.lang.Throwable -> L49
            boolean r5 = r8.getLoading()     // Catch: java.lang.Throwable -> L49
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L49
            r6.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L49
            goto L63
        L5a:
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            boolean r8 = r8.getLoading()
            r6.<init>(r9, r2, r8)
        L63:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f306684b
            java.lang.Object r8 = r8.emit(r6, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:574:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x028b -> B:145:0x0292). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r39, kotlin.coroutines.Continuation r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.b2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public b2(FlowCollector flowCollector, ybb.d dVar, ccb.k kVar) {
        this.f306683a = 7;
        this.f306684b = flowCollector;
        this.f306685c = kVar;
    }
}
