package g0m;

import java.time.ZoneId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ZoneId f139502a;

    static {
        ZoneId zoneIdOf = ZoneId.of("UTC");
        Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
        f139502a = zoneIdOf;
    }

    private a() {
    }

    public static ZoneId a() {
        return f139502a;
    }
}
