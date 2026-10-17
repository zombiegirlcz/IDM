package g9f;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {
    private f0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) g0.$cachedSerializer$delegate.getValue();
    }
}
