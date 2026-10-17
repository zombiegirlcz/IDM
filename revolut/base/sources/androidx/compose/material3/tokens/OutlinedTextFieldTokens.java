package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010O\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\bP\u0010\rR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010]\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b]\u0010\u000b\u001a\u0004\b^\u0010\rR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010f\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bm\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010\u0006\u001a\u0004\bo\u0010\bR\u0017\u0010p\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bp\u0010\u0006\u001a\u0004\bq\u0010\bR\u0017\u0010r\u001a\u00020e8\u0006¢\u0006\f\n\u0004\br\u0010g\u001a\u0004\bs\u0010iR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bt\u0010\u0006\u001a\u0004\bu\u0010\bR\u0017\u0010v\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bv\u0010\u000b\u001a\u0004\bw\u0010\rR\u0017\u0010x\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR\u0017\u0010z\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bz\u0010\u000b\u001a\u0004\b{\u0010\rR\u0017\u0010|\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b|\u0010\u0006\u001a\u0004\b}\u0010\bR\u0017\u0010~\u001a\u00020e8\u0006¢\u0006\f\n\u0004\b~\u0010g\u001a\u0004\b\u007f\u0010iR\u001a\u0010\u0080\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\bR\u001a\u0010\u0082\u0001\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u000b\u001a\u0005\b\u0083\u0001\u0010\r¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/material3/tokens/OutlinedTextFieldTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "CaretColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getCaretColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Landroidx/compose/ui/unit/Dp;", "ContainerHeight", "F", "getContainerHeight-D9Ej5fM", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledInputColor", "getDisabledInputColor", "DisabledLabelColor", "getDisabledLabelColor", "DisabledLeadingIconColor", "getDisabledLeadingIconColor", "DisabledOutlineColor", "getDisabledOutlineColor", "DisabledOutlineWidth", "getDisabledOutlineWidth-D9Ej5fM", "DisabledSupportingColor", "getDisabledSupportingColor", "DisabledTrailingIconColor", "getDisabledTrailingIconColor", "ErrorFocusCaretColor", "getErrorFocusCaretColor", "ErrorFocusInputColor", "getErrorFocusInputColor", "ErrorFocusLabelColor", "getErrorFocusLabelColor", "ErrorFocusLeadingIconColor", "getErrorFocusLeadingIconColor", "ErrorFocusOutlineColor", "getErrorFocusOutlineColor", "ErrorFocusSupportingColor", "getErrorFocusSupportingColor", "ErrorFocusTrailingIconColor", "getErrorFocusTrailingIconColor", "ErrorHoverInputColor", "getErrorHoverInputColor", "ErrorHoverLabelColor", "getErrorHoverLabelColor", "ErrorHoverLeadingIconColor", "getErrorHoverLeadingIconColor", "ErrorHoverOutlineColor", "getErrorHoverOutlineColor", "ErrorHoverSupportingColor", "getErrorHoverSupportingColor", "ErrorHoverTrailingIconColor", "getErrorHoverTrailingIconColor", "ErrorInputColor", "getErrorInputColor", "ErrorLabelColor", "getErrorLabelColor", "ErrorLeadingIconColor", "getErrorLeadingIconColor", "ErrorOutlineColor", "getErrorOutlineColor", "ErrorSupportingColor", "getErrorSupportingColor", "ErrorTrailingIconColor", "getErrorTrailingIconColor", "FocusInputColor", "getFocusInputColor", "FocusLabelColor", "getFocusLabelColor", "FocusLeadingIconColor", "getFocusLeadingIconColor", "FocusOutlineColor", "getFocusOutlineColor", "FocusOutlineWidth", "getFocusOutlineWidth-D9Ej5fM", "FocusSupportingColor", "getFocusSupportingColor", "FocusTrailingIconColor", "getFocusTrailingIconColor", "HoverInputColor", "getHoverInputColor", "HoverLabelColor", "getHoverLabelColor", "HoverLeadingIconColor", "getHoverLeadingIconColor", "HoverOutlineColor", "getHoverOutlineColor", "HoverOutlineWidth", "getHoverOutlineWidth-D9Ej5fM", "HoverSupportingColor", "getHoverSupportingColor", "HoverTrailingIconColor", "getHoverTrailingIconColor", "InputColor", "getInputColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getInputFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputPlaceholderColor", "getInputPlaceholderColor", "InputPrefixColor", "getInputPrefixColor", "InputSuffixColor", "getInputSuffixColor", "LabelColor", "getLabelColor", "LabelFont", "getLabelFont", "LeadingIconColor", "getLeadingIconColor", "LeadingIconSize", "getLeadingIconSize-D9Ej5fM", "OutlineColor", "getOutlineColor", "OutlineWidth", "getOutlineWidth-D9Ej5fM", "SupportingColor", "getSupportingColor", "SupportingFont", "getSupportingFont", "TrailingIconColor", "getTrailingIconColor", "TrailingIconSize", "getTrailingIconSize-D9Ej5fM", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutlinedTextFieldTokens {

    @NotNull
    private static final ColorSchemeKeyTokens CaretColor;
    private static final float ContainerHeight;

    @NotNull
    private static final ShapeKeyTokens ContainerShape;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledInputColor;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledOutlineColor;
    private static final float DisabledOutlineWidth;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledSupportingColor;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusCaretColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusInputColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusLeadingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusOutlineColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusSupportingColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorFocusTrailingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorHoverInputColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorHoverLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorHoverLeadingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorHoverOutlineColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorHoverSupportingColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorHoverTrailingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorInputColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorLeadingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorOutlineColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorSupportingColor;

    @NotNull
    private static final ColorSchemeKeyTokens ErrorTrailingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens FocusInputColor;

    @NotNull
    private static final ColorSchemeKeyTokens FocusLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens FocusOutlineColor;
    private static final float FocusOutlineWidth;

    @NotNull
    private static final ColorSchemeKeyTokens FocusSupportingColor;

    @NotNull
    private static final ColorSchemeKeyTokens FocusTrailingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoverInputColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoverLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoverOutlineColor;
    private static final float HoverOutlineWidth;

    @NotNull
    private static final ColorSchemeKeyTokens HoverSupportingColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoverTrailingIconColor;

    @NotNull
    public static final OutlinedTextFieldTokens INSTANCE = new OutlinedTextFieldTokens();

    @NotNull
    private static final ColorSchemeKeyTokens InputColor;

    @NotNull
    private static final TypographyKeyTokens InputFont;

    @NotNull
    private static final ColorSchemeKeyTokens InputPlaceholderColor;

    @NotNull
    private static final ColorSchemeKeyTokens InputPrefixColor;

    @NotNull
    private static final ColorSchemeKeyTokens InputSuffixColor;

    @NotNull
    private static final ColorSchemeKeyTokens LabelColor;

    @NotNull
    private static final TypographyKeyTokens LabelFont;

    @NotNull
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;

    @NotNull
    private static final ColorSchemeKeyTokens OutlineColor;
    private static final float OutlineWidth;

    @NotNull
    private static final ColorSchemeKeyTokens SupportingColor;

    @NotNull
    private static final TypographyKeyTokens SupportingFont;

    @NotNull
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingIconSize;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        CaretColor = colorSchemeKeyTokens;
        ContainerHeight = Dp.m3297constructorimpl((float) 56.0d);
        ContainerShape = ShapeKeyTokens.CornerExtraSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledInputColor = colorSchemeKeyTokens2;
        DisabledLabelColor = colorSchemeKeyTokens2;
        DisabledLeadingIconColor = colorSchemeKeyTokens2;
        DisabledOutlineColor = colorSchemeKeyTokens2;
        float f = (float) 1.0d;
        DisabledOutlineWidth = Dp.m3297constructorimpl(f);
        DisabledSupportingColor = colorSchemeKeyTokens2;
        DisabledTrailingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        ErrorFocusCaretColor = colorSchemeKeyTokens3;
        ErrorFocusInputColor = colorSchemeKeyTokens2;
        ErrorFocusLabelColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ErrorFocusLeadingIconColor = colorSchemeKeyTokens4;
        ErrorFocusOutlineColor = colorSchemeKeyTokens3;
        ErrorFocusSupportingColor = colorSchemeKeyTokens3;
        ErrorFocusTrailingIconColor = colorSchemeKeyTokens3;
        ErrorHoverInputColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        ErrorHoverLabelColor = colorSchemeKeyTokens5;
        ErrorHoverLeadingIconColor = colorSchemeKeyTokens4;
        ErrorHoverOutlineColor = colorSchemeKeyTokens5;
        ErrorHoverSupportingColor = colorSchemeKeyTokens3;
        ErrorHoverTrailingIconColor = colorSchemeKeyTokens5;
        ErrorInputColor = colorSchemeKeyTokens2;
        ErrorLabelColor = colorSchemeKeyTokens3;
        ErrorLeadingIconColor = colorSchemeKeyTokens4;
        ErrorOutlineColor = colorSchemeKeyTokens3;
        ErrorSupportingColor = colorSchemeKeyTokens3;
        ErrorTrailingIconColor = colorSchemeKeyTokens3;
        FocusInputColor = colorSchemeKeyTokens2;
        FocusLabelColor = colorSchemeKeyTokens;
        FocusLeadingIconColor = colorSchemeKeyTokens4;
        FocusOutlineColor = colorSchemeKeyTokens;
        FocusOutlineWidth = Dp.m3297constructorimpl((float) 2.0d);
        FocusSupportingColor = colorSchemeKeyTokens4;
        FocusTrailingIconColor = colorSchemeKeyTokens4;
        HoverInputColor = colorSchemeKeyTokens2;
        HoverLabelColor = colorSchemeKeyTokens2;
        HoverLeadingIconColor = colorSchemeKeyTokens4;
        HoverOutlineColor = colorSchemeKeyTokens2;
        HoverOutlineWidth = Dp.m3297constructorimpl(f);
        HoverSupportingColor = colorSchemeKeyTokens4;
        HoverTrailingIconColor = colorSchemeKeyTokens4;
        InputColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        InputFont = typographyKeyTokens;
        InputPlaceholderColor = colorSchemeKeyTokens4;
        InputPrefixColor = colorSchemeKeyTokens4;
        InputSuffixColor = colorSchemeKeyTokens4;
        LabelColor = colorSchemeKeyTokens4;
        LabelFont = typographyKeyTokens;
        LeadingIconColor = colorSchemeKeyTokens4;
        float f4 = (float) 24.0d;
        LeadingIconSize = Dp.m3297constructorimpl(f4);
        OutlineColor = ColorSchemeKeyTokens.Outline;
        OutlineWidth = Dp.m3297constructorimpl(f);
        SupportingColor = colorSchemeKeyTokens4;
        SupportingFont = TypographyKeyTokens.BodySmall;
        TrailingIconColor = colorSchemeKeyTokens4;
        TrailingIconSize = Dp.m3297constructorimpl(f4);
    }

    private OutlinedTextFieldTokens() {
    }

    @NotNull
    public final ColorSchemeKeyTokens getCaretColor() {
        return CaretColor;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledInputColor() {
        return DisabledInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return DisabledLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSupportingColor() {
        return DisabledSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusCaretColor() {
        return ErrorFocusCaretColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorInputColor() {
        return ErrorInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLabelColor() {
        return ErrorLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLeadingIconColor() {
        return ErrorLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorOutlineColor() {
        return ErrorOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorSupportingColor() {
        return ErrorSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorTrailingIconColor() {
        return ErrorTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusInputColor() {
        return FocusInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLabelColor() {
        return FocusLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return FocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusSupportingColor() {
        return FocusSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusTrailingIconColor() {
        return FocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputColor() {
        return InputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPlaceholderColor() {
        return InputPlaceholderColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPrefixColor() {
        return InputPrefixColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputSuffixColor() {
        return InputSuffixColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelColor() {
        return LabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingColor() {
        return SupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }
}
