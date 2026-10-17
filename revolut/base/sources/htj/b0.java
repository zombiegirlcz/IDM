package htj;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {
    private b0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) c0.$cachedSerializer$delegate.getValue();
    }
}
