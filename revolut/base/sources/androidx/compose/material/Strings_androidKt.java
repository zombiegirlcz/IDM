package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class Strings_androidKt {
    @NotNull
    /* JADX INFO: renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1256getString4foXLRw(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.INSTANCE;
        String string = Strings.m1247equalsimpl0(i, companion.m1252getNavigationMenuUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.navigation_menu) : Strings.m1247equalsimpl0(i, companion.m1248getCloseDrawerUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.close_drawer) : Strings.m1247equalsimpl0(i, companion.m1249getCloseSheetUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.close_sheet) : Strings.m1247equalsimpl0(i, companion.m1250getDefaultErrorMessageUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.default_error_message) : Strings.m1247equalsimpl0(i, companion.m1251getExposedDropdownMenuUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.dropdown_menu) : Strings.m1247equalsimpl0(i, companion.m1254getSliderRangeStartUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.range_start) : Strings.m1247equalsimpl0(i, companion.m1253getSliderRangeEndUdPEhr4()) ? resources.getString(androidx.compose.ui.R$string.range_end) : Strings.m1247equalsimpl0(i, companion.m1255getSnackbarPaneTitleUdPEhr4()) ? resources.getString(R$string.mc2_snackbar_pane_title) : "";
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
