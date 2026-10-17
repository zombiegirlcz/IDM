package afj;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d4 implements e4m.e {
    public static Clock a() {
        c4.Companion.getClass();
        Clock clockSystemUTC = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(clockSystemUTC, "systemUTC(...)");
        vc.s.k(clockSystemUTC);
        return clockSystemUTC;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
