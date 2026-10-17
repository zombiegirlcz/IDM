package androidx.camera.camera2.adapter;

import androidx.camera.core.CameraIdentifier;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import fim.a;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$fetchData$1$1", f = "PipeCameraPresenceSource.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class PipeCameraPresenceSource$fetchData$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CallbackToFutureAdapter.Completer<List<CameraIdentifier>> $completer;
    int label;
    final /* synthetic */ PipeCameraPresenceSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipeCameraPresenceSource$fetchData$1$1(PipeCameraPresenceSource pipeCameraPresenceSource, CallbackToFutureAdapter.Completer<List<CameraIdentifier>> completer, Continuation<? super PipeCameraPresenceSource$fetchData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = pipeCameraPresenceSource;
        this.$completer = completer;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new PipeCameraPresenceSource$fetchData$1$1(this.this$0, this.$completer, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        try {
            String[] cameraIdList = this.this$0.cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                CameraIdentifier cameraIdentifierCreate$default = null;
                try {
                    Intrinsics.h(str);
                    cameraIdentifierCreate$default = CameraIdentifier.Factory.create$default(str, null, null, 6, null);
                } catch (IllegalArgumentException e) {
                    String str2 = "Could not create CameraIdentifier for system ID: " + str;
                }
                if (cameraIdentifierCreate$default != null) {
                    arrayList.add(cameraIdentifierCreate$default);
                }
            }
            String str3 = "[FetchData] Refreshed camera list from hardware: " + arrayList;
            this.this$0.updateData(arrayList);
            this.$completer.set(arrayList);
        } catch (Exception e2) {
            this.this$0.updateError(e2);
            this.$completer.setException(e2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PipeCameraPresenceSource$fetchData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
