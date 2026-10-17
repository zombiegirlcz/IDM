package ofa;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) b.$cachedSerializer$delegate.getValue();
    }
}
