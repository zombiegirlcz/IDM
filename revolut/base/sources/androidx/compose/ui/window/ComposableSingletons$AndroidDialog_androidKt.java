package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$AndroidDialog_androidKt {

    @NotNull
    public static final ComposableSingletons$AndroidDialog_androidKt INSTANCE = new ComposableSingletons$AndroidDialog_androidKt();

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$210148896 = ComposableLambdaKt.composableLambdaInstance(210148896, false, ComposableSingletons$AndroidDialog_androidKt$lambda$210148896$1.INSTANCE);

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$210148896$ui() {
        return lambda$210148896;
    }
}
