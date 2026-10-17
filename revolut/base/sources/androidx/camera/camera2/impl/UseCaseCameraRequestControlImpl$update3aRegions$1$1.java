package androidx.camera.camera2.impl;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph;
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
import zhm.p;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1", f = "UseCaseCameraRequestControl.kt", l = {749}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "<anonymous>", "()Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraRequestControlImpl$update3aRegions$1$1 extends i implements Function1<Continuation<? super g0>, Object> {
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$update3aRegions$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Continuation<? super UseCaseCameraRequestControlImpl$update3aRegions$1$1> continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UseCaseCameraRequestControlImpl$update3aRegions$1$1(this.this$0, this.$aeRegions, this.$afRegions, this.$awbRegions, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        List<MeteringRectangle> listC;
        List<MeteringRectangle> listC2;
        List<MeteringRectangle> listC3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                o.b(obj2);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
                List<MeteringRectangle> list = this.$aeRegions;
                List<MeteringRectangle> list2 = this.$afRegions;
                List<MeteringRectangle> list3 = this.$awbRegions;
                CameraGraph graph = useCaseCameraRequestControlImpl.useCaseGraphContext.getGraph();
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.label = 1;
                obj2 = graph.acquireSession(this);
                if (obj2 == aVar) {
                    return aVar;
                }
                listC = list;
                listC2 = list2;
                listC3 = list3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                listC3 = (List) this.L$2;
                listC2 = (List) this.L$1;
                listC = (List) this.L$0;
                o.b(obj2);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj2;
            try {
                CameraGraph.Session session = (CameraGraph.Session) autoCloseable;
                if (listC == null) {
                    listC = p.c(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                List<MeteringRectangle> list4 = listC;
                if (listC2 == null) {
                    listC2 = p.c(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                List<MeteringRectangle> list5 = listC2;
                if (listC3 == null) {
                    listC3 = p.c(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                g0 g0VarM118update3AydBZfZg$default = CameraControls3A.m118update3AydBZfZg$default(session, null, null, null, list4, list5, listC3, 7, null);
                mra.d.l(autoCloseable, null);
                return g0VarM118update3AydBZfZg$default;
            } finally {
            }
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
        return ((UseCaseCameraRequestControlImpl$update3aRegions$1$1) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
