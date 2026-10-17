package androidx.compose.runtime.retain;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import e18.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "LocalRetainedValuesStore", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRetainedValuesStore", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime-retain"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LocalRetainedValuesStoreKt {

    @NotNull
    private static final ProvidableCompositionLocal<RetainedValuesStore> LocalRetainedValuesStore = CompositionLocalKt.staticCompositionLocalOf(new i(1));

    @NotNull
    public static final ProvidableCompositionLocal<RetainedValuesStore> getLocalRetainedValuesStore() {
        return LocalRetainedValuesStore;
    }
}
