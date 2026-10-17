package r8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f252295a;

    public p(q qVar) {
        this.f252295a = qVar;
    }

    @Override // r8.a
    public final void a(boolean z) {
        ArrayList arrayList;
        y8.l.a();
        synchronized (this.f252295a) {
            arrayList = new ArrayList((HashSet) this.f252295a.d);
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((a) it8.next()).a(z);
        }
    }
}
