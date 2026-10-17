package jc;

import a0.d;
import android.util.SparseArray;
import java.util.HashMap;
import wb.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f172682a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f172683b;

    static {
        HashMap map = new HashMap();
        f172683b = map;
        map.put(e.DEFAULT, 0);
        map.put(e.VERY_LOW, 1);
        map.put(e.HIGHEST, 2);
        for (e eVar : map.keySet()) {
            f172682a.append(((Integer) f172683b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f172683b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i) {
        e eVar = (e) f172682a.get(i);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(d.n("Unknown Priority for value ", i));
    }
}
