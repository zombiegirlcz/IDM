package e18;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) b.$cachedSerializer$delegate.getValue();
    }
}
