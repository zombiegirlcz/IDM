package qh0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {
    private a0() {
    }

    @NotNull
    public final <R> KSerializer serializer(@NotNull KSerializer typeSerial0) {
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        return new z(typeSerial0);
    }
}
