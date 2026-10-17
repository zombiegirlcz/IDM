package m2l;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {
    private j0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) k0.$cachedSerializer$delegate.getValue();
    }
}
