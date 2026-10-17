package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f1.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import oim.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$ContextMenuUiKt {

    @NotNull
    public static final ComposableSingletons$ContextMenuUiKt INSTANCE = new ComposableSingletons$ContextMenuUiKt();

    /* JADX INFO: renamed from: lambda$-1571120048, reason: not valid java name */
    @NotNull
    private static r f7lambda$1571120048 = ComposableLambdaKt.composableLambdaInstance(-1571120048, false, new a());

    /* JADX INFO: renamed from: lambda$-1455401925, reason: not valid java name */
    @NotNull
    private static Function3 f6lambda$1455401925 = ComposableLambdaKt.composableLambdaInstance(-1455401925, false, new et6.a(12));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1455401925$lambda$0(ContextMenuColors contextMenuColors, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(contextMenuColors) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455401925, i, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ContextMenuSpec contextMenuSpec = ContextMenuSpec.INSTANCE;
            BoxKt.Box(BackgroundKt.m613backgroundbw27NRU$default(SizeKt.m874height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m864paddingVpY3zN4$default(companion, BitmapDescriptorFactory.HUE_RED, contextMenuSpec.m668getDividerVerticalPaddingD9Ej5fM(), 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), contextMenuSpec.m667getDividerHeightD9Ej5fM()), contextMenuColors.getIconColor(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1571120048$lambda$0(Modifier modifier, String str, boolean z, ContextMenuColors contextMenuColors, Function3 function3, Function0 function0, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (composer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composer.changed(contextMenuColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composer.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composer.changedInstance(function0) ? 131072 : 65536;
        }
        if (composer.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1571120048, i2, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            ContextMenuUiKt.ContextMenuItem(str, z, contextMenuColors, modifier, function3, function0, composer, ((i2 >> 3) & 1022) | ((i2 << 9) & 7168) | (57344 & i2) | (i2 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1455401925$foundation, reason: not valid java name */
    public final Function3 m656getLambda$1455401925$foundation() {
        return f6lambda$1455401925;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1571120048$foundation, reason: not valid java name */
    public final r m657getLambda$1571120048$foundation() {
        return f7lambda$1571120048;
    }
}
