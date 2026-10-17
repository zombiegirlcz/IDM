package ghb;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private c() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) d.$cachedSerializer$delegate.getValue();
    }
}
