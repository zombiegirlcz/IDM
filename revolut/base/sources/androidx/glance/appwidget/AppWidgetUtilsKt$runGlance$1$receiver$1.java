package androidx.glance.appwidget;

import androidx.glance.appwidget.ContentReceiver;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "", "content", "", "<anonymous>", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
public final class AppWidgetUtilsKt$runGlance$1$receiver$1 implements ContentReceiver {
    final /* synthetic */ ProducerScope $$this$channelFlow;
    final /* synthetic */ AtomicReference<CancellableContinuation> $contentCoroutine;

    public AppWidgetUtilsKt$runGlance$1$receiver$1(AtomicReference<CancellableContinuation> atomicReference, ProducerScope producerScope) {
        this.$contentCoroutine = atomicReference;
        this.$$this$channelFlow = producerScope;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) ContentReceiver.DefaultImpls.fold(this, r2, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull f fVar) {
        return (E) ContentReceiver.DefaultImpls.get(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull f fVar) {
        return ContentReceiver.DefaultImpls.minusKey(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return ContentReceiver.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.appwidget.ContentReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object provideContent(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 r0 = (androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 r0 = new androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2b:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            java.lang.Object r7 = r0.L$1
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            yhm.o.b(r8)
            goto L7b
        L3b:
            yhm.o.b(r8)
            java.util.concurrent.atomic.AtomicReference<kotlinx.coroutines.CancellableContinuation> r8 = r6.$contentCoroutine
            kotlinx.coroutines.channels.ProducerScope r2 = r6.$$this$channelFlow
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r2
            r0.label = r3
            skm.l r4 = new skm.l
            kotlin.coroutines.Continuation r5 = fim.h.b(r0)
            r4.<init>(r3, r5)
            r4.u()
            androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$2$1 r3 = new androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$2$1
            r3.<init>(r2)
            r4.r(r3)
            java.lang.Object r8 = r8.getAndSet(r4)
            kotlinx.coroutines.CancellableContinuation r8 = (kotlinx.coroutines.CancellableContinuation) r8
            if (r8 == 0) goto L6a
            r3 = 0
            r8.a(r3)
        L6a:
            r2.mo3647trySendJP2dKIU(r7)
            java.lang.Object r7 = r4.t()
            if (r7 != r1) goto L78
            java.lang.String r8 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
        L78:
            if (r7 != r1) goto L7b
            return r1
        L7b:
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1.provideContent(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
