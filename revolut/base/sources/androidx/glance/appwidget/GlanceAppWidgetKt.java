package androidx.glance.appwidget;

import com.youTransactor.uCube.rpc.Constants;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\t\u001a\u00020\b*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidget;", "Landroid/content/Context;", "context", "", "updateAll", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "content", "", "provideContent", "(Landroidx/glance/appwidget/GlanceAppWidget;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class GlanceAppWidgetKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetKt$provideContent$1, reason: invalid class name */
    @d(c = "androidx.glance.appwidget.GlanceAppWidgetKt", f = "GlanceAppWidget.kt", l = {Constants.TAG_USB_CAPABILITY}, m = "provideContent")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
            return GlanceAppWidgetKt.provideContent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetKt$updateAll$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.glance.appwidget.GlanceAppWidgetKt", f = "GlanceAppWidget.kt", l = {200, 200}, m = "updateAll")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19371 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19371(Continuation<? super C19371> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceAppWidgetKt.updateAll(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object provideContent(@org.jetbrains.annotations.NotNull androidx.glance.appwidget.GlanceAppWidget r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r3 = r5 instanceof androidx.glance.appwidget.GlanceAppWidgetKt.AnonymousClass1
            if (r3 == 0) goto L13
            r3 = r5
            androidx.glance.appwidget.GlanceAppWidgetKt$provideContent$1 r3 = (androidx.glance.appwidget.GlanceAppWidgetKt.AnonymousClass1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r3.label = r0
            goto L18
        L13:
            androidx.glance.appwidget.GlanceAppWidgetKt$provideContent$1 r3 = new androidx.glance.appwidget.GlanceAppWidgetKt$provideContent$1
            r3.<init>(r5)
        L18:
            java.lang.Object r5 = r3.result
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2b:
            yhm.o.b(r5)
            goto L49
        L2f:
            yhm.o.b(r5)
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            androidx.glance.appwidget.ContentReceiver$Key r1 = androidx.glance.appwidget.ContentReceiver.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r1)
            androidx.glance.appwidget.ContentReceiver r5 = (androidx.glance.appwidget.ContentReceiver) r5
            if (r5 == 0) goto L4f
            r3.label = r2
            java.lang.Object r3 = r5.provideContent(r4, r3)
            if (r3 != r0) goto L49
            return r0
        L49:
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        L4f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetKt.provideContent(androidx.glance.appwidget.GlanceAppWidget, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object updateAll(@org.jetbrains.annotations.NotNull androidx.glance.appwidget.GlanceAppWidget r5, @org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof androidx.glance.appwidget.GlanceAppWidgetKt.C19371
            if (r0 == 0) goto L13
            r0 = r7
            androidx.glance.appwidget.GlanceAppWidgetKt$updateAll$1 r0 = (androidx.glance.appwidget.GlanceAppWidgetKt.C19371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.appwidget.GlanceAppWidgetKt$updateAll$1 r0 = new androidx.glance.appwidget.GlanceAppWidgetKt$updateAll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r2 = r0.L$0
            androidx.glance.appwidget.GlanceAppWidget r2 = (androidx.glance.appwidget.GlanceAppWidget) r2
            yhm.o.b(r7)
            goto L6c
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.L$0
            androidx.glance.appwidget.GlanceAppWidget r5 = (androidx.glance.appwidget.GlanceAppWidget) r5
            yhm.o.b(r7)
            goto L64
        L4b:
            yhm.o.b(r7)
            androidx.glance.appwidget.GlanceAppWidgetManager r7 = new androidx.glance.appwidget.GlanceAppWidgetManager
            r7.<init>(r6)
            java.lang.Class r2 = r5.getClass()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getGlanceIds(r2, r0)
            if (r7 != r1) goto L64
            goto L86
        L64:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r5
            r5 = r7
        L6c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L87
            java.lang.Object r7 = r5.next()
            androidx.glance.GlanceId r7 = (androidx.glance.GlanceId) r7
            r0.L$0 = r2
            r0.L$1 = r6
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r7 = r2.update(r6, r7, r0)
            if (r7 != r1) goto L6c
        L86:
            return r1
        L87:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetKt.updateAll(androidx.glance.appwidget.GlanceAppWidget, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
