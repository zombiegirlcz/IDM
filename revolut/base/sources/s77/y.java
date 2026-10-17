package s77;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y {
    private y() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) z.$cachedSerializer$delegate.getValue();
    }

    public y(int i) {
    }
}
