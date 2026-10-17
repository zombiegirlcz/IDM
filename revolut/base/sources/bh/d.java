package bh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15223a;

    public d(Set set) {
        this.f15223a = new HashMap();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            c cVar = (c) it8.next();
            HashMap map = this.f15223a;
            cVar.getClass();
            map.put(a.class, cVar.f15222a);
        }
    }

    public d(int i) {
        switch (i) {
            case 2:
                this.f15223a = new HashMap();
                break;
            default:
                this.f15223a = new HashMap();
                break;
        }
    }
}
