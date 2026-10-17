package hyl;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i {
    private i() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) j.$cachedSerializer$delegate.getValue();
    }
}
