package jz8;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 {
    private a1() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) b1.$cachedSerializer$delegate.getValue();
    }
}
