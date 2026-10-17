package b8g;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private b() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) c.$cachedSerializer$delegate.getValue();
    }
}
