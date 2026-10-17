package oa2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223506a;

    public f(List aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f223506a = aliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f223506a, ((f) obj2).f223506a);
    }

    public final int hashCode() {
        return this.f223506a.hashCode();
    }
}
