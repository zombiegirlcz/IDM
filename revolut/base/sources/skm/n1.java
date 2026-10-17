package skm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final class n1 extends gim.h implements Function2 {
    public v1 u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f263999y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(Continuation continuation, r1 r1Var) {
        super(2, continuation);
        this.f263999y = r1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n1 n1Var = new n1(continuation, this.f263999y);
        n1Var.f263998x = obj2;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n1) create((nkm.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r7.b(r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r4.b(r5, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:27:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f263997w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            skm.p r1 = r6.v
            skm.v1 r3 = r6.u
            java.lang.Object r4 = r6.f263998x
            nkm.o r4 = (nkm.o) r4
            yhm.o.b(r7)
            goto L7f
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            yhm.o.b(r7)
            goto L84
        L24:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f263998x
            nkm.o r7 = (nkm.o) r7
            skm.r1 r1 = r6.f263999y
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = skm.r1.f264005a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof skm.p
            if (r4 == 0) goto L44
            skm.p r1 = (skm.p) r1
            skm.r1 r1 = r1.e
            r6.f263997w = r3
            fim.a r7 = r7.b(r1, r6)
            if (r7 != r0) goto L84
            goto L7e
        L44:
            boolean r3 = r1 instanceof skm.d1
            if (r3 == 0) goto L84
            skm.d1 r1 = (skm.d1) r1
            skm.v1 r1 = r1.b()
            if (r1 == 0) goto L84
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = zkm.j.f323110a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            zkm.j r3 = (zkm.j) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r7
        L61:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L84
            boolean r7 = r1 instanceof skm.p
            if (r7 == 0) goto L7f
            r7 = r1
            skm.p r7 = (skm.p) r7
            skm.r1 r5 = r7.e
            r6.f263998x = r4
            r6.u = r3
            r6.v = r7
            r6.f263997w = r2
            fim.a r7 = r4.b(r5, r6)
            if (r7 != r0) goto L7f
        L7e:
            return r0
        L7f:
            zkm.j r1 = r1.f()
            goto L61
        L84:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
