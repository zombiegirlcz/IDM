package vai;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f287298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f287299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f287300y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j2, Continuation continuation) {
        super(2, continuation);
        this.f287300y = cVar;
        this.z = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f287300y, this.z, continuation);
        bVar.f287299x = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006d -> B:11:0x0026). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f287299x
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.f287298w
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1b
            if (r2 != r5) goto L13
            goto L23
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            int r2 = r11.v
            long r7 = r11.u
            yhm.o.b(r12)
            goto L5b
        L23:
            yhm.o.b(r12)
        L26:
            kotlin.coroutines.CoroutineContext r12 = r11.getContext()
            boolean r12 = skm.e0.x(r12)
            if (r12 == 0) goto L70
            long r7 = r11.z
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 >= 0) goto L3c
            r7 = r3
        L3c:
            float r12 = (float) r7
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r12 = r12 / r2
            double r9 = (double) r12
            double r9 = java.lang.Math.ceil(r9)
            float r12 = (float) r9
            int r2 = (int) r12
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r2)
            r11.f287299x = r0
            r11.u = r7
            r11.v = r2
            r11.f287298w = r6
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L5b
            goto L6f
        L5b:
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 <= 0) goto L70
            r11.f287299x = r0
            r11.u = r7
            r11.v = r2
            r11.f287298w = r5
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = skm.k0.b(r7, r11)
            if (r12 != r1) goto L26
        L6f:
            return r1
        L70:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vai.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
