package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d5 extends DatePickerDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f54011a;

    public d5(Set dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.f54011a = dates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d5) && Intrinsics.f(this.f54011a, ((d5) obj2).f54011a);
    }

    public final int hashCode() {
        return this.f54011a.hashCode();
    }
}
