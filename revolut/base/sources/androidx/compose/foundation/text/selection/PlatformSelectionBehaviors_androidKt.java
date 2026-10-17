package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.ProcessText_androidKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.LocaleList;
import dr0.w;
import elm.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u001a\u001a\u00020\u0016*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"J\u0010\"\u001a$\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "rememberPlatformSelectionBehaviors", "(Landroidx/compose/foundation/text/selection/SelectedTextType;Landroidx/compose/ui/text/intl/LocaleList;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "Landroidx/compose/foundation/text/selection/TextClassificationResult;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "", "canReuse-h5sm0ck", "(Landroidx/compose/foundation/text/selection/TextClassificationResult;Ljava/lang/CharSequence;J)Z", "canReuse", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/Context;", "context", "editable", "platformSelectionBehaviors", "Lkotlin/Function1;", "", "child", "addPlatformTextContextMenuItems-71BSaZU", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Landroid/content/Context;ZLjava/lang/CharSequence;Landroidx/compose/ui/text/TextRange;Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;Lkotlin/jvm/functions/Function1;)V", "addPlatformTextContextMenuItems", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/coroutines/CoroutineContext;", "LocalTextClassifierCoroutineContext", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextClassifierCoroutineContext", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function4;", "PlatformSelectionBehaviorsFactory", "Loim/n;", "getPlatformSelectionBehaviorsFactory", "()Loim/n;", "setPlatformSelectionBehaviorsFactory", "(Loim/n;)V", "getPlatformSelectionBehaviorsFactory$annotations", "()V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PlatformSelectionBehaviors_androidKt {

    @NotNull
    private static final ProvidableCompositionLocal<CoroutineContext> LocalTextClassifierCoroutineContext = CompositionLocalKt.staticCompositionLocalOf(new ty.a(13));

    @NotNull
    private static n PlatformSelectionBehaviorsFactory = new w(3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext LocalTextClassifierCoroutineContext$lambda$0() {
        p0 p0Var = p0.f264001a;
        return f.f127540b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformSelectionBehaviorsImpl PlatformSelectionBehaviorsFactory$lambda$0(CoroutineContext coroutineContext, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        return new PlatformSelectionBehaviorsImpl(coroutineContext, context, selectedTextType, localeList);
    }

    /* JADX INFO: renamed from: addPlatformTextContextMenuItems-71BSaZU, reason: not valid java name */
    public static final void m1147addPlatformTextContextMenuItems71BSaZU(@NotNull TextContextMenuBuilderScope textContextMenuBuilderScope, @NotNull Context context, boolean z, CharSequence charSequence, TextRange textRange, PlatformSelectionBehaviors platformSelectionBehaviors, @NotNull Function1<? super TextContextMenuBuilderScope, Unit> function1) {
        if (charSequence != null && textRange != null && platformSelectionBehaviors != null && (platformSelectionBehaviors instanceof PlatformSelectionBehaviorsImpl)) {
            ((PlatformSelectionBehaviorsImpl) platformSelectionBehaviors).m1144addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(textContextMenuBuilderScope, charSequence, textRange.getPackedValue(), function1);
            ProcessText_androidKt.m1063addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.getPackedValue());
            return;
        }
        function1.invoke(textContextMenuBuilderScope);
        if (charSequence == null || textRange == null) {
            return;
        }
        ProcessText_androidKt.m1063addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: canReuse-h5sm0ck, reason: not valid java name */
    public static final boolean m1148canReuseh5sm0ck(TextClassificationResult textClassificationResult, CharSequence charSequence, long j2) {
        return TextRange.m2952equalsimpl0(j2, textClassificationResult.getSelection()) && Intrinsics.f(charSequence, textClassificationResult.getText());
    }

    public static final PlatformSelectionBehaviors rememberPlatformSelectionBehaviors(@NotNull SelectedTextType selectedTextType, LocaleList localeList, Composer composer, int i) {
        composer.startReplaceGroup(430530635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(430530635, i, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:95)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        CoroutineContext coroutineContext = (CoroutineContext) composer.consume(LocalTextClassifierCoroutineContext);
        boolean zChanged = composer.changed(coroutineContext) | composer.changed(context) | ((((i & 14) ^ 6) > 4 && composer.changed(selectedTextType.ordinal())) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(localeList)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (PlatformSelectionBehaviors) PlatformSelectionBehaviorsFactory.invoke(coroutineContext, context, selectedTextType, localeList);
            composer.updateRememberedValue(objRememberedValue);
        }
        PlatformSelectionBehaviors platformSelectionBehaviors = (PlatformSelectionBehaviors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return platformSelectionBehaviors;
    }
}
