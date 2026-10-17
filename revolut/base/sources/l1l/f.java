package l1l;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements yqi.f {
    public static yqi.d a(e validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Set set = validationData.f191580b;
        xi0.b bVar = validationData.f191579a;
        Set set2 = set;
        if (set2 != null && !set2.isEmpty() && !set.contains(bVar.f306286a)) {
            return new yqi.d(validationData, new i1l.a(bVar.f306286a));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((e) obj2);
    }
}
