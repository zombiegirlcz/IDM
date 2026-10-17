package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Config;
import fim.a;
import gim.d;
import gim.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.g0;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1", f = "UseCaseCameraRequestControl.kt", l = {441}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lskm/g0;", "", "<anonymous>", "()Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1 extends i implements Function1<Continuation<? super g0>, Object> {
    final /* synthetic */ Config $config;
    final /* synthetic */ Map<String, Object> $tags;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, Config config, Map<String, ? extends Object> map, Continuation<? super UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1> continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$config = config;
        this.$tags = map;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(this.this$0, this.$config, this.$tags, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        this.this$0.infoBundleMap.put(UseCaseCameraRequestControl.Type.CAMERA2_CAMERA_CONTROL, new UseCaseCameraRequestControlImpl.InfoBundle(UseCaseCameraRequestControlImpl.INSTANCE.extractCamera2ImplConfigBuilder(this.$config), r0.z(this.$tags), null, null, 12, null));
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
        UseCaseCameraRequestControlImpl.InfoBundle infoBundleMerge = useCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl.infoBundleMap);
        this.label = 1;
        Object objUpdateCameraStateAsync$default = UseCaseCameraRequestControlImpl.updateCameraStateAsync$default(useCaseCameraRequestControlImpl, infoBundleMerge, null, this, 1, null);
        return objUpdateCameraStateAsync$default == aVar ? aVar : objUpdateCameraStateAsync$default;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super g0> continuation) {
        return ((UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
