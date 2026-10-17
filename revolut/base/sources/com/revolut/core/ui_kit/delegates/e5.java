package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e5 extends DatePickerDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f54087a;

    public e5(Set daysOfWeek) {
        Intrinsics.checkNotNullParameter(daysOfWeek, "daysOfWeek");
        this.f54087a = daysOfWeek;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e5) && Intrinsics.f(this.f54087a, ((e5) obj2).f54087a);
    }

    public final int hashCode() {
        return this.f54087a.hashCode();
    }
}
