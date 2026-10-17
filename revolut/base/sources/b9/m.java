package b9;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f13389a;

    @Override // b9.i
    public final boolean a(s1 s1Var) {
        Iterator it8 = this.f13389a.iterator();
        while (it8.hasNext()) {
            if (u.n((r) it8.next(), s1Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return t61.a.q(")", this.f13389a, new StringBuilder("not("));
    }
}
