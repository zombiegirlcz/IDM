package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ClassNameKt {
    public static final boolean isLocalClassName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a0.H(str, ".", false);
    }
}
