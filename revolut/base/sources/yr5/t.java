package yr5;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t {
    private t() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) u.$cachedSerializer$delegate.getValue();
    }
}
