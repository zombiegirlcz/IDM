package hzl;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Clock f157253a;

    static {
        Clock clockSystemUTC = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(clockSystemUTC, "systemUTC(...)");
        f157253a = clockSystemUTC;
    }

    private c() {
    }
}
