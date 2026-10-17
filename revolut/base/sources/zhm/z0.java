package zhm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class z0 extends y0 {
    public static h0 d() {
        return h0.f322473a;
    }

    public static HashSet e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        HashSet hashSet = new HashSet(q0.b(elements.length));
        kotlin.collections.d.p0(elements, hashSet);
        return hashSet;
    }

    public static LinkedHashSet f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(elements.length));
        kotlin.collections.d.p0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static Set g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(q0.b(elements.length));
        kotlin.collections.d.p0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static Set h(Object obj2) {
        return obj2 != null ? y0.b(obj2) : h0.f322473a;
    }

    public static Set i(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kotlin.collections.d.M(elements, linkedHashSet);
        return linkedHashSet;
    }
}
