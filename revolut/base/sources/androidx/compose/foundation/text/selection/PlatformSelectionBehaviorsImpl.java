package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import gim.i;
import hlm.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00192\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b \u0010\u0012J*\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b'\u0010\u0012J7\u0010.\u001a\u00020\u0010*\u00020)2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100*H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u0004\u0018\u00010/2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R/\u0010D\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl;", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroid/content/Context;Landroidx/compose/foundation/text/selection/SelectedTextType;Landroidx/compose/ui/text/intl/LocaleList;)V", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "", "onShowContextMenuOrSelectionToolbar-Sb-Bc2M", "(Ljava/lang/CharSequence;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onShowContextMenuOrSelectionToolbar", "Landroid/view/textclassifier/TextClassifier;", "textClassifier", "classifyText-M8tDOmk", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "classifyText", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "requireTextClassificationSession", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestSelectionForLongPressOrDoubleClick-pYaCw-w", "suggestSelectionForLongPressOrDoubleClick", "Landroidx/compose/ui/geometry/Offset;", "secondaryClickLocation", "onShowContextMenu-_2OEclM", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/geometry/Offset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onShowContextMenu", "onShowSelectionToolbar-Sb-Bc2M", "onShowSelectionToolbar", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Lkotlin/Function1;", "child", "addSmartSelectionTextContextMenuItems-YmzfRxQ$foundation", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Ljava/lang/CharSequence;JLkotlin/jvm/functions/Function1;)V", "addSmartSelectionTextContextMenuItems", "Landroid/view/textclassifier/TextClassification;", "tryGetTextClassification-FDrldGo", "(Ljava/lang/CharSequence;J)Landroid/view/textclassifier/TextClassification;", "tryGetTextClassification", "Lkotlin/coroutines/CoroutineContext;", "Landroid/content/Context;", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "Landroidx/compose/ui/text/intl/LocaleList;", "Lhlm/a;", "mutex", "Lhlm/a;", "textClassificationSession", "Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/foundation/text/selection/TextClassificationResult;", "<set-?>", "textClassificationResult$delegate", "Landroidx/compose/runtime/MutableState;", "getTextClassificationResult", "()Landroidx/compose/foundation/text/selection/TextClassificationResult;", "setTextClassificationResult", "(Landroidx/compose/foundation/text/selection/TextClassificationResult;)V", "textClassificationResult", "AssistantItemKey", "Ljava/lang/Object;", "Landroid/os/LocaleList;", "getAndroidLocalList", "()Landroid/os/LocaleList;", "androidLocalList", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformSelectionBehaviorsImpl implements PlatformSelectionBehaviors {

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineContext coroutineContext;
    private final LocaleList localeList;

    @NotNull
    private final SelectedTextType selectedTextType;
    private TextClassifier textClassificationSession;

    @NotNull
    private final hlm.a mutex = d.a();

    /* JADX INFO: renamed from: textClassificationResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState textClassificationResult = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private final Object AssistantItemKey = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2, reason: invalid class name */
    @gim.d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<TextClassifier, Continuation<? super T>, Object> $block;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
        @gim.d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
            final /* synthetic */ Function2<TextClassifier, Continuation<? super T>, Object> $block;
            final /* synthetic */ TextClassifier $textClassificationSession;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(TextClassifier textClassifier, Function2<? super TextClassifier, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$textClassificationSession = textClassifier;
                this.$block = function2;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                return new AnonymousClass1(this.$textClassificationSession, this.$block, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                TextClassifier textClassifier = this.$textClassificationSession;
                if (textClassifier == null) {
                    return null;
                }
                Function2<TextClassifier, Continuation<? super T>, Object> function2 = this.$block;
                this.label = 1;
                Object objInvoke = function2.invoke(textClassifier, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super TextClassifier, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return PlatformSelectionBehaviorsImpl.this.new AnonymousClass2(this.$block, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[RETURN] */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L34
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                yhm.o.b(r10)
                return r10
            L14:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1c:
                java.lang.Object r1 = r9.L$0
                hlm.a r1 = (hlm.a) r1
                yhm.o.b(r10)     // Catch: java.lang.Throwable -> L24
                goto L74
            L24:
                r10 = move-exception
                goto L92
            L27:
                java.lang.Object r1 = r9.L$1
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl r1 = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl) r1
                java.lang.Object r4 = r9.L$0
                hlm.a r4 = (hlm.a) r4
                yhm.o.b(r10)
                r10 = r4
                goto L4c
            L34:
                yhm.o.b(r10)
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl r10 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.this
                hlm.a r10 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.access$getMutex$p(r10)
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl r1 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.this
                r9.L$0 = r10
                r9.L$1 = r1
                r9.label = r4
                java.lang.Object r4 = r10.lock(r5, r9)
                if (r4 != r0) goto L4c
                goto L90
            L4c:
                android.view.textclassifier.TextClassifier r4 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.access$getTextClassificationSession$p(r1)     // Catch: java.lang.Throwable -> L59
                if (r4 == 0) goto L5d
                boolean r6 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L59
                if (r6 == 0) goto L78
                goto L5d
            L59:
                r0 = move-exception
                r1 = r10
                r10 = r0
                goto L92
            L5d:
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 r4 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1     // Catch: java.lang.Throwable -> L59
                r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L59
                r9.L$0 = r10     // Catch: java.lang.Throwable -> L59
                r9.L$1 = r5     // Catch: java.lang.Throwable -> L59
                r9.label = r3     // Catch: java.lang.Throwable -> L59
                r6 = 300(0x12c, double:1.48E-321)
                java.lang.Object r1 = skm.h2.d(r6, r4, r9)     // Catch: java.lang.Throwable -> L59
                if (r1 != r0) goto L71
                goto L90
            L71:
                r8 = r1
                r1 = r10
                r10 = r8
            L74:
                r4 = r10
                android.view.textclassifier.TextClassifier r4 = (android.view.textclassifier.TextClassifier) r4     // Catch: java.lang.Throwable -> L24
                r10 = r1
            L78:
                r10.unlock(r5)
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1 r10 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1
                kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r1 = r9.$block
                r10.<init>(r4, r1, r5)
                r9.L$0 = r5
                r9.L$1 = r5
                r9.label = r2
                r1 = 200(0xc8, double:9.9E-322)
                java.lang.Object r10 = skm.h2.d(r1, r10, r9)
                if (r10 != r0) goto L91
            L90:
                return r0
            L91:
                return r10
            L92:
                r1.unlock(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public PlatformSelectionBehaviorsImpl(@NotNull CoroutineContext coroutineContext, @NotNull Context context, @NotNull SelectedTextType selectedTextType, LocaleList localeList) {
        this.coroutineContext = coroutineContext;
        this.context = context;
        this.selectedTextType = selectedTextType;
        this.localeList = localeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: classifyText-M8tDOmk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1142classifyTextM8tDOmk(java.lang.CharSequence r21, long r22, android.view.textclassifier.TextClassifier r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.m1142classifyTextM8tDOmk(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.LocaleList getAndroidLocalList() {
        android.os.LocaleList androidLocaleList;
        LocaleList localeList = this.localeList;
        return (localeList == null || (androidLocaleList = TextClassifierHelperMethods.INSTANCE.toAndroidLocaleList(localeList)) == null) ? new android.os.LocaleList(Locale.INSTANCE.getCurrent().getPlatformLocale()) : androidLocaleList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TextClassificationResult getTextClassificationResult() {
        return (TextClassificationResult) this.textClassificationResult.getValue();
    }

    /* JADX INFO: renamed from: onShowContextMenuOrSelectionToolbar-Sb-Bc2M, reason: not valid java name */
    private final Object m1143onShowContextMenuOrSelectionToolbarSbBc2M(CharSequence charSequence, long j2, Continuation<? super Unit> continuation) {
        return (charSequence.length() == 0 || TextRange.m2953getCollapsedimpl(j2)) ? Unit.f186387a : requireTextClassificationSession(new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j2, null), continuation);
    }

    private final <T> Object requireTextClassificationSession(Function2<? super TextClassifier, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return e0.J(this.coroutineContext, new AnonymousClass2(function2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextClassificationResult(TextClassificationResult textClassificationResult) {
        this.textClassificationResult.setValue(textClassificationResult);
    }

    /* JADX INFO: renamed from: addSmartSelectionTextContextMenuItems-YmzfRxQ$foundation, reason: not valid java name */
    public final void m1144addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(@NotNull TextContextMenuBuilderScope textContextMenuBuilderScope, @NotNull CharSequence charSequence, long j2, @NotNull Function1<? super TextContextMenuBuilderScope, Unit> function1) {
        TextClassification textClassificationM1145tryGetTextClassificationFDrldGo = m1145tryGetTextClassificationFDrldGo(charSequence, j2);
        if (textClassificationM1145tryGetTextClassificationFDrldGo == null) {
            function1.invoke(textContextMenuBuilderScope);
            return;
        }
        if (!textClassificationM1145tryGetTextClassificationFDrldGo.getActions().isEmpty()) {
            TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, textClassificationM1145tryGetTextClassificationFDrldGo, 0);
        } else if (TextClassifierHelperMethods.INSTANCE.hasLegacyAssistItem$foundation(textClassificationM1145tryGetTextClassificationFDrldGo)) {
            TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, textClassificationM1145tryGetTextClassificationFDrldGo, -1);
        }
        function1.invoke(textContextMenuBuilderScope);
        List<RemoteAction> actions = textClassificationM1145tryGetTextClassificationFDrldGo.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, textClassificationM1145tryGetTextClassificationFDrldGo, i);
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* JADX INFO: renamed from: onShowContextMenu-_2OEclM */
    public Object mo1138onShowContextMenu_2OEclM(@NotNull CharSequence charSequence, long j2, Offset offset, @NotNull Continuation<? super Unit> continuation) {
        Object objM1143onShowContextMenuOrSelectionToolbarSbBc2M = m1143onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j2, continuation);
        return objM1143onShowContextMenuOrSelectionToolbarSbBc2M == fim.a.COROUTINE_SUSPENDED ? objM1143onShowContextMenuOrSelectionToolbarSbBc2M : Unit.f186387a;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* JADX INFO: renamed from: onShowSelectionToolbar-Sb-Bc2M */
    public Object mo1139onShowSelectionToolbarSbBc2M(@NotNull CharSequence charSequence, long j2, @NotNull Continuation<? super Unit> continuation) {
        Object objM1143onShowContextMenuOrSelectionToolbarSbBc2M = m1143onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j2, continuation);
        return objM1143onShowContextMenuOrSelectionToolbarSbBc2M == fim.a.COROUTINE_SUSPENDED ? objM1143onShowContextMenuOrSelectionToolbarSbBc2M : Unit.f186387a;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* JADX INFO: renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w */
    public Object mo1140suggestSelectionForLongPressOrDoubleClickpYaCww(@NotNull CharSequence charSequence, long j2, @NotNull Continuation<? super TextRange> continuation) {
        if (charSequence.length() == 0 || TextRange.m2953getCollapsedimpl(j2)) {
            return null;
        }
        return requireTextClassificationSession(new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j2, this, null), continuation);
    }

    /* JADX INFO: renamed from: tryGetTextClassification-FDrldGo, reason: not valid java name */
    public final TextClassification m1145tryGetTextClassificationFDrldGo(@NotNull CharSequence text, long selection) {
        if (!this.mutex.tryLock(null)) {
            return null;
        }
        TextClassificationResult textClassificationResult = getTextClassificationResult();
        TextClassification textClassification = (textClassificationResult == null || !PlatformSelectionBehaviors_androidKt.m1148canReuseh5sm0ck(textClassificationResult, text, selection)) ? null : textClassificationResult.getTextClassification();
        this.mutex.unlock(null);
        return textClassification;
    }
}
