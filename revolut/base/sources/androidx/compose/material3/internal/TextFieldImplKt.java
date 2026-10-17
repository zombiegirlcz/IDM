package androidx.compose.material3.internal;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import xf0.h;
import xo8.j0;
import xyc.j;
import y1.b;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\u001aé\u0001\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010&\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b$\u0010%\u001a%\u0010&\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b'\u0010(\u001a#\u0010,\u001a\u00020)*\u00020)2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a#\u00102\u001a\u00020)*\u00020)2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a!\u00106\u001a\u00020)*\u00020)2\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0004H\u0000¢\u0006\u0004\b6\u00107\u001aE\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00109\u001a\u0002042\u0006\u0010:\u001a\u000204H\u0001¢\u0006\u0004\b=\u0010>\u001a\u000f\u0010@\u001a\u000204H\u0001¢\u0006\u0004\b@\u0010A\u001a\u000f\u0010B\u001a\u000204H\u0001¢\u0006\u0004\bB\u0010A\"\u001a\u0010C\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u001a\u0010G\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010F\"\u001a\u0010I\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u001a\u0010K\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bL\u0010F\"\u001a\u0010M\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bN\u0010F\"\u001a\u0010O\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010D\u001a\u0004\bP\u0010F\"\u001a\u0010Q\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010F\"\u001a\u0010S\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bT\u0010F\"\u0018\u0010W\u001a\u00020\u0012*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\"\u0018\u0010[\u001a\u00020X*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\"\u0018\u0010]\u001a\u00020X*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Z¨\u0006`²\u0006\f\u0010^\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010_\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "type", "", "visualText", "Lkotlin/Function0;", "", "innerTextField", "Landroidx/compose/material3/TextFieldLabelPosition;", "labelPosition", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", "container", "CommonDecorationBox", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "content", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Decoration", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "", "defaultErrorMessage", "defaultErrorSemantics", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Landroidx/compose/ui/graphics/Shape;", "shape", "textFieldBackground", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "minHeight", "textFieldLabelMinHeight", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animateBorderStrokeAsState", "textFieldHorizontalIconPadding", "(Landroidx/compose/runtime/Composer;I)F", "minimizedLabelHalfHeight", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "AboveLabelHorizontalPadding", "getAboveLabelHorizontalPadding", "AboveLabelBottomPadding", "getAboveLabelBottomPadding", "SupportingTopPadding", "getSupportingTopPadding", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "MinTextLineHeight", "getMinTextLineHeight", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "getShowExpandedLabel", "(Landroidx/compose/material3/TextFieldLabelPosition;)Z", "showExpandedLabel", "Landroidx/compose/ui/Alignment$Horizontal;", "getMinimizedAlignment", "(Landroidx/compose/material3/TextFieldLabelPosition;)Landroidx/compose/ui/Alignment$Horizontal;", "minimizedAlignment", "getExpandedAlignment", "expandedAlignment", "showPlaceholder", "showPrefixSuffix", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextFieldImplKt {
    private static final float AboveLabelBottomPadding;
    private static final float AboveLabelHorizontalPadding;
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final float SupportingTopPadding;
    private static final float TextFieldPadding;
    private static final float PrefixSuffixTextPadding = Dp.m3297constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m3297constructorimpl(24);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        float f = 16;
        TextFieldPadding = Dp.m3297constructorimpl(f);
        float f4 = 4;
        AboveLabelHorizontalPadding = Dp.m3297constructorimpl(f4);
        AboveLabelBottomPadding = Dp.m3297constructorimpl(f4);
        SupportingTopPadding = Dp.m3297constructorimpl(f4);
        MinFocusedLabelLineHeight = Dp.m3297constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m3297constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0952  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommonDecorationBox(@org.jetbrains.annotations.NotNull final androidx.compose.material3.internal.TextFieldType r46, @org.jetbrains.annotations.NotNull final java.lang.CharSequence r47, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, @org.jetbrains.annotations.NotNull final androidx.compose.material3.TextFieldLabelPosition r49, final kotlin.jvm.functions.Function3 r50, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, final boolean r57, final boolean r58, final boolean r59, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r60, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.PaddingValues r61, @org.jetbrains.annotations.NotNull final androidx.compose.material3.TextFieldColors r62, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.internal.TextFieldType, java.lang.CharSequence, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldLabelPosition, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$18$lambda$10$lambda$9(State state) {
        return ((Number) state.getValue()).floatValue() > BitmapDescriptorFactory.HUE_RED;
    }

    private static final boolean CommonDecorationBox$lambda$18$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$18$lambda$17$lambda$16(TextFieldLabelPosition textFieldLabelPosition, State state, MutableState mutableState, Size size) {
        float fFloatValue = ((Number) state.getValue()).floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (size.getPackedValue() >> 32)) * fFloatValue;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size.getPackedValue() & BodyPartID.bodyIdMax)) * fFloatValue;
        if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).getPackedValue() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).getPackedValue() & BodyPartID.bodyIdMax)) != fIntBitsToFloat2) {
            mutableState.setValue(Size.m1861boximpl(Size.m1862constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax))));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$18$lambda$7$lambda$6(State state) {
        return ((Number) state.getValue()).floatValue() > BitmapDescriptorFactory.HUE_RED;
    }

    private static final boolean CommonDecorationBox$lambda$18$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$19(TextFieldType textFieldType, CharSequence charSequence, Function2 function2, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2 function28, int i, int i2, Composer composer, int i3) {
        CommonDecorationBox(textFieldType, charSequence, function2, textFieldLabelPosition, function3, function22, function23, function24, function25, function26, function27, z, z3, z4, interactionSource, paddingValues, textFieldColors, function28, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m1426Decoration3JVO9M(long j2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(396611577);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396611577, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            ProvideContentColorTextStyleKt.m1423ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composerStartRestartGroup, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(j2, textStyle, function2, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m1427DecorationIv8Zu3U(final long j2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(590397809);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590397809, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:330)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m1972boximpl(j2)), function2, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y1.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return TextFieldImplKt.Decoration_Iv8Zu3U$lambda$21(j2, function2, i, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_3J_VO9M$lambda$20(long j2, TextStyle textStyle, Function2 function2, int i, Composer composer, int i2) {
        m1426Decoration3JVO9M(j2, textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_Iv8Zu3U$lambda$21(long j2, Function2 function2, int i, Composer composer, int i2) {
        m1427DecorationIv8Zu3U(j2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m1430animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z3, boolean z4, @NotNull TextFieldColors textFieldColors, float f, float f4, Composer composer, int i) {
        State<Color> stateRememberUpdatedState;
        State<Dp> stateRememberUpdatedState2;
        Composer composer2 = composer;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
        }
        long jM1406indicatorColorXeAY9LY$material3 = textFieldColors.m1406indicatorColorXeAY9LY$material3(z, z3, z4);
        FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer2, 6);
        if (z) {
            composer2.startReplaceGroup(-1674507999);
            stateRememberUpdatedState = SingleValueAnimationKt.m571animateColorAsStateeuL9pac(jM1406indicatorColorXeAY9LY$material3, finiteAnimationSpecValue, null, null, composer, 0, 12);
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(-1674427244);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(jM1406indicatorColorXeAY9LY$material3), composer2, 0);
            composer2.endReplaceGroup();
        }
        State<Color> state = stateRememberUpdatedState;
        FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
        if (z) {
            composer2.startReplaceGroup(-1674245832);
            stateRememberUpdatedState2 = AnimateAsStateKt.m573animateDpAsStateAjpBEmI(z4 ? f : f4, finiteAnimationSpecValue2, null, null, composer2, 0, 12);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(-1674063769);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Dp.m3295boximpl(f4), composer2, (i >> 15) & 14);
            composer2.endReplaceGroup();
        }
        State<BorderStroke> stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m624BorderStrokecXLIe8U(stateRememberUpdatedState2.getValue().getValue(), state.getValue().getValue()), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState3;
    }

    @NotNull
    public static final Modifier defaultErrorSemantics(@NotNull Modifier modifier, boolean z, @NotNull String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new h(str, 17), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultErrorSemantics$lambda$22(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return Unit.f186387a;
    }

    @NotNull
    public static final Alignment.Horizontal getExpandedAlignment(@NotNull TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getExpandedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + textFieldLabelPosition);
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    @NotNull
    public static final Alignment.Horizontal getMinimizedAlignment(@NotNull TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getMinimizedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + textFieldLabelPosition);
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    private static final boolean getShowExpandedLabel(TextFieldLabelPosition textFieldLabelPosition) {
        return (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) && !((TextFieldLabelPosition.Attached) textFieldLabelPosition).getAlwaysMinimize();
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float minimizedLabelHalfHeight(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251545215, i, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        long jM2979getLineHeightXSAIIZE = MaterialTheme.INSTANCE.getTypography(composer, 6).getBodySmall().m2979getLineHeightXSAIIZE();
        long jM1557getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m1557getBodySmallLineHeightXSAIIZE();
        if (!TextUnit.m3372isSpimpl(jM2979getLineHeightXSAIIZE)) {
            jM2979getLineHeightXSAIIZE = jM1557getBodySmallLineHeightXSAIIZE;
        }
        float fM3297constructorimpl = Dp.m3297constructorimpl(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo763toDpGaN1DYA(jM2979getLineHeightXSAIIZE) / 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM3297constructorimpl;
    }

    @NotNull
    public static final Modifier textFieldBackground(@NotNull Modifier modifier, @NotNull ColorProducer colorProducer, @NotNull Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new j(shape, colorProducer, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult textFieldBackground$lambda$24(Shape shape, ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawBehind(new j(shape.mo646createOutlinePq9zytI(cacheDrawScope.m1739getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope), colorProducer, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textFieldBackground$lambda$24$lambda$23(Outline outline, ColorProducer colorProducer, DrawScope drawScope) {
        OutlineKt.m2073drawOutlinewDX37Ww$default(drawScope, outline, colorProducer.mo1206invoke0d7_KjU(), BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        return Unit.f186387a;
    }

    public static final float textFieldHorizontalIconPadding(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986450462, i, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float value = ((Dp) composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).getValue();
        if (Float.isNaN(value)) {
            value = Dp.m3297constructorimpl(0);
        }
        float fM3297constructorimpl = Dp.m3297constructorimpl(Dp.m3297constructorimpl(value - SmallIconButtonTokens.INSTANCE.m1541getIconSizeD9Ej5fM()) / 2);
        float fM3297constructorimpl2 = Dp.m3297constructorimpl(0);
        if (fM3297constructorimpl < fM3297constructorimpl2) {
            fM3297constructorimpl = fM3297constructorimpl2;
        }
        float fM3297constructorimpl3 = Dp.m3297constructorimpl(fM3297constructorimpl);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM3297constructorimpl3;
    }

    @NotNull
    public static final Modifier textFieldLabelMinHeight(@NotNull Modifier modifier, @NotNull Function0<Dp> function0) {
        return LayoutModifierKt.layout(modifier, new j0(function0, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult textFieldLabelMinHeight$lambda$26(Function0 function0, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float value = ((Dp) function0.invoke()).getValue();
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(Constraints.m3271copyZbe2FdA$default(constraints.getValue(), 0, 0, ConstraintsKt.m3291constrainHeightK40F9xA(constraints.getValue(), !Dp.m3299equalsimpl0(value, Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM()) ? measureScope.mo762roundToPx0680j_4(value) : 0), 0, 11, null));
        return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new c(4, placeableMo2530measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textFieldLabelMinHeight$lambda$26$lambda$25(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }
}
