package kx7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s0 extends kotlin.jvm.internal.q implements Function1 {
    public static final s0 f = new s0();

    public s0() {
        super(1, hx7.c.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = hx7.c.f156394a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List list = p0;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(hx7.c.b((ix7.e) it8.next()));
        }
        return arrayList;
    }
}
