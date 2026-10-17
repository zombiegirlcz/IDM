package x57;

import java.util.Comparator;
import pcd.l0;
import pcd.s;
import q2j.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f302912a = new v(new a(), 21);

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            l0 l0Var = ((s) obj2).e;
            int[] iArr = x57.a.f302911a;
            int i = iArr[l0Var.ordinal()];
            Integer num = i != 1 ? i != 2 ? 2 : 1 : num;
            int i2 = iArr[((s) obj3).e.ordinal()];
            return cim.b.b(num, i2 != 1 ? i2 != 2 ? 2 : 1 : 0);
        }
    }

    private b() {
    }
}
