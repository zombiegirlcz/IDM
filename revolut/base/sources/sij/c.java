package sij;

import kotlinx.coroutines.flow.FlowCollector;
import nel.z;
import t3h.e;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f263642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f263643c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f263641a = i;
        this.f263642b = obj2;
        this.f263643c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r43, kotlin.coroutines.Continuation r44) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof tuj.e
            if (r0 == 0) goto L13
            r0 = r12
            tuj.e r0 = (tuj.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            tuj.e r0 = new tuj.e
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L59
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f263642b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            r4 = r11
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Object r11 = r10.f263643c
            tuj.g r11 = (tuj.g) r11
            java.lang.Throwable r2 = r4.getError()
            boolean r11 = tuj.g.a(r11, r2)
            if (r11 == 0) goto L50
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.revolut.data.model.Data r4 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
        L50:
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof twj.e
            if (r0 == 0) goto L13
            r0 = r7
            twj.e r0 = (twj.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            twj.e r0 = new twj.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L66
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f263642b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r2 = twj.f.k
            if (r6 != r2) goto L5d
            java.lang.Object r6 = r5.f263643c
            twj.f r6 = (twj.f) r6
            ue0.c r6 = r6.f275039c
            java.lang.reflect.Type r2 = twj.f.f275036j
            java.lang.String r4 = "access$getUSER_AUTH_ANSWERS_TYPE$cp(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r4 = "answers"
            java.lang.Object r6 = r6.T2(r4, r2)
            rwj.c r6 = (rwj.c) r6
            if (r6 != 0) goto L59
            rwj.c r6 = new rwj.c
            r2 = 0
            r6.<init>(r2)
        L59:
            java.util.ArrayList r6 = qwj.a.a(r6)
        L5d:
            r0.v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tyg.l
            if (r0 == 0) goto L13
            r0 = r8
            tyg.l r0 = (tyg.l) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            tyg.l r0 = new tyg.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f263642b
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            vyg.c r7 = (vyg.c) r7
            if (r7 != 0) goto L54
            java.lang.Object r7 = r6.f263643c
            tyg.m r7 = (tyg.m) r7
            ue0.c r7 = r7.f275583a
            vyg.c r2 = vyg.c.WEEKLY
            java.lang.Class<vyg.c> r4 = vyg.c.class
            kotlin.reflect.KType r4 = kotlin.jvm.internal.o0.b(r4)
            java.lang.reflect.Type r4 = wim.z.d(r4)
            java.lang.String r5 = "WIDGETISED_TIMESTAMP_KEY"
            java.lang.Object r7 = r7.v0(r2, r5, r4)
            vyg.c r7 = (vyg.c) r7
        L54:
            r0.v = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof tzl.k
            if (r0 == 0) goto L13
            r0 = r12
            tzl.k r0 = (tzl.k) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            tzl.k r0 = new tzl.k
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L50
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f263642b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            kotlin.Unit r11 = (kotlin.Unit) r11
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            java.lang.Object r11 = r10.f263643c
            tzl.l r11 = (tzl.l) r11
            java.lang.RuntimeException r6 = r11.f
            r8 = 1
            r9 = 0
            r5 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof u25.f
            if (r0 == 0) goto L13
            r0 = r8
            u25.f r0 = (u25.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            u25.f r0 = new u25.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L56
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f263642b
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            b8d.f0 r2 = new b8d.f0
            java.lang.Object r4 = r6.f263643c
            u25.i r4 = (u25.i) r4
            r5 = 5
            r2.<init>(r4, r5)
            u25.g r4 = u25.g.f276553a
            u25.h r5 = u25.h.f276554a
            java.lang.Object r7 = iii.c.f(r7, r4, r5, r2)
            r0.v = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(u3c.i r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f263642b
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            boolean r1 = r13 instanceof u3c.n
            if (r1 == 0) goto L17
            r1 = r13
            u3c.n r1 = (u3c.n) r1
            int r2 = r1.f276913y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f276913y = r2
            goto L1c
        L17:
            u3c.n r1 = new u3c.n
            r1.<init>(r11, r13)
        L1c:
            java.lang.Object r13 = r1.f276911w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f276913y
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            long r2 = r1.v
            d3c.c0 r12 = r1.u
            yhm.o.b(r13)
            goto L53
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            yhm.o.b(r13)
            d3c.c0 r13 = r12.f276902a
            long r5 = r12.f276903b
            java.lang.Object r12 = r0.f186409a
            kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12
            if (r12 == 0) goto L56
            r1.u = r13
            r1.v = r5
            r1.f276913y = r4
            java.lang.Object r12 = skm.e0.m(r12, r1)
            if (r12 != r2) goto L51
            return r2
        L51:
            r12 = r13
            r2 = r5
        L53:
            r8 = r12
            r5 = r2
            goto L57
        L56:
            r8 = r13
        L57:
            java.lang.Object r12 = r11.f263643c
            r7 = r12
            u3c.o r7 = (u3c.o) r7
            chj.p r4 = new chj.p
            r9 = 0
            r10 = 10
            r4.<init>(r5, r7, r8, r9, r10)
            whi.b r12 = new whi.b
            r13 = 6
            r12.<init>(r13)
            skm.a2 r12 = r7.n2(r4, r12)
            r0.f186409a = r12
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.a(u3c.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:635:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final java.lang.Object emit(java.lang.Object r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sij.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public c(FlowCollector flowCollector, e eVar, z zVar) {
        this.f263641a = 10;
        this.f263642b = flowCollector;
        this.f263643c = zVar;
    }
}
