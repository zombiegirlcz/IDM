package jtk;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f178530c;
    public final Instant d;

    public e(String instrumentName, String instrumentTicker, Instant tradingStart, Instant tradingEnd) {
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(tradingStart, "tradingStart");
        Intrinsics.checkNotNullParameter(tradingEnd, "tradingEnd");
        this.f178528a = instrumentName;
        this.f178529b = instrumentTicker;
        this.f178530c = tradingStart;
        this.d = tradingEnd;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178528a, eVar.f178528a) && Intrinsics.f(this.f178529b, eVar.f178529b) && Intrinsics.f(this.f178530c, eVar.f178530c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.c(p.a.c(this.f178528a.hashCode() * 31, 31, this.f178529b), 31, this.f178530c);
    }
}
