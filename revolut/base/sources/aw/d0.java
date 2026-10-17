package aw;

import androidx.camera.video.VideoRecordEvent;
import androidx.core.util.Consumer;
import androidx.lifecycle.LifecycleOwnerKt;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraXTakeVideoUseCase;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class d0 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10149a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10151c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d0(j0 j0Var, c0 c0Var, ProducerScope producerScope, long j2) {
        this.f10151c = j0Var;
        this.d = c0Var;
        this.e = producerScope;
        this.f10150b = j2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) throws Throwable {
        switch (this.f10149a) {
            case 0:
                j0 j0Var = (j0) this.f10151c;
                c0 c0Var = (c0) this.d;
                ProducerScope producerScope = (ProducerScope) this.e;
                long j2 = this.f10150b;
                VideoRecordEvent videoRecordEvent = (VideoRecordEvent) obj2;
                Continuation continuation = null;
                if (videoRecordEvent instanceof VideoRecordEvent.Start) {
                    if (j0Var.f.get() == c0Var && !c0Var.d) {
                        kw.d dVar = c0Var.f10144b;
                        if (dVar != null) {
                            dVar.f = true;
                        }
                        skm.e0.C(producerScope, LifecycleOwnerKt.getLifecycleScope(j0Var.f10172b).getF74819h(), null, new akb.s(producerScope, continuation, 24), 2);
                    }
                    break;
                } else if (!(videoRecordEvent instanceof VideoRecordEvent.Status)) {
                    if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                        skm.e0.C(producerScope, LifecycleOwnerKt.getLifecycleScope(j0Var.f10172b).getF74819h(), null, new f0(j0Var, c0Var, producerScope, videoRecordEvent, null), 2);
                    }
                    break;
                } else if (j0Var.f.get() == c0Var) {
                    skm.e0.C(producerScope, LifecycleOwnerKt.getLifecycleScope(j0Var.f10172b).getF74819h(), null, new e0(TimeUnit.NANOSECONDS.toMillis(((VideoRecordEvent.Status) videoRecordEvent).getRecordingStats().getRecordedDurationNanos()) / j2, j2, producerScope, null), 2);
                    break;
                }
                break;
            default:
                CameraXTakeVideoUseCase.invoke$lambda$1((CameraXTakeVideoUseCase) this.f10151c, this.f10150b, (File) this.d, (Function1) this.e, (VideoRecordEvent) obj2);
                break;
        }
    }

    public /* synthetic */ d0(CameraXTakeVideoUseCase cameraXTakeVideoUseCase, long j2, File file, Function1 function1) {
        this.f10151c = cameraXTakeVideoUseCase;
        this.f10150b = j2;
        this.d = file;
        this.e = function1;
    }
}
