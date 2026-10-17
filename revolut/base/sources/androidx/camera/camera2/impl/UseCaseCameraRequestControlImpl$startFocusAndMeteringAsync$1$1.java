package androidx.camera.camera2.impl;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.core.Logger;
import fim.a;
import gim.d;
import gim.i;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1", f = "UseCaseCameraRequestControl.kt", l = {749, 475}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "<anonymous>", "()Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 extends i implements Function1<Continuation<? super g0>, Object> {
    final /* synthetic */ Lock3ABehavior $aeLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ Lock3ABehavior $afLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ AeMode $afTriggerStartAeMode;
    final /* synthetic */ Lock3ABehavior $awbLockBehavior;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    final /* synthetic */ long $timeLimitNs;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, long j2, Continuation<? super UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1> continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
        this.$aeLockBehavior = lock3ABehavior;
        this.$afLockBehavior = lock3ABehavior2;
        this.$awbLockBehavior = lock3ABehavior3;
        this.$afTriggerStartAeMode = aeMode;
        this.$timeLimitNs = j2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this.this$0, this.$aeRegions, this.$afRegions, this.$awbRegions, this.$aeLockBehavior, this.$afLockBehavior, this.$awbLockBehavior, this.$afTriggerStartAeMode, this.$timeLimitNs, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Lock3ABehavior lock3ABehavior;
        Object objAcquireSession;
        Lock3ABehavior lock3ABehavior2;
        List<MeteringRectangle> list;
        AeMode aeMode;
        List<MeteringRectangle> list2;
        Lock3ABehavior lock3ABehavior3;
        List<MeteringRectangle> list3;
        long j2;
        AutoCloseable autoCloseable;
        CameraGraph.Session session;
        Throwable th10;
        Object objM178lock3AtS25XM$default;
        AutoCloseable autoCloseable2;
        Throwable th11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        o.b(obj2);
                        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                        if (Logger.isDebugEnabled("CXCP")) {
                            String unused = Camera2Logger.TRUNCATED_TAG;
                        }
                        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
                        List<MeteringRectangle> list4 = this.$aeRegions;
                        List<MeteringRectangle> list5 = this.$afRegions;
                        List<MeteringRectangle> list6 = this.$awbRegions;
                        lock3ABehavior = this.$aeLockBehavior;
                        Lock3ABehavior lock3ABehavior4 = this.$afLockBehavior;
                        Lock3ABehavior lock3ABehavior5 = this.$awbLockBehavior;
                        AeMode aeMode2 = this.$afTriggerStartAeMode;
                        long j3 = this.$timeLimitNs;
                        CameraGraph graph = useCaseCameraRequestControlImpl.useCaseGraphContext.getGraph();
                        this.L$0 = list4;
                        this.L$1 = list5;
                        this.L$2 = list6;
                        this.L$3 = lock3ABehavior;
                        this.L$4 = lock3ABehavior4;
                        this.L$5 = lock3ABehavior5;
                        this.L$6 = aeMode2;
                        this.J$0 = j3;
                        this.label = 1;
                        objAcquireSession = graph.acquireSession(this);
                        if (objAcquireSession == aVar) {
                            return aVar;
                        }
                        lock3ABehavior2 = lock3ABehavior5;
                        list = list4;
                        aeMode = aeMode2;
                        list2 = list5;
                        lock3ABehavior3 = lock3ABehavior4;
                        list3 = list6;
                        j2 = j3;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autoCloseable = (AutoCloseable) this.L$0;
                            try {
                                o.b(obj2);
                                autoCloseable2 = autoCloseable;
                                th10 = null;
                                objM178lock3AtS25XM$default = obj2;
                                try {
                                    return (g0) objM178lock3AtS25XM$default;
                                } catch (Throwable th12) {
                                    th11 = th12;
                                    autoCloseable = autoCloseable;
                                    try {
                                        throw th11;
                                    } finally {
                                        mra.d.l(autoCloseable, th11);
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                th11 = th;
                                throw th11;
                            }
                        }
                        long j5 = this.J$0;
                        AeMode aeMode3 = (AeMode) this.L$6;
                        Lock3ABehavior lock3ABehavior6 = (Lock3ABehavior) this.L$5;
                        Lock3ABehavior lock3ABehavior7 = (Lock3ABehavior) this.L$4;
                        lock3ABehavior = (Lock3ABehavior) this.L$3;
                        List<MeteringRectangle> list7 = (List) this.L$2;
                        List<MeteringRectangle> list8 = (List) this.L$1;
                        List<MeteringRectangle> list9 = (List) this.L$0;
                        o.b(obj2);
                        lock3ABehavior3 = lock3ABehavior7;
                        list3 = list7;
                        j2 = j5;
                        list2 = list8;
                        list = list9;
                        aeMode = aeMode3;
                        lock3ABehavior2 = lock3ABehavior6;
                        objAcquireSession = obj2;
                    }
                    objM178lock3AtS25XM$default = CameraGraph.Session.m178lock3AtS25XM$default(session, null, null, null, list, list2, list3, lock3ABehavior, lock3ABehavior3, lock3ABehavior2, aeMode, null, null, 0, j2, j2, this, 7175, null);
                    if (objM178lock3AtS25XM$default != aVar) {
                        autoCloseable2 = autoCloseable;
                        return (g0) objM178lock3AtS25XM$default;
                    }
                    return aVar;
                } catch (Throwable th14) {
                    th = th14;
                    autoCloseable = autoCloseable;
                    th11 = th;
                    throw th11;
                }
                session = (CameraGraph.Session) autoCloseable;
                this.L$0 = autoCloseable;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 2;
                th10 = null;
            } catch (Throwable th15) {
                th = th15;
            }
            autoCloseable = (AutoCloseable) objAcquireSession;
        } catch (CancellationException e) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
            }
            return UseCaseCameraRequestControlImpl.submitFailedResult;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super g0> continuation) {
        return ((UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
