package zf8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f321898a = new j();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List<psg.a> list = (List) pair.f186385a;
        Map map = (Map) pair.f186386b;
        ArrayList arrayList = new ArrayList();
        for (psg.a aVar : list) {
            JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) map.get(aVar.f239485b);
            vf8.b bVar = juniorBankingProfile != null ? new vf8.b(aVar, juniorBankingProfile) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return d0.P0(arrayList, cim.b.a(h.f321896a, i.f321897a));
    }
}
