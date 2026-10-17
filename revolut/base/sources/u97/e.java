package u97;

import kotlin.jvm.internal.n0;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f278404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f278405c;

    public e(n0 n0Var, FlowCollector flowCollector) {
        this.f278403a = 3;
        this.f278405c = n0Var;
        this.f278404b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof vfg.n
            if (r0 == 0) goto L13
            r0 = r12
            vfg.n r0 = (vfg.n) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vfg.n r0 = new vfg.n
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L6e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            java.lang.Object r12 = r11.getContent()
            hfg.l0 r12 = (hfg.l0) r12
            r2 = 0
            if (r12 == 0) goto L40
            java.util.ArrayList r12 = r12.f151863a
            goto L41
        L40:
            r12 = r2
        L41:
            if (r12 != 0) goto L45
            zhm.f0 r12 = zhm.f0.f322471a
        L45:
            r5 = r12
            boolean r7 = r11.getLoading()
            java.lang.Throwable r9 = r11.getError()
            java.lang.Object r11 = r11.getContent()
            hfg.l0 r11 = (hfg.l0) r11
            if (r11 == 0) goto L58
            java.lang.String r2 = r11.f151864b
        L58:
            r8 = r2
            lk0.e r4 = new lk0.e
            java.lang.Object r11 = r10.f278405c
            r6 = r11
            hfg.j0 r6 = (hfg.j0) r6
            r4.<init>(r5, r6, r7, r8, r9)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r11 = r10.f278404b
            java.lang.Object r11 = r11.emit(r4, r0)
            if (r11 != r1) goto L6e
            return r1
        L6e:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vge.n
            if (r0 == 0) goto L13
            r0 = r6
            vge.n r0 = (vge.n) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vge.n r0 = new vge.n
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
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            vge.e r6 = new vge.e
            java.lang.Object r2 = r4.f278405c
            vge.g r2 = (vge.g) r2
            vge.b r2 = r2.f288898b
            r6.<init>(r5, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f278404b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vge.z
            if (r0 == 0) goto L13
            r0 = r6
            vge.z r0 = (vge.z) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vge.z r0 = new vge.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            nie.a r5 = (nie.a) r5
            if (r5 == 0) goto L39
            int r5 = r5.f
            goto L3a
        L39:
            r5 = 0
        L3a:
            java.lang.Object r6 = r4.f278405c
            com.revolut.feature.tab.accounts.api.model.ProductAccount r6 = (com.revolut.feature.tab.accounts.api.model.ProductAccount) r6
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r6.getF89504c()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r6, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f278404b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f278405c
            vge.t2 r0 = (vge.t2) r0
            boolean r1 = r9 instanceof vge.o2
            if (r1 == 0) goto L17
            r1 = r9
            vge.o2 r1 = (vge.o2) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            vge.o2 r1 = new vge.o2
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r9)
            goto L92
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            kotlin.Unit r8 = (kotlin.Unit) r8
            mk0.a r8 = r0.f289011b
            com.revolut.feature.tab.accounts.api.mode.TabAccountsMode r9 = r0.f289012c
            rfe.n r9 = r9.h2()
            java.lang.String r9 = r9.f253772c
            java.lang.Object r8 = kii.e.n(r9, r8)
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            if (r8 == 0) goto L83
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            vge.w1 r5 = vge.x1.Companion
            r5.getClass()
            kotlin.Pair r3 = vge.w1.a(r3)
            if (r3 != 0) goto L6f
            r6 = r9
            goto L7c
        L6f:
            java.lang.Object r5 = r3.f186385a
            com.revolut.feature.tab.accounts.models.ProductId r5 = (com.revolut.feature.tab.accounts.models.ProductId) r5
            java.lang.Object r3 = r3.f186386b
            com.revolut.feature.tab.accounts.models.ProductAccountId r3 = (com.revolut.feature.tab.accounts.models.ProductAccountId) r3
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Discover r6 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Discover
            r6.<init>(r3, r5)
        L7c:
            if (r6 == 0) goto L56
            r0.add(r6)
            goto L56
        L82:
            r9 = r0
        L83:
            if (r9 != 0) goto L87
            zhm.f0 r9 = zhm.f0.f322471a
        L87:
            r1.v = r4
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f278404b
            java.lang.Object r8 = r8.emit(r9, r1)
            if (r8 != r2) goto L92
            return r2
        L92:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vge.x2
            if (r0 == 0) goto L13
            r0 = r6
            vge.x2 r0 = (vge.x2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vge.x2 r0 = new vge.x2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r4.f278405c
            pie.s r6 = (pie.s) r6
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f278404b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vgf.p0
            if (r0 == 0) goto L13
            r0 = r6
            vgf.p0 r0 = (vgf.p0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vgf.p0 r0 = new vgf.p0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f278404b
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r2 = r4.f278405c
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a r2 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) r2
            vgf.j1 r2 = r2.f91939w
            vgf.k1 r2 = (vgf.k1) r2
            java.lang.Object r2 = r2.f289111a
            java.lang.Object r5 = zhm.d0.e0(r5, r2)
            com.revolut.feature.unified_transactions.models.UnifiedTransaction r5 = (com.revolut.feature.unified_transactions.models.UnifiedTransaction) r5
            if (r5 == 0) goto L55
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vha.a1
            if (r0 == 0) goto L13
            r0 = r8
            vha.a1 r0 = (vha.a1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vha.a1 r0 = new vha.a1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L54
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            vha.c1 r8 = new vha.c1
            java.lang.Object r2 = r6.f278405c
            vha.d1 r2 = (vha.d1) r2
            r8.<init>()
            g17.i r4 = new g17.i
            r5 = 5
            r4.<init>(r2, r5)
            vha.b1 r2 = vha.b1.f289356a
            java.lang.Object r7 = iii.c.f(r7, r2, r8, r4)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r6.f278404b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
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
    public final java.lang.Object emit(java.lang.Object r77, kotlin.coroutines.Continuation r78) {
        /*
            Method dump skipped, instruction units count: 2940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u97.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ e(FlowCollector flowCollector, Object obj2, int i) {
        this.f278403a = i;
        this.f278404b = flowCollector;
        this.f278405c = obj2;
    }
}
