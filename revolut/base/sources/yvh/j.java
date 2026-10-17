package yvh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f317184a;

    public j(Map map) {
        this.f317184a = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f317184a, ((j) obj2).f317184a);
    }

    public final int hashCode() {
        Map map = this.f317184a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }
}
