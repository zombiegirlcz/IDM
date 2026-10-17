package jl;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class p0 {
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) q0.$cachedSerializer$delegate.getValue();
    }
}
