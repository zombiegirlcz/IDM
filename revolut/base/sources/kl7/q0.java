package kl7;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 {
    private q0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) r0.$cachedSerializer$delegate.getValue();
    }
}
