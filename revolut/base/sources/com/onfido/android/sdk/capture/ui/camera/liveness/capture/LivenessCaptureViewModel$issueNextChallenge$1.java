package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$issueNextChallenge$1", f = "LivenessCaptureViewModel.kt", l = {Constants.TAG_SVPP_CHECKSUM}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LivenessCaptureViewModel$issueNextChallenge$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LivenessCaptureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessCaptureViewModel$issueNextChallenge$1(LivenessCaptureViewModel livenessCaptureViewModel, Continuation<? super LivenessCaptureViewModel$issueNextChallenge$1> continuation) {
        super(2, continuation);
        this.this$0 = livenessCaptureViewModel;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new LivenessCaptureViewModel$issueNextChallenge$1(this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            SharedFlow livenessControlButtonSharedFlow = this.this$0.livenessInteractor.getLivenessControlButtonSharedFlow();
            Intrinsics.i(livenessControlButtonSharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit>");
            Unit unit = Unit.f186387a;
            this.label = 1;
            if (((MutableSharedFlow) livenessControlButtonSharedFlow).emit(unit, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivenessCaptureViewModel$issueNextChallenge$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
