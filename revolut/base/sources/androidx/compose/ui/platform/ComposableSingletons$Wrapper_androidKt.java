package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$Wrapper_androidKt {

    @NotNull
    public static final ComposableSingletons$Wrapper_androidKt INSTANCE = new ComposableSingletons$Wrapper_androidKt();

    /* JADX INFO: renamed from: lambda$-1759434350, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f67lambda$1759434350 = ComposableLambdaKt.composableLambdaInstance(-1759434350, false, ComposableSingletons$Wrapper_androidKt$lambda$1759434350$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1759434350$ui, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2792getLambda$1759434350$ui() {
        return f67lambda$1759434350;
    }
}
