package hl7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 {
    private t4() {
    }

    @NotNull
    public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        return new s4(typeSerial0);
    }
}
