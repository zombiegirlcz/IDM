package p50;

import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f232997a;

    public j() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f232997a == ((j) obj2).f232997a;
    }

    public final int hashCode() {
        return this.f232997a.hashCode() * 31;
    }

    public j(c0 feedType, int i) {
        feedType = (i & 1) != 0 ? c0.SUPPORT : feedType;
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f232997a = feedType;
    }
}
