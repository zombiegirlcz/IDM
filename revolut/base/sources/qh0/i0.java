package qh0;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 {
    private i0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) j0.$cachedSerializer$delegate.getValue();
    }
}
