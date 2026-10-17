package fq9;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f137216a;

    public e(Set memberIds) {
        Intrinsics.checkNotNullParameter(memberIds, "memberIds");
        this.f137216a = memberIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137216a, ((e) obj2).f137216a);
    }

    public final int hashCode() {
        return this.f137216a.hashCode();
    }
}
