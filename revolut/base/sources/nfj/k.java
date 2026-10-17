package nfj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public interface k {
    static vkm.d a(k kVar, w4l.k loadingStrategy, List list, List list2, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            list = zhm.f0.f322471a;
        }
        List mobilePlanIds = list;
        if ((i & 4) != 0) {
            list2 = zhm.f0.f322471a;
        }
        List deviceAssociatedEsimProfileIds = list2;
        String str4 = (i & 8) != 0 ? null : str;
        String str5 = (i & 16) != 0 ? null : str2;
        p pVar = (p) kVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(mobilePlanIds, "mobilePlanIds");
        Intrinsics.checkNotNullParameter(deviceAssociatedEsimProfileIds, "deviceAssociatedEsimProfileIds");
        return pVar.f215015h.b(new n(str4, str5, str3, mobilePlanIds, deviceAssociatedEsimProfileIds), loadingStrategy);
    }
}
