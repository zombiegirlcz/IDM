package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f5 extends DatePickerDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f54143a;

    public f5(LocalDate endWith) {
        Intrinsics.checkNotNullParameter(endWith, "endWith");
        this.f54143a = endWith;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f5) && Intrinsics.f(this.f54143a, ((f5) obj2).f54143a);
    }

    public final int hashCode() {
        return this.f54143a.hashCode();
    }
}
