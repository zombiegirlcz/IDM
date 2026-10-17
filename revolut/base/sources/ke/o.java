package ke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f182951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182952b;

    public o() {
        this.f182951a = new ArrayList();
        this.f182952b = 128;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f182951a));
    }

    public synchronized boolean b(List list) {
        this.f182951a.clear();
        if (list.size() <= this.f182952b) {
            return this.f182951a.addAll(list);
        }
        String str = "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f182952b;
        return this.f182951a.addAll(list.subList(0, this.f182952b));
    }

    public o(ArrayList routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f182951a = routes;
    }
}
