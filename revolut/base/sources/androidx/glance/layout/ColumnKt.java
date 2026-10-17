package androidx.glance.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aG\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/glance/GlanceModifier;", "modifier", "Landroidx/glance/layout/Alignment$Vertical;", "verticalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "horizontalAlignment", "Lkotlin/Function1;", "Landroidx/glance/layout/ColumnScope;", "", "content", "Column-K4GKKTE", "(Landroidx/glance/GlanceModifier;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Column", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ColumnKt {
    /* JADX INFO: renamed from: Column-K4GKKTE, reason: not valid java name */
    public static final void m3537ColumnK4GKKTE(GlanceModifier glanceModifier, int i, int i2, @NotNull Function3 function3, Composer composer, int i3, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1883910253);
        int i21 = i5 & 1;
        if (i21 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(glanceModifier) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i32 = i5 & 4;
        if (i32 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i21 != 0) {
                glanceModifier = GlanceModifier.INSTANCE;
            }
            if (i22 != 0) {
                i = Alignment.INSTANCE.m3516getTopmnfRV0w();
            }
            if (i32 != 0) {
                i2 = Alignment.INSTANCE.m3515getStartPGIyAqw();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1883910253, i6, -1, "androidx.glance.layout.Column (Column.kt:83)");
            }
            ColumnKt$Column$1 columnKt$Column$1 = ColumnKt$Column$1.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(578571862);
            composerStartRestartGroup.startReplaceableGroup(-548224868);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(columnKt$Column$1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, glanceModifier, ColumnKt$Column$2$1.INSTANCE);
            Updater.m1665setimpl(composerM1662constructorimpl, Alignment.Horizontal.m3517boximpl(i2), ColumnKt$Column$2$2.INSTANCE);
            Updater.m1665setimpl(composerM1662constructorimpl, Alignment.Vertical.m3527boximpl(i), ColumnKt$Column$2$3.INSTANCE);
            function3.invoke(ColumnScopeImplInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        GlanceModifier glanceModifier2 = glanceModifier;
        int i33 = i;
        int i43 = i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new ColumnKt$Column$4(glanceModifier2, i33, i43, function3, i3, i5));
    }
}
