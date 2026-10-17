package com.fourthline.orca.core.flavor;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.AndroidFontKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.unit.TextUnitKt;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaFonts;
import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.ar0;
import com.fourthline.orca.internal.b30;
import com.fourthline.orca.internal.b81;
import com.fourthline.orca.internal.br0;
import com.fourthline.orca.internal.c;
import com.fourthline.orca.internal.c10;
import com.fourthline.orca.internal.ch0;
import com.fourthline.orca.internal.di0;
import com.fourthline.orca.internal.e1;
import com.fourthline.orca.internal.ea;
import com.fourthline.orca.internal.i8;
import com.fourthline.orca.internal.k41;
import com.fourthline.orca.internal.m41;
import com.fourthline.orca.internal.mz;
import com.fourthline.orca.internal.o41;
import com.fourthline.orca.internal.p41;
import com.fourthline.orca.internal.pf;
import com.fourthline.orca.internal.q41;
import com.fourthline.orca.internal.r21;
import com.fourthline.orca.internal.sh0;
import com.fourthline.orca.internal.w50;
import com.fourthline.orca.internal.wi0;
import com.fourthline.orca.internal.xi0;
import com.fourthline.orca.internal.yi0;
import com.fourthline.orca.internal.z8;
import com.fourthline.vision.internal.qh;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nb.a;
import nb.b;
import nb.d;
import nb.e;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0000H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0000H\u0003¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\"*\u00020\u0000H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0000H\u0003¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010)\u001a\u00020(*\u00020\u0000H\u0003¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020+*\u00020\u0000H\u0001¢\u0006\u0004\b,\u0010-\u001a#\u00102\u001a\u0012\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.j\u0002`1*\u00020\u0000H\u0003¢\u0006\u0004\b2\u00103\u001a'\u0010 \u001a\u0016\u0012\u0004\u0012\u00020/\u0012\b\u0012\u000605j\u0002`60.j\u0002`7*\u000204H\u0002¢\u0006\u0004\b \u00108\u001a'\u0010 \u001a\u00020=*\u00020\u00002\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;09H\u0003¢\u0006\u0004\b \u0010>\u001a3\u0010 \u001a\u00020C*\u00020\u00002\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B09H\u0003¢\u0006\u0004\b \u0010D\u001a\u0013\u0010F\u001a\u00020E*\u00020;H\u0000¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "Lcom/fourthline/orca/internal/wi0;", "toOrcaStyling", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/wi0;", "Lcom/fourthline/orca/internal/yi0$b;", "c", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/yi0$b;", "Lcom/fourthline/orca/internal/yi0$f;", "j", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/yi0$f;", "Lcom/fourthline/orca/internal/yi0$i;", "l", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/yi0$i;", "Lcom/fourthline/orca/internal/yi0$e;", "g", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/yi0$e;", "Lcom/fourthline/orca/internal/q41;", "n", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/q41;", "Lcom/fourthline/orca/internal/pf;", "f", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/pf;", "Lcom/fourthline/orca/internal/br0;", "m", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/br0;", "Lcom/fourthline/orca/internal/c10;", "h", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/c10;", "Lcom/fourthline/orca/internal/p41;", "k", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/p41;", "Lcom/fourthline/orca/internal/c;", "a", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/c;", "Lcom/fourthline/orca/internal/e1;", "b", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/e1;", "Lcom/fourthline/orca/internal/m41;", "d", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/m41;", "Lcom/fourthline/orca/internal/o41;", "i", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/o41;", "Lcom/fourthline/orca/internal/xi0;", "toStylingDefaults", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/xi0;", "", "", "Lcom/fourthline/orca/internal/di0;", "Lcom/fourthline/orca/core/internal/styling/OrcaColorDefaults;", "e", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Landroidx/compose/runtime/Composer;I)Ljava/util/Map;", "Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lcom/fourthline/orca/core/internal/styling/OrcaRadiusDefaults;", "(Lcom/fourthline/orca/core/flavor/OrcaLayouts;)Ljava/util/Map;", "Lkotlin/Function1;", "Lcom/fourthline/orca/core/flavor/OrcaFonts;", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "path", "Lcom/fourthline/orca/internal/mz;", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/fourthline/orca/internal/mz;", "", "alpha", "Lcom/fourthline/orca/core/flavor/OrcaColors;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "Lcom/fourthline/orca/internal/ea;", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/fourthline/orca/internal/ea;", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "(Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;)Landroidx/compose/ui/text/font/FontFamily;", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class OrcaFlavorExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font A(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor A0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getConfirmation().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font B(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPrimaryButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor B0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getConfirmation().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font C(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor C0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getScannerPrimary().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font D(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getConfirmationScreenCheckpoints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor D0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getScannerPrimary().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font E(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor E0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getSpinnerColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font F(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor F0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font G(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPrimaryButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor G0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font H(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInputField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor H0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font I(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInputField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor I0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font J(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInputFieldPlaceholder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor J0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getPrimary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font K(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInputFieldTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor K0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getPrimary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font L(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInputFieldStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor L0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor M(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getPrimaryColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor M0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor N(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor N0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor O(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor O0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getDisabledBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor P(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor P0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor Q(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor Q0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getPlaceholderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor R(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor R0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor S(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor S0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getStatusColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor T(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor T0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getInputField().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor U(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor V(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor W(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor X(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor Y(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor Z(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getTextColor();
    }

    private static final c a(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1614567418, i, -1, "com.fourthline.orca.core.flavor.toAccordionElement (OrcaFlavorExtensions.kt:400)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new a(8);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new a(10);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i3, 1);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new a(11);
            composer.updateRememberedValue(objRememberedValue3);
        }
        int i5 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue3, composer, i5);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new a(12);
            composer.updateRememberedValue(objRememberedValue4);
        }
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i3, 1));
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new a(13);
            composer.updateRememberedValue(objRememberedValue5);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue5, composer, i5);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new a(14);
            composer.updateRememberedValue(objRememberedValue6);
        }
        a81 a81Var2 = new a81(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue6, composer, i3, 1));
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new a(15);
            composer.updateRememberedValue(objRememberedValue7);
        }
        c cVar = new c(eaVarA, eaVarA2, a81Var, a81Var2, a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i3, 1), 4, new i8(ea.INSTANCE.a(Color.INSTANCE.m1987getBlack0d7_KjU()), 1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor a0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getMessageColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor b(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor b0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getLinkButtonColor();
    }

    private static final yi0.b c(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(640935626, i, -1, "com.fourthline.orca.core.flavor.toButtonElements (OrcaFlavorExtensions.kt:58)");
        }
        int primaryButtonCornerRadius = orcaFlavor.getLayouts().getPrimaryButtonCornerRadius();
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new e(10);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new qh(29);
            composer.updateRememberedValue(objRememberedValue2);
        }
        br0 br0Var = new br0(eaVarA, new ar0(a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i3, 1), 0.5f));
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new a(0);
            composer.updateRememberedValue(objRememberedValue3);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i3, 1);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new a(1);
            composer.updateRememberedValue(objRememberedValue4);
        }
        ea eaVarA3 = a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i3, 1);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new a(2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        int i5 = i2 | 48;
        a81 a81Var = new a81(a(orcaFlavor, (Function1) objRememberedValue5, composer, i5), eaVarA3);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new a(3);
            composer.updateRememberedValue(objRememberedValue6);
        }
        k41 k41Var = new k41(primaryButtonCornerRadius, br0Var, new z8(a81Var, eaVarA2, new i8(a(orcaFlavor, null, (Function1) objRememberedValue6, composer, i3, 1), 2), 1.0f), null, 8, null);
        int primaryButtonCornerRadius2 = orcaFlavor.getLayouts().getPrimaryButtonCornerRadius();
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new a(4);
            composer.updateRememberedValue(objRememberedValue7);
        }
        ea eaVarA4 = a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i3, 1);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new a(5);
            composer.updateRememberedValue(objRememberedValue8);
        }
        ea eaVarA5 = a(orcaFlavor, null, (Function1) objRememberedValue8, composer, i3, 1);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new a(6);
            composer.updateRememberedValue(objRememberedValue9);
        }
        a81 a81Var2 = new a81(a(orcaFlavor, (Function1) objRememberedValue9, composer, i5), eaVarA5);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new a(7);
            composer.updateRememberedValue(objRememberedValue10);
        }
        k41 k41Var2 = new k41(primaryButtonCornerRadius2, null, new z8(a81Var2, eaVarA4, new i8(a(orcaFlavor, null, (Function1) objRememberedValue10, composer, i3, 1), 2), 1.0f), null, 10, null);
        int primaryButtonCornerRadius3 = orcaFlavor.getLayouts().getPrimaryButtonCornerRadius();
        ea.Companion aVar = ea.INSTANCE;
        ea eaVarB = aVar.b();
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new e(11);
            composer.updateRememberedValue(objRememberedValue11);
        }
        ea eaVarA6 = a(orcaFlavor, null, (Function1) objRememberedValue11, composer, i3, 1);
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new e(12);
            composer.updateRememberedValue(objRememberedValue12);
        }
        yi0.b bVar = new yi0.b(k41Var, k41Var2, new k41(primaryButtonCornerRadius3, null, new z8(new a81(a(orcaFlavor, (Function1) objRememberedValue12, composer, i5), eaVarA6), eaVarB, new i8(aVar.b(), 2), 1.0f), null, 10, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor c0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getLinkButtonColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor d(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor d0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font e(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getSecondaryButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor e0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getGraphic().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font f(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPrimaryButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor f0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getHeaderColor();
    }

    @NotNull
    public static final FontFamily fontFamily(@NotNull OrcaFonts.Font font) {
        Intrinsics.checkNotNullParameter(font, "<this>");
        if (font instanceof OrcaFonts.Font.FromFontRes) {
            return FontFamilyKt.FontFamily(FontKt.m3004FontYpTlLL0$default(((OrcaFonts.Font.FromFontRes) font).getFontRes(), null, 0, 0, 14, null));
        }
        if (font instanceof OrcaFonts.Font.FromFile) {
            return FontFamilyKt.FontFamily(AndroidFontKt.m2990FontEj4NQ78$default(((OrcaFonts.Font.FromFile) font).getFile(), null, 0, null, 14, null));
        }
        if (font instanceof OrcaFonts.SystemFont) {
            return FontFamily.INSTANCE.getDefault();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font g(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getSecondaryButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor g0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font h(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPopupHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor h0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getMessageColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font i(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPopupMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor i0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getMessageColor();
    }

    private static final yi0.f j(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(522611108, i, -1, "com.fourthline.orca.core.flavor.toPageElement (OrcaFlavorExtensions.kt:114)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new nb.c(13);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new nb.c(15);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i5 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue2, composer, i5);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new nb.c(16);
            composer.updateRememberedValue(objRememberedValue3);
        }
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i3, 1));
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new nb.c(17);
            composer.updateRememberedValue(objRememberedValue4);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue4, composer, i5);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new nb.c(19);
            composer.updateRememberedValue(objRememberedValue5);
        }
        a81 a81Var2 = new a81(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue5, composer, i3, 1));
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new nb.c(20);
            composer.updateRememberedValue(objRememberedValue6);
        }
        mz mzVarA3 = a(orcaFlavor, (Function1) objRememberedValue6, composer, i5);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new nb.c(21);
            composer.updateRememberedValue(objRememberedValue7);
        }
        a81 a81Var3 = new a81(mzVarA3, a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i3, 1));
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new nb.c(22);
            composer.updateRememberedValue(objRememberedValue8);
        }
        mz mzVarA4 = mz.a(a(orcaFlavor, (Function1) objRememberedValue8, composer, i5), null, TextUnitKt.getSp(12), 0L, 5, null);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new nb.c(23);
            composer.updateRememberedValue(objRememberedValue9);
        }
        a81 a81Var4 = new a81(mzVarA4, a(orcaFlavor, null, (Function1) objRememberedValue9, composer, i3, 1));
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new nb.c(24);
            composer.updateRememberedValue(objRememberedValue10);
        }
        b30 b30Var = new b30((ea) null, (i8) null, 0, (a81) null, a81Var4, (a81) null, (a81) null, a(orcaFlavor, null, (Function1) objRememberedValue10, composer, i3, 1), (ea) null, (b30.c) null, 879, (DefaultConstructorMarker) null);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new nb.c(14);
            composer.updateRememberedValue(objRememberedValue11);
        }
        yi0.f fVar = new yi0.f(eaVarA, a81Var, a81Var2, a81Var3, b30Var, new yi0.g(a(orcaFlavor, null, (Function1) objRememberedValue11, composer, i3, 1), 0, 2, (DefaultConstructorMarker) null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor j0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font k(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getHintText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor k0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getBackgroundColor();
    }

    private static final yi0.i l(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1329907324, i, -1, "com.fourthline.orca.core.flavor.toScannerPageElement (OrcaFlavorExtensions.kt:141)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new b(26);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue, composer, i3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new b(8);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i5 = i2 | 384;
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i5, 1));
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new b(9);
            composer.updateRememberedValue(objRememberedValue3);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue3, composer, i3);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new b(10);
            composer.updateRememberedValue(objRememberedValue4);
        }
        a81 a81Var2 = new a81(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i5, 1));
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new b(11);
            composer.updateRememberedValue(objRememberedValue5);
        }
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue5, composer, i5, 1);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new b(12);
            composer.updateRememberedValue(objRememberedValue6);
        }
        mz mzVarA3 = a(orcaFlavor, (Function1) objRememberedValue6, composer, i3);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new b(13);
            composer.updateRememberedValue(objRememberedValue7);
        }
        a81 a81Var3 = new a81(mzVarA3, a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i5, 1));
        int primaryButtonCornerRadius = orcaFlavor.getLayouts().getPrimaryButtonCornerRadius();
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new b(14);
            composer.updateRememberedValue(objRememberedValue8);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue8, composer, i5, 1);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new b(16);
            composer.updateRememberedValue(objRememberedValue9);
        }
        i8 i8Var = new i8(a(orcaFlavor, null, (Function1) objRememberedValue9, composer, i5, 1), 2);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new b(17);
            composer.updateRememberedValue(objRememberedValue10);
        }
        mz mzVarA4 = a(orcaFlavor, (Function1) objRememberedValue10, composer, i3);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new nb.c(7);
            composer.updateRememberedValue(objRememberedValue11);
        }
        k41 k41Var = new k41(primaryButtonCornerRadius, null, new z8(new a81(mzVarA4, a(orcaFlavor, null, (Function1) objRememberedValue11, composer, i5, 1)), eaVarA2, i8Var, 1.0f), null, 10, null);
        int primaryButtonCornerRadius2 = orcaFlavor.getLayouts().getPrimaryButtonCornerRadius();
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new nb.c(18);
            composer.updateRememberedValue(objRememberedValue12);
        }
        ea eaVarA3 = a(orcaFlavor, null, (Function1) objRememberedValue12, composer, i5, 1);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new nb.c(29);
            composer.updateRememberedValue(objRememberedValue13);
        }
        i8 i8Var2 = new i8(a(orcaFlavor, null, (Function1) objRememberedValue13, composer, i5, 1), 2);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = new d(10);
            composer.updateRememberedValue(objRememberedValue14);
        }
        mz mzVarA5 = a(orcaFlavor, (Function1) objRememberedValue14, composer, i3);
        Object objRememberedValue15 = composer.rememberedValue();
        if (objRememberedValue15 == companion.getEmpty()) {
            objRememberedValue15 = new d(21);
            composer.updateRememberedValue(objRememberedValue15);
        }
        k41 k41Var2 = new k41(primaryButtonCornerRadius2, null, new z8(new a81(mzVarA5, a(orcaFlavor, null, (Function1) objRememberedValue15, composer, i5, 1)), eaVarA3, i8Var2, 1.0f), null, 10, null);
        Object objRememberedValue16 = composer.rememberedValue();
        if (objRememberedValue16 == companion.getEmpty()) {
            objRememberedValue16 = new e(2);
            composer.updateRememberedValue(objRememberedValue16);
        }
        mz mzVarA6 = a(orcaFlavor, (Function1) objRememberedValue16, composer, i3);
        Object objRememberedValue17 = composer.rememberedValue();
        if (objRememberedValue17 == companion.getEmpty()) {
            objRememberedValue17 = new e(13);
            composer.updateRememberedValue(objRememberedValue17);
        }
        a81 a81Var4 = new a81(mzVarA6, a(orcaFlavor, null, (Function1) objRememberedValue17, composer, i5, 1));
        Object objRememberedValue18 = composer.rememberedValue();
        if (objRememberedValue18 == companion.getEmpty()) {
            objRememberedValue18 = new a(9);
            composer.updateRememberedValue(objRememberedValue18);
        }
        mz mzVarA7 = a(orcaFlavor, (Function1) objRememberedValue18, composer, i3);
        Object objRememberedValue19 = composer.rememberedValue();
        if (objRememberedValue19 == companion.getEmpty()) {
            objRememberedValue19 = new a(20);
            composer.updateRememberedValue(objRememberedValue19);
        }
        a81 a81Var5 = new a81(mzVarA7, a(orcaFlavor, null, (Function1) objRememberedValue19, composer, i5, 1));
        Object objRememberedValue20 = composer.rememberedValue();
        if (objRememberedValue20 == companion.getEmpty()) {
            objRememberedValue20 = new b(1);
            composer.updateRememberedValue(objRememberedValue20);
        }
        yi0.i iVar = new yi0.i(a81Var, a81Var2, new yi0.h(eaVarA, a81Var3, k41Var, k41Var2, new b30((ea) null, (i8) null, 0, (a81) null, a81Var4, (a81) null, a81Var5, (ea) null, a(orcaFlavor, null, (Function1) objRememberedValue20, composer, i5, 1), (b30.c) null, 687, (DefaultConstructorMarker) null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor l0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor m(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getPrimary().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor m0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor n(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getPrimary().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor n0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor o(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getBackButtonColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor o0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor p(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getPrimary().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor p0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor q(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getPrimary().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor q0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getIconColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor r(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getPrimary().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor r0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getScannerText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor s(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getSecondary().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor s0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getScannerPrimary().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor t(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getSecondary().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor t0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getScannerSecondary().getBackgroundColor();
    }

    @NotNull
    public static final wi0 toOrcaStyling(@NotNull OrcaFlavor orcaFlavor, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(orcaFlavor, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1245845084, i, -1, "com.fourthline.orca.core.flavor.toOrcaStyling (OrcaFlavorExtensions.kt:39)");
        }
        int i2 = i & 14;
        wi0 wi0Var = new wi0(toStylingDefaults(orcaFlavor, composer, i2), new yi0(c(orcaFlavor, composer, i2), j(orcaFlavor, composer, i2), l(orcaFlavor, composer, i2), g(orcaFlavor, composer, i2), n(orcaFlavor, composer, i2), f(orcaFlavor, composer, i2), h(orcaFlavor, composer, i2), k(orcaFlavor, composer, i2), b(orcaFlavor, composer, i2), a(orcaFlavor, composer, i2), d(orcaFlavor, composer, i2), i(orcaFlavor, composer, i2)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return wi0Var;
    }

    @NotNull
    public static final xi0 toStylingDefaults(@NotNull OrcaFlavor orcaFlavor, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(orcaFlavor, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1460171931, i, -1, "com.fourthline.orca.core.flavor.toStylingDefaults (OrcaFlavorExtensions.kt:483)");
        }
        xi0 xi0Var = new xi0(e(orcaFlavor, composer, i & 14), r0.g(), a(orcaFlavor.getLayouts()), (sh0) null, 8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return xi0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor u(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getSecondary().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor u0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getScannerSecondary().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font v(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor v0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getScannerSecondary().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font w(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor w0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getConfirmation().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor x(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor x0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getConfirmation().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor y(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPopup().getMessageColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor y0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getConfirmation().getBulletListColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor z(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPopup().getMessageColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor z0(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Scanner java.lang.String().getScannerText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor A(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor B(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor C(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor D(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor E(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPopup().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor F(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor G(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getLinkButtonColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor H(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPalette().getInternalPalette().h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor I(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPopup().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor J(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPopup().getMessageColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor K(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getHint().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor L(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font b(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getTableElementTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font d(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getTableElementTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor e(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getTextColor();
    }

    private static final pf f(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1337959172, i, -1, "com.fourthline.orca.core.flavor.toDialogElement (OrcaFlavorExtensions.kt:275)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new nb.c(25);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new d(7);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i5 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue2, composer, i5);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new d(12);
            composer.updateRememberedValue(objRememberedValue3);
        }
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i3, 1));
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new d(13);
            composer.updateRememberedValue(objRememberedValue4);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue4, composer, i5);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new d(14);
            composer.updateRememberedValue(objRememberedValue5);
        }
        a81 a81Var2 = new a81(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue5, composer, i3, 1));
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new d(15);
            composer.updateRememberedValue(objRememberedValue6);
        }
        mz mzVarA3 = a(orcaFlavor, (Function1) objRememberedValue6, composer, i5);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new d(16);
            composer.updateRememberedValue(objRememberedValue7);
        }
        a81 a81Var3 = new a81(mzVarA3, a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i3, 1));
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new d(17);
            composer.updateRememberedValue(objRememberedValue8);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue8, composer, i3, 1);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new d(18);
            composer.updateRememberedValue(objRememberedValue9);
        }
        mz mzVarA4 = a(orcaFlavor, (Function1) objRememberedValue9, composer, i5);
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new d(19);
            composer.updateRememberedValue(objRememberedValue10);
        }
        a81 a81Var4 = new a81(mzVarA4, a(orcaFlavor, null, (Function1) objRememberedValue10, composer, i3, 1));
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new nb.c(26);
            composer.updateRememberedValue(objRememberedValue11);
        }
        pf.c cVar = new pf.c(a81Var, a81Var2, a81Var3, new b30(eaVarA2, (i8) null, 0, (a81) null, (a81) null, a81Var4, (a81) null, a(orcaFlavor, null, (Function1) objRememberedValue11, composer, i3, 1), (ea) null, (b30.c) null, 862, (DefaultConstructorMarker) null));
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new nb.c(27);
            composer.updateRememberedValue(objRememberedValue12);
        }
        ea eaVarA3 = a(orcaFlavor, null, (Function1) objRememberedValue12, composer, i3, 1);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new nb.c(28);
            composer.updateRememberedValue(objRememberedValue13);
        }
        mz mzVarA5 = a(orcaFlavor, (Function1) objRememberedValue13, composer, i5);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = new d(0);
            composer.updateRememberedValue(objRememberedValue14);
        }
        a81 a81Var5 = new a81(mzVarA5, a(orcaFlavor, null, (Function1) objRememberedValue14, composer, i3, 1));
        Object objRememberedValue15 = composer.rememberedValue();
        if (objRememberedValue15 == companion.getEmpty()) {
            objRememberedValue15 = new d(1);
            composer.updateRememberedValue(objRememberedValue15);
        }
        mz mzVarA6 = a(orcaFlavor, (Function1) objRememberedValue15, composer, i5);
        Object objRememberedValue16 = composer.rememberedValue();
        if (objRememberedValue16 == companion.getEmpty()) {
            objRememberedValue16 = new d(2);
            composer.updateRememberedValue(objRememberedValue16);
        }
        a81 a81Var6 = new a81(mzVarA6, a(orcaFlavor, null, (Function1) objRememberedValue16, composer, i3, 1));
        Object objRememberedValue17 = composer.rememberedValue();
        if (objRememberedValue17 == companion.getEmpty()) {
            objRememberedValue17 = new d(3);
            composer.updateRememberedValue(objRememberedValue17);
        }
        pf.e eVar = new pf.e(a81Var5, eaVarA3, new pf.e.c(a(orcaFlavor, null, (Function1) objRememberedValue17, composer, i3, 1), a81Var6));
        Object objRememberedValue18 = composer.rememberedValue();
        if (objRememberedValue18 == companion.getEmpty()) {
            objRememberedValue18 = new d(4);
            composer.updateRememberedValue(objRememberedValue18);
        }
        ea eaVarA4 = a(orcaFlavor, null, (Function1) objRememberedValue18, composer, i3, 1);
        Object objRememberedValue19 = composer.rememberedValue();
        if (objRememberedValue19 == companion.getEmpty()) {
            objRememberedValue19 = new d(5);
            composer.updateRememberedValue(objRememberedValue19);
        }
        mz mzVarA7 = a(orcaFlavor, (Function1) objRememberedValue19, composer, i5);
        Object objRememberedValue20 = composer.rememberedValue();
        if (objRememberedValue20 == companion.getEmpty()) {
            objRememberedValue20 = new d(6);
            composer.updateRememberedValue(objRememberedValue20);
        }
        a81 a81Var7 = new a81(mzVarA7, a(orcaFlavor, null, (Function1) objRememberedValue20, composer, i3, 1));
        Object objRememberedValue21 = composer.rememberedValue();
        if (objRememberedValue21 == companion.getEmpty()) {
            objRememberedValue21 = new d(8);
            composer.updateRememberedValue(objRememberedValue21);
        }
        ea eaVarA5 = a(orcaFlavor, null, (Function1) objRememberedValue21, composer, i3, 1);
        Object objRememberedValue22 = composer.rememberedValue();
        if (objRememberedValue22 == companion.getEmpty()) {
            objRememberedValue22 = new d(9);
            composer.updateRememberedValue(objRememberedValue22);
        }
        ea eaVarA6 = a(orcaFlavor, null, (Function1) objRememberedValue22, composer, i3, 1);
        Object objRememberedValue23 = composer.rememberedValue();
        if (objRememberedValue23 == companion.getEmpty()) {
            objRememberedValue23 = new d(11);
            composer.updateRememberedValue(objRememberedValue23);
        }
        pf pfVar = new pf(eaVarA, 20, cVar, eVar, new pf.d(new b30(eaVarA4, (i8) null, 0, (a81) null, (a81) null, a81Var7, (a81) null, eaVarA5, (ea) null, new b30.c(a(orcaFlavor, null, (Function1) objRememberedValue23, composer, i3, 1), eaVarA6), 350, (DefaultConstructorMarker) null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pfVar;
    }

    private static final yi0.e g(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-423123637, i, -1, "com.fourthline.orca.core.flavor.toGraphicElement (OrcaFlavorExtensions.kt:201)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new b(18);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new b(19);
            composer.updateRememberedValue(objRememberedValue2);
        }
        yi0.d dVar = new yi0.d(eaVarA, a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i3, 1));
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new b(20);
            composer.updateRememberedValue(objRememberedValue3);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i3, 1);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new b(21);
            composer.updateRememberedValue(objRememberedValue4);
        }
        yi0.d dVar2 = new yi0.d(eaVarA2, a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i3, 1));
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new b(22);
            composer.updateRememberedValue(objRememberedValue5);
        }
        ea eaVarA3 = a(orcaFlavor, null, (Function1) objRememberedValue5, composer, i3, 1);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new b(23);
            composer.updateRememberedValue(objRememberedValue6);
        }
        yi0.d dVar3 = new yi0.d(eaVarA3, a(orcaFlavor, null, (Function1) objRememberedValue6, composer, i3, 1));
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new b(24);
            composer.updateRememberedValue(objRememberedValue7);
        }
        ea eaVarA4 = a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i3, 1);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new b(25);
            composer.updateRememberedValue(objRememberedValue8);
        }
        yi0.e eVar = new yi0.e(dVar, dVar2, dVar3, new yi0.d(eaVarA4, a(orcaFlavor, null, (Function1) objRememberedValue8, composer, i3, 1)), m(orcaFlavor, composer, i2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return eVar;
    }

    private static final c10 h(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(781641910, i, -1, "com.fourthline.orca.core.flavor.toHintElement (OrcaFlavorExtensions.kt:340)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new d(20);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new d(22);
            composer.updateRememberedValue(objRememberedValue2);
        }
        i8 i8Var = new i8(a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i3, 1), 2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new d(23);
            composer.updateRememberedValue(objRememberedValue3);
        }
        int i5 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue3, composer, i5);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new d(24);
            composer.updateRememberedValue(objRememberedValue4);
        }
        c10.b bVar = new c10.b(new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i3, 1)), eaVarA, i8Var, 4);
        Float fValueOf = Float.valueOf(0.5f);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new d(25);
            composer.updateRememberedValue(objRememberedValue5);
        }
        ea eaVarA2 = a(orcaFlavor, fValueOf, (Function1) objRememberedValue5, composer, i2 | 432, 0);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new d(26);
            composer.updateRememberedValue(objRememberedValue6);
        }
        i8 i8Var2 = new i8(a(orcaFlavor, null, (Function1) objRememberedValue6, composer, i3, 1), 2);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new d(27);
            composer.updateRememberedValue(objRememberedValue7);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue7, composer, i5);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new d(28);
            composer.updateRememberedValue(objRememberedValue8);
        }
        c10 c10Var = new c10(bVar, new c10.b(new a81(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue8, composer, i3, 1)), eaVarA2, i8Var2, 4));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor i(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle2().getTextColor();
    }

    private static final p41 k(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-297086408, i, -1, "com.fourthline.orca.core.flavor.toRadioCellElement (OrcaFlavorExtensions.kt:368)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new d(29);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new e(0);
            composer.updateRememberedValue(objRememberedValue2);
        }
        r21 r21Var = new r21(a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i3, 1), BitmapDescriptorFactory.HUE_RED, 2, null);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new e(1);
            composer.updateRememberedValue(objRememberedValue3);
        }
        p41.c.C0260c c0260c = new p41.c.C0260c(a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i3, 1), ea.INSTANCE.a(Color.INSTANCE.m1995getWhite0d7_KjU()));
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new e(3);
            composer.updateRememberedValue(objRememberedValue4);
        }
        int i5 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue4, composer, i5);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new e(4);
            composer.updateRememberedValue(objRememberedValue5);
        }
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue5, composer, i3, 1));
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new e(5);
            composer.updateRememberedValue(objRememberedValue6);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue6, composer, i5);
        Float fValueOf = Float.valueOf(0.5f);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new e(6);
            composer.updateRememberedValue(objRememberedValue7);
        }
        a81 a81Var2 = new a81(mzVarA2, a(orcaFlavor, fValueOf, (Function1) objRememberedValue7, composer, i2 | 432, 0));
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new e(7);
            composer.updateRememberedValue(objRememberedValue8);
        }
        mz mzVarA3 = a(orcaFlavor, (Function1) objRememberedValue8, composer, i5);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new e(8);
            composer.updateRememberedValue(objRememberedValue9);
        }
        a81 a81Var3 = new a81(mzVarA3, a(orcaFlavor, null, (Function1) objRememberedValue9, composer, i3, 1));
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new e(9);
            composer.updateRememberedValue(objRememberedValue10);
        }
        p41.e eVar = null;
        p41 p41Var = new p41(new p41.c(eaVarA, r21Var, c0260c, a81Var, a81Var2, a81Var3, 4, a(orcaFlavor, null, (Function1) objRememberedValue10, composer, i3, 1), 1.0f, (i8) null, 512, (DefaultConstructorMarker) null), new p41.d(0.5f), eVar, 4, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return p41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font m(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPopupMessage();
    }

    private static final q41 n(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1414332280, i, -1, "com.fourthline.orca.core.flavor.toTextInputElement (OrcaFlavorExtensions.kt:222)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new a(17);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue, composer, i3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new a(28);
            composer.updateRememberedValue(objRememberedValue2);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue2, composer, i3);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new a(29);
            composer.updateRememberedValue(objRememberedValue3);
        }
        int i5 = i2 | 384;
        b81.c cVar = new b81.c(mzVarA, mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i5, 1));
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new b(0);
            composer.updateRememberedValue(objRememberedValue4);
        }
        mz mzVarA3 = a(orcaFlavor, (Function1) objRememberedValue4, composer, i3);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new b(2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        a81 a81Var = new a81(mzVarA3, a(orcaFlavor, null, (Function1) objRememberedValue5, composer, i5, 1));
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new b(3);
            composer.updateRememberedValue(objRememberedValue6);
        }
        mz mzVarA4 = a(orcaFlavor, (Function1) objRememberedValue6, composer, i3);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new b(4);
            composer.updateRememberedValue(objRememberedValue7);
        }
        a81 a81Var2 = new a81(mzVarA4, a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i5, 1));
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new b(5);
            composer.updateRememberedValue(objRememberedValue8);
        }
        mz mzVarA5 = a(orcaFlavor, (Function1) objRememberedValue8, composer, i3);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new b(6);
            composer.updateRememberedValue(objRememberedValue9);
        }
        a81 a81Var3 = new a81(mzVarA5, a(orcaFlavor, null, (Function1) objRememberedValue9, composer, i5, 1));
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new b(7);
            composer.updateRememberedValue(objRememberedValue10);
        }
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue10, composer, i5, 1);
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new a(18);
            composer.updateRememberedValue(objRememberedValue11);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue11, composer, i5, 1);
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = new a(19);
            composer.updateRememberedValue(objRememberedValue12);
        }
        ea eaVarA3 = a(orcaFlavor, null, (Function1) objRememberedValue12, composer, i5, 1);
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = new a(21);
            composer.updateRememberedValue(objRememberedValue13);
        }
        b81 b81Var = new b81(cVar, a81Var, a81Var2, a81Var3, eaVarA, eaVarA2, eaVarA3, new i8(a(orcaFlavor, null, (Function1) objRememberedValue13, composer, i5, 1), 2), 4);
        Object objRememberedValue14 = composer.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = new a(22);
            composer.updateRememberedValue(objRememberedValue14);
        }
        ea eaVarA4 = a(orcaFlavor, null, (Function1) objRememberedValue14, composer, i5, 1);
        i8 border = b81Var.getBorder();
        Object objRememberedValue15 = composer.rememberedValue();
        if (objRememberedValue15 == companion.getEmpty()) {
            objRememberedValue15 = new a(23);
            composer.updateRememberedValue(objRememberedValue15);
        }
        b81 b81VarA = b81.a(b81Var, null, null, null, null, null, eaVarA4, null, i8.a(border, a(orcaFlavor, null, (Function1) objRememberedValue15, composer, i5, 1), 0, 2, null), 0, 351, null);
        Object objRememberedValue16 = composer.rememberedValue();
        if (objRememberedValue16 == companion.getEmpty()) {
            objRememberedValue16 = new a(24);
            composer.updateRememberedValue(objRememberedValue16);
        }
        ea eaVarA5 = a(orcaFlavor, null, (Function1) objRememberedValue16, composer, i5, 1);
        i8 border2 = b81Var.getBorder();
        Object objRememberedValue17 = composer.rememberedValue();
        if (objRememberedValue17 == companion.getEmpty()) {
            objRememberedValue17 = new a(25);
            composer.updateRememberedValue(objRememberedValue17);
        }
        i8 i8VarA = i8.a(border2, a(orcaFlavor, null, (Function1) objRememberedValue17, composer, i5, 1), 0, 2, null);
        a81 status = b81Var.getStatus();
        Object objRememberedValue18 = composer.rememberedValue();
        if (objRememberedValue18 == companion.getEmpty()) {
            objRememberedValue18 = new a(26);
            composer.updateRememberedValue(objRememberedValue18);
        }
        b81 b81VarA2 = b81.a(b81Var, null, null, null, a81.a(status, null, a(orcaFlavor, null, (Function1) objRememberedValue18, composer, i5, 1), 1, null), null, eaVarA5, null, i8VarA, 0, 343, null);
        Object objRememberedValue19 = composer.rememberedValue();
        if (objRememberedValue19 == companion.getEmpty()) {
            objRememberedValue19 = new a(27);
            composer.updateRememberedValue(objRememberedValue19);
        }
        q41 q41Var = new q41(b81Var, b81VarA, b81VarA2, b81.a(b81Var, null, null, null, null, null, null, a(orcaFlavor, null, (Function1) objRememberedValue19, composer, i5, 1), null, 0, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return q41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font o(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getHintText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font p(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getHintText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font q(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInstructionsLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font r(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInstructionsLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font s(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getInstructionsLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font t(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font u(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getScreenTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor v(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getButtons().getCheckbox().getTintColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor w(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getPopup().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font x(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getTableElementTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font y(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getTableElementDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font z(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getHintText();
    }

    private static final e1 b(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1961363740, i, -1, "com.fourthline.orca.core.flavor.toAgreementsElement (OrcaFlavorExtensions.kt:420)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new nb.c(3);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i3, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new nb.c(4);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i5 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue2, composer, i5);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new nb.c(5);
            composer.updateRememberedValue(objRememberedValue3);
        }
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue3, composer, i3, 1));
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new nb.c(6);
            composer.updateRememberedValue(objRememberedValue4);
        }
        ea eaVarA2 = a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i3, 1);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new nb.c(8);
            composer.updateRememberedValue(objRememberedValue5);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue5, composer, i5);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new nb.c(9);
            composer.updateRememberedValue(objRememberedValue6);
        }
        a81 a81Var2 = new a81(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue6, composer, i3, 1));
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new nb.c(10);
            composer.updateRememberedValue(objRememberedValue7);
        }
        ea eaVarA3 = a(orcaFlavor, null, (Function1) objRememberedValue7, composer, i3, 1);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new nb.c(11);
            composer.updateRememberedValue(objRememberedValue8);
        }
        e1.b bVar = new e1.b(eaVarA2, a81Var2, new i8(a(orcaFlavor, null, (Function1) objRememberedValue8, composer, i3, 1), 1), eaVarA3, 4);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new nb.c(12);
            composer.updateRememberedValue(objRememberedValue9);
        }
        e1 e1Var = new e1(eaVarA, a81Var, bVar, 4, new i8(a(orcaFlavor, null, (Function1) objRememberedValue9, composer, i3, 1), 1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return e1Var;
    }

    private static final m41 d(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-158572912, i, -1, "com.fourthline.orca.core.flavor.toCheckboxElement (OrcaFlavorExtensions.kt:447)");
        }
        ea eaVarA = ea.INSTANCE.a(Color.INSTANCE.m1995getWhite0d7_KjU());
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(16);
            composer.updateRememberedValue(objRememberedValue);
        }
        m41 m41Var = new m41(new m41.b(a(orcaFlavor, null, (Function1) objRememberedValue, composer, (i & 14) | 384, 1), eaVarA, 1.0f), new m41.c(0.5f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m41Var;
    }

    private static final Map e(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-338771971, i, -1, "com.fourthline.orca.core.flavor.toColorDefaults (OrcaFlavorExtensions.kt:490)");
        }
        Map mapK = r0.k(new Pair("transparent", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getLight(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getLight(), composer, 0), null)), new Pair("light", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getLight(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getLight(), composer, 0), null)), new Pair("dark", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getDark(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getDark(), composer, 0), null)), new Pair("darkLight", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getDarkLight(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getDarkLight(), composer, 0), null)), new Pair("primary", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getPrimary(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getPrimary(), composer, 0), null)), new Pair("accent", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getAccent(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getAccent(), composer, 0), null)), new Pair("info", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getInternalPalette().l(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getInternalPalette().l(), composer, 0), null)), new Pair("warning", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getInternalPalette().c(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getInternalPalette().c(), composer, 0), null)), new Pair("error", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getInternalPalette().g(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getInternalPalette().g(), composer, 0), null)), new Pair("success", new di0(ch0.a(orcaFlavor.getColorsLight().getPalette().getInternalPalette().i(), composer, 0), ch0.a(orcaFlavor.getColorsDark().getPalette().getInternalPalette().i(), composer, 0), null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mapK;
    }

    private static final o41 i(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1321186672, i, -1, "com.fourthline.orca.core.flavor.toLinkButtonElement (OrcaFlavorExtensions.kt:460)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new b(27);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = i & 14;
        int i3 = i2 | 48;
        mz mzVarA = a(orcaFlavor, (Function1) objRememberedValue, composer, i3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new b(28);
            composer.updateRememberedValue(objRememberedValue2);
        }
        int i5 = i2 | 384;
        a81 a81Var = new a81(mzVarA, a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i5, 1));
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new b(29);
            composer.updateRememberedValue(objRememberedValue3);
        }
        mz mzVarA2 = a(orcaFlavor, (Function1) objRememberedValue3, composer, i3);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new nb.c(0);
            composer.updateRememberedValue(objRememberedValue4);
        }
        o41.c cVar = new o41.c(new w50(mzVarA2, a(orcaFlavor, null, (Function1) objRememberedValue4, composer, i5, 1), 1.0f));
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new nb.c(1);
            composer.updateRememberedValue(objRememberedValue5);
        }
        mz mzVarA3 = a(orcaFlavor, (Function1) objRememberedValue5, composer, i3);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new nb.c(2);
            composer.updateRememberedValue(objRememberedValue6);
        }
        o41 o41Var = new o41(a81Var, cVar, new o41.c(new w50(mzVarA3, a(orcaFlavor, null, (Function1) objRememberedValue6, composer, i5, 1), 0.5f)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return o41Var;
    }

    private static final br0 m(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(404766576, i, -1, "com.fourthline.orca.core.flavor.toSpinnerElement (OrcaFlavorExtensions.kt:331)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new qh(28);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i2 = (i & 14) | 384;
        ea eaVarA = a(orcaFlavor, null, (Function1) objRememberedValue, composer, i2, 1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new b(15);
            composer.updateRememberedValue(objRememberedValue2);
        }
        br0 br0Var = new br0(eaVarA, new ar0(a(orcaFlavor, null, (Function1) objRememberedValue2, composer, i2, 1), 1.0f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return br0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor a(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font a(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getTableElementTitle();
    }

    private static final Map a(OrcaLayouts orcaLayouts) {
        return r0.g();
    }

    private static final mz a(OrcaFlavor orcaFlavor, Function1 function1, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(162897138, i, -1, "com.fourthline.orca.core.flavor.fontByKey (OrcaFlavorExtensions.kt:536)");
        }
        OrcaFonts.Font font = (OrcaFonts.Font) function1.invoke(orcaFlavor.getFonts());
        mz mzVar = new mz(fontFamily(font), TextUnitKt.getSp(font.getSize()), 0L, 4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor g(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor h(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getBackgroundColor();
    }

    private static final ea a(OrcaFlavor orcaFlavor, Float f, Function1 function1, Composer composer, int i, int i2) {
        Float f4 = (i2 & 1) != 0 ? null : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-685240924, i, -1, "com.fourthline.orca.core.flavor.colorByKey (OrcaFlavorExtensions.kt:549)");
        }
        long jA = ch0.a((OrcaColors.OrcaColor) function1.invoke(orcaFlavor.getColorsLight()), composer, 0);
        if (f4 != null) {
            jA = Color.m1976copywmQWz5c$default(jA, f4.floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        }
        long jA2 = ch0.a((OrcaColors.OrcaColor) function1.invoke(orcaFlavor.getColorsDark()), composer, 0);
        if (f4 != null) {
            jA2 = Color.m1976copywmQWz5c$default(jA2, f4.floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        }
        ea eaVar = new ea(jA, jA2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return eaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor k(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font j(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getHintText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor j(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle2().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor c(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getIb.b.Screen java.lang.String().getTableCells().getCellStyle1().getTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font c(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getTableElementTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font n(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getHintText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaFonts.Font l(OrcaFonts fontByKey) {
        Intrinsics.checkNotNullParameter(fontByKey, "$this$fontByKey");
        return fontByKey.getPopupTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor l(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getBorderColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaColors.OrcaColor f(OrcaColors colorByKey) {
        Intrinsics.checkNotNullParameter(colorByKey, "$this$colorByKey");
        return colorByKey.getBox().getBackgroundColor();
    }
}
