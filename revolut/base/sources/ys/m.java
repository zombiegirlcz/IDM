package ys;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f316356a;

    public m(x calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        this.f316356a = calendar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f316356a == ((m) obj2).f316356a;
    }

    public final int hashCode() {
        return this.f316356a.hashCode();
    }
}
