package oje;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e4m.e {
    public static Clock a() {
        c.Companion.getClass();
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
        s.k(clockSystemDefaultZone);
        return clockSystemDefaultZone;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
