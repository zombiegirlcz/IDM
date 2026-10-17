package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001b\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0018\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001b\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001e\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010 \u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u001dJ\u0011\u0010#\u001a\u00020!*\u00020\u0014¢\u0006\u0004\b\"\u0010\u0017J\u0011\u0010$\u001a\u00020\u0014*\u00020\u0014¢\u0006\u0004\b$\u0010%J\u0011\u0010$\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b&\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u001aJ \u0010/\u001a\u00020,2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\nH\u0086@¢\u0006\u0004\b-\u0010.J\u0018\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020!H\u0096@¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020\n¢\u0006\u0004\b4\u00105J>\u0010'\u001a\u00020,2\b\b\u0002\u00107\u001a\u0002062\"\u0010<\u001a\u001e\b\u0001\u0012\u0004\u0012\u000209\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0:\u0012\u0006\u0012\u0004\u0018\u00010;08H\u0086@¢\u0006\u0004\b'\u0010=J?\u0010>\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\n¢\u0006\u0004\b@\u00105J\u0013\u0010\u001e\u001a\u00020\u0014*\u00020!H\u0002¢\u0006\u0004\bA\u0010\u001dJ\u0013\u0010C\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\bB\u0010\u001aJ\u001b\u0010>\u001a\u00020!*\u00020!2\u0006\u0010D\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010M\u001a\u00020\u0015*\u00020G2\u0006\u0010H\u001a\u00020\u00152\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\bN\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010WR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010YR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010ZR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010[R$\u0010]\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b]\u00105R\u0016\u0010^\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR \u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u00105¨\u0006j"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollLogic;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;", "onScrollChangedDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "(J)J", "singleAxisOffset", "toFloat-k-4lQ0M", "(J)F", "toFloat", "toSingleAxisDeltaFromAngle-k-4lQ0M", "toSingleAxisDeltaFromAngle", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "reverseIfNeeded", "(F)F", "reverseIfNeeded-MK-Hz9U", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "initialVelocity", "isMouseWheel", "", "onScrollStopped-BMRW4eQ", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onScrollStopped", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation", "shouldScrollImmediately", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "", "block", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "isVertical", "toFloat-TH1AsA0", "singleAxisVelocity-AH228Gc", "singleAxisVelocity", "newValue", "update-QWom1Mo", "(JF)J", "Landroidx/compose/foundation/gestures/ScrollScope;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "performScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "performScroll", "dispatchRawDelta-MK-Hz9U", "dispatchRawDelta", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/Orientation;", "Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;", "Lkotlin/jvm/functions/Function0;", "value", "isFlinging", "latestScrollSource", "I", "outerStateScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "androidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1", "nestedScrollScope", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "Lkotlin/Function1;", "performScrollForOverscroll", "Lkotlin/jvm/functions/Function1;", "getShouldDispatchOverscroll", "shouldDispatchOverscroll", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollingLogic implements ScrollLogic {

    @NotNull
    private FlingBehavior flingBehavior;
    private boolean isFlinging;

    @NotNull
    private final Function0<Boolean> isScrollableNodeAttached;

    @NotNull
    private NestedScrollDispatcher nestedScrollDispatcher;

    @NotNull
    private OnScrollChangedDispatcher onScrollChangedDispatcher;

    @NotNull
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;

    @NotNull
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.INSTANCE.m2413getUserInputWNlRxjI();

    @NotNull
    private ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;

    @NotNull
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* JADX INFO: renamed from: scrollBy-OzD1aCk */
        public long mo758scrollByOzD1aCk(long offset, int source) {
            return this.this$0.m785performScroll3eAAhYA(this.this$0.outerStateScope, offset, source);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* JADX INFO: renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo759scrollByWithOverscrollOzD1aCk(long offset, int source) {
            this.this$0.latestScrollSource = source;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect != null && this.this$0.getShouldDispatchOverscroll()) {
                return overscrollEffect.mo607applyToScrollRhakbz0(offset, this.this$0.latestScrollSource, this.this$0.performScrollForOverscroll);
            }
            return this.this$0.m785performScroll3eAAhYA(this.this$0.outerStateScope, offset, source);
        }
    };

    @NotNull
    private final Function1<Offset, Offset> performScrollForOverscroll = new g1.b(this, 3);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2, reason: invalid class name */
    @gim.d(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {914}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends gim.i implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<NestedScrollScope, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ScrollingLogic.this.new AnonymousClass2(this.$block, continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                ScrollingLogic.this.outerStateScope = (ScrollScope) this.L$0;
                Function2<NestedScrollScope, Continuation<? super Unit>, Object> function2 = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (function2.invoke(scrollingLogic$nestedScrollScope$1, this) == aVar) {
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

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(@NotNull ScrollableState scrollableState, OverscrollEffect overscrollEffect, @NotNull FlingBehavior flingBehavior, @NotNull Orientation orientation, boolean z, @NotNull NestedScrollDispatcher nestedScrollDispatcher, @NotNull OnScrollChangedDispatcher onScrollChangedDispatcher, @NotNull Function0<Boolean> function0) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.onScrollChangedDispatcher = onScrollChangedDispatcher;
        this.isScrollableNodeAttached = function0;
    }

    /* JADX INFO: renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m784dispatchRawDeltaMKHz9U(long scroll) {
        return m793toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m792toFloatk4lQ0M(scroll)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m785performScroll3eAAhYA(ScrollScope scrollScope, long j2, int i) {
        long jM2408dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m2408dispatchPreScrollOzD1aCk(j2, i);
        long jM1838minusMKHz9U = Offset.m1838minusMKHz9U(j2, jM2408dispatchPreScrollOzD1aCk);
        long jM790reverseIfNeededMKHz9U = m790reverseIfNeededMKHz9U(m793toOffsettuRUvjQ(scrollScope.scrollBy(m792toFloatk4lQ0M(m790reverseIfNeededMKHz9U(m791singleAxisOffsetMKHz9U(jM1838minusMKHz9U))))));
        this.onScrollChangedDispatcher.mo761dispatchScrollDeltaInfok4lQ0M(jM790reverseIfNeededMKHz9U);
        return Offset.m1839plusMKHz9U(Offset.m1839plusMKHz9U(jM2408dispatchPreScrollOzD1aCk, jM790reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m2406dispatchPostScrollDzOQY0M(jM790reverseIfNeededMKHz9U, Offset.m1838minusMKHz9U(jM1838minusMKHz9U, jM790reverseIfNeededMKHz9U), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset performScrollForOverscroll$lambda$0(ScrollingLogic scrollingLogic, Offset offset) {
        return Offset.m1826boximpl(scrollingLogic.m785performScroll3eAAhYA(scrollingLogic.outerStateScope, offset.getPackedValue(), scrollingLogic.latestScrollSource));
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m786singleAxisVelocityAH228Gc(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m3394copyOhffZ5M$default(j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null) : Velocity.m3394copyOhffZ5M$default(j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m787toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m3397getXimpl(j2) : Velocity.m3398getYimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m788updateQWom1Mo(long j2, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m3394copyOhffZ5M$default(j2, f, BitmapDescriptorFactory.HUE_RED, 2, null) : Velocity.m3394copyOhffZ5M$default(j2, BitmapDescriptorFactory.HUE_RED, f, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo772doFlingAnimationQWom1Mo(long r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.L$0
            kotlin.jvm.internal.n0 r12 = (kotlin.jvm.internal.n0) r12
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2d
            r6 = r11
            goto L5b
        L2d:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L6a
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            yhm.o.b(r14)
            kotlin.jvm.internal.n0 r7 = new kotlin.jvm.internal.n0
            r7.<init>()
            r7.f186428a = r12
            r11.isFlinging = r4
            androidx.compose.foundation.MutatePriority r14 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L67
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2     // Catch: java.lang.Throwable -> L67
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L64
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L64
            r0.label = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r12 = r11.scroll(r14, r5, r0)     // Catch: java.lang.Throwable -> L64
            if (r12 != r1) goto L5a
            return r1
        L5a:
            r12 = r7
        L5b:
            r6.isFlinging = r3
            long r12 = r12.f186428a
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.m3391boximpl(r12)
            return r12
        L64:
            r0 = move-exception
        L65:
            r12 = r0
            goto L6a
        L67:
            r0 = move-exception
            r6 = r11
            goto L65
        L6a:
            r6.isFlinging = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo772doFlingAnimationQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* JADX INFO: renamed from: isFlinging, reason: from getter */
    public boolean getIsFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    /* JADX INFO: renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m789onScrollStoppedBMRW4eQ(long j2, boolean z, @NotNull Continuation<? super Unit> continuation) {
        if (z && !ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior)) {
            return Unit.f186387a;
        }
        long jM786singleAxisVelocityAH228Gc = m786singleAxisVelocityAH228Gc(j2);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m3391boximpl(jM786singleAxisVelocityAH228Gc), continuation);
            return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
        }
        Object objMo606applyToFlingBMRW4eQ = overscrollEffect.mo606applyToFlingBMRW4eQ(jM786singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, continuation);
        return objMo606applyToFlingBMRW4eQ == fim.a.COROUTINE_SUSPENDED ? objMo606applyToFlingBMRW4eQ : Unit.f186387a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U */
    public long mo773performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m1845getZeroF1C5BW0() : m784dispatchRawDeltaMKHz9U(scroll);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m790reverseIfNeededMKHz9U(long j2) {
        return this.reverseDirection ? Offset.m1840timestuRUvjQ(j2, -1.0f) : j2;
    }

    public final Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new AnonymousClass2(function2, null), continuation);
        return objScroll == fim.a.COROUTINE_SUSPENDED ? objScroll : Unit.f186387a;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m791singleAxisOffsetMKHz9U(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m1829copydBAh8RU$default(j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null) : Offset.m1829copydBAh8RU$default(j2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m792toFloatk4lQ0M(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j2 >> 32 : j2 & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m793toOffsettuRUvjQ(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return Offset.INSTANCE.m1845getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & BodyPartID.bodyIdMax));
        }
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(f)) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M, reason: not valid java name */
    public final float m794toSingleAxisDeltaFromAnglek4lQ0M(long j2) {
        int i = (int) (BodyPartID.bodyIdMax & j2);
        int i2 = (int) (j2 >> 32);
        return ((double) ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat(i)), (double) Math.abs(Float.intBitsToFloat(i2))))) >= 0.7853981633974483d ? this.orientation == Orientation.Vertical ? Float.intBitsToFloat(i) : BitmapDescriptorFactory.HUE_RED : this.orientation == Orientation.Horizontal ? Float.intBitsToFloat(i2) : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m795toVelocityadjELrA(float f) {
        return f == BitmapDescriptorFactory.HUE_RED ? Velocity.INSTANCE.m3405getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, BitmapDescriptorFactory.HUE_RED) : VelocityKt.Velocity(BitmapDescriptorFactory.HUE_RED, f);
    }

    public final boolean update(@NotNull ScrollableState scrollableState, @NotNull Orientation orientation, OverscrollEffect overscrollEffect, boolean reverseDirection, @NotNull FlingBehavior flingBehavior, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z;
        boolean z3 = true;
        if (Intrinsics.f(this.scrollableState, scrollableState)) {
            z = false;
        } else {
            this.scrollableState = scrollableState;
            z = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z3 = z;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z3;
    }
}
