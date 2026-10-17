package uz4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import tz4.d;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, d.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = p0.iterator();
        while (it8.hasNext()) {
            lz4.a aVarX = d.x((tz4.c) it8.next());
            if (aVarX != null) {
                arrayList.add(aVarX);
            }
        }
        return arrayList;
    }
}
