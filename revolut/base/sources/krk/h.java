package krk;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private h() {
    }

    @NotNull
    public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        return new g(typeSerial0);
    }
}
