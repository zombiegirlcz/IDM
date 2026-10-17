package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextFieldCursorKt {
    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull LegacyTextFieldState legacyTextFieldState, @NotNull TextFieldValue textFieldValue, @NotNull OffsetMapping offsetMapping, @NotNull Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new ccg.b(brush, legacyTextFieldState, textFieldValue, offsetMapping, 6), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier cursor$lambda$0(Brush brush, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Modifier modifier, Composer composer, int i) {
        Modifier modifierDrawWithContent;
        composer.startReplaceGroup(-84507373);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-84507373, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
        boolean zChanged = composer.changed(zBooleanValue);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CursorAnimationState(zBooleanValue);
            composer.updateRememberedValue(objRememberedValue);
        }
        CursorAnimationState cursorAnimationState = (CursorAnimationState) objRememberedValue;
        boolean z = ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == 16) ? false : true;
        if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m2953getCollapsedimpl(textFieldValue.getSelection()) && z) {
            composer.startReplaceGroup(-707487962);
            AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
            TextRange textRangeM2947boximpl = TextRange.m2947boximpl(textFieldValue.getSelection());
            boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(annotatedString, textRangeM2947boximpl, (Function2) objRememberedValue2, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(brush);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object eVar = new kwg.e(cursorAnimationState, offsetMapping, textFieldValue, legacyTextFieldState, brush, 5);
                composer.updateRememberedValue(eVar);
                objRememberedValue3 = eVar;
            }
            modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier, (Function1) objRememberedValue3);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-705473241);
            composer.endReplaceGroup();
            modifierDrawWithContent = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawWithContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cursor$lambda$0$2$0(CursorAnimationState cursorAnimationState, OffsetMapping offsetMapping, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, Brush brush, ContentDrawScope contentDrawScope) {
        Rect rect;
        TextLayoutResult value;
        contentDrawScope.drawContent();
        float cursorAlpha = cursorAnimationState.getCursorAlpha();
        if (cursorAlpha != BitmapDescriptorFactory.HUE_RED) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m2959getStartimpl(textFieldValue.getSelection()));
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                rect = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            float fFloor = (float) Math.floor(contentDrawScope.mo768toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()));
            float f = fFloor < 1.0f ? 1.0f : fFloor;
            float f4 = f / 2;
            float left = rect.getLeft() + f4;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32)) - f4;
            if (left > fIntBitsToFloat) {
                left = fIntBitsToFloat;
            }
            if (left >= f4) {
                f4 = left;
            }
            float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f4)) + 0.5f : (float) Math.rint(f4);
            DrawScope.m2202drawLine1RTmtNc$default(contentDrawScope, brush, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(rect.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fFloor2)) << 32)), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(rect.getBottom())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fFloor2)) << 32)), f, 0, null, cursorAlpha, null, 0, 432, null);
        }
        return Unit.f186387a;
    }
}
