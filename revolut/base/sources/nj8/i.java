package nj8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f216398a = new i();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list = (List) obj2;
        Intrinsics.checkNotNullParameter(list, "list");
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj3 : list2) {
            linkedHashMap.put(((JuniorBankingProfile) obj3).f77103j, obj3);
        }
        return linkedHashMap;
    }
}
