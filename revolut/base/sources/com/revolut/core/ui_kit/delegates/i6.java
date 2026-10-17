package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i6 extends FlightSegmentDelegate.Model.a.AbstractC0404a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Duration f54279b;

    public i6(TextClause city, Duration duration) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f54278a = city;
        this.f54279b = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj2;
        return this.f54278a.equals(i6Var.f54278a) && this.f54279b.equals(i6Var.f54279b);
    }

    public final int hashCode() {
        return this.f54279b.hashCode() + (this.f54278a.hashCode() * 31);
    }
}
