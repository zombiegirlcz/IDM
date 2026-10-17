package ahd;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f4932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4933c;

    public /* synthetic */ b(FlowCollector flowCollector, Object obj2, String str, int i) {
        this.f4931a = i;
        this.f4932b = flowCollector;
        this.f4933c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jlh.k
            if (r0 == 0) goto L13
            r0 = r6
            jlh.k r0 = (jlh.k) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            jlh.k r0 = new jlh.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = r4.f4933c
            del.f r2 = jlh.o.f175786c
            java.lang.Object r5 = r5.getOrDefault(r6, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f4932b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof k40.b
            if (r2 == 0) goto L17
            r2 = r1
            k40.b r2 = (k40.b) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            k40.b r2 = new k40.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L80
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r1 = r18
            v30.j r1 = (v30.j) r1
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.chat_core.R$string.chat_assistant_widget_title
            r6 = 0
            r7 = 14
            r8.<init>(r4, r6, r6, r7)
            if (r1 == 0) goto L5c
            com.revolut.chat.domain.model.LastMessage r4 = r1.f285790j
            if (r4 == 0) goto L5c
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r10 = r4.getText()
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r10 = r9
            goto L5d
        L5c:
            r10 = r6
        L5d:
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.chat_core.R$string.chat_assistant_widget_suggestion
            r11.<init>(r4, r6, r6, r7)
            if (r1 == 0) goto L6c
            int r1 = r1.k
            if (r1 <= 0) goto L6c
            r9 = r5
            goto L6e
        L6c:
            r1 = 0
            r9 = r1
        L6e:
            com.revolut.core.ui_kit.delegates.widgets.InputWidgetDelegate$Model r6 = new com.revolut.core.ui_kit.delegates.widgets.InputWidgetDelegate$Model
            java.lang.String r7 = r0.f4933c
            r6.<init>(r7, r8, r9, r10, r11)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r1 = r0.f4932b
            java.lang.Object r1 = r1.emit(r6, r2)
            if (r1 != r3) goto L80
            return r3
        L80:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r49, kotlin.coroutines.Continuation r50) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof m78.f
            if (r0 == 0) goto L13
            r0 = r8
            m78.f r0 = (m78.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            m78.f r0 = new m78.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L6c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r8 = r7.f186385a
            fo3.c r8 = (fo3.c) r8
            java.lang.Object r7 = r7.f186386b
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r7.next()
            r4 = r2
            io3.d r4 = (io3.d) r4
            xi0.b r4 = z92.f.l(r4)
            xi0.b r5 = r8.d
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L42
            goto L5d
        L5c:
            r2 = 0
        L5d:
            io3.d r2 = (io3.d) r2
            if (r2 == 0) goto L6f
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f4932b
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = r6.f4933c
            java.lang.String r0 = "No base pocket for juniorId="
            java.lang.String r8 = j6.a.q(r0, r8)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r43, kotlin.coroutines.Continuation r44) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mc7.a
            if (r0 == 0) goto L13
            r0 = r6
            mc7.a r0 = (mc7.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mc7.a r0 = new mc7.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate$Model r5 = (com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate.Model) r5
            com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate$Model$a r6 = com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate.Model.INSTANCE
            kotlin.jvm.internal.Intrinsics.h(r5)
            java.lang.String r2 = r4.f4933c
            com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate$Model r5 = com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate.Model.Companion.a(r6, r2, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f4932b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mc7.c
            if (r0 == 0) goto L13
            r0 = r6
            mc7.c r0 = (mc7.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mc7.c r0 = new mc7.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate$Model r5 = (com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate.Model) r5
            com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate$Model$a r6 = com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate.Model.INSTANCE
            kotlin.jvm.internal.Intrinsics.h(r5)
            java.lang.String r2 = r4.f4933c
            com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate$Model r5 = com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate.Model.Companion.b(r6, r2, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f4932b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
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
    public final java.lang.Object emit(java.lang.Object r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instruction units count: 2476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ b(FlowCollector flowCollector, String str, int i) {
        this.f4931a = i;
        this.f4932b = flowCollector;
        this.f4933c = str;
    }

    public b(FlowCollector flowCollector, String str, bnh.n nVar) {
        this.f4931a = 1;
        this.f4932b = flowCollector;
        this.f4933c = str;
    }
}
