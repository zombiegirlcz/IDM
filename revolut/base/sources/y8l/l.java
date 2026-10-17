package y8l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f311699a = v0.a.d("create(...)");

    public abstract void a(ArrayList arrayList);

    public abstract void b(ArrayList arrayList);

    public abstract List c();

    public final ihm.f d() {
        return this.f311699a;
    }

    public void e(ArrayList requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Set setQ0 = d0.Q0(c(), requests);
        ArrayList arrayList = new ArrayList(w.t(setQ0, 10));
        Iterator it8 = setQ0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((h) it8.next()).f311676a);
        }
        if (!arrayList.isEmpty()) {
            b(arrayList);
            this.f311699a.onNext(Unit.f186387a);
        }
        if (requests.isEmpty()) {
            return;
        }
        a(requests);
    }
}
