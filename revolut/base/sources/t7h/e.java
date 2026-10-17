package t7h;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private e() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f.$cachedSerializer$delegate.getValue();
    }
}
