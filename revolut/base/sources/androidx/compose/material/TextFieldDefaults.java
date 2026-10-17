package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0018Já\u0001\u00104\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020\u001c2\b\b\u0002\u0010&\u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001c2\b\b\u0002\u0010)\u001a\u00020\u001c2\b\b\u0002\u0010*\u001a\u00020\u001c2\b\b\u0002\u0010+\u001a\u00020\u001c2\b\b\u0002\u0010,\u001a\u00020\u001c2\b\b\u0002\u0010-\u001a\u00020\u001c2\b\b\u0002\u0010.\u001a\u00020\u001c2\b\b\u0002\u0010/\u001a\u00020\u001c2\b\b\u0002\u00100\u001a\u00020\u001c2\b\b\u0002\u00101\u001a\u00020\u001cH\u0007¢\u0006\u0004\b2\u00103Jµ\u0001\u0010D\u001a\u0002082\u0006\u00106\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010<\u001a\u00020;2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010C\u001a\u00020\u0016H\u0007¢\u0006\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010J\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0017\u0010L\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u0017\u0010N\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u0011\u0010R\u001a\u00020A8G¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "", "value", "Lkotlin/Function0;", "", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldDefaults {

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m3297constructorimpl(56);
    private static final float MinWidth = Dp.m3297constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m3297constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m3297constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldDecorationBox$lambda$0(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i, int i2, int i3, Composer composer, int i5) {
        textFieldDefaults.TextFieldDecorationBox(str, function2, z, z3, visualTransformation, interactionSource, z4, function22, function23, function24, function25, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1261indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f4, int i, Object obj2) {
        if ((i & 16) != 0) {
            f = FocusedBorderThickness;
        }
        return textFieldDefaults.m1266indicatorLinegv0btCI(modifier, z, z3, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedBorderThickness : f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier indicatorLine_gv0btCI$lambda$1(boolean z, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f4, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(1398930845);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
        }
        Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m1271animateBorderStrokeAsStateNuRrP5Q(z, z3, interactionSource, textFieldColors, f, f4, composer, 0).getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawIndicatorLine;
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1262textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f5 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f6 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1268textFieldWithLabelPaddinga9UjIt4(f, f4, f5, f6);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1263textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1269textFieldWithoutLabelPaddinga9UjIt4(f, f4, f5, f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(@org.jetbrains.annotations.NotNull final java.lang.String r62, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, final boolean r64, final boolean r65, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r66, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r67, boolean r68, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r69, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r70, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, androidx.compose.ui.graphics.Shape r73, androidx.compose.material.TextFieldColors r74, androidx.compose.foundation.layout.PaddingValues r75, androidx.compose.runtime.Composer r76, final int r77, final int r78, int r79) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1264getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1265getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @NotNull
    public final Shape getTextFieldShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:221)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShapeCopy$default;
    }

    @NotNull
    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1266indicatorLinegv0btCI(@NotNull Modifier modifier, final boolean z, final boolean z3, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, final float f, final float f4) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z, z3, interactionSource, textFieldColors, f, f4) : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: v1.j0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return TextFieldDefaults.indicatorLine_gv0btCI$lambda$1(z, z3, interactionSource, textFieldColors, f, f4, (Modifier) obj2, (Composer) obj3, iIntValue);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1267textFieldColorsdx8h9Zs(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, Composer composer, int i, int i2, int i3, int i5) {
        long j107;
        long jM1976copywmQWz5c$default;
        long j108;
        long jM1976copywmQWz5c$default2;
        long j109;
        long jM1976copywmQWz5c$default3;
        long j110;
        long jM1976copywmQWz5c$default4;
        long j111;
        long jM1976copywmQWz5c$default5 = (i5 & 1) != 0 ? Color.m1976copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j2;
        long jM1976copywmQWz5c$default6 = (i5 & 2) != 0 ? Color.m1976copywmQWz5c$default(jM1976copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j3;
        long jM1976copywmQWz5c$default7 = (i5 & 4) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j5;
        long jM1191getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1191getPrimary0d7_KjU() : j16;
        long jM1185getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1185getError0d7_KjU() : j22;
        long jM1976copywmQWz5c$default8 = (i5 & 32) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1191getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j42;
        long jM1976copywmQWz5c$default9 = (i5 & 64) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), 0.42f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j46;
        if ((i5 & 128) != 0) {
            long j112 = jM1976copywmQWz5c$default9;
            jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(j112, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j107 = j112;
        } else {
            j107 = jM1976copywmQWz5c$default9;
            jM1976copywmQWz5c$default = j47;
        }
        long jM1185getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1185getError0d7_KjU() : j57;
        long jM1976copywmQWz5c$default10 = (i5 & 512) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j58;
        if ((i5 & 1024) != 0) {
            long j113 = jM1976copywmQWz5c$default10;
            jM1976copywmQWz5c$default2 = Color.m1976copywmQWz5c$default(j113, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j108 = j113;
        } else {
            j108 = jM1976copywmQWz5c$default10;
            jM1976copywmQWz5c$default2 = j65;
        }
        long j114 = (i5 & 2048) != 0 ? j108 : j69;
        long jM1976copywmQWz5c$default11 = (i5 & 4096) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j76;
        if ((i5 & 8192) != 0) {
            long j115 = jM1976copywmQWz5c$default11;
            jM1976copywmQWz5c$default3 = Color.m1976copywmQWz5c$default(j115, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j109 = j115;
        } else {
            j109 = jM1976copywmQWz5c$default11;
            jM1976copywmQWz5c$default3 = j85;
        }
        long jM1185getError0d7_KjU3 = (i5 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1185getError0d7_KjU() : j100;
        long jM1976copywmQWz5c$default12 = (32768 & i5) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1191getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j101;
        long jM1976copywmQWz5c$default13 = (65536 & i5) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j102;
        if ((131072 & i5) != 0) {
            long j116 = jM1976copywmQWz5c$default13;
            jM1976copywmQWz5c$default4 = Color.m1976copywmQWz5c$default(j116, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j110 = j116;
        } else {
            j110 = jM1976copywmQWz5c$default13;
            jM1976copywmQWz5c$default4 = j103;
        }
        long jM1185getError0d7_KjU4 = (262144 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1185getError0d7_KjU() : j104;
        long jM1976copywmQWz5c$default14 = (524288 & i5) != 0 ? Color.m1976copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1190getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j105;
        long jM1976copywmQWz5c$default15 = (i5 & PKIFailureInfo.badCertTemplate) != 0 ? Color.m1976copywmQWz5c$default(jM1976copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j106;
        if (ComposerKt.isTraceInProgress()) {
            j111 = jM1976copywmQWz5c$default15;
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:397)");
        } else {
            j111 = jM1976copywmQWz5c$default15;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1976copywmQWz5c$default5, jM1976copywmQWz5c$default6, jM1191getPrimary0d7_KjU, jM1185getError0d7_KjU, jM1976copywmQWz5c$default8, j107, jM1185getError0d7_KjU2, jM1976copywmQWz5c$default, j108, jM1976copywmQWz5c$default2, j114, j109, jM1976copywmQWz5c$default3, jM1185getError0d7_KjU3, jM1976copywmQWz5c$default7, jM1976copywmQWz5c$default12, j110, jM1976copywmQWz5c$default4, jM1185getError0d7_KjU4, jM1976copywmQWz5c$default14, j111, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    @NotNull
    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1268textFieldWithLabelPaddinga9UjIt4(float start, float end2, float top, float bottom) {
        return PaddingKt.m860PaddingValuesa9UjIt4(start, top, end2, bottom);
    }

    @NotNull
    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1269textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end2, float bottom) {
        return PaddingKt.m860PaddingValuesa9UjIt4(start, top, end2, bottom);
    }
}
