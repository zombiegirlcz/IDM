package gj1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f144232a;

    default boolean a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryCode, "<this>");
        wi0.b.Companion.getClass();
        return countryCode.equals(wi0.b.A) || countryCode.equals(wi0.b.Y1);
    }
}
