package kr;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class o2 {
    private o2() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) p2.$cachedSerializer$delegate.getValue();
    }
}
