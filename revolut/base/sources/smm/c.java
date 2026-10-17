package smm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c implements omm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient d f264460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient HashMap f264461b;

    public final boolean a(String str, String str2) {
        HashMap map = this.f264461b;
        Collection collection = (Collection) map.get(str);
        if (collection != null) {
            return collection.add(str2);
        }
        ArrayList arrayListC = ((f) this).c();
        if (!arrayListC.add(str2)) {
            return false;
        }
        map.put(str, arrayListC);
        return true;
    }

    public final List b(Object obj2) {
        List list = (List) this.f264461b.remove(obj2);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof omm.b)) {
            return false;
        }
        d dVar = this.f264460a;
        if (dVar == null) {
            dVar = new d(this, this.f264461b);
            this.f264460a = dVar;
        }
        c cVar = (c) ((omm.b) obj2);
        d dVar2 = cVar.f264460a;
        if (dVar2 == null) {
            dVar2 = new d(cVar, cVar.f264461b);
            cVar.f264460a = dVar2;
        }
        return dVar.equals(dVar2);
    }

    public final int hashCode() {
        return this.f264461b.hashCode();
    }

    public final String toString() {
        return this.f264461b.toString();
    }
}
