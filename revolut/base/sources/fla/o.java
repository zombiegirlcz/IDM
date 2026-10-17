package fla;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o {
    private o() {
    }

    @NotNull
    public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        return new n(typeSerial0);
    }
}
