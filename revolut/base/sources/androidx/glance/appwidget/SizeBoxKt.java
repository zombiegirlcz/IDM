package androidx.glance.appwidget;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.appwidget.SizeMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a3\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "size", "Landroidx/glance/appwidget/SizeMode;", "sizeMode", "Lkotlin/Function0;", "", "content", "SizeBox-IbIYxLY", "(JLandroidx/glance/appwidget/SizeMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SizeBox", "minSize", "ForEachSize-eVKgIn8", "(Landroidx/glance/appwidget/SizeMode;JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ForEachSize", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SizeBoxKt {
    /* JADX INFO: renamed from: ForEachSize-eVKgIn8, reason: not valid java name */
    public static final void m3497ForEachSizeeVKgIn8(@NotNull SizeMode sizeMode, long j2, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        List<DpSize> listExtractAllSizes;
        List<DpSize> listC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1526030150);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(sizeMode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            function22 = function2;
            i2 |= composerStartRestartGroup.changed(function22) ? 256 : 128;
        } else {
            function22 = function2;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1526030150, i2, -1, "androidx.glance.appwidget.ForEachSize (SizeBox.kt:90)");
            }
            if (sizeMode instanceof SizeMode.Single) {
                composerStartRestartGroup.startReplaceableGroup(1209069742);
                composerStartRestartGroup.endReplaceableGroup();
                listC = u.c(DpSize.m3317boximpl(j2));
            } else {
                if (!(sizeMode instanceof SizeMode.Exact)) {
                    composerStartRestartGroup.startReplaceableGroup(1209066450);
                    composerStartRestartGroup.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceableGroup(1209069787);
                if (Build.VERSION.SDK_INT >= 31) {
                    composerStartRestartGroup.startReplaceableGroup(1209069839);
                    Bundle bundle = (Bundle) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAppWidgetOptions());
                    DpSize dpSizeM3317boximpl = DpSize.m3317boximpl(j2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(dpSizeM3317boximpl);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SizeBoxKt$ForEachSize$sizes$1$1(j2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    listExtractAllSizes = AppWidgetUtilsKt.extractAllSizes(bundle, (Function0) objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1209069926);
                    List<DpSize> listExtractOrientationSizes = AppWidgetUtilsKt.extractOrientationSizes((Bundle) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAppWidgetOptions()));
                    if (listExtractOrientationSizes.isEmpty()) {
                        listExtractOrientationSizes = u.c(DpSize.m3317boximpl(j2));
                    }
                    listExtractAllSizes = listExtractOrientationSizes;
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                listC = listExtractAllSizes;
            }
            List listU = d0.U(listC);
            ArrayList arrayList = new ArrayList(w.t(listU, 10));
            Iterator it8 = listU.iterator();
            while (it8.hasNext()) {
                m3498SizeBoxIbIYxLY(((DpSize) it8.next()).getPackedValue(), sizeMode, function22, composerStartRestartGroup, ((i2 << 3) & 112) | (i2 & 896));
                arrayList.add(Unit.f186387a);
                function22 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new SizeBoxKt$ForEachSize$2(sizeMode, j2, function2, i));
    }

    /* JADX INFO: renamed from: SizeBox-IbIYxLY, reason: not valid java name */
    public static final void m3498SizeBoxIbIYxLY(long j2, @NotNull SizeMode sizeMode, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-53921383);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(sizeMode) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53921383, i3, -1, "androidx.glance.appwidget.SizeBox (SizeBox.kt:68)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{androidx.glance.CompositionLocalsKt.getLocalSize().provides(DpSize.m3317boximpl(j2))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1209815847, true, new SizeBoxKt$SizeBox$1(function2, i3, j2, sizeMode)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new SizeBoxKt$SizeBox$2(j2, sizeMode, function2, i));
    }
}
