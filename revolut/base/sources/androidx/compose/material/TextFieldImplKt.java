package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import v1.l0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a½\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010%\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010(\u001a\u00020&*\u00020&2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b/\u0010.\"\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u001a\u00105\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104\"\u001a\u0010;\u001a\u0004\u0018\u000108*\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "border", "CommonDecorationBox", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "content", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "defaultErrorSemantics", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "heightOrZero", "Landroidx/compose/ui/unit/Dp;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextFieldImplKt {
    private static final float TextFieldPadding = Dp.m3297constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m3297constructorimpl(12);

    /* JADX INFO: renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 implements oim.p {
        final /* synthetic */ Function2<Composer, Integer, Unit> $border;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $shouldOverrideTextStyleColor;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ String $transformedText;
        final /* synthetic */ TextFieldType $type;

        /* JADX INFO: renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, TextFieldColors textFieldColors, boolean z, boolean z3, InteractionSource interactionSource, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function25, boolean z4, PaddingValues paddingValues, boolean z6, Function2<? super Composer, ? super Integer, Unit> function26) {
            this.$label = function2;
            this.$placeholder = function22;
            this.$transformedText = str;
            this.$colors = textFieldColors;
            this.$enabled = z;
            this.$isError = z3;
            this.$interactionSource = interactionSource;
            this.$leadingIcon = function23;
            this.$trailingIcon = function24;
            this.$shape = shape;
            this.$type = textFieldType;
            this.$innerTextField = function25;
            this.$singleLine = z4;
            this.$contentPadding = paddingValues;
            this.$shouldOverrideTextStyleColor = z6;
            this.$border = function26;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_RIQooxk$lambda$0$0(float f, long j2, Function2 function2, boolean z, long j3, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(723429411, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                }
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme.getTypography(composer, 6).getSubtitle1(), materialTheme.getTypography(composer, 6).getCaption(), f);
                if (z) {
                    textStyleLerp = TextStyle.m2967copyp1EtxEg$default(textStyleLerp, j3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                }
                TextFieldImplKt.m1272DecorationeuL9pac(j2, textStyleLerp, null, function2, composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_RIQooxk$lambda$1(float f, TextFieldColors textFieldColors, boolean z, Function2 function2, Modifier modifier, Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(modifier) ? 4 : 2;
            }
            if (composer.shouldExecute((i & 19) != 18, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-426706263, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                }
                Modifier modifierAlpha = AlphaKt.alpha(modifier, f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
                Function2 function2T = t61.a.t(companion, composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM1662constructorimpl, currentCompositionLocalMap);
                if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    v1.c.B(function2T, currentCompositeKeyHash, composerM1662constructorimpl, currentCompositeKeyHash);
                }
                Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextFieldImplKt.m1272DecorationeuL9pac(textFieldColors.placeholderColor(z, composer, 0).getValue().getValue(), MaterialTheme.INSTANCE.getTypography(composer, 6).getSubtitle1(), null, function2, composer, 0, 4);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_RIQooxk$lambda$2$0(long j2, Function2 function2, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-317090443, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                }
                TextFieldImplKt.m1272DecorationeuL9pac(j2, null, null, function2, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_RIQooxk$lambda$3$0(long j2, Function2 function2, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(262889693, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                }
                TextFieldImplKt.m1272DecorationeuL9pac(j2, null, null, function2, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_RIQooxk$lambda$5(MutableState mutableState, PaddingValues paddingValues, Function2 function2, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1107746014, i, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                }
                Modifier modifierM1230outlineCutout12SF9DM = OutlinedTextFieldKt.m1230outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, "border"), ((Size) mutableState.getValue()).getPackedValue(), paddingValues);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1230outlineCutout12SF9DM);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
                Function2 function2T = t61.a.t(companion, composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM1662constructorimpl, currentCompositionLocalMap);
                if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    v1.c.B(function2T, currentCompositeKeyHash, composerM1662constructorimpl, currentCompositeKeyHash);
                }
                Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (function2 == null) {
                    composer.startReplaceGroup(-1295979683);
                } else {
                    composer.startReplaceGroup(235288868);
                    function2.invoke(composer, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_RIQooxk$lambda$6$0(float f, MutableState mutableState, Size size) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (size.getPackedValue() >> 32)) * f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size.getPackedValue() & BodyPartID.bodyIdMax)) * f;
            if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).getPackedValue() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).getPackedValue() & BodyPartID.bodyIdMax)) != fIntBitsToFloat2) {
                mutableState.setValue(Size.m1861boximpl(Size.m1862constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax))));
            }
            return Unit.f186387a;
        }

        @Override // oim.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            m1273invokeRIQooxk(((Number) obj2).floatValue(), ((Color) obj3).getValue(), ((Color) obj4).getValue(), ((Number) obj5).floatValue(), (Composer) obj6, ((Number) obj7).intValue());
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke-RIQooxk, reason: not valid java name */
        public final void m1273invokeRIQooxk(float f, long j2, final long j3, final float f4, Composer composer, int i) {
            int i2;
            long j5;
            int i3;
            ComposableLambda composableLambda;
            ComposableLambda composableLambda2;
            ComposableLambda composableLambda3;
            final float f5 = f;
            if ((i & 6) == 0) {
                i2 = (composer.changed(f5) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                j5 = j2;
                i2 |= composer.changed(j5) ? 32 : 16;
            } else {
                j5 = j2;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(j3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changed(f4) ? 2048 : 1024;
            }
            int i5 = i2;
            if (!composer.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(33336375, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
            }
            final Function2<Composer, Integer, Unit> function2 = this.$label;
            ComposableLambda composableLambdaRememberComposableLambda = null;
            if (function2 == null) {
                composer.startReplaceGroup(986681709);
                composer.endReplaceGroup();
                i3 = 54;
            } else {
                composer.startReplaceGroup(986681710);
                final boolean z = this.$shouldOverrideTextStyleColor;
                i3 = 54;
                final long j16 = j5;
                Function2 function22 = new Function2() { // from class: androidx.compose.material.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$0$0(f5, j3, function2, z, j16, (Composer) obj2, iIntValue);
                    }
                };
                f5 = f5;
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(723429411, true, function22, composer, 54);
                composer.endReplaceGroup();
            }
            ComposableLambda composableLambda4 = composableLambdaRememberComposableLambda;
            if (this.$placeholder == null || this.$transformedText.length() != 0 || f4 <= BitmapDescriptorFactory.HUE_RED) {
                composer.startReplaceGroup(988093542);
                composer.endReplaceGroup();
                composableLambda = null;
            } else {
                composer.startReplaceGroup(987666549);
                final TextFieldColors textFieldColors = this.$colors;
                final boolean z3 = this.$enabled;
                final Function2<Composer, Integer, Unit> function23 = this.$placeholder;
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-426706263, true, new Function3() { // from class: androidx.compose.material.m
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$1(f4, textFieldColors, z3, function23, (Modifier) obj2, (Composer) obj3, iIntValue);
                    }
                }, composer, i3);
                composer.endReplaceGroup();
                composableLambda = composableLambdaRememberComposableLambda2;
            }
            final long value = this.$colors.leadingIconColor(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().getValue();
            final Function2<Composer, Integer, Unit> function24 = this.$leadingIcon;
            if (function24 == null) {
                composer.startReplaceGroup(988282301);
                composer.endReplaceGroup();
                composableLambda2 = null;
            } else {
                composer.startReplaceGroup(988282302);
                final int i6 = 0;
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-317090443, true, new Function2() { // from class: androidx.compose.material.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i21 = i6;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i21) {
                            case 0:
                                return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$2$0(value, function24, composer2, iIntValue);
                            default:
                                return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$3$0(value, function24, composer2, iIntValue);
                        }
                    }
                }, composer, i3);
                composer.endReplaceGroup();
                composableLambda2 = composableLambdaRememberComposableLambda3;
            }
            final long value2 = this.$colors.trailingIconColor(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().getValue();
            final Function2<Composer, Integer, Unit> function25 = this.$trailingIcon;
            if (function25 == null) {
                composer.startReplaceGroup(988575964);
                composer.endReplaceGroup();
                composableLambda3 = null;
            } else {
                composer.startReplaceGroup(988575965);
                final int i21 = 1;
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(262889693, true, new Function2() { // from class: androidx.compose.material.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i212 = i21;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i212) {
                            case 0:
                                return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$2$0(value2, function25, composer2, iIntValue);
                            default:
                                return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$3$0(value2, function25, composer2, iIntValue);
                        }
                    }
                }, composer, i3);
                composer.endReplaceGroup();
                composableLambda3 = composableLambdaRememberComposableLambda4;
            }
            Modifier modifierM612backgroundbw27NRU = BackgroundKt.m612backgroundbw27NRU(Modifier.INSTANCE, this.$colors.backgroundColor(this.$enabled, composer, 0).getValue().getValue(), this.$shape);
            int i22 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
            if (i22 == 1) {
                composer.startReplaceGroup(988856360);
                TextFieldKt.TextFieldLayout(modifierM612backgroundbw27NRU, this.$innerTextField, composableLambda4, composableLambda, composableLambda2, composableLambda3, this.$singleLine, f, this.$contentPadding, composer, (i5 << 21) & 29360128);
                composer.endReplaceGroup();
            } else {
                if (i22 != 2) {
                    composer.startReplaceGroup(1971561250);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(989436742);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1861boximpl(Size.INSTANCE.m1875getZeroNHjbRc()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final MutableState mutableState = (MutableState) objRememberedValue;
                final PaddingValues paddingValues = this.$contentPadding;
                final Function2<Composer, Integer, Unit> function26 = this.$border;
                ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(-1107746014, true, new Function2() { // from class: androidx.compose.material.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$5(mutableState, paddingValues, function26, (Composer) obj2, iIntValue);
                    }
                }, composer, i3);
                Function2<Composer, Integer, Unit> function27 = this.$innerTextField;
                boolean z4 = this.$singleLine;
                boolean z6 = (i5 & 14) == 4;
                Object objRememberedValue2 = composer.rememberedValue();
                if (z6 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: androidx.compose.material.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$6$0(f5, mutableState, (Size) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifierM612backgroundbw27NRU, function27, composableLambda, composableLambda4, composableLambda2, composableLambda3, z4, f5, (Function1) objRememberedValue2, composableLambdaRememberComposableLambda5, this.$contentPadding, composer, 805306368 | ((i5 << 21) & 29360128), 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void CommonDecorationBox(@NotNull final TextFieldType textFieldType, @NotNull final String str, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final boolean z, final boolean z3, final boolean z4, @NotNull final InteractionSource interactionSource, @NotNull final PaddingValues paddingValues, @NotNull final Shape shape, @NotNull final TextFieldColors textFieldColors, final Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i6;
        Composer composer2;
        boolean z6;
        TextFieldTransitionScope textFieldTransitionScope;
        Integer num;
        Composer composerStartRestartGroup = composer.startRestartGroup(418608794);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function27 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
        } else {
            function27 = function2;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 = 196608;
            function28 = function23;
            i3 |= composerStartRestartGroup.changedInstance(function28) ? 131072 : 65536;
        } else {
            i5 = 196608;
            function28 = function23;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i6 = i2 | (composerStartRestartGroup.changed(z4) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(textFieldColors) ? 16384 : 8192;
        }
        if ((i2 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function26) ? 131072 : 65536;
        }
        int i21 = i6;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (74899 & i21) == 74898) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418608794, i3, i21, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z11 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String text = ((TransformedText) objRememberedValue).getText().getText();
            InputPhase inputPhase = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i21 >> 3) & 14).getValue().booleanValue() ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            Function3 function3 = new Function3() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return Color.m1972boximpl(m1274invokeXeAY9LY((InputPhase) obj2, (Composer) obj3, ((Number) obj4).intValue()));
                }

                /* JADX INFO: renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1274invokeXeAY9LY(InputPhase inputPhase2, Composer composer3, int i22) {
                    composer3.startReplaceGroup(1423138213);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1423138213, i22, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
                    }
                    long value = textFieldColors.labelColor(z3, inputPhase2 == InputPhase.UnfocusedEmpty ? false : z4, interactionSource, composer3, 0).getValue().getValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return value;
                }
            };
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long jM2972getColor0d7_KjU = subtitle1.m2972getColor0d7_KjU();
            Color.Companion companion = Color.INSTANCE;
            boolean z12 = (Color.m1978equalsimpl0(jM2972getColor0d7_KjU, companion.m1994getUnspecified0d7_KjU()) && !Color.m1978equalsimpl0(caption.m2972getColor0d7_KjU(), companion.m1994getUnspecified0d7_KjU())) || (!Color.m1978equalsimpl0(subtitle1.m2972getColor0d7_KjU(), companion.m1994getUnspecified0d7_KjU()) && Color.m1978equalsimpl0(caption.m2972getColor0d7_KjU(), companion.m1994getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1443813555);
            long jM2972getColor0d7_KjU2 = materialTheme.getTypography(composerStartRestartGroup, 6).getCaption().m2972getColor0d7_KjU();
            if (z12) {
                z6 = z12;
                composerStartRestartGroup.startReplaceGroup(-887928539);
                if (jM2972getColor0d7_KjU2 != 16) {
                    num = 0;
                } else {
                    num = 0;
                    jM2972getColor0d7_KjU2 = ((Color) function3.invoke(inputPhase, composerStartRestartGroup, null)).getValue();
                }
                composerStartRestartGroup.endReplaceGroup();
                textFieldTransitionScope = textFieldTransitionScope2;
            } else {
                z6 = z12;
                textFieldTransitionScope = textFieldTransitionScope2;
                num = 0;
                composerStartRestartGroup.startReplaceGroup(1218284988);
                composerStartRestartGroup.endReplaceGroup();
            }
            long j2 = jM2972getColor0d7_KjU2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443806289);
            long jM2972getColor0d7_KjU3 = materialTheme.getTypography(composerStartRestartGroup, 6).getSubtitle1().m2972getColor0d7_KjU();
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1026713946);
                if (jM2972getColor0d7_KjU3 == 16) {
                    jM2972getColor0d7_KjU3 = ((Color) function3.invoke(inputPhase, composerStartRestartGroup, num)).getValue();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(798166043);
                composerStartRestartGroup.endReplaceGroup();
            }
            long j3 = jM2972getColor0d7_KjU3;
            composerStartRestartGroup.endReplaceGroup();
            InputPhase inputPhase2 = inputPhase;
            composer2 = composerStartRestartGroup;
            textFieldTransitionScope.m1279TransitionDTcfvLk(inputPhase2, j2, j3, function3, function22 != null, ComposableLambdaKt.rememberComposableLambda(33336375, true, new AnonymousClass3(function22, function28, text, textFieldColors, z3, z4, interactionSource, function24, function25, shape, textFieldType, function27, z, paddingValues, z6, function26), composer2, 54), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v1.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return TextFieldImplKt.CommonDecorationBox$lambda$3(textFieldType, str, function2, visualTransformation, function22, function23, function24, function25, z, z3, z4, interactionSource, paddingValues, shape, textFieldColors, function26, i, i2, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$3(TextFieldType textFieldType, String str, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, Function2 function26, int i, int i2, Composer composer, int i3) {
        CommonDecorationBox(textFieldType, str, function2, visualTransformation, function22, function23, function24, function25, z, z3, z4, interactionSource, paddingValues, shape, textFieldColors, function26, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m1272DecorationeuL9pac(long j2, TextStyle textStyle, Float f, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        TextStyle textStyle2;
        Float f4;
        Composer composerStartRestartGroup = composer.startRestartGroup(2064632657);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            TextStyle textStyle3 = i5 != 0 ? null : textStyle;
            Float f5 = i6 != 0 ? null : f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064632657, i3, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-650790565, true, new l0(j2, f5, function2), composerStartRestartGroup, 54);
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceGroup(-162880673);
                TextKt.ProvideTextStyle(textStyle3, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceGroup(-162879037);
                composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f4 = f5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            textStyle2 = textStyle;
            f4 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v1.q(j2, textStyle2, f4, function2, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_euL9pac$lambda$0(long j2, Float f, Function2 function2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650790565, i, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m1972boximpl(j2)), ComposableLambdaKt.rememberComposableLambda(-1624601445, true, new l0(f, function2, j2, 1), composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_euL9pac$lambda$0$0(Float f, Function2 function2, long j2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624601445, i, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
            }
            if (f != null) {
                composer.startReplaceGroup(1484860324);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1485059902);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1979getAlphaimpl(j2))), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_euL9pac$lambda$1(long j2, TextStyle textStyle, Float f, Function2 function2, int i, int i2, Composer composer, int i3) {
        m1272DecorationeuL9pac(j2, textStyle, f, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    @NotNull
    public static final Modifier defaultErrorSemantics(@NotNull Modifier modifier, boolean z, @NotNull String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new uo7.k(str, 14), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultErrorSemantics$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return Unit.f186387a;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
