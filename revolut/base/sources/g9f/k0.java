package g9f;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 {
    private k0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) l0.$cachedSerializer$delegate.getValue();
    }
}
