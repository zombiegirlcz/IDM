package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j6 extends FlightSegmentDelegate.Model.a.AbstractC0404a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f54322a;

    public j6(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f54322a = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j6) && Intrinsics.f(this.f54322a, ((j6) obj2).f54322a);
    }

    public final int hashCode() {
        return this.f54322a.hashCode();
    }
}
