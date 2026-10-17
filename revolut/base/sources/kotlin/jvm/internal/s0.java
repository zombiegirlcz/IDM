package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186433a;

    public s0() {
        this.f186433a = new ArrayList();
    }

    public void a(Object obj2) {
        this.f186433a.add(obj2);
    }

    public void b(Object obj2) {
        if (obj2 == null) {
            return;
        }
        boolean z = obj2 instanceof Object[];
        ArrayList arrayList = this.f186433a;
        if (z) {
            Object[] objArr = (Object[]) obj2;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj2 instanceof Collection) {
            arrayList.addAll((Collection) obj2);
            return;
        }
        if (obj2 instanceof Iterable) {
            Iterator it8 = ((Iterable) obj2).iterator();
            while (it8.hasNext()) {
                arrayList.add(it8.next());
            }
        } else {
            if (!(obj2 instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj2.getClass());
            }
            Iterator it9 = (Iterator) obj2;
            while (it9.hasNext()) {
                arrayList.add(it9.next());
            }
        }
    }

    public synchronized c8.n c(Class cls) {
        int size = this.f186433a.size();
        for (int i = 0; i < size; i++) {
            t8.d dVar = (t8.d) this.f186433a.get(i);
            if (dVar.f268756a.isAssignableFrom(cls)) {
                return dVar.f268757b;
            }
        }
        return null;
    }

    public s0(int i) {
        this.f186433a = new ArrayList(i);
    }
}
