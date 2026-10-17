package androidx.navigationevent.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v4a.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/navigationevent/compose/LocalNavigationEventDispatcherOwner;", "", "<init>", "()V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "LocalNavigationEventDispatcherOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/navigationevent/NavigationEventDispatcherOwner;", "current", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalNavigationEventDispatcherOwner {
    public static final int $stable = 0;

    @NotNull
    public static final LocalNavigationEventDispatcherOwner INSTANCE = new LocalNavigationEventDispatcherOwner();

    @NotNull
    private static final ProvidableCompositionLocal<NavigationEventDispatcherOwner> LocalNavigationEventDispatcherOwner = CompositionLocalKt.compositionLocalOf$default(null, new a(3), 1, null);

    private LocalNavigationEventDispatcherOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationEventDispatcherOwner LocalNavigationEventDispatcherOwner$lambda$0() {
        return null;
    }

    public final NavigationEventDispatcherOwner getCurrent(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942026292, i, -1, "androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner.<get-current> (LocalNavigationEventDispatcherOwner.kt:38)");
        }
        NavigationEventDispatcherOwner navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner = (NavigationEventDispatcherOwner) composer.consume(LocalNavigationEventDispatcherOwner);
        if (navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner == null) {
            composer.startReplaceGroup(950836184);
            navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner = LocalNavigationEventDispatcherOwner_androidKt.findViewTreeNavigationEventDispatcherOwner(composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(950834231);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner;
    }
}
