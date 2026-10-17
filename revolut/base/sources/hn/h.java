package hn;

import com.google.common.collect.ImmutableSet;
import efm.r;
import ihm.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f154011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f154012b;

    public h(ImmutableSet observables) {
        Intrinsics.checkNotNullParameter(observables, "observables");
        this.f154011a = observables;
        this.f154012b = p.a.D("toSerialized(...)");
    }

    public final pfm.h a(npi.d configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        pfm.h hVar = new pfm.h(new hc7.a(this, configuration, 2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final r b() {
        Set set = this.f154011a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((h) it8.next()).b());
        }
        r rVarMerge = r.merge(d0.F0(this.f154012b, arrayList));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }
}
