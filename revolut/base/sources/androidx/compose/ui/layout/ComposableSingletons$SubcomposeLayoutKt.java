package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$SubcomposeLayoutKt {

    @NotNull
    public static final ComposableSingletons$SubcomposeLayoutKt INSTANCE = new ComposableSingletons$SubcomposeLayoutKt();

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$641200809 = ComposableLambdaKt.composableLambdaInstance(641200809, false, ComposableSingletons$SubcomposeLayoutKt$lambda$641200809$1.INSTANCE);

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$641200809$ui() {
        return lambda$641200809;
    }
}
