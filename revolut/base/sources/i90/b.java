package i90;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    private static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f159548a = new Regex("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public final UUID a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }

    public final boolean b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!f159548a.f(value)) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(value.toLowerCase(Locale.ROOT), "toLowerCase(...)");
        return !Intrinsics.f(r2, "00000000-0000-0000-0000-000000000000");
    }
}
