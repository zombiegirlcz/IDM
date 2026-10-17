package o8b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f {
    public static ArrayList a(List list, wi0.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f(((wi0.b) obj2).f297794a, bVar.f297794a)) {
                arrayList.add(obj2);
            }
        }
        return ue0.e.J(bVar, arrayList);
    }
}
