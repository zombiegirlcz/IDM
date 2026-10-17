package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gim.d;
import gim.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "", "animate", "<init>", "(Z)V", "", "snapToVisibleAndAnimate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Z", "getAnimate", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/AtomicReference;", "animationJob", "Ljava/util/concurrent/atomic/AtomicReference;", "", "<set-?>", "cursorAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CursorAnimationState {
    private final boolean animate;

    @NotNull
    private AtomicReference<Job> animationJob = new AtomicReference<>(null);

    /* JADX INFO: renamed from: cursorAlpha$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState cursorAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2, reason: invalid class name */
    @d(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        @d(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Job job2, CursorAnimationState cursorAnimationState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$oldJob = job2;
                this.this$0 = cursorAnimationState;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                return new AnonymousClass1(this.$oldJob, this.this$0, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
            
                if (skm.k0.b(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0017, B:36:0x0074, B:30:0x005d, B:33:0x0066, B:14:0x0025, B:15:0x0029, B:28:0x0057, B:29:0x005c, B:23:0x0041, B:25:0x004e), top: B:40:0x000d }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0071 -> B:36:0x0074). Please report as a decompilation issue!!! */
            @Override // gim.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    fim.a r0 = fim.a.COROUTINE_SUSPENDED
                    int r1 = r10.label
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r9) goto L2d
                    if (r1 == r8) goto L29
                    if (r1 == r7) goto L25
                    if (r1 != r6) goto L1d
                    yhm.o.b(r11)     // Catch: java.lang.Throwable -> L1b
                    goto L74
                L1b:
                    r11 = move-exception
                    goto L7a
                L1d:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L25:
                    yhm.o.b(r11)     // Catch: java.lang.Throwable -> L1b
                    goto L66
                L29:
                    yhm.o.b(r11)     // Catch: java.lang.Throwable -> L1b
                    goto L57
                L2d:
                    yhm.o.b(r11)
                    goto L41
                L31:
                    yhm.o.b(r11)
                    kotlinx.coroutines.Job r11 = r10.$oldJob
                    if (r11 == 0) goto L41
                    r10.label = r9
                    java.lang.Object r11 = skm.e0.m(r11, r10)
                    if (r11 != r0) goto L41
                    goto L73
                L41:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1b
                    if (r11 != 0) goto L5d
                    r10.label = r8     // Catch: java.lang.Throwable -> L1b
                    fim.a r11 = skm.k0.a(r10)     // Catch: java.lang.Throwable -> L1b
                    if (r11 != r0) goto L57
                    goto L73
                L57:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1b
                    r11.<init>()     // Catch: java.lang.Throwable -> L1b
                    throw r11     // Catch: java.lang.Throwable -> L1b
                L5d:
                    r10.label = r7     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r11 = skm.k0.b(r3, r10)     // Catch: java.lang.Throwable -> L1b
                    if (r11 != r0) goto L66
                    goto L73
                L66:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r2)     // Catch: java.lang.Throwable -> L1b
                    r10.label = r6     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r11 = skm.k0.b(r3, r10)     // Catch: java.lang.Throwable -> L1b
                    if (r11 != r0) goto L74
                L73:
                    return r0
                L74:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1b
                    goto L5d
                L7a:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CursorAnimationState.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            boolean z;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Job job2 = (Job) CursorAnimationState.this.animationJob.getAndSet(null);
            AtomicReference atomicReference = CursorAnimationState.this.animationJob;
            a2 a2VarC = e0.C(coroutineScope, null, null, new AnonymousClass1(job2, CursorAnimationState.this, null), 3);
            while (true) {
                if (atomicReference.compareAndSet(null, a2VarC)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f) {
        this.cursorAlpha.setFloatValue(f);
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(@NotNull Continuation<? super Unit> continuation) {
        Object objO = e0.o(new AnonymousClass2(null), continuation);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }
}
