package sdl;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 {
    private p0() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) q0.$cachedSerializer$delegate.getValue();
    }
}
