package ulm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class u0 implements Iterable, pim.a {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f281141b = new u0(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f281142a;

    public u0(String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.f281142a = namesAndValues;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ue8.c.i(name, this.f281142a);
    }

    public final Map b() {
        kotlin.text.a0.A(kotlin.jvm.internal.t0.f186434a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strL = ue8.c.l(this, i);
            Locale locale = Locale.US;
            String strR = p.a.r(locale, "US", strL, locale, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(strR);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strR, arrayList);
            }
            arrayList.add(ue8.c.q(this, i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj2) {
        return ue8.c.f(obj2, this);
    }

    public final int hashCode() {
        return ue8.c.h(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ue8.c.k(this);
    }

    public final int size() {
        return this.f281142a.length / 2;
    }

    public final String toString() {
        return ue8.c.p(this);
    }
}
