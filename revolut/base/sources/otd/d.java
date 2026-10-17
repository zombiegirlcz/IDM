package otd;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f229586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f229587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f229588c;
    public final /* synthetic */ Ref$ObjectRef d;

    public d(n0 n0Var, long j2, ProducerScope producerScope, Ref$ObjectRef ref$ObjectRef) {
        this.f229586a = n0Var;
        this.f229587b = j2;
        this.f229588c = producerScope;
        this.d = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof otd.c
            if (r2 == 0) goto L17
            r2 = r1
            otd.c r2 = (otd.c) r2
            int r3 = r2.f229585x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f229585x = r3
            goto L1c
        L17:
            otd.c r2 = new otd.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f229585x
            kotlin.jvm.internal.n0 r12 = r0.f229586a
            kotlin.jvm.internal.Ref$ObjectRef r14 = r0.d
            r5 = 1
            r15 = 0
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            long r2 = r2.u
            yhm.o.b(r1)
            goto L80
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r1)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r12.f186428a
            r10 = r8
            long r8 = r6 - r10
            r16 = 0
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 == 0) goto L70
            long r10 = r0.f229587b
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 < 0) goto L53
            goto L70
        L53:
            java.lang.Object r1 = r14.f186409a
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L5c
            r1.f(r15)
        L5c:
            otd.b r5 = new otd.b
            long r6 = r0.f229587b
            r13 = 0
            kotlinx.coroutines.channels.ProducerScope r10 = r0.f229588c
            r11 = r19
            r5.<init>(r6, r8, r10, r11, r12, r13)
            r1 = 3
            skm.a2 r1 = skm.e0.C(r10, r15, r15, r5, r1)
            r14.f186409a = r1
            goto L8d
        L70:
            r2.u = r6
            r2.f229585x = r5
            kotlinx.coroutines.channels.ProducerScope r1 = r0.f229588c
            r11 = r19
            java.lang.Object r1 = r1.send(r11, r2)
            if (r1 != r3) goto L7f
            return r3
        L7f:
            r2 = r6
        L80:
            r12.f186428a = r2
            java.lang.Object r1 = r14.f186409a
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L8b
            r1.f(r15)
        L8b:
            r14.f186409a = r15
        L8d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: otd.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
