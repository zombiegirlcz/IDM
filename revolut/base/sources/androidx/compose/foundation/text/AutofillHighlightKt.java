package androidx.compose.foundation.text;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Color;", "color", "defaultColor", "resolveAutofillHighlight-WkMS-hQ", "(Landroidx/compose/ui/graphics/Brush;JJ)Landroidx/compose/ui/graphics/Brush;", "resolveAutofillHighlight", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofillHighlightBrush", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAutofillHighlightBrush", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofillHighlightColor", "getLocalAutofillHighlightColor", "getLocalAutofillHighlightColor$annotations", "()V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AutofillHighlightKt {

    @NotNull
    private static final ProvidableCompositionLocal<Brush> LocalAutofillHighlightBrush = CompositionLocalKt.compositionLocalOf$default(null, new n08.b(7), 1, null);

    @NotNull
    private static final ProvidableCompositionLocal<Color> LocalAutofillHighlightColor = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Color>() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$LocalAutofillHighlightColor$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Color.m1972boximpl(m973invoke0d7_KjU());
        }

        /* JADX INFO: renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m973invoke0d7_KjU() {
            return AutofillHighlight_androidKt.autofillHighlightColor();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Brush LocalAutofillHighlightBrush$lambda$0() {
        return new SolidColor(AutofillHighlight_androidKt.autofillHighlightColor(), null);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Brush> getLocalAutofillHighlightBrush() {
        return LocalAutofillHighlightBrush;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Color> getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }

    @NotNull
    /* JADX INFO: renamed from: resolveAutofillHighlight-WkMS-hQ, reason: not valid java name */
    public static final Brush m972resolveAutofillHighlightWkMShQ(@NotNull Brush brush, long j2, long j3) {
        return !Color.m1978equalsimpl0(j2, j3) ? new SolidColor(j2, null) : brush;
    }
}
