package wsc;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f299705a = new LinkedHashSet();

    @Override // od0.e
    public final void clear() {
        Iterator it8 = this.f299705a.iterator();
        while (it8.hasNext()) {
            ((od0.e) it8.next()).clear();
        }
    }
}
