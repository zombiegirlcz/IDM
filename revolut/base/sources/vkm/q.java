package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qza.q f290099a = new qza.q(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pq0.d f290100b = new pq0.d(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cfm.c f290101c = new cfm.c("NO_VALUE", 3);
    public static final cfm.c d = new cfm.c("NONE", 3);
    public static final cfm.c e = new cfm.c("PENDING", 3);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(kotlinx.coroutines.flow.Flow r5, kotlin.jvm.functions.Function2 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vkm.d1
            if (r0 == 0) goto L13
            r0 = r7
            vkm.d1 r0 = (vkm.d1) r0
            int r1 = r0.f290014x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290014x = r1
            goto L18
        L13:
            vkm.d1 r0 = new vkm.d1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f290013w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290014x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            vkm.y0 r5 = r0.v
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.u
            yhm.o.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r7 = move-exception
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r7 = p.a.w(r7)
            vkm.y0 r2 = new vkm.y0
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.u = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.v = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.f290014x = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r6 = r7
            goto L5d
        L4e:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L52:
            java.lang.Object r1 = r7.f187936a
            if (r1 != r5) goto L60
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.e0.p(r5)
        L5d:
            java.lang.Object r5 = r6.f186409a
            return r5
        L60:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.A(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    public static final t0 B(Function2 function2, Flow flow) {
        int i = v0.f290132a;
        int i2 = 0;
        return new t0(new q0(flow, function2, i2), i2);
    }

    public static final Flow C(Flow flow, CoroutineContext coroutineContext) {
        if (coroutineContext.get(skm.g1.f263979a) == null) {
            return coroutineContext.equals(kotlin.coroutines.g.f186406a) ? flow : flow instanceof wkm.q ? wkm.b.a((wkm.q) flow, coroutineContext, 0, null, 6) : new wkm.h(0, 12, coroutineContext, flow, null);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final Flow D(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return ((i == 0 || i == -3) && fVar == ukm.f.SUSPEND) ? sharedFlow : new wkm.h(i, coroutineContext, sharedFlow, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(kotlinx.coroutines.flow.Flow r6, gim.c r7) {
        /*
            cfm.c r0 = wkm.b.f298304b
            boolean r1 = r7 instanceof vkm.e1
            if (r1 == 0) goto L15
            r1 = r7
            vkm.e1 r1 = (vkm.e1) r1
            int r2 = r1.f290017w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f290017w = r2
            goto L1a
        L15:
            vkm.e1 r1 = new vkm.e1
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f290017w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r1.u
            yhm.o.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.jvm.internal.Ref$ObjectRef r7 = p.a.w(r7)
            r7.f186409a = r0
            vkm.f1 r3 = new vkm.f1
            r5 = 0
            r3.<init>(r7, r5)
            r1.u = r7
            r1.f290017w = r4
            java.lang.Object r6 = r6.collect(r3, r1)
            if (r6 != r2) goto L4a
            return r2
        L4a:
            r6 = r7
        L4b:
            java.lang.Object r6 = r6.f186409a
            if (r6 == r0) goto L50
            return r6
        L50:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.E(kotlinx.coroutines.flow.Flow, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(kotlinx.coroutines.flow.Flow r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof vkm.g1
            if (r0 == 0) goto L13
            r0 = r6
            vkm.g1 r0 = (vkm.g1) r0
            int r1 = r0.f290027w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290027w = r1
            goto L18
        L13:
            vkm.g1 r0 = new vkm.g1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290027w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r6 = p.a.w(r6)
            vkm.f1 r2 = new vkm.f1
            r4 = 1
            r2.<init>(r6, r4)
            r0.u = r6
            r0.f290027w = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r5 = r6
        L47:
            java.lang.Object r5 = r5.f186409a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.F(kotlinx.coroutines.flow.Flow, gim.c):java.lang.Object");
    }

    public static final skm.a2 G(Flow flow, CoroutineScope coroutineScope) {
        return skm.e0.C(coroutineScope, null, null, new az0.r1(flow, null, 17), 3);
    }

    public static final wkm.l H(Function2 function2, Flow flow) {
        int i = v0.f290132a;
        return Q(flow, new ekg.a(function2, null));
    }

    public static final f I(Iterable iterable) {
        int i = v0.f290132a;
        return new f(iterable, kotlin.coroutines.g.f186406a, -2, ukm.f.SUSPEND);
    }

    public static final f J(Flow... flowArr) {
        int i = v0.f290132a;
        return I(kotlin.collections.d.D(flowArr));
    }

    public static final e K(ukm.i0 i0Var) {
        return new e(i0Var, false);
    }

    public static final y L(Flow flow, long j2, Function2 function2) {
        if (j2 > 0) {
            return new y(flow, new c0(j2, function2, null));
        }
        throw new IllegalArgumentException(p.a.m(j2, "Expected positive amount of retries, but had ").toString());
    }

    public static final t1 M(Flow flow, CoroutineScope coroutineScope, d2 d2Var, int i) {
        hcm.g0 g0VarP = p(flow, i);
        z1 z1VarA = a(i, g0VarP.f151273a, (ukm.f) g0VarP.f151275c);
        CoroutineContext coroutineContext = (CoroutineContext) g0VarP.d;
        Flow flow2 = (Flow) g0VarP.f151274b;
        d2.Companion.getClass();
        return new t1(z1VarA, skm.e0.B(coroutineScope, coroutineContext, d2Var.equals(c2.f290008b) ? skm.d0.DEFAULT : skm.d0.UNDISPATCHED, new ve0.b(d2Var, flow2, z1VarA, f290101c, (Continuation) null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(et6.u1 r6, kotlinx.coroutines.CoroutineScope r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof vkm.k1
            if (r0 == 0) goto L13
            r0 = r8
            vkm.k1 r0 = (vkm.k1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vkm.k1 r0 = new vkm.k1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L62
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            hcm.g0 r6 = p(r6, r3)
            kotlin.coroutines.CoroutineContext r8 = r7.getF74819h()
            skm.g1 r2 = skm.g1.f263979a
            kotlin.coroutines.CoroutineContext$Element r8 = r8.get(r2)
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            skm.r r2 = new skm.r
            r2.<init>(r8)
            java.lang.Object r8 = r6.d
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r6 = r6.f151274b
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            vkm.j1 r4 = new vkm.j1
            r5 = 0
            r4.<init>(r6, r2, r5)
            r6 = 2
            skm.e0.C(r7, r8, r5, r4, r6)
            r0.v = r3
            java.lang.Object r8 = r2.y(r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r6 = r8.f314193a
            yhm.o.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.N(et6.u1, kotlinx.coroutines.CoroutineScope, gim.c):java.lang.Object");
    }

    public static final u1 O(Flow flow, CoroutineScope coroutineScope, d2 d2Var, Object obj2) {
        hcm.g0 g0VarP = p(flow, 1);
        j2 j2VarC = c(obj2);
        CoroutineContext coroutineContext = (CoroutineContext) g0VarP.d;
        Flow flow2 = (Flow) g0VarP.f151274b;
        d2.Companion.getClass();
        return new u1(j2VarC, skm.e0.B(coroutineScope, coroutineContext, d2Var.equals(c2.f290008b) ? skm.d0.DEFAULT : skm.d0.UNDISPATCHED, new ve0.b(d2Var, flow2, j2VarC, obj2, (Continuation) null)));
    }

    public static final kq.g P(Flow flow, int i) {
        if (i > 0) {
            return new kq.g(flow, i, 1);
        }
        throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " should be positive").toString());
    }

    public static final wkm.l Q(Flow flow, Function3 function3) {
        int i = v0.f290132a;
        return new wkm.l(function3, flow, kotlin.coroutines.g.f186406a, -2, ukm.f.SUSPEND);
    }

    public static final v1 R(Flow flow, Function3 function3) {
        return new v1(new aci.e(flow, function3, (Continuation) null));
    }

    public static final z1 a(int i, int i2, ukm.f fVar) {
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("replay cannot be negative, but was ", i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a0.d.n("extraBufferCapacity cannot be negative, but was ", i2).toString());
        }
        if (i <= 0 && i2 <= 0 && fVar != ukm.f.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + fVar).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new z1(i, i3, fVar);
    }

    public static /* synthetic */ z1 b(int i, int i2, ukm.f fVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            fVar = ukm.f.SUSPEND;
        }
        return a(i3, i, fVar);
    }

    public static final j2 c(Object obj2) {
        if (obj2 == null) {
            obj2 = wkm.b.f298304b;
        }
        return new j2(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final fim.a d(kotlinx.coroutines.flow.FlowCollector r4, java.lang.Object r5, java.lang.Object r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vkm.i0
            if (r0 == 0) goto L13
            r0 = r7
            vkm.i0 r0 = (vkm.i0) r0
            int r1 = r0.f290040w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290040w = r1
            goto L18
        L13:
            vkm.i0 r0 = new vkm.i0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290040w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.u
            yhm.o.b(r7)
            goto L3f
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f290040w = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.d(kotlinx.coroutines.flow.FlowCollector, java.lang.Object, java.lang.Object, gim.c):fim.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(vkm.p2 r4, kotlin.jvm.functions.Function3 r5, java.lang.Throwable r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vkm.r
            if (r0 == 0) goto L13
            r0 = r7
            vkm.r r0 = (vkm.r) r0
            int r1 = r0.f290108w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290108w = r1
            goto L18
        L13:
            vkm.r r0 = new vkm.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290108w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r7)
            r0.u = r6     // Catch: java.lang.Throwable -> L29
            r0.f290108w = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            yhm.f.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.e(vkm.p2, kotlin.jvm.functions.Function3, java.lang.Throwable, gim.c):java.lang.Object");
    }

    public static final void f(Object[] objArr, long j2, Object obj2) {
        objArr[((int) j2) & (objArr.length - 1)] = obj2;
    }

    public static final t1 g(MutableSharedFlow mutableSharedFlow) {
        return new t1(mutableSharedFlow, null);
    }

    public static final u1 h(MutableStateFlow mutableStateFlow) {
        return new u1(mutableStateFlow, null);
    }

    public static final Flow i(Flow flow, int i, ukm.f fVar) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(a0.d.n("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
        }
        if (i == -1 && fVar != ukm.f.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            fVar = ukm.f.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        ukm.f fVar2 = fVar;
        return flow instanceof wkm.q ? wkm.b.a((wkm.q) flow, null, i2, fVar2, 1) : new wkm.h(i2, 2, null, flow, fVar2);
    }

    public static /* synthetic */ Flow j(Flow flow, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return i(flow, i, ukm.f.SUSPEND);
    }

    public static final d k(Function2 function2) {
        return new d(function2, kotlin.coroutines.g.f186406a, -2, ukm.f.SUSPEND);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable l(kotlinx.coroutines.flow.Flow r5, kotlinx.coroutines.flow.FlowCollector r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof vkm.a0
            if (r0 == 0) goto L13
            r0 = r7
            vkm.a0 r0 = (vkm.a0) r0
            int r1 = r0.f289990w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289990w = r1
            goto L18
        L13:
            vkm.a0 r0 = new vkm.a0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289990w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L48
        L29:
            r6 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.jvm.internal.Ref$ObjectRef r7 = p.a.w(r7)
            fli.d r2 = new fli.d     // Catch: java.lang.Throwable -> L4a
            r4 = 1
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4a
            r0.u = r7     // Catch: java.lang.Throwable -> L4a
            r0.f289990w = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L48
            return r1
        L48:
            r5 = 0
            return r5
        L4a:
            r6 = move-exception
            r5 = r7
        L4c:
            java.lang.Object r5 = r5.f186409a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L58
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7a
        L58:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            skm.g1 r0 = skm.g1.f263979a
            kotlin.coroutines.CoroutineContext$Element r7 = r7.get(r0)
            kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
            if (r7 == 0) goto L7b
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L6d
            goto L7b
        L6d:
            java.util.concurrent.CancellationException r7 = r7.p()
            if (r7 == 0) goto L7b
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7a
            goto L7b
        L7a:
            throw r6
        L7b:
            if (r5 != 0) goto L7e
            return r6
        L7e:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L86
            yhm.f.a(r5, r6)
            throw r5
        L86:
            yhm.f.a(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.l(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, gim.c):java.io.Serializable");
    }

    public static final f m(Function2 function2) {
        return new f(function2, kotlin.coroutines.g.f186406a, -2, ukm.f.SUSPEND);
    }

    public static final Object n(Flow flow, Continuation continuation) {
        Object objCollect = flow.collect(wkm.s.f298328a, continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    public static final Object o(Flow flow, Function2 function2, Continuation continuation) {
        Object objN = n(j(H(function2, flow), 0, 2), continuation);
        return objN == fim.a.COROUTINE_SUSPENDED ? objN : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final hcm.g0 p(kotlinx.coroutines.flow.Flow r7, int r8) {
        /*
            ukm.t r0 = ukm.u.E1
            r0.getClass()
            int r0 = ukm.t.f280840b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof wkm.d
            if (r1 == 0) goto L3b
            r1 = r7
            wkm.d r1 = (wkm.d) r1
            ukm.f r2 = r1.f298308c
            kotlinx.coroutines.flow.Flow r3 = r1.e()
            if (r3 == 0) goto L3b
            hcm.g0 r7 = new hcm.g0
            int r4 = r1.f298307b
            r5 = -3
            if (r4 == r5) goto L29
            r5 = -2
            if (r4 == r5) goto L29
            if (r4 == 0) goto L29
            r0 = r4
            goto L35
        L29:
            ukm.f r5 = ukm.f.SUSPEND
            r6 = 0
            if (r2 != r5) goto L32
            if (r4 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            kotlin.coroutines.CoroutineContext r8 = r1.f298306a
            r7.<init>(r0, r8, r3, r2)
            return r7
        L3b:
            hcm.g0 r8 = new hcm.g0
            ukm.f r1 = ukm.f.SUSPEND
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            r8.<init>(r0, r2, r7, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.p(kotlinx.coroutines.flow.Flow, int):hcm.g0");
    }

    public static final Flow q(Flow flow) {
        return flow instanceof StateFlow ? flow : s(flow, f290099a, f290100b);
    }

    public static final h r(Function2 function2, Flow flow) {
        kotlin.jvm.internal.u0.f(2, function2);
        return s(flow, f290099a, function2);
    }

    public static final h s(Flow flow, Function1 function1, Function2 function2) {
        if (flow instanceof h) {
            h hVar = (h) flow;
            if (hVar.f290031b == function1 && hVar.f290032c == function2) {
                return hVar;
            }
        }
        return new h(flow, function1, function2);
    }

    public static final e0 t(Flow flow, int i) {
        if (i >= 0) {
            return new e0(flow, i);
        }
        throw new IllegalArgumentException(a0.d.n("Drop count should be non-negative, but had ", i).toString());
    }

    public static final Object u(FlowCollector flowCollector, Flow flow, Continuation continuation) throws Throwable {
        w(flowCollector);
        Object objCollect = flow.collect(flowCollector, continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0054, B:28:0x0069, B:30:0x0071, B:20:0x0046, B:23:0x0050), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlinx.coroutines.flow.FlowCollector r6, ukm.i0 r7, boolean r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof vkm.m
            if (r0 == 0) goto L13
            r0 = r9
            vkm.m r0 = (vkm.m) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vkm.m r0 = new vkm.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f290070y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f290069x
            ukm.g r6 = r0.f290068w
            ukm.i0 r7 = r0.v
            kotlinx.coroutines.flow.FlowCollector r2 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L8f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f290069x
            ukm.g r6 = r0.f290068w
            ukm.i0 r7 = r0.v
            kotlinx.coroutines.flow.FlowCollector r2 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L69
        L4a:
            yhm.o.b(r9)
            w(r6)
            ukm.g r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L54:
            r0.u = r6     // Catch: java.lang.Throwable -> L34
            r0.v = r7     // Catch: java.lang.Throwable -> L34
            r0.f290068w = r9     // Catch: java.lang.Throwable -> L34
            r0.f290069x = r8     // Catch: java.lang.Throwable -> L34
            r0.z = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L65
            goto L85
        L65:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.u = r2     // Catch: java.lang.Throwable -> L34
            r0.v = r7     // Catch: java.lang.Throwable -> L34
            r0.f290068w = r6     // Catch: java.lang.Throwable -> L34
            r0.f290069x = r8     // Catch: java.lang.Throwable -> L34
            r0.z = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L85:
            return r1
        L86:
            if (r8 == 0) goto L8c
            r6 = 0
            r7.f(r6)
        L8c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r9 = move-exception
            if (r8 == 0) goto L96
            com.bumptech.glide.c.h(r7, r6)
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.v(kotlinx.coroutines.flow.FlowCollector, ukm.i0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void w(FlowCollector flowCollector) throws Throwable {
        if (flowCollector instanceof p2) {
            throw ((p2) flowCollector).f290098a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(kotlinx.coroutines.flow.Flow r6, kotlin.coroutines.Continuation r7) {
        /*
            cfm.c r0 = wkm.b.f298304b
            boolean r1 = r7 instanceof vkm.z0
            if (r1 == 0) goto L15
            r1 = r7
            vkm.z0 r1 = (vkm.z0) r1
            int r2 = r1.f290159x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f290159x = r2
            goto L1a
        L15:
            vkm.z0 r1 = new vkm.z0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f290158w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f290159x
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            vkm.w0 r6 = r1.v
            kotlin.jvm.internal.Ref$ObjectRef r2 = r1.u
            yhm.o.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L61
        L2d:
            r7 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.jvm.internal.Ref$ObjectRef r7 = p.a.w(r7)
            r7.f186409a = r0
            vkm.w0 r3 = new vkm.w0
            r5 = 0
            r3.<init>(r7, r5)
            r1.u = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r1.v = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r1.f290159x = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r6 = r6.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r6 != r2) goto L50
            return r2
        L50:
            r2 = r7
            goto L61
        L52:
            r6 = move-exception
            r2 = r7
            r7 = r6
            r6 = r3
        L56:
            java.lang.Object r3 = r7.f187936a
            if (r3 != r6) goto L6e
            kotlin.coroutines.CoroutineContext r6 = r1.getContext()
            skm.e0.p(r6)
        L61:
            java.lang.Object r6 = r2.f186409a
            if (r6 == r0) goto L66
            return r6
        L66:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.x(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(kotlinx.coroutines.flow.Flow r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            cfm.c r0 = wkm.b.f298304b
            boolean r1 = r8 instanceof vkm.a1
            if (r1 == 0) goto L15
            r1 = r8
            vkm.a1 r1 = (vkm.a1) r1
            int r2 = r1.f289992x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f289992x = r2
            goto L1a
        L15:
            vkm.a1 r1 = new vkm.a1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.f289991w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f289992x
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            vkm.y0 r6 = r1.v
            kotlin.jvm.internal.Ref$ObjectRef r7 = r1.u
            yhm.o.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L61
        L2d:
            r8 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.jvm.internal.Ref$ObjectRef r8 = p.a.w(r8)
            r8.f186409a = r0
            vkm.y0 r3 = new vkm.y0
            r5 = 0
            r3.<init>(r7, r8, r5)
            r1.u = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r1.v = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r1.f289992x = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r6 = r6.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r6 != r2) goto L50
            return r2
        L50:
            r7 = r8
            goto L61
        L52:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L56:
            java.lang.Object r2 = r8.f187936a
            if (r2 != r6) goto L6e
            kotlin.coroutines.CoroutineContext r6 = r1.getContext()
            skm.e0.p(r6)
        L61:
            java.lang.Object r6 = r7.f186409a
            if (r6 == r0) goto L66
            return r6
        L66:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        L6e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.y(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(kotlinx.coroutines.flow.Flow r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof vkm.c1
            if (r0 == 0) goto L13
            r0 = r6
            vkm.c1 r0 = (vkm.c1) r0
            int r1 = r0.f290006x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290006x = r1
            goto L18
        L13:
            vkm.c1 r0 = new vkm.c1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f290005w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290006x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            vkm.w0 r5 = r0.v
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.u
            yhm.o.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r6 = move-exception
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r6 = p.a.w(r6)
            vkm.w0 r2 = new vkm.w0
            r4 = 1
            r2.<init>(r6, r4)
            r0.u = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.v = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.f290006x = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r1 = r6
            goto L5d
        L4e:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L52:
            java.lang.Object r2 = r6.f187936a
            if (r2 != r5) goto L60
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.e0.p(r5)
        L5d:
            java.lang.Object r5 = r1.f186409a
            return r5
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.q.z(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
