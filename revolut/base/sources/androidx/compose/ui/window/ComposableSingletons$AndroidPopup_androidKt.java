package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$AndroidPopup_androidKt {

    @NotNull
    public static final ComposableSingletons$AndroidPopup_androidKt INSTANCE = new ComposableSingletons$AndroidPopup_androidKt();

    /* JADX INFO: renamed from: lambda$-1131826196, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f70lambda$1131826196 = ComposableLambdaKt.composableLambdaInstance(-1131826196, false, ComposableSingletons$AndroidPopup_androidKt$lambda$1131826196$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1131826196$ui, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3420getLambda$1131826196$ui() {
        return f70lambda$1131826196;
    }
}
