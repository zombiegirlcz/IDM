package qgd;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245781a;

    public e(String newWatchlistName) {
        Intrinsics.checkNotNullParameter(newWatchlistName, "newWatchlistName");
        this.f245781a = newWatchlistName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f245781a, ((e) obj2).f245781a);
    }

    public final int hashCode() {
        return this.f245781a.hashCode();
    }
}
