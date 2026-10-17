package ij3;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o {
    private o() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) p.$cachedSerializer$delegate.getValue();
    }
}
