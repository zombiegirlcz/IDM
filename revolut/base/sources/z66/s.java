package z66;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f319704a = new s();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List ratesList = (List) obj2;
        Intrinsics.checkNotNullParameter(ratesList, "ratesList");
        List list = ratesList;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj3 : list) {
            linkedHashMap.put(((qta.c) obj3).f249046a, obj3);
        }
        return linkedHashMap;
    }
}
