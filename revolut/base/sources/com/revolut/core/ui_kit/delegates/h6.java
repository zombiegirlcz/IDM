package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h6 extends FlightSegmentDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f54233a;

    public h6(LocalDate arrivalDate) {
        Intrinsics.checkNotNullParameter(arrivalDate, "arrivalDate");
        this.f54233a = arrivalDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h6) && Intrinsics.f(this.f54233a, ((h6) obj2).f54233a);
    }

    public final int hashCode() {
        return this.f54233a.hashCode();
    }
}
