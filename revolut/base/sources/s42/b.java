package s42;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public long u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f259719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f259720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f259721y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j2, Continuation continuation) {
        super(2, continuation);
        this.f259721y = cVar;
        this.z = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f259721y, this.z, continuation);
        bVar.f259720x = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (skm.k0.b(1000, r20) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r3.emit(i12.a.C0902a.f157526a, r20) != r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:24:0x0088). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            s42.c r1 = r0.f259721y
            a12.q r2 = r1.f259723b
            l80.e r1 = r1.f259722a
            java.lang.Object r3 = r0.f259720x
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r0.f259719w
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L3e
            if (r5 == r9) goto L36
            if (r5 == r8) goto L32
            if (r5 == r7) goto L2b
            if (r5 != r6) goto L23
            yhm.o.b(r21)
            goto Lc2
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            long r1 = r0.u
            yhm.o.b(r21)
            goto Lb2
        L32:
            yhm.o.b(r21)
            goto L88
        L36:
            long r10 = r0.v
            long r12 = r0.u
            yhm.o.b(r21)
            goto L77
        L3e:
            yhm.o.b(r21)
            r5 = r1
            l80.f r5 = (l80.f) r5
            java.time.Instant r5 = r5.b()
            long r10 = r5.toEpochMilli()
        L4c:
            long r13 = r0.z
            int r5 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r5 >= 0) goto L94
            long r15 = r13 - r10
            i12.b r5 = new i12.b
            r17 = 1
            r12 = r2
            s12.m r12 = (s12.m) r12
            com.revolut.core.ui_kit.models.Clause r12 = r12.a(r13, r15, r17)
            r13 = r15
            r5.<init>(r12)
            r0.f259720x = r3
            r0.u = r10
            r0.v = r13
            r0.f259719w = r9
            java.lang.Object r5 = r3.emit(r5, r0)
            if (r5 != r4) goto L72
            goto Lc1
        L72:
            r18 = r13
            r12 = r10
            r10 = r18
        L77:
            r0.f259720x = r3
            r0.u = r12
            r0.v = r10
            r0.f259719w = r8
            r10 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = skm.k0.b(r10, r0)
            if (r5 != r4) goto L88
            goto Lc1
        L88:
            r5 = r1
            l80.f r5 = (l80.f) r5
            java.time.Instant r5 = r5.b()
            long r10 = r5.toEpochMilli()
            goto L4c
        L94:
            i12.b r1 = new i12.b
            r17 = 1
            r12 = r2
            s12.m r12 = (s12.m) r12
            r15 = 0
            com.revolut.core.ui_kit.models.Clause r2 = r12.a(r13, r15, r17)
            r1.<init>(r2)
            r0.f259720x = r3
            r0.u = r10
            r0.f259719w = r7
            java.lang.Object r1 = r3.emit(r1, r0)
            if (r1 != r4) goto Lb1
            goto Lc1
        Lb1:
            r1 = r10
        Lb2:
            r5 = 0
            r0.f259720x = r5
            r0.u = r1
            r0.f259719w = r6
            i12.a$a r1 = i12.a.C0902a.f157526a
            java.lang.Object r1 = r3.emit(r1, r0)
            if (r1 != r4) goto Lc2
        Lc1:
            return r4
        Lc2:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s42.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
