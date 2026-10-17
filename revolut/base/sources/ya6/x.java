package ya6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.q implements Function1 {
    public static final x f = new x();

    public x() {
        super(1, ta6.a.class, "toCharities", "toCharities(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List list = p0;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(ta6.a.M((va6.g) it8.next()));
        }
        return arrayList;
    }
}
