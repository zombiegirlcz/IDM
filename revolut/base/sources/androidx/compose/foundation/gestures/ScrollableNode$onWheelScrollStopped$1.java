package androidx.compose.foundation.gestures;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ScrollableNode$onWheelScrollStopped$1 extends gim.i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-Velocity$-velocity$0, reason: not valid java name */
    final /* synthetic */ long f12$$v$c$androidxcomposeuiunitVelocity$velocity$0;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onWheelScrollStopped$1(ScrollableNode scrollableNode, long j2, Continuation<? super ScrollableNode$onWheelScrollStopped$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollableNode;
        this.f12$$v$c$androidxcomposeuiunitVelocity$velocity$0 = j2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new ScrollableNode$onWheelScrollStopped$1(this.this$0, this.f12$$v$c$androidxcomposeuiunitVelocity$velocity$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
            long j2 = this.f12$$v$c$androidxcomposeuiunitVelocity$velocity$0;
            this.label = 1;
            if (scrollingLogic.m789onScrollStoppedBMRW4eQ(j2, true, this) == aVar) {
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScrollableNode$onWheelScrollStopped$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
