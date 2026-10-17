package ihi;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes10.dex */
public class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f161422b;

    private c() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        c cVar = (c) obj2;
        int i = this.f161422b;
        int i2 = cVar.f161422b;
        return i != i2 ? i - i2 : this.f161421a - cVar.f161421a;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Order{order=");
        sb6.append(this.f161422b);
        sb6.append(", index=");
        return j6.a.t(sb6, this.f161421a, CoreConstants.CURLY_RIGHT);
    }
}
