package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import fim.a;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$update3A$1", f = "CameraGraphImpl.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class CameraGraphImpl$update3A$1 extends i implements Function2<CoroutineScope, Continuation<? super g0>, Object> {
    final /* synthetic */ AeMode $aeMode;
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ AfMode $afMode;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ AwbMode $awbMode;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    int label;
    final /* synthetic */ CameraGraphImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraGraphImpl$update3A$1(CameraGraphImpl cameraGraphImpl, AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Continuation<? super CameraGraphImpl$update3A$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraGraphImpl;
        this.$aeMode = aeMode;
        this.$afMode = afMode;
        this.$awbMode = awbMode;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CameraGraphImpl$update3A$1(this.this$0, this.$aeMode, this.$afMode, this.$awbMode, this.$aeRegions, this.$afRegions, this.$awbRegions, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        return Controller3A.m451update3A169HPGg$default(this.this$0.controller3A, this.$aeMode, this.$afMode, this.$awbMode, null, this.$aeRegions, this.$afRegions, this.$awbRegions, 8, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super g0> continuation) {
        return ((CameraGraphImpl$update3A$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
