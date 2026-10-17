package com.revolut.feature.shared.help_centre.api.faq;

import aii.e;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFaqDestination.StartPoint.FaqExplicit f86135a;

    public a(SharedFaqDestination.StartPoint.FaqExplicit startPoint) {
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        this.f86135a = startPoint;
    }

    public final SharedFaqDestination.StartPoint.FaqExplicit b() {
        return this.f86135a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f86135a, ((a) obj2).f86135a);
    }

    public final int hashCode() {
        return this.f86135a.hashCode();
    }
}
