package g9f;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    private u() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) v.$cachedSerializer$delegate.getValue();
    }
}
