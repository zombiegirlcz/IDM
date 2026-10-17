package qkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f247028a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f247028a, ((f) obj2).f247028a);
    }

    public final int hashCode() {
        Long l2 = this.f247028a;
        if (l2 == null) {
            return 0;
        }
        return l2.hashCode();
    }

    public f(Long l2) {
        this.f247028a = l2;
    }

    public /* synthetic */ f(int i) {
        this((Long) 0L);
    }
}
