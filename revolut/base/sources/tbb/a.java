package tbb;

import cim.b;
import i49.c;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        c o110 = (c) obj2;
        c o210 = (c) obj3;
        Intrinsics.checkNotNullParameter(o110, "o1");
        Intrinsics.checkNotNullParameter(o210, "o2");
        return b.b(Integer.valueOf(yh5.b.r(o110)), Integer.valueOf(yh5.b.r(o210)));
    }
}
