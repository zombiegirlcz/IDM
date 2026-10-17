package com.revolut.feature.transport.models.transit;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f92736a;

    public c(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f92736a = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f92736a, ((c) obj2).f92736a);
    }

    public final int hashCode() {
        return this.f92736a.hashCode();
    }
}
