package com.fourthline.orca.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.youTransactor.uCube.rpc.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a80 {

    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f26724a;

        public a(MutableState mutableState) {
            this.f26724a = mutableState;
        }

        public final Boolean a(KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-event$0");
            if (KeyEventType.m2391equalsimpl0(KeyEvent_androidKt.m2396getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m2392getKeyDownCS__XNY()) && Key.m2352equalsimpl0(KeyEvent_androidKt.m2395getKeyZmokQxo(keyEvent), Key.INSTANCE.m2356getBackspaceEK5gGoQ())) {
                String text = ((TextFieldValue) this.f26724a.getValue()).getText();
                int iM2959getStartimpl = TextRange.m2959getStartimpl(((TextFieldValue) this.f26724a.getValue()).getSelection());
                if (!KeyEvent_androidKt.m2399isCtrlPressedZmokQxo(keyEvent) && text.length() > 0 && Intrinsics.f(((TextFieldValue) this.f26724a.getValue()).getText(), text) && iM2959getStartimpl > 0) {
                    int i = iM2959getStartimpl - 1;
                    this.f26724a.setValue(new TextFieldValue(kotlin.text.d0.f0(text, i, iM2959getStartimpl).toString(), TextRangeKt.TextRange(i), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            return a(((androidx.compose.ui.input.key.KeyEvent) obj2).getNativeKeyEvent());
        }
    }

    public static final Modifier a(Modifier drawBehindWithShadow, final long j2, final long j3, final float f, final float f4, final float f5, final float f6, final float f32) {
        Intrinsics.checkNotNullParameter(drawBehindWithShadow, "$this$drawBehindWithShadow");
        return ComposedModifierKt.composed$default(drawBehindWithShadow, null, new Function3() { // from class: com.fourthline.orca.internal.wi1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return a80.a(j3, f, j2, f5, f32, f6, f4, (Modifier) obj2, (Composer) obj3, iIntValue);
            }
        }, 1, null);
    }

    public static final Modifier b(Modifier modifier, String name) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return a(modifier, name, (String) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier a(long j2, float f, long j3, final float f4, final float f5, final float f6, final float f32, Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(813013016);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(813013016, i, -1, "com.fourthline.orca.core.internal.extension.drawBehindWithShadow.<anonymous> (ModifierExtensions.kt:55)");
        }
        final int iM2002toArgb8_81llA = ColorKt.m2002toArgb8_81llA(Color.m1976copywmQWz5c$default(j2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
        final int iM2002toArgb8_81llA2 = ColorKt.m2002toArgb8_81llA(j3);
        boolean zChanged = composer.changed(iM2002toArgb8_81llA2) | composer.changed(f4) | composer.changed(f5) | composer.changed(f6) | composer.changed(iM2002toArgb8_81llA) | composer.changed(f32);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function1 function1 = new Function1() { // from class: com.fourthline.orca.internal.xi1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a80.a(iM2002toArgb8_81llA2, f4, f5, f6, iM2002toArgb8_81llA, f32, (DrawScope) obj2);
                }
            };
            composer.updateRememberedValue(function1);
            objRememberedValue = function1;
        }
        Modifier modifierDrawBehind = DrawModifierKt.drawBehind(composed, (Function1) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawBehind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semantics, str);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.f186387a;
    }

    public static /* synthetic */ Modifier a(Modifier modifier, long j2, long j3, long j5, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 64) != 0) {
            f6 = f4;
        }
        return a(modifier, j2, j3, j5, f, f4, f5, f6);
    }

    public static final Modifier a(Modifier drawOutlineWithShadow, long j2, long j3, long j5, float f, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(drawOutlineWithShadow, "$this$drawOutlineWithShadow");
        return DrawModifierKt.drawBehind(a(drawOutlineWithShadow, j5, j3, BitmapDescriptorFactory.HUE_RED, f6, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 100, (Object) null), new yi1(f4, f, j2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, float f, float f4, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() >> 32));
        DrawScope.m2209drawRoundRectuAw5IA$default(drawBehind, j2, 0L, Size.m1862constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), CornerRadius.m1820constructorimpl((((long) Float.floatToRawIntBits(f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32)), new Stroke(f4, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), BitmapDescriptorFactory.HUE_RED, null, 0, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION, null);
        return Unit.f186387a;
    }

    public static /* synthetic */ Modifier a(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return a(modifier, z, str, role, function0);
    }

    public static final Modifier a(Modifier clickableWithoutAnimation, boolean z, String str, Role role, Function0 onClick) {
        Intrinsics.checkNotNullParameter(clickableWithoutAnimation, "$this$clickableWithoutAnimation");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(clickableWithoutAnimation, null, new ui1(z, str, role, onClick), 1, null);
    }

    public static final Modifier a(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new bi1(9), 1, null);
    }

    public static final Modifier a(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new aj1(f, 0), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalIndex(semantics, f);
        return Unit.f186387a;
    }

    public static /* synthetic */ Modifier a(Modifier modifier, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(modifier, str, z);
    }

    public static final Modifier a(Modifier modifier, String description, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        if (z) {
            return SemanticsModifierKt.clearAndSetSemantics(modifier, new zi1(description, 1));
        }
        return SemanticsModifierKt.semantics$default(modifier, false, new zi1(description, 2), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, str);
        return Unit.f186387a;
    }

    public static final Modifier a(Modifier modifier, Float f, String currentValue, String description, r20 format) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(format, "format");
        return SemanticsModifierKt.semantics$default(modifier, false, new vi1(f, format, currentValue, description, 0), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Float f, r20 r20Var, String str, String str2, SemanticsPropertyReceiver semantics) throws IOException {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (f != null) {
            SemanticsPropertiesKt.setTraversalIndex(semantics, f.floatValue());
        }
        if (r20Var == r20.f32618c) {
            List listK = zhm.v.k(kotlin.text.f0.U0(2, str), kotlin.text.f0.U0(2, kotlin.text.f0.N0(2, str)), kotlin.text.f0.N0(4, str));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listK) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            str = zhm.d0.k0(arrayList, " ", null, null, 0, null, 62);
        } else if (r20Var == r20.f32617b) {
            str = zhm.d0.k0(kotlin.text.d0.n0(str, new String[]{""}, 0, 6), " ", null, null, 0, null, 62);
        }
        if (r20Var == r20.d) {
            SemanticsPropertiesKt.m2838setRolekuIjeqM(semantics, Role.INSTANCE.m2825getDropdownListo7Vup1c());
            SemanticsPropertiesKt.setContentDescription(semantics, str2);
        } else {
            SemanticsPropertiesKt.setEditableText(semantics, new AnnotatedString(str2 + ". " + str + ".", null, 2, null));
        }
        return Unit.f186387a;
    }

    public static final Modifier a(Modifier modifier, boolean z, MutableState textFieldValue) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        return z ? KeyInputModifierKt.onKeyEvent(modifier, new a(textFieldValue)) : modifier;
    }

    public static final Modifier a(Modifier modifier, String str) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, new zi1(str, 0));
    }

    public static /* synthetic */ Modifier a(Modifier modifier, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = null;
        }
        return a(modifier, str);
    }

    public static final Modifier a(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? SemanticsModifierKt.clearAndSetSemantics(modifier, new bi1(8)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.f186387a;
    }

    public static /* synthetic */ Modifier a(Modifier modifier, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return a(modifier, str, str2);
    }

    public static final Modifier a(Modifier modifier, String tag2, String prefix) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (prefix.length() != 0) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            tag2 = prefix + kotlin.text.a0.p(tag2, ROOT);
        }
        return TestTagKt.testTag(modifier, tag2);
    }

    public static /* synthetic */ Modifier a(Modifier modifier, float f, float f4, long j2, Shape shape, int i, Object obj2) {
        float f5;
        if ((i & 4) != 0) {
            j2 = ColorKt.Color$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, null, 16, null);
            f5 = f4;
        } else {
            f5 = f4;
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return a(modifier, f, f5, j3, shape);
    }

    public static final Modifier a(Modifier elevation, float f, float f4, long j2, Shape shape) {
        Intrinsics.checkNotNullParameter(elevation, "$this$elevation");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ShadowKt.m1748shadows4CzXII$default(elevation, f, shape, false, 0L, j2, 12, null);
    }

    public static /* synthetic */ Modifier a(Modifier modifier, long j2, long j3, float f, float f4, float f5, float f6, float f32, int i, Object obj2) {
        return a(modifier, j2, j3, (i & 4) != 0 ? 0.2f : f, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? Dp.m3297constructorimpl(20) : f5, (i & 32) != 0 ? Dp.m3297constructorimpl(0) : f6, (i & 64) != 0 ? Dp.m3297constructorimpl(0) : f32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, float f, float f4, float f5, int i2, float f6, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Canvas canvas = drawBehind.getDrawContext().getCanvas();
        Paint Paint = AndroidPaint_androidKt.Paint();
        android.graphics.Paint paintAsFrameworkPaint = Paint.getInternalPaint();
        paintAsFrameworkPaint.setColor(i);
        paintAsFrameworkPaint.setShadowLayer(drawBehind.mo768toPx0680j_4(f), drawBehind.mo768toPx0680j_4(f4), drawBehind.mo768toPx0680j_4(f5), i2);
        canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)), f6, f6, Paint);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier a(boolean z, String str, Role role, Function0 function0, Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1245072741);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1245072741, i, -1, "com.fourthline.orca.core.internal.extension.clickableWithoutAnimation.<anonymous> (ModifierExtensions.kt:116)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierM628clickableO2vRcR0 = ClickableKt.m628clickableO2vRcR0(composed, (MutableInteractionSource) objRememberedValue, null, z, str, role, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM628clickableO2vRcR0;
    }
}
