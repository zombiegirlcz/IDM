package dp1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f116592a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f116592a, ((a) obj2).f116592a);
    }

    public final int hashCode() {
        Map map = this.f116592a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public a(LinkedHashMap linkedHashMap) {
        this.f116592a = linkedHashMap;
    }
}
