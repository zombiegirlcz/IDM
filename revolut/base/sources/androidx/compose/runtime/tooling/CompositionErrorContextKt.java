package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import gx2.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalCompositionErrorContext", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "getLocalCompositionErrorContext", "()Landroidx/compose/runtime/CompositionLocal;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class CompositionErrorContextKt {

    @NotNull
    private static final CompositionLocal<CompositionErrorContext> LocalCompositionErrorContext = CompositionLocalKt.staticCompositionLocalOf(new a(17));

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompositionErrorContext LocalCompositionErrorContext$lambda$0() {
        return null;
    }

    @NotNull
    public static final CompositionLocal<CompositionErrorContext> getLocalCompositionErrorContext() {
        return LocalCompositionErrorContext;
    }
}
