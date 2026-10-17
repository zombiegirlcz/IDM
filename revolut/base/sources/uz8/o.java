package uz8;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    private o() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) p.$cachedSerializer$delegate.getValue();
    }
}
