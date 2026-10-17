package te8;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f270056a = new c();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list = (List) obj2;
        Intrinsics.checkNotNullParameter(list, "list");
        List<mf8.f> list2 = list;
        int iB = q0.b(zhm.w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (mf8.f fVar : list2) {
            linkedHashMap.put(fVar.f204964a, fVar.f204965b);
        }
        return linkedHashMap;
    }
}
