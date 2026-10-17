package ode;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final Instant a(long j2) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }
}
