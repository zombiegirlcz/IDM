package qh0;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private i() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) j.$cachedSerializer$delegate.getValue();
    }
}
