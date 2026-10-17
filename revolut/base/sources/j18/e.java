package j18;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private e() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f.$cachedSerializer$delegate.getValue();
    }
}
