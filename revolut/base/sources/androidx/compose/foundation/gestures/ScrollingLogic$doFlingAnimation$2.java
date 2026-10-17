package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {890}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ScrollingLogic$doFlingAnimation$2 extends gim.i implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-Velocity$-available$0, reason: not valid java name */
    final /* synthetic */ long f13$$v$c$androidxcomposeuiunitVelocity$available$0;
    final /* synthetic */ n0 $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, n0 n0Var, long j2, Continuation<? super ScrollingLogic$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = n0Var;
        this.f13$$v$c$androidxcomposeuiunitVelocity$available$0 = j2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.f13$$v$c$androidxcomposeuiunitVelocity$available$0, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj2;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ScrollingLogic scrollingLogic;
        n0 n0Var;
        ScrollingLogic scrollingLogic2;
        long j2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    if (Math.abs(pixels) != BitmapDescriptorFactory.HUE_RED && !((Boolean) scrollingLogic3.isScrollableNodeAttached.invoke()).booleanValue()) {
                        throw new FlingCancellationException();
                    }
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m792toFloatk4lQ0M(nestedScrollScope.mo759scrollByWithOverscrollOzD1aCk(scrollingLogic4.m790reverseIfNeededMKHz9U(scrollingLogic4.m793toOffsettuRUvjQ(pixels)), NestedScrollSource.INSTANCE.m2412getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.this$0;
            n0 n0Var2 = this.$result;
            long j3 = this.f13$$v$c$androidxcomposeuiunitVelocity$available$0;
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            long j5 = n0Var2.f186428a;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m787toFloatTH1AsA0(j3));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = n0Var2;
            this.J$0 = j5;
            this.label = 1;
            Object objPerformFling = flingBehavior.performFling(scrollScope, fReverseIfNeeded, this);
            if (objPerformFling == aVar) {
                return aVar;
            }
            n0Var = n0Var2;
            obj2 = objPerformFling;
            scrollingLogic2 = scrollingLogic;
            j2 = j5;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            n0Var = (n0) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            o.b(obj2);
        }
        n0Var.f186428a = scrollingLogic.m788updateQWom1Mo(j2, scrollingLogic2.reverseIfNeeded(((Number) obj2).floatValue()));
        return Unit.f186387a;
    }
}
