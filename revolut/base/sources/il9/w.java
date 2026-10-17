package il9;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class w {
    private w() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) x.$cachedSerializer$delegate.getValue();
    }
}
