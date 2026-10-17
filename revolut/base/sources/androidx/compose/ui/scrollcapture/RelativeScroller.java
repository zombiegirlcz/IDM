package androidx.compose.ui.scrollcapture;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fim.a;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "viewportSize", "", "scrollBy", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "value", "scrollAmount", "getScrollAmount", "()F", "reset", "", "scrollRangeIntoView", "min", "max", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollRangeToCenter", "mapOffsetToViewport", "offset", "scrollTo", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RelativeScroller {
    private float scrollAmount;

    @NotNull
    private final Function2<Float, Continuation<? super Float>, Object> scrollBy;
    private final int viewportSize;

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1, reason: invalid class name */
    @d(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {324}, m = "scrollBy", v = 1)
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return RelativeScroller.this.scrollBy(BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i, @NotNull Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> function2) {
        this.viewportSize = i;
        this.scrollBy = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r6 = r4.scrollBy
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.scrollAmount
            float r6 = r6 + r5
            r4.scrollAmount = r6
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.scrollBy(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int offset) {
        return f.g(offset - rim.d.c(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = BitmapDescriptorFactory.HUE_RED;
    }

    public final Object scrollRangeIntoView(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        if (i > i2) {
            throw new IllegalArgumentException(a0.d.g(i, i2, "Expected min=", " ≤ max=").toString());
        }
        int i3 = i2 - i;
        int i5 = this.viewportSize;
        if (i3 > i5) {
            StringBuilder sbW = a0.d.w(i3, "Expected range (", ") to be ≤ viewportSize=");
            sbW.append(this.viewportSize);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        float f = i;
        float f4 = this.scrollAmount;
        if (f >= f4 && i2 <= i5 + f4) {
            return Unit.f186387a;
        }
        if (f >= f4) {
            i = i2 - i5;
        }
        Object objScrollTo = scrollTo(i, continuation);
        return objScrollTo == a.COROUTINE_SUSPENDED ? objScrollTo : Unit.f186387a;
    }

    public final Object scrollRangeToCenter(int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object objScrollTo;
        if (i > i2) {
            throw new IllegalArgumentException(a0.d.g(i, i2, "Expected min=", " ≤ max=").toString());
        }
        int i3 = i2 - i;
        int i5 = this.viewportSize;
        if (i3 <= i5) {
            float f = i;
            float f4 = this.scrollAmount;
            return ((f < f4 || ((float) i2) > f4 + ((float) i5)) && (objScrollTo = scrollTo((float) (((i3 / 2) + i) - (i5 / 2)), continuation)) == a.COROUTINE_SUSPENDED) ? objScrollTo : Unit.f186387a;
        }
        StringBuilder sbW = a0.d.w(i3, "Expected range (", ") to be ≤ viewportSize=");
        sbW.append(this.viewportSize);
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public final Object scrollTo(float f, @NotNull Continuation<? super Unit> continuation) {
        Object objScrollBy = scrollBy(f - this.scrollAmount, continuation);
        return objScrollBy == a.COROUTINE_SUSPENDED ? objScrollBy : Unit.f186387a;
    }
}
