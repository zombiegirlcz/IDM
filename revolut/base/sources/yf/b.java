package yf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import zsc.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f313109b;

    public b(Set set, c cVar) {
        this.f313108a = b(set);
        this.f313109b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb6 = new StringBuilder();
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            a aVar = (a) it8.next();
            sb6.append(aVar.f313106a);
            sb6.append('/');
            sb6.append(aVar.f313107b);
            if (it8.hasNext()) {
                sb6.append(p.SPACE_CHAR);
            }
        }
        return sb6.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f313108a;
        c cVar = this.f313109b;
        synchronized (((HashSet) cVar.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(p.SPACE_CHAR);
        synchronized (((HashSet) cVar.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.b);
        }
        sb6.append(b(setUnmodifiableSet2));
        return sb6.toString();
    }
}
