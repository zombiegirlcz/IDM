package t3i;

import android.content.Context;
import android.util.TypedValue;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaLayouts;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b {
    public static final OrcaFlavor a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OrcaColors orcaColors = new OrcaColors(null, 1, null);
        OrcaColors.OrcaColor.FromRes fromResB = b(R$attr.uikit_colorBackground, context);
        OrcaColors.OrcaColor.FromRes fromResB2 = b(R$attr.uikit_colorElevatedBackground, context);
        OrcaColors.OrcaColor.FromRes fromResB3 = b(R$attr.uikit_colorGreyTone5, context);
        OrcaColors.OrcaColor.FromRes fromResB4 = b(R$attr.uikit_colorTransparent, context);
        OrcaColors.OrcaColor.FromRes fromResB5 = b(R$attr.uikit_colorGreyTone20, context);
        OrcaColors.OrcaColor.FromRes fromResB6 = b(R$attr.uikit_colorForeground, context);
        OrcaColors.OrcaColor.FromRes fromResB7 = b(R$attr.uikit_colorGreyTone50, context);
        OrcaColors.OrcaColor.FromRes fromResB8 = b(R$attr.uikit_colorAccentNeutral, context);
        OrcaColors.OrcaColor.FromRes fromResB9 = b(R$attr.uikit_colorOnAccentNeutral, context);
        OrcaColors.OrcaColor.FromRes fromResB10 = b(R$attr.uikit_colorActionBackgroundNeutral, context);
        OrcaColors.OrcaColor.FromRes fromResB11 = b(R$attr.uikit_colorAccentNeutral, context);
        orcaColors.getPopup().setBackgroundColor(fromResB2);
        orcaColors.getPopup().setTitleColor(fromResB6);
        orcaColors.getPopup().setMessageColor(fromResB7);
        orcaColors.getBox().setBackgroundColor(fromResB3);
        orcaColors.getBox().setBorderColor(fromResB4);
        orcaColors.getBox().setTitleColor(fromResB6);
        orcaColors.getHint().setBackgroundColor(fromResB3);
        orcaColors.getHint().setBorderColor(fromResB4);
        orcaColors.getHint().setTextColor(fromResB6);
        orcaColors.getButtons().getPrimary().setBackgroundColor(fromResB8);
        orcaColors.getButtons().getPrimary().setTextColor(fromResB9);
        orcaColors.getButtons().getPrimary().setBorderColor(fromResB4);
        orcaColors.getButtons().getSecondary().setBackgroundColor(fromResB10);
        orcaColors.getButtons().getSecondary().setTextColor(fromResB11);
        orcaColors.getButtons().getSecondary().setBorderColor(fromResB4);
        orcaColors.getButtons().getScannerPrimary().setBackgroundColor(fromResB8);
        orcaColors.getButtons().getScannerPrimary().setTextColor(fromResB9);
        orcaColors.getButtons().getScannerPrimary().setBorderColor(fromResB4);
        orcaColors.getButtons().getScannerSecondary().setBackgroundColor(fromResB10);
        orcaColors.getButtons().getScannerSecondary().setTextColor(fromResB11);
        orcaColors.getButtons().getScannerSecondary().setBorderColor(fromResB4);
        orcaColors.getButtons().setBackButtonColor(fromResB8);
        orcaColors.getIb.b.Scanner java.lang.String().getConfirmation().setBackgroundColor(fromResB2);
        orcaColors.getIb.b.Scanner java.lang.String().getConfirmation().setBulletListColor(fromResB7);
        orcaColors.getIb.b.Scanner java.lang.String().getConfirmation().setTextColor(fromResB7);
        orcaColors.getIb.b.Screen java.lang.String().setBackgroundColor(fromResB);
        orcaColors.getIb.b.Screen java.lang.String().setHeaderColor(fromResB6);
        orcaColors.getIb.b.Screen java.lang.String().setTitleColor(fromResB7);
        orcaColors.getIb.b.Screen java.lang.String().setMessageColor(fromResB5);
        return new OrcaFlavor(orcaColors, orcaColors, new OrcaLayouts(Integer.MAX_VALUE), null, null, 24, null);
    }

    public static final OrcaColors.OrcaColor.FromRes b(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return new OrcaColors.OrcaColor.FromRes(typedValue.resourceId);
    }
}
