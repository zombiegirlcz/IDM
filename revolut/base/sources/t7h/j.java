package t7h;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    private j() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) k.$cachedSerializer$delegate.getValue();
    }
}
