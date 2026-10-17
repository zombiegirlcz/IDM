package com.revolut.feature.transport.models.transit;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f92735a;

    public b(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f92735a = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f92735a, ((b) obj2).f92735a);
    }

    public final int hashCode() {
        return this.f92735a.hashCode();
    }
}
