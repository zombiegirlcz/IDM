package z0d;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class p {
    private p() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) q.$cachedSerializer$delegate.getValue();
    }
}
