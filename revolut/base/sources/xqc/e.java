package xqc;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308150a;

    public e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f308150a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f308150a, ((e) obj2).f308150a);
    }

    public final int hashCode() {
        return this.f308150a.hashCode();
    }
}
