package otd;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ n0 A;
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f229581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f229582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f229583y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j2, long j3, ProducerScope producerScope, Object obj2, n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.f229581w = j2;
        this.f229582x = j3;
        this.f229583y = producerScope;
        this.z = obj2;
        this.A = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f229581w, this.f229582x, this.f229583y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r8.f229583y.send(r8.z, r8) == r0) goto L16;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r9)
            goto L41
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            long r3 = r8.u
            yhm.o.b(r9)
            goto L32
        L1e:
            yhm.o.b(r9)
            long r4 = r8.f229581w
            long r6 = r8.f229582x
            long r4 = r4 - r6
            r8.u = r4
            r8.v = r3
            java.lang.Object r9 = skm.k0.b(r4, r8)
            if (r9 != r0) goto L31
            goto L40
        L31:
            r3 = r4
        L32:
            r8.u = r3
            r8.v = r2
            kotlinx.coroutines.channels.ProducerScope r9 = r8.f229583y
            java.lang.Object r1 = r8.z
            java.lang.Object r9 = r9.send(r1, r8)
            if (r9 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.jvm.internal.n0 r9 = r8.A
            long r0 = java.lang.System.currentTimeMillis()
            r9.f186428a = r0
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: otd.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
