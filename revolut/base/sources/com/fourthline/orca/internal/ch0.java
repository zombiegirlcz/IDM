package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.fourthline.orca.core.flavor.OrcaBox;
import com.fourthline.orca.core.flavor.OrcaButtons;
import com.fourthline.orca.core.flavor.OrcaCell;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaGraphic;
import com.fourthline.orca.core.flavor.OrcaHint;
import com.fourthline.orca.core.flavor.OrcaInputField;
import com.fourthline.orca.core.flavor.OrcaPopup;
import com.fourthline.orca.core.flavor.OrcaScanner;
import com.fourthline.orca.core.flavor.OrcaScannerConfirmation;
import com.fourthline.orca.core.flavor.OrcaScreen;
import com.fourthline.orca.internal.xg0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ch0 {
    public static final bh0 a(OrcaColors orcaColors, boolean z, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(orcaColors, "<this>");
        boolean z3 = (i2 & 1) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2055715989, i, -1, "com.fourthline.orca.core.internal.styling.color.toComposeColors (OrcaColors.kt:40)");
        }
        long jA = a(orcaColors.getPalette().getPrimary(), composer, 0);
        long jA2 = a(orcaColors.getPalette().getAccent(), composer, 0);
        composer.startReplaceGroup(141899058);
        OrcaButtons buttons = orcaColors.getButtons();
        xg0.a aVarA = a(buttons.getPrimary(), composer, 0);
        xg0.a aVarA2 = a(buttons.getSecondary(), composer, 0);
        xg0.a aVarA3 = a(buttons.getScannerPrimary(), composer, 0);
        xg0.a aVarA4 = a(buttons.getScannerSecondary(), composer, 0);
        long jA3 = a(buttons.getLinkButtonColor(), composer, 0);
        long jA4 = a(buttons.getBackButtonColor(), composer, 0);
        composer.startReplaceGroup(141913169);
        OrcaButtons.OrcaCheckbox checkbox = buttons.getCheckbox();
        xg0.b bVar = new xg0.b(a(checkbox.getTintColor(), composer, 0), a(checkbox.getIconColor(), composer, 0), null);
        composer.endReplaceGroup();
        xg0 xg0Var = new xg0(aVarA, aVarA2, aVarA3, aVarA4, bVar, jA3, jA4, null);
        composer.endReplaceGroup();
        composer.startReplaceGroup(141923186);
        OrcaScreen orcaScreen = orcaColors.getIb.b.Screen java.lang.String();
        long jA5 = a(orcaScreen.getBackgroundColor(), composer, 0);
        long jA6 = a(orcaScreen.getHeaderColor(), composer, 0);
        long jA7 = a(orcaScreen.getTitleColor(), composer, 0);
        long jA8 = a(orcaScreen.getMessageColor(), composer, 0);
        composer.startReplaceGroup(141933732);
        OrcaCell cellStyle1 = orcaScreen.getTableCells().getCellStyle1();
        yg0 yg0Var = new yg0(a(cellStyle1.getBackgroundColor(), composer, 0), a(cellStyle1.getTextColor(), composer, 0), a(cellStyle1.getIconColor(), composer, 0), a(cellStyle1.getBorderColor(), composer, 0), a(cellStyle1.getDividerColor(), composer, 0), null);
        composer.endReplaceGroup();
        composer.startReplaceGroup(141949988);
        OrcaCell cellStyle2 = orcaScreen.getTableCells().getCellStyle2();
        yg0 yg0Var2 = new yg0(a(cellStyle2.getBackgroundColor(), composer, 0), a(cellStyle2.getTextColor(), composer, 0), a(cellStyle2.getIconColor(), composer, 0), a(cellStyle2.getBorderColor(), composer, 0), a(cellStyle2.getDividerColor(), composer, 0), null);
        composer.endReplaceGroup();
        li0 li0Var = new li0(jA5, jA6, jA7, jA8, a(orcaScreen.getDividerColor(), composer, 0), new zg0(yg0Var, yg0Var2), null);
        composer.endReplaceGroup();
        composer.startReplaceGroup(141968861);
        OrcaHint hint = orcaColors.getHint();
        qh0 qh0Var = new qh0(a(hint.getTextColor(), composer, 0), a(hint.getBackgroundColor(), composer, 0), a(hint.getBorderColor(), composer, 0), null);
        composer.endReplaceGroup();
        composer.startReplaceGroup(141977863);
        OrcaInputField inputField = orcaColors.getInputField();
        rh0 rh0Var = new rh0(a(inputField.getTextColor(), composer, 0), a(inputField.getBackgroundColor(), composer, 0), a(inputField.getBorderColor(), composer, 0), a(inputField.getDisabledTextColor(), composer, 0), a(inputField.getDisabledBackgroundColor(), composer, 0), a(inputField.getDisabledBorderColor(), composer, 0), a(inputField.getPlaceholderColor(), composer, 0), a(inputField.getTitleColor(), composer, 0), a(inputField.getStatusColor(), composer, 0), a(inputField.getErrorColor(), composer, 0), null);
        composer.endReplaceGroup();
        composer.startReplaceGroup(142001411);
        OrcaPopup popup = orcaColors.getPopup();
        gi0 gi0Var = new gi0(a(popup.getTitleColor(), composer, 0), a(popup.getMessageColor(), composer, 0), a(popup.getBackgroundColor(), composer, 0), null);
        composer.endReplaceGroup();
        composer.startReplaceGroup(142010315);
        OrcaScanner orcaScanner = orcaColors.getIb.b.Scanner java.lang.String();
        long jA9 = a(orcaScanner.getProgressColor(), composer, 0);
        long jA10 = a(orcaScanner.getSpinnerColor(), composer, 0);
        composer.startReplaceGroup(142016428);
        OrcaScannerConfirmation confirmation = orcaScanner.getConfirmation();
        ki0 ki0Var = new ki0(a(confirmation.getTextColor(), composer, 0), a(confirmation.getBackgroundColor(), composer, 0), a(confirmation.getBulletListColor(), composer, 0), null);
        composer.endReplaceGroup();
        ji0 ji0Var = new ji0(jA10, jA9, ki0Var, null);
        composer.endReplaceGroup();
        zh0 zh0Var = new zh0(z3 ? Color.INSTANCE.m1995getWhite0d7_KjU() : ColorKt.Color(4278650916L), z3 ? ColorKt.Color(4283979864L) : Color.INSTANCE.m1995getWhite0d7_KjU(), a(orcaColors.getIb.b.Scanner java.lang.String().getProgressColor(), composer, 0), z3 ? ColorKt.Color(4292598747L) : Color.m1976copywmQWz5c$default(Color.INSTANCE.m1995getWhite0d7_KjU(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), ColorKt.Color(4288124823L), null);
        composer.startReplaceGroup(142042765);
        OrcaGraphic graphic = orcaColors.getGraphic();
        ph0 ph0Var = new ph0(a(graphic.getBackgroundColor(), composer, 0), a(graphic.getPrimaryColor(), composer, 0), null);
        composer.endReplaceGroup();
        long jColor = ColorKt.Color(z3 ? 4293454056L : 4281285448L);
        long jColor2 = ColorKt.Color(3006477107L);
        long jColor3 = ColorKt.Color(4281545523L);
        long jColor4 = ColorKt.Color(4278247522L);
        long jColor5 = ColorKt.Color(4294927872L);
        composer.startReplaceGroup(142058237);
        OrcaBox box = orcaColors.getBox();
        vg0 vg0Var = new vg0(a(box.getBackgroundColor(), composer, 0), a(box.getBorderColor(), composer, 0), a(box.getTitleColor(), composer, 0), null);
        composer.endReplaceGroup();
        long jM1987getBlack0d7_KjU = z3 ? Color.INSTANCE.m1987getBlack0d7_KjU() : Color.INSTANCE.m1995getWhite0d7_KjU();
        long jM1987getBlack0d7_KjU2 = z3 ? Color.INSTANCE.m1987getBlack0d7_KjU() : Color.INSTANCE.m1995getWhite0d7_KjU();
        composer.startReplaceGroup(142072306);
        h30 internalPalette = orcaColors.getPalette().getInternalPalette();
        ug0 ug0Var = new ug0(a(orcaColors.getGraphic().getPrimaryColor(), composer, 0), a(internalPalette.i(), composer, 0), a(internalPalette.g(), composer, 0), a(internalPalette.c(), composer, 0), a(internalPalette.k(), composer, 0), null);
        composer.endReplaceGroup();
        bh0 bh0Var = new bh0(jA, jA2, xg0Var, li0Var, vg0Var, qh0Var, rh0Var, gi0Var, ji0Var, zh0Var, ph0Var, jColor, jColor2, jColor3, jColor4, jColor5, jM1987getBlack0d7_KjU, jM1987getBlack0d7_KjU2, ug0Var, a(orcaColors.getPalette().getInternalPalette().h(), composer, 0), z3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bh0Var;
    }

    public static final long a(OrcaColors.OrcaColor orcaColor, Composer composer, int i) {
        long jColor$default;
        Intrinsics.checkNotNullParameter(orcaColor, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(277934545, i, -1, "com.fourthline.orca.core.internal.styling.color.toComposeColor (OrcaColors.kt:177)");
        }
        if (orcaColor instanceof OrcaColors.OrcaColor.FromInt) {
            composer.startReplaceGroup(-748846097);
            composer.endReplaceGroup();
            OrcaColors.OrcaColor.FromInt fromInt = (OrcaColors.OrcaColor.FromInt) orcaColor;
            jColor$default = ColorKt.Color$default(((fromInt.getColor() >> 16) & 255) / 255.0f, ((fromInt.getColor() >> 8) & 255) / 255.0f, (fromInt.getColor() & 255) / 255.0f, 1.0f, null, 16, null);
        } else if (orcaColor instanceof OrcaColors.OrcaColor.FromLong) {
            composer.startReplaceGroup(807134333);
            composer.endReplaceGroup();
            jColor$default = ColorKt.Color(((OrcaColors.OrcaColor.FromLong) orcaColor).getColor());
        } else if (orcaColor instanceof OrcaColors.OrcaColor.FromRes) {
            composer.startReplaceGroup(807135330);
            long jColorResource = ColorResources_androidKt.colorResource(((OrcaColors.OrcaColor.FromRes) orcaColor).getId(), composer, 0);
            composer.endReplaceGroup();
            jColor$default = jColorResource;
        } else {
            if (!(orcaColor instanceof OrcaColors.OrcaColor.FromColor)) {
                composer.startReplaceGroup(807127227);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-748557084);
            composer.endReplaceGroup();
            OrcaColors.OrcaColor.FromColor fromColor = (OrcaColors.OrcaColor.FromColor) orcaColor;
            jColor$default = ColorKt.Color$default(fromColor.getColor().getComponent(0), fromColor.getColor().getComponent(1), fromColor.getColor().getComponent(2), fromColor.getColor().getComponent(3), null, 16, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jColor$default;
    }

    private static final xg0.a a(OrcaButtons.OrcaButton orcaButton, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(265449310, i, -1, "com.fourthline.orca.core.internal.styling.color.toComposeVariant (OrcaColors.kt:202)");
        }
        xg0.a aVar = new xg0.a(a(orcaButton.getTextColor(), composer, 0), a(orcaButton.getBackgroundColor(), composer, 0), a(orcaButton.getBorderColor(), composer, 0), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar;
    }
}
