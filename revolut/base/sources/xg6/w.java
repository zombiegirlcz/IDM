package xg6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.model.Mandate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f305609a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List<Mandate> list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        ArrayList arrayList = new ArrayList();
        for (Mandate mandate : list) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ExternalInstitution) next).f66107a, mandate.f72225b)) {
                    break;
                }
            }
            ExternalInstitution externalInstitution = (ExternalInstitution) next;
            qe6.b bVar = externalInstitution != null ? new qe6.b(mandate, externalInstitution) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
