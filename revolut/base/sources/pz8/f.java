package pz8;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private f() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) g.$cachedSerializer$delegate.getValue();
    }
}
