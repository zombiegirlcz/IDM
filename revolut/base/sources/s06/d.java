package s06;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import rwg.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements q06.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f258849a;

    public d(c51.h deeplinkPatternSource) {
        Intrinsics.checkNotNullParameter(deeplinkPatternSource, "deeplinkPatternSource");
        this.f258849a = yhm.j.b(new e0(this));
    }

    public final String a(String deeplink) {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Iterator it8 = ((List) this.f258849a.getValue()).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Regex) ((Pair) next).f186385a).f(deeplink)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair != null) {
            return (String) pair.f186386b;
        }
        return null;
    }
}
