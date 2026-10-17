package dhk;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f114831a;

    public h(LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f114831a = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f114831a.equals(((h) obj2).f114831a);
    }

    public final int hashCode() {
        return this.f114831a.hashCode();
    }
}
