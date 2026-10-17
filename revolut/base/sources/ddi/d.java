package ddi;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private d() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) e.$cachedSerializer$delegate.getValue();
    }
}
