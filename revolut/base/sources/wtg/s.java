package wtg;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    private s() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) t.$cachedSerializer$delegate.getValue();
    }
}
