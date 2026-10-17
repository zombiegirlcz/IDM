package zj6;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f322761b;

    public /* synthetic */ d(FlowCollector flowCollector, int i) {
        this.f322760a = i;
        this.f322761b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zrd.l
            if (r0 == 0) goto L13
            r0 = r6
            zrd.l r0 = (zrd.l) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zrd.l r0 = new zrd.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r5 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r5
            com.revolut.core.ui_kit.delegates.RowDelegate$Model$c r5 = r5.k
            boolean r6 = r5 instanceof com.revolut.core.ui_kit.delegates.pf
            if (r6 == 0) goto L3d
            com.revolut.core.ui_kit.delegates.pf r5 = (com.revolut.core.ui_kit.delegates.pf) r5
            goto L3e
        L3d:
            r5 = 0
        L3e:
            if (r5 == 0) goto L4b
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f322761b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zrd.s
            if (r0 == 0) goto L13
            r0 = r7
            zrd.s r0 = (zrd.s) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zrd.s r0 = new zrd.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            yld.c r6 = (yld.c) r6
            r7 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f322761b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zrf.b
            if (r0 == 0) goto L13
            r0 = r10
            zrf.b r0 = (zrf.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zrf.b r0 = new zrf.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L7a
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            zrf.k r9 = (zrf.k) r9
            boolean r10 = r9 instanceof zrf.i
            r2 = 0
            if (r10 == 0) goto L3c
            zrf.i r9 = (zrf.i) r9
            goto L3d
        L3c:
            r9 = r2
        L3d:
            vrf.a r10 = vrf.a.f291578a
            if (r9 == 0) goto L6f
            com.revolut.feature.transfer.models.quotes.TransferQuoteSplit r4 = r9.f324733b
            java.util.ArrayList r4 = r4.f92287a
            java.util.Iterator r4 = r4.iterator()
        L49:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption r6 = (com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption) r6
            int r6 = r6.f92290c
            int r7 = r9.f324732a
            if (r6 != r7) goto L49
            r2 = r5
        L5d:
            com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption r2 = (com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption) r2
            if (r2 == 0) goto L6f
            dj0.d r9 = r2.d
            if (r9 != 0) goto L66
            goto L6f
        L66:
            vrf.c r10 = new vrf.c
            java.time.LocalDate r4 = r2.e
            java.time.LocalDate r2 = r2.f
            r10.<init>(r9, r4, r2)
        L6f:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r8.f322761b
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L7a
            return r1
        L7a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof zsa.b
            if (r0 == 0) goto L13
            r0 = r12
            zsa.b r0 = (zsa.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zsa.b r0 = new zsa.b
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L64
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            java.lang.Throwable r12 = r11.getError()
            boolean r2 = r12 instanceof retrofit2.HttpException
            if (r2 == 0) goto L3f
            retrofit2.HttpException r12 = (retrofit2.HttpException) r12
            goto L40
        L3f:
            r12 = 0
        L40:
            if (r12 == 0) goto L59
            int r12 = r12.code()
            r2 = 404(0x194, float:5.66E-43)
            if (r12 != r2) goto L59
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            com.revolut.feature.raffle.impl.data.RaffleNotAvailableException r6 = new com.revolut.feature.raffle.impl.data.RaffleNotAvailableException
            r6.<init>()
            r8 = 5
            r9 = 0
            r5 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
        L59:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r12 = r10.f322761b
            java.lang.Object r11 = r12.emit(r11, r0)
            if (r11 != r1) goto L64
            return r1
        L64:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zsd.c
            if (r0 == 0) goto L13
            r0 = r7
            zsd.c r0 = (zsd.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zsd.c r0 = new zsd.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.util.Set r6 = (java.util.Set) r6
            r7 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f322761b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zsd.i
            if (r0 == 0) goto L13
            r0 = r6
            zsd.i r0 = (zsd.i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zsd.i r0 = new zsd.i
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
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f322761b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zsd.j
            if (r0 == 0) goto L13
            r0 = r7
            zsd.j r0 = (zsd.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zsd.j r0 = new zsd.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.util.Set r6 = (java.util.Set) r6
            r7 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f322761b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zsd.k
            if (r0 == 0) goto L13
            r0 = r7
            zsd.k r0 = (zsd.k) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zsd.k r0 = new zsd.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.util.Set r6 = (java.util.Set) r6
            r7 = 3
            r2 = 0
            r4 = 0
            com.revolut.data.model.Data r6 = zi0.c.P(r6, r2, r4, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f322761b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
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
    public final java.lang.Object emit(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 2942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zj6.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public d(FlowCollector flowCollector, zm5.e eVar) {
        this.f322760a = 7;
        this.f322761b = flowCollector;
    }
}
