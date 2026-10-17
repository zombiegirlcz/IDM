package b9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f13454a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13455b = 0;

    public final void a() {
        this.f13455b += 1000;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        Iterator it8 = this.f13454a.iterator();
        while (it8.hasNext()) {
            sb6.append((s) it8.next());
            sb6.append(zsc.p.SPACE_CHAR);
        }
        sb6.append('[');
        return j6.a.t(sb6, this.f13455b, ']');
    }
}
