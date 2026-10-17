package kd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f182756b = new a(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f182757a;

    public a(Map map) {
        this.f182757a = map;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return this.f182757a.equals(((a) obj2).f182757a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f182757a.hashCode();
    }

    public final String toString() {
        return this.f182757a.toString();
    }
}
