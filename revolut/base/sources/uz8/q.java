package uz8;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    private q() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) r.$cachedSerializer$delegate.getValue();
    }
}
