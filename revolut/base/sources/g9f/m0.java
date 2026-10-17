package g9f;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 {
    private m0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) n0.$cachedSerializer$delegate.getValue();
    }
}
