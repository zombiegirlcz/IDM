package m01;

import android.content.Context;
import android.widget.RemoteViews;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.unit.Dp;
import androidx.glance.CompositionLocalsKt;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.AndroidRemoteViewsKt;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.SizeModifiersKt;
import com.revolut.core.ui_kit_remote.R$id;
import com.revolut.core.ui_kit_remote.R$layout;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final void a(Function2 content, Composer composer, int i) {
        int i2;
        Function2 function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(782362151);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(782362151, i2, -1, "com.revolut.core.ui_kit_remote.widget.base.host.WidgetHost (WidgetHost.kt:18)");
            }
            function2 = content;
            AndroidRemoteViewsKt.AndroidRemoteViews(new RemoteViews(((Context) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalContext())).getPackageName(), R$layout.remote_layout_host), R$id.host, PaddingKt.m3563padding3ABfNKs(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE), Dp.m3297constructorimpl(4)), function2, composerStartRestartGroup, (i2 << 9) & 7168, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = content;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(function2, i, 0));
        }
    }
}
