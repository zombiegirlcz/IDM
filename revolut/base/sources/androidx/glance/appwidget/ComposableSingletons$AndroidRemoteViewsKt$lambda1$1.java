package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.glance.appwidget.ComposableSingletons$AndroidRemoteViewsKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$AndroidRemoteViewsKt$lambda1$1 extends u implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AndroidRemoteViewsKt$lambda1$1 INSTANCE = new ComposableSingletons$AndroidRemoteViewsKt$lambda1$1();

    public ComposableSingletons$AndroidRemoteViewsKt$lambda1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(757789032, i, -1, "androidx.glance.appwidget.ComposableSingletons$AndroidRemoteViewsKt.lambda-1.<anonymous> (AndroidRemoteViews.kt:38)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
