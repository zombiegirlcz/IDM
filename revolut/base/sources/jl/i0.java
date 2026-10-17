package jl;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class i0 {
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) j0.$cachedSerializer$delegate.getValue();
    }
}
