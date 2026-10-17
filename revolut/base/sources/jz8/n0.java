package jz8;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {
    private n0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) o0.$cachedSerializer$delegate.getValue();
    }
}
