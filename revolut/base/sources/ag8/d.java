package ag8;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f4804a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List walletsToDesigns = (List) obj2;
        Intrinsics.checkNotNullParameter(walletsToDesigns, "walletsToDesigns");
        List<Pair> list = walletsToDesigns;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Pair pair : list) {
            linkedHashMap.put(pair.f186385a, pair.f186386b);
        }
        return linkedHashMap;
    }
}
