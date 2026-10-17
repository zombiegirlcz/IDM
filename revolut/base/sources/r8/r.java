package r8;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f252299a = Collections.newSetFromMap(new WeakHashMap());

    @Override // r8.j
    public final void onDestroy() {
        Iterator it8 = y8.l.e(this.f252299a).iterator();
        while (it8.hasNext()) {
            ((v8.l) it8.next()).onDestroy();
        }
    }

    @Override // r8.j
    public final void onStart() {
        Iterator it8 = y8.l.e(this.f252299a).iterator();
        while (it8.hasNext()) {
            ((v8.l) it8.next()).onStart();
        }
    }

    @Override // r8.j
    public final void onStop() {
        Iterator it8 = y8.l.e(this.f252299a).iterator();
        while (it8.hasNext()) {
            ((v8.l) it8.next()).onStop();
        }
    }
}
