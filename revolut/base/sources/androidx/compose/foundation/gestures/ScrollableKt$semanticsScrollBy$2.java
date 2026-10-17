package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.m0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1119}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ScrollableKt$semanticsScrollBy$2 extends gim.i implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f11$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ m0 $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j2, m0 m0Var, Continuation<? super ScrollableKt$semanticsScrollBy$2> continuation) {
        super(2, continuation);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.f11$$v$c$androidxcomposeuigeometryOffset$offset$0 = j2;
        this.$previousValue = m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(m0 m0Var, ScrollingLogic scrollingLogic, NestedScrollScope nestedScrollScope, float f, float f4) {
        m0Var.f186427a += scrollingLogic.reverseIfNeeded(scrollingLogic.m792toFloatk4lQ0M(nestedScrollScope.mo758scrollByOzD1aCk(scrollingLogic.m793toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f - m0Var.f186427a)), NestedScrollSource.INSTANCE.m2413getUserInputWNlRxjI())));
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.f11$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$previousValue, continuation);
        scrollableKt$semanticsScrollBy$2.L$0 = obj2;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
        return ((ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            float fM792toFloatk4lQ0M = this.$this_semanticsScrollBy.m792toFloatk4lQ0M(this.f11$$v$c$androidxcomposeuigeometryOffset$offset$0);
            f fVar = new f(this.$previousValue, 1, this.$this_semanticsScrollBy, nestedScrollScope);
            this.label = 1;
            if (SuspendAnimationKt.animate$default(BitmapDescriptorFactory.HUE_RED, fM792toFloatk4lQ0M, BitmapDescriptorFactory.HUE_RED, null, fVar, this, 12, null) == aVar) {
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
}
