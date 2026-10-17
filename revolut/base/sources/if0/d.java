package if0;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f160835a;

    public d(Set clearables) {
        Intrinsics.checkNotNullParameter(clearables, "clearables");
        this.f160835a = clearables;
    }

    @Override // od0.e
    public final void clear() {
        Iterator it8 = this.f160835a.iterator();
        while (it8.hasNext()) {
            ((e) it8.next()).clear();
        }
    }
}
