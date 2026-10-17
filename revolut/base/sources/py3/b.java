package py3;

import com.google.common.collect.ImmutableSet;
import efm.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import y7i.h;
import ypg.l;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f240653a;

    public b(ImmutableSet eligibilitySet, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(eligibilitySet, "eligibilitySet");
                this.f240653a = eligibilitySet;
                break;
            default:
                Intrinsics.checkNotNullParameter(eligibilitySet, "checkers");
                this.f240653a = eligibilitySet;
                break;
        }
    }

    public boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Set set = this.f240653a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (((a) it8.next()).a(throwable)) {
                return true;
            }
        }
        return false;
    }

    public d0 b() {
        Set<rta.a> set = this.f240653a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (rta.a aVar : set) {
            p0 p0Var = p0.f264001a;
            arrayList.add(te0.w.o0(elm.f.f127540b, new h(aVar, null, 20)));
        }
        return arrayList.isEmpty() ? d0.m(Boolean.FALSE) : d0.E(arrayList, new l(new ysk.a(4), 29));
    }
}
