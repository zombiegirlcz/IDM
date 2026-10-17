package kv;

import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ CameraCaptureSettings A;
    public String u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f189893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f189894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f189895y;
    public final /* synthetic */ FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, FlowCollector flowCollector, CameraCaptureSettings cameraCaptureSettings, Continuation continuation) {
        super(1, continuation);
        this.f189895y = pVar;
        this.z = flowCollector;
        this.A = cameraCaptureSettings;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f189895y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r14 == r0) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.f189894x
            r2 = 2
            r3 = 1
            com.revolut.camerakit.client.api.models.CameraCaptureSettings r4 = r13.A
            kv.p r5 = r13.f189895y
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r14)
            r12 = r13
            goto L98
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            kv.p r1 = r13.f189893w
            kotlinx.coroutines.flow.FlowCollector r3 = r13.v
            java.lang.String r6 = r13.u
            yhm.o.b(r14)
            r12 = r13
            goto L56
        L29:
            yhm.o.b(r14)
            yw.h r14 = r5.f189907c
            java.lang.String r6 = com.revolut.camerakit.core.settings.a.a(r14)
            xv.c r7 = r5.f189905a
            r14 = r4
            com.revolut.camerakit.client.api.models.CameraCaptureSettings$Video r14 = (com.revolut.camerakit.client.api.models.CameraCaptureSettings.Video) r14
            com.revolut.camerakit.client.api.models.VideoDuration r1 = r14.f50701a
            long r8 = r1.getF50734a()
            yw.n r10 = r14.f50704g
            com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings r11 = r14.f50705h
            r13.u = r6
            kotlinx.coroutines.flow.FlowCollector r14 = r13.z
            r13.v = r14
            r13.f189893w = r5
            r13.f189894x = r3
            r12 = r13
            java.lang.Object r1 = r7.d(r8, r10, r11, r12)
            if (r1 != r0) goto L53
            goto L97
        L53:
            r3 = r14
            r14 = r1
            r1 = r5
        L56:
            kotlinx.coroutines.flow.Flow r14 = (kotlinx.coroutines.flow.Flow) r14
            khg.s r7 = new khg.s
            r8 = 11
            r7.<init>(r5, r8, r4, r6)
            r1.getClass()
            r1 = 0
            r12.u = r1
            r12.v = r1
            r12.f189893w = r1
            r12.f189894x = r2
            vkm.q.w(r3)
            klj.e r1 = new klj.e
            r2 = 17
            r1.<init>(r3, r2)
            cxe.t r2 = new cxe.t
            r3 = 8
            r2.<init>(r1, r7, r3)
            java.lang.Object r14 = r14.collect(r2, r13)
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r14 != r1) goto L85
            goto L87
        L85:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L87:
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r14 != r1) goto L8c
            goto L8e
        L8c:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L8e:
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r14 != r1) goto L93
            goto L95
        L93:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L95:
            if (r14 != r0) goto L98
        L97:
            return r0
        L98:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
