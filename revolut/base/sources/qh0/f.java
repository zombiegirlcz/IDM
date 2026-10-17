package qh0;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private f() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) g.$cachedSerializer$delegate.getValue();
    }
}
