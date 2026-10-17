package j18;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    private r() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) s.$cachedSerializer$delegate.getValue();
    }
}
