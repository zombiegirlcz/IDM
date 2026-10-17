package p01;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    public static final void a(b bVar, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(778867963);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(778867963, i2, -1, "com.revolut.core.ui_kit_remote.widget.models.ActionTileWidget (ActionTileWidget.kt:74)");
            }
            m01.b.a(ComposableLambdaKt.rememberComposableLambda(936957250, true, new or4.i(bVar, 18), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(bVar, i, 1));
        }
    }
}
