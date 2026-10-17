package cxk;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) b.$cachedSerializer$delegate.getValue();
    }
}
