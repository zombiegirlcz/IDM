package oa2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223505a;

    public e(List aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f223505a = aliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f223505a, ((e) obj2).f223505a);
    }

    public final int hashCode() {
        return this.f223505a.hashCode();
    }
}
