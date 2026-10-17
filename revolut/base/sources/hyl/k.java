package hyl;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {
    private k() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) l.$cachedSerializer$delegate.getValue();
    }
}
