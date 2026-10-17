package aw;

import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes16.dex */
public final class i0 extends gim.i implements Function3 {
    public final /* synthetic */ VideoImuDataCollectionSettings A;
    public final /* synthetic */ String B;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f10167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f10168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f10169y;
    public final /* synthetic */ yw.n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(long j2, j0 j0Var, VideoImuDataCollectionSettings videoImuDataCollectionSettings, String str, Continuation continuation, yw.n nVar) {
        super(3, continuation);
        this.f10168x = j0Var;
        this.f10169y = j2;
        this.z = nVar;
        this.A = videoImuDataCollectionSettings;
        this.B = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        VideoImuDataCollectionSettings videoImuDataCollectionSettings = this.A;
        String str = this.B;
        i0 i0Var = new i0(this.f10169y, this.f10168x, videoImuDataCollectionSettings, str, (Continuation) obj4, this.z);
        i0Var.v = (FlowCollector) obj2;
        i0Var.f10167w = (Throwable) obj3;
        return i0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (vkm.q.u(r1, r2, r16) == r3) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            kotlinx.coroutines.flow.FlowCollector r1 = r0.v
            java.lang.Throwable r2 = r0.f10167w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.u
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L23
            if (r4 == r6) goto L1f
            if (r4 != r5) goto L17
            yhm.o.b(r17)
            goto L67
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r17)
            goto L43
        L23:
            yhm.o.b(r17)
            boolean r4 = r2 instanceof java.util.concurrent.CancellationException
            if (r4 != 0) goto L6a
            r0.v = r1
            r0.f10167w = r7
            r0.u = r6
            ook.g r2 = xv.o.f309135a
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.invoke(r0)
            if (r2 != r3) goto L3b
            goto L40
        L3b:
            kotlin.Unit r2 = kotlin.Unit.f186387a
            goto L40
        L3e:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L40:
            if (r2 != r3) goto L43
            goto L66
        L43:
            aw.j0 r11 = r0.f10168x
            r11.getClass()
            aw.h0 r8 = new aw.h0
            r14 = 0
            long r9 = r0.f10169y
            com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings r12 = r0.A
            java.lang.String r13 = r0.B
            yw.n r15 = r0.z
            r8.<init>(r9, r11, r12, r13, r14, r15)
            vkm.f r2 = vkm.q.m(r8)
            r0.v = r7
            r0.f10167w = r7
            r0.u = r5
            java.lang.Object r1 = vkm.q.u(r1, r2, r0)
            if (r1 != r3) goto L67
        L66:
            return r3
        L67:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L6a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
