package jv9;

import dv9.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ m A;
    public final /* synthetic */ boolean B;
    public f u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f178799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f178800y;
    public final /* synthetic */ fkg.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j2, fkg.a aVar, m mVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f178800y = j2;
        this.z = aVar;
        this.A = mVar;
        this.B = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f178800y, this.z, this.A, this.B, continuation);
        gVar.f178799x = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r0.emit(r15, r14) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:18:0x0062). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f178799x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r14.f178798w
            r3 = 0
            r4 = 1
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L2b
            if (r2 == r7) goto L24
            if (r2 != r6) goto L1c
            long r8 = r14.v
            jv9.f r2 = r14.u
            yhm.o.b(r15)
            r13 = r14
            goto L62
        L1c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L24:
            long r8 = r14.v
            yhm.o.b(r15)
            r13 = r14
            goto L4e
        L2b:
            yhm.o.b(r15)
            long r8 = r14.f178800y
            long r8 = r8 + r4
            r10 = r8
        L32:
            fkg.a r15 = r14.z
            java.lang.Object r15 = r15.f135824b
            r8 = r15
            jv9.e r8 = (jv9.e) r8
            r14.f178799x = r0
            r14.u = r3
            r14.v = r10
            r14.f178798w = r7
            dv9.m r9 = r14.A
            boolean r12 = r14.B
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r10, r12, r13)
            if (r15 != r1) goto L4d
            goto L61
        L4d:
            r8 = r10
        L4e:
            r2 = r15
            jv9.f r2 = (jv9.f) r2
            java.util.List r15 = r2.f178796a
            r13.f178799x = r0
            r13.u = r2
            r13.v = r8
            r13.f178798w = r6
            java.lang.Object r15 = r0.emit(r15, r14)
            if (r15 != r1) goto L62
        L61:
            return r1
        L62:
            boolean r15 = r2.f178797b
            if (r15 != 0) goto L8d
            java.util.List r15 = r2.f178796a
            java.lang.Object r15 = zhm.d0.o0(r15)
            kv9.h r15 = (kv9.h) r15
            if (r15 == 0) goto L7a
            long r10 = r15.getUpdatedDate()
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r10)
            goto L7b
        L7a:
            r15 = r3
        L7b:
            if (r15 == 0) goto L8d
            long r10 = r15.longValue()
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 != 0) goto L86
            goto L8d
        L86:
            long r8 = r15.longValue()
            long r10 = r8 + r4
            goto L32
        L8d:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: jv9.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
